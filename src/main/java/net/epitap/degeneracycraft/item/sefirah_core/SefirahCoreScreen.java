package net.epitap.degeneracycraft.item.sefirah_core;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.item.sefirah_core.base.SkillNodeLayout;
import net.epitap.degeneracycraft.item.sefirah_core.skills.SkillTreeLayout;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;

public class SefirahCoreScreen extends AbstractContainerScreen<SefirahCoreMenu> {

    // =============================
    // 定数
    // =============================
    private static final int MAP_WIDTH = 2000;
    private static final int MAP_HEIGHT = 2000;
    private static final int NODE_SIZE = 16;
    private static final ResourceLocation BACKGROUND = new ResourceLocation("degeneracycraft", "textures/gui/sefirah_core.png");

    private static final ResourceLocation NODE_LOCKED =
            new ResourceLocation("degeneracycraft", "textures/gui/nodes/node_locked.png");
    private static final ResourceLocation NODE_UNLOCKED =
            new ResourceLocation("degeneracycraft", "textures/gui/nodes/node_unlocked.png");
    private static final ResourceLocation NODE_SELECTED =
            new ResourceLocation("degeneracycraft", "textures/gui/nodes/node_selected.png");


    // =============================
    // GUI専用ツリー（Menuには置かない）
    // =============================
    private final SkillTreeLayout skillTree;

    // =============================
    // カメラ
    // =============================
    private int viewX;
    private int viewY;

    // =============================
    // ドラッグ
    // =============================
    private boolean dragging;

    // =============================
    // ズーム
    // =============================
    private float zoom = 1.0f;
    private static final float MIN_ZOOM = 0.5f;
    private static final float MAX_ZOOM = 2.0f;

    // =============================
    // コンストラクタ
    // =============================
    public SefirahCoreScreen(
            SefirahCoreMenu menu,
            Inventory playerInventory,
            Component title
    ) {
        super(menu, playerInventory, title);
        this.skillTree = SkillTreeLayout.createDefault();
    }

    // =============================
    // 初期化（384×256 中央配置）
    // =============================
    @Override
    protected void init() {
        super.init();

        this.imageWidth = 384;
        this.imageHeight = 256;

        this.leftPos = (this.width - imageWidth) / 2;
        this.topPos = (this.height - imageHeight) / 2;

        clampView();
    }

    // =============================
    // タイトル・Inventory非表示
    // =============================
    @Override
    protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
        // 何も描画しない
    }

    // =============================
    // 描画
    // =============================
    @Override
    protected void renderBg(
            PoseStack poseStack,
            float partialTick,
            int mouseX,
            int mouseY
    ) {
        // 背景
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, BACKGROUND);

        blit(
                poseStack,
                leftPos,
                topPos,
                0,
                0,
                imageWidth,
                imageHeight,
                imageWidth,
                imageHeight
        );

        // ズーム変換
        poseStack.pushPose();
        poseStack.translate(leftPos, topPos, 0);
        poseStack.scale(zoom, zoom, 1.0f);
        poseStack.translate(-leftPos, -topPos, 0);

        for (SkillNodeLayout node : skillTree.getNodes()) {

            int drawX = leftPos + (int) ((node.getX() - viewX) * zoom);
            int drawY = topPos + (int) ((node.getY() - viewY) * zoom);

            if (drawX < leftPos - NODE_SIZE
                    || drawY < topPos - NODE_SIZE
                    || drawX > leftPos + imageWidth
                    || drawY > topPos + imageHeight) {
                continue;
            }

            ResourceLocation tex;

            if (node.isSelected()) {
                tex = NODE_SELECTED;
            } else if (node.isUnlocked()) {
                tex = NODE_UNLOCKED;
            } else {
                tex = NODE_LOCKED;
            }

            RenderSystem.setShaderTexture(0, tex);

            blit(
                    poseStack,
                    drawX,
                    drawY,
                    0,
                    0,
                    (int)(NODE_SIZE * zoom),
                    (int)(NODE_SIZE * zoom),
                    NODE_SIZE,
                    NODE_SIZE
            );
        }

        poseStack.popPose();
    }

    // =============================
    // カメラ制限
    // =============================
    private void clampView() {
        viewX = Mth.clamp(viewX, 0, MAP_WIDTH - (int) (imageWidth / zoom));
        viewY = Mth.clamp(viewY, 0, MAP_HEIGHT - (int) (imageHeight / zoom));
    }

    // =============================
    // スクロール / ズーム
    // =============================
    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double delta) {

        if (hasControlDown()) {
            zoom += delta * 0.1f;
            zoom = Mth.clamp(zoom, MIN_ZOOM, MAX_ZOOM);
            clampView();
            return true;
        }

        viewY -= (int) (delta * 20);
        clampView();
        return true;
    }

    // =============================
    // クリック
    // =============================
    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {

        int guiX = (int) ((mouseX - leftPos) / zoom);
        int guiY = (int) ((mouseY - topPos) / zoom);

        // 左クリック：ノード判定
        if (button == 0) {

            int worldX = guiX + viewX;
            int worldY = guiY + viewY;

            for (SkillNodeLayout node : skillTree.getNodes()) {
                if (worldX >= node.getX() && worldX <= node.getX() + NODE_SIZE
                        && worldY >= node.getY() && worldY <= node.getY() + NODE_SIZE) {

                    // 他の選択を解除
                    for (SkillNodeLayout other : skillTree.getNodes()) {
                        other.setSelected(false);
                    }

                    node.setSelected(true);
                    System.out.println("[DC] Node selected: " + node.getId());
                    return true;
                }
            }
        }

        // 右クリック：ドラッグ開始
        if (button == 1) {
            dragging = true;
            return true;
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    // =============================
    // ドラッグ
    // =============================
    @Override
    public boolean mouseDragged(
            double mouseX,
            double mouseY,
            int button,
            double dragX,
            double dragY
    ) {
        if (dragging && button == 1) {
            viewX -= (int) (dragX / zoom);
            viewY -= (int) (dragY / zoom);
            clampView();
            return true;
        }

        return super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
    }

    // =============================
    // ドラッグ終了
    // =============================
    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        dragging = false;
        return super.mouseReleased(mouseX, mouseY, button);
    }
}

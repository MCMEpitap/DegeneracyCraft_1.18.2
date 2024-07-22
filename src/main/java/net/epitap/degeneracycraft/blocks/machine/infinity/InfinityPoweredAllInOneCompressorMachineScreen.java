package net.epitap.degeneracycraft.blocks.machine.infinity;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class InfinityPoweredAllInOneCompressorMachineScreen extends AbstractContainerScreen<InfinityPoweredAllInOneCompressorMachineMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/infinity_powered_all_in_one_compressor_machine_gui.png");
//    infinity_powered_all_in_one_compressor_machine_gui
//    private InfinityPoweredAllInOneCompressorMachineMenu container;
    //    private Inventory playerInventory;

    public static final ResourceLocation CHEST_SLOTS_TEXTURE = new ResourceLocation("compact_storage", "textures/gui/chest_slots.png");

    public InfinityPoweredAllInOneCompressorMachineScreen(InfinityPoweredAllInOneCompressorMachineMenu container, Inventory inventory, Component title) {
        super(container, inventory, title);

//        this.container = container;
//        this.playerInventory = inventory;
        this.imageWidth = 280;
        this.imageHeight = 170;
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        this.renderBackground(pPoseStack);

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - 416) / 2;
        int y = (height - 256) / 2;
        blit(pPoseStack, x, y, 0, 0, 314, 256, 400, 256);
//        if(menu.isCrafting()) {
//            int l = this.menu.getScaledProgress();
//            blit(pPoseStack, x + 169, y + 61, 212, 61, l+1,53);
//        }
//
//
//        blit(pPoseStack, this.leftPos + 7, this.topPos + 17, 0, 0, 18 * 18, 18 * 9, 432, 216);

    }
    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        drawString(matrixStack, Minecraft.getInstance().font, "", 64, 64, 0xffffff);
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }

//    public static final ResourceLocation CHEST_SLOTS_TEXTURE = new ResourceLocation("compact_storage", "textures/gui/chest_slots.png");
//    public static final ResourceLocation CHEST_BACKGROUND_TEXTURE = new ResourceLocation("compact_storage", "textures/gui/chest.png");
//
//    private InfinityPoweredAllInOneCompressorMachineMenu container;
//    private Inventory playerInventory;
//
//    public InfinityPoweredAllInOneCompressorMachineScreen(InfinityPoweredAllInOneCompressorMachineMenu container, Inventory inventory, Component title) {
//        super(container, inventory, title);
//        this.container = container;
//        this.playerInventory = inventory;
//
//        this.imageWidth = 14 + 18 * 18;
//        this.imageHeight = 114 + 9 * 18 + 7;
//    }
//    @Override
//    protected void renderLabels(PoseStack matrices, int mouseX, int mouseY) {
//        this.font.draw(matrices, this.title, 8.0F, 6.0F, 4210752);
//        this.font.draw(matrices, this.playerInventory.getDisplayName(), 8.0F, (float)(this.imageHeight - 96 - 3), 4210752);
//
//        //super.drawForeground(matrices, mouseX, mouseY);
//
//        this.renderTooltip(matrices,mouseX - leftPos, mouseY - topPos);
//    }
//
//    @Override
//    protected void renderBg(PoseStack matrixStack, float delta, int mouseX, int mouseY) {
//        this.renderBackground(matrixStack);
//        //RenderSystem.disableLighting();
//
//        RenderSystem.setShader(GameRenderer::getPositionTexShader);
//        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
//        RenderSystem.setShaderTexture(0, CHEST_BACKGROUND_TEXTURE);
//
//        //drawTexture(matrixStack, x, y, width, height, u, v, uWidth, vHeight, texWidth, texHeight);
//        //corners
//
//        blit(matrixStack, leftPos, topPos, 0, 0, 7, 7, 15, 15);
//        blit(matrixStack, leftPos + imageWidth - 7, topPos, 8, 0, 7, 7, 15, 15);
//
//        blit(matrixStack, leftPos, topPos + imageHeight - 7, 0, 8, 8, 7, 15, 15);
//        blit(matrixStack, leftPos + imageWidth - 7, topPos + imageHeight - 7, 8, 8, 7, 7, 15, 15);
//
//        //middle bit
//        blit(matrixStack, leftPos + 7, topPos + 7, imageWidth - 14, imageHeight - 14, 7, 7, 1, 1, 15, 15);
//
//        //left side
//        blit(matrixStack, leftPos, topPos + 7, 7, imageHeight - 14, 0, 7, 7, 1, 15, 15);
//
//        //right side
//        blit(matrixStack, leftPos + imageWidth - 7, topPos + 7, 7, imageHeight - 14, 8, 7, 7, 1, 15, 15);
//
//        //top
//        blit(matrixStack, leftPos + 7, topPos, imageWidth - 14, 7, 7, 0, 1, 7, 15, 15);
//
//        //bottom
//        blit(matrixStack, leftPos + 7, topPos + imageHeight - 7, imageWidth - 14, 7, 7, 8, 1, 7, 15, 15);
//
//        RenderSystem.setShaderTexture(0, CHEST_SLOTS_TEXTURE);
//        //chest slots
//        blit(matrixStack, this.leftPos + 7, this.topPos + 17, 0, 0, 18 * 18, 18 * 9, 432, 216);
//        //inv slots
//        blit(matrixStack, this.leftPos + (imageWidth / 2) - 9 * 9, this.topPos + (9 * 18) + 18 + 17, 0, 0, 18 * 9, 18 * 3, 432, 216);
//        //hotbar slots
//        blit(matrixStack, this.leftPos + (imageWidth / 2) - 9 * 9, this.topPos + (9 * 18) + 18 + 60 + 17, 0, 0, 18 * 9, 18 * 1, 432, 216);
//    }

}

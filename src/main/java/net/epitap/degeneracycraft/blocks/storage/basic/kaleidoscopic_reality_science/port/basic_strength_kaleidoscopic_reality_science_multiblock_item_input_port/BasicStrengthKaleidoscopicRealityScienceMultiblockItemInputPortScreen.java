package net.epitap.degeneracycraft.blocks.storage.basic.kaleidoscopic_reality_science.port.basic_strength_kaleidoscopic_reality_science_multiblock_item_input_port;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class BasicStrengthKaleidoscopicRealityScienceMultiblockItemInputPortScreen extends AbstractContainerScreen<BasicStrengthKaleidoscopicRealityScienceMultiblockItemInputPortMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/multiblock/basic/kaleidoscopic_reality_science/basic_strength_kaleidoscopic_reality_science_multiblock_item_input_port/basic_strength_kaleidoscopic_reality_science_multiblock_item_input_port_gui.png");


    public BasicStrengthKaleidoscopicRealityScienceMultiblockItemInputPortScreen(BasicStrengthKaleidoscopicRealityScienceMultiblockItemInputPortMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }


    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}

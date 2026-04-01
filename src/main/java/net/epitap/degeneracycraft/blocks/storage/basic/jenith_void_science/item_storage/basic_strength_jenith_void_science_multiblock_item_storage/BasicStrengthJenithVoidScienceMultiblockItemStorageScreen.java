package net.epitap.degeneracycraft.blocks.storage.basic.jenith_void_science.item_storage.basic_strength_jenith_void_science_multiblock_item_storage;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class BasicStrengthJenithVoidScienceMultiblockItemStorageScreen extends AbstractContainerScreen<BasicStrengthJenithVoidScienceMultiblockItemStorageMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/multiblock/basic/jenith_void_science/basic_strength_jenith_void_science_multiblock_item_storage/basic_strength_kaleidoscopic_reality_science_multiblock_item_storage_gui.png");


    public BasicStrengthJenithVoidScienceMultiblockItemStorageScreen(BasicStrengthJenithVoidScienceMultiblockItemStorageMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
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
    public void renderLabels(PoseStack pPoseStack, int pMouseX, int pMouseY) {

    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}

package net.epitap.degeneracycraft.blocks.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class UniversalAssemblerPhase1Screen extends AbstractContainerScreen<BasicTechnologyUniversalAssemblerMenu> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/kilobyteworkbench_gui.png");


    public UniversalAssemblerPhase1Screen(BasicTechnologyUniversalAssemblerMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - 312) / 2;
        int y = (height - 256) / 2;
        this.blit(pPoseStack, x, y, 0, 0, 256, 256);
        if(menu.isCrafting()) {
            int l = this.menu.getScaledProgress();
            blit(pPoseStack, x + 169, y + 61, 212, 61, l+1,53);
        }
    }
    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        drawString(matrixStack, Minecraft.getInstance().font, "" , 64, 64, 0xffffff);
    }
    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}

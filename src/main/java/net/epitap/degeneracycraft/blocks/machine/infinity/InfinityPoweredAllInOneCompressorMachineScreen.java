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
            new ResourceLocation(Degeneracycraft.MOD_ID,"textures/gui/infinity_powered_all_in_one_compressor_machine_gui.png");
//    infinity_powered_all_in_one_compressor_machine_gui
    public InfinityPoweredAllInOneCompressorMachineScreen(InfinityPoweredAllInOneCompressorMachineMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }
    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - 416) / 2;
        int y = (height - 256) / 2;
        blit(pPoseStack, x, y, 0, 0, 314, 256, 400, 256);
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

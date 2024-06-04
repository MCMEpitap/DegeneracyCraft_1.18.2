package net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine;

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

public class RedstonePoweredMachinePartManufactureMachineScreen extends AbstractContainerScreen<RedstonePoweredMachinePartManufactureMachineMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/initial/redstone_powered_machine_part_manufacture_machine_gui.png");


    public RedstonePoweredMachinePartManufactureMachineScreen(RedstonePoweredMachinePartManufactureMachineMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
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
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".phase0"),
                35, 67, 0xFFFFFF);
        if (menu.isCrafting()) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Work!",
                    80, 30, 0x00FF00);
        } else {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Stop!",
                    80, 30, 0xFF0000);
        }
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, (int) menu.getProgressPercent() + " %",
                80, 11, 0xFFFFFF);
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}

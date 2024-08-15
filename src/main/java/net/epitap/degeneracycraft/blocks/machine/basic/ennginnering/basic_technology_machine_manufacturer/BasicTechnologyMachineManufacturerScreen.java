package net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.render.EnergyInfoArea;
import net.epitap.degeneracycraft.util.MouseUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import java.util.Optional;

public class BasicTechnologyMachineManufacturerScreen extends AbstractContainerScreen<BasicTechnologyMachineManufacturerMenu> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/basic/basic_technology_universal_assembler/basic_technology_universal_assembler_gui.png");
    private EnergyInfoArea energyInfoArea;


    public BasicTechnologyMachineManufacturerScreen(BasicTechnologyMachineManufacturerMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void init() {
        super.init();
        assignEnergyInfoArea();
    }

    private void assignEnergyInfoArea() {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        energyInfoArea = new EnergyInfoArea(x + 157, y + 10, menu.getEnergy());
    }

    @Override
    protected void renderLabels(PoseStack pPoseStack, int pMouseX, int pMouseY) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        renderEnergyAreaTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".phase1"),
                15, 67, 0xFF0000);
        if (menu.isCrafting()) {
            drawString(pPoseStack, Minecraft.getInstance().font, "Work!",
                    67, 30, 0x00FF00);
        } else {
            drawString(pPoseStack, Minecraft.getInstance().font, "Stop!",
                    67, 30, 0xFF0000);
        }
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, (int) menu.getProgressPercent() + " %",
                80, 11, 0xFFFFFF);


        if (BasicTechnologyMachineManufacturerBlockEntity.isHaltDevice(menu.blockEntity)) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".halt"),
                    133, 66, 0xFFFFFF);
        }
        if (menu.blockEntity.isPowered0) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_machine" + ".modifier_2"),
                    80, 11, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Lv.1",
                    80, 47, 0xFF0000);
        } else if (menu.blockEntity.isFormed) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_machine" + ".modifier_1.5"),
                    80, 11, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "ON",
                    80, 47, 0x00FF00);
        } else {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_machine" + ".modifier_1"),
                    80, 11, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "OFF",
                    80, 47, 0xFF0000);
        }
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);
        energyInfoArea.draw(pPoseStack);
    }

    private void renderEnergyAreaTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 155, 10, 9, 64)) {
            renderTooltip(pPoseStack, energyInfoArea.getTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
        }
    }

    private boolean isMouseAboveArea(int pMouseX, int pMouseY, int x, int y, int offsetX, int offsetY, int width, int height) {
        return MouseUtil.isMouseOver(pMouseX, pMouseY, x + offsetX, y + offsetY, width, height);
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}

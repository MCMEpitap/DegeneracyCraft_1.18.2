package net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor;

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

import java.util.List;
import java.util.Optional;

public class BasicTechnologyElectromagneticInductorScreen extends AbstractContainerScreen<BasicTechnologyElectromagneticInductorMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_gui.png");
    private EnergyInfoArea energyInfoArea;


    public BasicTechnologyElectromagneticInductorScreen(BasicTechnologyElectromagneticInductorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
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
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, menu.getProgressPercent() + " %",
                80, 11, 0xFFFFFF);


        if (BasicTechnologyElectromagneticInductorBlockEntity.isHaltDevice(menu.blockEntity)) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".halt"),
                    133, 66, 0xFFFFFF);
        }

        if (menu.blockEntity.isPowered0) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Lv.1",
                    80, 47, 0xFF0000);
        } else if (menu.blockEntity.isFormed) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Lv.0",
                    80, 47, 0xFFFFFF);
        } else {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "OFF",
                    80, 47, 0xFF0000);
        }

        renderProcessModifierTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderEnergyAreaTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderProcessModifierTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderWorkTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderFormedTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderHaltTooltips(pPoseStack, pMouseX, pMouseY, x, y);
    }

    private void renderProcessModifierTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 9, 28, 10))
            renderTooltip(pPoseStack, this.ProcessModifierTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> ProcessModifierTooltips() {
        if (menu.blockEntity.isPowered0) {
            return List.of(new TranslatableComponent("screen." + "degeneracycraft_machine" + ".process_modifier_3"),
                    new TranslatableComponent("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_2"));
        } else if (menu.blockEntity.isFormed) {
            return List.of(new TranslatableComponent("screen." + "degeneracycraft_machine" + ".process_modifier_2"),
                    new TranslatableComponent("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_1.5"));
        }
        return List.of(new TranslatableComponent("screen." + "degeneracycraft_machine" + ".process_modifier_1"),
                new TranslatableComponent("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_1"));
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

    private void renderWorkTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 28, 28, 10))
            renderTooltip(pPoseStack, this.WorkTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> WorkTooltips() {
        if (menu.isCrafting()) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".work"));
        }
        return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".stop"));
    }

    private void renderFormedTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 45, 28, 10))
            renderTooltip(pPoseStack, this.FormedTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> FormedTooltips() {
        if (menu.blockEntity.isPowered0) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".lv1"));
        }
        if (menu.blockEntity.isFormed) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".lv0"));
        }
        return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".off"));
    }

    private void renderHaltTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (BasicTechnologyElectromagneticInductorBlockEntity.isHaltDevice(menu.blockEntity)
                && isMouseAboveArea(pMouseX, pMouseY, x, y, 117, 64, 40, 10))
            renderTooltip(pPoseStack, this.HaltTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> HaltTooltips() {
        return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".halt"));
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

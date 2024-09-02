package net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_power_thermal_generator;

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

public class BasicPowerThermalGeneratorScreen extends AbstractContainerScreen<BasicPowerThermalGeneratorMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/basic/engineering/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_gui.png");

    private EnergyInfoArea energyInfoArea;

    public BasicPowerThermalGeneratorScreen(BasicPowerThermalGeneratorMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
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
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);
        energyInfoArea.draw(pPoseStack);
    }

    @Override
    protected void renderLabels(PoseStack pPoseStack, int pMouseX, int pMouseY) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".phase1"),
                35, 66, 0xff0000);
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_besic_power_composite_structure_type_thermal_generator" + ".burntime"),
                125, 15, 0xffffff);
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, (int) menu.getBurnTime() + " Sec",
                125, 25, 0xffffff);
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_generator" + ".output"),
                125, 35, 0xffffff);
        if (menu.getBurnTime() > 0) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Work!",
                    80, 30, 0x00FF00);
        } else {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Stop!",
                    80, 30, 0xFF0000);
        }

        if (menu.blockEntity.isPowered0) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_POWERED_0 + " FE/t"),
                    125, 45, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_machine" + ".modifier_3"),
                    80, 11, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Lv.1",
                    80, 47, 0xFF0000);
        } else if (menu.blockEntity.isFormed) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED + " FE/t"),
                    125, 45, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_machine" + ".modifier_2"),
                    80, 11, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "ON",
                    80, 47, 0x00FF00);
        } else {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT + " FE/t"),
                    125, 45, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_machine" + ".modifier_1"),
                    80, 11, 0xffffff);
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "OFF",
                    80, 47, 0xFF0000);
        }
        if (BasicPowerThermalGeneratorBlockEntity.isHaltDevice(menu.blockEntity)) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".halt"),
                    132, 66, 0xFFFFFF);
        }
        renderPowerOutputTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderEnergyAreaTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderPowerModifierTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderBurnTimeTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderWorkTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderFormedTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderHaltTooltips(pPoseStack, pMouseX, pMouseY, x, y);
    }

    private void renderPowerOutputTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 100, 43, 48, 10))
            renderTooltip(pPoseStack, this.PowerOutputTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> PowerOutputTooltips() {
        if (menu.blockEntity.isPowered0) {
            return List.of(Component.nullToEmpty(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_POWERED_0 + " FE/t"));
        } else if (menu.blockEntity.isFormed) {
            return List.of(Component.nullToEmpty(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED + " FE/t"));
        }
        return List.of(Component.nullToEmpty(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT + " FE/t"));
    }

    private void renderEnergyAreaTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 155, 10, 9, 64)) {
            renderTooltip(pPoseStack, energyInfoArea.getTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
        }
    }

    private void renderPowerModifierTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 9, 28, 10))
            renderTooltip(pPoseStack, this.PowerModifierTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> PowerModifierTooltips() {
        if (menu.blockEntity.isPowered0) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".power_modifier_3"));
        } else if (menu.blockEntity.isFormed) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".power_modifier_2"));
        }
        return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".power_modifier_1"));
    }

    private void renderWorkTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 28, 28, 10))
            renderTooltip(pPoseStack, this.WorkTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> WorkTooltips() {
        if (menu.getBurnTime() > 0) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".work"));
        }
        return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".stop"));
    }

    private void renderBurnTimeTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 100, 23, 48, 10))
            renderTooltip(pPoseStack, this.BurnTimeTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> BurnTimeTooltips() {
        return List.of(Component.nullToEmpty((int) menu.getBurnTime() + " Sec"));
    }

    private void renderFormedTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 45, 28, 10))
            renderTooltip(pPoseStack, this.FormedTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> FormedTooltips() {
        if (menu.blockEntity.isFormed) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".on"));
        }
        return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".off"));
    }

    private void renderHaltTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (BasicPowerThermalGeneratorBlockEntity.isHaltDevice(menu.blockEntity)
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

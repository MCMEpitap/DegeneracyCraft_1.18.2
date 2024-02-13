package net.epitap.degeneracycraft.blocks.screen.basic;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.menu.machine.basic.BasicPowerCompositeStructureTypeThermalGeneratorMenu;
import net.epitap.degeneracycraft.blocks.screen.render.EnergyInfoArea;
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

public class BasicPowerCompositeStructureTypeThermalGeneratorScreen extends AbstractContainerScreen<BasicPowerCompositeStructureTypeThermalGeneratorMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID,"textures/gui/basic_power_composite_structure_type_thermal_generator_gui.png");

    private EnergyInfoArea energyInfoArea;

    public BasicPowerCompositeStructureTypeThermalGeneratorScreen(BasicPowerCompositeStructureTypeThermalGeneratorMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
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

        renderPowerOutputTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderEnergyAreaTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderburnTime(pPoseStack,pMouseX,pMouseY);
    }

    private void renderPowerOutputTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 103, 45, 48, 10))
            renderTooltip(pPoseStack, this.PowerOutputTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> PowerOutputTooltips() {
        if (menu.blockEntity.isFormed) {
            return List.of(Component.nullToEmpty(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED + " FE/t"));
        }
        return List.of(Component.nullToEmpty(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT + " FE/t"));
    }

    private void renderEnergyAreaTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if(isMouseAboveArea(pMouseX, pMouseY, x, y, 155, 10, 9, 64)) {
            renderTooltip(pPoseStack, energyInfoArea.getTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
        }
    }


    private void renderburnTime(PoseStack pPoseStack, int pMouseX, int pMouseY) {
        drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".phase1"),
                15, 66, 0xff0000);

        drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_besic_power_composite_structure_type_thermal_generator" + ".burntime"),
                103, 15, 0xffffff);
        drawString(pPoseStack, Minecraft.getInstance().font, menu.getBurnTime() + " Sec",
                103, 25, 0xffffff);
        drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_generator" + ".output"),
                103, 35, 0xffffff);
        drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_generator" + ".modifier"),
                103, 55, 0xffffff);

        if(menu.blockEntity.isFormed){
            drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED + " FE/t"),
                    103, 45, 0xffffff);
            drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_generator" + ".power_modifier_2"),
                    103, 65, 0xffffff);
        } else {
            drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent(menu.blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT + " FE/t"),
                    103, 45, 0xffffff);
            drawString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft_generator" + ".power_modifier_1"),
                    103, 65, 0xffffff);
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

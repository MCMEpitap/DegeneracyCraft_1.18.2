package net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.render.EnergyInfoArea;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.DCMachineToggleC2SPacket;
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

import static net.epitap.degeneracycraft.blocks.base.render.ButtonComponent.*;

public class BasicPerformanceAstronomicalTelescopeScreen extends AbstractContainerScreen<BasicPerformanceAstronomicalTelescopeMenu> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_gui.png");
    private EnergyInfoArea energyInfoArea;

    private static final int HOLOGRAM_X = 71;
    private static final int HOLOGRAM_Y = 59;
    private static final int HALT_X = 98;
    private static final int HALT_Y = 62;

    private static final int BUTTON_SIZE = 16;

    public BasicPerformanceAstronomicalTelescopeScreen(BasicPerformanceAstronomicalTelescopeMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
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
                15, 67, 0xFFFFFF);

        if (menu.isWorking()) {
            drawString(pPoseStack, Minecraft.getInstance().font, "Work!",
                    67, 30, 0x00FF00);
        } else {
            drawString(pPoseStack, Minecraft.getInstance().font, "Stop!",
                    67, 30, 0xFF0000);
        }
        drawCenteredString(pPoseStack, Minecraft.getInstance().font, menu.getProgressPercent() + " %",
                80, 11, 0xFFFFFF);


        if (menu.isForceHalt()) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, new TranslatableComponent("screen." + "degeneracycraft" + ".halt"),
                    133, 66, 0xFFFFFF);
        }
        if (menu.getHologramLevel() == 1) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "Lv.1",
                    80, 47, 0xFF0000);
        } else if (menu.getHologramLevel() == 0) {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "ON",
                    80, 47, 0x00FF00);
        } else {
            drawCenteredString(pPoseStack, Minecraft.getInstance().font, "OFF",
                    80, 47, 0xFF0000);
        }

        renderPowerModifierTooltips(pPoseStack, pMouseX, pMouseY, x, y);
        renderMultiblockInfoTooltips(pPoseStack, pMouseX, pMouseY, x, y);
    }

    private void renderMultiblockInfoTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 28, 26, 10))
            renderTooltip(pPoseStack, this.MultiblockInfoTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> MultiblockInfoTooltips() {
        if (menu.getMultiblockLevel() == 1) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".lv1"),
                    new TranslatableComponent("screen." + "degeneracycraft_machine" + ".process_modifier_3"),
                    new TranslatableComponent("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_2"));
        } else if (menu.getMultiblockLevel() == 0) {
            return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".on"),
                    new TranslatableComponent("screen." + "degeneracycraft_machine" + ".process_modifier_2"),
                    new TranslatableComponent("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_1.5"));
        }
        return List.of(new TranslatableComponent("tooltip." + "degeneracycraft" + ".structure" + ".off"),
                new TranslatableComponent("screen." + "degeneracycraft_machine" + ".process_modifier_1"),
                new TranslatableComponent("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_1"));
    }

    private void renderPowerModifierTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
        if (isMouseAboveArea(pMouseX, pMouseY, x, y, 66, 45, 26, 10))
            renderTooltip(pPoseStack, this.PowerModifierTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
    }

    public List<Component> PowerModifierTooltips() {
        if (menu.getHologramLevel() == 1) {
            return List.of(new TranslatableComponent("screen." + "degeneracycraft_machine" + ".process_modifier_3"),
                    new TranslatableComponent("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_2"));
        } else if (menu.getHologramLevel() == 0) {
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
        renderButtons(pPoseStack, x, y);
    }


    private void renderButtons(PoseStack pPoseStack, int guiX, int guiY) {
        int holoLevel = menu.getHologramLevel();

        ResourceLocation hologramTexture = switch (holoLevel) {
            case 0 -> HOLOGRAM_ON;
            case 1 -> HOLOGRAM_LV1;
            default -> HOLOGRAM_OFF;
        };

        RenderSystem.setShaderTexture(0, hologramTexture);
        blit(pPoseStack, guiX + HOLOGRAM_X, guiY + HOLOGRAM_Y, 0, 0,
                BUTTON_SIZE, BUTTON_SIZE,
                BUTTON_SIZE, BUTTON_SIZE
        );

        RenderSystem.setShaderTexture(
                0,
                menu.isForceHalt() ? HALT_ON : HALT_OFF
        );
        blit(pPoseStack, guiX + HALT_X, guiY + HALT_Y, 0, 0,
                BUTTON_SIZE, BUTTON_SIZE,
                BUTTON_SIZE, BUTTON_SIZE
        );
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return super.mouseClicked(mouseX, mouseY, button);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        if (isMouseOver(mouseX, mouseY, x + HOLOGRAM_X, y + HOLOGRAM_Y)) {
            DCMessages.sendToServer(
                    new DCMachineToggleC2SPacket(menu.getBlockEntity().getBlockPos(), DCMachineToggleC2SPacket.TOGGLE_HOLOGRAM)
            );
            return true;
        }

        if (isMouseOver(mouseX, mouseY, x + HALT_X, y + HALT_Y)) {
            DCMessages.sendToServer(
                    new DCMachineToggleC2SPacket(menu.getBlockEntity().getBlockPos(), 1)
            );
            return true;
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    private boolean isMouseOver(double mx, double my, int x, int y) {
        return mx >= x && mx < x + BUTTON_SIZE
                && my >= y && my < y + BUTTON_SIZE;
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

package net.epitap.degeneracycraft.blocks.screen.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.minecraft.client.renderer.Rect2i;
import net.minecraft.network.chat.Component;

import java.util.List;

public class EnergyInfoArea extends InfoArea {
    private final DCIEnergyStorageFloat energy;

    public EnergyInfoArea(int xMin, int yMin) {
        this(xMin, yMin, null, 7, 65);
    }

    public EnergyInfoArea(int xMin, int yMin, DCIEnergyStorageFloat energy) {
        this(xMin, yMin, energy, 7, 65);
    }

    public EnergyInfoArea(int xMin, int yMin, DCIEnergyStorageFloat energy, int width, int height) {
        super(new Rect2i(xMin, yMin, width, height));
        this.energy = energy;

    }

    public List<Component> getTooltips() {
        if (energy.getMaxEnergyStoredFloat() < 1000000F && energy.getMaxEnergyStoredFloat() >= 1000F) {
            if (energy.getEnergyStoredFloat() >= 1000F){
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat()/1000F + " KFE" + "/" + energy.getMaxEnergyStoredFloat()/1000F + " KFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() / 1000F + " KFE"));
            }

            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + " FE" + "/" + energy.getMaxEnergyStoredFloat()/1000F + " KFE"));
        }

        if (energy.getMaxEnergyStoredFloat() < 1000000000F && energy.getMaxEnergyStoredFloat() >= 1000000F) {
            if (energy.getEnergyStoredFloat() < 1000000000F && energy.getEnergyStoredFloat() >= 1000000F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat()/1000000F + " MFE" + "/" + energy.getMaxEnergyStoredFloat() /1000000F + " MFE"));
            }
            if (energy.getEnergyStoredFloat() < 1000000F && energy.getEnergyStoredFloat() >= 1000F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1000F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1000000F + " MFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() / 1000000F + " MFE"));
            }
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + "/" + energy.getMaxEnergyStoredFloat() / 1000000F + " MFE"));
        }

        if (energy.getMaxEnergyStoredFloat() < 1000000000000F && energy.getMaxEnergyStoredFloat() >= 1000000000F) {
            if (energy.getEnergyStoredFloat() < 1000000000000F && energy.getEnergyStoredFloat() >= 1000000000F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1000000000F + " GFE" + "/" + energy.getMaxEnergyStoredFloat() / 1000000000F + " GFE"));
            }
            if (energy.getEnergyStoredFloat() < 1000000000F && energy.getEnergyStoredFloat() >= 1000000F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1000000F + " MFE" + "/" + energy.getMaxEnergyStoredFloat() / 1000000F + " MFE"));
            }
            if (energy.getEnergyStoredFloat() < 1000000F && energy.getEnergyStoredFloat() >= 1000F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1000F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1000000F + " MFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() / 1000000F + " MFE"));
            }
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + "/" + energy.getMaxEnergyStoredFloat() / 1000000F + " MFE"));
        }
        return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + " FE" + "/" + energy.getMaxEnergyStoredFloat() + " FE"));

    }

    @Override
    public void draw(PoseStack transform) {
        final int height = area.getHeight();
        int stored = (int) (height * (energy.getEnergyStoredFloat() / energy.getMaxEnergyStoredFloat()));
        fillGradient(
                transform,
                area.getX(), area.getY() + (height - stored),
                area.getX() + area.getWidth(), area.getY() + area.getHeight(),
                0xff7fffd4, 0xff008000
        );
    }
}

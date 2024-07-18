package net.epitap.degeneracycraft.blocks.base.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.minecraft.client.renderer.Rect2i;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MultiblockEnergyStorageInfoArea extends InfoArea {
    private final DCIEnergyStorageFloat energy;

    public MultiblockEnergyStorageInfoArea(int xMin, int yMin) {
        this(xMin, yMin, null, 80, 65);
    }

    public MultiblockEnergyStorageInfoArea(int xMin, int yMin, DCIEnergyStorageFloat energy) {
        this(xMin, yMin, energy, 80, 65);
    }

    public MultiblockEnergyStorageInfoArea(int xMin, int yMin, DCIEnergyStorageFloat energy, int width, int height) {
        super(new Rect2i(xMin, yMin, width, height));
        this.energy = energy;

    }

    public List<Component> getTooltips() {
        if (energy.getMaxEnergyStoredFloat() < 1E6F && energy.getMaxEnergyStoredFloat() >= 1E3F) {
            if (energy.getEnergyStoredFloat() >= 1E3F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E3F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E3F + " KFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() / 1E3F + " KFE"));
            }

            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + " FE" + "/" + energy.getMaxEnergyStoredFloat() / 1E3F + " KFE"));
        }

        if (energy.getMaxEnergyStoredFloat() < 1E9F && energy.getMaxEnergyStoredFloat() >= 1E6F) {
            if (energy.getEnergyStoredFloat() < 1E9F && energy.getEnergyStoredFloat() >= 1E6F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E6F + " MFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E6F + " MFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E6F && energy.getEnergyStoredFloat() >= 1E3F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E3F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E6F + " MFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() / 1E6F + " MFE"));
            }
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + "/" + energy.getMaxEnergyStoredFloat() / 1E6F + " MFE"));
        }

        if (energy.getMaxEnergyStoredFloat() < 1E12F && energy.getMaxEnergyStoredFloat() >= 1E9F) {
            if (energy.getEnergyStoredFloat() < 1E12F && energy.getEnergyStoredFloat() >= 1E9F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E9F + " GFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E9F && energy.getEnergyStoredFloat() >= 1E6F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E6F + " MFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E6F && energy.getEnergyStoredFloat() >= 1E3F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E3F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() + " GFE"));
            }
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
        }

        if (energy.getMaxEnergyStoredFloat() < 1E12F && energy.getMaxEnergyStoredFloat() >= 1E9F) {
            if (energy.getEnergyStoredFloat() < 1E12F && energy.getEnergyStoredFloat() >= 1E9F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E9F + " GFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E9F && energy.getEnergyStoredFloat() >= 1E6F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E6F + " MFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E6F && energy.getEnergyStoredFloat() >= 1E3F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E3F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() + " GFE"));
            }
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + "/" + energy.getMaxEnergyStoredFloat() / 1E9F + " GFE"));
        }

        if (energy.getMaxEnergyStoredFloat() < 1E15F && energy.getMaxEnergyStoredFloat() >= 1E12F) {
            if (energy.getEnergyStoredFloat() < 1E15F && energy.getEnergyStoredFloat() >= 1E12F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E12F + " TFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E12F + " TFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E12F && energy.getEnergyStoredFloat() >= 1E9F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E9F + " GFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E12F + " TFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E9F && energy.getEnergyStoredFloat() >= 1E6F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E6F + " MFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E12F + " TFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E6F && energy.getEnergyStoredFloat() >= 1E3F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E3F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E12F + " TFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() + " TFE"));
            }
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + "/" + energy.getMaxEnergyStoredFloat() / 1E12F + " TFE"));
        }

        if (energy.getMaxEnergyStoredFloat() < 1E18F && energy.getMaxEnergyStoredFloat() >= 1E15F) {
            if (energy.getEnergyStoredFloat() < 1E18F && energy.getEnergyStoredFloat() >= 1E15F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E15F + " PFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E15F + " PFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E15F && energy.getEnergyStoredFloat() >= 1E12F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E12F + " TFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E15F + " PFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E12F && energy.getEnergyStoredFloat() >= 1E9F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E9F + " GFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E15F + " PFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E9F && energy.getEnergyStoredFloat() >= 1E6F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E6F + " MFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E15F + " PFE"));
            }
            if (energy.getEnergyStoredFloat() < 1E6F && energy.getEnergyStoredFloat() >= 1E3F) {
                return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() / 1E3F + " KFE" + "/" + energy.getMaxEnergyStoredFloat() / 1E15F + " PFE"));
            }
            if (energy.getEnergyStoredFloat() <= 0.00000001F && energy.getEnergyStoredFloat() >= 0F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + energy.getMaxEnergyStoredFloat() + " PFE"));
            }
            return List.of(Component.nullToEmpty(energy.getEnergyStoredFloat() + "/" + energy.getMaxEnergyStoredFloat() / 1E15F + " PFE"));
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

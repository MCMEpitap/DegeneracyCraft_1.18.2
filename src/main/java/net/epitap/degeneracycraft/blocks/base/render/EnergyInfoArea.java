package net.epitap.degeneracycraft.blocks.base.render;

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
        float maxStored = energy.getMaxEnergyStoredFloat();
        float stored = energy.getEnergyStoredFloat();

        if (maxStored < 1E6F && maxStored >= 1E3F) {
            if (stored >= 1E3F) {
                return List.of(Component.nullToEmpty(stored / 1E3F + " KFE" + "/" + maxStored / 1E3F + " KFE"));
            }
            if (stored < 1F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + maxStored / 1E3F + " KFE"));
            }

            return List.of(Component.nullToEmpty(stored + " FE" + "/" + maxStored / 1E3F + " KFE"));
        }

        if (maxStored < 1E9F && maxStored >= 1E6F) {
            if (stored < 1E9F && stored >= 1E6F) {
                return List.of(Component.nullToEmpty(stored / 1E6F + " MFE" + "/" + maxStored / 1E6F + " MFE"));
            }
            if (stored < 1E6F && stored >= 1E3F) {
                return List.of(Component.nullToEmpty(stored / 1E3F + " KFE" + "/" + maxStored / 1E6F + " MFE"));
            }
            if (stored < 1F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + maxStored / 1E6F + " MFE"));
            }
            return List.of(Component.nullToEmpty(stored + "/" + maxStored / 1E6F + " MFE"));
        }

        if (maxStored < 1E12F && maxStored >= 1E9F) {
            if (stored < 1E12F && stored >= 1E9F) {
                return List.of(Component.nullToEmpty(stored / 1E9F + " GFE" + "/" + maxStored / 1E9F + " GFE"));
            }
            if (stored < 1E9F && stored >= 1E6F) {
                return List.of(Component.nullToEmpty(stored / 1E6F + " MFE" + "/" + maxStored / 1E9F + " GFE"));
            }
            if (stored < 1E6F && stored >= 1E3F) {
                return List.of(Component.nullToEmpty(stored / 1E3F + " KFE" + "/" + maxStored / 1E9F + " GFE"));
            }
            if (stored < 1F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + maxStored + " GFE"));
            }
            return List.of(Component.nullToEmpty(stored + "/" + maxStored / 1E9F + " GFE"));
        }

        if (maxStored < 1E15F && maxStored >= 1E12F) {
            if (stored < 1E15F && stored >= 1E12F) {
                return List.of(Component.nullToEmpty(stored / 1E12F + " TFE" + "/" + maxStored / 1E12F + " TFE"));
            }
            if (stored < 1E12F && stored >= 1E9F) {
                return List.of(Component.nullToEmpty(stored / 1E9F + " GFE" + "/" + maxStored / 1E12F + " TFE"));
            }
            if (stored < 1E9F && stored >= 1E6F) {
                return List.of(Component.nullToEmpty(stored / 1E6F + " MFE" + "/" + maxStored / 1E12F + " TFE"));
            }
            if (stored < 1E6F && stored >= 1E3F) {
                return List.of(Component.nullToEmpty(stored / 1E3F + " KFE" + "/" + maxStored / 1E12F + " TFE"));
            }
            if (stored < 1F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + maxStored + " TFE"));
            }
            return List.of(Component.nullToEmpty(stored + "/" + maxStored / 1E12F + " TFE"));
        }

        if (maxStored < 1E18F && maxStored >= 1E15F) {
            if (stored < 1E18F && stored >= 1E15F) {
                return List.of(Component.nullToEmpty(stored / 1E15F + " PFE" + "/" + maxStored / 1E15F + " PFE"));
            }
            if (stored < 1E15F && stored >= 1E12F) {
                return List.of(Component.nullToEmpty(stored / 1E12F + " TFE" + "/" + maxStored / 1E15F + " PFE"));
            }
            if (stored < 1E12F && stored >= 1E9F) {
                return List.of(Component.nullToEmpty(stored / 1E9F + " GFE" + "/" + maxStored / 1E15F + " PFE"));
            }
            if (stored < 1E9F && stored >= 1E6F) {
                return List.of(Component.nullToEmpty(stored / 1E6F + " MFE" + "/" + maxStored / 1E15F + " PFE"));
            }
            if (stored < 1E6F && stored >= 1E3F) {
                return List.of(Component.nullToEmpty(stored / 1E3F + " KFE" + "/" + maxStored / 1E15F + " PFE"));
            }
            if (stored < 1F) {
                return List.of(Component.nullToEmpty(0 + " FE" + "/" + maxStored + " PFE"));
            }
            return List.of(Component.nullToEmpty(stored + "/" + maxStored / 1E15F + " PFE"));
        }

        return List.of(Component.nullToEmpty(stored + " FE" + "/" + maxStored + " FE"));

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

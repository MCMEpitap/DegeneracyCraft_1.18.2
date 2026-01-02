package net.epitap.degeneracycraft.item.sefirah_core.base;

import net.minecraft.resources.ResourceLocation;

public class SkillNodeLayout {

    private final ResourceLocation id;
    private final int x;
    private final int y;
    private boolean unlocked = false;
    private boolean selected;


    public SkillNodeLayout(ResourceLocation id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ResourceLocation getId() {
        return id;
    }

    public boolean isUnlocked() {
        return unlocked;
    }


    public void unlock() {
        this.unlocked = true;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isInside(int mouseX, int mouseY) {
        int size = 16;
        return mouseX >= x && mouseX <= x + size
                && mouseY >= y && mouseY <= y + size;
    }


}


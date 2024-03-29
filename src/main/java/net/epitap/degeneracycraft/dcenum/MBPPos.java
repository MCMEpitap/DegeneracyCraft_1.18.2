package net.epitap.degeneracycraft.dcenum;

public enum MBPPos {

    x_1y_1z_3(-1, -1, -3), x_1y_1z_2(-1, -1, -2), x_1y_1z_1(-1, -1, -1), x_1y_1z0(-1, -1, 0),
    x0y_1z_3(0, -1, -3), x0y_1z_2(0, -1, -2), x0y_1z_1(0, -1, -1), x0y_1z0(0, -1, 0),
    x1y_1z_3(1, -1, -3), x1y_1z_2(1, -1, -2), x1y_1z_1(1, -1, -1), x1y_1z0(1, -1, 0),

    x_1y0z_3(-1, 0, -3), x_1y0z_2(-1, 0, -2), x_1y0z_1(-1, 0, -1), x_1y0z0(-1, 0, 0),
    x0y0z_3(0, 0, -3), x0y0z_2(0, 0, -2), x0y0z_1(0, 0, -1), x0y0z0(0, 0, 0),
    x1y0z_3(1, 0, -3), x1y0z_2(1, 0, -2), x1y0z_1(1, 0, -1), x1y0z0(1, 0, 0),

    x_1y1z_3(-1, 1, -3), x_1y1z_2(-1, 1, -2), x_1y1z_1(-1, 1, -1), x_1y1z0(-1, 1, 0),
    x0y1z_3(0, 1, -3), x0y1z_2(0, 1, -2), x0y1z_1(0, 1, -1), x0y1z0(0, 1, 0),
    x1y1z_3(1, 1, -3), x1y1z_2(1, 1, -2), x1y1z_1(1, 1, -1), x1y1z0(1, 1, 0),
    ;

    public final int xPos;
    public final int yPos;
    public final int zPos;

    MBPPos(int xPos, int yPos, int zPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public int getZPos() {
        return this.zPos;
    }

}

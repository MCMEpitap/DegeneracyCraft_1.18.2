package net.epitap.degeneracycraft.pipe.render;

import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PipeVoxelShape {
    public static VoxelShape combine(VoxelShape... shapes) {
        if (shapes.length <= 0) {
            return Shapes.empty();
        }
        VoxelShape combined = shapes[0];

        for (int i = 1; i < shapes.length; i++) {
            combined = Shapes.or(combined, shapes[i]);
        }

        return combined;
    }
}

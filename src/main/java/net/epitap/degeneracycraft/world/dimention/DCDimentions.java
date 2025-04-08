package net.epitap.degeneracycraft.world.dimention;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class DCDimentions {

    public static final ResourceKey<Level> TESTDIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Degeneracycraft.MOD_ID, "test"));

    public static final ResourceKey<DimensionType> TESTDIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, TESTDIM_KEY.getRegistryName());

    public static void register() {
        System.out.println("Registering ModDimensions for " + Degeneracycraft.MOD_ID);
    }
}

package net.epitap.degeneracycraft.datagen;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.item.DCAdvancementIcon;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DCItemModelProvider extends ItemModelProvider {
    public DCItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Degeneracycraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        iconItem(DCAdvancementIcon.ASTRONOMY_ICON.get());
        iconItem(DCAdvancementIcon.BIOLOGY_ICON.get());
        iconItem(DCAdvancementIcon.CHEMISTRY_ICON.get());
        iconItem(DCAdvancementIcon.DEGENERACYCRAFT_ICON.get());
        iconItem(DCAdvancementIcon.ENGINEERING_ICON.get());
        iconItem(DCAdvancementIcon.FORMAL_SCIENCE_ICON.get());
        iconItem(DCAdvancementIcon.GEO_SCIENCE_ICON.get());
        iconItem(DCAdvancementIcon.HYBRID_PHYSICS_ICON.get());
        iconItem(DCAdvancementIcon.IMITATION_MAGIC_ENGINEERING_ICON.get());


        simpleItem(DCItems.GRAVITATION_INGOT.get());
        //
        ingotMaterialItem(DCItems.BAUXITE_INGOT.get());
        ingotMaterialItem(DCItems.BERYL_INGOT.get());
        ingotMaterialItem(DCItems.BORAX_INGOT.get());
        ingotMaterialItem(DCItems.CASSITERITE_INGOT.get());
        ingotMaterialItem(DCItems.CHROMITE_INGOT.get());
        ingotMaterialItem(DCItems.FLUORITE_INGOT.get());
        ingotMaterialItem(DCItems.GRAPHITE_INGOT.get());
        ingotMaterialItem(DCItems.LATERITE_INGOT.get());
        ingotMaterialItem(DCItems.LIMESTONE_INGOT.get());
        ingotMaterialItem(DCItems.NITRATINE_INGOT.get());
        ingotMaterialItem(DCItems.PENTLANDITE_INGOT.get());
        ingotMaterialItem(DCItems.PHOSPHORITE_INGOT.get());
        ingotMaterialItem(DCItems.PYROLUSITE_INGOT.get());
        ingotMaterialItem(DCItems.QUARTZ_INGOT.get());
        ingotMaterialItem(DCItems.RUTILE_INGOT.get());
        ingotMaterialItem(DCItems.SPODUMENE_INGOT.get());
        ingotMaterialItem(DCItems.SYLVITE_INGOT.get());
        ingotMaterialItem(DCItems.ULEXITE_INGOT.get());
        ingotMaterialItem(DCItems.VANADINITE_INGOT.get());

        oreMaterialBauxiteItem(DCItems.RAW_BAUXITE_ORE.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_DUST.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_PUREDUST.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_LEACHATE.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_CONCENTRATE.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_PLASMA.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_DEGENERATEMATTER.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_SOUP.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_IMAGINARYMATTER.get());
        oreMaterialBauxiteItem(DCItems.STABLE_BAUXITE_IMAGINARYMATTER.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_TACHYON.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_ANTIMATTER.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_ULTRAHOTPLASMA.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_OVERFLUID.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_CRYSTAL.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_PRECIPITATE.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_WASHEDDUST.get());
        oreMaterialBauxiteItem(DCItems.BAUXITE_ORESINTER.get());

        //
        oreMaterialBerylItem(DCItems.RAW_BERYL_ORE.get());
        oreMaterialBerylItem(DCItems.BERYL_DUST.get());
        oreMaterialBerylItem(DCItems.BERYL_PUREDUST.get());
        oreMaterialBerylItem(DCItems.BERYL_LEACHATE.get());
        oreMaterialBerylItem(DCItems.BERYL_CONCENTRATE.get());
        oreMaterialBerylItem(DCItems.BERYL_PLASMA.get());
        oreMaterialBerylItem(DCItems.BERYL_DEGENERATEMATTER.get());
        oreMaterialBerylItem(DCItems.BERYL_SOUP.get());
        oreMaterialBerylItem(DCItems.BERYL_IMAGINARYMATTER.get());
        oreMaterialBerylItem(DCItems.STABLE_BERYL_IMAGINARYMATTER.get());
        oreMaterialBerylItem(DCItems.BERYL_TACHYON.get());
        oreMaterialBerylItem(DCItems.BERYL_ANTIMATTER.get());
        oreMaterialBerylItem(DCItems.BERYL_ULTRAHOTPLASMA.get());
        oreMaterialBerylItem(DCItems.BERYL_OVERFLUID.get());
        oreMaterialBerylItem(DCItems.BERYL_CRYSTAL.get());
        oreMaterialBerylItem(DCItems.BERYL_PRECIPITATE.get());
        oreMaterialBerylItem(DCItems.BERYL_WASHEDDUST.get());
        oreMaterialBerylItem(DCItems.BERYL_ORESINTER.get());

        //
        oreMaterialBoraxItem(DCItems.RAW_BORAX_ORE.get());
        oreMaterialBoraxItem(DCItems.BORAX_DUST.get());
        oreMaterialBoraxItem(DCItems.BORAX_PUREDUST.get());
        oreMaterialBoraxItem(DCItems.BORAX_LEACHATE.get());
        oreMaterialBoraxItem(DCItems.BORAX_CONCENTRATE.get());
        oreMaterialBoraxItem(DCItems.BORAX_PLASMA.get());
        oreMaterialBoraxItem(DCItems.BORAX_DEGENERATEMATTER.get());
        oreMaterialBoraxItem(DCItems.BORAX_SOUP.get());
        oreMaterialBoraxItem(DCItems.BORAX_IMAGINARYMATTER.get());
        oreMaterialBoraxItem(DCItems.STABLE_BORAX_IMAGINARYMATTER.get());
        oreMaterialBoraxItem(DCItems.BORAX_TACHYON.get());
        oreMaterialBoraxItem(DCItems.BORAX_ANTIMATTER.get());
        oreMaterialBoraxItem(DCItems.BORAX_ULTRAHOTPLASMA.get());
        oreMaterialBoraxItem(DCItems.BORAX_OVERFLUID.get());
        oreMaterialBoraxItem(DCItems.BORAX_CRYSTAL.get());
        oreMaterialBoraxItem(DCItems.BORAX_PRECIPITATE.get());
        oreMaterialBoraxItem(DCItems.BORAX_WASHEDDUST.get());
        oreMaterialBoraxItem(DCItems.BORAX_ORESINTER.get());

        //
        oreMaterialCassiteriteItem(DCItems.RAW_CASSITERITE_ORE.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_DUST.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_PUREDUST.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_LEACHATE.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_CONCENTRATE.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_PLASMA.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_DEGENERATEMATTER.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_SOUP.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_IMAGINARYMATTER.get());
        oreMaterialCassiteriteItem(DCItems.STABLE_CASSITERITE_IMAGINARYMATTER.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_TACHYON.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_ANTIMATTER.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_ULTRAHOTPLASMA.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_OVERFLUID.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_CRYSTAL.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_PRECIPITATE.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_WASHEDDUST.get());
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_ORESINTER.get());

        //
        oreMaterialChromiteItem(DCItems.RAW_CHROMITE_ORE.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_DUST.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_PUREDUST.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_LEACHATE.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_CONCENTRATE.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_PLASMA.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_DEGENERATEMATTER.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_SOUP.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_IMAGINARYMATTER.get());
        oreMaterialChromiteItem(DCItems.STABLE_CHROMITE_IMAGINARYMATTER.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_TACHYON.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_ANTIMATTER.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_ULTRAHOTPLASMA.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_OVERFLUID.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_CRYSTAL.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_PRECIPITATE.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_WASHEDDUST.get());
        oreMaterialChromiteItem(DCItems.CHROMITE_ORESINTER.get());
        //
        oreMaterialFluoriteItem(DCItems.RAW_FLUORITE_ORE.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_DUST.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_PUREDUST.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_LEACHATE.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_CONCENTRATE.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_PLASMA.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_DEGENERATEMATTER.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_SOUP.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_IMAGINARYMATTER.get());
        oreMaterialFluoriteItem(DCItems.STABLE_FLUORITE_IMAGINARYMATTER.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_TACHYON.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_ANTIMATTER.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_ULTRAHOTPLASMA.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_OVERFLUID.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_CRYSTAL.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_PRECIPITATE.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_WASHEDDUST.get());
        oreMaterialFluoriteItem(DCItems.FLUORITE_ORESINTER.get());
        //
        oreMaterialGraphiteItem(DCItems.RAW_GRAPHITE_ORE.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_DUST.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_PUREDUST.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_LEACHATE.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_CONCENTRATE.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_PLASMA.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_DEGENERATEMATTER.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_SOUP.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_IMAGINARYMATTER.get());
        oreMaterialGraphiteItem(DCItems.STABLE_GRAPHITE_IMAGINARYMATTER.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_TACHYON.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_ANTIMATTER.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_ULTRAHOTPLASMA.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_OVERFLUID.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_CRYSTAL.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_PRECIPITATE.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_WASHEDDUST.get());
        oreMaterialGraphiteItem(DCItems.GRAPHITE_ORESINTER.get());
        //
//        simpleItem(DCItems.IRON_DUST.get());
//        simpleItem(DCItems.IRON_PUREDUST.get());
//        simpleItem(DCItems.IRON_LEACHATE.get());
//        simpleItem(DCItems.IRON_CONCENTRATE.get());
//        simpleItem(DCItems.IRON_PLASMA.get());
//        simpleItem(DCItems.IRON_DEGENERATEMATTER.get());
//        simpleItem(DCItems.IRON_SOUP.get());
//        simpleItem(DCItems.IRON_IMAGINARYMATTER.get());
//        simpleItem(DCItems.STABLE_IRON_IMAGINARYMATTER.get());
//        simpleItem(DCItems.IRON_TACHYON.get());
//        simpleItem(DCItems.IRON_ANTIMATTER.get());
//        simpleItem(DCItems.IRON_ULTRAHOTPLASMA.get());
//        simpleItem(DCItems.IRON_OVERFLUID.get());
//        simpleItem(DCItems.IRON_CRYSTAL.get());
//        simpleItem(DCItems.IRON_PRECIPITATE.get());
//        simpleItem(DCItems.IRON_WASHEDDUST.get());
//        simpleItem(DCItems.IRON_ORESINTER.get());
        //
        oreMaterialLateriteItem(DCItems.RAW_LATERITE_ORE.get());
        oreMaterialLateriteItem(DCItems.LATERITE_DUST.get());
        oreMaterialLateriteItem(DCItems.LATERITE_PUREDUST.get());
        oreMaterialLateriteItem(DCItems.LATERITE_LEACHATE.get());
        oreMaterialLateriteItem(DCItems.LATERITE_CONCENTRATE.get());
        oreMaterialLateriteItem(DCItems.LATERITE_PLASMA.get());
        oreMaterialLateriteItem(DCItems.LATERITE_DEGENERATEMATTER.get());
        oreMaterialLateriteItem(DCItems.LATERITE_SOUP.get());
        oreMaterialLateriteItem(DCItems.LATERITE_IMAGINARYMATTER.get());
        oreMaterialLateriteItem(DCItems.STABLE_LATERITE_IMAGINARYMATTER.get());
        oreMaterialLateriteItem(DCItems.LATERITE_TACHYON.get());
        oreMaterialLateriteItem(DCItems.LATERITE_ANTIMATTER.get());
        oreMaterialLateriteItem(DCItems.LATERITE_ULTRAHOTPLASMA.get());
        oreMaterialLateriteItem(DCItems.LATERITE_OVERFLUID.get());
        oreMaterialLateriteItem(DCItems.LATERITE_CRYSTAL.get());
        oreMaterialLateriteItem(DCItems.LATERITE_PRECIPITATE.get());
        oreMaterialLateriteItem(DCItems.LATERITE_WASHEDDUST.get());
        oreMaterialLateriteItem(DCItems.LATERITE_ORESINTER.get());
        //
        oreMaterialLimestoneItem(DCItems.RAW_LIMESTONE_ORE.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_DUST.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_PUREDUST.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_LEACHATE.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_CONCENTRATE.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_PLASMA.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_DEGENERATEMATTER.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_SOUP.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_IMAGINARYMATTER.get());
        oreMaterialLimestoneItem(DCItems.STABLE_LIMESTONE_IMAGINARYMATTER.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_TACHYON.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_ANTIMATTER.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_ULTRAHOTPLASMA.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_OVERFLUID.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_CRYSTAL.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_PRECIPITATE.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_WASHEDDUST.get());
        oreMaterialLimestoneItem(DCItems.LIMESTONE_ORESINTER.get());
        //
        oreMaterialNitratineItem(DCItems.RAW_NITRATINE_ORE.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_DUST.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_PUREDUST.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_LEACHATE.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_CONCENTRATE.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_PLASMA.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_DEGENERATEMATTER.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_SOUP.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_IMAGINARYMATTER.get());
        oreMaterialNitratineItem(DCItems.STABLE_NITRATINE_IMAGINARYMATTER.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_TACHYON.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_ANTIMATTER.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_ULTRAHOTPLASMA.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_OVERFLUID.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_CRYSTAL.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_PRECIPITATE.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_WASHEDDUST.get());
        oreMaterialNitratineItem(DCItems.NITRATINE_ORESINTER.get());
        //
        oreMaterialPentlanditeItem(DCItems.RAW_PENTLANDITE_ORE.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_DUST.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_PUREDUST.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_LEACHATE.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_CONCENTRATE.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_PLASMA.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_DEGENERATEMATTER.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_SOUP.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_IMAGINARYMATTER.get());
        oreMaterialPentlanditeItem(DCItems.STABLE_PENTLANDITE_IMAGINARYMATTER.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_TACHYON.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_ANTIMATTER.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_ULTRAHOTPLASMA.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_OVERFLUID.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_CRYSTAL.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_PRECIPITATE.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_WASHEDDUST.get());
        oreMaterialPentlanditeItem(DCItems.PENTLANDITE_ORESINTER.get());
        //
        oreMaterialPhosphoriteItem(DCItems.RAW_PHOSPHORITE_ORE.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_DUST.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_PUREDUST.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_LEACHATE.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_CONCENTRATE.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_PLASMA.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_DEGENERATEMATTER.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_SOUP.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_IMAGINARYMATTER.get());
        oreMaterialPhosphoriteItem(DCItems.STABLE_PHOSPHORITE_IMAGINARYMATTER.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_TACHYON.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_ANTIMATTER.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_ULTRAHOTPLASMA.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_OVERFLUID.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_CRYSTAL.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_PRECIPITATE.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_WASHEDDUST.get());
        oreMaterialPhosphoriteItem(DCItems.PHOSPHORITE_ORESINTER.get());
        //
        oreMaterialPyrolusiteItem(DCItems.RAW_PYROLUSITE_ORE.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_DUST.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_PUREDUST.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_LEACHATE.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_CONCENTRATE.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_PLASMA.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_DEGENERATEMATTER.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_SOUP.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_IMAGINARYMATTER.get());
        oreMaterialPyrolusiteItem(DCItems.STABLE_PYROLUSITE_IMAGINARYMATTER.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_TACHYON.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_ANTIMATTER.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_ULTRAHOTPLASMA.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_OVERFLUID.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_CRYSTAL.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_PRECIPITATE.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_WASHEDDUST.get());
        oreMaterialPyrolusiteItem(DCItems.PYROLUSITE_ORESINTER.get());
        //
        oreMaterialQuartzItem(DCItems.RAW_QUARTZ_ORE.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_DUST.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_PUREDUST.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_LEACHATE.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_CONCENTRATE.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_PLASMA.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_DEGENERATEMATTER.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_SOUP.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_IMAGINARYMATTER.get());
        oreMaterialQuartzItem(DCItems.STABLE_QUARTZ_IMAGINARYMATTER.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_TACHYON.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_ANTIMATTER.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_ULTRAHOTPLASMA.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_OVERFLUID.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_CRYSTAL.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_PRECIPITATE.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_WASHEDDUST.get());
        oreMaterialQuartzItem(DCItems.QUARTZ_ORESINTER.get());
        //
        oreMaterialRutileItem(DCItems.RAW_RUTILE_ORE.get());
        oreMaterialRutileItem(DCItems.RUTILE_DUST.get());
        oreMaterialRutileItem(DCItems.RUTILE_PUREDUST.get());
        oreMaterialRutileItem(DCItems.RUTILE_LEACHATE.get());
        oreMaterialRutileItem(DCItems.RUTILE_CONCENTRATE.get());
        oreMaterialRutileItem(DCItems.RUTILE_PLASMA.get());
        oreMaterialRutileItem(DCItems.RUTILE_DEGENERATEMATTER.get());
        oreMaterialRutileItem(DCItems.RUTILE_SOUP.get());
        oreMaterialRutileItem(DCItems.RUTILE_IMAGINARYMATTER.get());
        oreMaterialRutileItem(DCItems.STABLE_RUTILE_IMAGINARYMATTER.get());
        oreMaterialRutileItem(DCItems.RUTILE_TACHYON.get());
        oreMaterialRutileItem(DCItems.RUTILE_ANTIMATTER.get());
        oreMaterialRutileItem(DCItems.RUTILE_ULTRAHOTPLASMA.get());
        oreMaterialRutileItem(DCItems.RUTILE_OVERFLUID.get());
        oreMaterialRutileItem(DCItems.RUTILE_CRYSTAL.get());
        oreMaterialRutileItem(DCItems.RUTILE_PRECIPITATE.get());
        oreMaterialRutileItem(DCItems.RUTILE_WASHEDDUST.get());
        oreMaterialRutileItem(DCItems.RUTILE_ORESINTER.get());
        //
        oreMaterialSpodumeneItem(DCItems.RAW_SPODUMENE_ORE.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_DUST.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_PUREDUST.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_LEACHATE.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_CONCENTRATE.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_PLASMA.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_DEGENERATEMATTER.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_SOUP.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_IMAGINARYMATTER.get());
        oreMaterialSpodumeneItem(DCItems.STABLE_SPODUMENE_IMAGINARYMATTER.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_TACHYON.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_ANTIMATTER.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_ULTRAHOTPLASMA.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_OVERFLUID.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_CRYSTAL.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_PRECIPITATE.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_WASHEDDUST.get());
        oreMaterialSpodumeneItem(DCItems.SPODUMENE_ORESINTER.get());
        //
        oreMaterialSylviteItem(DCItems.RAW_SYLVITE_ORE.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_DUST.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_PUREDUST.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_LEACHATE.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_CONCENTRATE.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_PLASMA.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_DEGENERATEMATTER.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_SOUP.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_IMAGINARYMATTER.get());
        oreMaterialSylviteItem(DCItems.STABLE_SYLVITE_IMAGINARYMATTER.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_TACHYON.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_ANTIMATTER.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_ULTRAHOTPLASMA.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_OVERFLUID.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_CRYSTAL.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_PRECIPITATE.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_WASHEDDUST.get());
        oreMaterialSylviteItem(DCItems.SYLVITE_ORESINTER.get());
        //
        oreMaterialUlexiteItem(DCItems.RAW_ULEXITE_ORE.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_DUST.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_PUREDUST.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_LEACHATE.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_CONCENTRATE.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_PLASMA.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_DEGENERATEMATTER.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_SOUP.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_IMAGINARYMATTER.get());
        oreMaterialUlexiteItem(DCItems.STABLE_ULEXITE_IMAGINARYMATTER.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_TACHYON.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_ANTIMATTER.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_ULTRAHOTPLASMA.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_OVERFLUID.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_CRYSTAL.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_PRECIPITATE.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_WASHEDDUST.get());
        oreMaterialUlexiteItem(DCItems.ULEXITE_ORESINTER.get());
        //
        oreMaterialVanadiniteItem(DCItems.RAW_VANADINITE_ORE.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_DUST.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_PUREDUST.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_LEACHATE.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_CONCENTRATE.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_PLASMA.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_DEGENERATEMATTER.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_SOUP.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_IMAGINARYMATTER.get());
        oreMaterialVanadiniteItem(DCItems.STABLE_VANADINITE_IMAGINARYMATTER.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_TACHYON.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_ANTIMATTER.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_ULTRAHOTPLASMA.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_OVERFLUID.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_CRYSTAL.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_PRECIPITATE.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_WASHEDDUST.get());
        oreMaterialVanadiniteItem(DCItems.VANADINITE_ORESINTER.get());
        //
        elementCopperItem(DCItems.COPPER_BEARING.get());
        elementCopperItem(DCItems.COPPER_BOLT.get());
        elementCopperItem(DCItems.COPPER_CAM.get());
        elementCopperItem(DCItems.COPPER_CHAIN.get());
        elementCopperItem(DCItems.COPPER_GEAR.get());
        elementCopperItem(DCItems.COPPER_JOINT.get());
        elementCopperItem(DCItems.COPPER_NUT.get());
        elementCopperItem(DCItems.COPPER_KEY.get());
        elementCopperItem(DCItems.COPPER_PIPE.get());
        elementCopperItem(DCItems.COPPER_PIPEJOINT.get());
        elementCopperItem(DCItems.COPPER_PLATE.get());
        elementCopperItem(DCItems.COPPER_RIVET.get());
        elementCopperItem(DCItems.COPPER_ROD.get());
        elementCopperItem(DCItems.COPPER_SHAFT.get());
        elementCopperItem(DCItems.COPPER_SHAFTCOUPLING.get());
        elementCopperItem(DCItems.COPPER_SHAPESTEEL.get());
        elementCopperItem(DCItems.COPPER_SPRING.get());
        elementCopperItem(DCItems.COPPER_WIRE.get());


        elementGoldItem(DCItems.GOLD_BEARING.get());
        elementGoldItem(DCItems.GOLD_BOLT.get());
        elementGoldItem(DCItems.GOLD_CAM.get());
        elementGoldItem(DCItems.GOLD_CHAIN.get());
        elementGoldItem(DCItems.GOLD_GEAR.get());
        elementGoldItem(DCItems.GOLD_JOINT.get());
        elementGoldItem(DCItems.GOLD_KEY.get());
        elementGoldItem(DCItems.GOLD_NUT.get());
        elementGoldItem(DCItems.GOLD_PIPE.get());
        elementGoldItem(DCItems.GOLD_PIPEJOINT.get());
        elementGoldItem(DCItems.GOLD_PLATE.get());
        elementGoldItem(DCItems.GOLD_RIVET.get());
        elementGoldItem(DCItems.GOLD_ROD.get());
        elementGoldItem(DCItems.GOLD_SHAFT.get());
        elementGoldItem(DCItems.GOLD_SHAFTCOUPLING.get());
        elementGoldItem(DCItems.GOLD_SHAPESTEEL.get());
        elementGoldItem(DCItems.GOLD_SPRING.get());
        elementGoldItem(DCItems.GOLD_WIRE.get());



        elementIronItem(DCItems.IRON_BEARING.get());
        elementIronItem(DCItems.IRON_BOLT.get());
        elementIronItem(DCItems.IRON_CAM.get());
        elementIronItem(DCItems.IRON_CHAIN.get());
        elementIronItem(DCItems.IRON_GEAR.get());
        elementIronItem(DCItems.IRON_JOINT.get());
        elementIronItem(DCItems.IRON_KEY.get());
        elementIronItem(DCItems.IRON_NUT.get());
        elementIronItem(DCItems.IRON_PIPE.get());
        elementIronItem(DCItems.IRON_PIPEJOINT.get());
        elementIronItem(DCItems.IRON_PLATE.get());
        elementIronItem(DCItems.IRON_RIVET.get());
        elementIronItem(DCItems.IRON_ROD.get());
        elementIronItem(DCItems.IRON_SHAFT.get());
        elementIronItem(DCItems.IRON_SHAFTCOUPLING.get());
        elementIronItem(DCItems.IRON_SHAPESTEEL.get());
        elementIronItem(DCItems.IRON_SPRING.get());
        elementIronItem(DCItems.IRON_WIRE.get());

        elementTinItem(DCItems.TIN_BEARING.get());
        elementTinItem(DCItems.TIN_BOLT.get());
        elementTinItem(DCItems.TIN_CAM.get());
        elementTinItem(DCItems.TIN_CHAIN.get());
        elementTinItem(DCItems.TIN_GEAR.get());
        elementTinItem(DCItems.TIN_JOINT.get());
        elementTinItem(DCItems.TIN_KEY.get());
        elementTinItem(DCItems.TIN_NUT.get());
        elementTinItem(DCItems.TIN_PIPE.get());
        elementTinItem(DCItems.TIN_PIPEJOINT.get());
        elementTinItem(DCItems.TIN_PLATE.get());
        elementTinItem(DCItems.TIN_RIVET.get());
        elementTinItem(DCItems.TIN_ROD.get());
        elementTinItem(DCItems.TIN_SHAFT.get());
        elementTinItem(DCItems.TIN_SHAFTCOUPLING.get());
        elementTinItem(DCItems.TIN_SHAPESTEEL.get());
        elementTinItem(DCItems.TIN_SPRING.get());
        elementTinItem(DCItems.TIN_WIRE.get());

//        simpleItem(DCItems.BASIC_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.BASIC_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.LOW_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.LOW_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.MEDIUM_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.HIGH_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.HIGH_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.SUPER_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.SUPER_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.OVER_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.OVER_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.ULTRA_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.ULTRA_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.ANTI_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.ANTI_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.IMAGINARY_CLASS_IRON_SPRING.get());
//
//        simpleItem(DCItems.INFINITY_CLASS_IRON_BEARING.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_BOLT.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_CAM.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_CHAIN.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_GEAR.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_JOINT.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_KEY.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_NUT.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_PIPE.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_PIPEJOINT.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_PLATE.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_ROD.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_SHAFT.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_SHAFTCOUPLING.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_SHAPESTEEL.get());
//        simpleItem(DCItems.INFINITY_CLASS_IRON_SPRING.get());


        elementChlorineMaterialItem(DCItems.CHLORINE_GAS.get());

        elementHydrogenMaterialItem(DCItems.HYDROGEN_GAS.get());

        elementSiliconMaterialItem(DCItems.SILICON_INGOT.get());
        elementSiliconMaterialItem(DCItems.SILICON_NUGGET.get());
        withExistingParent(DCBlocks.SILICON_BLOCK.getId().getPath(),
                modLoc("block/silicon_block"));

        elementTinMaterialItem(DCItems.TIN_INGOT.get());
        elementTinMaterialItem(DCItems.TIN_NUGGET.get());
        withExistingParent(DCBlocks.TIN_BLOCK.getId().getPath(),
                modLoc("block/tin_block"));


        substanceItem(DCItems.HYDROCHLORIC_ACID_SOLUTION.get());
        substanceItem(DCItems.HYDROGEN_CHLORIDE_GAS.get());
        substanceItem(DCItems.POTASSIUM_CHLORIDE_DUST.get());
        substanceItem(DCItems.POTASSIUM_NITRATE_DUST.get());
        substanceItem(DCItems.SODIUM_CHLORIDE_DUST.get());
        substanceItem(DCItems.SODIUM_NITRATE_DUST.get());

        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_BOLT_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_KEY_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_ROD_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_SPRING_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_BEARING_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_PLATE_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_GEAR_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_JOINT_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_NUT_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_PIPE_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_PIPEJOINT_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_CAM_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_SHAFT_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_SHAFTCOUPLING_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_SHAPESTEEL_INSCRIBED_CIRCUIT.get());
        basicInscribedCircuitItem(DCItems.BASIC_PRECISION_CHAIN_INSCRIBED_CIRCUIT.get());



        dataChipItem(DCItems.DESIGNATED_DATA_CHIP_MOON.get());

        deviceItem(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
        deviceItem(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
        deviceItem(DCItems.MACHINE_HALT_DEVICE.get());


//        basicMaterialAstronomyItem(DCItems.ASTRONOMY_DATA_STORAGE.get());
        dataStorageAstronomyItem(DCItems.STAR_DATA_STORAGE_MOON.get());

        basicMaterialCommonItem(DCItems.EMPTY_CONTAINER.get());
        basicMaterialCommonItem(DCItems.WATER_CONTAINER.get());





        basicMaterialHybridPhysicsItem(DCItems.PURIFIED_GRAPHITE_ARC_ELECTRODE.get());

        basicMaterialCommonItem(DCItems.COMPRESSED_PLANKS.get());
        basicMaterialCommonItem(DCItems.COMPRESSED_REDSTONE.get());




        basicPartAstronomyItem(DCItems.SIMPLE_CONVEX_LENS.get());
        basicPartAstronomyItem(DCItems.SIMPLE_CONCAVE_LENS.get());



        basicPartBiologyItem(DCItems.SIMPLE_BIOLOGICAL_FIBER.get());



        basicPartChemistryItem(DCItems.SIMPLE_CHEMICAL_CONTAINER.get());
        basicPartChemistryItem(DCItems.SIMPLE_CRYSTALLIZATION_SUBSTRATE_PLATE.get());
        basicPartChemistryItem(DCItems.SIMPLE_LIQUID_NEUTRALIZATION_PROCESSOR.get());
        basicPartChemistryItem(DCItems.SIMPLE_ORE_SORTING_FILTER.get());
        basicPartChemistryItem(DCItems.SIMPLE_TEMPERED_GLASS.get());


        basicPartEngineeringItem(DCItems.BASIC_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_CONDENSER.get());
        basicPartEngineeringItem(DCItems.BASIC_COMBINEDSHAFT.get());
        basicPartEngineeringItem(DCItems.BASIC_CONDUCTOR_WIRE.get());
        basicPartEngineeringItem(DCItems.BASIC_CONVEYORBELT.get());
        basicPartEngineeringItem(DCItems.BASIC_CYLINDER.get());
        basicPartEngineeringItem(DCItems.BASIC_DIODE.get());
        basicPartEngineeringItem(DCItems.BASIC_DRIVECHAIN.get());
        basicPartEngineeringItem(DCItems.BASIC_EQUIPMENT_CONTAINER.get());
        basicPartEngineeringItem(DCItems.BASIC_FIXED_FRAME.get());
        basicPartEngineeringItem(DCItems.BASIC_INSCRIBE_NEEDLE.get());
        basicPartEngineeringItem(DCItems.BASIC_INSCRIBED_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_LINKAGE.get());
        basicPartEngineeringItem(DCItems.BASIC_MACHINE_SCREEN.get());
        basicPartEngineeringItem(DCItems.BASIC_MOTOR.get());
        basicPartEngineeringItem(DCItems.BASIC_PIPE_BUNDLE.get());
        basicPartEngineeringItem(DCItems.BASIC_PROCESSING_BASE.get());
        basicPartEngineeringItem(DCItems.BASIC_REDSTONE_BATTERY.get());
        basicPartEngineeringItem(DCItems.BASIC_REINFORCED_PLATE.get());
        basicPartEngineeringItem(DCItems.BASIC_ROBOT_ARM.get());
        basicPartEngineeringItem(DCItems.BASIC_TRANSISTOR.get());
        basicPartEngineeringItem(DCItems.BASIC_TURBINE.get());

        basicPartEngineeringItem(DCItems.BASIC_ASTRONOMY_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_BIOLOGY_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_CHEMISTRY_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_DYNAMIC_ENERGETICS_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_ENGINEERING_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_FORMAL_SCIENCE_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_GEO_SCIENCE_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_HYBRID_PHYSICS_CIRCUIT.get());
        basicPartEngineeringItem(DCItems.BASIC_IMITATION_MAGIC_ENGINEERING_CIRCUIT.get());

        basicPartFormalScienceItem(DCItems.SIMPLE_ASTRONOMY_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_BIOLOGY_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_CHEMISTRY_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_DYNAMIC_ENERGETICS_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_ENGINEERING_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_FORMAL_SCIENCE_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_GEO_SCIENCE_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_HYBRID_PHYSICS_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_IMITATION_MAGIC_ENGINEERING_MEMORY_CIRCUIT.get());
        basicPartFormalScienceItem(DCItems.SIMPLE_PROCESSING_CIRCUIT.get());




        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_THUNDER_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_WIND_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_WATER_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_NIL_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_DARK_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_ICE_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_EARTH_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_FIRE_CRYSTAL.get());
        basicPartImitationMagicEngineeringItem(DCItems.SIMPLE_PSEUDO_MAGIC_LIGHT_CRYSTAL.get());




        simpleItem(DCItems.RAW_GRAVITATION_ORE.get());


        withExistingParent(DCBlocks.REINFORCED_PLANKS.getId().getPath(),
                modLoc("block/reinforced_planks"));
        withExistingParent(DCBlocks.OVERWORLD_CASSITERITE_ORE.getId().getPath(),
                modLoc("block/overworld_cassiterite_ore_block"));
        withExistingParent(DCBlocks.DEEPSLATE_CASSITERITE_ORE.getId().getPath(),
                modLoc("block/deepslate_cassiterite_ore_block"));
        withExistingParent(DCBlocks.NETHER_CASSITERITE_ORE.getId().getPath(),
                modLoc("block/nether_cassiterite_ore_block"));
        withExistingParent(DCBlocks.END_CASSITERITE_ORE.getId().getPath(),
                modLoc("block/end_cassiterite_ore_block"));


        withExistingParent(DCBlocks.OVERWORLD_GRAVITATION_ORE.getId().getPath(),
                modLoc("block/overworld_gravitation_ore_block"));




        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_astronomy_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_biology_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_chemistry_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_engineering_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_formal_science_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_geo_science_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_JENITH_VOID_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_jenith_void_science_multiblock_material_storage_holo_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_base_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_structure_glass_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_structure_glass_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_energy_storage_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_material_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_kaleidoscopic_reality_science_multiblock_material_storage_holo_block"));



        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_astronomical_telescope_block"));
        withExistingParent(DCBlocks.BASIC_PRECISION_OBJECTIVE_LENS_BLOCK.getId().getPath(),
                modLoc("block/basic_precision_objective_lens_block"));
        withExistingParent(DCBlocks.BASIC_PRECISION_OBJECTIVE_LENS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_precision_objective_lens_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_astronomical_telescope_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_astronomical_telescope_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_astronomical_telescope_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_astronomical_telescope_port_holo_block"));
        basicMachineCircuitAstronomyItem(DCItems.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_fine_particle_adsorber_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_FINE_PARTICLE_STORAGE_TANK_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_particle_storage_tank_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_FINE_PARTICLE_STORAGE_TANK_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_particle_storage_tank_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_fine_particle_adsorber_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_fine_particle_adsorber_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_fine_particle_adsorber_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_fine_particle_adsorber_port_holo_block"));
        basicMachineCircuitAstronomyItem(DCItems.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_starlight_collector_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_FAINT_LIGHT_RESERVER_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_faint_light_receiver_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_FAINT_LIGHT_RESERVER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_faint_light_receiver_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_starlight_collector_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_starlight_collector_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_starlight_collector_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_starlight_collector_port_holo_block"));
        basicMachineCircuitAstronomyItem(DCItems.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_CIRCUIT.get());



        withExistingParent(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_bio_reactor_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_CULTIVATION_GREENHOUSE_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_cultivation_greenhouse_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_CULTIVATION_GREENHOUSE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_cultivation_greenhouse_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_bio_reactor_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_bio_reactor_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_bio_reactor_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_bio_reactor_port_holo_block"));
        basicMachineCircuitBiologyItem(DCItems.BASIC_PERFORMANCE_BIO_REACTOR_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_cell_incubator_block"));
        withExistingParent(DCBlocks.BASIC_DURABILITY_INCUBATION_CONTAINER_BLOCK.getId().getPath(),
                modLoc("block/basic_durability_incubation_container_block"));
        withExistingParent(DCBlocks.BASIC_DURABILITY_INCUBATION_CONTAINER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_durability_incubation_container_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_cell_incubator_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_cell_incubator_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_cell_incubator_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_cell_incubator_port_holo_block"));
        basicMachineCircuitBiologyItem(DCItems.BASIC_PERFORMANCE_CELL_INCUBATOR_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_crop_cultivator_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_GROWTH_STABILIZER_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_growth_stabilizer_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_GROWTH_STABILIZER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_growth_stabilizer_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_crop_cultivator_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_crop_cultivator_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_crop_cultivator_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_crop_cultivator_port_holo_block"));
        basicMachineCircuitBiologyItem(DCItems.BASIC_PERFORMANCE_CROP_CULTIVATOR_CIRCUIT.get());
        
        

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_chemical_reactor_block"));
        withExistingParent(DCBlocks.BASIC_RATE_COMPOUND_AGITATION_SYSTEM_BLOCK.getId().getPath(),
                modLoc("block/basic_rate_compound_agitation_system_block"));
        withExistingParent(DCBlocks.BASIC_RATE_COMPOUND_AGITATION_SYSTEM_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_rate_compound_agitation_system_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_chemical_reactor_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_chemical_reactor_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_chemical_reactor_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_chemical_reactor_port_holo_block"));
        basicMachineCircuitChemistryItem(DCItems.BASIC_PERFORMANCE_CHEMICAL_REACTOR_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_compound_purifier_block"));
        withExistingParent(DCBlocks.BASIC_DURABLE_HIGH_SPPED_CHEMICAL_REACTOR_BLOCK.getId().getPath(),
                modLoc("block/basic_durable_high_speed_chemical_reactor_block"));
        withExistingParent(DCBlocks.BASIC_DURABLE_HIGH_SPPED_CHEMICAL_REACTOR_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_durable_high_speed_chemical_reactor_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_compound_purifier_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_compound_purifier_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_compound_purifier_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_compound_purifier_port_holo_block"));
        basicMachineCircuitChemistryItem(DCItems.BASIC_PERFORMANCE_COMPOUND_PURIFIER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electrolyser_block"));
        withExistingParent(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_BLOCK.getId().getPath(),
                modLoc("block/basic_durable_expanded_electrolytic_cell_block"));
        withExistingParent(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_durable_expanded_electrolytic_cell_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electrolyser_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electrolyser_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electrolyser_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electrolyser_port_holo_block"));
        basicMachineCircuitChemistryItem(DCItems.BASIC_PERFORMANCE_ELECTROLYSER_CIRCUIT.get());




        withExistingParent(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.getId().getPath(),
                modLoc("block/redstone_powered_machine_element_manufacture_machine_block"));
        withExistingParent(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.getId().getPath(),
                modLoc("block/redstone_powered_machine_part_manufacture_machine_block"));


//        withExistingParent(DCBlocks.LOW_STERNGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
//                modLoc("block/low_strength_multiblock_machine_frame_block"));
//        withExistingParent(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.getId().getPath(),
//                modLoc("block/low_strength_multiblock_structure_frame_block"));
//        withExistingParent(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.getId().getPath(),
//                modLoc("block/low_strength_multiblock_structure_glass_block"));
//
//        withExistingParent(DCBlocks.TEST.getId().getPath(),
//                modLoc("block/test"));
//
        withExistingParent(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.getId().getPath(),
                modLoc("block/basic_power_steam_generator_block"));
        withExistingParent(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.getId().getPath(),
                modLoc("block/basic_endurance_high_temperature_combustion_chamber_block"));
        withExistingParent(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        withExistingParent(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_power_steam_generator_bus_block"));
        withExistingParent(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_power_steam_generator_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_power_steam_generator_port_block"));
        withExistingParent(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_power_steam_generator_port_holo_block"));
        basicMachineCircuitDynamicEnergeticsItem(DCItems.BASIC_POWER_STEAM_GENERATOR_CIRCUIT.get());
        
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_compression_condenser_block"));
        withExistingParent(DCBlocks.BASIC_PRESSURE_COMPRESSION_ASSIST_SYSTEM_BLOCK.getId().getPath(),
                modLoc("block/basic_pressure_compression_assist_system_block"));
        withExistingParent(DCBlocks.BASIC_PRESSURE_COMPRESSION_ASSIST_SYSTEM_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_pressure_compression_assist_system_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_compression_condenser_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_compression_condenser_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_compression_condenser_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_compression_condenser_port_holo_block"));
        basicMachineCircuitDynamicEnergeticsItem(DCItems.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_CIRCUIT.get());
       
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_electromagnetic_inductor_block"));
        withExistingParent(DCBlocks.BASIC_DURABLE_INSULATED_CHAMBER_BLOCK.getId().getPath(),
                modLoc("block/basic_durable_insulated_chamber_block"));
        withExistingParent(DCBlocks.BASIC_DURABLE_INSULATED_CHAMBER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_durable_insulated_chamber_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_electromagnetic_inductor_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_electromagnetic_inductor_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_electromagnetic_inductor_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_electromagnetic_inductor_port_holo_block"));
        basicMachineCircuitDynamicEnergeticsItem(DCItems.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_CIRCUIT.get());





        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_manufacturer_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_machine_processing_chamber_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_machine_processing_chamber_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_manufacturer_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_manufacturer_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_manufacturer_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_manufacturer_port_holo_block"));
        basicMachineCircuitEngineeringItem(DCItems.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_universal_assembler_block"));
        withExistingParent(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK.getId().getPath(),
                modLoc("block/basic_operation_assembling_chamber_block"));
        withExistingParent(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_operation_assembling_chamber_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_universal_assembler_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_universal_assembler_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_universal_assembler_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_universal_assembler_port_holo_block"));
        basicMachineCircuitEngineeringItem(DCItems.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_CIRCUIT.get());
        
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_element_processor_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_machine_element_processing_chamber_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_machine_element_processing_chamber_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_element_processor_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_element_processor_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_element_processor_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_element_processor_port_holo_block"));
        basicMachineCircuitEngineeringItem(DCItems.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_part_processor_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_machine_part_processing_chamber_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_machine_part_processing_chamber_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_part_processor_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_part_processor_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_part_processor_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_machine_part_processor_port_holo_block"));
        basicMachineCircuitEngineeringItem(DCItems.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_multiblock_equipment_fabricator_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_EQUIPMENT_PRODUCTION_AUXILIARY_SYSTEM_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_equipment_production_auxiliary_system_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_EQUIPMENT_PRODUCTION_AUXILIARY_SYSTEM_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_multiblock_equipment_fabricator_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_multiblock_equipment_fabricator_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_multiblock_equipment_fabricator_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        basicMachineCircuitEngineeringItem(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_CIRCUIT.get());



        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_circuit_builder_block"));
        withExistingParent(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_BLOCK.getId().getPath(),
                modLoc("block/basic_purity_circuit_clean_room_block"));
        withExistingParent(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_purity_circuit_clean_room_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_circuit_builder_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_circuit_builder_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_circuit_builder_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_circuit_builder_port_holo_block"));
        basicMachineCircuitFormalScienceItem(DCItems.BASIC_PERFORMANCE_CIRCUIT_BUILDER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_machine_data_installer_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_DATA_READER_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_data_reader_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_DATA_READER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_data_reader_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_machine_data_installer_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_machine_data_installer_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_machine_data_installer_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_machine_data_installer_port_holo_block"));
        basicMachineCircuitFormalScienceItem(DCItems.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_designated_data_injector_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_CALCULATION_AUXILIARY_WRITE_DEVICE_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_calculation_auxiliary_write_device_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_CALCULATION_AUXILIARY_WRITE_DEVICE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_calculation_auxiliary_write_device_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_designated_data_injector_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_designated_data_injector_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_designated_data_injector_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_designated_data_injector_port_holo_block"));
        basicMachineCircuitFormalScienceItem(DCItems.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_CIRCUIT.get());


        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_ore_sorter_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_ORE_SORTING_FILTER_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_ore_sorting_filter_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_ORE_SORTING_FILTER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_ore_sorting_filter_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_ore_sorter_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_ore_sorter_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_ore_sorter_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_ore_sorter_port_holo_block"));
        basicMachineCircuitGeoScienceItem(DCItems.BASIC_PERFORMANCE_ORE_SORTER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_rock_crasher_block"));
        withExistingParent(DCBlocks.BASIC_CRASHING_BASE_BLOCK.getId().getPath(),
                modLoc("block/basic_crashing_base_block"));
        withExistingParent(DCBlocks.BASIC_CRASHING_BASE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_crashing_base_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_rock_crasher_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_rock_crasher_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_rock_crasher_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_rock_crasher_port_holo_block"));
        basicMachineCircuitGeoScienceItem(DCItems.BASIC_PERFORMANCE_ROCK_CRASHER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_soil_purifier_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_PARTICLE_MIXING_CHAMBER_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_particle_mixing_chamber_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_PARTICLE_MIXING_CHAMBER_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_particle_mixing_chamber_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_soil_purifier_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_soil_purifier_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_soil_purifier_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_soil_purifier_port_holo_block"));
        basicMachineCircuitGeoScienceItem(DCItems.BASIC_PERFORMANCE_SOIL_PURIFIER_CIRCUIT.get());



        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electric_arc_furnace_block"));
        withExistingParent(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_BLOCK.getId().getPath(),
                modLoc("block/basic_flow_cooling_system_block"));
        withExistingParent(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_flow_cooling_system_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electric_arc_furnace_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electric_arc_furnace_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electric_arc_furnace_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_electric_arc_furnace_port_holo_block"));
        basicMachineCircuitHybridPhysicsItem(DCItems.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_forming_machine_block"));
        withExistingParent(DCBlocks.BASIC_PRECISION_EXTRUSION_ASSIST_SYSTEM_BLOCK.getId().getPath(),
                modLoc("block/basic_precision_extrusion_assist_system_block"));
        withExistingParent(DCBlocks.BASIC_PRECISION_EXTRUSION_ASSIST_SYSTEM_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_precision_extrusion_assist_system_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_forming_machine_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_forming_machine_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_forming_machine_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_forming_machine_port_holo_block"));
        basicMachineCircuitHybridPhysicsItem(DCItems.BASIC_PERFORMANCE_FORMING_MACHINE_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_material_separator_block"));
        withExistingParent(DCBlocks.BASIC_DURABILITY_VIBRATION_CONTROL_BASE_BLOCK.getId().getPath(),
                modLoc("block/basic_durability_vibration_control_base_block"));
        withExistingParent(DCBlocks.BASIC_DURABILITY_VIBRATION_CONTROL_BASE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_durability_vibration_control_base_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_material_separator_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_material_separator_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_material_separator_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_material_separator_port_holo_block"));
        basicMachineCircuitHybridPhysicsItem(DCItems.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_CIRCUIT.get());


        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_imitation_magic_engraver_block"));
        withExistingParent(DCBlocks.BASIC_OUTPUT_MYSTIC_OPTICAL_PROJECTION_DEVICE_BLOCK.getId().getPath(),
                modLoc("block/basic_output_mystic_optical_projection_device_block"));
        withExistingParent(DCBlocks.BASIC_OUTPUT_MYSTIC_OPTICAL_PROJECTION_DEVICE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_output_mystic_optical_projection_device_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_imitation_magic_engraver_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_imitation_magic_engraver_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_imitation_magic_engraver_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_imitation_magic_engraver_port_holo_block"));
        basicMachineCircuitImitationEngineeringItem(DCItems.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_CIRCUIT.get());


        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_suspected_magic_condenser_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_SEALED_EXTRACTION_CASE_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_sealed_extraction_case_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_SEALED_EXTRACTION_CASE_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_sealed_extraction_case_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_suspected_magic_condenser_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_suspected_magic_condenser_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_suspected_magic_condenser_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_suspected_magic_condenser_port_holo_block"));
        basicMachineCircuitImitationEngineeringItem(DCItems.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_CIRCUIT.get());

        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_virtual_sigil_processor_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_PATTERN_TRANSFER_SYSTEM_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_pattern_transfer_system_block"));
        withExistingParent(DCBlocks.BASIC_SPEED_PATTERN_TRANSFER_SYSTEM_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_speed_pattern_transfer_system_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_virtual_sigil_processor_bus_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_virtual_sigil_processor_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_virtual_sigil_processor_port_block"));
        withExistingParent(DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_technology_virtual_sigil_processor_port_holo_block"));
        basicMachineCircuitImitationEngineeringItem(DCItems.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_CIRCUIT.get());




        withExistingParent(DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_reality_phase_adjustment_machine_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_PHASE_STABLE_FLAME_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_phase_stable_frame_block"));
        withExistingParent(DCBlocks.BASIC_EFFICIENCY_PHASE_STABLE_FLAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_efficiency_phase_stable_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_BUS_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_reality_phase_adjustment_machine_bus_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_BUS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_reality_phase_adjustment_machine_bus_holo_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_PORT_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_reality_phase_adjustment_machine_port_block"));
        withExistingParent(DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_PORT_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_performance_reality_phase_adjustment_machine_port_holo_block"));
        basicMachineCircuitKaleidoscopicRealityScienceItem(DCItems.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_CIRCUIT.get());


//        withExistingParent(DCBlocks.OVERWORLD_CASSITERITE_ORE.getId().getPath(),
//                modLoc("block/overworld_cassiterite_ore"));
//        withExistingParent(DCBlocks.DEEPSLATE_CASSITERITE_ORE.getId().getPath(),
//                modLoc("block/deepslate_cassiterite_ore"));
//        withExistingParent(DCBlocks.NETHER_CASSITERITE_ORE.getId().getPath(),
//                modLoc("block/nether_cassiterite_ore"));
//        withExistingParent(DCBlocks.END_CASSITERITE_ORE.getId().getPath(),
//                modLoc("block/end_cassiterite_ore"));


//        withExistingParent(DCBlocks.UNIVERSAL_ASSEMBLER_PHASE1_BLOCK.getId().getPath(),
//                modLoc("block/universal_assembler_phase1"));
//        withExistingParent(DCBlocks.UNIVERSAL_ASSEMBLER_PHASE2_BLOCK.getId().getPath(),
//                modLoc("block/universal_assembler_phase2"));
//        withExistingParent(DCBlocks.UNIVERSAL_ASSEMBLER_PHASE9_BLOCK.getId().getPath(),
//                modLoc("block/universal_assembler_phase9"));


//        withExistingParent(DCBlocks.TEST_BLOCK.getId().getPath(),
//                modLoc("block/test_pipe"));
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder dataChipItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/data_chip/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder dataStorageAstronomyItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/data_storage/astronomy/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder deviceItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/device/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder iconItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/icon/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder ingotMaterialItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/ingot/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialBauxiteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/bauxite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialBerylItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/beryl/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialBoraxItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/borax/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialCassiteriteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/cassiterite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialChromiteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/chromite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialCobaliteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/cobalite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialDolomiteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/dolomite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialFluoriteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/fluorite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialGraphiteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/graphite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialLateriteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/laterite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialLimestoneItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/limestone/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialNitratineItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/nitratine/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialPentlanditeItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/pentlandite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialPhosphoriteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/phosphorite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialPyrolusiteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/pyrolusite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialQuartzItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/quartz/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialRutileItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/rutile/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialSpodumeneItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/spodumene/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialSylviteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/sylvite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialUlexiteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/ulexite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder oreMaterialVanadiniteItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/vanadinite/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementChlorineMaterialItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/element/chlorine/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementHydrogenMaterialItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/element/hydrogen/" + item.getRegistryName().getPath()));
    }


    private ItemModelBuilder elementSiliconMaterialItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/element/silicon/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementTinMaterialItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/element/tin/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementCopperItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/element/copper/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementGoldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/element/gold/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementIronItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/element/iron/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementTinItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/element/tin/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder substanceItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/substance/" + item.getRegistryName().getPath()));
    }


    private ItemModelBuilder basicPartAstronomyItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/astronomy/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicPartBiologyItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/biology/" + item.getRegistryName().getPath()));
    }


    private ItemModelBuilder basicPartChemistryItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/chemistry/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicPartEngineeringItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/engineering/" + item.getRegistryName().getPath()));
    }
    
    private ItemModelBuilder basicPartFormalScienceItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/" + item.getRegistryName().getPath()));
    }




    private ItemModelBuilder basicPartImitationMagicEngineeringItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/imitation_magic_engineering/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicInscribedCircuitItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/inscribed_circuit/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicMaterialAstronomyItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/basic/astronomy/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicMaterialChemistryItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/basic/chemistry/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicMaterialCommonItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/basic/common/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicMaterialHybridPhysicsItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/basic/hybrid_physics/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicMachineCircuitAstronomyItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/astronomy/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicMachineCircuitBiologyItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/biology/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder basicMachineCircuitChemistryItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/chemistry/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder basicMachineCircuitDynamicEnergeticsItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/dynamic_energetics/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder basicMachineCircuitEngineeringItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/engineering/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder basicMachineCircuitFormalScienceItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/formal_science/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder basicMachineCircuitGeoScienceItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/geo_science/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder basicMachineCircuitHybridPhysicsItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/hybrid_physics/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder basicMachineCircuitImitationEngineeringItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/imitation_magic_engineering/" + item.getRegistryName().getPath()));
    }



    private ItemModelBuilder basicMachineCircuitKaleidoscopicRealityScienceItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/formal_science/machine_circuit/kaleidoscopic_reality_science/" + item.getRegistryName().getPath()));
    }


    private ItemModelBuilder recipe_tooltip_item(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/" + "recipe_tooltip"));
    }

    private ItemModelBuilder phaseItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID,"item/"+"ipp_tooltip"));
    }

    private ItemModelBuilder requiredenergyItem(Item item){
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID,"item/"+"required_energy_tooltip"));
    }

    private ItemModelBuilder requiredenergyusageItem(Item item){
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID,"item/"+"required_energy_usage_tooltip"));
    }


    private ItemModelBuilder timeItem(Item item){
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID,"item/"+"time_tooltip"));
    }

    private ItemModelBuilder handheldItem(Item item){
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID,"item/"+item.getRegistryName().getPath()));
    }
}

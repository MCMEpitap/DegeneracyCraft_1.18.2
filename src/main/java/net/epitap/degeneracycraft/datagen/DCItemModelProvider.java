package net.epitap.degeneracycraft.datagen;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.item.DCAdvancementIcon;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.transport.port.blocks.PortBlocks;
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
        iconItem(DCAdvancementIcon.DYNAMIC_PHYSICS_ICON.get());
        iconItem(DCAdvancementIcon.ENGINEERING_ICON.get());
        iconItem(DCAdvancementIcon.FAUX_MAGIC_ENGINEERING_ICON.get());
        iconItem(DCAdvancementIcon.GEO_SCIENCE_ICON.get());


        simpleItem(DCItems.GRAVITATION_INGOT.get());
        //
        rawOreMaterialItem(DCItems.RAW_BAUXITE_ORE.get());
        rawOreMaterialItem(DCItems.RAW_BERYL_ORE.get());
        rawOreMaterialItem(DCItems.RAW_BORAX_ORE.get());
        rawOreMaterialItem(DCItems.RAW_CASSITERITE_ORE.get());
        rawOreMaterialItem(DCItems.RAW_CHROMITE_ORE.get());
        rawOreMaterialItem(DCItems.RAW_GRAPHITE_ORE.get());
        rawOreMaterialItem(DCItems.RAW_LATERITE_ORE.get());


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
        oreMaterialBauxiteItem(DCItems.BAUXITE_INGOT.get());
        //
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
        oreMaterialBerylItem(DCItems.BERYL_INGOT.get());
        //
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
        oreMaterialBoraxItem(DCItems.BORAX_INGOT.get());
        //
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
        oreMaterialCassiteriteItem(DCItems.CASSITERITE_INGOT.get());
        //
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
        oreMaterialChromiteItem(DCItems.CHROMITE_INGOT.get());
        //
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
        oreMaterialFluoriteItem(DCItems.FLUORITE_INGOT.get());
        //
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
        oreMaterialGraphiteItem(DCItems.GRAPHITE_INGOT.get());
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
        oreMaterialLateriteItem(DCItems.LATERITE_INGOT.get());
        //
        simpleItem(DCItems.RAW_LIMESTONE_ORE.get());
        simpleItem(DCItems.LIMESTONE_DUST.get());
        simpleItem(DCItems.LIMESTONE_PUREDUST.get());
        simpleItem(DCItems.LIMESTONE_LEACHATE.get());
        simpleItem(DCItems.LIMESTONE_CONCENTRATE.get());
        simpleItem(DCItems.LIMESTONE_PLASMA.get());
        simpleItem(DCItems.LIMESTONE_DEGENERATEMATTER.get());
        simpleItem(DCItems.LIMESTONE_SOUP.get());
        simpleItem(DCItems.LIMESTONE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_LIMESTONE_IMAGINARYMATTER.get());
        simpleItem(DCItems.LIMESTONE_TACHYON.get());
        simpleItem(DCItems.LIMESTONE_ANTIMATTER.get());
        simpleItem(DCItems.LIMESTONE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.LIMESTONE_OVERFLUID.get());
        simpleItem(DCItems.LIMESTONE_CRYSTAL.get());
        simpleItem(DCItems.LIMESTONE_PRECIPITATE.get());
        simpleItem(DCItems.LIMESTONE_WASHEDDUST.get());
        simpleItem(DCItems.LIMESTONE_ORESINTER.get());
        simpleItem(DCItems.LIMESTONE_INGOT.get());
        //
        simpleItem(DCItems.RAW_PEGMATITE_ORE.get());
        simpleItem(DCItems.PEGMATITE_DUST.get());
        simpleItem(DCItems.PEGMATITE_PUREDUST.get());
        simpleItem(DCItems.PEGMATITE_LEACHATE.get());
        simpleItem(DCItems.PEGMATITE_CONCENTRATE.get());
        simpleItem(DCItems.PEGMATITE_PLASMA.get());
        simpleItem(DCItems.PEGMATITE_DEGENERATEMATTER.get());
        simpleItem(DCItems.PEGMATITE_SOUP.get());
        simpleItem(DCItems.PEGMATITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_PEGMATITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.PEGMATITE_TACHYON.get());
        simpleItem(DCItems.PEGMATITE_ANTIMATTER.get());
        simpleItem(DCItems.PEGMATITE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.PEGMATITE_OVERFLUID.get());
        simpleItem(DCItems.PEGMATITE_CRYSTAL.get());
        simpleItem(DCItems.PEGMATITE_PRECIPITATE.get());
        simpleItem(DCItems.PEGMATITE_WASHEDDUST.get());
        simpleItem(DCItems.PEGMATITE_ORESINTER.get());
        simpleItem(DCItems.PEGMATITE_INGOT.get());
        //
        simpleItem(DCItems.RAW_PHOSPHORITE_ORE.get());
        simpleItem(DCItems.PHOSPHORITE_DUST.get());
        simpleItem(DCItems.PHOSPHORITE_PUREDUST.get());
        simpleItem(DCItems.PHOSPHORITE_LEACHATE.get());
        simpleItem(DCItems.PHOSPHORITE_CONCENTRATE.get());
        simpleItem(DCItems.PHOSPHORITE_PLASMA.get());
        simpleItem(DCItems.PHOSPHORITE_DEGENERATEMATTER.get());
        simpleItem(DCItems.PHOSPHORITE_SOUP.get());
        simpleItem(DCItems.PHOSPHORITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_PHOSPHORITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.PHOSPHORITE_TACHYON.get());
        simpleItem(DCItems.PHOSPHORITE_ANTIMATTER.get());
        simpleItem(DCItems.PHOSPHORITE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.PHOSPHORITE_OVERFLUID.get());
        simpleItem(DCItems.PHOSPHORITE_CRYSTAL.get());
        simpleItem(DCItems.PHOSPHORITE_PRECIPITATE.get());
        simpleItem(DCItems.PHOSPHORITE_WASHEDDUST.get());
        simpleItem(DCItems.PHOSPHORITE_ORESINTER.get());
        simpleItem(DCItems.PHOSPHORITE_INGOT.get());
        //
        simpleItem(DCItems.RAW_PYROLUSITE_ORE.get());
        simpleItem(DCItems.PYROLUSITE_DUST.get());
        simpleItem(DCItems.PYROLUSITE_PUREDUST.get());
        simpleItem(DCItems.PYROLUSITE_LEACHATE.get());
        simpleItem(DCItems.PYROLUSITE_CONCENTRATE.get());
        simpleItem(DCItems.PYROLUSITE_PLASMA.get());
        simpleItem(DCItems.PYROLUSITE_DEGENERATEMATTER.get());
        simpleItem(DCItems.PYROLUSITE_SOUP.get());
        simpleItem(DCItems.PYROLUSITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_PYROLUSITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.PYROLUSITE_TACHYON.get());
        simpleItem(DCItems.PYROLUSITE_ANTIMATTER.get());
        simpleItem(DCItems.PYROLUSITE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.PYROLUSITE_OVERFLUID.get());
        simpleItem(DCItems.PYROLUSITE_CRYSTAL.get());
        simpleItem(DCItems.PYROLUSITE_PRECIPITATE.get());
        simpleItem(DCItems.PYROLUSITE_WASHEDDUST.get());
        simpleItem(DCItems.PYROLUSITE_ORESINTER.get());
        simpleItem(DCItems.PYROLUSITE_INGOT.get());
        //
        simpleItem(DCItems.RAW_RUTILE_ORE.get());
        simpleItem(DCItems.RUTILE_DUST.get());
        simpleItem(DCItems.RUTILE_PUREDUST.get());
        simpleItem(DCItems.RUTILE_LEACHATE.get());
        simpleItem(DCItems.RUTILE_CONCENTRATE.get());
        simpleItem(DCItems.RUTILE_PLASMA.get());
        simpleItem(DCItems.RUTILE_DEGENERATEMATTER.get());
        simpleItem(DCItems.RUTILE_SOUP.get());
        simpleItem(DCItems.RUTILE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_RUTILE_IMAGINARYMATTER.get());
        simpleItem(DCItems.RUTILE_TACHYON.get());
        simpleItem(DCItems.RUTILE_ANTIMATTER.get());
        simpleItem(DCItems.RUTILE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.RUTILE_OVERFLUID.get());
        simpleItem(DCItems.RUTILE_CRYSTAL.get());
        simpleItem(DCItems.RUTILE_PRECIPITATE.get());
        simpleItem(DCItems.RUTILE_WASHEDDUST.get());
        simpleItem(DCItems.RUTILE_ORESINTER.get());
        simpleItem(DCItems.RUTILE_INGOT.get());
        //
        simpleItem(DCItems.RAW_SPODUMENE_ORE.get());
        simpleItem(DCItems.SPODUMENE_DUST.get());
        simpleItem(DCItems.SPODUMENE_PUREDUST.get());
        simpleItem(DCItems.SPODUMENE_LEACHATE.get());
        simpleItem(DCItems.SPODUMENE_CONCENTRATE.get());
        simpleItem(DCItems.SPODUMENE_PLASMA.get());
        simpleItem(DCItems.SPODUMENE_DEGENERATEMATTER.get());
        simpleItem(DCItems.SPODUMENE_SOUP.get());
        simpleItem(DCItems.SPODUMENE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_SPODUMENE_IMAGINARYMATTER.get());
        simpleItem(DCItems.SPODUMENE_TACHYON.get());
        simpleItem(DCItems.SPODUMENE_ANTIMATTER.get());
        simpleItem(DCItems.SPODUMENE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.SPODUMENE_OVERFLUID.get());
        simpleItem(DCItems.SPODUMENE_CRYSTAL.get());
        simpleItem(DCItems.SPODUMENE_PRECIPITATE.get());
        simpleItem(DCItems.SPODUMENE_WASHEDDUST.get());
        simpleItem(DCItems.SPODUMENE_ORESINTER.get());
        simpleItem(DCItems.SPODUMENE_INGOT.get());
        //
        simpleItem(DCItems.RAW_SYLVITE_ORE.get());
        simpleItem(DCItems.SYLVITE_DUST.get());
        simpleItem(DCItems.SYLVITE_PUREDUST.get());
        simpleItem(DCItems.SYLVITE_LEACHATE.get());
        simpleItem(DCItems.SYLVITE_CONCENTRATE.get());
        simpleItem(DCItems.SYLVITE_PLASMA.get());
        simpleItem(DCItems.SYLVITE_DEGENERATEMATTER.get());
        simpleItem(DCItems.SYLVITE_SOUP.get());
        simpleItem(DCItems.SYLVITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_SYLVITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.SYLVITE_TACHYON.get());
        simpleItem(DCItems.SYLVITE_ANTIMATTER.get());
        simpleItem(DCItems.SYLVITE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.SYLVITE_OVERFLUID.get());
        simpleItem(DCItems.SYLVITE_CRYSTAL.get());
        simpleItem(DCItems.SYLVITE_PRECIPITATE.get());
        simpleItem(DCItems.SYLVITE_WASHEDDUST.get());
        simpleItem(DCItems.SYLVITE_ORESINTER.get());
        simpleItem(DCItems.SYLVITE_INGOT.get());
        //
        simpleItem(DCItems.RAW_ULEXITE_ORE.get());
        simpleItem(DCItems.ULEXITE_DUST.get());
        simpleItem(DCItems.ULEXITE_PUREDUST.get());
        simpleItem(DCItems.ULEXITE_LEACHATE.get());
        simpleItem(DCItems.ULEXITE_CONCENTRATE.get());
        simpleItem(DCItems.ULEXITE_PLASMA.get());
        simpleItem(DCItems.ULEXITE_DEGENERATEMATTER.get());
        simpleItem(DCItems.ULEXITE_SOUP.get());
        simpleItem(DCItems.ULEXITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_ULEXITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.ULEXITE_TACHYON.get());
        simpleItem(DCItems.ULEXITE_ANTIMATTER.get());
        simpleItem(DCItems.ULEXITE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.ULEXITE_OVERFLUID.get());
        simpleItem(DCItems.ULEXITE_CRYSTAL.get());
        simpleItem(DCItems.ULEXITE_PRECIPITATE.get());
        simpleItem(DCItems.ULEXITE_WASHEDDUST.get());
        simpleItem(DCItems.ULEXITE_ORESINTER.get());
        simpleItem(DCItems.ULEXITE_INGOT.get());
        //
        simpleItem(DCItems.RAW_VANADINITE_ORE.get());
        simpleItem(DCItems.VANADINITE_DUST.get());
        simpleItem(DCItems.VANADINITE_PUREDUST.get());
        simpleItem(DCItems.VANADINITE_LEACHATE.get());
        simpleItem(DCItems.VANADINITE_CONCENTRATE.get());
        simpleItem(DCItems.VANADINITE_PLASMA.get());
        simpleItem(DCItems.VANADINITE_DEGENERATEMATTER.get());
        simpleItem(DCItems.VANADINITE_SOUP.get());
        simpleItem(DCItems.VANADINITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.STABLE_VANADINITE_IMAGINARYMATTER.get());
        simpleItem(DCItems.VANADINITE_TACHYON.get());
        simpleItem(DCItems.VANADINITE_ANTIMATTER.get());
        simpleItem(DCItems.VANADINITE_ULTRAHOTPLASMA.get());
        simpleItem(DCItems.VANADINITE_OVERFLUID.get());
        simpleItem(DCItems.VANADINITE_CRYSTAL.get());
        simpleItem(DCItems.VANADINITE_PRECIPITATE.get());
        simpleItem(DCItems.VANADINITE_WASHEDDUST.get());
        simpleItem(DCItems.VANADINITE_ORESINTER.get());
        simpleItem(DCItems.VANADINITE_INGOT.get());
        //
        elementCopperItem(DCItems.COPPER_BOLT.get());
        elementCopperItem(DCItems.COPPER_KEY.get());
        elementCopperItem(DCItems.COPPER_ROD.get());
        elementCopperItem(DCItems.COPPER_SPRING.get());
        elementCopperItem(DCItems.COPPER_BEARING.get());
        elementCopperItem(DCItems.COPPER_PLATE.get());
        elementCopperItem(DCItems.COPPER_GEAR.get());
        elementCopperItem(DCItems.COPPER_JOINT.get());
        elementCopperItem(DCItems.COPPER_NUT.get());
        elementCopperItem(DCItems.COPPER_PIPE.get());
        elementCopperItem(DCItems.COPPER_PIPEJOINT.get());
        elementCopperItem(DCItems.COPPER_CAM.get());
        elementCopperItem(DCItems.COPPER_SHAFT.get());
        elementCopperItem(DCItems.COPPER_SHAFTCOUPLING.get());
        elementCopperItem(DCItems.COPPER_SHAPESTEEL.get());
        elementCopperItem(DCItems.COPPER_CHAIN.get());

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
        elementIronItem(DCItems.IRON_ROD.get());
        elementIronItem(DCItems.IRON_SHAFT.get());
        elementIronItem(DCItems.IRON_SHAFTCOUPLING.get());
        elementIronItem(DCItems.IRON_SHAPESTEEL.get());
        elementIronItem(DCItems.IRON_SPRING.get());

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

        simpleItem(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
        simpleItem(DCItems.MACHINE_HALT_DEVICE.get());

        basicMaterialCommonItem(DCItems.COMPRESSED_PLANKS.get());
        basicMaterialCommonItem(DCItems.COMPRESSED_REDSTONE.get());
        basicMaterialCommonItem(DCItems.SIMPLE_CONVEX_LENS.get());
        basicMaterialCommonItem(DCItems.SIMPLE_CONCAVE_LENS.get());

        basicPartItem(DCItems.BASIC_CIRCUIT.get());
        basicPartItem(DCItems.BASIC_INSCRIBED_CIRCUIT.get());
        basicPartItem(DCItems.BASIC_MACHINE_SCREEN.get());
        basicPartItem(DCItems.BASIC_MOTOR.get());
        basicPartItem(DCItems.BASIC_REDSTONE_BATTERY.get());
        basicPartItem(DCItems.BASIC_REINFORCED_PLATE.get());
        basicPartItem(DCItems.BASIC_TURBINE.get());


        simpleItem(DCItems.RAW_GRAVITATION_ORE.get());

        withExistingParent(DCBlocks.OVERWORLD_GRAVITATION_ORE.getId().getPath(),
                modLoc("block/overworld_gravitation_ore"));
        withExistingParent(DCBlocks.REINFORCED_PLANKS.getId().getPath(),
                modLoc("block/reinforced_planks"));

        withExistingParent(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.getId().getPath(),
                modLoc("block/redstone_powered_machine_element_manufacture_machine_block"));
        withExistingParent(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.getId().getPath(),
                modLoc("block/redstone_powered_machine_part_manufacture_machine_block"));

        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_base_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_structure_glass_block"));


        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_energy_storage_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_material_storage_block"));


        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_machine_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_structure_frame_holo_block"));
        withExistingParent(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.getId().getPath(),
                modLoc("block/basic_strength_multiblock_structure_glass_holo_block"));


//        withExistingParent(DCBlocks.LOW_STERNGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.getId().getPath(),
//                modLoc("block/low_strength_multiblock_machine_frame_block"));
        withExistingParent(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.getId().getPath(),
                modLoc("block/low_strength_multiblock_structure_frame_block"));
        withExistingParent(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.getId().getPath(),
                modLoc("block/low_strength_multiblock_structure_glass_block"));
//
//        withExistingParent(DCBlocks.TEST.getId().getPath(),
//                modLoc("block/test"));
//
        withExistingParent(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK.getId().getPath(),
                modLoc("block/basic_power_composite_structure_type_thermal_generator_block"));

        withExistingParent(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.getId().getPath(),
                modLoc("block/basic_machine_element_processor_block"));

        withExistingParent(PortBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.getRegistryName().getPath(),
                modLoc("block/basic_machine_element_processor_port_block"));

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
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder iconItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/icon/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder rawOreMaterialItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/multiplied_ore_material/raw_ore/" + item.getRegistryName().getPath()));
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


    private ItemModelBuilder elementCopperItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/element/copper/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder elementIronItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/element/iron/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicPartItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicInscribedCircuitItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/part/basic/inscribed_circuit/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder basicMaterialCommonItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Degeneracycraft.MOD_ID, "item/material/basic/common/" + item.getRegistryName().getPath()));
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

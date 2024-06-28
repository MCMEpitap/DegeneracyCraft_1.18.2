package net.epitap.degeneracycraft.datagen;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.base.DCUniqueBlocks;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class DCLanguageProviderEN extends LanguageProvider {
    public DCLanguageProviderEN(DataGenerator gen, String locale) {
        super(gen, Degeneracycraft.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + "degeneracycraft", "DegeneracyCraft");
//        add(MESSAGE_THERMAL_POWER_GENERATOR,"Thermal Power Generator generating %s RF per tick");
//        add(SCREEN_DEGENERACYCRAFT_THERMAL_POWER_GENERATOR,"Thermal Power Generator Screen");
//        add(DCBlocks.THERMAL_POWER_GENERATOR_BLOCK.get(), "Thermal Power Generator");
//        add(DCBlocks.OVERWORLD_CASSITERITE_ORE.get(), "Cassiterite Ore");
//        add(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get(), "Deepslate Cassiterite Ore");
//        add(DCBlocks.NETHER_CASSITERITE_ORE.get(), "Nether Cassiterite Ore");
//        add(DCBlocks.END_CASSITERITE_ORE.get(), "End Cassiterite Ore");
        //


        add(DCItems.RAW_BAUXITE_ORE.get(), "Bauxite Raw Chunk");
        add(DCItems.BAUXITE_DUST.get(),"Bauxite Dust");
        add(DCItems.BAUXITE_PUREDUST.get(),"Bauxite Pure Dust");
        add(DCItems.BAUXITE_LEACHATE.get(),"Bauxite Leachate");
        add(DCItems.BAUXITE_CONCENTRATE.get(),"Bauxite Concentrate");
        add(DCItems.BAUXITE_PLASMA.get(),"Bauxite Plasma");
        add(DCItems.BAUXITE_DEGENERATEMATTER.get(),"Bauxite Degenerate Matter");
        add(DCItems.BAUXITE_SOUP.get(),"Bauxite Soup");
        add(DCItems.BAUXITE_IMAGINARYMATTER.get(),"Bauxite Imaginary Matter");
        add(DCItems.STABLE_BAUXITE_IMAGINARYMATTER.get(),"Stable Bauxite Imaginary Matter");
        add(DCItems.BAUXITE_TACHYON.get(),"Bauxite Tachyon");
        add(DCItems.BAUXITE_ANTIMATTER.get(),"Bauxite Antimatter");
        add(DCItems.BAUXITE_ULTRAHOTPLASMA.get(), "Bauxite Ultrahot Plasma");
        add(DCItems.BAUXITE_OVERFLUID.get(), "Bauxite Over Fluid");
        add(DCItems.BAUXITE_CRYSTAL.get(), "Bauxite Crystal");
        add(DCItems.BAUXITE_PRECIPITATE.get(),"Bauxite Precipitate");
        add(DCItems.BAUXITE_WASHEDDUST.get(),"Bauxite Washed Dust");
        add(DCItems.BAUXITE_ORESINTER.get(),"Bauxite Oresinter");
        add(DCItems.BAUXITE_INGOT.get(), "Bauxite Ingot");
        //
        add(DCItems.RAW_BERYL_ORE.get(), "Beryl Raw Chunk");
        add(DCItems.BERYL_DUST.get(),"Beryl Dust");
        add(DCItems.BERYL_PUREDUST.get(),"Beryl Pure Dust");
        add(DCItems.BERYL_LEACHATE.get(),"Beryl Leachate");
        add(DCItems.BERYL_CONCENTRATE.get(),"Beryl Concentrate");
        add(DCItems.BERYL_PLASMA.get(),"Beryl Plasma");
        add(DCItems.BERYL_DEGENERATEMATTER.get(),"Beryl Degenerate Matter");
        add(DCItems.BERYL_SOUP.get(),"Beryl Soup");
        add(DCItems.BERYL_IMAGINARYMATTER.get(),"Beryl Imaginary Matter");
        add(DCItems.STABLE_BERYL_IMAGINARYMATTER.get(),"Stable Beryl Imaginary Matter");
        add(DCItems.BERYL_TACHYON.get(),"Beryl Tachyon");
        add(DCItems.BERYL_ANTIMATTER.get(),"Beryl Antimatter");
        add(DCItems.BERYL_ULTRAHOTPLASMA.get(), "Beryl Ultrahot Plasma");
        add(DCItems.BERYL_OVERFLUID.get(), "Beryl Over Fluid");
        add(DCItems.BERYL_CRYSTAL.get(), "Beryl Crystal");
        add(DCItems.BERYL_PRECIPITATE.get(),"Beryl Precipitate");
        add(DCItems.BERYL_WASHEDDUST.get(),"Beryl Washed Dust");
        add(DCItems.BERYL_ORESINTER.get(),"Beryl Oresinter");
        add(DCItems.BERYL_INGOT.get(), "Beryl Ingot");
        //
        add(DCItems.RAW_BORAX_ORE.get(), "Borax Raw Chunk");
        add(DCItems.BORAX_DUST.get(),"Borax Dust");
        add(DCItems.BORAX_PUREDUST.get(),"Borax Pure Dust");
        add(DCItems.BORAX_LEACHATE.get(),"Borax Leachate");
        add(DCItems.BORAX_CONCENTRATE.get(),"Borax Concentrate");
        add(DCItems.BORAX_PLASMA.get(),"Borax Plasma");
        add(DCItems.BORAX_DEGENERATEMATTER.get(),"Borax Degenerate Matter");
        add(DCItems.BORAX_SOUP.get(),"Borax Soup");
        add(DCItems.BORAX_IMAGINARYMATTER.get(),"Borax Imaginary Matter");
        add(DCItems.STABLE_BORAX_IMAGINARYMATTER.get(),"Stable Borax Imaginary Matter");
        add(DCItems.BORAX_TACHYON.get(),"Borax Tachyon");
        add(DCItems.BORAX_ANTIMATTER.get(),"Borax Antimatter");
        add(DCItems.BORAX_ULTRAHOTPLASMA.get(), "Borax Ultrahot Plasma");
        add(DCItems.BORAX_OVERFLUID.get(), "Borax Over Fluid");
        add(DCItems.BORAX_CRYSTAL.get(), "Borax Crystal");
        add(DCItems.BORAX_PRECIPITATE.get(),"Borax Precipitate");
        add(DCItems.BORAX_WASHEDDUST.get(),"Borax Washed Dust");
        add(DCItems.BORAX_ORESINTER.get(),"Borax Oresinter");
        add(DCItems.BORAX_INGOT.get(), "Borax Ingot");
        //
        add(DCItems.RAW_CASSITERITE_ORE.get(), "Cassiterite Raw Chunk");
        add(DCItems.CASSITERITE_DUST.get(),"Cassiterite Dust");
        add(DCItems.CASSITERITE_PUREDUST.get(),"Cassiterite Pure Dust");
        add(DCItems.CASSITERITE_LEACHATE.get(),"Cassiterite Leachate");
        add(DCItems.CASSITERITE_CONCENTRATE.get(),"Cassiterite Concentrate");
        add(DCItems.CASSITERITE_PLASMA.get(),"Cassiterite Plasma");
        add(DCItems.CASSITERITE_DEGENERATEMATTER.get(),"Cassiterite Degenerate Matter");
        add(DCItems.CASSITERITE_SOUP.get(),"Cassiterite Soup");
        add(DCItems.CASSITERITE_IMAGINARYMATTER.get(),"Cassiterite Imaginary Matter");
        add(DCItems.STABLE_CASSITERITE_IMAGINARYMATTER.get(),"Stable Cassiterite Imaginary Matter");
        add(DCItems.CASSITERITE_TACHYON.get(),"Cassiterite Tachyon");
        add(DCItems.CASSITERITE_ANTIMATTER.get(),"Cassiterite Antimatter");
        add(DCItems.CASSITERITE_ULTRAHOTPLASMA.get(), "Cassiterite Ultrahot Plasma");
        add(DCItems.CASSITERITE_OVERFLUID.get(), "Cassiterite Over Fluid");
        add(DCItems.CASSITERITE_CRYSTAL.get(), "Cassiterite Crystal");
        add(DCItems.CASSITERITE_PRECIPITATE.get(),"Cassiterite Precipitate");
        add(DCItems.CASSITERITE_WASHEDDUST.get(),"Cassiterite Washed Dust");
        add(DCItems.CASSITERITE_ORESINTER.get(),"Cassiterite Oresinter");
        add(DCItems.CASSITERITE_INGOT.get(), "Cassiterite Ingot");
        //
        add(DCItems.RAW_CHROMITE_ORE.get(), "Chromite Raw Chunk");
        add(DCItems.CHROMITE_DUST.get(),"Chromite Dust");
        add(DCItems.CHROMITE_PUREDUST.get(),"Chromite Pure Dust");
        add(DCItems.CHROMITE_LEACHATE.get(),"Chromite Leachate");
        add(DCItems.CHROMITE_CONCENTRATE.get(),"Chromite Concentrate");
        add(DCItems.CHROMITE_PLASMA.get(),"Chromite Plasma");
        add(DCItems.CHROMITE_DEGENERATEMATTER.get(),"Chromite Degenerate Matter");
        add(DCItems.CHROMITE_SOUP.get(),"Chromite Soup");
        add(DCItems.CHROMITE_IMAGINARYMATTER.get(),"Chromite Imaginary Matter");
        add(DCItems.STABLE_CHROMITE_IMAGINARYMATTER.get(),"Stable Chromite Imaginary Matter");
        add(DCItems.CHROMITE_TACHYON.get(),"Chromite Tachyon");
        add(DCItems.CHROMITE_ANTIMATTER.get(),"Chromite Antimatter");
        add(DCItems.CHROMITE_ULTRAHOTPLASMA.get(), "Chromite Ultrahot Plasma");
        add(DCItems.CHROMITE_OVERFLUID.get(), "Chromite Over Fluid");
        add(DCItems.CHROMITE_CRYSTAL.get(), "Chromite Crystal");
        add(DCItems.CHROMITE_PRECIPITATE.get(),"Chromite Precipitate");
        add(DCItems.CHROMITE_WASHEDDUST.get(),"Chromite Washed Dust");
        add(DCItems.CHROMITE_ORESINTER.get(),"Chromite Oresinter");
        add(DCItems.CHROMITE_INGOT.get(), "Chromite Ingot");
        //
        add(DCItems.RAW_FLUORITE_ORE.get(), "Fluorite Raw Chunk");
        add(DCItems.FLUORITE_DUST.get(),"Fluorite Dust");
        add(DCItems.FLUORITE_PUREDUST.get(),"Fluorite Pure Dust");
        add(DCItems.FLUORITE_LEACHATE.get(),"Fluorite Leachate");
        add(DCItems.FLUORITE_CONCENTRATE.get(),"Fluorite Concentrate");
        add(DCItems.FLUORITE_PLASMA.get(),"Fluorite Plasma");
        add(DCItems.FLUORITE_DEGENERATEMATTER.get(),"Fluorite Degenerate Matter");
        add(DCItems.FLUORITE_SOUP.get(),"Fluorite Soup");
        add(DCItems.FLUORITE_IMAGINARYMATTER.get(),"Fluorite Imaginary Matter");
        add(DCItems.STABLE_FLUORITE_IMAGINARYMATTER.get(),"Stable Fluorite Imaginary Matter");
        add(DCItems.FLUORITE_TACHYON.get(),"Fluorite Tachyon");
        add(DCItems.FLUORITE_ANTIMATTER.get(),"Fluorite Antimatter");
        add(DCItems.FLUORITE_ULTRAHOTPLASMA.get(), "Fluorite Ultrahot Plasma");
        add(DCItems.FLUORITE_OVERFLUID.get(), "Fluorite Over Fluid");
        add(DCItems.FLUORITE_CRYSTAL.get(), "Fluorite Crystal");
        add(DCItems.FLUORITE_PRECIPITATE.get(),"Fluorite Precipitate");
        add(DCItems.FLUORITE_WASHEDDUST.get(),"Fluorite Washed Dust");
        add(DCItems.FLUORITE_ORESINTER.get(),"Fluorite Oresinter");
        add(DCItems.FLUORITE_INGOT.get(), "Fluorite Ingot");
        //
        add(DCItems.RAW_GRAVITATION_ORE.get(), "Gravitation Raw Chunk");
        add(DCItems.GRAVITATION_INGOT.get(), "Gravitation Ingot");
        //
        add(DCItems.RAW_GRAPHITE_ORE.get(), "Graphite Raw Chunk");
        add(DCItems.GRAPHITE_DUST.get(),"Graphite Dust");
        add(DCItems.GRAPHITE_PUREDUST.get(),"Graphite Pure Dust");
        add(DCItems.GRAPHITE_LEACHATE.get(),"Graphite Leachate");
        add(DCItems.GRAPHITE_CONCENTRATE.get(),"Graphite Concentrate");
        add(DCItems.GRAPHITE_PLASMA.get(),"Graphite Plasma");
        add(DCItems.GRAPHITE_DEGENERATEMATTER.get(),"Graphite Degenerate Matter");
        add(DCItems.GRAPHITE_SOUP.get(),"Graphite Soup");
        add(DCItems.GRAPHITE_IMAGINARYMATTER.get(),"Graphite Imaginary Matter");
        add(DCItems.STABLE_GRAPHITE_IMAGINARYMATTER.get(),"Stable Graphite Imaginary Matter");
        add(DCItems.GRAPHITE_TACHYON.get(),"Graphite Tachyon");
        add(DCItems.GRAPHITE_ANTIMATTER.get(),"Graphite Antimatter");
        add(DCItems.GRAPHITE_ULTRAHOTPLASMA.get(), "Graphite Ultrahot Plasma");
        add(DCItems.GRAPHITE_OVERFLUID.get(), "Graphite Over Fluid");
        add(DCItems.GRAPHITE_CRYSTAL.get(), "Graphite Crystal");
        add(DCItems.GRAPHITE_PRECIPITATE.get(),"Graphite Precipitate");
        add(DCItems.GRAPHITE_WASHEDDUST.get(),"Graphite Washed Dust");
        add(DCItems.GRAPHITE_ORESINTER.get(),"Graphite Oresinter");
        add(DCItems.GRAPHITE_INGOT.get(), "Graphite Ingot");
        //
        add(DCItems.IRON_DUST.get(),"Iron Dust");
        add(DCItems.IRON_PUREDUST.get(),"Iron Pure Dust");
        add(DCItems.IRON_LEACHATE.get(),"Iron Leachate");
        add(DCItems.IRON_CONCENTRATE.get(),"Iron Concentrate");
        add(DCItems.IRON_PLASMA.get(),"Iron Plasma");
        add(DCItems.IRON_DEGENERATEMATTER.get(),"Iron Degenerate Matter");
        add(DCItems.IRON_SOUP.get(),"Iron Soup");
        add(DCItems.IRON_IMAGINARYMATTER.get(),"Iron Imaginary Matter");
        add(DCItems.STABLE_IRON_IMAGINARYMATTER.get(),"Stable Iron Imaginary Matter");
        add(DCItems.IRON_TACHYON.get(),"Iron Tachyon");
        add(DCItems.IRON_ANTIMATTER.get(),"Iron Antimatter");
        add(DCItems.IRON_ULTRAHOTPLASMA.get(), "Iron Ultrahot Plasma");
        add(DCItems.IRON_OVERFLUID.get(), "Iron Over Fluid");
        add(DCItems.IRON_CRYSTAL.get(), "Iron Crystal");
        add(DCItems.IRON_PRECIPITATE.get(),"Iron Precipitate");
        add(DCItems.IRON_WASHEDDUST.get(),"Iron Washed Dust");
        add(DCItems.IRON_ORESINTER.get(),"Iron Ore Sinter");
        //
        add(DCItems.RAW_LATERITE_ORE.get(), "Laterite Raw Chunk");
        add(DCItems.LATERITE_DUST.get(),"Laterite Dust");
        add(DCItems.LATERITE_PUREDUST.get(),"Laterite Pure Dust");
        add(DCItems.LATERITE_LEACHATE.get(),"Laterite Leachate");
        add(DCItems.LATERITE_CONCENTRATE.get(),"Laterite Concentrate");
        add(DCItems.LATERITE_PLASMA.get(),"Laterite Plasma");
        add(DCItems.LATERITE_DEGENERATEMATTER.get(),"Laterite Degenerate Matter");
        add(DCItems.LATERITE_SOUP.get(),"Laterite Soup");
        add(DCItems.LATERITE_IMAGINARYMATTER.get(),"Laterite Imaginary Matter");
        add(DCItems.STABLE_LATERITE_IMAGINARYMATTER.get(),"Stable Laterite Imaginary Matter");
        add(DCItems.LATERITE_TACHYON.get(),"Laterite Tachyon");
        add(DCItems.LATERITE_ANTIMATTER.get(),"Laterite Antimatter");
        add(DCItems.LATERITE_ULTRAHOTPLASMA.get(), "Laterite Ultrahot Plasma");
        add(DCItems.LATERITE_OVERFLUID.get(), "Laterite Over Fluid");
        add(DCItems.LATERITE_CRYSTAL.get(), "Laterite Crystal");
        add(DCItems.LATERITE_PRECIPITATE.get(),"Laterite Precipitate");
        add(DCItems.LATERITE_WASHEDDUST.get(),"Laterite Washed Dust");
        add(DCItems.LATERITE_ORESINTER.get(),"Laterite Oresinter");
        add(DCItems.LATERITE_INGOT.get(), "Laterite Ingot");
        //
        add(DCItems.RAW_LIMESTONE_ORE.get(), "Limestone Raw Chunk");
        add(DCItems.LIMESTONE_DUST.get(),"Limestone Dust");
        add(DCItems.LIMESTONE_PUREDUST.get(),"Limestone Pure Dust");
        add(DCItems.LIMESTONE_LEACHATE.get(),"Limestone Leachate");
        add(DCItems.LIMESTONE_CONCENTRATE.get(),"Limestone Concentrate");
        add(DCItems.LIMESTONE_PLASMA.get(),"Limestone Plasma");
        add(DCItems.LIMESTONE_DEGENERATEMATTER.get(),"Limestone Degenerate Matter");
        add(DCItems.LIMESTONE_SOUP.get(),"Limestone Soup");
        add(DCItems.LIMESTONE_IMAGINARYMATTER.get(),"Limestone Imaginary Matter");
        add(DCItems.STABLE_LIMESTONE_IMAGINARYMATTER.get(),"Stable Limestone Imaginary Matter");
        add(DCItems.LIMESTONE_TACHYON.get(),"Limestone Tachyon");
        add(DCItems.LIMESTONE_ANTIMATTER.get(),"Limestone Antimatter");
        add(DCItems.LIMESTONE_ULTRAHOTPLASMA.get(), "Limestone Ultrahot Plasma");
        add(DCItems.LIMESTONE_OVERFLUID.get(), "Limestone Over Fluid");
        add(DCItems.LIMESTONE_CRYSTAL.get(), "Limestone Crystal");
        add(DCItems.LIMESTONE_PRECIPITATE.get(),"Limestone Precipitate");
        add(DCItems.LIMESTONE_WASHEDDUST.get(),"Limestone Washed Dust");
        add(DCItems.LIMESTONE_ORESINTER.get(),"Limestone Oresinter");
        add(DCItems.LIMESTONE_INGOT.get(), "Limestone Ingot");
        //
        add(DCItems.RAW_PHOSPHORITE_ORE.get(), "Phosphorite Raw Chunk");
        add(DCItems.PHOSPHORITE_DUST.get(),"Phosphorite Dust");
        add(DCItems.PHOSPHORITE_PUREDUST.get(),"Phosphorite Pure Dust");
        add(DCItems.PHOSPHORITE_LEACHATE.get(),"Phosphorite Leachate");
        add(DCItems.PHOSPHORITE_CONCENTRATE.get(),"Phosphorite Concentrate");
        add(DCItems.PHOSPHORITE_PLASMA.get(),"Phosphorite Plasma");
        add(DCItems.PHOSPHORITE_DEGENERATEMATTER.get(),"Phosphorite Degenerate Matter");
        add(DCItems.PHOSPHORITE_SOUP.get(),"Phosphorite Soup");
        add(DCItems.PHOSPHORITE_IMAGINARYMATTER.get(),"Phosphorite Imaginary Matter");
        add(DCItems.STABLE_PHOSPHORITE_IMAGINARYMATTER.get(),"Stable Phosphorite Imaginary Matter");
        add(DCItems.PHOSPHORITE_TACHYON.get(),"Phosphorite Tachyon");
        add(DCItems.PHOSPHORITE_ANTIMATTER.get(),"Phosphorite Antimatter");
        add(DCItems.PHOSPHORITE_ULTRAHOTPLASMA.get(), "Phosphorite Ultrahot Plasma");
        add(DCItems.PHOSPHORITE_OVERFLUID.get(), "Phosphorite Over Fluid");
        add(DCItems.PHOSPHORITE_CRYSTAL.get(), "Phosphorite Crystal");
        add(DCItems.PHOSPHORITE_PRECIPITATE.get(),"Phosphorite Precipitate");
        add(DCItems.PHOSPHORITE_WASHEDDUST.get(),"Phosphorite Washed Dust");
        add(DCItems.PHOSPHORITE_ORESINTER.get(),"Phosphorite Oresinter");
        add(DCItems.PHOSPHORITE_INGOT.get(), "Phosphorite Ingot");
        //
        add(DCItems.RAW_PEGMATITE_ORE.get(), "Pegmatite Raw Chunk");
        add(DCItems.PEGMATITE_DUST.get(),"Pegmatite Dust");
        add(DCItems.PEGMATITE_PUREDUST.get(),"Pegmatite Pure Dust");
        add(DCItems.PEGMATITE_LEACHATE.get(),"Pegmatite Leachate");
        add(DCItems.PEGMATITE_CONCENTRATE.get(),"Pegmatite Concentrate");
        add(DCItems.PEGMATITE_PLASMA.get(),"Pegmatite Plasma");
        add(DCItems.PEGMATITE_DEGENERATEMATTER.get(),"Pegmatite Degenerate Matter");
        add(DCItems.PEGMATITE_SOUP.get(),"Pegmatite Soup");
        add(DCItems.PEGMATITE_IMAGINARYMATTER.get(),"Pegmatite Imaginary Matter");
        add(DCItems.STABLE_PEGMATITE_IMAGINARYMATTER.get(),"Stable Pegmatite Imaginary Matter");
        add(DCItems.PEGMATITE_TACHYON.get(),"Pegmatite Tachyon");
        add(DCItems.PEGMATITE_ANTIMATTER.get(),"Pegmatite Antimatter");
        add(DCItems.PEGMATITE_ULTRAHOTPLASMA.get(), "Pegmatite Ultrahot Plasma");
        add(DCItems.PEGMATITE_OVERFLUID.get(), "Pegmatite Over Fluid");
        add(DCItems.PEGMATITE_CRYSTAL.get(), "Pegmatite Crystal");
        add(DCItems.PEGMATITE_PRECIPITATE.get(),"Pegmatite Precipitate");
        add(DCItems.PEGMATITE_WASHEDDUST.get(),"Pegmatite Washed Dust");
        add(DCItems.PEGMATITE_ORESINTER.get(),"Pegmatite Oresinter");
        add(DCItems.PEGMATITE_INGOT.get(), "Pegmatite Ingot");
        //
        add(DCItems.RAW_PYROLUSITE_ORE.get(), "Pyrolusite Raw Chunk");
        add(DCItems.PYROLUSITE_DUST.get(),"Pyrolusite Dust");
        add(DCItems.PYROLUSITE_PUREDUST.get(),"Pyrolusite Pure Dust");
        add(DCItems.PYROLUSITE_LEACHATE.get(),"Pyrolusite Leachate");
        add(DCItems.PYROLUSITE_CONCENTRATE.get(),"Pyrolusite Concentrate");
        add(DCItems.PYROLUSITE_PLASMA.get(),"Pyrolusite Plasma");
        add(DCItems.PYROLUSITE_DEGENERATEMATTER.get(),"Pyrolusite Degenerate Matter");
        add(DCItems.PYROLUSITE_SOUP.get(),"Pyrolusite Soup");
        add(DCItems.PYROLUSITE_IMAGINARYMATTER.get(),"Pyrolusite Imaginary Matter");
        add(DCItems.STABLE_PYROLUSITE_IMAGINARYMATTER.get(),"Stable Pyrolusite Imaginary Matter");
        add(DCItems.PYROLUSITE_TACHYON.get(),"Pyrolusite Tachyon");
        add(DCItems.PYROLUSITE_ANTIMATTER.get(),"Pyrolusite Antimatter");
        add(DCItems.PYROLUSITE_ULTRAHOTPLASMA.get(), "Pyrolusite Ultrahot Plasma");
        add(DCItems.PYROLUSITE_OVERFLUID.get(), "Pyrolusite Over Fluid");
        add(DCItems.PYROLUSITE_CRYSTAL.get(), "Pyrolusite Crystal");
        add(DCItems.PYROLUSITE_PRECIPITATE.get(),"Pyrolusite Precipitate");
        add(DCItems.PYROLUSITE_WASHEDDUST.get(),"Pyrolusite Washed Dust");
        add(DCItems.PYROLUSITE_ORESINTER.get(),"Pyrolusite Oresinter");
        add(DCItems.PYROLUSITE_INGOT.get(), "Pyrolusite Ingot");
        //
        add(DCItems.RAW_RUTILE_ORE.get(), "Rutile Raw Chunk");
        add(DCItems.RUTILE_DUST.get(),"Rutile Dust");
        add(DCItems.RUTILE_PUREDUST.get(),"Rutile Pure Dust");
        add(DCItems.RUTILE_LEACHATE.get(),"Rutile Leachate");
        add(DCItems.RUTILE_CONCENTRATE.get(),"Rutile Concentrate");
        add(DCItems.RUTILE_PLASMA.get(),"Rutile Plasma");
        add(DCItems.RUTILE_DEGENERATEMATTER.get(),"Rutile Degenerate Matter");
        add(DCItems.RUTILE_SOUP.get(),"Rutile Soup");
        add(DCItems.RUTILE_IMAGINARYMATTER.get(),"Rutile Imaginary Matter");
        add(DCItems.STABLE_RUTILE_IMAGINARYMATTER.get(),"Stable Rutile Imaginary Matter");
        add(DCItems.RUTILE_TACHYON.get(),"Rutile Tachyon");
        add(DCItems.RUTILE_ANTIMATTER.get(),"Rutile Antimatter");
        add(DCItems.RUTILE_ULTRAHOTPLASMA.get(), "Rutile Ultrahot Plasma");
        add(DCItems.RUTILE_OVERFLUID.get(), "Rutile Over Fluid");
        add(DCItems.RUTILE_CRYSTAL.get(), "Rutile Crystal");
        add(DCItems.RUTILE_PRECIPITATE.get(),"Rutile Precipitate");
        add(DCItems.RUTILE_WASHEDDUST.get(),"Rutile Washed Dust");
        add(DCItems.RUTILE_ORESINTER.get(),"Rutile Oresinter");
        add(DCItems.RUTILE_INGOT.get(), "Rutile Ingot");
        //
        add(DCItems.RAW_SPODUMENE_ORE.get(), "Spodumene Raw Chunk");
        add(DCItems.SPODUMENE_DUST.get(),"Spodumene Dust");
        add(DCItems.SPODUMENE_PUREDUST.get(),"Spodumene Pure Dust");
        add(DCItems.SPODUMENE_LEACHATE.get(),"Spodumene Leachate");
        add(DCItems.SPODUMENE_CONCENTRATE.get(),"Spodumene Concentrate");
        add(DCItems.SPODUMENE_PLASMA.get(),"Spodumene Plasma");
        add(DCItems.SPODUMENE_DEGENERATEMATTER.get(),"Spodumene Degenerate Matter");
        add(DCItems.SPODUMENE_SOUP.get(),"Spodumene Soup");
        add(DCItems.SPODUMENE_IMAGINARYMATTER.get(),"Spodumene Imaginary Matter");
        add(DCItems.STABLE_SPODUMENE_IMAGINARYMATTER.get(),"Stable Spodumene Imaginary Matter");
        add(DCItems.SPODUMENE_TACHYON.get(),"Spodumene Tachyon");
        add(DCItems.SPODUMENE_ANTIMATTER.get(),"Spodumene Antimatter");
        add(DCItems.SPODUMENE_ULTRAHOTPLASMA.get(), "Spodumene Ultrahot Plasma");
        add(DCItems.SPODUMENE_OVERFLUID.get(), "Spodumene Over Fluid");
        add(DCItems.SPODUMENE_CRYSTAL.get(), "Spodumene Crystal");
        add(DCItems.SPODUMENE_PRECIPITATE.get(),"Spodumene Precipitate");
        add(DCItems.SPODUMENE_WASHEDDUST.get(),"Spodumene Washed Dust");
        add(DCItems.SPODUMENE_ORESINTER.get(),"Spodumene Oresinter");
        add(DCItems.SPODUMENE_INGOT.get(), "Spodumene Ingot");
        //
        add(DCItems.RAW_ULEXITE_ORE.get(), "Ulexite Raw Chunk");
        add(DCItems.ULEXITE_DUST.get(),"Ulexite Dust");
        add(DCItems.ULEXITE_PUREDUST.get(),"Ulexite Pure Dust");
        add(DCItems.ULEXITE_LEACHATE.get(),"Ulexite Leachate");
        add(DCItems.ULEXITE_CONCENTRATE.get(),"Ulexite Concentrate");
        add(DCItems.ULEXITE_PLASMA.get(),"Ulexite Plasma");
        add(DCItems.ULEXITE_DEGENERATEMATTER.get(),"Ulexite Degenerate Matter");
        add(DCItems.ULEXITE_SOUP.get(),"Ulexite Soup");
        add(DCItems.ULEXITE_IMAGINARYMATTER.get(),"Ulexite Imaginary Matter");
        add(DCItems.STABLE_ULEXITE_IMAGINARYMATTER.get(),"Stable Ulexite Imaginary Matter");
        add(DCItems.ULEXITE_TACHYON.get(),"Ulexite Tachyon");
        add(DCItems.ULEXITE_ANTIMATTER.get(),"Ulexite Antimatter");
        add(DCItems.ULEXITE_ULTRAHOTPLASMA.get(), "Ulexite Ultrahot Plasma");
        add(DCItems.ULEXITE_OVERFLUID.get(), "Ulexite Over Fluid");
        add(DCItems.ULEXITE_CRYSTAL.get(), "Ulexite Crystal");
        add(DCItems.ULEXITE_PRECIPITATE.get(),"Ulexite Precipitate");
        add(DCItems.ULEXITE_WASHEDDUST.get(),"Ulexite Washed Dust");
        add(DCItems.ULEXITE_ORESINTER.get(),"Ulexite Oresinter");
        add(DCItems.ULEXITE_INGOT.get(), "Ulexite Ingot");
        //
        add(DCItems.RAW_VANADINITE_ORE.get(), "Vanadinite Raw Chunk");
        add(DCItems.VANADINITE_DUST.get(),"Vanadinite Dust");
        add(DCItems.VANADINITE_PUREDUST.get(),"Vanadinite Pure Dust");
        add(DCItems.VANADINITE_LEACHATE.get(),"Vanadinite Leachate");
        add(DCItems.VANADINITE_CONCENTRATE.get(),"Vanadinite Concentrate");
        add(DCItems.VANADINITE_PLASMA.get(),"Vanadinite Plasma");
        add(DCItems.VANADINITE_DEGENERATEMATTER.get(),"Vanadinite Degenerate Matter");
        add(DCItems.VANADINITE_SOUP.get(),"Vanadinite Soup");
        add(DCItems.VANADINITE_IMAGINARYMATTER.get(),"Vanadinite Imaginary Matter");
        add(DCItems.STABLE_VANADINITE_IMAGINARYMATTER.get(),"Stable Vanadinite Imaginary Matter");
        add(DCItems.VANADINITE_TACHYON.get(),"Vanadinite Tachyon");
        add(DCItems.VANADINITE_ANTIMATTER.get(),"Vanadinite Antimatter");
        add(DCItems.VANADINITE_ULTRAHOTPLASMA.get(), "Vanadinite Ultrahot Plasma");
        add(DCItems.VANADINITE_OVERFLUID.get(), "Vanadinite Over Fluid");
        add(DCItems.VANADINITE_CRYSTAL.get(), "Vanadinite Crystal");
        add(DCItems.VANADINITE_PRECIPITATE.get(),"Vanadinite Precipitate");
        add(DCItems.VANADINITE_WASHEDDUST.get(),"Vanadinite Washed Dust");
        add(DCItems.VANADINITE_ORESINTER.get(),"Vanadinite Oresinter");
        add(DCItems.VANADINITE_INGOT.get(), "Vanadinite Ingot");
        //
        add(DCItems.RAW_SYLVITE_ORE.get(), "Sylvite Raw Chunk");
        add(DCItems.SYLVITE_DUST.get(),"Sylvite Dust");
        add(DCItems.SYLVITE_PUREDUST.get(),"Sylvite Pure Dust");
        add(DCItems.SYLVITE_LEACHATE.get(),"Sylvite Leachate");
        add(DCItems.SYLVITE_CONCENTRATE.get(),"Sylvite Concentrate");
        add(DCItems.SYLVITE_PLASMA.get(),"Sylvite Plasma");
        add(DCItems.SYLVITE_DEGENERATEMATTER.get(),"Sylvite Degenerate Matter");
        add(DCItems.SYLVITE_SOUP.get(),"Sylvite Soup");
        add(DCItems.SYLVITE_IMAGINARYMATTER.get(),"Sylvite Imaginary Matter");
        add(DCItems.STABLE_SYLVITE_IMAGINARYMATTER.get(),"Stable Sylvite Imaginary Matter");
        add(DCItems.SYLVITE_TACHYON.get(),"Sylvite Tachyon");
        add(DCItems.SYLVITE_ANTIMATTER.get(),"Sylvite Antimatter");
        add(DCItems.SYLVITE_ULTRAHOTPLASMA.get(), "Sylvite Ultrahot Plasma");
        add(DCItems.SYLVITE_OVERFLUID.get(), "Sylvite Over Fluid");
        add(DCItems.SYLVITE_CRYSTAL.get(), "Sylvite Crystal");
        add(DCItems.SYLVITE_PRECIPITATE.get(),"Sylvite Precipitate");
        add(DCItems.SYLVITE_WASHEDDUST.get(),"Sylvite Washed Dust");
        add(DCItems.SYLVITE_ORESINTER.get(),"Sylvite Oresinter");
        add(DCItems.SYLVITE_INGOT.get(), "Sylvite Ingot");
        
        //Copper Machine Component
        add(DCItems.COPPER_BOLT.get(),"Copper Bolt");
        add(DCItems.COPPER_KEY.get(),"Copper Key");
        add(DCItems.COPPER_ROD.get(),"Copper Rod");
        add(DCItems.COPPER_SPRING.get(),"Copper Spring");
        add(DCItems.COPPER_BEARING.get(),"Copper Bearing");
        add(DCItems.COPPER_PLATE.get(),"Copper Plate");
        add(DCItems.COPPER_GEAR.get(),"Copper Gear");
        add(DCItems.COPPER_JOINT.get(),"Copper Joint");
        add(DCItems.COPPER_NUT.get(),"Copper Nut");
        add(DCItems.COPPER_PIPE.get(),"Copper Pipe");
        add(DCItems.COPPER_PIPEJOINT.get(),"Copper PipeJoint");
        add(DCItems.COPPER_CAM.get(),"Copper Cam");
        add(DCItems.COPPER_SHAFT.get(),"Copper Shaft");
        add(DCItems.COPPER_SHAFTCOUPLING.get(),"Copper Shaftcoupling");
        add(DCItems.COPPER_SHAPESTEEL.get(),"Copper Shapesteel");
        add(DCItems.COPPER_CHAIN.get(),"Copper Chain");

     //Basic Class Iron Machine Component
        add(DCItems.IRON_BEARING.get(),"Iron Bearing");
        add(DCItems.IRON_BOLT.get(),"Iron Bolt");
        add(DCItems.IRON_CAM.get(),"Iron Cam");
        add(DCItems.IRON_CHAIN.get(),"Iron Chain");
        add(DCItems.IRON_GEAR.get(),"Iron Gear");
        add(DCItems.IRON_JOINT.get(),"Iron Joint");
        add(DCItems.IRON_KEY.get(),"Iron Key");
        add(DCItems.IRON_NUT.get(),"Iron Nut");
        add(DCItems.IRON_PIPE.get(),"Iron Pipe");
        add(DCItems.IRON_PIPEJOINT.get(),"Iron PipeJoint");
        add(DCItems.IRON_PLATE.get(),"Iron Plate");
        add(DCItems.IRON_ROD.get(),"Iron Rod");
        add(DCItems.IRON_SHAFT.get(),"Iron Shaft");
        add(DCItems.IRON_SHAFTCOUPLING.get(),"Iron ShaftCoupling");
        add(DCItems.IRON_SHAPESTEEL.get(),"Iron ShapeSteel");
        add(DCItems.IRON_SPRING.get(),"Iron Spring");
        
        
//        //Basic Class Iron Machine Component
//        add(DCItems.BASIC_CLASS_IRON_BEARING.get(),"Basic Class Iron Bearing");
//        add(DCItems.BASIC_CLASS_IRON_BOLT.get(),"Basic Class Iron Bolt");
//        add(DCItems.BASIC_CLASS_IRON_CAM.get(),"Basic Class Iron Cam");
//        add(DCItems.BASIC_CLASS_IRON_CHAIN.get(),"Basic Class Iron Chain");
//        add(DCItems.BASIC_CLASS_IRON_GEAR.get(),"Basic Class Iron Gear");
//        add(DCItems.BASIC_CLASS_IRON_JOINT.get(),"Basic Class Iron Joint");
//        add(DCItems.BASIC_CLASS_IRON_KEY.get(),"Basic Class Iron Key");
//        add(DCItems.BASIC_CLASS_IRON_NUT.get(),"Basic Class Iron Nut");
//        add(DCItems.BASIC_CLASS_IRON_PIPE.get(),"Basic Class Iron Pipe");
//        add(DCItems.BASIC_CLASS_IRON_PIPEJOINT.get(),"Basic Class Iron PipeJoint");
//        add(DCItems.BASIC_CLASS_IRON_PLATE.get(),"Basic Class Iron Plate");
//        add(DCItems.BASIC_CLASS_IRON_ROD.get(),"Basic Class Iron Rod");
//        add(DCItems.BASIC_CLASS_IRON_SHAFT.get(),"Basic Class Iron Shaft");
//        add(DCItems.BASIC_CLASS_IRON_SHAFTCOUPLING.get(),"Basic Class Iron ShaftCoupling");
//        add(DCItems.BASIC_CLASS_IRON_SHAPESTEEL.get(),"Basic Class Iron ShapeSteel");
//        add(DCItems.BASIC_CLASS_IRON_SPRING.get(),"Basic Class Iron Spring");
//
//        //Low Class Iron Machine Component
//        add(DCItems.LOW_CLASS_IRON_BEARING.get(),"Low Class Iron Bearing");
//        add(DCItems.LOW_CLASS_IRON_BOLT.get(),"Low Class Iron Bolt");
//        add(DCItems.LOW_CLASS_IRON_CAM.get(),"Low Class Iron Cam");
//        add(DCItems.LOW_CLASS_IRON_CHAIN.get(),"Low Class Iron Chain");
//        add(DCItems.LOW_CLASS_IRON_GEAR.get(),"Low Class Iron Gear");
//        add(DCItems.LOW_CLASS_IRON_JOINT.get(),"Low Class Iron Joint");
//        add(DCItems.LOW_CLASS_IRON_KEY.get(),"Low Class Iron Key");
//        add(DCItems.LOW_CLASS_IRON_NUT.get(),"Low Class Iron Nut");
//        add(DCItems.LOW_CLASS_IRON_PIPE.get(),"Low Class Iron Pipe");
//        add(DCItems.LOW_CLASS_IRON_PIPEJOINT.get(),"Low Class Iron PipeJoint");
//        add(DCItems.LOW_CLASS_IRON_PLATE.get(),"Low Class Iron Plate");
//        add(DCItems.LOW_CLASS_IRON_ROD.get(),"Low Class Iron Rod");
//        add(DCItems.LOW_CLASS_IRON_SHAFT.get(),"Low Class Iron Shaft");
//        add(DCItems.LOW_CLASS_IRON_SHAFTCOUPLING.get(),"Low Class Iron ShaftCoupling");
//        add(DCItems.LOW_CLASS_IRON_SHAPESTEEL.get(),"Low Class Iron ShapeSteel");
//        add(DCItems.LOW_CLASS_IRON_SPRING.get(),"Low Class Iron Spring");
//
//        //Medium Class Iron Machine Component
//        add(DCItems.MEDIUM_CLASS_IRON_BEARING.get(),"Medium Class Iron Bearing");
//        add(DCItems.MEDIUM_CLASS_IRON_BOLT.get(),"Medium Class Iron Bolt");
//        add(DCItems.MEDIUM_CLASS_IRON_CAM.get(),"Medium Class Iron Cam");
//        add(DCItems.MEDIUM_CLASS_IRON_CHAIN.get(),"Medium Class Iron Chain");
//        add(DCItems.MEDIUM_CLASS_IRON_GEAR.get(),"Medium Class Iron Gear");
//        add(DCItems.MEDIUM_CLASS_IRON_JOINT.get(),"Medium Class Iron Joint");
//        add(DCItems.MEDIUM_CLASS_IRON_KEY.get(),"Medium Class Iron Key");
//        add(DCItems.MEDIUM_CLASS_IRON_NUT.get(),"Medium Class Iron Nut");
//        add(DCItems.MEDIUM_CLASS_IRON_PIPE.get(),"Medium Class Iron Pipe");
//        add(DCItems.MEDIUM_CLASS_IRON_PIPEJOINT.get(),"Medium Class Iron PipeJoint");
//        add(DCItems.MEDIUM_CLASS_IRON_PLATE.get(),"Medium Class Iron Plate");
//        add(DCItems.MEDIUM_CLASS_IRON_ROD.get(),"Medium Class Iron Rod");
//        add(DCItems.MEDIUM_CLASS_IRON_SHAFT.get(),"Medium Class Iron Shaft");
//        add(DCItems.MEDIUM_CLASS_IRON_SHAFTCOUPLING.get(),"Medium Class Iron ShaftCoupling");
//        add(DCItems.MEDIUM_CLASS_IRON_SHAPESTEEL.get(),"Medium Class Iron ShapeSteel");
//        add(DCItems.MEDIUM_CLASS_IRON_SPRING.get(),"Medium Class Iron Spring");
//
//        //High Class Iron Machine Component
//        add(DCItems.HIGH_CLASS_IRON_BEARING.get(),"High Class Iron Bearing");
//        add(DCItems.HIGH_CLASS_IRON_BOLT.get(),"High Class Iron Bolt");
//        add(DCItems.HIGH_CLASS_IRON_CAM.get(),"High Class Iron Cam");
//        add(DCItems.HIGH_CLASS_IRON_CHAIN.get(),"High Class Iron Chain");
//        add(DCItems.HIGH_CLASS_IRON_GEAR.get(),"High Class Iron Gear");
//        add(DCItems.HIGH_CLASS_IRON_JOINT.get(),"High Class Iron Joint");
//        add(DCItems.HIGH_CLASS_IRON_KEY.get(),"High Class Iron Key");
//        add(DCItems.HIGH_CLASS_IRON_NUT.get(),"High Class Iron Nut");
//        add(DCItems.HIGH_CLASS_IRON_PIPE.get(),"High Class Iron Pipe");
//        add(DCItems.HIGH_CLASS_IRON_PIPEJOINT.get(),"High Class Iron PipeJoint");
//        add(DCItems.HIGH_CLASS_IRON_PLATE.get(),"High Class Iron Plate");
//        add(DCItems.HIGH_CLASS_IRON_ROD.get(),"High Class Iron Rod");
//        add(DCItems.HIGH_CLASS_IRON_SHAFT.get(),"High Class Iron Shaft");
//        add(DCItems.HIGH_CLASS_IRON_SHAFTCOUPLING.get(),"High Class Iron ShaftCoupling");
//        add(DCItems.HIGH_CLASS_IRON_SHAPESTEEL.get(),"High Class Iron ShapeSteel");
//        add(DCItems.HIGH_CLASS_IRON_SPRING.get(),"High Class Iron Spring");
//
//        //Super Class Iron Machine Component
//        add(DCItems.SUPER_CLASS_IRON_BEARING.get(),"Super Class Iron Bearing");
//        add(DCItems.SUPER_CLASS_IRON_BOLT.get(),"Super Class Iron Bolt");
//        add(DCItems.SUPER_CLASS_IRON_CAM.get(),"Super Class Iron Cam");
//        add(DCItems.SUPER_CLASS_IRON_CHAIN.get(),"Super Class Iron Chain");
//        add(DCItems.SUPER_CLASS_IRON_GEAR.get(),"Super Class Iron Gear");
//        add(DCItems.SUPER_CLASS_IRON_JOINT.get(),"Super Class Iron Joint");
//        add(DCItems.SUPER_CLASS_IRON_KEY.get(),"Super Class Iron Key");
//        add(DCItems.SUPER_CLASS_IRON_NUT.get(),"Super Class Iron Nut");
//        add(DCItems.SUPER_CLASS_IRON_PIPE.get(),"Super Class Iron Pipe");
//        add(DCItems.SUPER_CLASS_IRON_PIPEJOINT.get(),"Super Class Iron PipeJoint");
//        add(DCItems.SUPER_CLASS_IRON_PLATE.get(),"Super Class Iron Plate");
//        add(DCItems.SUPER_CLASS_IRON_ROD.get(),"Super Class Iron Rod");
//        add(DCItems.SUPER_CLASS_IRON_SHAFT.get(),"Super Class Iron Shaft");
//        add(DCItems.SUPER_CLASS_IRON_SHAFTCOUPLING.get(),"Super Class Iron ShaftCoupling");
//        add(DCItems.SUPER_CLASS_IRON_SHAPESTEEL.get(),"Super Class Iron ShapeSteel");
//        add(DCItems.SUPER_CLASS_IRON_SPRING.get(),"Super Class Iron Spring");
//
//        //OVER Class Iron Machine Component
//        add(DCItems.OVER_CLASS_IRON_BEARING.get(),"OVER Class Iron Bearing");
//        add(DCItems.OVER_CLASS_IRON_BOLT.get(),"OVER Class Iron Bolt");
//        add(DCItems.OVER_CLASS_IRON_CAM.get(),"OVER Class Iron Cam");
//        add(DCItems.OVER_CLASS_IRON_CHAIN.get(),"OVER Class Iron Chain");
//        add(DCItems.OVER_CLASS_IRON_GEAR.get(),"OVER Class Iron Gear");
//        add(DCItems.OVER_CLASS_IRON_JOINT.get(),"OVER Class Iron Joint");
//        add(DCItems.OVER_CLASS_IRON_KEY.get(),"OVER Class Iron Key");
//        add(DCItems.OVER_CLASS_IRON_NUT.get(),"OVER Class Iron Nut");
//        add(DCItems.OVER_CLASS_IRON_PIPE.get(),"OVER Class Iron Pipe");
//        add(DCItems.OVER_CLASS_IRON_PIPEJOINT.get(),"OVER Class Iron PipeJoint");
//        add(DCItems.OVER_CLASS_IRON_PLATE.get(),"OVER Class Iron Plate");
//        add(DCItems.OVER_CLASS_IRON_ROD.get(),"OVER Class Iron Rod");
//        add(DCItems.OVER_CLASS_IRON_SHAFT.get(),"OVER Class Iron Shaft");
//        add(DCItems.OVER_CLASS_IRON_SHAFTCOUPLING.get(),"OVER Class Iron ShaftCoupling");
//        add(DCItems.OVER_CLASS_IRON_SHAPESTEEL.get(),"OVER Class Iron ShapeSteel");
//        add(DCItems.OVER_CLASS_IRON_SPRING.get(),"OVER Class Iron Spring");
//
//        //Ultra Class Iron Machine Component
//        add(DCItems.ULTRA_CLASS_IRON_BEARING.get(),"Ultra Class Iron Bearing");
//        add(DCItems.ULTRA_CLASS_IRON_BOLT.get(),"Ultra Class Iron Bolt");
//        add(DCItems.ULTRA_CLASS_IRON_CAM.get(),"Ultra Class Iron Cam");
//        add(DCItems.ULTRA_CLASS_IRON_CHAIN.get(),"Ultra Class Iron Chain");
//        add(DCItems.ULTRA_CLASS_IRON_GEAR.get(),"Ultra Class Iron Gear");
//        add(DCItems.ULTRA_CLASS_IRON_JOINT.get(),"Ultra Class Iron Joint");
//        add(DCItems.ULTRA_CLASS_IRON_KEY.get(),"Ultra Class Iron Key");
//        add(DCItems.ULTRA_CLASS_IRON_NUT.get(),"Ultra Class Iron Nut");
//        add(DCItems.ULTRA_CLASS_IRON_PIPE.get(),"Ultra Class Iron Pipe");
//        add(DCItems.ULTRA_CLASS_IRON_PIPEJOINT.get(),"Ultra Class Iron PipeJoint");
//        add(DCItems.ULTRA_CLASS_IRON_PLATE.get(),"Ultra Class Iron Plate");
//        add(DCItems.ULTRA_CLASS_IRON_ROD.get(),"Ultra Class Iron Rod");
//        add(DCItems.ULTRA_CLASS_IRON_SHAFT.get(),"Ultra Class Iron Shaft");
//        add(DCItems.ULTRA_CLASS_IRON_SHAFTCOUPLING.get(),"Ultra Class Iron ShaftCoupling");
//        add(DCItems.ULTRA_CLASS_IRON_SHAPESTEEL.get(),"Ultra Class Iron ShapeSteel");
//        add(DCItems.ULTRA_CLASS_IRON_SPRING.get(),"Ultra Class Iron Spring");
//
//        //Anti Class Iron Machine Component
//        add(DCItems.ANTI_CLASS_IRON_BEARING.get(),"Anti Class Iron Bearing");
//        add(DCItems.ANTI_CLASS_IRON_BOLT.get(),"Anti Class Iron Bolt");
//        add(DCItems.ANTI_CLASS_IRON_CAM.get(),"Anti Class Iron Cam");
//        add(DCItems.ANTI_CLASS_IRON_CHAIN.get(),"Anti Class Iron Chain");
//        add(DCItems.ANTI_CLASS_IRON_GEAR.get(),"Anti Class Iron Gear");
//        add(DCItems.ANTI_CLASS_IRON_JOINT.get(),"Anti Class Iron Joint");
//        add(DCItems.ANTI_CLASS_IRON_KEY.get(),"Anti Class Iron Key");
//        add(DCItems.ANTI_CLASS_IRON_NUT.get(),"Anti Class Iron Nut");
//        add(DCItems.ANTI_CLASS_IRON_PIPE.get(),"Anti Class Iron Pipe");
//        add(DCItems.ANTI_CLASS_IRON_PIPEJOINT.get(),"Anti Class Iron PipeJoint");
//        add(DCItems.ANTI_CLASS_IRON_PLATE.get(),"Anti Class Iron Plate");
//        add(DCItems.ANTI_CLASS_IRON_ROD.get(),"Anti Class Iron Rod");
//        add(DCItems.ANTI_CLASS_IRON_SHAFT.get(),"Anti Class Iron Shaft");
//        add(DCItems.ANTI_CLASS_IRON_SHAFTCOUPLING.get(),"Anti Class Iron ShaftCoupling");
//        add(DCItems.ANTI_CLASS_IRON_SHAPESTEEL.get(),"Anti Class Iron ShapeSteel");
//        add(DCItems.ANTI_CLASS_IRON_SPRING.get(),"Anti Class Iron Spring");
//
//        //Imaginary Class Iron Machine Component
//        add(DCItems.IMAGINARY_CLASS_IRON_BEARING.get(),"Imaginary Class Iron Bearing");
//        add(DCItems.IMAGINARY_CLASS_IRON_BOLT.get(),"Imaginary Class Iron Bolt");
//        add(DCItems.IMAGINARY_CLASS_IRON_CAM.get(),"Imaginary Class Iron Cam");
//        add(DCItems.IMAGINARY_CLASS_IRON_CHAIN.get(),"Imaginary Class Iron Chain");
//        add(DCItems.IMAGINARY_CLASS_IRON_GEAR.get(),"Imaginary Class Iron Gear");
//        add(DCItems.IMAGINARY_CLASS_IRON_JOINT.get(),"Imaginary Class Iron Joint");
//        add(DCItems.IMAGINARY_CLASS_IRON_KEY.get(),"Imaginary Class Iron Key");
//        add(DCItems.IMAGINARY_CLASS_IRON_NUT.get(),"Imaginary Class Iron Nut");
//        add(DCItems.IMAGINARY_CLASS_IRON_PIPE.get(),"Imaginary Class Iron Pipe");
//        add(DCItems.IMAGINARY_CLASS_IRON_PIPEJOINT.get(),"Imaginary Class Iron PipeJoint");
//        add(DCItems.IMAGINARY_CLASS_IRON_PLATE.get(),"Imaginary Class Iron Plate");
//        add(DCItems.IMAGINARY_CLASS_IRON_ROD.get(),"Imaginary Class Iron Rod");
//        add(DCItems.IMAGINARY_CLASS_IRON_SHAFT.get(),"Imaginary Class Iron Shaft");
//        add(DCItems.IMAGINARY_CLASS_IRON_SHAFTCOUPLING.get(),"Imaginary Class Iron ShaftCoupling");
//        add(DCItems.IMAGINARY_CLASS_IRON_SHAPESTEEL.get(),"Imaginary Class Iron ShapeSteel");
//        add(DCItems.IMAGINARY_CLASS_IRON_SPRING.get(),"Imaginary Class Iron Spring");
//
//        //Infinity Class Iron Machine Component
//        add(DCItems.INFINITY_CLASS_IRON_BEARING.get(),"Infinity Class Iron Bearing");
//        add(DCItems.INFINITY_CLASS_IRON_BOLT.get(),"Infinity Class Iron Bolt");
//        add(DCItems.INFINITY_CLASS_IRON_CAM.get(),"Infinity Class Iron Cam");
//        add(DCItems.INFINITY_CLASS_IRON_CHAIN.get(),"Infinity Class Iron Chain");
//        add(DCItems.INFINITY_CLASS_IRON_GEAR.get(),"Infinity Class Iron Gear");
//        add(DCItems.INFINITY_CLASS_IRON_JOINT.get(),"Infinity Class Iron Joint");
//        add(DCItems.INFINITY_CLASS_IRON_KEY.get(),"Infinity Class Iron Key");
//        add(DCItems.INFINITY_CLASS_IRON_NUT.get(),"Infinity Class Iron Nut");
//        add(DCItems.INFINITY_CLASS_IRON_PIPE.get(),"Infinity Class Iron Pipe");
//        add(DCItems.INFINITY_CLASS_IRON_PIPEJOINT.get(),"Infinity Class Iron PipeJoint");
//        add(DCItems.INFINITY_CLASS_IRON_PLATE.get(),"Infinity Class Iron Plate");
//        add(DCItems.INFINITY_CLASS_IRON_ROD.get(),"Infinity Class Iron Rod");
//        add(DCItems.INFINITY_CLASS_IRON_SHAFT.get(),"Infinity Class Iron Shaft");
//        add(DCItems.INFINITY_CLASS_IRON_SHAFTCOUPLING.get(),"Infinity Class Iron ShaftCoupling");
//        add(DCItems.INFINITY_CLASS_IRON_SHAPESTEEL.get(),"Infinity Class Iron ShapeSteel");
//        add(DCItems.INFINITY_CLASS_IRON_SPRING.get(),"Infinity Class Iron Spring");
        
        //Basic Class Machine Component Circuit
        add(DCItems.BASIC_PRECISION_BEARING_INSCRIBED_CIRCUIT.get(),"Basic Precision Bearing Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_BOLT_INSCRIBED_CIRCUIT.get(),"Basic Precision Bolt Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_KEY_INSCRIBED_CIRCUIT.get(),"Basic Precision Key Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_CAM_INSCRIBED_CIRCUIT.get(),"Basic Precision Cam Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_CHAIN_INSCRIBED_CIRCUIT.get(),"Basic Precision Chain Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_GEAR_INSCRIBED_CIRCUIT.get(),"Basic Precision Gear Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_JOINT_INSCRIBED_CIRCUIT.get(),"Basic Precision Joint Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_NUT_INSCRIBED_CIRCUIT.get(), "Basic Precision Nut Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_PIPE_INSCRIBED_CIRCUIT.get(), "Basic Precision Pipe Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_PIPEJOINT_INSCRIBED_CIRCUIT.get(), "Basic Precision Pipejoint Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_PLATE_INSCRIBED_CIRCUIT.get(), "Basic Precision Plate Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_ROD_INSCRIBED_CIRCUIT.get(), "Basic Precision Rod Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_SHAFT_INSCRIBED_CIRCUIT.get(), "Basic Precision Shaft Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_SHAFTCOUPLING_INSCRIBED_CIRCUIT.get(), "Basic Precision Shaftcoupling Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_SHAPESTEEL_INSCRIBED_CIRCUIT.get(), "Basic Precision Shapesteel Inscribed Circuit");
        add(DCItems.BASIC_PRECISION_SPRING_INSCRIBED_CIRCUIT.get(), "Basic Precision Spring Inscribed Circuit");

        add(DCItems.COMPRESSED_PLANKS.get(), "Compressed Planks");
        add(DCItems.COMPRESSED_REDSTONE.get(), "Compressed Redstone");

        add(DCItems.SIMPLE_CONVEX_LENS.get(), "Simple Convex Lens");
        add(DCItems.SIMPLE_CONCAVE_LENS.get(), "Simple Concave Lens");

        add(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get(), "Multiblock Structure Hologram Visualizer");
        add(DCItems.MACHINE_HALT_DEVICE.get(), "Machine Halt Device");

        add(DCItems.BASIC_CIRCUIT.get(), "Basic Circuit");
        add(DCItems.BASIC_INSCRIBED_CIRCUIT.get(), "Basic Inscribed Circuit");
        add(DCItems.BASIC_MACHINE_SCREEN.get(), "Basic Machine Screen");
        add(DCItems.BASIC_MOTOR.get(), "Basic Motor");
        add(DCItems.BASIC_REDSTONE_BATTERY.get(), "Basic Redstone Battery");
        add(DCItems.BASIC_REINFORCED_PLATE.get(), "Basic Reinforced Plate");
        add(DCItems.BASIC_TURBINE.get(), "Basic Turbine");


        add(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get(), "Redstone Powered Machine Component Manufacture Machine");
        add(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get(), "Redstone Powered Machine Part Manufacture Machine");


        add(DCBlocks.REINFORCED_PLANKS.get(), "Reinforced Planks");

        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get(), "Basic Strength Multiblock Base Frame Block");
        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(), "Basic Strength Multiblock Machine Frame Block");
        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(), "Basic Strength Multiblock Structure Frame Block");
        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), "Basic Strength Multiblock Structure Glass Block");

        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(), "Basic Strength Multiblock Energy Storage Block");
        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(), "Basic Strength Multiblock Material Storage Block");

        add(PipeBlocks.BASIC_ITEM_PIPE_BLOCK, "Basic Item Pipe");
        add(PipeBlocks.BASIC_ENERGY_PIPE_BLOCK, "Basic Energy Pipe");

//        add(DCBlocks.LOW_STERNGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),"Low Strength Multiblock Machine Frame Block");
        add(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.get(), "Low Strength Multiblock Structure Frame Block");
        add(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get(), "Low Strength Multiblock Structure Glass Block");

        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(), "Basic Strength Multiblock Base Frame Block (Hologram)");
        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), "Basic Strength Multiblock Machine Frame Block (Hologram)");
        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), "Basic Strength Multiblock Structure Frame Block (Hologram)");
        add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), "Basic Strength Multiblock Structure Glass Block (Hologram)");

        add(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK.get(), "Basic Power Composite Structure Type Thermal Generator");
        add(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(), "Basic Machine Element Processor");
        add(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get(), "Basic Technology Universal Assembler");


        add(DCBlocks.PULVERIZER_BLOCK.get(), "Pulverizer");


        add(DCUniqueBlocks.SIMPLE_TELESCOPE_RIGHT_PILLAR.get(), "Simple Telescope Right Pillar");
        add(DCUniqueBlocks.SIMPLE_TELESCOPE_LEFT_PILLAR.get(), "Simple Telescope Left Pillar");

        add("message." + "degeneracycraft_redstone_powered_machine_element_manufacture_machine", "Phase 0 Initial");
        add("screen." + "degeneracycraft_pulverizer", "Pulverizer Screen");
        add("jei." + "degeneracycraft_redstone_powered_machine_element_manufacture_machine", "Redstone Powered Machine Element Manufacture Machine Recipe");
        add("jei." + "degeneracycraft_redstone_powered_machine_part_manufacture_machine", "Redstone Powered Machine Part Manufacture Machine Recipe");

        add("jei." + "degeneracycraft_basic_machine_element_processor", "Basic Machine Part Processor Recipe");

        add("itemGroup." + "degeneracycraft_machine_components", "DegeneracyCraft Components");
        add("itemGroup." + "degeneracycraft_machine_parts", "DegeneracyCraft Parts");

        add("itemGroup." + "degeneracycraft_machine", "DegeneracyCraft Machines");
        add("itemGroup." + "degeneracycraft_multiplied_ore_material", "DegeneracyCraft Multiplied Ore Material");
        add("itemGroup." + "degeneracycraft_ore", "DegeneracyCraft Ore");

        add("screen." + "degeneracycraft" + ".phase0", "Phase 0");
        add("screen." + "degeneracycraft" + ".phase1", "Phase 1");


        add("screen." + "degeneracycraft" + ".halt", "Halt");

        add("screen." + "degeneracycraft_besic_power_composite_structure_type_thermal_generator" + ".burntime", "BurnTime");

        add("screen." + "degeneracycraft_generator" + ".output", "Output");
        add("screen." + "degeneracycraft_generator" + ".modifier", "Modifier");

        add("screen." + "degeneracycraft_generator" + ".power_output_16", "16 FE/t");
        add("screen." + "degeneracycraft_generator" + ".power_output_32", "32 FE/t");

        add("screen." + "degeneracycraft" + ".power_modifier_1", "×1.00");
        add("screen." + "degeneracycraft" + ".power_modifier_2", "×2.00");


        add("tooltip." + "degeneracycraft" + ".wrench", "Export → Import → DisConnection → Export... Pipe Mode change by shift light click");
        add("tooltip." + "degeneracycraft" + ".wrenchitem", "Show Wrench Detail by shift key");
        add("tooltip." + "degeneracycraft" + ".tooltipitem", "Show Material Detail by shift key");

        add("tooltip." + "degeneracycraft." + "ipp." + "initial", "Industrial Progress Phase:Phase0");
        add("tooltip." + "degeneracycraft." + "ipp." + "basic", "Industrial Progress Phase:Phase1");
        add("tooltip." + "degeneracycraft." + "ipp." + "low", "Industrial Progress Phase:Phase2");
        add("tooltip." + "degeneracycraft." + "ipp." + "medium", "Industrial Progress Phase:Phase3");
        add("tooltip." + "degeneracycraft." + "ipp." +"high", "Industrial Progress Phase:Phase4");
        add("tooltip." + "degeneracycraft." + "ipp." + "super", "Industrial Progress Phase:Phase5");
        add("tooltip." + "degeneracycraft." + "ipp." + "Over", "Industrial Progress Phase:Phase6");
        add("tooltip." + "degeneracycraft." + "ipp." + "ultra", "Industrial Progress Phase:Phase7");
        add("tooltip." + "degeneracycraft." + "ipp." +"anti", "Industrial Progress Phase:Phase8");
        add("tooltip." + "degeneracycraft." + "ipp." +"imaginary", "Industrial Progress Phase:Phase9");
        add("tooltip." + "degeneracycraft." + "ipp." +"infinity", "Industrial Progress Phase:PhaseInf");

        add("tooltip." + "degeneracycraft." + "iron" + ".name", "Material Name:Iron");
        add("tooltip." + "degeneracycraft." + "iron" + ".number", "Atomic Number:26");
        add("tooltip." + "degeneracycraft." + "iron" + ".weight", "Atomic Weight:55.85 g/mol");
        add("tooltip." + "degeneracycraft." + "iron" + ".melting", "Melting Point:1811 K");
        add("tooltip." + "degeneracycraft." + "iron" + ".boiling", "Boiling Point:3134 K");
        add("tooltip." + "degeneracycraft." + "iron" + ".formula", "Chemical Formula:Fe");

        add("tooltip." + "degeneracycraft." + "requiredenergy.", "Required Energy:");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage.", "Required Energy Usage:");
        add("tooltip." + "degeneracycraft." + "requiredtime.", "Required time:");
        add("tooltip." + "degeneracycraft." + "sec.", " Sec");

        add("tooltip." + "degeneracycraft" + ".structure" + ".on", "Correct Multiblock Structure Detected!");
        add("tooltip." + "degeneracycraft" + ".structure" + ".off", "No Multiblock Structure");
        add("tooltip." + "degeneracycraft" + ".work", "Machine Working!");
        add("tooltip." + "degeneracycraft" + ".stop", "Machine Stopping!");
        add("tooltip." + "degeneracycraft" + ".power_modifier_1", "Power Modifier ×1.00");
        add("tooltip." + "degeneracycraft" + ".power_modifier_2", "Power Modifier ×2.00");

        add("tooltip." + "degeneracycraft" + ".halt", "Machine Forced Stop");


        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_bearing" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_bearing" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_bearing" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_bearing" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_bolt" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_bolt" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_bolt" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_bolt" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_cam" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_cam" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_cam" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_cam" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_chain" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_chain" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_chain" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_chain" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_gear" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_gear" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_gear" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_gear" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_joint" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_joint" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_joint" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_joint" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_key" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_key" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_key" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_key" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_nut" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_nut" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_nut" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_nut" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_pipe" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_pipe" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_pipe" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_pipe" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_pipejoint" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_pipejoint" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_pipejoint" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_pipejoint" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_plate" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_plate" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_plate" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_plate" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_rod" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_rod" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_rod" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_rod" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_shaft" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_shaft" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_shaft" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_shaft" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_shaftcoupling" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_shaftcoupling" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_shaftcoupling" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_shaftcoupling" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_shapesteel" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_shapesteel" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_shapesteel" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_shapesteel" + ".phase0", "Output Multiplication:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_spring" + ".phase0", "Required Energy:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_spring" + ".phase0", "Required Energy Usage:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_spring" + ".phase0", "Required time:100 tick (5 sec)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_spring" + ".phase0", "Output Multiplication:×1 ~ ×1");


        add("advancements." + "degeneracycraft" + ".astronomy" + ".title", "Astronomy");
        add("advancements." + "degeneracycraft" + ".astronomy" + ".description", "Aim at interstellar flight");

        add("advancements." + "degeneracycraft" + ".biology" + ".title", "Biology");
        add("advancements." + "degeneracycraft" + ".biology" + ".description", "Aim at helix decoding");

        add("advancements." + "degeneracycraft" + ".chemistry" + ".title", "Chemistry");
        add("advancements." + "degeneracycraft" + ".chemistry" + ".description", "Aim at reaction criticality");

        add("advancements." + "degeneracycraft" + ".title", "DegeneracyCraft");
        add("advancements." + "degeneracycraft" + ".description", "Beginning DegeneracyCraft");

        add("advancements." + "degeneracycraft" + ".dynamic_physics" + ".title", "Dynamic Physics");
        add("advancements." + "degeneracycraft" + ".dynamic_physics" + ".description", "Aim at phenomenon aggregation");

        add("advancements." + "degeneracycraft" + ".engineering" + ".title", "Engineering");
        add("advancements." + "degeneracycraft" + ".engineering" + ".description", "Aim for engineering integration");

        add("advancements." + "Rolling Gear" + ".title", "Rolling Gear(Girl)?");
        add("advancements." + "Rolling Gear" + ".description", "Make a Iron Gear");

        add("advancements." + "As a Substitute for Wire" + ".title", "As a Substitute for Wire");
        add("advancements." + "As a Substitute for Wire" + ".description", "Make a Iron Rod");


        add("advancements." + "degeneracycraft" + ".faux_magic_engineering" + ".title", "Faux Magic Engineering");
        add("advancements." + "degeneracycraft" + ".faux_magic_engineering" + ".description", "Aim at deciphering the mysteries");

        add("advancements." + "degeneracycraft" + ".geoscience" + ".title", "Geo Science");
        add("advancements." + "degeneracycraft" + ".geoscience" + ".description", "Aim at ores research");


        add("advancements." + "Awakening with \"The Fool\"" + ".title", "Awakening with \"The Fool\"");
        add("advancements." + "Awakening with \"The Fool\"" + ".description", "Make a Redstone Powered Machine Component Manufacture Machine");

        add("advancements." + "Call of Industry" + ".title", "Call of Industry");
        add("advancements." + "Call of Industry" + ".description", "Make a Basic Power Composite Structure Type Thermal Generator");


        add("degeneracycraft_introduction" + ".title", "DegeneracyCraftPedia");
        add("degeneracycraft_introduction" + ".landing",
                "This DegeneracyCraft is a mod for industrial romance! <br>It consists of 7 main areas and 10 phases!<br>This DegeneracyCraftPedia is the instruction manual for DegeneracyCraft!");
    }

}

package net.epitap.degeneracycraft.datagen;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.base.DCUniqueBlocks;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class DCLanguageProviderJA extends LanguageProvider {
    public DCLanguageProviderJA(DataGenerator gen, String locale) {
        super(gen, Degeneracycraft.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + "degeneracycraft", "Degeneracy Craft");
        add(DCBlocks.OVERWORLD_GRAVITATION_ORE.get(),"重力波鉱石");
//        add(DCBlocks.OVERWORLD_CASSITERITE_ORE.get(), "錫石");
//        add(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get(), "深層錫石");
//        add(DCBlocks.NETHER_CASSITERITE_ORE.get(), "ネザー錫石");
//        add(DCBlocks.END_CASSITERITE_ORE.get(), "エンド錫石");

        add(DCItems.RAW_BAUXITE_ORE.get(), "鉄ばん土鉱の原石");
        add(DCItems.BAUXITE_DUST.get(),"鉄ばん土鉱の粉");
        add(DCItems.BAUXITE_PUREDUST.get(),"鉄ばん土鉱の純粋な粉");
        add(DCItems.BAUXITE_LEACHATE.get(),"鉄ばん土鉱の浸出液");
        add(DCItems.BAUXITE_CONCENTRATE.get(),"鉄ばん土鉱の濃縮液");
        add(DCItems.BAUXITE_PLASMA.get(),"鉄ばん土鉱のプラズマ");
        add(DCItems.BAUXITE_DEGENERATEMATTER.get(),"鉄ばん土鉱の縮退物質");
        add(DCItems.BAUXITE_SOUP.get(),"鉄ばん土鉱のスープ");
        add(DCItems.BAUXITE_IMAGINARYMATTER.get(),"鉄ばん土鉱の虚数物質");
        add(DCItems.STABLE_BAUXITE_IMAGINARYMATTER.get(),"安定した鉄ばん土鉱の虚数物質");
        add(DCItems.BAUXITE_TACHYON.get(),"鉄ばん土鉱のタキオン");
        add(DCItems.BAUXITE_ANTIMATTER.get(),"鉄ばん土鉱の反物質");
        add(DCItems.BAUXITE_ULTRAHOTPLASMA.get(), "鉄ばん土鉱の超高温プラズマ");
        add(DCItems.BAUXITE_OVERFLUID.get(), "鉄ばん土鉱の過流動体");
        add(DCItems.BAUXITE_CRYSTAL.get(), "鉄ばん土鉱の結晶塊");
        add(DCItems.BAUXITE_PRECIPITATE.get(),"鉄ばん土鉱の沈殿物");
        add(DCItems.BAUXITE_WASHEDDUST.get(),"鉄ばん土鉱の洗浄された粉");
        add(DCItems.BAUXITE_ORESINTER.get(),"鉄ばん土鉱の焼結鉱");
        add(DCItems.BAUXITE_INGOT.get(), "鉄ばん土鉱インゴット");
        //
        add(DCItems.RAW_BERYL_ORE.get(), "緑柱石の原石");
        add(DCItems.BERYL_DUST.get(),"緑柱石の粉");
        add(DCItems.BERYL_PUREDUST.get(),"緑柱石の純粋な粉");
        add(DCItems.BERYL_LEACHATE.get(),"緑柱石の浸出液");
        add(DCItems.BERYL_CONCENTRATE.get(),"緑柱石の濃縮液");
        add(DCItems.BERYL_PLASMA.get(),"緑柱石のプラズマ");
        add(DCItems.BERYL_DEGENERATEMATTER.get(),"緑柱石の縮退物質");
        add(DCItems.BERYL_SOUP.get(),"緑柱石のスープ");
        add(DCItems.BERYL_IMAGINARYMATTER.get(),"緑柱石の虚数物質");
        add(DCItems.STABLE_BERYL_IMAGINARYMATTER.get(),"安定した緑柱石の虚数物質");
        add(DCItems.BERYL_TACHYON.get(),"緑柱石のタキオン");
        add(DCItems.BERYL_ANTIMATTER.get(),"緑柱石の反物質");
        add(DCItems.BERYL_ULTRAHOTPLASMA.get(), "緑柱石の超高温プラズマ");
        add(DCItems.BERYL_OVERFLUID.get(), "緑柱石の過流動体");
        add(DCItems.BERYL_CRYSTAL.get(), "緑柱石の結晶塊");
        add(DCItems.BERYL_PRECIPITATE.get(),"緑柱石の沈殿物");
        add(DCItems.BERYL_WASHEDDUST.get(),"緑柱石の洗浄された粉");
        add(DCItems.BERYL_ORESINTER.get(),"緑柱石の焼結鉱");
        add(DCItems.BERYL_INGOT.get(), "緑柱石インゴット");
        //
        add(DCItems.RAW_BORAX_ORE.get(), "ホウ砂の原石");
        add(DCItems.BORAX_DUST.get(),"ホウ砂の粉");
        add(DCItems.BORAX_PUREDUST.get(),"ホウ砂の純粋な粉");
        add(DCItems.BORAX_LEACHATE.get(),"ホウ砂の浸出液");
        add(DCItems.BORAX_CONCENTRATE.get(),"ホウ砂の濃縮液");
        add(DCItems.BORAX_PLASMA.get(),"ホウ砂のプラズマ");
        add(DCItems.BORAX_DEGENERATEMATTER.get(),"ホウ砂の縮退物質");
        add(DCItems.BORAX_SOUP.get(),"ホウ砂のスープ");
        add(DCItems.BORAX_IMAGINARYMATTER.get(),"ホウ砂の虚数物質");
        add(DCItems.STABLE_BORAX_IMAGINARYMATTER.get(),"安定したホウ砂の虚数物質");
        add(DCItems.BORAX_TACHYON.get(),"ホウ砂のタキオン");
        add(DCItems.BORAX_ANTIMATTER.get(),"ホウ砂の反物質");
        add(DCItems.BORAX_ULTRAHOTPLASMA.get(), "ホウ砂の超高温プラズマ");
        add(DCItems.BORAX_OVERFLUID.get(), "ホウ砂の過流動体");
        add(DCItems.BORAX_CRYSTAL.get(), "ホウ砂の結晶塊");
        add(DCItems.BORAX_PRECIPITATE.get(),"ホウ砂の沈殿物");
        add(DCItems.BORAX_WASHEDDUST.get(),"ホウ砂の洗浄された粉");
        add(DCItems.BORAX_ORESINTER.get(),"ホウ砂の焼結鉱");
        add(DCItems.BORAX_INGOT.get(), "ホウ砂インゴット");
        //
        add(DCItems.RAW_CASSITERITE_ORE.get(), "錫石の原石");
        add(DCItems.CASSITERITE_DUST.get(),"錫石の粉");
        add(DCItems.CASSITERITE_PUREDUST.get(),"錫石の純粋な粉");
        add(DCItems.CASSITERITE_LEACHATE.get(),"錫石の浸出液");
        add(DCItems.CASSITERITE_CONCENTRATE.get(),"錫石の濃縮液");
        add(DCItems.CASSITERITE_PLASMA.get(),"錫石のプラズマ");
        add(DCItems.CASSITERITE_DEGENERATEMATTER.get(),"錫石の縮退物質");
        add(DCItems.CASSITERITE_SOUP.get(),"錫石のスープ");
        add(DCItems.CASSITERITE_IMAGINARYMATTER.get(),"錫石の虚数物質");
        add(DCItems.STABLE_CASSITERITE_IMAGINARYMATTER.get(),"安定した錫石の虚数物質");
        add(DCItems.CASSITERITE_TACHYON.get(),"錫石のタキオン");
        add(DCItems.CASSITERITE_ANTIMATTER.get(),"錫石の反物質");
        add(DCItems.CASSITERITE_ULTRAHOTPLASMA.get(), "錫石の超高温プラズマ");
        add(DCItems.CASSITERITE_OVERFLUID.get(), "錫石の過流動体");
        add(DCItems.CASSITERITE_CRYSTAL.get(), "錫石の結晶塊");
        add(DCItems.CASSITERITE_PRECIPITATE.get(),"錫石の沈殿物");
        add(DCItems.CASSITERITE_WASHEDDUST.get(),"錫石の洗浄された粉");
        add(DCItems.CASSITERITE_ORESINTER.get(),"錫石の焼結鉱");
        add(DCItems.CASSITERITE_INGOT.get(), "錫石インゴット");
        //
        add(DCItems.RAW_CHROMITE_ORE.get(), "クロム鉄鉱の原石");
        add(DCItems.CHROMITE_DUST.get(),"クロム鉄鉱の粉");
        add(DCItems.CHROMITE_PUREDUST.get(),"クロム鉄鉱の純粋な粉");
        add(DCItems.CHROMITE_LEACHATE.get(),"クロム鉄鉱の浸出液");
        add(DCItems.CHROMITE_CONCENTRATE.get(),"クロム鉄鉱の濃縮液");
        add(DCItems.CHROMITE_PLASMA.get(),"クロム鉄鉱のプラズマ");
        add(DCItems.CHROMITE_DEGENERATEMATTER.get(),"クロム鉄鉱の縮退物質");
        add(DCItems.CHROMITE_SOUP.get(),"クロム鉄鉱のスープ");
        add(DCItems.CHROMITE_IMAGINARYMATTER.get(),"クロム鉄鉱の虚数物質");
        add(DCItems.STABLE_CHROMITE_IMAGINARYMATTER.get(),"安定したクロム鉄鉱の虚数物質");
        add(DCItems.CHROMITE_TACHYON.get(),"クロム鉄鉱のタキオン");
        add(DCItems.CHROMITE_ANTIMATTER.get(),"クロム鉄鉱の反物質");
        add(DCItems.CHROMITE_ULTRAHOTPLASMA.get(), "クロム鉄鉱の超高温プラズマ");
        add(DCItems.CHROMITE_OVERFLUID.get(), "クロム鉄鉱の過流動体");
        add(DCItems.CHROMITE_CRYSTAL.get(), "クロム鉄鉱の結晶塊");
        add(DCItems.CHROMITE_PRECIPITATE.get(),"クロム鉄鉱の沈殿物");
        add(DCItems.CHROMITE_WASHEDDUST.get(),"クロム鉄鉱の洗浄された粉");
        add(DCItems.CHROMITE_ORESINTER.get(),"クロム鉄鉱の焼結鉱");
        add(DCItems.CHROMITE_INGOT.get(), "クロム鉄鉱インゴット");
        //
        add(DCItems.RAW_FLUORITE_ORE.get(), "蛍石の原石");
        add(DCItems.FLUORITE_DUST.get(),"蛍石の粉");
        add(DCItems.FLUORITE_PUREDUST.get(),"蛍石の純粋な粉");
        add(DCItems.FLUORITE_LEACHATE.get(),"蛍石の浸出液");
        add(DCItems.FLUORITE_CONCENTRATE.get(),"蛍石の濃縮液");
        add(DCItems.FLUORITE_PLASMA.get(),"蛍石のプラズマ");
        add(DCItems.FLUORITE_DEGENERATEMATTER.get(),"蛍石の縮退物質");
        add(DCItems.FLUORITE_SOUP.get(),"蛍石のスープ");
        add(DCItems.FLUORITE_IMAGINARYMATTER.get(),"蛍石の虚数物質");
        add(DCItems.STABLE_FLUORITE_IMAGINARYMATTER.get(),"安定した蛍石の虚数物質");
        add(DCItems.FLUORITE_TACHYON.get(),"蛍石のタキオン");
        add(DCItems.FLUORITE_ANTIMATTER.get(),"蛍石の反物質");
        add(DCItems.FLUORITE_ULTRAHOTPLASMA.get(), "蛍石の超高温プラズマ");
        add(DCItems.FLUORITE_OVERFLUID.get(), "蛍石の過流動体");
        add(DCItems.FLUORITE_CRYSTAL.get(), "蛍石の結晶塊");
        add(DCItems.FLUORITE_PRECIPITATE.get(),"蛍石の沈殿物");
        add(DCItems.FLUORITE_WASHEDDUST.get(),"蛍石の洗浄された粉");
        add(DCItems.FLUORITE_ORESINTER.get(),"蛍石の焼結鉱");
        add(DCItems.FLUORITE_INGOT.get(), "蛍石インゴット");
        //
        add(DCItems.RAW_GRAVITATION_ORE.get(), "重力の原石");
        add(DCItems.GRAVITATION_INGOT.get(), "重力インゴット");
        //
        add(DCItems.RAW_GRAPHITE_ORE.get(), "黒鉛の原石");
        add(DCItems.GRAPHITE_DUST.get(),"黒鉛の粉");
        add(DCItems.GRAPHITE_PUREDUST.get(),"黒鉛の純粋な粉");
        add(DCItems.GRAPHITE_LEACHATE.get(),"黒鉛の浸出液");
        add(DCItems.GRAPHITE_CONCENTRATE.get(),"黒鉛の濃縮液");
        add(DCItems.GRAPHITE_PLASMA.get(),"黒鉛のプラズマ");
        add(DCItems.GRAPHITE_DEGENERATEMATTER.get(),"黒鉛の縮退物質");
        add(DCItems.GRAPHITE_SOUP.get(),"黒鉛のスープ");
        add(DCItems.GRAPHITE_IMAGINARYMATTER.get(),"黒鉛の虚数物質");
        add(DCItems.STABLE_GRAPHITE_IMAGINARYMATTER.get(),"安定した黒鉛の虚数物質");
        add(DCItems.GRAPHITE_TACHYON.get(), "黒鉛のタキオン");
        add(DCItems.GRAPHITE_ANTIMATTER.get(), "黒鉛の反物質");
        add(DCItems.GRAPHITE_ULTRAHOTPLASMA.get(), "黒鉛の超高温プラズマ");
        add(DCItems.GRAPHITE_OVERFLUID.get(), "黒鉛の過流動体");
        add(DCItems.GRAPHITE_CRYSTAL.get(), "黒鉛の結晶塊");
        add(DCItems.GRAPHITE_PRECIPITATE.get(), "黒鉛の沈殿物");
        add(DCItems.GRAPHITE_WASHEDDUST.get(), "黒鉛の洗浄された粉");
        add(DCItems.GRAPHITE_ORESINTER.get(), "黒鉛の焼結鉱");
        add(DCItems.GRAPHITE_INGOT.get(), "黒鉛インゴット");
        //
//        add(DCItems.IRON_DUST.get(),"鉄の粉");
//        add(DCItems.IRON_PUREDUST.get(),"鉄の純粋な粉");
//        add(DCItems.IRON_LEACHATE.get(),"鉄の浸出液");
//        add(DCItems.IRON_CONCENTRATE.get(),"鉄の濃縮液");
//        add(DCItems.IRON_PLASMA.get(),"鉄のプラズマ");
//        add(DCItems.IRON_DEGENERATEMATTER.get(),"鉄の縮退物質");
//        add(DCItems.IRON_SOUP.get(),"鉄のスープ");
//        add(DCItems.IRON_IMAGINARYMATTER.get(),"鉄の虚数物質");
//        add(DCItems.STABLE_IRON_IMAGINARYMATTER.get(),"安定した鉄の虚数物質");
//        add(DCItems.IRON_TACHYON.get(),"鉄のタキオン");
//        add(DCItems.IRON_ANTIMATTER.get(),"鉄の反物質");
//        add(DCItems.IRON_ULTRAHOTPLASMA.get(), "鉄の超高温プラズマ");
//        add(DCItems.IRON_OVERFLUID.get(), "鉄の過流動体");
//        add(DCItems.IRON_CRYSTAL.get(), "鉄の結晶塊");
//        add(DCItems.IRON_PRECIPITATE.get(),"鉄の沈殿物");
//        add(DCItems.IRON_WASHEDDUST.get(),"鉄の洗浄された粉");
//        add(DCItems.IRON_ORESINTER.get(),"鉄の焼結鉱");
        //
        add(DCItems.RAW_LATERITE_ORE.get(), "紅土鉱の原石");
        add(DCItems.LATERITE_DUST.get(), "紅土鉱の粉");
        add(DCItems.LATERITE_PUREDUST.get(), "紅土鉱の純粋な粉");
        add(DCItems.LATERITE_LEACHATE.get(), "紅土鉱の浸出液");
        add(DCItems.LATERITE_CONCENTRATE.get(), "紅土鉱の濃縮液");
        add(DCItems.LATERITE_PLASMA.get(), "紅土鉱のプラズマ");
        add(DCItems.LATERITE_DEGENERATEMATTER.get(), "紅土鉱の縮退物質");
        add(DCItems.LATERITE_SOUP.get(), "紅土鉱のスープ");
        add(DCItems.LATERITE_IMAGINARYMATTER.get(), "紅土鉱の虚数物質");
        add(DCItems.STABLE_LATERITE_IMAGINARYMATTER.get(),"安定した紅土鉱の虚数物質");
        add(DCItems.LATERITE_TACHYON.get(),"紅土鉱のタキオン");
        add(DCItems.LATERITE_ANTIMATTER.get(),"紅土鉱の反物質");
        add(DCItems.LATERITE_ULTRAHOTPLASMA.get(), "紅土鉱の超高温プラズマ");
        add(DCItems.LATERITE_OVERFLUID.get(), "紅土鉱の過流動体");
        add(DCItems.LATERITE_CRYSTAL.get(), "紅土鉱の結晶塊");
        add(DCItems.LATERITE_PRECIPITATE.get(),"紅土鉱の沈殿物");
        add(DCItems.LATERITE_WASHEDDUST.get(),"紅土鉱の洗浄された粉");
        add(DCItems.LATERITE_ORESINTER.get(),"紅土鉱の焼結鉱");
        add(DCItems.LATERITE_INGOT.get(), "紅土鉱インゴット");
        //
        add(DCItems.RAW_LIMESTONE_ORE.get(), "石灰石の原石");
        add(DCItems.LIMESTONE_DUST.get(),"石灰石の粉");
        add(DCItems.LIMESTONE_PUREDUST.get(),"石灰石の純粋な粉");
        add(DCItems.LIMESTONE_LEACHATE.get(),"石灰石の浸出液");
        add(DCItems.LIMESTONE_CONCENTRATE.get(),"石灰石の濃縮液");
        add(DCItems.LIMESTONE_PLASMA.get(),"石灰石のプラズマ");
        add(DCItems.LIMESTONE_DEGENERATEMATTER.get(),"石灰石の縮退物質");
        add(DCItems.LIMESTONE_SOUP.get(),"石灰石のスープ");
        add(DCItems.LIMESTONE_IMAGINARYMATTER.get(),"石灰石の虚数物質");
        add(DCItems.STABLE_LIMESTONE_IMAGINARYMATTER.get(),"安定した石灰石の虚数物質");
        add(DCItems.LIMESTONE_TACHYON.get(), "石灰石のタキオン");
        add(DCItems.LIMESTONE_ANTIMATTER.get(), "石灰石の反物質");
        add(DCItems.LIMESTONE_ULTRAHOTPLASMA.get(), "石灰石の超高温プラズマ");
        add(DCItems.LIMESTONE_OVERFLUID.get(), "石灰石の過流動体");
        add(DCItems.LIMESTONE_CRYSTAL.get(), "石灰石の結晶塊");
        add(DCItems.LIMESTONE_PRECIPITATE.get(), "石灰石の沈殿物");
        add(DCItems.LIMESTONE_WASHEDDUST.get(), "石灰石の洗浄された粉");
        add(DCItems.LIMESTONE_ORESINTER.get(), "石灰石の焼結鉱");
        add(DCItems.LIMESTONE_INGOT.get(), "石灰石インゴット");
        //
        add(DCItems.RAW_PENTLANDITE_ORE.get(), "ペントランド鉱の原石");
        add(DCItems.PENTLANDITE_DUST.get(), "ペントランド鉱の粉");
        add(DCItems.PENTLANDITE_PUREDUST.get(), "ペントランド鉱の純粋な粉");
        add(DCItems.PENTLANDITE_LEACHATE.get(), "ペントランド鉱の浸出液");
        add(DCItems.PENTLANDITE_CONCENTRATE.get(), "ペントランド鉱の濃縮液");
        add(DCItems.PENTLANDITE_PLASMA.get(), "ペントランド鉱のプラズマ");
        add(DCItems.PENTLANDITE_DEGENERATEMATTER.get(), "ペントランド鉱の縮退物質");
        add(DCItems.PENTLANDITE_SOUP.get(), "ペントランド鉱のスープ");
        add(DCItems.PENTLANDITE_IMAGINARYMATTER.get(), "ペントランド鉱の虚数物質");
        add(DCItems.STABLE_PENTLANDITE_IMAGINARYMATTER.get(), "安定したペントランド鉱の虚数物質");
        add(DCItems.PENTLANDITE_TACHYON.get(), "ペントランド鉱のタキオン");
        add(DCItems.PENTLANDITE_ANTIMATTER.get(), "ペントランド鉱の反物質");
        add(DCItems.PENTLANDITE_ULTRAHOTPLASMA.get(), "ペントランド鉱の超高温プラズマ");
        add(DCItems.PENTLANDITE_OVERFLUID.get(), "ペントランド鉱の過流動体");
        add(DCItems.PENTLANDITE_CRYSTAL.get(), "ペントランド鉱の結晶塊");
        add(DCItems.PENTLANDITE_PRECIPITATE.get(), "ペントランド鉱の沈殿物");
        add(DCItems.PENTLANDITE_WASHEDDUST.get(), "ペントランド鉱の洗浄された粉");
        add(DCItems.PENTLANDITE_ORESINTER.get(), "ペントランド鉱の焼結鉱");
        add(DCItems.PENTLANDITE_INGOT.get(), "ペントランド鉱インゴット");
        //
        add(DCItems.RAW_PHOSPHORITE_ORE.get(), "リン鉱石の原石");
        add(DCItems.PHOSPHORITE_DUST.get(), "リン鉱石の粉");
        add(DCItems.PHOSPHORITE_PUREDUST.get(), "リン鉱石の純粋な粉");
        add(DCItems.PHOSPHORITE_LEACHATE.get(), "リン鉱石の浸出液");
        add(DCItems.PHOSPHORITE_CONCENTRATE.get(), "リン鉱石の濃縮液");
        add(DCItems.PHOSPHORITE_PLASMA.get(), "リン鉱石のプラズマ");
        add(DCItems.PHOSPHORITE_DEGENERATEMATTER.get(), "リン鉱石の縮退物質");
        add(DCItems.PHOSPHORITE_SOUP.get(), "リン鉱石のスープ");
        add(DCItems.PHOSPHORITE_IMAGINARYMATTER.get(), "リン鉱石の虚数物質");
        add(DCItems.STABLE_PHOSPHORITE_IMAGINARYMATTER.get(), "安定したリン鉱石の虚数物質");
        add(DCItems.PHOSPHORITE_TACHYON.get(),"リン鉱石のタキオン");
        add(DCItems.PHOSPHORITE_ANTIMATTER.get(),"リン鉱石の反物質");
        add(DCItems.PHOSPHORITE_ULTRAHOTPLASMA.get(), "リン鉱石の超高温プラズマ");
        add(DCItems.PHOSPHORITE_OVERFLUID.get(), "リン鉱石の過流動体");
        add(DCItems.PHOSPHORITE_CRYSTAL.get(), "リン鉱石の結晶塊");
        add(DCItems.PHOSPHORITE_PRECIPITATE.get(),"リン鉱石の沈殿物");
        add(DCItems.PHOSPHORITE_WASHEDDUST.get(),"リン鉱石の洗浄された粉");
        add(DCItems.PHOSPHORITE_ORESINTER.get(),"リン鉱石の焼結鉱");
        add(DCItems.PHOSPHORITE_INGOT.get(), "リン鉱石インゴット");
        //
        add(DCItems.RAW_PYROLUSITE_ORE.get(), "軟マンガン鉱の原石");
        add(DCItems.PYROLUSITE_DUST.get(),"軟マンガン鉱の粉");
        add(DCItems.PYROLUSITE_PUREDUST.get(),"軟マンガン鉱の純粋な粉");
        add(DCItems.PYROLUSITE_LEACHATE.get(),"軟マンガン鉱の浸出液");
        add(DCItems.PYROLUSITE_CONCENTRATE.get(),"軟マンガン鉱の濃縮液");
        add(DCItems.PYROLUSITE_PLASMA.get(),"軟マンガン鉱のプラズマ");
        add(DCItems.PYROLUSITE_DEGENERATEMATTER.get(),"軟マンガン鉱の縮退物質");
        add(DCItems.PYROLUSITE_SOUP.get(),"軟マンガン鉱のスープ");
        add(DCItems.PYROLUSITE_IMAGINARYMATTER.get(),"軟マンガン鉱の虚数物質");
        add(DCItems.STABLE_PYROLUSITE_IMAGINARYMATTER.get(), "安定した軟マンガン鉱の虚数物質");
        add(DCItems.PYROLUSITE_TACHYON.get(), "軟マンガン鉱のタキオン");
        add(DCItems.PYROLUSITE_ANTIMATTER.get(), "軟マンガン鉱の反物質");
        add(DCItems.PYROLUSITE_ULTRAHOTPLASMA.get(), "軟マンガン鉱の超高温プラズマ");
        add(DCItems.PYROLUSITE_OVERFLUID.get(), "軟マンガン鉱の過流動体");
        add(DCItems.PYROLUSITE_CRYSTAL.get(), "軟マンガン鉱の結晶塊");
        add(DCItems.PYROLUSITE_PRECIPITATE.get(), "軟マンガン鉱の沈殿物");
        add(DCItems.PYROLUSITE_WASHEDDUST.get(), "軟マンガン鉱の洗浄された粉");
        add(DCItems.PYROLUSITE_ORESINTER.get(), "軟マンガン鉱の焼結鉱");
        add(DCItems.PYROLUSITE_INGOT.get(), "軟マンガン鉱インゴット");
        //
        add(DCItems.RAW_QUARTZ_ORE.get(), "石英の原石");
        add(DCItems.QUARTZ_DUST.get(), "石英の粉");
        add(DCItems.QUARTZ_PUREDUST.get(), "石英の純粋な粉");
        add(DCItems.QUARTZ_LEACHATE.get(), "石英の浸出液");
        add(DCItems.QUARTZ_CONCENTRATE.get(), "石英の濃縮液");
        add(DCItems.QUARTZ_PLASMA.get(), "石英のプラズマ");
        add(DCItems.QUARTZ_DEGENERATEMATTER.get(), "石英の縮退物質");
        add(DCItems.QUARTZ_SOUP.get(), "石英のスープ");
        add(DCItems.QUARTZ_IMAGINARYMATTER.get(), "石英の虚数物質");
        add(DCItems.STABLE_QUARTZ_IMAGINARYMATTER.get(), "安定した石英の虚数物質");
        add(DCItems.QUARTZ_TACHYON.get(), "石英のタキオン");
        add(DCItems.QUARTZ_ANTIMATTER.get(), "石英の反物質");
        add(DCItems.QUARTZ_ULTRAHOTPLASMA.get(), "石英の超高温プラズマ");
        add(DCItems.QUARTZ_OVERFLUID.get(), "石英の過流動体");
        add(DCItems.QUARTZ_CRYSTAL.get(), "石英の結晶塊");
        add(DCItems.QUARTZ_PRECIPITATE.get(), "石英の沈殿物");
        add(DCItems.QUARTZ_WASHEDDUST.get(), "石英の洗浄された粉");
        add(DCItems.QUARTZ_ORESINTER.get(), "石英の焼結鉱");
        add(DCItems.QUARTZ_INGOT.get(), "石英インゴット");
        //
        add(DCItems.RAW_RUTILE_ORE.get(), "金紅石の原石");
        add(DCItems.RUTILE_DUST.get(), "金紅石の粉");
        add(DCItems.RUTILE_PUREDUST.get(), "金紅石の純粋な粉");
        add(DCItems.RUTILE_LEACHATE.get(), "金紅石の浸出液");
        add(DCItems.RUTILE_CONCENTRATE.get(), "金紅石の濃縮液");
        add(DCItems.RUTILE_PLASMA.get(), "金紅石のプラズマ");
        add(DCItems.RUTILE_DEGENERATEMATTER.get(), "金紅石の縮退物質");
        add(DCItems.RUTILE_SOUP.get(), "金紅石のスープ");
        add(DCItems.RUTILE_IMAGINARYMATTER.get(), "金紅石の虚数物質");
        add(DCItems.STABLE_RUTILE_IMAGINARYMATTER.get(),"安定した金紅石の虚数物質");
        add(DCItems.RUTILE_TACHYON.get(),"金紅石のタキオン");
        add(DCItems.RUTILE_ANTIMATTER.get(),"金紅石の反物質");
        add(DCItems.RUTILE_ULTRAHOTPLASMA.get(), "金紅石の超高温プラズマ");
        add(DCItems.RUTILE_OVERFLUID.get(), "金紅石の過流動体");
        add(DCItems.RUTILE_CRYSTAL.get(), "金紅石の結晶塊");
        add(DCItems.RUTILE_PRECIPITATE.get(),"金紅石の沈殿物");
        add(DCItems.RUTILE_WASHEDDUST.get(),"金紅石の洗浄された粉");
        add(DCItems.RUTILE_ORESINTER.get(),"金紅石の焼結鉱");
        add(DCItems.RUTILE_INGOT.get(), "金紅石インゴット");
        //
        add(DCItems.RAW_SPODUMENE_ORE.get(), "リシア輝石の原石");
        add(DCItems.SPODUMENE_DUST.get(),"リシア輝石の粉");
        add(DCItems.SPODUMENE_PUREDUST.get(),"リシア輝石の純粋な粉");
        add(DCItems.SPODUMENE_LEACHATE.get(),"リシア輝石の浸出液");
        add(DCItems.SPODUMENE_CONCENTRATE.get(),"リシア輝石の濃縮液");
        add(DCItems.SPODUMENE_PLASMA.get(),"リシア輝石のプラズマ");
        add(DCItems.SPODUMENE_DEGENERATEMATTER.get(),"リシア輝石の縮退物質");
        add(DCItems.SPODUMENE_SOUP.get(),"リシア輝石のスープ");
        add(DCItems.SPODUMENE_IMAGINARYMATTER.get(),"リシア輝石の虚数物質");
        add(DCItems.STABLE_SPODUMENE_IMAGINARYMATTER.get(),"安定したリシア輝石の虚数物質");
        add(DCItems.SPODUMENE_TACHYON.get(),"リシア輝石のタキオン");
        add(DCItems.SPODUMENE_ANTIMATTER.get(),"リシア輝石の反物質");
        add(DCItems.SPODUMENE_ULTRAHOTPLASMA.get(), "リシア輝石の超高温プラズマ");
        add(DCItems.SPODUMENE_OVERFLUID.get(), "リシア輝石の過流動体");
        add(DCItems.SPODUMENE_CRYSTAL.get(), "リシア輝石の結晶塊");
        add(DCItems.SPODUMENE_PRECIPITATE.get(),"リシア輝石の沈殿物");
        add(DCItems.SPODUMENE_WASHEDDUST.get(),"リシア輝石の洗浄された粉");
        add(DCItems.SPODUMENE_ORESINTER.get(),"リシア輝石の焼結鉱");
        add(DCItems.SPODUMENE_INGOT.get(), "リシア輝石インゴット");
        //
        add(DCItems.RAW_SYLVITE_ORE.get(), "カリ岩塩の原石");
        add(DCItems.SYLVITE_DUST.get(),"カリ岩塩の粉");
        add(DCItems.SYLVITE_PUREDUST.get(),"カリ岩塩の純粋な粉");
        add(DCItems.SYLVITE_LEACHATE.get(),"カリ岩塩の浸出液");
        add(DCItems.SYLVITE_CONCENTRATE.get(),"カリ岩塩の濃縮液");
        add(DCItems.SYLVITE_PLASMA.get(),"カリ岩塩のプラズマ");
        add(DCItems.SYLVITE_DEGENERATEMATTER.get(),"カリ岩塩の縮退物質");
        add(DCItems.SYLVITE_SOUP.get(),"カリ岩塩のスープ");
        add(DCItems.SYLVITE_IMAGINARYMATTER.get(),"カリ岩塩の虚数物質");
        add(DCItems.STABLE_SYLVITE_IMAGINARYMATTER.get(),"安定したカリ岩塩の虚数物質");
        add(DCItems.SYLVITE_TACHYON.get(),"カリ岩塩のタキオン");
        add(DCItems.SYLVITE_ANTIMATTER.get(),"カリ岩塩の反物質");
        add(DCItems.SYLVITE_ULTRAHOTPLASMA.get(), "カリ岩塩の超高温プラズマ");
        add(DCItems.SYLVITE_OVERFLUID.get(), "カリ岩塩の過流動体");
        add(DCItems.SYLVITE_CRYSTAL.get(), "カリ岩塩の結晶塊");
        add(DCItems.SYLVITE_PRECIPITATE.get(),"カリ岩塩の沈殿物");
        add(DCItems.SYLVITE_WASHEDDUST.get(),"カリ岩塩の洗浄された粉");
        add(DCItems.SYLVITE_ORESINTER.get(),"カリ岩塩の焼結鉱");
        add(DCItems.SYLVITE_INGOT.get(), "カリ岩塩インゴット");
        //
        add(DCItems.RAW_ULEXITE_ORE.get(), "曹灰ホウ石の原石");
        add(DCItems.ULEXITE_DUST.get(),"曹灰ホウ石の粉");
        add(DCItems.ULEXITE_PUREDUST.get(),"曹灰ホウ石の純粋な粉");
        add(DCItems.ULEXITE_LEACHATE.get(),"曹灰ホウ石の浸出液");
        add(DCItems.ULEXITE_CONCENTRATE.get(),"曹灰ホウ石の濃縮液");
        add(DCItems.ULEXITE_PLASMA.get(),"曹灰ホウ石のプラズマ");
        add(DCItems.ULEXITE_DEGENERATEMATTER.get(),"曹灰ホウ石の縮退物質");
        add(DCItems.ULEXITE_SOUP.get(),"曹灰ホウ石のスープ");
        add(DCItems.ULEXITE_IMAGINARYMATTER.get(),"曹灰ホウ石の虚数物質");
        add(DCItems.STABLE_ULEXITE_IMAGINARYMATTER.get(),"安定した曹灰ホウ石の虚数物質");
        add(DCItems.ULEXITE_TACHYON.get(),"曹灰ホウ石のタキオン");
        add(DCItems.ULEXITE_ANTIMATTER.get(),"曹灰ホウ石の反物質");
        add(DCItems.ULEXITE_ULTRAHOTPLASMA.get(), "曹灰ホウ石の超高温プラズマ");
        add(DCItems.ULEXITE_OVERFLUID.get(), "曹灰ホウ石の過流動体");
        add(DCItems.ULEXITE_CRYSTAL.get(), "曹灰ホウ石の結晶塊");
        add(DCItems.ULEXITE_PRECIPITATE.get(),"曹灰ホウ石の沈殿物");
        add(DCItems.ULEXITE_WASHEDDUST.get(),"曹灰ホウ石の洗浄された粉");
        add(DCItems.ULEXITE_ORESINTER.get(),"曹灰ホウ石の焼結鉱");
        add(DCItems.ULEXITE_INGOT.get(), "曹灰ホウ石インゴット");
        //
        add(DCItems.RAW_VANADINITE_ORE.get(), "褐鉛鉱の原石");
        add(DCItems.VANADINITE_DUST.get(),"褐鉛鉱の粉");
        add(DCItems.VANADINITE_PUREDUST.get(),"褐鉛鉱の純粋な粉");
        add(DCItems.VANADINITE_LEACHATE.get(),"褐鉛鉱の浸出液");
        add(DCItems.VANADINITE_CONCENTRATE.get(),"褐鉛鉱の濃縮液");
        add(DCItems.VANADINITE_PLASMA.get(),"褐鉛鉱のプラズマ");
        add(DCItems.VANADINITE_DEGENERATEMATTER.get(),"褐鉛鉱の縮退物質");
        add(DCItems.VANADINITE_SOUP.get(),"褐鉛鉱のスープ");
        add(DCItems.VANADINITE_IMAGINARYMATTER.get(),"褐鉛鉱の虚数物質");
        add(DCItems.STABLE_VANADINITE_IMAGINARYMATTER.get(),"安定した褐鉛鉱の虚数物質");
        add(DCItems.VANADINITE_TACHYON.get(),"褐鉛鉱のタキオン");
        add(DCItems.VANADINITE_ANTIMATTER.get(),"褐鉛鉱の反物質");
        add(DCItems.VANADINITE_ULTRAHOTPLASMA.get(), "褐鉛鉱の超高温プラズマ");
        add(DCItems.VANADINITE_OVERFLUID.get(), "褐鉛鉱の過流動体");
        add(DCItems.VANADINITE_CRYSTAL.get(), "褐鉛鉱の結晶塊");
        add(DCItems.VANADINITE_PRECIPITATE.get(), "褐鉛鉱の沈殿物");
        add(DCItems.VANADINITE_WASHEDDUST.get(), "褐鉛鉱の洗浄された粉");
        add(DCItems.VANADINITE_ORESINTER.get(), "褐鉛鉱の焼結鉱");
        add(DCItems.VANADINITE_INGOT.get(), "褐鉛鉱インゴット");
        //Copper Machine Component
        add(DCItems.COPPER_BEARING.get(), "銅の軸受");
        add(DCItems.COPPER_BOLT.get(), "銅のボルト");
        add(DCItems.COPPER_CAM.get(), "銅のカム");
        add(DCItems.COPPER_CHAIN.get(), "銅のチェーン");
        add(DCItems.COPPER_GEAR.get(), "銅の歯車");
        add(DCItems.COPPER_JOINT.get(), "銅の継手");
        add(DCItems.COPPER_KEY.get(), "銅のキー");
        add(DCItems.COPPER_NUT.get(), "銅のナット");
        add(DCItems.COPPER_PIPE.get(), "銅の管");
        add(DCItems.COPPER_PIPEJOINT.get(), "銅の管継手");
        add(DCItems.COPPER_PLATE.get(), "銅の板");
        add(DCItems.COPPER_RIVET.get(), "銅のリベット");
        add(DCItems.COPPER_ROD.get(), "銅の棒");
        add(DCItems.COPPER_SHAFT.get(), "銅の軸");
        add(DCItems.COPPER_SHAFTCOUPLING.get(), "銅の軸継手");
        add(DCItems.COPPER_SHAPESTEEL.get(), "銅の型鋼");
        add(DCItems.COPPER_SPRING.get(), "銅のバネ");
        add(DCItems.COPPER_WIRE.get(), "銅のワイヤー");

        //Basic Class Iron Machine Component
        add(DCItems.IRON_BEARING.get(), "鉄の軸受");
        add(DCItems.IRON_BOLT.get(), "鉄のボルト");
        add(DCItems.IRON_CAM.get(), "鉄のカム");
        add(DCItems.IRON_CHAIN.get(), "鉄のチェーン");
        add(DCItems.IRON_GEAR.get(), "鉄の歯車");
        add(DCItems.IRON_JOINT.get(), "鉄の継手");
        add(DCItems.IRON_KEY.get(), "鉄のキー");
        add(DCItems.IRON_NUT.get(), "鉄のナット");
        add(DCItems.IRON_PIPE.get(), "鉄の管");
        add(DCItems.IRON_PIPEJOINT.get(), "鉄の管継手");
        add(DCItems.IRON_PLATE.get(), "鉄の板");
        add(DCItems.IRON_RIVET.get(), "鉄のリベット");
        add(DCItems.IRON_ROD.get(), "鉄の棒");
        add(DCItems.IRON_SHAFT.get(), "鉄の軸");
        add(DCItems.IRON_SHAFTCOUPLING.get(), "鉄の軸継手");
        add(DCItems.IRON_SHAPESTEEL.get(), "鉄の型鋼");
        add(DCItems.IRON_SPRING.get(), "鉄のバネ");
        add(DCItems.IRON_WIRE.get(), "鉄のワイヤー");

        //Basic Class Iron Machine Component
//        add(DCItems.BASIC_CLASS_IRON_BEARING.get(),"基本等級 鉄の軸受");
//        add(DCItems.BASIC_CLASS_IRON_BOLT.get(),"基本等級 鉄のボルト");
//        add(DCItems.BASIC_CLASS_IRON_CAM.get(),"基本等級 鉄のカム");
//        add(DCItems.BASIC_CLASS_IRON_CHAIN.get(),"基本等級 鉄のチェーン");
//        add(DCItems.BASIC_CLASS_IRON_GEAR.get(),"基本等級 鉄の歯車");
//        add(DCItems.BASIC_CLASS_IRON_JOINT.get(),"基本等級 鉄の継手");
//        add(DCItems.BASIC_CLASS_IRON_KEY.get(),"基本等級 鉄のキー");
//        add(DCItems.BASIC_CLASS_IRON_NUT.get(),"基本等級 鉄のナット");
//        add(DCItems.BASIC_CLASS_IRON_PIPE.get(),"基本等級 鉄の管");
//        add(DCItems.BASIC_CLASS_IRON_PIPEJOINT.get(),"基本等級 鉄の管継手");
//        add(DCItems.BASIC_CLASS_IRON_PLATE.get(),"基本等級 鉄の板");
//        add(DCItems.BASIC_CLASS_IRON_ROD.get(),"基本等級 鉄の棒");
//        add(DCItems.BASIC_CLASS_IRON_SHAFT.get(),"基本等級 鉄の軸");
//        add(DCItems.BASIC_CLASS_IRON_SHAFTCOUPLING.get(),"基本等級 鉄の軸継手");
//        add(DCItems.BASIC_CLASS_IRON_SHAPESTEEL.get(),"基本等級 鉄の型鋼");
//        add(DCItems.BASIC_CLASS_IRON_SPRING.get(),"基本等級 鉄のバネ");
//
//        //Low Class Iron Machine Component
//        add(DCItems.LOW_CLASS_IRON_BEARING.get(),"低等級 鉄の軸受");
//        add(DCItems.LOW_CLASS_IRON_BOLT.get(),"低等級 鉄のボルト");
//        add(DCItems.LOW_CLASS_IRON_CAM.get(),"低等級 鉄のカム");
//        add(DCItems.LOW_CLASS_IRON_CHAIN.get(),"低等級 鉄のチェーン");
//        add(DCItems.LOW_CLASS_IRON_GEAR.get(),"低等級 鉄の歯車");
//        add(DCItems.LOW_CLASS_IRON_JOINT.get(),"低等級 鉄の継手");
//        add(DCItems.LOW_CLASS_IRON_KEY.get(),"低等級 鉄のキー");
//        add(DCItems.LOW_CLASS_IRON_NUT.get(),"低等級 鉄のナット");
//        add(DCItems.LOW_CLASS_IRON_PIPE.get(),"低等級 鉄の管");
//        add(DCItems.LOW_CLASS_IRON_PIPEJOINT.get(),"低等級 鉄の管継手");
//        add(DCItems.LOW_CLASS_IRON_PLATE.get(),"低等級 鉄の板");
//        add(DCItems.LOW_CLASS_IRON_ROD.get(),"低等級 鉄の棒");
//        add(DCItems.LOW_CLASS_IRON_SHAFT.get(),"低等級 鉄の軸");
//        add(DCItems.LOW_CLASS_IRON_SHAFTCOUPLING.get(),"低等級 鉄の軸継手");
//        add(DCItems.LOW_CLASS_IRON_SHAPESTEEL.get(),"低等級 鉄の型鋼");
//        add(DCItems.LOW_CLASS_IRON_SPRING.get(),"低等級 鉄のバネ");
//
//        //Medium Class Iron Machine Component
//        add(DCItems.MEDIUM_CLASS_IRON_BEARING.get(),"中等級 鉄の軸受");
//        add(DCItems.MEDIUM_CLASS_IRON_BOLT.get(),"中等級 鉄のボルト");
//        add(DCItems.MEDIUM_CLASS_IRON_CAM.get(),"中等級 鉄のカム");
//        add(DCItems.MEDIUM_CLASS_IRON_CHAIN.get(),"中等級 鉄のチェーン");
//        add(DCItems.MEDIUM_CLASS_IRON_GEAR.get(),"中等級 鉄の歯車");
//        add(DCItems.MEDIUM_CLASS_IRON_JOINT.get(),"中等級 鉄の継手");
//        add(DCItems.MEDIUM_CLASS_IRON_KEY.get(),"中等級 鉄のキー");
//        add(DCItems.MEDIUM_CLASS_IRON_NUT.get(),"中等級 鉄のナット");
//        add(DCItems.MEDIUM_CLASS_IRON_PIPE.get(),"中等級 鉄の管");
//        add(DCItems.MEDIUM_CLASS_IRON_PIPEJOINT.get(),"中等級 鉄の管継手");
//        add(DCItems.MEDIUM_CLASS_IRON_PLATE.get(),"中等級 鉄の板");
//        add(DCItems.MEDIUM_CLASS_IRON_ROD.get(),"中等級 鉄の棒");
//        add(DCItems.MEDIUM_CLASS_IRON_SHAFT.get(),"中等級 鉄の軸");
//        add(DCItems.MEDIUM_CLASS_IRON_SHAFTCOUPLING.get(),"中等級 鉄の軸継手");
//        add(DCItems.MEDIUM_CLASS_IRON_SHAPESTEEL.get(),"中等級 鉄の型鋼");
//        add(DCItems.MEDIUM_CLASS_IRON_SPRING.get(),"中等級 鉄のバネ");
//
//        //High Class Iron Machine Component
//        add(DCItems.HIGH_CLASS_IRON_BEARING.get(),"高等級 鉄の軸受");
//        add(DCItems.HIGH_CLASS_IRON_BOLT.get(),"高等級 鉄のボルト");
//        add(DCItems.HIGH_CLASS_IRON_CAM.get(),"高等級 鉄のカム");
//        add(DCItems.HIGH_CLASS_IRON_CHAIN.get(),"高等級 鉄のチェーン");
//        add(DCItems.HIGH_CLASS_IRON_GEAR.get(),"高等級 鉄の歯車");
//        add(DCItems.HIGH_CLASS_IRON_JOINT.get(),"高等級 鉄の継手");
//        add(DCItems.HIGH_CLASS_IRON_KEY.get(),"高等級 鉄のキー");
//        add(DCItems.HIGH_CLASS_IRON_NUT.get(),"高等級 鉄のナット");
//        add(DCItems.HIGH_CLASS_IRON_PIPE.get(),"高等級 鉄の管");
//        add(DCItems.HIGH_CLASS_IRON_PIPEJOINT.get(),"高等級 鉄の管継手");
//        add(DCItems.HIGH_CLASS_IRON_PLATE.get(),"高等級 鉄の板");
//        add(DCItems.HIGH_CLASS_IRON_ROD.get(),"高等級 鉄の棒");
//        add(DCItems.HIGH_CLASS_IRON_SHAFT.get(),"高等級 鉄の軸");
//        add(DCItems.HIGH_CLASS_IRON_SHAFTCOUPLING.get(),"高等級 鉄の軸継手");
//        add(DCItems.HIGH_CLASS_IRON_SHAPESTEEL.get(),"高等級 鉄の型鋼");
//        add(DCItems.HIGH_CLASS_IRON_SPRING.get(),"高等級 鉄のバネ");
//
//        //Super Class Iron Machine Component
//        add(DCItems.SUPER_CLASS_IRON_BEARING.get(),"超等級 鉄の軸受");
//        add(DCItems.SUPER_CLASS_IRON_BOLT.get(),"超等級 鉄のボルト");
//        add(DCItems.SUPER_CLASS_IRON_CAM.get(),"超等級 鉄のカム");
//        add(DCItems.SUPER_CLASS_IRON_CHAIN.get(),"超等級 鉄のチェーン");
//        add(DCItems.SUPER_CLASS_IRON_GEAR.get(),"超等級 鉄の歯車");
//        add(DCItems.SUPER_CLASS_IRON_JOINT.get(),"超等級 鉄の継手");
//        add(DCItems.SUPER_CLASS_IRON_KEY.get(),"超等級 鉄のキー");
//        add(DCItems.SUPER_CLASS_IRON_NUT.get(),"超等級 鉄のナット");
//        add(DCItems.SUPER_CLASS_IRON_PIPE.get(),"超等級 鉄の管");
//        add(DCItems.SUPER_CLASS_IRON_PIPEJOINT.get(),"超等級 鉄の管継手");
//        add(DCItems.SUPER_CLASS_IRON_PLATE.get(),"超等級 鉄の板");
//        add(DCItems.SUPER_CLASS_IRON_ROD.get(),"超等級 鉄の棒");
//        add(DCItems.SUPER_CLASS_IRON_SHAFT.get(),"超等級 鉄の軸");
//        add(DCItems.SUPER_CLASS_IRON_SHAFTCOUPLING.get(),"超等級 鉄の軸継手");
//        add(DCItems.SUPER_CLASS_IRON_SHAPESTEEL.get(),"超等級 鉄の型鋼");
//        add(DCItems.SUPER_CLASS_IRON_SPRING.get(),"超等級 鉄のバネ");
//
//        //Hyper Class Iron Machine Component
//        add(DCItems.HYPER_CLASS_IRON_BEARING.get(),"過等級 鉄の軸受");
//        add(DCItems.HYPER_CLASS_IRON_BOLT.get(),"過等級 鉄のボルト");
//        add(DCItems.HYPER_CLASS_IRON_CAM.get(),"過等級 鉄のカム");
//        add(DCItems.HYPER_CLASS_IRON_CHAIN.get(),"過等級 鉄のチェーン");
//        add(DCItems.HYPER_CLASS_IRON_GEAR.get(),"過等級 鉄の歯車");
//        add(DCItems.HYPER_CLASS_IRON_JOINT.get(),"過等級 鉄の継手");
//        add(DCItems.HYPER_CLASS_IRON_KEY.get(),"過等級 鉄のキー");
//        add(DCItems.HYPER_CLASS_IRON_NUT.get(),"過等級 鉄のナット");
//        add(DCItems.HYPER_CLASS_IRON_PIPE.get(),"過等級 鉄の管");
//        add(DCItems.HYPER_CLASS_IRON_PIPEJOINT.get(),"過等級 鉄の管継手");
//        add(DCItems.HYPER_CLASS_IRON_PLATE.get(),"過等級 鉄の板");
//        add(DCItems.HYPER_CLASS_IRON_ROD.get(),"過等級 鉄の棒");
//        add(DCItems.HYPER_CLASS_IRON_SHAFT.get(),"過等級 鉄の軸");
//        add(DCItems.HYPER_CLASS_IRON_SHAFTCOUPLING.get(),"過等級 鉄の軸継手");
//        add(DCItems.HYPER_CLASS_IRON_SHAPESTEEL.get(),"過等級 鉄の型鋼");
//        add(DCItems.HYPER_CLASS_IRON_SPRING.get(),"過等級 鉄のバネ");
//
//        //Ultra Class Iron Machine Component
//        add(DCItems.ULTRA_CLASS_IRON_BEARING.get(),"極等級 鉄の軸受");
//        add(DCItems.ULTRA_CLASS_IRON_BOLT.get(),"極等級 鉄のボルト");
//        add(DCItems.ULTRA_CLASS_IRON_CAM.get(),"極等級 鉄のカム");
//        add(DCItems.ULTRA_CLASS_IRON_CHAIN.get(),"極等級 鉄のチェーン");
//        add(DCItems.ULTRA_CLASS_IRON_GEAR.get(),"極等級 鉄の歯車");
//        add(DCItems.ULTRA_CLASS_IRON_JOINT.get(),"極等級 鉄の継手");
//        add(DCItems.ULTRA_CLASS_IRON_KEY.get(),"極等級 鉄のキー");
//        add(DCItems.ULTRA_CLASS_IRON_NUT.get(),"極等級 鉄のナット");
//        add(DCItems.ULTRA_CLASS_IRON_PIPE.get(),"極等級 鉄の管");
//        add(DCItems.ULTRA_CLASS_IRON_PIPEJOINT.get(),"極等級 鉄の管継手");
//        add(DCItems.ULTRA_CLASS_IRON_PLATE.get(),"極等級 鉄の板");
//        add(DCItems.ULTRA_CLASS_IRON_ROD.get(),"極等級 鉄の棒");
//        add(DCItems.ULTRA_CLASS_IRON_SHAFT.get(),"極等級 鉄の軸");
//        add(DCItems.ULTRA_CLASS_IRON_SHAFTCOUPLING.get(),"極等級 鉄の軸継手");
//        add(DCItems.ULTRA_CLASS_IRON_SHAPESTEEL.get(),"極等級 鉄の型鋼");
//        add(DCItems.ULTRA_CLASS_IRON_SPRING.get(),"極等級 鉄のバネ");
//
//        //Anti Class Iron Machine Component
//        add(DCItems.ANTI_CLASS_IRON_BEARING.get(),"反等級 鉄の軸受");
//        add(DCItems.ANTI_CLASS_IRON_BOLT.get(),"反等級 鉄のボルト");
//        add(DCItems.ANTI_CLASS_IRON_CAM.get(),"反等級 鉄のカム");
//        add(DCItems.ANTI_CLASS_IRON_CHAIN.get(),"反等級 鉄のチェーン");
//        add(DCItems.ANTI_CLASS_IRON_GEAR.get(),"反等級 鉄の歯車");
//        add(DCItems.ANTI_CLASS_IRON_JOINT.get(),"反等級 鉄の継手");
//        add(DCItems.ANTI_CLASS_IRON_KEY.get(),"反等級 鉄のキー");
//        add(DCItems.ANTI_CLASS_IRON_NUT.get(),"反等級 鉄のナット");
//        add(DCItems.ANTI_CLASS_IRON_PIPE.get(),"反等級 鉄の管");
//        add(DCItems.ANTI_CLASS_IRON_PIPEJOINT.get(),"反等級 鉄の管継手");
//        add(DCItems.ANTI_CLASS_IRON_PLATE.get(),"反等級 鉄の板");
//        add(DCItems.ANTI_CLASS_IRON_ROD.get(),"反等級 鉄の棒");
//        add(DCItems.ANTI_CLASS_IRON_SHAFT.get(),"反等級 鉄の軸");
//        add(DCItems.ANTI_CLASS_IRON_SHAFTCOUPLING.get(),"反等級 鉄の軸継手");
//        add(DCItems.ANTI_CLASS_IRON_SHAPESTEEL.get(),"反等級 鉄の型鋼");
//        add(DCItems.ANTI_CLASS_IRON_SPRING.get(),"反等級 鉄のバネ");
//
//        //Imaginary Class Iron Machine Component
//        add(DCItems.IMAGINARY_CLASS_IRON_BEARING.get(),"虚等級 鉄の軸受");
//        add(DCItems.IMAGINARY_CLASS_IRON_BOLT.get(),"虚等級 鉄のボルト");
//        add(DCItems.IMAGINARY_CLASS_IRON_CAM.get(),"虚等級 鉄のカム");
//        add(DCItems.IMAGINARY_CLASS_IRON_CHAIN.get(),"虚等級 鉄のチェーン");
//        add(DCItems.IMAGINARY_CLASS_IRON_GEAR.get(),"虚等級 鉄の歯車");
//        add(DCItems.IMAGINARY_CLASS_IRON_JOINT.get(),"虚等級 鉄の継手");
//        add(DCItems.IMAGINARY_CLASS_IRON_KEY.get(),"虚等級 鉄のキー");
//        add(DCItems.IMAGINARY_CLASS_IRON_NUT.get(),"虚等級 鉄のナット");
//        add(DCItems.IMAGINARY_CLASS_IRON_PIPE.get(),"虚等級 鉄の管");
//        add(DCItems.IMAGINARY_CLASS_IRON_PIPEJOINT.get(),"虚等級 鉄の管継手");
//        add(DCItems.IMAGINARY_CLASS_IRON_PLATE.get(),"虚等級 鉄の板");
//        add(DCItems.IMAGINARY_CLASS_IRON_ROD.get(),"虚等級 鉄の棒");
//        add(DCItems.IMAGINARY_CLASS_IRON_SHAFT.get(),"虚等級 鉄の軸");
//        add(DCItems.IMAGINARY_CLASS_IRON_SHAFTCOUPLING.get(),"虚等級 鉄の軸継手");
//        add(DCItems.IMAGINARY_CLASS_IRON_SHAPESTEEL.get(),"虚等級 鉄の型鋼");
//        add(DCItems.IMAGINARY_CLASS_IRON_SPRING.get(),"虚等級 鉄のバネ");
//
//        //Infinity Class Iron Machine Component
//        add(DCItems.INFINITY_CLASS_IRON_BEARING.get(),"無限等級 鉄の軸受");
//        add(DCItems.INFINITY_CLASS_IRON_BOLT.get(),"無限等級 鉄のボルト");
//        add(DCItems.INFINITY_CLASS_IRON_CAM.get(),"無限等級 鉄のカム");
//        add(DCItems.INFINITY_CLASS_IRON_CHAIN.get(),"無限等級 鉄のチェーン");
//        add(DCItems.INFINITY_CLASS_IRON_GEAR.get(),"無限等級 鉄の歯車");
//        add(DCItems.INFINITY_CLASS_IRON_JOINT.get(),"無限等級 鉄の継手");
//        add(DCItems.INFINITY_CLASS_IRON_KEY.get(),"無限等級 鉄のキー");
//        add(DCItems.INFINITY_CLASS_IRON_NUT.get(),"無限等級 鉄のナット");
//        add(DCItems.INFINITY_CLASS_IRON_PIPE.get(),"無限等級 鉄の管");
//        add(DCItems.INFINITY_CLASS_IRON_PIPEJOINT.get(),"無限等級 鉄の管継手");
//        add(DCItems.INFINITY_CLASS_IRON_PLATE.get(),"無限等級 鉄の板");
//        add(DCItems.INFINITY_CLASS_IRON_ROD.get(),"無限等級 鉄の棒");
//        add(DCItems.INFINITY_CLASS_IRON_SHAFT.get(),"無限等級 鉄の軸");
//        add(DCItems.INFINITY_CLASS_IRON_SHAFTCOUPLING.get(),"無限等級 鉄の軸継手");
//        add(DCItems.INFINITY_CLASS_IRON_SHAPESTEEL.get(),"無限等級 鉄の型鋼");
//        add(DCItems.INFINITY_CLASS_IRON_SPRING.get(),"無限等級 鉄のバネ");
//
        //Machine Component Circuit Phase1
        add(DCItems.BASIC_PRECISION_BEARING_INSCRIBED_CIRCUIT.get(),"基本精度 軸受刻印回路");
        add(DCItems.BASIC_PRECISION_BOLT_INSCRIBED_CIRCUIT.get(),"基本精度 ボルト刻印回路");
        add(DCItems.BASIC_PRECISION_CAM_INSCRIBED_CIRCUIT.get(),"基本精度 カム刻印回路");
        add(DCItems.BASIC_PRECISION_CHAIN_INSCRIBED_CIRCUIT.get(),"基本精度 チェーン刻印回路");
        add(DCItems.BASIC_PRECISION_GEAR_INSCRIBED_CIRCUIT.get(),"基本精度 歯車刻印回路");
        add(DCItems.BASIC_PRECISION_JOINT_INSCRIBED_CIRCUIT.get(),"基本精度 継手刻印回路");
        add(DCItems.BASIC_PRECISION_KEY_INSCRIBED_CIRCUIT.get(),"基本精度 キー刻印回路");
        add(DCItems.BASIC_PRECISION_NUT_INSCRIBED_CIRCUIT.get(), "基本精度 ナット刻印回路");
        add(DCItems.BASIC_PRECISION_PIPE_INSCRIBED_CIRCUIT.get(), "基本精度 管刻印回路");
        add(DCItems.BASIC_PRECISION_PIPEJOINT_INSCRIBED_CIRCUIT.get(), "基本精度 管継手刻印回路");
        add(DCItems.BASIC_PRECISION_PLATE_INSCRIBED_CIRCUIT.get(), "基本精度 板刻印回路");
        add(DCItems.BASIC_PRECISION_ROD_INSCRIBED_CIRCUIT.get(), "基本精度 棒刻印回路");
        add(DCItems.BASIC_PRECISION_SHAFT_INSCRIBED_CIRCUIT.get(), "基本精度 軸刻印回路");
        add(DCItems.BASIC_PRECISION_SHAFTCOUPLING_INSCRIBED_CIRCUIT.get(), "基本精度 軸継手刻印回路");
        add(DCItems.BASIC_PRECISION_SHAPESTEEL_INSCRIBED_CIRCUIT.get(), "基本精度 型鋼刻印回路");
        add(DCItems.BASIC_PRECISION_SPRING_INSCRIBED_CIRCUIT.get(), "基本精度 バネ刻印回路");

        add(DCItems.CHLORINE_GAS.get(), "塩素ガス");
        add(DCItems.HYDROGEN_GAS.get(), "水素ガス");
        add(DCItems.SILICON_INGOT.get(), "ケイ素インゴット");
        add(DCItems.SILICON_NUGGET.get(), "ケイ素塊");
        add(DCBlocks.SILICON_BLOCK.get(), "ケイ素ブロック");


        add(DCItems.PURIFIED_GRAPHITE_ARC_ELECTRODE.get(), "純化済黒鉛アーク電極");


        add(DCItems.COMPRESSED_PLANKS.get(), "圧縮木材");
        add(DCItems.COMPRESSED_REDSTONE.get(), "圧縮レッドストーン");

        add(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get(), "マルチブロック設備ホログラム投影機");
        add(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get(), "基本技術マルチブロック設備ホログラム投影機");
        add(DCItems.MACHINE_HALT_DEVICE.get(), "機械停止デバイス");

        add(DCItems.BASIC_CIRCUIT.get(), "基本回路");
        add(DCItems.BASIC_DIODE.get(), "基本ダイオード");
        add(DCItems.BASIC_DRIVECHAIN.get(), "基本ドライブチェーン");
        add(DCItems.BASIC_INSCRIBE_NEEDLE.get(), "基本刻印針");
        add(DCItems.BASIC_INSCRIBED_CIRCUIT.get(), "基本刻印回路");
        add(DCItems.BASIC_LINKAGE.get(), "基本リンゲージ");
        add(DCItems.BASIC_MACHINE_SCREEN.get(), "基本機械スクリーン");
        add(DCItems.BASIC_MOTOR.get(), "基本モーター");
        add(DCItems.BASIC_PROCESSING_BASE.get(), "基本加工台");
        add(DCItems.BASIC_REDSTONE_BATTERY.get(), "基本レッドストーン電池");
        add(DCItems.BASIC_REINFORCED_PLATE.get(), "基本強化プレート");
        add(DCItems.BASIC_ROBOT_ARM.get(), "基本ロボットアーム");
        add(DCItems.BASIC_TURBINE.get(), "基本タービン");

        add(DCItems.SIMPLE_CONVEX_LENS.get(), "簡易凸レンズ");
        add(DCItems.SIMPLE_CONCAVE_LENS.get(), "簡易凹レンズ");

        add(DCItems.EMPTY_CONTAINER.get(), "空の容器");
        add(DCItems.WATER_CONTAINER.get(), "水容器");

        add(DCBlocks.PULVERIZER_BLOCK.get(), "粉砕機");

        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_BLOCK.get(), "基本強度化学多重構造機械用基礎フレーム");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(), "基本強度化学多重構造機械用基礎フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(), "基本強度化学多重構造用機械フレーム");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), "基本強度化学多重構造用機械フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(), "基本強度化学多重構造機械用構造フレーム");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), "基本強度化学多重構造機械用構造フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), "基本強度化学多重構造機械用ガラス");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), "基本強度化学多重構造機械用ガラス (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(), "基本強度化学多重構造機械用エネルギーストレージ");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), "基本強度化学多重構造機械用エネルギーストレージ (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(), "基本強度化学多重構造機械用材料ストレージ");
        add(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), "基本強度化学多重構造機械用材料ストレージ (ホログラム)");

        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_BLOCK.get(), "基本強度複合物理学多重構造機械用基礎フレーム");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(), "基本強度複合物理学多重構造機械用基礎フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(), "基本強度複合物理学多重構造用機械フレーム");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), "基本強度複合物理学多重構造用機械フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(), "基本強度複合物理学多重構造機械用構造フレーム");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), "基本強度複合物理学多重構造機械用構造フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), "基本強度複合物理学多重構造機械用ガラス");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), "基本強度複合物理学多重構造機械用ガラス (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(), "基本強度複合物理学多重構造機械用エネルギーストレージ");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), "基本強度複合物理学多重構造機械用エネルギーストレージ (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(), "基本強度複合物理学多重構造機械用材料ストレージ");
        add(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), "基本強度複合物理学多重構造機械用材料ストレージ (ホログラム)");

        add(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get(), "レッドストーン動力機械要素製作機");
        add(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get(), "レッドストーン動力機械部品製作機");


        add(DCBlocks.REINFORCED_PLANKS.get(), "強化木材");


        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.get(), "基本強度工学多重構造機械用基礎フレーム");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(), "基本強度工学多重構造機械用基礎フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(), "基本強度工学多重構造用機械フレーム");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), "基本強度工学多重構造用機械フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(), "基本強度工学多重構造機械用構造フレーム");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), "基本強度工学多重構造機械用構造フレーム (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), "基本強度工学多重構造機械用ガラス");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), "基本強度工学多重構造機械用ガラス (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(), "基本強度工学多重構造機械用エネルギーストレージ");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), "基本強度工学多重構造機械用エネルギーストレージ (ホログラム)");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(), "基本強度工学多重構造機械用材料ストレージ");
        add(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), "基本強度工学多重構造機械用材料ストレージ (ホログラム)");
        add(PipeBlocks.BASIC_ITEM_PIPE_BLOCK, "基本アイテムパイプ");
        add(PipeBlocks.BASIC_ENERGY_PIPE_BLOCK, "基本エネルギーパイプ");

        add(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BLOCK.get(), "基本性能電解槽");
        add("tooltip." + "degeneracycraft." + "basic_performance_electrolyser_block",
                "基本的な電解槽. 電気分解によって物質を反応させる.");
        add(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_BLOCK.get(), "基本耐用拡張電解セル");
        add("tooltip." + "degeneracycraft.ability" + "basic_performance_electrolyser_block",
                "基本性能電解槽用");
        add(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_HOLO_BLOCK.get(), "基本耐用拡張電解セル (ホログラム)");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK.get(), "基本性能電解槽バス");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK.get(), "基本性能電解槽バス (ホログラム)");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK.get(), "基本性能電解槽ポート");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get(), "基本性能電解槽ポート (ホログラム)");

        add(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.get(), "基本性能電気アーク炉");
        add("tooltip." + "degeneracycraft." + "basic_performance_electric_arc_furnace_block",
                "基本的なアーク炉. 高温で反応させるため、放電を用いる機械.");
        add(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_BLOCK.get(), "基本流量冷却機構");
        add("tooltip." + "degeneracycraft.ability" + "basic_performance_electric_arc_furnace_block",
                "基本性能電気アーク炉用");
        add(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK.get(), "基本流量冷却機構 (ホログラム)");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK.get(), "基本性能電気アーク炉バス");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_HOLO_BLOCK.get(), "基本性能電気アーク炉バス (ホログラム)");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK.get(), "基本性能電気アーク炉ポート");
        add(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_HOLO_BLOCK.get(), "基本性能電気アーク炉ポート (ホログラム)");


        add(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get(), "基本出力蒸気発電機");
        add("tooltip." + "degeneracycraft." + "basic_power_steam_generator_block",
                "基本的な蒸気発電機. 物質を燃やした時の蒸気で発電する.");
        add(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get(), "基本耐久高温燃焼室");
        add("tooltip." + "degeneracycraft.ability" + "basic_power_steam_generator_block",
                "基本出力蒸気発電機用");
        add(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get(), "基本耐久高温燃焼室 (ホログラム)");
        add(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get(), "基本出力蒸気発電機バス");
        add(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.get(), "基本出力蒸気発電機バス (ホログラム)");
        add(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get(), "基本出力蒸気発電機ポート");
        add(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.get(), "基本出力蒸気発電機ポート (ホログラム)");

        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get(), "基本技術機械製造機");
        add("tooltip." + "degeneracycraft." + "basic_technology_machine_manufacturer_block",
                "基本的な機械製造機. これがないとより複雑な機械を作れない.");
        add(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_BLOCK.get(), "基本効率機械加工室");
        add("tooltip." + "degeneracycraft.ability" + "basic_technology_machine_manufacturer_block",
                "基本技術機械製造機用");
        add(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_HOLO_BLOCK.get(), "基本効率機械加工室 (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK.get(), "基本技術機械製造機バス");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_HOLO_BLOCK.get(), "基本技術機械製造機バス (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK.get(), "基本技術機械製造機ポート");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_HOLO_BLOCK.get(), "基本技術機械製造機ポート (ホログラム)");

        add(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get(), "基本技術万能組立機");
        add("tooltip." + "degeneracycraft." + "basic_technology_universal_assembler_block",
                "基本的な万能組立機. 工業的なアイテムを作成するための機械.");
        add(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK.get(), "基本操作組立加工室");
        add("tooltip." + "degeneracycraft.ability" + "basic_technology_universal_assembler_block",
                "基本技術万能組立機用");
        add(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_HOLO_BLOCK.get(), "基本操作組立加工室 (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK.get(), "基本技術万能組立機バス");
        add(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK.get(), "基本技術万能組立機バス (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK.get(), "基本技術万能組立機ポート");
        add(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get(), "基本技術万能組立機ポート (ホログラム)");

        add(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BLOCK.get(), "基本技術回路構築機");
        add("tooltip." + "degeneracycraft." + "basic_technology_circuit_builder_block",
                "基本的な回路構築機. 回路やその部品を製作する機械.");
        add(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_BLOCK.get(), "基本清浄度回路防塵室");
        add("tooltip." + "degeneracycraft.ability" + "basic_technology_circuit_builder_block",
                "基本操作組立加工室用");
        add(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_HOLO_BLOCK.get(), "基本清浄度回路防塵室 (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_BLOCK.get(), "基本技術回路構築機バス");
        add(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_HOLO_BLOCK.get(), "基本技術回路構築機バス (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_BLOCK.get(), "基本技術回路構築機ポート");
        add(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_HOLO_BLOCK.get(), "基本技術回路構築機ポート (ホログラム)");


        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(), "基本技術機械要素加工機");
        add("tooltip." + "degeneracycraft." + "basic_technology_machine_element_processor_block",
                "基本的な機械要素加工機. より加工難度の高い金属を加工する.");
        add(DCBlocks.BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_BLOCK.get(), "基本効率機械要素加工室");
        add("tooltip." + "degeneracycraft.ability" + "basic_technology_machine_element_processor_block",
                "基本技術機械要素加工機用");
        add(DCBlocks.BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_HOLO_BLOCK.get(), "基本効率機械要素加工室 (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK.get(), "基本技術機械要素加工機バス");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_HOLO_BLOCK.get(), "基本技術機械要素加工機バス (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get(), "基本機械要素加工機ポート");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_HOLO_BLOCK.get(), "基本機械要素加工機ポート (ホログラム)");

        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK.get(), "基本技術機械部品加工機");
        add("tooltip." + "degeneracycraft." + "basic_technology_machine_part_processor_block",
                "基本的な機械要素加工機. より加工難度の高い部品を加工する.");
        add(DCBlocks.BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_BLOCK.get(), "基本効率機械部品加工室");
        add("tooltip." + "degeneracycraft.ability" + "basic_technology_machine_part_processor_block",
                "基本技術機械部品加工機用");
        add(DCBlocks.BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_HOLO_BLOCK.get(), "基本効率機械部品加工室 (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK.get(), "基本技術機械部品加工機バス");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_HOLO_BLOCK.get(), "基本技術機械部品加工機バス (ホログラム)");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_BLOCK.get(), "基本技術機械部品加工機ポート");
        add(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_HOLO_BLOCK.get(), "基本技術機械部品加工機ポート (ホログラム)");

//        add(DCBlocks.LOW_STERNGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),"低強度機械用フレーム");
        add(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.get(), "低強度多構造機械用フレーム");
        add(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get(), "低強度多構造機械用ガラス");


        add(DCUniqueBlocks.SIMPLE_TELESCOPE_RIGHT_PILLAR.get(), "簡易望遠鏡右支柱");
        add(DCUniqueBlocks.SIMPLE_TELESCOPE_LEFT_PILLAR.get(), "簡易望遠鏡左支柱");


        add("message." + "degeneracycraft_redstone_powered_machine_element_manufacture_machine", "Phase 0 まずこれを");
        add("screen." + "degeneracycraft_pulverizer", "粉砕機 画面");
        add("jei." + "degeneracycraft_redstone_powered_machine_element_manufacture_machine", "レッドストーン動力機械要素製作機 レシピ");
        add("jei." + "degeneracycraft_redstone_powered_machine_part_manufacture_machine", "レッドストーン動力機械部品製作機 レシピ");


        add("jei." + "degeneracycraft_basic_performance_electrolyser", "基本性能電解槽 レシピ");

        add("jei." + "degeneracycraft_basic_performance_electric_arc_furnace", "基本性能電気アーク炉 レシピ");


        add("jei." + "degeneracycraft_basic_technology_machine_manufacturer", "基本技術機械製造機 レシピ");
        add("jei." + "degeneracycraft_basic_technology_machine_element_processor", "基本技術機械要素加工機 レシピ");
        add("jei." + "degeneracycraft_basic_technology_universal_assembler", "基本技術万能加工機 レシピ");
        add("jei." + "degeneracycraft_basic_technology_circuit_builder", "基本技術回路構築機 レシピ");
        add("jei." + "degeneracycraft_basic_technology_machine_part_processor", "基本技術機械部品加工機 レシピ");

        add("itemGroup." + "degeneracycraft_material", "Degeneracy Craft 材料");
        add("itemGroup." + "degeneracycraft_machine_elements", "Degeneracy Craft 機械要素");
        add("itemGroup." + "degeneracycraft_machine_parts", "Degeneracy Craft 機械部品");

        add("itemGroup." + "degeneracycraft_machine", "Degeneracy Craft 機械");
        add("itemGroup." + "degeneracycraft_multiplied_ore_material", "Degeneracy Craft 鉱石倍化素材");
        add("itemGroup." + "degeneracycraft_ingot", "Degeneracy Craft インゴット");
        add("itemGroup." + "degeneracycraft_ore", "Degeneracy Craft 鉱石");

        add("screen." + "degeneracycraft" + ".phase0", "Phase 0");
        add("screen." + "degeneracycraft" + ".phase1", "Phase 1");

        add("screen." + "degeneracycraft" + ".halt", "停止中");
        add("screen." + "degeneracycraft" + ".available", "残存容量");
        add("screen." + "degeneracycraft" + ".available" + "%", "パーセント");


        add("screen." + "degeneracycraft_besic_power_steam_generator" + ".burntime", "燃焼時間");

        add("screen." + "degeneracycraft_generator" + ".output", "出力電力");
        add("screen." + "degeneracycraft_generator" + ".modifier", "出力倍率");

        add("screen." + "degeneracycraft_generator" + ".power_output_16", "16 FE/t");
        add("screen." + "degeneracycraft_generator" + ".power_output_32", "32 FE/t");
        add("screen." + "degeneracycraft_generator" + ".power_output_48", "48 FE/t");

        add("screen." + "degeneracycraft_machine" + ".modifier_1", "×1");
        add("screen." + "degeneracycraft_machine" + ".modifier_1.5", "×1.5");
        add("screen." + "degeneracycraft_machine" + ".modifier_2", "×2");
        add("screen." + "degeneracycraft_machine" + ".modifier_3", "×3");

        add("screen." + "degeneracycraft_machine" + ".process_modifier_1", "加工速度 ×1.00");
        add("screen." + "degeneracycraft_machine" + ".process_modifier_1.5", "加工速度 ×1.50");
        add("screen." + "degeneracycraft_machine" + ".process_modifier_2", "加工速度 ×2.00");
        add("screen." + "degeneracycraft_machine" + ".process_modifier_3", "加工速度 ×3.00");

        add("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_1", "要求電力量 ×1.00");
        add("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_1.5", "要求電力量 ×1.50");
        add("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_2", "要求電力量 ×2.00");
        add("screen." + "degeneracycraft_machine" + ".energy_usage_modifier_3", "要求電力量 ×3.00");


        add("tooltip." + "degeneracycraft" + ".wrench", "搬出 → 搬入 → 切断 → 搬出... シフト右クリックでパイプ状態切替");
        add("tooltip." + "degeneracycraft" + ".wrenchitem", "Shiftキーでレンチ詳細展開");
        add("tooltip." + "degeneracycraft" + ".tooltipitem", "Shiftキーで物質詳細展開");

        add("tooltip." + "degeneracycraft." + "ipp." + "initial", "工業進展段階:Phase0");
        add("tooltip." + "degeneracycraft." + "ipp." + "basic", "工業進展段階:Phase1");
        add("tooltip." + "degeneracycraft." + "ipp." + "low", "工業進展段階:Phase2");
        add("tooltip." + "degeneracycraft." + "ipp." + "medium", "工業進展段階:Phase3");
        add("tooltip." + "degeneracycraft." + "ipp." + "high", "工業進展段階:Phase4");
        add("tooltip." + "degeneracycraft." + "ipp." + "super", "工業進展段階:Phase5");
        add("tooltip." + "degeneracycraft." + "ipp." + "OVER", "工業進展段階:Phase6");
        add("tooltip." + "degeneracycraft." + "ipp." + "ultra", "工業進展段階:Phase7");
        add("tooltip." + "degeneracycraft." + "ipp." + "anti", "工業進展段階:Phase8");
        add("tooltip." + "degeneracycraft." + "ipp." + "imaginary", "工業進展段階:Phase9");
        add("tooltip." + "degeneracycraft." + "ipp." + "infinity", "工業進展段階:PhaseInf");

        add("tooltip." + "degeneracycraft." + "multiblock_size.", "マルチブロックサイズ");
        add("Lv0:3×3×3", "Lv0:3×3×3ブロック");
        add("Lv1:3×3×3", "Lv1:3×3×3ブロック");
        add("Base:Power 16 FE/t", "単ブロック:発電量 16 FE/t");
        add("Lv0:Power 32 FE/t", "Lv0マルチブロック:発電量 32 FE/t");
        add("Lv1:Power 48 FE/t", "Lv1マルチブロック:発電量 48 FE/t");
        add("Base:Speed ×1.00,Energy Usage ×1.00", "単ブロック:加工速度 ×1.00 要求電力量 ×1.00");
        add("Lv0:Speed ×2.00,Energy Usage ×1.50", "Lv0マルチブロック:加工速度 ×2.00 要求電力量 ×1.50");
        add("Lv1:Speed ×3.00,Energy Usage ×2.00", "Lv1マルチブロック:加工速度 ×3.00 要求電力量 ×2.00");

        add("tooltip." + "degeneracycraft." + "science." + "astronomy", "科学分野:天文学");
        add("tooltip." + "degeneracycraft." + "science." + "biology", "科学分野:生物");
        add("tooltip." + "degeneracycraft." + "science." + "chemistry", "科学分野:化学");
        add("tooltip." + "degeneracycraft." + "science." + "engineering", "科学分野:工学");
        add("tooltip." + "degeneracycraft." + "science." + "geoscience", "科学分野:地学");
        add("tooltip." + "degeneracycraft." + "science." + "hybrid_physics", "科学分野:複合物理学");
        add("tooltip." + "degeneracycraft." + "science." + "imitation_magic_engineering", "科学分野:模造魔導工学");


        add("tooltip." + "degeneracycraft." + "chlorine" + ".name", "元素名:塩素");
        add("tooltip." + "degeneracycraft." + "chlorine" + ".number", "原子番号:17");
        add("tooltip." + "degeneracycraft." + "chlorine" + ".weight", "原子量:35.45 g/mol");
        add("tooltip." + "degeneracycraft." + "chlorine" + ".melting", "融点:171.6 K");
        add("tooltip." + "degeneracycraft." + "chlorine" + ".boiling", "沸点:239.1 K");
        add("tooltip." + "degeneracycraft." + "chlorine" + ".formula", "化学式:Cl");

        add("tooltip." + "degeneracycraft." + "hydrogen" + ".name", "元素名:水素");
        add("tooltip." + "degeneracycraft." + "hydrogen" + ".number", "原子番号:1");
        add("tooltip." + "degeneracycraft." + "hydrogen" + ".weight", "原子量:1.008 g/mol");
        add("tooltip." + "degeneracycraft." + "hydrogen" + ".melting", "融点:14.01 K");
        add("tooltip." + "degeneracycraft." + "hydrogen" + ".boiling", "沸点:20.28 K");
        add("tooltip." + "degeneracycraft." + "hydrogen" + ".formula", "化学式:H");


        add("tooltip." + "degeneracycraft." + "silicon" + ".name", "元素名:ケイ素");
        add("tooltip." + "degeneracycraft." + "silicon" + ".number", "原子番号:14");
        add("tooltip." + "degeneracycraft." + "silicon" + ".weight", "原子量:28.04 g/mol");
        add("tooltip." + "degeneracycraft." + "silicon" + ".melting", "融点:1414 K");
        add("tooltip." + "degeneracycraft." + "silicon" + ".boiling", "沸点:3265 K");
        add("tooltip." + "degeneracycraft." + "silicon" + ".formula", "化学式:Si");

        add("tooltip." + "degeneracycraft." + "iron" + ".name", "物質名:鉄");
        add("tooltip." + "degeneracycraft." + "iron" + ".number", "原子番号:26");
        add("tooltip." + "degeneracycraft." + "iron" + ".weight", "原子量:55.85 g/mol");
        add("tooltip." + "degeneracycraft." + "iron" + ".melting", "融点:1811 K");
        add("tooltip." + "degeneracycraft." + "iron" + ".boiling", "沸点:3134 K");
        add("tooltip." + "degeneracycraft." + "iron" + ".formula", "化学式:Fe");


        add("tooltip." + "degeneracycraft." + "requiredenergy.", "要求電力総量:");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage.", "要求電力使用量:");
        add("tooltip." + "degeneracycraft." + "requiredtime.", "要求時間:");
        add("tooltip." + "degeneracycraft." + "sec.", " 秒");


        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_bearing" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_bearing" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_bearing" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_bearing" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_bolt" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_bolt" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_bolt" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_bolt" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_cam" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_cam" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_cam" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_cam" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_chain" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_chain" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_chain" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_chain" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_gear" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_gear" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_gear" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_gear" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_joint" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_joint" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_joint" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_joint" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_key" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_key" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_key" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_key" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_nut" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_nut" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_nut" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_nut" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_pipe" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_pipe" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_pipe" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_pipe" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_pipejoint" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_pipejoint" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_pipejoint" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_pipejoint" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_plate" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_plate" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_plate" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_plate" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_rod" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_rod" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_rod" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_rod" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_shaft" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_shaft" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_shaft" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_shaft" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_shaftcoupling" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_shaftcoupling" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_shaftcoupling" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_shaftcoupling" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_shapesteel" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_shapesteel" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_shapesteel" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_shapesteel" + ".phase0", "設備生産倍率:×1 ~ ×1");

        add("tooltip." + "degeneracycraft." + "requiredenergy." + "iron_spring" + ".phase0", "要求電力総量:0 FE");
        add("tooltip." + "degeneracycraft." + "requiredenergyusage." + "iron_spring" + ".phase0", "要求電力使用量:0 FE/t");
        add("tooltip." + "degeneracycraft." + "requiredtime." + "iron_spring" + ".phase0", "要求時間:100 tick (5 秒)");
        add("tooltip." + "degeneracycraft." + "msmultiplication." + "iron_spring" + ".phase0", "設備生産倍率:×1 ~ ×1");


        add("tooltip." + "degeneracycraft" + ".structure" + ".off", "マルチブロック構造非検知");
        add("tooltip." + "degeneracycraft" + ".structure" + ".lv0", "正確なマルチブロック構造:Lv0 を検知");
        add("tooltip." + "degeneracycraft" + ".structure" + ".lv1", "正確なマルチブロック構造:Lv1 を検知");

        add("tooltip." + "degeneracycraft" + ".work", "機械稼働中");
        add("tooltip." + "degeneracycraft" + ".stop", "機械停止中");
        add("tooltip." + "degeneracycraft" + ".power_modifier_1", "出力倍率 ×1.00");
        add("tooltip." + "degeneracycraft" + ".power_modifier_2", "出力倍率 ×2.00");
        add("tooltip." + "degeneracycraft" + ".power_modifier_3", "出力倍率 ×3.00");
        add("tooltip." + "degeneracycraft" + ".halt", "機械強制停止中");

        add("advancements." + "degeneracycraft" + ".astronomy" + ".title", "天文学(Astronomy)");
        add("advancements." + "degeneracycraft" + ".astronomy" + ".description", "目指せ、星間飛行");

        add("advancements." + "degeneracycraft" + ".biology" + ".title", "生物学(Biology)");
        add("advancements." + "degeneracycraft" + ".biology" + ".description", "目指せ、螺旋復号");

        add("advancements." + "degeneracycraft" + ".chemistry" + ".title", "化学(Chemistry)");
        add("advancements." + "degeneracycraft" + ".chemistry" + ".description", "目指せ、反応臨界");

        add("advancements." + "degeneracycraft" + ".title", "DegeneracyCraft");
        add("advancements." + "degeneracycraft" + ".description", "DegeneracyCraft始動");

        add("advancements." + "degeneracycraft" + ".engineering" + ".title", "工学(Engineering)");
        add("advancements." + "degeneracycraft" + ".engineering" + ".description", "目指せ、工学集積");

        add("advancements." + "Rolling Gear" + ".title", "ローリンギァ－ル？");
        add("advancements." + "Rolling Gear" + ".description", "鉄の歯車を作成");

        add("advancements." + "Not Crash, But Press" + ".title", "砕くな、圧せよ");
        add("advancements." + "Not Crash, But Press" + ".description", "鉄の板を作成");

        add("advancements." + "degeneracycraft" + ".geo_science" + ".title", "地学(Geo Science)");
        add("advancements." + "degeneracycraft" + ".geo_science" + ".description", "目指せ、鉱石探究");

        add("advancements." + "degeneracycraft" + ".hybrid_physics" + ".title", "複合物理学(Hybrids Physics)");
        add("advancements." + "degeneracycraft" + ".hybrid_physics" + ".description", "目指せ、現象集約");

        add("advancements." + "degeneracycraft" + ".imitation_magic_engineering" + ".title", "模造魔道工学(Imitation Magic Engineering)");
        add("advancements." + "degeneracycraft" + ".imitation_magic_engineering" + ".description", "目指せ、神秘解読");

        add("advancements." + "Awakening with \"The Fool\"" + ".title", "ある\"愚者\"の目覚め");
        add("advancements." + "Awakening with \"The Fool\"" + ".description", "レッドストーン動力機械要素製作機を作成");

        add("advancements." + "Call of Industry" + ".title", "工業の呼び声");
        add("advancements." + "Call of Industry" + ".description", "基本出力蒸気発電機を作成");

        add("advancements." + "Machine like \"The Magician\"" + ".title", "機械は\"魔術師\"のように");
        add("advancements." + "Machine like \"The Magician\"" + ".description", "基本技術機械製造機を作成");

        add("advancements." + "Assemble! Assemble!" + ".title", "アッセンブル！アッセンブル！");
        add("advancements." + "Assemble! Assemble!" + ".description", "基本技術万能組立機を作成");


        add("degeneracycraft_introduction" + ".title", "DegeneracyCraftPedia");
        add("degeneracycraft_introduction" + ".landing",
                "このDegeneracyCraftは工業のロマンを求めたMODです！<br>主に7つの分野と10段階のフェーズで構成されています!<br>このDegeneracyCraftPediaはDegeneracyCraftの説明書です!");


    }

}

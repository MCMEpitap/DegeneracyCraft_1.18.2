package net.epitap.degeneracycraft.pipe.test.basic;

import net.epitap.degeneracycraft.pipe.test.entities.TestPipeBlockEntities;
import net.epitap.degeneracycraft.pipe.test.entities.TestPipeWorkBlockEntity;
import net.epitap.degeneracycraft.pipe.test.pipebase.TestPipeTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TestBasicItemPipeEntity extends TestPipeWorkBlockEntity {
    public TestBasicItemPipeEntity(BlockPos pos, BlockState state) {
        super(TestPipeBlockEntities.TEST_BASIC_ITEM_PIPE_BLOCK_ENTITY, new TestPipeTypeBase[]{TestBasicItemPipeType.INSTANCE}, pos, state);
    }
}

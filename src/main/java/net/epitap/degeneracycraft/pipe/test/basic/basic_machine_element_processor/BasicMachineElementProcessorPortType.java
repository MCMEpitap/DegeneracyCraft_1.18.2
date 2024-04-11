package net.epitap.degeneracycraft.pipe.test.basic.basic_machine_element_processor;

import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.pipe.test.entities.PortWorkBlockEntity;
import net.epitap.degeneracycraft.pipe.test.pipebase.PortBlockEntityBase;
import net.epitap.degeneracycraft.pipe.test.pipebase.PortTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.List;

public class BasicMachineElementProcessorPortType extends PortTypeBase<Item> {
    public static final BasicMachineElementProcessorPortType INSTANCE = new BasicMachineElementProcessorPortType();

    @Override
    public String getKey() {
        return "basic_machine_element_processor_port_block";
    }

    @Override
    public boolean canImport(BlockEntity blockEntity, Direction direction) {
        return blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, direction).isPresent();
    }

    @Override
    public String getTranslationKey() {
        return "basic_machine_element_processor_port_block";
    }

    @Override
    public ItemStack getIcon() {
        return new ItemStack(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
    }

    @Override
    public void tick(PortWorkBlockEntity blockEntity) {
        for (Direction side : Direction.values()) {
            if (blockEntity.getLevel().getGameTime() % getTransferItemTickSpeed(blockEntity, side) != 0) {
                continue;
            }
            if (!blockEntity.pipeExtracting(side)) {
                continue;
            }
            IItemHandler itemHandler = getItemHandler(blockEntity, blockEntity.getBlockPos().relative(side), side.getOpposite());
            if (itemHandler == null) {
                continue;
            }

            List<PortWorkBlockEntity.Connection> connections = blockEntity.getSortedConnections(side, this);

            importItem(blockEntity, side, connections, itemHandler);
        }
    }


    protected void importItem(PortWorkBlockEntity blockEntity, Direction side, List<PortBlockEntityBase.Connection> connections, IItemHandler itemHandler) {
        if (connections.isEmpty()) {
            return;
        }
        float itemsToTransfer = getTickRate(blockEntity, side);
        boolean[] inventoriesFull = new boolean[connections.size()];
        int p = blockEntity.get3dData(side, this) % connections.size();
        while (itemsToTransfer > 0 && hasNotImported(inventoriesFull)) {
            PortBlockEntityBase.Connection connection = connections.get(p);
            IItemHandler destination = getItemHandler(blockEntity, connection.pos(), connection.direction());
            boolean hasImported = false;
            if (destination != null && !inventoriesFull[p] && !judgeFull(destination)) {
                for (int j = 0; j < itemHandler.getSlots(); j++) {
                    ItemStack simulatedExtract = itemHandler.extractItem(j, 1, true);
                    if (simulatedExtract.isEmpty()) {
                        continue;
                    }
                    ItemStack stack = ItemHandlerHelper.insertItem(destination, simulatedExtract, false);
                    int ImportedAmount = simulatedExtract.getCount() - stack.getCount();
                    if (ImportedAmount > 0) {
                        itemsToTransfer -= ImportedAmount;
                        itemHandler.extractItem(j, ImportedAmount, false);
                        hasImported = true;
                        break;
                    }
                }
            }
            if (!hasImported) {
                inventoriesFull[p] = true;
            }
            p = (p + 1) % connections.size();
        }

        blockEntity.set3dData(side, this, p);
    }

    private boolean judgeFull(IItemHandler itemHandler) {
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stackInSlot = itemHandler.getStackInSlot(i);
            if (stackInSlot.getCount() < itemHandler.getSlotLimit(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasNotImported(boolean[] inventoriesFull) {
        for (boolean b : inventoriesFull) {
            if (!b) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private IItemHandler getItemHandler(PortWorkBlockEntity blockEntity, BlockPos pos, Direction direction) {
        BlockEntity blockentity = blockEntity.getLevel().getBlockEntity(pos);
        if (blockentity == null) {
            return null;
        }
        return blockentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, direction).orElse(null);
    }

    public int getTransferItemTickSpeed(PortWorkBlockEntity blockEntity, Direction direction) {
        return getTransferItemTickSpeed();
    }

    public int getTransferItemTickSpeed() {
        return 20;
    }

    public float getTickRate() {
        return 1;
    }
}

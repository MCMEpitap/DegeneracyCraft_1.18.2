package net.epitap.degeneracycraft.world.feature.ore.packet;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;

public class PacketReadingHelpers {
    public static final String BLOCK_NBT_NAME = "blocks";

    public static CompoundTag encodeBlocks(HashSet<BlockState> blocks) {
        CompoundTag comp = new CompoundTag();
        ListTag list = new ListTag();
        for (BlockState b : blocks) {
            list.add(NbtUtils.writeBlockState(b));
        }
        comp.put(BLOCK_NBT_NAME, list);
        return comp;
    }

    public static HashSet<BlockState> decodeBlocks(CompoundTag comp) {
        HashSet<BlockState> ret = new HashSet<BlockState>();
        ListTag list = comp.getList(BLOCK_NBT_NAME, 10);
        list.forEach((c) -> {
            if (c instanceof CompoundTag) {
                ret.add(NbtUtils.readBlockState((CompoundTag) c));
            } else {
                Degeneracycraft.LOGGER.error("The following compound appears to be broken: {}", c);
            }
        });

        return ret;
    }

    public static String messagify(HashSet<BlockState> blocks) {
        StringBuilder sb = new StringBuilder();
        // I hate old for-loops but I need the index.
        int idx = 0;
        for (BlockState b : blocks) {
            sb.append(new ItemStack(b.getBlock())
                    .getDisplayName()
                    .getString()
                    .replace("[", "")
                    .replace("]", ""));
            if ((idx + 2) == blocks.size()) {
                sb.append(" & ");
            } else if ((idx + 1) != blocks.size()) {
                sb.append(", ");
            }
            idx++;
        }
        return sb.toString();
    }
}

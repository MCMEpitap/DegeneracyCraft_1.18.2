package net.epitap.degeneracycraft.transport.port.blocks;

import net.epitap.degeneracycraft.transport.port.portbase.PortBlockBase;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PortBlockClickEvent {
    @SubscribeEvent
    public void blockClick(PlayerInteractEvent.RightClickBlock event) {
        pipeClick(event);
    }

    private void pipeClick(PlayerInteractEvent.RightClickBlock event) {
        BlockState state = event.getWorld().getBlockState(event.getPos());
        if (!(state.getBlock() instanceof PortBlockBase pipe)) {
            return;
        }

        Direction side = pipe.getSelection(state, event.getWorld(), event.getPos(), event.getPlayer()).getKey();
        InteractionResult result = pipe.wrenchPortSideLaunch(state, event.getWorld(), event.getPos(), event.getPlayer(), event.getHand(), event.getHitVec(), side);
        if (result.consumesAction()) {
            event.setUseItem(Event.Result.ALLOW);
            event.setCancellationResult(result);
            event.setCanceled(true);
        }
    }
}

package net.epitap.degeneracycraft.transport.bus_port.bus_portbase;

import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PortBlockClickEvent {
    @SubscribeEvent
    public void blockClick(PlayerInteractEvent.RightClickBlock event) {
        portClick(event);
    }

    private void portClick(PlayerInteractEvent.RightClickBlock event) {
        BlockState state = event.getWorld().getBlockState(event.getPos());
        if (!(state.getBlock() instanceof PortBlockBase port)) {
            return;
        }

        Direction side = port.getSelection(state, event.getWorld(), event.getPos(), event.getPlayer()).getKey();
        InteractionResult result = port.wrenchPortSideLaunch(state, event.getWorld(), event.getPos(), event.getPlayer(), event.getHand(), event.getHitVec(), side);
        if (result.consumesAction()) {
            event.setUseItem(Event.Result.ALLOW);
            event.setCancellationResult(result);
            event.setCanceled(true);
        }
    }
}

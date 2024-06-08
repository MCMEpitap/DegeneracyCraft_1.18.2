package net.epitap.degeneracycraft.item.tool.test;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class GunItem extends Item {
    private final int cooldown;
    private final Random random = new Random();
    private final CooldownTracker cooldownTracker = new CooldownTracker();

    public GunItem(Properties properties) {
        super(properties);
        this.cooldown = 1; // クールダウンを短く設定（5ティック）
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!cooldownTracker.isOnCooldown()) {
            player.startUsingItem(hand);
            return InteractionResultHolder.consume(stack);
        }

        return InteractionResultHolder.fail(stack);
    }

    @Override
    public void onUsingTick(ItemStack stack, LivingEntity player, int count) {
        if (!player.level.isClientSide && player instanceof Player) {
            if (!cooldownTracker.isOnCooldown()) {
                Vec3 look = player.getLookAngle();
                SmallFireball fireball = new SmallFireball(EntityType.SMALL_FIREBALL, player.level);
                fireball.setPos(player.getX() + look.x * 1.5, player.getEyeY() + look.y * 1.5, player.getZ() + look.z * 1.5);
                fireball.shoot(look.x, look.y, look.z, 1.5F, 0);

                player.level.addFreshEntity(fireball);
                cooldownTracker.setCooldown(this.cooldown);
                stack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(player.getUsedItemHand()));

                player.level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS, 1.0F, 1.0F / (random.nextFloat() * 0.4F + 0.8F));

                System.out.println("onUsingTick called successfully!"); // デバッグ情報
            }
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClientSide && entity instanceof Player) {
            cooldownTracker.tick();
        }
    }

    private static class CooldownTracker {
        private int cooldownTime;

        public CooldownTracker() {
            this.cooldownTime = 0;
        }

        public boolean isOnCooldown() {
            return this.cooldownTime > 0;
        }

        public void setCooldown(int cooldown) {
            this.cooldownTime = cooldown;
        }

        public void tick() {
            if (this.cooldownTime > 0) {
                this.cooldownTime--;
            }
        }
    }
}

//import net.minecraft.sounds.SoundEvents;
//import net.minecraft.sounds.SoundSource;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.entity.projectile.SmallFireball;
//import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResultHolder;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.UseAnim;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.phys.Vec3;
//
//import java.util.Random;
//
//public class GunItem extends Item {
//    private final int cooldown;
//    private final Random random = new Random();
//    private final CooldownTracker cooldownTracker = new CooldownTracker();
//
//    public GunItem(Properties properties) {
//        super(properties);
//        this.cooldown = 10;
//    }
//
//    @Override
//    public UseAnim getUseAnimation(ItemStack stack) {
//        return UseAnim.BOW;
//    }
//
//    @Override
//    public int getUseDuration(ItemStack stack) {
//        return 72000;
//    }
//
//    @Override
//    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
//        ItemStack stack = player.getItemInHand(hand);
//
//        if (!cooldownTracker.isOnCooldown()) {
//            player.startUsingItem(hand);
//            return InteractionResultHolder.consume(stack);
//        }
//
//        return InteractionResultHolder.fail(stack);
//    }
//
//
//    @Override
//    public void onUsingTick(ItemStack stack, LivingEntity player, int count) {
//        super.onUsingTick(stack, player, count);
//    }
//
//    @Override
//    public void releaseUsing(ItemStack stack, Level world, LivingEntity entity, int timeLeft) {
//        if (!world.isClientSide && entity instanceof Player) {
//            if (!cooldownTracker.isOnCooldown()) {
//                Vec3 look = entity.getLookAngle();
//                SmallFireball fireball = new SmallFireball(EntityType.SMALL_FIREBALL, world);
//                fireball.setPos(entity.getX() + look.x * 1.5, entity.getEyeY() + look.y * 1.5, entity.getZ() + look.z * 1.5);
//                fireball.shoot(look.x, look.y, look.z, 1.5F, 0);
//
//                world.addFreshEntity(fireball);
//                cooldownTracker.setCooldown(this.cooldown);
//                stack.hurtAndBreak(1, entity, (p) -> p.broadcastBreakEvent(entity.getUsedItemHand()));
//
//                world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS, 1.0F, 1.0F / (random.nextFloat() * 0.4F + 0.8F));}
//        }
//    }
//
//    @Override
//    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected) {
//        if (!world.isClientSide && entity instanceof Player) {
//            cooldownTracker.tick();
//        }
//    }
//
//    private static class CooldownTracker {
//        private int cooldownTime;
//
//        public CooldownTracker() {
//            this.cooldownTime = 0;
//        }
//
//        public boolean isOnCooldown() {
//            return this.cooldownTime > 0;
//        }
//
//        public void setCooldown(int cooldown) {
//            this.cooldownTime = cooldown;
//        }
//
//        public void tick() {
//            if (this.cooldownTime > 0) {
//                this.cooldownTime--;
//            }
//        }
//    }
//}

package net.epitap.degeneracycraft.item.tool;

import net.epitap.degeneracycraft.tier.DCTier;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.entity.PartEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;
import java.util.function.Predicate;

public class CAMMDA_Tier1 extends PickaxeItem {
    public CAMMDA_Tier1(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(DCTier.CAMMDA_TIER1, 0, 0, pProperties);
    }

    @Override
    public boolean mineBlock(ItemStack pStack, Level level, BlockState pState, BlockPos pPos, LivingEntity pMiningEntity) {
        return super.mineBlock(pStack, level, pState, pPos, pMiningEntity);
    }

    @Override
    public float getDestroySpeed(ItemStack pStack, BlockState pState) {
        return 3.0f;
    }

//    @Override
//    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
//        ItemStack stack = player.getItemInHand(hand);
//        int charge = stack.getOrCreateTag().getInt("charge");
//        boolean flag = !player.getProjectile(stack).isEmpty();
//        if (!level.isClientSide() && hand == InteractionHand.OFF_HAND){
//            charge++;
//            if (charge > 3) {
//                charge = 0;
//            }
//            stack.getTag().putInt("charge", charge);
//            if (level.isClientSide()) {
//                player.sendMessage(new TranslatableComponent("message.cammda_tier1.charge", Integer.toString(charge)), Util.NIL_UUID);
//            }
//        }
//        return InteractionResultHolder.success(stack);
//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
//        super.appendHoverText(stack, level, list, flags);
//        int charge = stack.hasTag() ? stack.getTag().getInt("charge") : 0;
//        list.add(new TranslatableComponent("message.cammda_tier1.tooltip").withStyle(ChatFormatting.BLUE));
//    }
//    class CAMMDA01 extends BowItem {
//
//        public CAMMDA01(Properties pProperties) {
//            super(pProperties);
//        }
//
//        public void releaseUsing(ItemStack pStack, Level level, LivingEntity pEntityLiving, int pTimeLeft) {
//            if (pEntityLiving instanceof Player) {
//                Player player = (Player)pEntityLiving;
//                boolean flag = player.getAbilities().instabuild || EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, pStack) > 0;
//                ItemStack itemstack = player.getProjectile(pStack);
//
//                int i = this.getUseDuration(pStack) - pTimeLeft;
//                i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(pStack, level, player, i, !itemstack.isEmpty() || flag);
//                if (i < 0) return;
//
//                if (!itemstack.isEmpty() || flag) {
//                    if (itemstack.isEmpty()) {
//                        itemstack = new ItemStack(Items.ARROW);
//                    }
//
//                    float f = getPowerForTime(i);
//                    if (!((double)f < 0.1D)) {
//                        boolean flag1 = player.getAbilities().instabuild || (itemstack.getItem() instanceof ArrowItem && ((ArrowItem)itemstack.getItem()).isInfinite(itemstack, pStack, player));
//                        if (!level.isClientSide) {
//                            ArrowItem arrowitem = (ArrowItem)(itemstack.getItem() instanceof ArrowItem ? itemstack.getItem() : Items.ARROW);
//                            AbstractArrow abstractarrow = arrowitem.createArrow(level, itemstack, player);
//                            abstractarrow = customArrow(abstractarrow);
//                            abstractarrow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, f * 3.0F, 1.0F);
//                            if (f == 1.0F) {
//                                abstractarrow.setCritArrow(true);
//                            }
//
//                            int j = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, pStack);
//                            if (j > 0) {
//                                abstractarrow.setBaseDamage(abstractarrow.getBaseDamage() + (double)j * 0.5D + 0.5D);
//                            }
//
//                            int k = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PUNCH_ARROWS, pStack);
//                            if (k > 0) {
//                                abstractarrow.setKnockback(k);
//                            }
//
//                            if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, pStack) > 0) {
//                                abstractarrow.setSecondsOnFire(100);
//                            }
//
//                            pStack.hurtAndBreak(1, player, (p_40665_) -> {
//                                p_40665_.broadcastBreakEvent(player.getUsedItemHand());
//                            });
//                            if (flag1 || player.getAbilities().instabuild && (itemstack.is(Items.SPECTRAL_ARROW) || itemstack.is(Items.TIPPED_ARROW))) {
//                                abstractarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
//                            }
//
//                            level.addFreshEntity(abstractarrow);
//                        }
//
//                        level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F / (level.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F);
//                        if (!flag1 && !player.getAbilities().instabuild) {
//                            itemstack.shrink(1);
//                            if (itemstack.isEmpty()) {
//                                player.getInventory().removeItem(itemstack);
//                            }
//                        }
//
//                        player.awardStat(Stats.ITEM_USED.get(this));
//                    }
//                }
//            }
//        }
//
//        public InteractionResultHolder<ItemStack> use(Level level, Player pPlayer, InteractionHand pHand) {
//            ItemStack itemstack = pPlayer.getItemInHand(pHand);
//            boolean flag = !pPlayer.getProjectile(itemstack).isEmpty();
//            InteractionResultHolder<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, level, pPlayer, pHand, flag);
//            if (ret != null) return ret;
//
//            if (!pPlayer.getAbilities().instabuild && !flag) {
//                return InteractionResultHolder.fail(itemstack);
//            } else {
//                pPlayer.startUsingItem(pHand);
//                return InteractionResultHolder.consume(itemstack);
//            }
//        }
//        public static float getPowerForTime(int pCharge) {
//            float f = (float)pCharge / 20.0F;
//            f = (f * f + f * 2.0F) / 3.0F;
//            if (f > 1.0F) {
//                f = 1.0F;
//            }
//
//            return f;
//        }
//        public int getUseDuration(ItemStack pStack) {
//            return 72000;
//        }
//        public Predicate<ItemStack> getAllSupportedProjectiles() {
//            return ARROW_ONLY;
//        }
//
//        public AbstractArrow customArrow(AbstractArrow arrow) {
//            return arrow;
//        }
//
//        public int getDefaultProjectileRange() {
//            return 15;
//        }
//    }
}



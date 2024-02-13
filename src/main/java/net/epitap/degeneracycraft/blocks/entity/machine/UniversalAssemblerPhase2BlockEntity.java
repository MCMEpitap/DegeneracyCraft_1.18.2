//package net.epitap.degeneracycraft.blocks.entity.machine;
//
//import net.epitap.degeneracycraft.blocks.entity.DCBlockEntities;
//import net.epitap.degeneracycraft.blocks.menu.machine.UniversalAssemblerPhase2Menu;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Direction;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.world.Containers;
//import net.minecraft.world.MenuProvider;
//import net.minecraft.world.SimpleContainer;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.inventory.ContainerData;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraftforge.common.capabilities.Capability;
//import net.minecraftforge.common.util.LazyOptional;
//import net.minecraftforge.items.CapabilityItemHandler;
//import net.minecraftforge.items.IItemHandler;
//import net.minecraftforge.items.ItemStackHandler;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import javax.annotation.Nonnull;
//import java.util.Optional;
//
//
//public class UniversalAssemblerPhase2BlockEntity extends BlockEntity implements MenuProvider {
//    private final ItemStackHandler itemHandler = new ItemStackHandler(22) {
//        @Override
//        protected void onContentsChanged(int slot) {
//            setChanged();
//        }
//    };
//
//    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
//
//    protected final ContainerData data;
//    private int progress = 0;
//    private int maxProgress = 72;
//
//    public UniversalAssemblerPhase2BlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
//        super(DCBlockEntities.UNIVERSAL_ASSEMBLER_PHASE2_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
//        this.data = new ContainerData() {
//            public int get(int index) {
//                switch (index) {
//                    case 0:
//                        return UniversalAssemblerPhase2BlockEntity.this.progress;
//                    case 1:
//                        return UniversalAssemblerPhase2BlockEntity.this.maxProgress;
//                    default:
//                        return 0;
//                }
//            }
//
//            public void set(int index, int value) {
//                switch (index) {
//                    case 0:
//                        UniversalAssemblerPhase2BlockEntity.this.progress = value;
//                        break;
//                    case 1:
//                        UniversalAssemblerPhase2BlockEntity.this.maxProgress = value;
//                        break;
//                }
//            }
//
//            public int getCount() {
//                return 2;
//            }
//        };
//    }
//
//    @Override
//    public Component getDisplayName() {
//        return new TranslatableComponent("");
//    }
//
//    @Nullable
//    @Override
//    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
//        return new UniversalAssemblerPhase2Menu(pContainerId, pInventory, this, this.data);
//    }
//
//    @Nonnull
//    @Override
//    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
//        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
//            return lazyItemHandler.cast();
//        }
//
//        return super.getCapability(cap, side);
//    }
//
//    @Override
//    public void onLoad() {
//        super.onLoad();
//        lazyItemHandler = LazyOptional.of(() -> itemHandler);
//    }
//
//    @Override
//    public void invalidateCaps() {
//        super.invalidateCaps();
//        lazyItemHandler.invalidate();
//    }
//
//    @Override
//    protected void saveAdditional(@NotNull CompoundTag tag) {
//        tag.put("inventory", itemHandler.serializeNBT());
//        tag.putInt("pulverization.progress", progress);
//        super.saveAdditional(tag);
//    }
//
//    @Override
//    public void load(CompoundTag nbt) {
//        super.load(nbt);
//        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
//        progress = nbt.getInt("pulverization.progress");
//    }
//
//    public void drops() {
//        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
//        for (int i = 0; i < itemHandler.getSlots(); i++) {
//            inventory.setItem(i, itemHandler.getStackInSlot(i));
//        }
//
//        Containers.dropContents(this.level, this.worldPosition, inventory);
//    }
//
//    public static void tick(Level level, BlockPos pPos, BlockState pState, UniversalAssemblerPhase2BlockEntity blockEntity) {
//        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
//        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
//            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
//        }
//
//        Optional<testRecipe> match = level.getRecipeManager()
//                .getRecipeFor(testRecipe.Type.INSTANCE, inventory, level);
//
//
//        if(match.isPresent()){
//            if (hasNotReachedStackLimit(blockEntity) &&
//                    (blockEntity.itemHandler.getStackInSlot(21).is(match.get().getResultItem().getItem())
//                            || blockEntity.itemHandler.getStackInSlot(21).isEmpty())) {
//                blockEntity.progress++;
//                setChanged(level, pPos, pState);
//                    if (blockEntity.progress > blockEntity.maxProgress) {
//                        craftItem(blockEntity);
//                    }
//                } else {
//                blockEntity.resetProgress();
//                setChanged(level, pPos, pState);
//            }
////            if (!checkItem(blockEntity)){
////                blockEntity.resetProgress();
////                setChanged(level, pPos, pState);
////            }
//
//            } else {
//                blockEntity.resetProgress();
//                setChanged(level, pPos, pState);
//            }
//        }
//
//    private static void craftItem(UniversalAssemblerPhase2BlockEntity blockEntity) {
//        Level level = blockEntity.level;
//        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
//        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
//            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
//        }
//
//        Optional<testRecipe> match = level.getRecipeManager()
//                .getRecipeFor(testRecipe.Type.INSTANCE, inventory, level);
//
//        if (match.isPresent()){
//            blockEntity.itemHandler.extractItem(0, 1, false);
//            blockEntity.itemHandler.extractItem(1, 1, false);
//            blockEntity.itemHandler.setStackInSlot(21, new ItemStack(match.get().getResultItem().getItem(),
//                       blockEntity.itemHandler.getStackInSlot(21).getCount() + match.get().getResultItem().getCount()));
//           }
//        blockEntity.resetProgress();
//        }
//
//
//
//    private static boolean hasRecipe(UniversalAssemblerPhase2BlockEntity pBlockEntity) {
//        Level level = pBlockEntity.level;
//        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
//        for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
//            inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
//        }
//
//        Optional<testRecipe> match = level.getRecipeManager()
//                .getRecipeFor(testRecipe.Type.INSTANCE, inventory, level);
//
//
//
//
//        return match.isPresent();
//    }
//
////    public static boolean checkItem(UniversalAssemblerPhase2BlockEntity pBlockEntity) {
////        Level level = pBlockEntity.level;
////        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
////
////        Optional<testRecipe> match = level.getRecipeManager()
////                .getRecipeFor(testRecipe.Type.INSTANCE, inventory, level);
////
////
////        return pBlockEntity.itemHandler.getStackInSlot(0).is(match.get().ge.getItem())
////                && pBlockEntity.itemHandler.getStackInSlot(1).is(match.get().getRecipe1Item().getItem());
////    }
//
////    public static boolean checkItemAmount(UniversalAssemblerPhase2BlockEntity pBlockEntity) {
////        Level level = pBlockEntity.level;
////        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
////
////
////        Optional<testRecipe> match = level.getRecipeManager()
////                .getRecipeFor(testRecipe.Type.INSTANCE, inventory, level);
////
////        final boolean checkItemAmount =
////                match.get().getRecipe0Item().getCount() <= pBlockEntity.itemHandler.getStackInSlot(0).getCount()
////                && match.get().getRecipe1Item().getCount() <= pBlockEntity.itemHandler.getStackInSlot(1).getCount();
////
////
//////        boolean checkItemAmount = false;
//////        for (int i = 0; i < 9; i++) {
//////            checkItemAmount = match.get().getIngredients().get(i + 9).toString().length() <= pBlockEntity.itemHandler.getStackInSlot(i).getCount();
//////        }
////
////        return checkItemAmount;
////    }
//
//
//    private void resetProgress() {
//        this.progress = 0;
//    }
//
//
//    private static boolean hasNotReachedStackLimit(UniversalAssemblerPhase2BlockEntity entity) {
//        return entity.itemHandler.getStackInSlot(21).getCount() < entity.itemHandler.getStackInSlot(21).getMaxStackSize();
//    }
//
//}
//
//
//
//
//
//
//
//
////    public static void tick(Level level, BlockPos pPos, BlockState pState, UniversalAssemblerPhase2BlockEntity pBlockEntity) {
////        if((    iron_boltRecipe(pBlockEntity) ||
////                iron_keyRecipe(pBlockEntity) ||
////                iron_springRecipe(pBlockEntity) ||
////                iron_rodRecipe(pBlockEntity) ||
////                iron_bearingRecipe(pBlockEntity)) && hasNotReachedStackLimit(pBlockEntity)) {
////            pBlockEntity.progress++;
////            setChanged(level, pPos, pState);
////            if(pBlockEntity.progress > pBlockEntity.maxProgress) {
////                if (iron_boltRecipe(pBlockEntity)){
////                    iron_boltCraft(pBlockEntity);
////                }
////                if (iron_keyRecipe(pBlockEntity)){
////                    iron_keyCraft(pBlockEntity);
////                }
////                if (iron_springRecipe(pBlockEntity)){
////                    iron_springCraft(pBlockEntity);
////                }
////                if (iron_rodRecipe(pBlockEntity)){
////                    iron_rodCraft(pBlockEntity);
////                }
////                if (iron_bearingRecipe(pBlockEntity)){
////                    iron_bearingRecipe(pBlockEntity);
////                }
////
////
////
////
////
////            }
////        } else {
////            pBlockEntity.resetProgress();
////            setChanged(level, pPos, pState);
////        }
////    }
////
////    private static boolean iron_boltRecipe(UniversalAssemblerPhase2BlockEntity entity) {
////        boolean slot1 = entity.itemHandler.getStackInSlot(2).getItem() == Items.IRON_INGOT;
////        boolean slot2 = entity.itemHandler.getStackInSlot(5).getItem() == Items.IRON_INGOT;
////        return slot1 && slot2;
////    }
////
////
////    private static void iron_boltCraft(UniversalAssemblerPhase2BlockEntity entity) {
////
////        entity.itemHandler.extractItem(2,1,false);
////        entity.itemHandler.extractItem(5,1,false);
////
////        entity.itemHandler.setStackInSlot(10, new ItemStack(DCItems.IRON_BOLT.get(),
////                    entity.itemHandler.getStackInSlot(10).getCount() + 1));
////
////        entity.resetProgress();
////    }
////    private static boolean iron_keyRecipe(UniversalAssemblerPhase2BlockEntity entity) {
////        boolean slot1 = entity.itemHandler.getStackInSlot(4).getItem() == Items.IRON_INGOT;
////        boolean slot2 = entity.itemHandler.getStackInSlot(5).getItem() == Items.IRON_INGOT;
////        boolean slot3 = entity.itemHandler.getStackInSlot(6).getItem() == Items.IRON_INGOT;
////        return slot1 && slot2 && slot3;
////    }
////
////
////    private static void iron_keyCraft(UniversalAssemblerPhase2BlockEntity entity) {
////
////        entity.itemHandler.extractItem(4,1,false);
////        entity.itemHandler.extractItem(5,1,false);
////        entity.itemHandler.extractItem(6,1,false);
////
////        entity.itemHandler.setStackInSlot(10, new ItemStack(DCItems.IRON_KEY.get(),
////                entity.itemHandler.getStackInSlot(10).getCount() + 1));
////
////        entity.resetProgress();
////    }
////
////    private static boolean iron_springRecipe(UniversalAssemblerPhase2BlockEntity entity) {
////        boolean slot1 = entity.itemHandler.getStackInSlot(2).getItem() == Items.IRON_INGOT;
////        boolean slot2 = entity.itemHandler.getStackInSlot(5).getItem() == Items.IRON_INGOT;
////        boolean slot3 = entity.itemHandler.getStackInSlot(8).getItem() == Items.IRON_INGOT;
////        return slot1 && slot2 && slot3;
////    }
////
////
////    private static void iron_springCraft(UniversalAssemblerPhase2BlockEntity entity) {
////
////        entity.itemHandler.extractItem(2,1,false);
////        entity.itemHandler.extractItem(5,1,false);
////        entity.itemHandler.extractItem(8,1,false);
////
////        entity.itemHandler.setStackInSlot(10, new ItemStack(DCItems.IRON_SPRING.get(),
////                entity.itemHandler.getStackInSlot(10).getCount() + 1));
////
////        entity.resetProgress();
////    }
////
////    private static boolean iron_rodRecipe(UniversalAssemblerPhase2BlockEntity entity) {
////        boolean slot1 = entity.itemHandler.getStackInSlot(3).getItem() == Items.IRON_INGOT;
////        boolean slot2 = entity.itemHandler.getStackInSlot(5).getItem() == Items.IRON_INGOT;
////        boolean slot3 = entity.itemHandler.getStackInSlot(7).getItem() == Items.IRON_INGOT;
////        return slot1 && slot2 && slot3;
////    }
////
////
////    private static void iron_rodCraft(UniversalAssemblerPhase2BlockEntity entity) {
////
////        entity.itemHandler.extractItem(3,1,false);
////        entity.itemHandler.extractItem(5,1,false);
////        entity.itemHandler.extractItem(7,1,false);
////
////        entity.itemHandler.setStackInSlot(10, new ItemStack(DCItems.IRON_ROD.get(),
////                entity.itemHandler.getStackInSlot(10).getCount() + 1));
////
////        entity.resetProgress();
////    }
////    private static boolean iron_bearingRecipe(UniversalAssemblerPhase2BlockEntity entity) {
////        boolean slot1 = entity.itemHandler.getStackInSlot(2).getItem() == Items.IRON_INGOT;
////        boolean slot2 = entity.itemHandler.getStackInSlot(4).getItem() == Items.IRON_INGOT;
////        boolean slot3 = entity.itemHandler.getStackInSlot(6).getItem() == Items.IRON_INGOT;
////        boolean slot4 = entity.itemHandler.getStackInSlot(8).getItem() == Items.IRON_INGOT;
////        return slot1 && slot2 && slot3 && slot4;
////    }
////
////
////    private static void iron_bearingCraft(UniversalAssemblerPhase2BlockEntity entity) {
////
////        entity.itemHandler.extractItem(2,1,false);
////        entity.itemHandler.extractItem(4,1,false);
////        entity.itemHandler.extractItem(6,1,false);
////        entity.itemHandler.extractItem(8,1,false);
////
////        entity.itemHandler.setStackInSlot(10, new ItemStack(DCItems.IRON_ROD.get(),
////                entity.itemHandler.getStackInSlot(10).getCount() + 1));
////
////        entity.resetProgress();
//

//package net.epitap.degeneracycraft.block.screen;
//
//import com.mojang.blaze3d.systems.RenderSystem;
//import com.mojang.blaze3d.vertex.PoseStack;
//import net.epitap.degeneracycraft.Degeneracycraft;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
//import net.minecraft.client.renderer.GameRenderer;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.entity.player.Inventory;
//
//public class UniversalAssemblerPhase9Screen extends AbstractContainerScreen<UniversalAssemblerPhase9Menu> {
//
//    private static final ResourceLocation TEXTURE =
//            new ResourceLocation(Degeneracycraft.MOD_ID,"textures/gui/universal_assembler_phase1_gui.png");
//
//
//
//    public UniversalAssemblerPhase9Screen(UniversalAssemblerPhase9Menu pMenu, Inventory pPlayerInventory, Component pTitle) {
//        super(pMenu, pPlayerInventory, pTitle);
//    }
//
//    @Override
//    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
//        RenderSystem.setShader(GameRenderer::getPositionTexShader);
//        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
//        RenderSystem.setShaderTexture(0, TEXTURE);
//        int x = 134;
//        int y = 8;
//
//        this.blit(pPoseStack, x, y, 0, 0, 211, 256);
//        if(menu.isCrafting()) {
//            int l = this.menu.getScaledProgress();
//            blit(pPoseStack, x + 154, y + 36, 0, 20,l+1,11);
//        }
//    }
//    @Override
//    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
//        drawString(matrixStack, Minecraft.getInstance().font, "" , 64, 64, 0xffffff);
//    }
//    @Override
//    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
//        renderBackground(pPoseStack);
//        super.render(pPoseStack, mouseX, mouseY, delta);
//        renderTooltip(pPoseStack, mouseX, mouseY);
//    }
//}

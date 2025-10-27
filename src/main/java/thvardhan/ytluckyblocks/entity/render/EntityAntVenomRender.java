package thvardhan.ytluckyblocks.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;

public class EntityAntVenomRender extends MobRenderer<EntityAntVenom, BipedModel<EntityAntVenom>> {

    protected ResourceLocation antVenom;

    public EntityAntVenomRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BipedModel<>(0.0F), 0.5F);
        this.antVenom = new ResourceLocation(Main.MODID, "textures/entity/ant_skin.png");
    }

    @Override
    protected void renderName(EntityAntVenom entity, ITextComponent displayNameIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        double yHeightCorrection = -1.1D;  // Adjust this value as needed to bring the nameplate down.

        matrixStackIn.push();  // Push the current transformation to the stack
        matrixStackIn.translate(0.0D, yHeightCorrection, 0.0D);  // Apply the translation

        super.renderName(entity, displayNameIn, matrixStackIn, bufferIn, packedLightIn);

        matrixStackIn.pop();  // Pop the last transformation off the stack to revert the change
    }

    @Override
    public void render(EntityAntVenom entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.push();
        matrixStackIn.scale(1.5F, 1.5F, 1.5F);
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.pop();
    }

    @Override
    public ResourceLocation getEntityTexture(EntityAntVenom entity) {
        return this.antVenom;
    }
}
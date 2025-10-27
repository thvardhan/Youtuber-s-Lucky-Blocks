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
import thvardhan.ytluckyblocks.entity.EntityDanTDM;

public class EntityDanTDMRender extends MobRenderer<EntityDanTDM, BipedModel<EntityDanTDM>> {

    protected ResourceLocation texture;

    public EntityDanTDMRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BipedModel<>(0.0F), 0.5F);
        this.texture = new ResourceLocation(Main.MODID, "textures/entity/dan_skin.png");
    }

    @Override
    protected void renderName(EntityDanTDM entity, ITextComponent displayNameIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        double yHeightCorrection = -3.1D;  // Adjust this value as needed to bring the nameplate down.

        matrixStackIn.push();  // Push the current transformation to the stack
        matrixStackIn.translate(0.0D, yHeightCorrection, 0.0D);  // Apply the translation

        super.renderName(entity, displayNameIn, matrixStackIn, bufferIn, packedLightIn);

        matrixStackIn.pop();  // Pop the last transformation off the stack to revert the change
    }

    @Override
    public void render(EntityDanTDM entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.push();
        matrixStackIn.scale(2.5F, 2.5F, 2.5F);
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.pop();
    }

    @Override
    public ResourceLocation getEntityTexture(EntityDanTDM entity) {
        return this.texture;
    }
}
package thvardhan.ytluckyblocks.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;

public class PopularmmosRender extends BipedRenderer<EntityPopularMMO, BipedModel<EntityPopularMMO>> {

    protected ResourceLocation TEXTURE;

    public PopularmmosRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BipedModel<>(0.0F), 0.5F);
        this.TEXTURE = new ResourceLocation(Main.MODID, "textures/entity/popularmmo.png");
    }

    @Override
    protected void renderName(EntityPopularMMO entity, ITextComponent displayNameIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        double yHeightCorrection = -0.1D;  // Adjust this value as needed to bring the nameplate down.

        matrixStackIn.push();  // Push the current transformation to the stack
        matrixStackIn.translate(0.0D, yHeightCorrection, 0.0D);  // Apply the translation

        super.renderName(entity, displayNameIn, matrixStackIn, bufferIn, packedLightIn);

        matrixStackIn.pop();  // Pop the last transformation off the stack to revert the change
    }

    @Override
    public void render(EntityPopularMMO entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.push();
        matrixStackIn.scale(3.5F, 3F, 3F);
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.pop();
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPopularMMO entity) {
        return this.TEXTURE;
    }
}
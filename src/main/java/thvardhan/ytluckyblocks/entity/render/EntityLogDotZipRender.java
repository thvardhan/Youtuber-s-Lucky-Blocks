package thvardhan.ytluckyblocks.entity.render;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.model.EntityLogDotZipModel;

public class EntityLogDotZipRender extends BipedRenderer<EntityLogDotZip, EntityLogDotZipModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/logdotzip.png");

    public EntityLogDotZipRender(EntityRendererManager mgr, EntityLogDotZipModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    protected void scale(EntityLogDotZip entity, MatrixStack ms, float partialTick) {
        ms.scale(2F, 2F, 2F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLogDotZip entity) {
        return TEX;
    }
}

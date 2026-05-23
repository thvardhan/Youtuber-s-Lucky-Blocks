package thvardhan.ytluckyblocks.entity.render;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.entity.model.EntityPopularMMOModel;

public class EntityPopularMMORender extends BipedRenderer<EntityPopularMMO, EntityPopularMMOModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/popularmmo.png");

    public EntityPopularMMORender(EntityRendererManager mgr, EntityPopularMMOModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    protected void scale(EntityPopularMMO entity, MatrixStack ms, float partialTick) {
        ms.scale(3F, 3F, 3F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPopularMMO entity) {
        return TEX;
    }
}

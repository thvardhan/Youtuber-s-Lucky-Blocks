package thvardhan.ytluckyblocks.entity.render;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityTruemu;
import thvardhan.ytluckyblocks.entity.model.EntityTruemuModel;

public class EntityTruemuRender extends BipedRenderer<EntityTruemu, EntityTruemuModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/truemu_skin.png");

    public EntityTruemuRender(EntityRendererManager mgr, EntityTruemuModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityTruemu entity) {
        return TEX;
    }
}

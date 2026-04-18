package thvardhan.ytluckyblocks.entity.render;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntitySuperGirlyGamer;
import thvardhan.ytluckyblocks.entity.model.EntitySuperGirlyGamerModel;

public class EntitySuperGirlyGamerRender extends BipedRenderer<EntitySuperGirlyGamer, EntitySuperGirlyGamerModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/super_skin.png");

    public EntitySuperGirlyGamerRender(EntityRendererManager mgr, EntitySuperGirlyGamerModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntitySuperGirlyGamer entity) {
        return TEX;
    }
}

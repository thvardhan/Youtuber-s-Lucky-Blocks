package thvardhan.ytluckyblocks.entity.render;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.entity.model.EntityISquidModel;

public class EntityISquidRender extends BipedRenderer<EntityISquid, EntityISquidModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/i_skin.png");

    public EntityISquidRender(EntityRendererManager mgr, EntityISquidModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityISquid entity) {
        return TEX;
    }
}

package thvardhan.ytluckyblocks.entity.render;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityCaptainSparklez;
import thvardhan.ytluckyblocks.entity.model.EntityCaptiainSparklezModel;

public class EntityCaptainSparklezRender extends BipedRenderer<EntityCaptainSparklez, EntityCaptiainSparklezModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/cap_skin.png");

    public EntityCaptainSparklezRender(EntityRendererManager mgr, EntityCaptiainSparklezModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityCaptainSparklez entity) {
        return TEX;
    }
}

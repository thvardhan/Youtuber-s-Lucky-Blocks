package thvardhan.ytluckyblocks.entity.render;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLuckyMob;
import thvardhan.ytluckyblocks.entity.model.EntityLuckyMobModel;

public class EntityLuckyMobRender extends BipedRenderer<EntityLuckyMob, EntityLuckyMobModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/lucky_mob.png");

    public EntityLuckyMobRender(EntityRendererManager mgr, EntityLuckyMobModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLuckyMob entity) {
        return TEX;
    }
}

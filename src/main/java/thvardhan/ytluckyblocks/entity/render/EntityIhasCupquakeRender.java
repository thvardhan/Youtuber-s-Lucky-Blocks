package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityIhasCupquake;

public class EntityIhasCupquakeRender extends BipedRenderer<EntityIhasCupquake, BipedModel<EntityIhasCupquake>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/ihas_skin.png");

    public EntityIhasCupquakeRender(EntityRendererManager mgr, BipedModel<EntityIhasCupquake> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityIhasCupquake entity) {
        return TEX;
    }
}

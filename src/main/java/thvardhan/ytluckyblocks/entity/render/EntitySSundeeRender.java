package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntitySSundee;

public class EntitySSundeeRender extends BipedRenderer<EntitySSundee, BipedModel<EntitySSundee>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/s_skin.png");

    public EntitySSundeeRender(EntityRendererManager mgr, BipedModel<EntitySSundee> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntitySSundee entity) {
        return TEX;
    }
}

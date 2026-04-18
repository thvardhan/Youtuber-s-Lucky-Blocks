package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityAphmau;

public class EntityAphmauRender extends BipedRenderer<EntityAphmau, BipedModel<EntityAphmau>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/aphmau.png");

    public EntityAphmauRender(EntityRendererManager mgr, BipedModel<EntityAphmau> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityAphmau entity) {
        return TEX;
    }
}

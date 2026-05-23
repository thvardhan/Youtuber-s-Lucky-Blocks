package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityScubaSteve;

public class EntityScubaSteveRender extends BipedRenderer<EntityScubaSteve, BipedModel<EntityScubaSteve>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/scuba_steve.png");

    public EntityScubaSteveRender(EntityRendererManager mgr, BipedModel<EntityScubaSteve> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityScubaSteve entity) {
        return TEX;
    }
}

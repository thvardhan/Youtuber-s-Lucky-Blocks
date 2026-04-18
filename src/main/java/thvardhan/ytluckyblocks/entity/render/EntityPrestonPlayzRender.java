package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityPrestonPlayz;

public class EntityPrestonPlayzRender extends BipedRenderer<EntityPrestonPlayz, BipedModel<EntityPrestonPlayz>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/preston_skin.png");

    public EntityPrestonPlayzRender(EntityRendererManager mgr, BipedModel<EntityPrestonPlayz> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPrestonPlayz entity) {
        return TEX;
    }
}

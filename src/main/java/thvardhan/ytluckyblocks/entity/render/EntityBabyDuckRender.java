package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityBabyDuck;

public class EntityBabyDuckRender extends BipedRenderer<EntityBabyDuck, BipedModel<EntityBabyDuck>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/babyduck.png");

    public EntityBabyDuckRender(EntityRendererManager mgr, BipedModel<EntityBabyDuck> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBabyDuck entity) {
        return TEX;
    }
}

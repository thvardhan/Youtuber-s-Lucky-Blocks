package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityDonutTheDog;

public class EntityDonutTheDogRender extends BipedRenderer<EntityDonutTheDog, BipedModel<EntityDonutTheDog>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/donutthedog.png");

    public EntityDonutTheDogRender(EntityRendererManager mgr, BipedModel<EntityDonutTheDog> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityDonutTheDog entity) {
        return TEX;
    }
}

package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityTinyTurtle;

public class EntityTinyTurtleRender extends BipedRenderer<EntityTinyTurtle, BipedModel<EntityTinyTurtle>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/tiny_turtle.png");

    public EntityTinyTurtleRender(EntityRendererManager mgr, BipedModel<EntityTinyTurtle> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityTinyTurtle entity) {
        return TEX;
    }
}

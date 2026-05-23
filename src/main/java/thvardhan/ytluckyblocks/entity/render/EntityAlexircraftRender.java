package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityAlexirCraft;

public class EntityAlexircraftRender extends BipedRenderer<EntityAlexirCraft, BipedModel<EntityAlexirCraft>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/alex_skin.png");

    public EntityAlexircraftRender(EntityRendererManager mgr, BipedModel<EntityAlexirCraft> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityAlexirCraft entity) {
        return TEX;
    }
}

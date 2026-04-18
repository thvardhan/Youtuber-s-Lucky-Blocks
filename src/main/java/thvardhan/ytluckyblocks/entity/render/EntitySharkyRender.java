package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntitySharky;

public class EntitySharkyRender extends BipedRenderer<EntitySharky, BipedModel<EntitySharky>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/sharky.png");

    public EntitySharkyRender(EntityRendererManager mgr, BipedModel<EntitySharky> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntitySharky entity) {
        return TEX;
    }
}

package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityTewity;

public class EntityTewityRender extends BipedRenderer<EntityTewity, BipedModel<EntityTewity>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/tewity_skin.png");

    public EntityTewityRender(EntityRendererManager mgr, BipedModel<EntityTewity> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityTewity entity) {
        return TEX;
    }
}

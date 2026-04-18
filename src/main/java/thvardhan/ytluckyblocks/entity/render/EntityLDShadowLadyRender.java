package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLDShadowLady;

public class EntityLDShadowLadyRender extends BipedRenderer<EntityLDShadowLady, BipedModel<EntityLDShadowLady>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/ld_skin.png");

    public EntityLDShadowLadyRender(EntityRendererManager mgr, BipedModel<EntityLDShadowLady> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLDShadowLady entity) {
        return TEX;
    }
}

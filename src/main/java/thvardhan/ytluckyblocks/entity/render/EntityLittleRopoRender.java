package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLittleRopo;

public class EntityLittleRopoRender extends BipedRenderer<EntityLittleRopo, BipedModel<EntityLittleRopo>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/little_ropo.png");

    public EntityLittleRopoRender(EntityRendererManager mgr, BipedModel<EntityLittleRopo> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLittleRopo entity) {
        return TEX;
    }
}

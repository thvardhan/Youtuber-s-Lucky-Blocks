package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLachlan;

public class EntityLachlanRender extends BipedRenderer<EntityLachlan, BipedModel<EntityLachlan>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/lac_skin.png");

    public EntityLachlanRender(EntityRendererManager mgr, BipedModel<EntityLachlan> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLachlan entity) {
        return TEX;
    }
}

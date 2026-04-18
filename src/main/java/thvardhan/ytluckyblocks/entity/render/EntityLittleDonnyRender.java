package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLittleDonny;

public class EntityLittleDonnyRender extends BipedRenderer<EntityLittleDonny, BipedModel<EntityLittleDonny>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/little_donny.png");

    public EntityLittleDonnyRender(EntityRendererManager mgr, BipedModel<EntityLittleDonny> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLittleDonny entity) {
        return TEX;
    }
}

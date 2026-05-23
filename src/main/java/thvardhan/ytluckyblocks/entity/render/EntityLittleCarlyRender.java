package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLittleCarlyMC;

public class EntityLittleCarlyRender extends BipedRenderer<EntityLittleCarlyMC, BipedModel<EntityLittleCarlyMC>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/little_carly.png");

    public EntityLittleCarlyRender(EntityRendererManager mgr, BipedModel<EntityLittleCarlyMC> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLittleCarlyMC entity) {
        return TEX;
    }
}

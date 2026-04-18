package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLittleKellyMC;

public class EntityLittleKellyRender extends BipedRenderer<EntityLittleKellyMC, BipedModel<EntityLittleKellyMC>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/little_kelly.png");

    public EntityLittleKellyRender(EntityRendererManager mgr, BipedModel<EntityLittleKellyMC> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLittleKellyMC entity) {
        return TEX;
    }
}

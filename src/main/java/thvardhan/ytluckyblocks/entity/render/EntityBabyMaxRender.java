package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityBabyMax;

public class EntityBabyMaxRender extends BipedRenderer<EntityBabyMax, BipedModel<EntityBabyMax>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/babymax.png");

    public EntityBabyMaxRender(EntityRendererManager mgr, BipedModel<EntityBabyMax> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBabyMax entity) {
        return TEX;
    }
}

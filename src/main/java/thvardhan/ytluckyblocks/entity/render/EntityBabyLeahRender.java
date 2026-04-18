package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityBabyLeah;

public class EntityBabyLeahRender extends BipedRenderer<EntityBabyLeah, BipedModel<EntityBabyLeah>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/babyleah.png");

    public EntityBabyLeahRender(EntityRendererManager mgr, BipedModel<EntityBabyLeah> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBabyLeah entity) {
        return TEX;
    }
}

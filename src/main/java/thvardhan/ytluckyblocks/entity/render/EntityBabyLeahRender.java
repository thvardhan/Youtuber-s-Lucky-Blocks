package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityBabyDuck;
import thvardhan.ytluckyblocks.entity.EntityBabyLeah;

public class EntityBabyLeahRender extends BipedRenderer<EntityBabyLeah, BipedModel<EntityBabyLeah>> {
    protected ResourceLocation texture = new ResourceLocation(Main.MODID + ":textures/entity/babyleah.png");

    public EntityBabyLeahRender(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(EntityBabyLeah entity) {
        return texture;
    }
}

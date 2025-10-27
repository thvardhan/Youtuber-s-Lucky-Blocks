package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;

import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityAlexirCraft;
import thvardhan.ytluckyblocks.entity.EntityBabyAngel;

public class EntityBabyAngelRender extends BipedRenderer<EntityBabyAngel, BipedModel<EntityBabyAngel>> {
    protected ResourceLocation texture = new ResourceLocation(Main.MODID + ":textures/entity/baby_angel.png");

    public EntityBabyAngelRender(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(EntityBabyAngel entity) {
        return texture;
    }
}

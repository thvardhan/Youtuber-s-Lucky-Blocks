package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;

import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityTruemu;

public class EntityTruemuRender extends BipedRenderer<EntityTruemu, BipedModel<EntityTruemu>> {
    protected ResourceLocation texture = new ResourceLocation(Main.MODID + ":textures/entity/truemu_skin.png");

    public EntityTruemuRender(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(EntityTruemu entity) {
        return texture;
    }
}

package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityVikkstar123;

public class EntityVikkstar123Render extends BipedRenderer<EntityVikkstar123, BipedModel<EntityVikkstar123>> {
    protected ResourceLocation texture = new ResourceLocation(Main.MODID + ":textures/entity/vik_skin.png");

    public EntityVikkstar123Render(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(EntityVikkstar123 entity) {
        return texture;
    }
}

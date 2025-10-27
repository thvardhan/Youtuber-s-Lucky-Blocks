package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityThnxCya;
import thvardhan.ytluckyblocks.entity.EntityVikkstar123;

public class EntityThnxCyaRender extends BipedRenderer<EntityThnxCya, BipedModel<EntityThnxCya>> {
    protected ResourceLocation texture = new ResourceLocation(Main.MODID + ":textures/entity/thnx_skin.png");

    public EntityThnxCyaRender(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(EntityThnxCya entity) {
        return texture;
    }
}

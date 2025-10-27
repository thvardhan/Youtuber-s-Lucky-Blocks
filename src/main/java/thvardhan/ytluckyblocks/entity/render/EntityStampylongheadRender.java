package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityStampylonghead;
import thvardhan.ytluckyblocks.entity.EntityTewity;

public class EntityStampylongheadRender extends BipedRenderer<EntityStampylonghead, BipedModel<EntityStampylonghead>> {
    protected ResourceLocation texture = new ResourceLocation(Main.MODID + ":textures/entity/stampy_skin.png");

    public EntityStampylongheadRender(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(EntityStampylonghead entity) {
        return texture;
    }
}

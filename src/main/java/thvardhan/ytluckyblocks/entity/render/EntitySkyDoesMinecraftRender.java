package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntitySkyDoesMinecraft;
import thvardhan.ytluckyblocks.entity.EntitySuperGirlyGamer;

public class EntitySkyDoesMinecraftRender extends BipedRenderer<EntitySkyDoesMinecraft, BipedModel<EntitySkyDoesMinecraft>> {
    protected ResourceLocation texture = new ResourceLocation(Main.MODID + ":textures/entity/sky_skin.png");

    public EntitySkyDoesMinecraftRender(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(EntitySkyDoesMinecraft entity) {
        return texture;
    }
}

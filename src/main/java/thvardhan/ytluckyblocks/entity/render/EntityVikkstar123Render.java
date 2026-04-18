package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityVikkstar123;

public class EntityVikkstar123Render extends BipedRenderer<EntityVikkstar123, BipedModel<EntityVikkstar123>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/vik_skin.png");

    public EntityVikkstar123Render(EntityRendererManager mgr, BipedModel<EntityVikkstar123> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityVikkstar123 entity) {
        return TEX;
    }
}

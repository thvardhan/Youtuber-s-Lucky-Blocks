package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityStampylonghead;

public class EntityStampylongheadRender extends BipedRenderer<EntityStampylonghead, BipedModel<EntityStampylonghead>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/stampy_skin.png");

    public EntityStampylongheadRender(EntityRendererManager mgr, BipedModel<EntityStampylonghead> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityStampylonghead entity) {
        return TEX;
    }
}

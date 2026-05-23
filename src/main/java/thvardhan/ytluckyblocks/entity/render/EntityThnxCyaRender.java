package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityThnxCya;

public class EntityThnxCyaRender extends BipedRenderer<EntityThnxCya, BipedModel<EntityThnxCya>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/thnx_skin.png");

    public EntityThnxCyaRender(EntityRendererManager mgr, BipedModel<EntityThnxCya> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityThnxCya entity) {
        return TEX;
    }
}

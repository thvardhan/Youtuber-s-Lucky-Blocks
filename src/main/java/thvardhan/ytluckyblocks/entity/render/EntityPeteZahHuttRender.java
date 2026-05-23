package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityPeteZahHutt;

public class EntityPeteZahHuttRender extends BipedRenderer<EntityPeteZahHutt, BipedModel<EntityPeteZahHutt>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/peta_skin.png");

    public EntityPeteZahHuttRender(EntityRendererManager mgr, BipedModel<EntityPeteZahHutt> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPeteZahHutt entity) {
        return TEX;
    }
}

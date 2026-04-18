package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityJeromeASF;

public class EntityJeromeRender extends BipedRenderer<EntityJeromeASF, BipedModel<EntityJeromeASF>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/jerome_skin.png");

    public EntityJeromeRender(EntityRendererManager mgr, BipedModel<EntityJeromeASF> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityJeromeASF entity) {
        return TEX;
    }
}

package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityMrCrainer;

public class EntityMrCrainerRender extends BipedRenderer<EntityMrCrainer, BipedModel<EntityMrCrainer>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/mrcrainer.png");

    public EntityMrCrainerRender(EntityRendererManager mgr, BipedModel<EntityMrCrainer> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMrCrainer entity) {
        return TEX;
    }
}

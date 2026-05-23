package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityMrWoofless;

public class EntityMrWooflessRender extends BipedRenderer<EntityMrWoofless, BipedModel<EntityMrWoofless>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/mr_skin.png");

    public EntityMrWooflessRender(EntityRendererManager mgr, BipedModel<EntityMrWoofless> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMrWoofless entity) {
        return TEX;
    }
}

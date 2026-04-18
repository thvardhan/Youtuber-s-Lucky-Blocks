package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityBajanCanadian;

public class EntityBajanCanadianRender extends BipedRenderer<EntityBajanCanadian, BipedModel<EntityBajanCanadian>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/bajan_skin.png");

    public EntityBajanCanadianRender(EntityRendererManager mgr, BipedModel<EntityBajanCanadian> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBajanCanadian entity) {
        return TEX;
    }
}

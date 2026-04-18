package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityFrizzleandpop;

public class EntityFrizzleandpopRender extends BipedRenderer<EntityFrizzleandpop, BipedModel<EntityFrizzleandpop>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/frizz_skin.png");

    public EntityFrizzleandpopRender(EntityRendererManager mgr, BipedModel<EntityFrizzleandpop> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityFrizzleandpop entity) {
        return TEX;
    }
}

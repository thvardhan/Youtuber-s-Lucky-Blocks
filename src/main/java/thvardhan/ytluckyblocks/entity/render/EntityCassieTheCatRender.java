package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityCassieTheCat;

public class EntityCassieTheCatRender extends BipedRenderer<EntityCassieTheCat, BipedModel<EntityCassieTheCat>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/cassiethecat.png");

    public EntityCassieTheCatRender(EntityRendererManager mgr, BipedModel<EntityCassieTheCat> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityCassieTheCat entity) {
        return TEX;
    }
}

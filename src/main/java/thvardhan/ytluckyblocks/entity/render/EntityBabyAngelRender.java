package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityBabyAngel;

public class EntityBabyAngelRender extends BipedRenderer<EntityBabyAngel, BipedModel<EntityBabyAngel>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/baby_angel.png");

    public EntityBabyAngelRender(EntityRendererManager mgr, BipedModel<EntityBabyAngel> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBabyAngel entity) {
        return TEX;
    }
}

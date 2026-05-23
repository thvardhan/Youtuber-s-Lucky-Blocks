package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityMaxTheMonkey;

public class EntityMaxTheMonkeyRender extends BipedRenderer<EntityMaxTheMonkey, BipedModel<EntityMaxTheMonkey>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/max_the_monkey.png");

    public EntityMaxTheMonkeyRender(EntityRendererManager mgr, BipedModel<EntityMaxTheMonkey> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMaxTheMonkey entity) {
        return TEX;
    }
}

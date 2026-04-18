package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityEvilLittleKelly;

public class EntityEvilLittleKellyRender extends BipedRenderer<EntityEvilLittleKelly, BipedModel<EntityEvilLittleKelly>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/evillittlekelly.png");

    public EntityEvilLittleKellyRender(EntityRendererManager mgr, BipedModel<EntityEvilLittleKelly> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityEvilLittleKelly entity) {
        return TEX;
    }
}

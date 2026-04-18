package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLittleAlly;

public class EntityLittleAllyRender extends BipedRenderer<EntityLittleAlly, BipedModel<EntityLittleAlly>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/littleally.png");

    public EntityLittleAllyRender(EntityRendererManager mgr, BipedModel<EntityLittleAlly> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLittleAlly entity) {
        return TEX;
    }
}

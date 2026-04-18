package thvardhan.ytluckyblocks.entity.render;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityLittleLizardGaming;

public class EntityLittleLizardGamingRender extends BipedRenderer<EntityLittleLizardGaming, BipedModel<EntityLittleLizardGaming>> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/littlelizardgaming.png");

    public EntityLittleLizardGamingRender(EntityRendererManager mgr, BipedModel<EntityLittleLizardGaming> model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLittleLizardGaming entity) {
        return TEX;
    }
}

package thvardhan.ytluckyblocks.entity.render;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.model.EntityAntVenomModel;

public class EntityAntVenomRender extends BipedRenderer<EntityAntVenom, EntityAntVenomModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/ant_skin.png");

    public EntityAntVenomRender(EntityRendererManager mgr, EntityAntVenomModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    protected void scale(EntityAntVenom entity, MatrixStack ms, float partialTick) {
        ms.scale(1.5F, 1.5F, 1.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityAntVenom entity) {
        return TEX;
    }
}

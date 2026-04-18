package thvardhan.ytluckyblocks.entity.render;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityDanTDM;
import thvardhan.ytluckyblocks.entity.model.EntityDanTDMModel;

public class EntityDanTDMRender extends BipedRenderer<EntityDanTDM, EntityDanTDMModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/dan_skin.png");

    public EntityDanTDMRender(EntityRendererManager mgr, EntityDanTDMModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    protected void scale(EntityDanTDM entity, MatrixStack ms, float partialTick) {
        ms.scale(2.5F, 2.5F, 2.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityDanTDM entity) {
        return TEX;
    }
}

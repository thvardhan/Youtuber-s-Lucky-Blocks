package thvardhan.ytluckyblocks.entity.render;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntitySerialPlayer;
import thvardhan.ytluckyblocks.entity.model.EntitySerialPlayerModel;

public class EntitySerialPlayerRender extends BipedRenderer<EntitySerialPlayer, EntitySerialPlayerModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/serial_skin.png");

    public EntitySerialPlayerRender(EntityRendererManager mgr, EntitySerialPlayerModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    protected void scale(EntitySerialPlayer entity, MatrixStack ms, float partialTick) {
        ms.scale(0.5F, 0.5F, 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntitySerialPlayer entity) {
        return TEX;
    }
}

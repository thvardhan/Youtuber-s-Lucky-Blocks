package thvardhan.ytluckyblocks.entity.render;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.model.EntityGhostModel;

public class EntityGhostRender extends BipedRenderer<EntityGhost, EntityGhostModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/ghost_skin.png");

    public EntityGhostRender(EntityRendererManager mgr, EntityGhostModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityGhost entity) {
        return TEX;
    }
}

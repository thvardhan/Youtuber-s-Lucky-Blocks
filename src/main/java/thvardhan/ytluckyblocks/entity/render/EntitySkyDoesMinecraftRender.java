package thvardhan.ytluckyblocks.entity.render;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntitySkyDoesMinecraft;
import thvardhan.ytluckyblocks.entity.model.EntitySkyDoesMinecraftModel;

public class EntitySkyDoesMinecraftRender extends BipedRenderer<EntitySkyDoesMinecraft, EntitySkyDoesMinecraftModel> {

    private static final ResourceLocation TEX = new ResourceLocation(Main.MODID, "textures/entity/sky_skin.png");

    public EntitySkyDoesMinecraftRender(EntityRendererManager mgr, EntitySkyDoesMinecraftModel model, float shadow) {
        super(mgr, model, shadow);
    }

    @Override
    public ResourceLocation getTextureLocation(EntitySkyDoesMinecraft entity) {
        return TEX;
    }
}

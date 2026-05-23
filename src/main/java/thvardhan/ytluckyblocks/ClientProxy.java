package thvardhan.ytluckyblocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.ReloadListener;
import net.minecraft.profiler.IProfiler;
import net.minecraft.resources.IReloadableResourceManager;
import net.minecraft.resources.IResourceManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.entity.model.*;
import thvardhan.ytluckyblocks.entity.render.*;
import thvardhan.ytluckyblocks.items.render.ItemRenderRegistry;
import thvardhan.ytluckyblocks.render.blocks.BlockRenderRegister;

public class ClientProxy extends CommonProxy {

    /**
     * Re-run {@link RenderingRegistry#loadEntityRenderers} on the next client tick end as well as
     * immediately, so a dispatcher swap or reload step that completes later in the same frame
     * still leaves mod renderers registered before {@link net.minecraft.client.renderer.WorldRenderer}
     * renders entities.
     */
    private boolean reapplyEntityRenderersNextClientTick;

    public ClientProxy() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            MinecraftForge.EVENT_BUS.addListener(this::onClientPlayerLoggedIn);
            MinecraftForge.EVENT_BUS.addListener(this::onClientPlayerRespawn);
            MinecraftForge.EVENT_BUS.addListener(this::onClientTickEnd);
        }
    }

    private static void applyModEntityRenderers() {
        RenderingRegistry.loadEntityRenderers(Minecraft.getInstance().getEntityRenderDispatcher());
    }

    private void scheduleEntityRendererReapply() {
        this.reapplyEntityRenderersNextClientTick = true;
        if (Minecraft.getInstance().level != null) {
            applyModEntityRenderers();
        }
    }

    private void onClientPlayerLoggedIn(ClientPlayerNetworkEvent.LoggedInEvent event) {
        if (event.getPlayer() != null && event.getPlayer().level.isClientSide) {
            scheduleEntityRendererReapply();
        }
    }

    private void onClientPlayerRespawn(ClientPlayerNetworkEvent.RespawnEvent event) {
        if (event.getPlayer() != null && event.getPlayer().level.isClientSide) {
            scheduleEntityRendererReapply();
        }
    }

    private void onClientTickEnd(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }
        if (!this.reapplyEntityRenderersNextClientTick) {
            return;
        }
        this.reapplyEntityRenderersNextClientTick = false;
        if (Minecraft.getInstance().level != null) {
            applyModEntityRenderers();
        }
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            BlockRenderRegister.registerBlockRenderer();
            ItemRenderRegistry.registerItemRender();

            RenderingRegistry.registerEntityRenderingHandler(EntityScubaSteve.TYPE,
                    mgr -> new EntityScubaSteveRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLittleRopo.TYPE,
                    mgr -> new EntityLittleRopoRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityMrCrainer.TYPE,
                    mgr -> new EntityMrCrainerRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityBabyAngel.TYPE,
                    mgr -> new EntityBabyAngelRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityAphmau.TYPE,
                    mgr -> new EntityAphmauRender(mgr, new BipedModel<>(0.0F), 0.5F));

            RenderingRegistry.registerEntityRenderingHandler(EntityBabyDuck.TYPE,
                    mgr -> new EntityBabyDuckRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityBabyLeah.TYPE,
                    mgr -> new EntityBabyLeahRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityBabyMax.TYPE,
                    mgr -> new EntityBabyMaxRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityCassieTheCat.TYPE,
                    mgr -> new EntityCassieTheCatRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityDonutTheDog.TYPE,
                    mgr -> new EntityDonutTheDogRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityEvilLittleKelly.TYPE,
                    mgr -> new EntityEvilLittleKellyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLittleAlly.TYPE,
                    mgr -> new EntityLittleAllyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLittleCarlyMC.TYPE,
                    mgr -> new EntityLittleCarlyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLittleDonny.TYPE,
                    mgr -> new EntityLittleDonnyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLittleKellyMC.TYPE,
                    mgr -> new EntityLittleKellyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLittleLizardGaming.TYPE,
                    mgr -> new EntityLittleLizardGamingRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityMaxTheMonkey.TYPE,
                    mgr -> new EntityMaxTheMonkeyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntitySharky.TYPE,
                    mgr -> new EntitySharkyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityTinyTurtle.TYPE,
                    mgr -> new EntityTinyTurtleRender(mgr, new BipedModel<>(0.0F), 0.5F));

            RenderingRegistry.registerEntityRenderingHandler(EntityExplodingTNT.TYPE,
                    mgr -> new EntityExplodingTNTRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityMrWoofless.TYPE,
                    mgr -> new EntityMrWooflessRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLachlan.TYPE,
                    mgr -> new EntityLachlanRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityVikkstar123.TYPE,
                    mgr -> new EntityVikkstar123Render(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityPeteZahHutt.TYPE,
                    mgr -> new EntityPeteZahHuttRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityPinkSheep.TYPE,
                    mgr -> new EntityPinkSheepRender(mgr, new BipedModel<>(0.0F), 0.5F));

            RenderingRegistry.registerEntityRenderingHandler(EntityIhasCupquake.TYPE,
                    mgr -> new EntityIhasCupquakeRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLDShadowLady.TYPE,
                    mgr -> new EntityLDShadowLadyRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityPrestonPlayz.TYPE,
                    mgr -> new EntityPrestonPlayzRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntitySSundee.TYPE,
                    mgr -> new EntitySSundeeRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityStampylonghead.TYPE,
                    mgr -> new EntityStampylongheadRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityThnxCya.TYPE,
                    mgr -> new EntityThnxCyaRender(mgr, new BipedModel<>(0.0F), 0.5F));

            RenderingRegistry.registerEntityRenderingHandler(EntityBajanCanadian.TYPE,
                    mgr -> new EntityBajanCanadianRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityFrizzleandpop.TYPE,
                    mgr -> new EntityFrizzleandpopRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityTewity.TYPE,
                    mgr -> new EntityTewityRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityAlexirCraft.TYPE,
                    mgr -> new EntityAlexircraftRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityJeromeASF.TYPE,
                    mgr -> new EntityJeromeRender(mgr, new BipedModel<>(0.0F), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLuckyMob.TYPE,
                    mgr -> new EntityLuckyMobRender(mgr, new EntityLuckyMobModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityTruemu.TYPE,
                    mgr -> new EntityTruemuRender(mgr, new EntityTruemuModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityISquid.TYPE,
                    mgr -> new EntityISquidRender(mgr, new EntityISquidModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntitySkyDoesMinecraft.TYPE,
                    mgr -> new EntitySkyDoesMinecraftRender(mgr, new EntitySkyDoesMinecraftModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntitySuperGirlyGamer.TYPE,
                    mgr -> new EntitySuperGirlyGamerRender(mgr, new EntitySuperGirlyGamerModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntitySerialPlayer.TYPE,
                    mgr -> new EntitySerialPlayerRender(mgr, new EntitySerialPlayerModel(), 0.1F));
            RenderingRegistry.registerEntityRenderingHandler(EntityDanTDM.TYPE,
                    mgr -> new EntityDanTDMRender(mgr, new EntityDanTDMModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityGhost.TYPE,
                    mgr -> new EntityGhostRender(mgr, new EntityGhostModel(), 0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityCaptainSparklez.TYPE,
                    mgr -> new EntityCaptainSparklezRender(mgr, new EntityCaptiainSparklezModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLogDotZip.TYPE,
                    mgr -> new EntityLogDotZipRender(mgr, new EntityLogDotZipModel(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityPopularMMO.TYPE,
                    mgr -> new EntityPopularMMORender(mgr, new EntityPopularMMOModel(), 0.5F));

            RenderingRegistry.registerEntityRenderingHandler(EntityAntVenom.TYPE,
                    mgr -> new EntityAntVenomRender(mgr, new EntityAntVenomModel(), 0.8F));

            IResourceManager resourceManager = Minecraft.getInstance().getResourceManager();
            if (resourceManager instanceof IReloadableResourceManager) {
                ((IReloadableResourceManager) resourceManager).registerReloadListener(new ReloadListener<Void>() {
                    @Override
                    public String getName() {
                        return "ytluckyblocks:entity_renderers";
                    }

                    @Override
                    protected Void prepare(IResourceManager manager, IProfiler profiler) {
                        return null;
                    }

                    @Override
                    protected void apply(Void unused, IResourceManager manager, IProfiler profiler) {
                        scheduleEntityRendererReapply();
                    }
                });
            }
        });
    }
}

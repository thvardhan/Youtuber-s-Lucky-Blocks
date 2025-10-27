package thvardhan.ytluckyblocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import thvardhan.ytluckyblocks.entity.*;
//import thvardhan.ytluckyblocks.entity.model.*;
import thvardhan.ytluckyblocks.entity.render.*;
/*import thvardhan.ytluckyblocks.handler.YTEventHandler;
import thvardhan.ytluckyblocks.init.ModItems;
import thvardhan.ytluckyblocks.init.ModTabs;
import thvardhan.ytluckyblocks.items.render.ItemRenderRegistry;*/


import net.minecraftforge.fml.common.Mod;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import thvardhan.ytluckyblocks.render.blocks.BlockRenderRegister;


@Mod(Main.MODID)
public class Main {
    public static final String MODID = "ytluckyblocks";
    public static final String VERSION = "6.1.2";
    public static final String NAME = "YouTuber's Lucky Blocks Mod";
    private static final Logger LOGGER = LogManager.getLogger();
    public static Main instance;

    public Main() {
        instance = this;
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        // Register ourselves for server and other game events we are interested in
       // MinecraftForge.EVENT_BUS.register(new YTEventHandler());
        RegistrationHandler.init();
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("Creating mod tabs");
       //ModTabs.createTabs();
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(RegistrationHandler.SCUBA_STEVE.get(), EntityScubaSteve.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.ALEXIRCRAFT.get(), EntityAlexirCraft.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.ANTVENNOM.get(), EntityAntVenom.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.APHMAU.get(), EntityAphmau.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.BABY_ANGEL.get(), EntityBabyAngel.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.BABY_DUCK.get(), EntityBabyDuck.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.BABY_LEAH.get(), EntityBabyLeah.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.BABY_MAX.get(), EntityBabyMax.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.BABJANCANADIAN.get(), EntityBajanCanadian.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.CAPTAIN_SPARKLEZ.get(), EntityCaptainSparklez.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.CASSIE_THE_CAT.get(), EntityCassieTheCat.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.DONUT_THE_DOG.get(), EntityDonutTheDog.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.DANTDM.get(), EntityDanTDM.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.EVIL_LITTLE_KELLY.get(), EntityEvilLittleKelly.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.EXPLODING_TNT.get(), EntityExplodingTNT.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.FRIZZLEANDPOP.get(), EntityFrizzleandpop.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.IHASCUPQUAKE.get(), EntityIhasCupquake.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.ISQUID.get(), EntityISquid.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.JEROMEASF.get(), EntityJeromeASF.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LACHLAN.get(), EntityLachlan.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LDSHADOWLADY.get(), EntityLDShadowLady.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LITTLEALLY.get(), EntityLittleAlly.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LITTLECARLYMC.get(), EntityLittleCarlyMC.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LITTLEDONNY.get(), EntityLittleDonny.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LITTLEKELLYMC.get(), EntityLittleKellyMC.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LITTLELIZARDGAMING.get(), EntityLittleLizardGaming.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LITTLEROPO.get(), EntityLittleRopo.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.MAXTHEMONKEY.get(), EntityMaxTheMonkey.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.MRCRAINER.get(), EntityMrCrainer.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.MRWOOFLESS.get(), EntityMrWoofless.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.PETEZAHHUTT.get(), EntityPeteZahHutt.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.PINKSHEEP.get(), EntityPinkSheep.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.PRESTONPLAYZ.get(), EntityPrestonPlayz.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.SHARKY.get(), EntitySharky.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.TINYTURTLE.get(), EntityTinyTurtle.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.VIKKSTAR123.get(), EntityVikkstar123.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.SSUNDEE.get(), EntitySSundee.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.STAMPYLONGHEAD.get(), EntityStampylonghead.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.TEWITY.get(), EntityTewity.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.THNXCYA.get(), EntityThnxCya.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.LOGDOTZIP.get(), EntityLogDotZip.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.POPULARMMOS.get(), EntityPopularMMO.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.SERIALPLAYER.get(), EntitySerialPlayer.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.SKYDOESMINECRAFT.get(), EntitySkyDoesMinecraft.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.SUPERGIRLYGAMER.get(), EntitySuperGirlyGamer.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.TRUEMU.get(), EntityTruemu.getAttributes().create());
            GlobalEntityTypeAttributes.put(RegistrationHandler.GHOST.get(), EntityGhost.getAttributes().create());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.SCUBA_STEVE.get(), EntityScubaSteveRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.ALEXIRCRAFT.get(), EntityAlexircraftRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.ANTVENNOM.get(), EntityAntVenomRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.APHMAU.get(), EntityAphmauRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.BABY_ANGEL.get(), EntityBabyAngelRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.BABY_DUCK.get(), EntityBabyDuckRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.BABY_LEAH.get(), EntityBabyLeahRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.BABY_MAX.get(), EntityBabyMaxRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.BABJANCANADIAN.get(), EntityBajanCanadianRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.CAPTAIN_SPARKLEZ.get(), EntityCaptainSparklezRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.CASSIE_THE_CAT.get(), EntityCassieTheCatRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.DONUT_THE_DOG.get(), EntityDonutTheDogRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.DANTDM.get(), EntityDanTDMRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.EVIL_LITTLE_KELLY.get(), EntityEvilLittleKellyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.EXPLODING_TNT.get(), EntityExplodingTNTRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.FRIZZLEANDPOP.get(), EntityFrizzleandpopRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.IHASCUPQUAKE.get(), EntityIhasCupquakeRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.ISQUID.get(), EntityISquidRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.JEROMEASF.get(), EntityJeromeASFRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LACHLAN.get(), EntityLachlanRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LDSHADOWLADY.get(), EntityLDShadowLadyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LITTLEALLY.get(), EntityLittleAllyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LITTLECARLYMC.get(), EntityLittleCarlyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LITTLEDONNY.get(), EntityLittleDonnyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LITTLEKELLYMC.get(), EntityLittleKellyMCRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LITTLELIZARDGAMING.get(), EntityLittleLizardGamingRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LITTLEROPO.get(), EntityLittleRopoRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.MAXTHEMONKEY.get(), EntityMaxTheMonkeyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.MRCRAINER.get(), EntityMrCrainerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.MRWOOFLESS.get(), EntityMrWooflessRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.PETEZAHHUTT.get(), EntityPetaRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.PINKSHEEP.get(), EntityPinkSheepRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.PRESTONPLAYZ.get(), EntityPrestonRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.SHARKY.get(), EntitySharkyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.TINYTURTLE.get(), EntityTinyTurtleRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.VIKKSTAR123.get(), EntityVikkstar123Render::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.TEWITY.get(), EntityTewityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.THNXCYA.get(), EntityThnxCyaRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.SSUNDEE.get(), EntitySSundeeRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.STAMPYLONGHEAD.get(), EntityStampylongheadRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.LOGDOTZIP.get(), EntityLogDotZipRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.POPULARMMOS.get(), PopularmmosRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.SERIALPLAYER.get(), EntitySerialPlayerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.SKYDOESMINECRAFT.get(), EntitySkyDoesMinecraftRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.SUPERGIRLYGAMER.get(), EntitySuperGirlyGamerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.TRUEMU.get(), EntityTruemuRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistrationHandler.GHOST.get(), EntityGhostRender::new);
        RenderTypeLookup.setRenderLayer(RegistrationHandler.DIAMOND_PLAY_BUTTON.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistrationHandler.MIC_BLOCK.get(), RenderType.getCutout());
        registerEntities();
    }

    public static final ItemGroup MAIN = new ItemGroup("main") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistrationHandler.ICON.get());
        }
    };

    public static final ItemGroup ARMOR = new ItemGroup("armor") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistrationHandler.YT_CHEST.get());
        }
    };
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }

    private void registerEntities() {
      /* registerModEntityWithEgg(EntityLuckyMob.class, "luckymob", 0x0, 0x0);
        BlockRenderRegister.registerBlockRenderer();
        ItemRenderRegistry.registerItemRender();*/
    }


}

package thvardhan.ytluckyblocks;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.entity.model.*;
import thvardhan.ytluckyblocks.entity.render.*;
import thvardhan.ytluckyblocks.handler.YTEventHandler;
import thvardhan.ytluckyblocks.init.ModItems;
import thvardhan.ytluckyblocks.init.ModTabs;
import thvardhan.ytluckyblocks.items.render.ItemRenderRegistry;


import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import thvardhan.ytluckyblocks.entity.*;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import thvardhan.ytluckyblocks.render.blocks.BlockRenderRegister;

import java.util.stream.Collectors;


@Mod(Main.MODID)
public class Main {
    public static final String MODID = "ytluckyblocks";
    public static final String VERSION = "6.1.2";
    public static final String NAME = "YouTuber's Lucky Blocks Mod";
    private static final Logger LOGGER = LogManager.getLogger();
//    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);
//    @DistExecutor(clientSide = "thvardhan.ytluckyblocks.proxy.ClientProxy", serverSide = "thvardhan.ytluckyblocks.proxy.ServerProxy")
//    public static CommonProxy proxy;
//    @Mod.Instance(MODID)
    public static Main instance;
//    private static int modEntitys = 0;

    public Main() {
        instance = this;
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(new YTEventHandler());
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("Creating mod tabs");
        ModTabs.createTabs();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        registerEntities();

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

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


        registerModEntityWithEgg(EntityScubaSteve.class, "scubasteve", 0xffcc00, 0xffff00);
        registerModEntityWithEgg(EntityLittleRopo.class, "littleropo", 0xcc00cc, 0xffffb3);
        registerModEntityWithEgg(EntityMrCrainer.class, "mrcrainer", 0x000000, 0xff944d);
        registerModEntityWithEgg(EntityBabyAngel.class, "babyangel", 0x999999, 0xe6e6e6);
        registerModEntityWithEgg(EntityAphmau.class, "aphmau", 0x000000, 0xff944d);


        registerModEntityWithEgg(EntityBabyDuck.class, "babyduck", 0xffcc00, 0xffff00);
        registerModEntityWithEgg(EntityBabyLeah.class, "babyleah", 0xcc00cc, 0xffffb3);
        registerModEntityWithEgg(EntityBabyMax.class, "babymax", 0x000000, 0xff944d);
        registerModEntityWithEgg(EntityCassieTheCat.class, "cassiethecat", 0x999999, 0xe6e6e6);
        registerModEntityWithEgg(EntityDonutTheDog.class, "donutthedog", 0x000000, 0xff944d);
        registerModEntityWithEgg(EntityEvilLittleKelly.class, "evillittlekelly", 0xff1a1a, 0xffffb3);
        registerModEntityWithEgg(EntityLittleAlly.class, "littleally", 0xff8566, 0xffffb3);
        registerModEntityWithEgg(EntityLittleCarlyMC.class, "littlecarly", 0x66ccff, 0xffffb3);
        registerModEntityWithEgg(EntityLittleDonny.class, "littledonny", 0x1ab2ff, 0xff8c1a);
        registerModEntityWithEgg(EntityLittleKellyMC.class, "littlekelly", 0xff99ff, 0x99ff66);
        registerModEntityWithEgg(EntityLittleLizardGaming.class, "littlelizardgaming", 0x009933, 0xccffcc);
        registerModEntityWithEgg(EntityMaxTheMonkey.class, "maxthemonkey", 0xcc6600, 0xffcc99);
        registerModEntityWithEgg(EntitySharky.class, "sharky", 0x6666ff, 0x00ccff);
        registerModEntityWithEgg(EntityTinyTurtle.class, "tinyturtle", 0x006600, 0x994d00);


        registerModEntityWithEgg(EntityExplodingTNT.class, "explodingtnt", 0xff0000, 0x000000);
        registerModEntityWithEgg(EntityMrWoofless.class, "mrwoofless", 0x3366ff, 0xffaa80);
        registerModEntityWithEgg(EntityLachlan.class, "lachlan", 0xff944d, 0xffcc99);
        registerModEntityWithEgg(EntityVikkstar123.class, "vikkstar123", 0x005ce6, 0xffcc00);
        registerModEntityWithEgg(EntityPeteZahHutt.class, "petazahhutt", 0xccff99, 0x66ff66);
        registerModEntityWithEgg(EntityPinkSheep.class, "pinksheep", 0xff00ff, 0x330033);

        registerModEntityWithEgg(EntityThnxCya.class, "thnxcya", 0x00cc66, 0x333300);
        registerModEntityWithEgg(EntityStampylonghead.class, "stampylonghead", 0xffcc00, 0xff9933);
        registerModEntityWithEgg(EntitySSundee.class, "ssundee", 0x000000, 0xcc6600);
        registerModEntityWithEgg(EntityPrestonPlayz.class, "prestonplayz", 0xff0000, 0xff6600);
        registerModEntityWithEgg(EntityLDShadowLady.class, "ldshadowlady", 0xcc99ff, 0x000066);
        registerModEntityWithEgg(EntityIhasCupquake.class, "ihascupquake", 0xff66ff, 0x66ff66);
        registerModEntityWithEgg(EntityTewity.class, "tewity", 0xffcc00, 0xffff1a);
        registerModEntityWithEgg(EntityFrizzleandpop.class, "frizzleandpop", 0xffcc00, 0x86b300);
        registerModEntityWithEgg(EntityBajanCanadian.class, "bajancanadian", 0xe60000, 0x000000);
        registerModEntityWithEgg(EntityAlexirCraft.class, "alexircraft", 0xcc00cc, 0x330033);
        registerModEntityWithEgg(EntityJeromeASF.class, "jerome", 0xb37700, 0xffad33);
        registerModEntityWithEgg(EntityLogDotZip.class, "logdotzip", 0xff3333, 0xffaa00);
        registerModEntityWithEgg(EntityPopularMMO.class, "popularmmo", 0x262626, 0x005580);
        registerModEntityWithEgg(EntityAntVenom.class, "antvenom", 0x77b300, 0x111a00);
        registerModEntityWithEgg(EntityCaptainSparklez.class, "captainsparklez", 0xff4d4d, 0xffffcc);
        registerModEntityWithEgg(EntityGhost.class, "ghost", 0x4d0000, 0x000000);
        registerModEntityWithEgg(EntityDanTDM.class, "dantdm", 0x66ffff, 0xffffff);
        registerModEntityWithEgg(EntitySerialPlayer.class, "thvardhan", 0xcc9900, 0xffff66);
        registerModEntityWithEgg(EntitySuperGirlyGamer.class, "supergirlygamer", 0xff33cc, 0xe6005c);
        registerModEntityWithEgg(EntityISquid.class, "iballisticsquid", 0x000066, 0x000000);
        registerModEntityWithEgg(EntitySkyDoesMinecraft.class, "skydoesminecraft", 0xffff33, 0x000000);
        registerModEntityWithEgg(EntityTruemu.class, "truemu", 0x0066ff, 0xff9933);
        registerModEntityWithEgg(EntityLuckyMob.class, "luckymob", 0x0, 0x0);

//        BlockRenderRegister.registerBlockRenderer();
//        ItemRenderRegistry.registerItemRender();
//        RenderingRegistry.registerEntityRenderingHandler(EntityScubaSteve.class, new EntityScubaSteveRender(new BipedModel<MobEntity>(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLittleRopo.class, new EntityLittleRopoRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityMrCrainer.class, new EntityMrCrainerRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityBabyAngel.class, new EntityBabyAngelRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityAphmau.class, new EntityAphmauRender(new ModelBiped(), 0.5F));
//
//
//        RenderingRegistry.registerEntityRenderingHandler(EntityBabyDuck.class, new EntityBabyDuckRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityBabyLeah.class, new EntityBabyLeahRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityBabyMax.class, new EntityBabyMaxRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityCassieTheCat.class, new EntityCassieTheCatRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityDonutTheDog.class, new EntityDonutTheDogRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityEvilLittleKelly.class, new EntityEvilLittleKellyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLittleAlly.class, new EntityLittleAllyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLittleCarlyMC.class, new EntityLittleCarlyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLittleDonny.class, new EntityLittleDonnyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLittleKellyMC.class, new EntityLittleKellyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLittleLizardGaming.class, new EntityLittleLizardGamingRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityMaxTheMonkey.class, new EntityMaxTheMonkeyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntitySharky.class, new EntitySharkyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityTinyTurtle.class, new EntityTinyTurtleRender(new ModelBiped(), 0.5F));
//
//
//        RenderingRegistry.registerEntityRenderingHandler(EntityExplodingTNT.class, new EntityExplodingTNTRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityMrWoofless.class, new EntityMrWooflessRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLachlan.class, new EntityLachlanRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityVikkstar123.class, new EntityVikkstar123Render(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityPeteZahHutt.class, new EntityPeteZahHuttRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityPinkSheep.class, new EntityPinkSheepRender(new ModelBiped(), 0.5F));
//
//
//        RenderingRegistry.registerEntityRenderingHandler(EntityIhasCupquake.class, new EntityIhasCupquakeRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLDShadowLady.class, new EntityLDShadowLadyRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrestonPlayz.class, new EntityPrestonPlayzRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntitySSundee.class, new EntitySSundeeRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityStampylonghead.class, new EntityStampylongheadRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityThnxCya.class, new EntityThnxCyaRender(new ModelBiped(), 0.5F));
//
//
//        RenderingRegistry.registerEntityRenderingHandler(EntityBajanCanadian.class, new EntityBajanCanadianRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityFrizzleandpop.class, new EntityFrizzleandpopRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityTewity.class, new EntityTewityRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityAlexirCraft.class, new EntityAlexircraftRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityJeromeASF.class, new EntityJeromeRender(new ModelBiped(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLuckyMob.class, new EntityLuckyMobRender(new EntityLuckyMobModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityTruemu.class, new EntityTruemuRender(new EntityTruemuModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityISquid.class, new EntityISquidRender(new EntityISquidModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntitySkyDoesMinecraft.class, new EntitySkyDoesMinecraftRender(new EntitySkyDoesMinecraftModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntitySuperGirlyGamer.class, new EntitySuperGirlyGamerRender(new EntitySuperGirlyGamerModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntitySerialPlayer.class, new EntitySerialPlayerRender(new EntitySerialPlayerModel(), 0.1F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityDanTDM.class, new EntityDanTDMRender(new EntityDanTDMModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new EntityGhostRender(new EntityGhostModel(), 0F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityCaptainSparklez.class, new EntityCaptainSparklezRender(new EntityCaptiainSparklezModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityLogDotZip.class, new EntityLogDotZipRender(new EntityLogDotZipModel(), 0.5F));
//        RenderingRegistry.registerEntityRenderingHandler(EntityPopularMMO.class, new EntityPopularMMORender(new EntityPopularMMOModel(), 0.5F));
//
//        RenderingRegistry.registerEntityRenderingHandler(EntityAntVenom.class, new EntityAntVenomRender(new EntityAntVenomModel(), 0.8F));

    }


    public void registerModEntityWithEgg(Class parEntityClass, String parEntityName, int parEggColor, int parEggSpotsColor) {
//        EntityRegistry.registerModEntity(new ResourceLocation(MODID, parEntityName), parEntityClass, parEntityName, ++modEntitys, Main.instance, 80, 3, false);
        registerSpawnEgg(parEntityName, parEntityClass, parEggColor, parEggSpotsColor);
    }

    private void registerSpawnEgg(String parEntityName, Class parEntityClass, int parEggColor,
                                  int parEggSpotsColor) {
//        EntityRegistry.registerEgg(new ResourceLocation(MODID, parEntityName), parEggColor, parEggSpotsColor);

    }


}

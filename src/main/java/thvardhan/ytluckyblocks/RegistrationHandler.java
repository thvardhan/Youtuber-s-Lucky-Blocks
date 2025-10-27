package thvardhan.ytluckyblocks;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import thvardhan.ytluckyblocks.blocks.*;
import thvardhan.ytluckyblocks.blocks.BlockItemBase;
import thvardhan.ytluckyblocks.blocks.DiamondButton;
import thvardhan.ytluckyblocks.blocks.MicBlock;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.items.*;

import static thvardhan.ytluckyblocks.items.ModArmorMaterial.*;
import static thvardhan.ytluckyblocks.items.ModItemTier.*;

public class RegistrationHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<EntityType<EntityScubaSteve>> SCUBA_STEVE = ENTITIES
            .register("scuba_steve",
                    () -> EntityType.Builder.<EntityScubaSteve>create(EntityScubaSteve::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "scuba_steve").toString()));

    public static final RegistryObject<EntityType<EntityAlexirCraft>> ALEXIRCRAFT = ENTITIES
            .register("alexircraft",
                    () -> EntityType.Builder.<EntityAlexirCraft>create(EntityAlexirCraft::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "alexircraft").toString()));

    public static final RegistryObject<EntityType<EntityAntVenom>> ANTVENNOM = ENTITIES
            .register("antvenom",
                    () -> EntityType.Builder.<EntityAntVenom>create(EntityAntVenom::new, EntityClassification.CREATURE)
                            .size(0.8F, 3.1F)
                            .build(new ResourceLocation(Main.MODID, "antvenom").toString()));

    public static final RegistryObject<EntityType<EntityAphmau>> APHMAU = ENTITIES
            .register("aphmau",
                    () -> EntityType.Builder.<EntityAphmau>create(EntityAphmau::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "aphmau").toString()));

    public static final RegistryObject<EntityType<EntityBabyAngel>> BABY_ANGEL = ENTITIES
            .register("baby_angel",
                    () -> EntityType.Builder.<EntityBabyAngel>create(EntityBabyAngel::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "baby_angel").toString()));

    public static final RegistryObject<EntityType<EntityBabyDuck>> BABY_DUCK = ENTITIES
            .register("baby_duck",
                    () -> EntityType.Builder.<EntityBabyDuck>create(EntityBabyDuck::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "baby_duck").toString()));

    public static final RegistryObject<EntityType<EntityBabyLeah>> BABY_LEAH = ENTITIES
            .register("baby_leah",
                    () -> EntityType.Builder.<EntityBabyLeah>create(EntityBabyLeah::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "baby_leah").toString()));

    public static final RegistryObject<EntityType<EntityBabyMax>> BABY_MAX = ENTITIES
            .register("baby_max",
                    () -> EntityType.Builder.<EntityBabyMax>create(EntityBabyMax::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "baby_max").toString()));

    public static final RegistryObject<EntityType<EntityBajanCanadian>> BABJANCANADIAN = ENTITIES
            .register("bajancanadian",
                    () -> EntityType.Builder.<EntityBajanCanadian>create(EntityBajanCanadian::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "bajancanadian").toString()));

    public static final RegistryObject<EntityType<EntityCaptainSparklez>> CAPTAIN_SPARKLEZ = ENTITIES
            .register("captain_sparklez",
                    () -> EntityType.Builder.<EntityCaptainSparklez>create(EntityCaptainSparklez::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "captain_sparklez").toString()));

    public static final RegistryObject<EntityType<EntityCassieTheCat>> CASSIE_THE_CAT = ENTITIES
            .register("cassie_the_cat",
                    () -> EntityType.Builder.<EntityCassieTheCat>create(EntityCassieTheCat::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "cassie_the_cat").toString()));
    public static final RegistryObject<EntityType<EntityDanTDM>> DANTDM = ENTITIES
            .register("dantdm",
                    () -> EntityType.Builder.<EntityDanTDM>create(EntityDanTDM::new, EntityClassification.CREATURE)
                            .size(1F, 5F)
                            .build(new ResourceLocation(Main.MODID, "dantdm").toString()));

    public static final RegistryObject<EntityType<EntityDonutTheDog>> DONUT_THE_DOG = ENTITIES
            .register("donutthedog",
                    () -> EntityType.Builder.<EntityDonutTheDog>create(EntityDonutTheDog::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "donutthedog").toString()));

    public static final RegistryObject<EntityType<EntityEvilLittleKelly>> EVIL_LITTLE_KELLY = ENTITIES
            .register("evil_little_kelly",
                    () -> EntityType.Builder.<EntityEvilLittleKelly>create(EntityEvilLittleKelly::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "evil_little_kelly").toString()));

    public static final RegistryObject<EntityType<EntityExplodingTNT>> EXPLODING_TNT = ENTITIES
            .register("exploding_tnt",
                    () -> EntityType.Builder.<EntityExplodingTNT>create(EntityExplodingTNT::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "exploding_tnt").toString()));

    public static final RegistryObject<EntityType<EntityFrizzleandpop>> FRIZZLEANDPOP = ENTITIES
            .register("frizzleandpop",
                    () -> EntityType.Builder.<EntityFrizzleandpop>create(EntityFrizzleandpop::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "frizzleandpop").toString()));

    public static final RegistryObject<EntityType<EntityIhasCupquake>> IHASCUPQUAKE = ENTITIES
            .register("ihascupquake",
                    () -> EntityType.Builder.<EntityIhasCupquake>create(EntityIhasCupquake::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "ihascupquake").toString()));

    public static final RegistryObject<EntityType<EntityISquid>> ISQUID = ENTITIES
            .register("isquid",
                    () -> EntityType.Builder.<EntityISquid>create(EntityISquid::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "isquid").toString()));

    public static final RegistryObject<EntityType<EntityJeromeASF>> JEROMEASF = ENTITIES
            .register("jeromeasf",
                    () -> EntityType.Builder.<EntityJeromeASF>create(EntityJeromeASF::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "jeromeasf").toString()));

    public static final RegistryObject<EntityType<EntityLachlan>> LACHLAN = ENTITIES
            .register("lachlan",
                    () -> EntityType.Builder.<EntityLachlan>create(EntityLachlan::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "lachlan").toString()));

    public static final RegistryObject<EntityType<EntityLDShadowLady>> LDSHADOWLADY = ENTITIES
            .register("ldshadowlady",
                    () -> EntityType.Builder.<EntityLDShadowLady>create(EntityLDShadowLady::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "ldshadowlady").toString()));

    public static final RegistryObject<EntityType<EntityLittleAlly>> LITTLEALLY = ENTITIES
            .register("little_ally",
                    () -> EntityType.Builder.<EntityLittleAlly>create(EntityLittleAlly::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "little_ally").toString()));

    public static final RegistryObject<EntityType<EntityLittleCarlyMC>> LITTLECARLYMC = ENTITIES
            .register("little_carlymc",
                    () -> EntityType.Builder.<EntityLittleCarlyMC>create(EntityLittleCarlyMC::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "little_carlymc").toString()));

    public static final RegistryObject<EntityType<EntityLittleDonny>> LITTLEDONNY= ENTITIES
            .register("little_donny",
                    () -> EntityType.Builder.<EntityLittleDonny>create(EntityLittleDonny::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "little_donny").toString()));

    public static final RegistryObject<EntityType<EntityLittleKellyMC>> LITTLEKELLYMC = ENTITIES
            .register("little_kellymc",
                    () -> EntityType.Builder.<EntityLittleKellyMC>create(EntityLittleKellyMC::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "little_kellymc").toString()));

    public static final RegistryObject<EntityType<EntityLittleLizardGaming>> LITTLELIZARDGAMING = ENTITIES
            .register("little_lizard_gaming",
                    () -> EntityType.Builder.<EntityLittleLizardGaming>create(EntityLittleLizardGaming::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "little_lizard_gaming").toString()));

    public static final RegistryObject<EntityType<EntityLittleRopo>> LITTLEROPO = ENTITIES
            .register("little_ropo",
                    () -> EntityType.Builder.<EntityLittleRopo>create(EntityLittleRopo::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "little_ropo").toString()));

    public static final RegistryObject<EntityType<EntityMaxTheMonkey>> MAXTHEMONKEY = ENTITIES
            .register("max_the_monkey",
                    () -> EntityType.Builder.<EntityMaxTheMonkey>create(EntityMaxTheMonkey::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "max_the_monkey").toString()));

    public static final RegistryObject<EntityType<EntityMrCrainer>> MRCRAINER = ENTITIES
            .register("mrcrainer",
                    () -> EntityType.Builder.<EntityMrCrainer>create(EntityMrCrainer::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "mrcrainer").toString()));

    public static final RegistryObject<EntityType<EntityMrWoofless>> MRWOOFLESS = ENTITIES
            .register("mrwoofless",
                    () -> EntityType.Builder.<EntityMrWoofless>create(EntityMrWoofless::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "mrwoofless").toString()));

    public static final RegistryObject<EntityType<EntityPeteZahHutt>> PETEZAHHUTT = ENTITIES
            .register("petezahhutt",
                    () -> EntityType.Builder.<EntityPeteZahHutt>create(EntityPeteZahHutt::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "petezahhutt").toString()));

    public static final RegistryObject<EntityType<EntityPinkSheep>> PINKSHEEP = ENTITIES
            .register("pink_sheep",
                    () -> EntityType.Builder.<EntityPinkSheep>create(EntityPinkSheep::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "pink_sheep").toString()));

    public static final RegistryObject<EntityType<EntityPrestonPlayz>> PRESTONPLAYZ = ENTITIES
            .register("preston_playz",
                    () -> EntityType.Builder.<EntityPrestonPlayz>create(EntityPrestonPlayz::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "preston_playz").toString()));

    public static final RegistryObject<EntityType<EntitySharky>> SHARKY = ENTITIES
            .register("sharky_lucky",
                    () -> EntityType.Builder.<EntitySharky>create(EntitySharky::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "sharky_luckyz").toString()));

    public static final RegistryObject<EntityType<EntityTinyTurtle>> TINYTURTLE = ENTITIES
            .register("tiny_turtle",
                    () -> EntityType.Builder.<EntityTinyTurtle>create(EntityTinyTurtle::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "tiny_turtle").toString()));

    public static final RegistryObject<EntityType<EntityVikkstar123>> VIKKSTAR123 = ENTITIES
            .register("vikkstar123",
                    () -> EntityType.Builder.<EntityVikkstar123>create(EntityVikkstar123::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "vikkstar123").toString()));

    public static final RegistryObject<EntityType<EntitySSundee>> SSUNDEE = ENTITIES
            .register("ssundee",
                    () -> EntityType.Builder.<EntitySSundee>create(EntitySSundee::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "ssundee").toString()));

    public static final RegistryObject<EntityType<EntityStampylonghead>> STAMPYLONGHEAD = ENTITIES
            .register("stampylonghead",
                    () -> EntityType.Builder.<EntityStampylonghead>create(EntityStampylonghead::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "stampylonghead").toString()));

    public static final RegistryObject<EntityType<EntityTewity>> TEWITY = ENTITIES
            .register("tewity",
                    () -> EntityType.Builder.<EntityTewity>create(EntityTewity::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "tewity").toString()));

    public static final RegistryObject<EntityType<EntityThnxCya>> THNXCYA = ENTITIES
            .register("thnxcya",
                    () -> EntityType.Builder.<EntityThnxCya>create(EntityThnxCya::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "thnxcya").toString()));

    public static final RegistryObject<EntityType<EntityLogDotZip>> LOGDOTZIP = ENTITIES
            .register("logdotzip",
                    () -> EntityType.Builder.<EntityLogDotZip>create(EntityLogDotZip::new, EntityClassification.CREATURE)
                            .size(0.6F, 1.95F)
                            .build(new ResourceLocation(Main.MODID, "logdotzip").toString()));

    public static final RegistryObject<EntityType<EntityPopularMMO>> POPULARMMOS = ENTITIES
            .register("popularmmos",
                    () -> EntityType.Builder.<EntityPopularMMO>create(EntityPopularMMO::new, EntityClassification.CREATURE)
                            .size(1F, 1.95F)
                            .build(new ResourceLocation(Main.MODID, "popularmmos").toString()));

    public static final RegistryObject<EntityType<EntitySerialPlayer>> SERIALPLAYER = ENTITIES
            .register("serial_player",
                    () -> EntityType.Builder.<EntitySerialPlayer>create(EntitySerialPlayer::new, EntityClassification.CREATURE)
                            .size(0.5F, 1F)
                            .build(new ResourceLocation(Main.MODID, "serial_player").toString()));

    public static final RegistryObject<EntityType<EntitySuperGirlyGamer>> SUPERGIRLYGAMER = ENTITIES
            .register("super_girly_gamer",
                    () -> EntityType.Builder.<EntitySuperGirlyGamer>create(EntitySuperGirlyGamer::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "super_girly_gamer").toString()));

    public static final RegistryObject<EntityType<EntitySkyDoesMinecraft>> SKYDOESMINECRAFT = ENTITIES
            .register("sky_does_minecraft",
                    () -> EntityType.Builder.<EntitySkyDoesMinecraft>create(EntitySkyDoesMinecraft::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "sky_does_minecraft").toString()));

    public static final RegistryObject<EntityType<EntityTruemu>> TRUEMU = ENTITIES
            .register("truemu",
                    () -> EntityType.Builder.<EntityTruemu>create(EntityTruemu::new, EntityClassification.CREATURE)
                            .size(0.6F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "truemu").toString()));

    public static final RegistryObject<EntityType<EntityGhost>> GHOST = ENTITIES
            .register("ghost",
                    () -> EntityType.Builder.<EntityGhost>create(EntityGhost::new, EntityClassification.CREATURE)
                            .size(0.8F, 2.0F)
                            .build(new ResourceLocation(Main.MODID, "ghost").toString()));

    public static final RegistryObject<Item> ALEXIRCRAFT_SPAWN_EGG = ITEMS.register("alexircraft_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.ALEXIRCRAFT, 0xcc00cc, 0x330033, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> ANTVENOM_SPAWN_EGG = ITEMS.register("antvenom_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.ANTVENNOM, 0x77b300, 0x111a00, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> SCUBA_STEVE_SPAWN_EGG = ITEMS.register("scuba_steve_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.SCUBA_STEVE, 0xffcc00, 0xffff00, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LITTLE_ROPO_SPAWN_EGG = ITEMS.register( "littleropo_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.LITTLEROPO, 0xcc00cc, 0xffffb3, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> MRCRAINER_SPAWN_EGG = ITEMS.register( "mrcrainer_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.MRCRAINER, 0x000000, 0xff944d, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> BABY_ANGEL_SPAWN_EGG = ITEMS.register("babyangel_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.BABY_ANGEL, 0x999999, 0xe6e6e6, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> APHMAU_SPAWN_EGG = ITEMS.register( "aphmau_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.APHMAU, 0x000000, 0xff944d, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> BABY_DUCK_SPAWN_EGG = ITEMS.register("babyduck_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.BABY_DUCK, 0xffcc00, 0xffff00, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> BABY_LEAH_SPAWN_EGG = ITEMS.register( "babyleah_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.BABY_LEAH, 0xcc00cc, 0xffffb3, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> BABY_MAX_SPAWN_EGG = ITEMS.register( "babymax_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.BABY_MAX, 0x000000, 0xff944d, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> CASSIE_THE_CAT_SPAWN_EGG = ITEMS.register( "cassiethecat_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.CASSIE_THE_CAT, 0x999999, 0xe6e6e6, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> DONUT_THE_DOG_SPAWN_EGG = ITEMS.register( "donutthedog_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.DONUT_THE_DOG, 0x000000, 0xff944d, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> EVIL_LITTLE_KELLY_SPAWN_EGG = ITEMS.register( "evillittlekelly_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.EVIL_LITTLE_KELLY, 0xff1a1a, 0xffffb3, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LITTLE_ALLY_SPAWN_EGG = ITEMS.register( "littleally_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.LITTLEALLY, 0xff8566, 0xffffb3, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LITTLE_CARLY_SPAWN_EGG = ITEMS.register( "littlecarly_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.LITTLECARLYMC,  0x66ccff, 0xffffb3, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LITTLE_DONNY_SPAWN_EGG = ITEMS.register( "littledonny_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.LITTLEDONNY, 0x1ab2ff, 0xff8c1a, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LITTLE_KELLY_SPAWN_EGG = ITEMS.register("littlekelly_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.LITTLEKELLYMC, 0xff99ff, 0x99ff66, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LITTLE_LIZARD_GAMING_SPAWN_EGG = ITEMS.register("littlelizardgaming_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.LITTLELIZARDGAMING, 0x009933, 0xccffcc, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> MAX_THE_MONKEY_SPAWN_EGG = ITEMS.register( "maxthemonkey_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.MAXTHEMONKEY, 0xcc6600, 0xffcc99, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> EXPLOADINGTNT_SPAWN_EGG = ITEMS.register( "explodingtnt_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.EXPLODING_TNT, 0xff0000, 0x000000,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> MR_WOOFLESS_SPAWN_EGG = ITEMS.register("mrwoofless_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.MRWOOFLESS, 0x3366ff, 0xffaa80,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LACHLAN_SPAWN_EGG = ITEMS.register( "lachlan_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.LACHLAN,0xff944d, 0xffcc99,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> PEETAZAHUTT_SPAWN_EGG = ITEMS.register( "petazahhutt_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.PETEZAHHUTT, 0xccff99, 0x66ff66,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> PINK_SHEEP_SPAWN_EGG = ITEMS.register( "pinksheep_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.PINKSHEEP, 0xff00ff, 0x330033,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> PRESTON_PLAYZ_SPAWN_EGG = ITEMS.register( "prestonplayz_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.PRESTONPLAYZ, 0xff0000, 0xff6600,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LSDHADOWLADY_SPAWN_EGG = ITEMS.register( "ldshadowlady_spawn_egg", () -> new ForgeSpawnEggItem(RegistrationHandler.LDSHADOWLADY,0xcc99ff, 0x000066,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> IHASCUPQUAKE_SPAWN_EGG = ITEMS.register( "ihascupquake_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.IHASCUPQUAKE, 0xff66ff, 0x66ff66,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> FRIZZLEANDPOP_SPAWN_EGG = ITEMS.register( "frizzleandpop_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.FRIZZLEANDPOP, 0xffcc00, 0x86b300,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> BAJANCANADIAN_SPAWN_EGG = ITEMS.register( "bajancanadian_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.BABJANCANADIAN, 0xe60000, 0x000000,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> JEROMEASF_SPAWN_EGG = ITEMS.register( "jerome_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.JEROMEASF, 0xb37700, 0xffad33,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> CAPTAINSPARKLEZ_SPAWN_EGG = ITEMS.register( "captainsparklez_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.CAPTAIN_SPARKLEZ, 0xff4d4d, 0xffffcc,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> ISQUID_SPAWN_EGG = ITEMS.register( "iballisticsquid_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.ISQUID, 0x000066, 0x000000,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> DANTDM_SPAWN_EGG = ITEMS.register( "dantdm_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.DANTDM, 0x000066, 0x000000,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> SHARKY_SPAWN_EGG = ITEMS.register( "sharky_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.SHARKY, 0x6666ff, 0x00ccff,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> TINYTURTLE_SPAWN_EGG = ITEMS.register( "tinyturtle_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.TINYTURTLE, 0x006600, 0x994d00,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> VICKSTAR_SPAWN_EGG = ITEMS.register( "vikkstar_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.VIKKSTAR123, 0x005ce6, 0xffcc00,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> SSUNDEE_SPAWN_EGG = ITEMS.register( "ssundee_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.SSUNDEE, 0x000000, 0xcc6600,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> STAMPYLONGHEAD_SPAWN_EGG = ITEMS.register( "stampylonghead_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.STAMPYLONGHEAD, 0xffcc00, 0xff9933,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> TEWTIY_SPAWN_EGG = ITEMS.register( "tewity_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.TEWITY, 0xffcc00, 0xffff1a,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> THNXCYA_SPAWN_EGG = ITEMS.register( "thnxcya_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.THNXCYA, 0x00cc66, 0x333300,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LOGDOTZIP_SPAWN_EGG = ITEMS.register( "logdotzip_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.LOGDOTZIP, 0xff3333, 0xffaa00,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> POPULARMMOS_SPAWN_EGG = ITEMS.register( "popularmmos_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.POPULARMMOS,  0x262626, 0x005580,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> SERIALPLAYER_SPAWN_EGG = ITEMS.register( "thvardhan_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.SERIALPLAYER,  0xcc9900, 0xffff66,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> SKYDOESMINECRAFT_SPAWN_EGG = ITEMS.register( "skythekidrs_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.SKYDOESMINECRAFT,  0xffff33, 0x000000,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> SUPERGIRLYGAMER_SPAWN_EGG = ITEMS.register( "jen_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.SUPERGIRLYGAMER,  0xff33cc, 0xe6005c,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> TRUEMU_SPAWN_EGG = ITEMS.register( "truemu_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.TRUEMU,  0x0066ff, 0xff9933,new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> GHOST_SPAWN_EGG = ITEMS.register( "ghost_spawn_egg",() -> new ForgeSpawnEggItem(RegistrationHandler.GHOST,  0x4d0000, 0x000000,new Item.Properties().group(Main.MAIN)));

    public static final RegistryObject<Item> MASTER_SWORD = ITEMS.register("m_sword", () -> new M_sword( MSWORD, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> BATTLE_AXE = ITEMS.register("battle_axe", () -> new M_sword( BATTLE, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> DEVIL_SWORD = ITEMS.register("devil_sword", () -> new M_sword( DEVIL, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LEVIN_SWORD = ITEMS.register("levin_sword", () -> new M_sword( LEVIN, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> MEGA_SWORD = ITEMS.register("mega_sword", () -> new M_sword( MEGA, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> RAINBOW_SWORD = ITEMS.register("rainbow_blade", () -> new M_sword( RAINBOW, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> SNOW_SWORD = ITEMS.register("snow_sword", () -> new M_sword( SNOW, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> BLACK_NEON_SWORD = ITEMS.register("black_sword", () -> new M_sword( BLACK_NEON, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> YT_HAMMER = ITEMS.register("yt_sword", () -> new M_sword( HAMMER, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> NASTY_SWORD = ITEMS.register("nasty_sword", () -> new Nasty_sword( NASTY, 3, -2.4F, new Item.Properties().group(Main.MAIN)));
    public static final RegistryObject<Item> LOG_SWORD = ITEMS.register("logdotzip_sword", () -> new SwordLogdotzip( LOG, 3, -2.4F, new Item.Properties().group(Main.MAIN)));

    public static final RegistryObject<Block> DIAMOND_PLAY_BUTTON = BLOCKS.register("diamond_button_block", DiamondButton::new);
    public static final RegistryObject<Item> DIAMOND_PLAY_BUTTON_BLOCK_ITEM = ITEMS.register("diamond_button_block", () -> new BlockItemBase(DIAMOND_PLAY_BUTTON.get()));
    public static final RegistryObject<Block> GOLD_PLAY_BUTTON = BLOCKS.register("gold_button_block", DiamondButton::new);
    public static final RegistryObject<Item> GOLD_PLAY_BUTTON_BLOCK_ITEM = ITEMS.register("gold_button_block", () -> new BlockItemBase(GOLD_PLAY_BUTTON.get()));
    public static final RegistryObject<Block> IRON_PLAY_BUTTON = BLOCKS.register("iron_button_block", DiamondButton::new);
    public static final RegistryObject<Item> IRON_PLAY_BUTTON_BLOCK_ITEM = ITEMS.register("iron_button_block", () -> new BlockItemBase(IRON_PLAY_BUTTON.get()));
    public static final RegistryObject<Block> MIC_BLOCK = BLOCKS.register("mic_block", MicBlock::new);
    public static final RegistryObject<Block> ALEXIRCRAFT_LUCKY_BLOCK = BLOCKS.register("alexircraft_lucky_block", AlexircraftLuckyBlock::new);
    public static final RegistryObject<Block> JEROMEASF_LUCKY_BLOCK = BLOCKS.register("jeromeasf_lucky_block", JeromeASFLuckyBlock::new);

    public static final RegistryObject<Item> MIC_BLOCKITEM = ITEMS.register("mic_block", () -> new BlockItemBase(MIC_BLOCK.get()));
    public static final RegistryObject<YtIcon> ICON = ITEMS.register("yticon", YtIcon::new);
    public static final RegistryObject<Mic> MIC = ITEMS.register("mic", Mic::new);
    public static final RegistryObject<Item> ALEXIRCRAFT_LUCKY_ITEM = ITEMS.register("alexircraft_lucky_block", () -> new BlockItemBase(ALEXIRCRAFT_LUCKY_BLOCK.get()));
    public static final RegistryObject<Item> JEROMEASF_LUCKY_ITEM = ITEMS.register("jeromeasf_lucky_block", () -> new BlockItemBase(JEROMEASF_LUCKY_BLOCK.get()));


    public static final RegistryObject<Item> YT_HELM = ITEMS.register("yt_helmet", () -> new ItemModArmor( YOUTUBE, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> YT_CHEST = ITEMS.register("yt_chestplate", () -> new ItemModArmor( YOUTUBE, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> YT_BOOTS = ITEMS.register("yt_boots", () -> new ItemModArmor( YOUTUBE, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> YT_LEGS = ITEMS.register("yt_leggings", () -> new ItemModArmor( YOUTUBE, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> LEAH_HELM = ITEMS.register("leahhelmet", () -> new ItemModArmor( LEAH, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> LEAH_CHEST = ITEMS.register("leahchestplate", () -> new ItemModArmor( LEAH, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> LEAH_BOOTS = ITEMS.register("leahboots", () -> new ItemModArmor( LEAH, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> LEAH_LEGS = ITEMS.register("leahleggings", () -> new ItemModArmor( LEAH, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> DUCK_HELM = ITEMS.register("duckhelmet", () -> new ItemModArmor( DUCK, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> DUCK_CHEST = ITEMS.register("duckchestplate", () -> new ItemModArmor( DUCK, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> DUCK_BOOTS = ITEMS.register("duckboots", () -> new ItemModArmor( DUCK, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> DUCK_LEGS = ITEMS.register("duckleggings", () -> new ItemModArmor( DUCK, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> MAX_HELM = ITEMS.register("maxhelmet", () -> new ItemModArmor( MAX, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> MAX_CHEST = ITEMS.register("maxchestplate", () -> new ItemModArmor( MAX, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> MAX_BOOTS = ITEMS.register("maxboots", () -> new ItemModArmor( MAX, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> MAX_LEGS = ITEMS.register("maxleggings", () -> new ItemModArmor( MAX, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> CASSIE_THE_CAT_HELM = ITEMS.register("cassiethecathelmet", () -> new ItemModArmor( CASSIETHECAT, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> CASSIE_THE_CAT_CHEST = ITEMS.register("cassiethecatchestplate", () -> new ItemModArmor( CASSIETHECAT, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> CASSIE_THE_CAT_BOOTS = ITEMS.register("cassiethecatboots", () -> new ItemModArmor( CASSIETHECAT, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> CASSIE_THE_CAT_LEGS = ITEMS.register("cassiethecatleggings", () -> new ItemModArmor( CASSIETHECAT, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> DONUT_HELM = ITEMS.register("donuthelmet", () -> new ItemModArmor( DONUT, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> DONUT_CHEST = ITEMS.register("donutchestplate", () -> new ItemModArmor( DONUT, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> DONUT_BOOTS = ITEMS.register("donutboots", () -> new ItemModArmor( DONUT, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> DONUT_LEGS = ITEMS.register("donutleggings", () -> new ItemModArmor( DONUT, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> EVILLITTLEKELLY_HELM = ITEMS.register("evillittlekellyhelmet", () -> new ItemModArmor( EVILLITTLEKELLY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> EVILLITTLEKELLY_CHEST = ITEMS.register("evillittlekellychestplate", () -> new ItemModArmor( EVILLITTLEKELLY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> EVILLITTLEKELLY_BOOTS = ITEMS.register("evillittlekellyboots", () -> new ItemModArmor( EVILLITTLEKELLY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> EVILLITTLEKELLYLEGS = ITEMS.register("evillittlekellyleggings", () -> new ItemModArmor( EVILLITTLEKELLY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> ALLY_HELM = ITEMS.register("allyhelmet", () -> new ItemModArmor( LITTLE_ALLY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> ALLY_CHEST = ITEMS.register("allychestplate", () -> new ItemModArmor( LITTLE_ALLY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> ALLY_BOOTS = ITEMS.register("allyboots", () -> new ItemModArmor( LITTLE_ALLY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> ALLY_LEGS = ITEMS.register("allyleggings", () -> new ItemModArmor( LITTLE_ALLY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> CARLY_HELM = ITEMS.register("carlyhelmet", () -> new ItemModArmor( LITTLECARLY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> CARLY_CHEST = ITEMS.register("carlychestplate", () -> new ItemModArmor( LITTLECARLY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> CARLY_BOOTS = ITEMS.register("carlyboots", () -> new ItemModArmor( LITTLECARLY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> CARLY_LEGS = ITEMS.register("carlyleggings", () -> new ItemModArmor( LITTLECARLY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> DONNY_HELM = ITEMS.register("donnyhelmet", () -> new ItemModArmor( LITTLE_DONNY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> DONNY_CHEST = ITEMS.register("donnychestplate", () -> new ItemModArmor( LITTLE_DONNY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> DONNY_BOOTS = ITEMS.register("donnyboots", () -> new ItemModArmor( LITTLE_DONNY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> DONNY_LEGS = ITEMS.register("donnyleggings", () -> new ItemModArmor( LITTLE_DONNY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> LITTLEKELLY_HELM = ITEMS.register("littlekellyhelmet", () -> new ItemModArmor( LITTLEKELLY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> LITTLEKELLY_CHEST = ITEMS.register("littlekellychestplate", () -> new ItemModArmor( LITTLEKELLY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> LITTLEKELLY_BOOTS = ITEMS.register("littlekellyboots", () -> new ItemModArmor( LITTLEKELLY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> LITTLEKELLY_LEGS = ITEMS.register("littlekellyleggings", () -> new ItemModArmor( LITTLEKELLY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> LITTLELIZARD_HELM = ITEMS.register("littlelizardhelmet", () -> new ItemModArmor( LITTLE_LIZARDGAMING, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> LITTLELIZARD_CHEST = ITEMS.register("littlelizardchestplate", () -> new ItemModArmor( LITTLE_LIZARDGAMING, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> LITTLELIZARD_BOOTS = ITEMS.register("littlelizardboots", () -> new ItemModArmor( LITTLE_LIZARDGAMING, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> LITTLELIZARD_LEGS = ITEMS.register("littlelizardleggings", () -> new ItemModArmor( LITTLE_LIZARDGAMING, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> MONKEY_HELM = ITEMS.register("monkeyhelmet", () -> new ItemModArmor( MAX_THEMONKEY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> MONKEY_CHEST = ITEMS.register("monkeychestplate", () -> new ItemModArmor( MAX_THEMONKEY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> MONKEY_BOOTS = ITEMS.register("monkeyboots", () -> new ItemModArmor( MAX_THEMONKEY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> MONKEY_LEGS = ITEMS.register("monkeyleggings", () -> new ItemModArmor( MAX_THEMONKEY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SHARKY_HELM = ITEMS.register("sharkyhelmet", () -> new ItemModArmor( SHARK_Y, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SHARKY_CHEST = ITEMS.register("sharkychestplate", () -> new ItemModArmor( SHARK_Y, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SHARKY_BOOTS = ITEMS.register("sharkyboots", () -> new ItemModArmor( SHARK_Y, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> SHARKY_LEGS = ITEMS.register("sharkyleggings", () -> new ItemModArmor( SHARK_Y, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TURTLE_HELM = ITEMS.register("turtlehelmet", () -> new ItemModArmor( TINY_TURTLE, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TURTLE_CHEST = ITEMS.register("turtlechestplate", () -> new ItemModArmor( TINY_TURTLE, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TURTLE_BOOTS = ITEMS.register("turtleboots", () -> new ItemModArmor( TINY_TURTLE, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> TURTLE_LEGS = ITEMS.register("turtleleggings", () -> new ItemModArmor( TINY_TURTLE, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> APHMAU_HELM = ITEMS.register("aphmauhelmet", () -> new ItemModArmor( AP_HMAU, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> APHMAU_CHEST = ITEMS.register("aphmauchestplate", () -> new ItemModArmor( AP_HMAU, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> APHMAU_BOOTS = ITEMS.register("aphmauboots", () -> new ItemModArmor( AP_HMAU, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> APHMAU_LEGS = ITEMS.register("aphmauleggings", () -> new ItemModArmor( AP_HMAU, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> ROPO_HELM = ITEMS.register("ropohelmet", () -> new ItemModArmor( ROPO, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> ROPO_CHEST = ITEMS.register("ropochestplate", () -> new ItemModArmor( ROPO, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> ROPO_BOOTS = ITEMS.register("ropoboots", () -> new ItemModArmor( ROPO, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> ROPO_LEGS = ITEMS.register("ropoleggings", () -> new ItemModArmor( ROPO, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SCUBA_HELM = ITEMS.register("scubahelmet", () -> new ItemModArmor( SCUBA, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SCUBA_CHEST = ITEMS.register("scubachestplate", () -> new ItemModArmor( SCUBA, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SCUBA_BOOTS = ITEMS.register("scubaboots", () -> new ItemModArmor( SCUBA, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> SCUBA_LEGS = ITEMS.register("scubaleggings", () -> new ItemModArmor( SCUBA, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> CRAINER_HELM = ITEMS.register("crainerhelmet", () -> new ItemModArmor( CRAINER, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> CRAINER_CHEST = ITEMS.register("crainerchestplate", () -> new ItemModArmor( CRAINER, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> CRAINER_BOOTS = ITEMS.register("crainerboots", () -> new ItemModArmor( CRAINER, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> CRAINER_LEGS = ITEMS.register("crainerleggings", () -> new ItemModArmor( CRAINER, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> ANGEL_HELM = ITEMS.register("angelhelmet", () -> new ItemModArmor( ANGEL, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> ANGEL_CHEST = ITEMS.register("angelchestplate", () -> new ItemModArmor( ANGEL, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> ANGEL_LEGS = ITEMS.register("angelleggings", () -> new ItemModArmor( ANGEL, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> ANGEL_BOOTS = ITEMS.register("angelboots", () -> new ItemModArmor( ANGEL, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> TNT_HELM = ITEMS.register("tnt_helmet", () -> new ItemModArmor( TNT, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TNT_CHEST = ITEMS.register("tnt_chestplate", () -> new ItemModArmor( TNT, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TNT_LEGS = ITEMS.register("tnt_leggings", () -> new ItemModArmor( TNT, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TNT_BOOTS = ITEMS.register("tnt_boots", () -> new ItemModArmor( TNT, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> LAC_HELM = ITEMS.register("lac_helmet", () -> new ItemModArmor( LAC, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> LAC_CHEST = ITEMS.register("lac_chestplate", () -> new ItemModArmor( LAC, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> LAC_LEGS = ITEMS.register("lac_leggings", () -> new ItemModArmor( LAC, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> LAC_BOOTS = ITEMS.register("lac_boots", () -> new ItemModArmor( LAC, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> MR_HELM = ITEMS.register("mr_helmet", () -> new ItemModArmor( MR, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> MR_CHEST = ITEMS.register("mr_chestplate", () -> new ItemModArmor( MR, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> MR_LEGS = ITEMS.register("mr_leggings", () -> new ItemModArmor( MR, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> MR_BOOTS = ITEMS.register("mr_boots", () -> new ItemModArmor( MR, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> PETA_HELM = ITEMS.register("peta_helmet", () -> new ItemModArmor( PETA, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> PETA_CHEST = ITEMS.register("peta_chestplate", () -> new ItemModArmor( PETA, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PETA_LEGS = ITEMS.register("peta_leggings", () -> new ItemModArmor( PETA, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> PETA_BOOTS = ITEMS.register("peta_boots", () -> new ItemModArmor( PETA, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> PINK_HELM = ITEMS.register("pink_helmet", () -> new ItemModArmor( PINK, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_CHEST = ITEMS.register("pink_chestplate", () -> new ItemModArmor( PINK, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PINK_LEGS = ITEMS.register("pink_leggings", () -> new ItemModArmor( PINK, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> PINK_BOOTS = ITEMS.register("pink_boots", () -> new ItemModArmor( PINK, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> VIK_HELM = ITEMS.register("vik_helmet", () -> new ItemModArmor( VIK, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> VIK_CHEST = ITEMS.register("vik_chestplate", () -> new ItemModArmor( VIK, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> VIK_LEGS = ITEMS.register("vik_leggings", () -> new ItemModArmor( VIK, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> VIK_BOOTS = ITEMS.register("vik_boots", () -> new ItemModArmor( VIK, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> IHAS_HELM = ITEMS.register("ihas_helmet", () -> new ItemModArmor( IHAS, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> IHAS_CHEST = ITEMS.register("ihas_chestplate", () -> new ItemModArmor( IHAS, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> IHAS_LEGS = ITEMS.register("ihas_leggings", () -> new ItemModArmor( IHAS, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> IHAS_BOOTS = ITEMS.register("ihas_boots", () -> new ItemModArmor( IHAS, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> LD_HELM = ITEMS.register("ld_helmet", () -> new ItemModArmor( LD, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> LD_CHEST = ITEMS.register("ld_chestplate", () -> new ItemModArmor( LD, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> LD_LEGS = ITEMS.register("ld_leggings", () -> new ItemModArmor( LD, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> LD_BOOTS = ITEMS.register("ld_boots", () -> new ItemModArmor( LD, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> PRESTON_HELM = ITEMS.register("preston_helmet", () -> new ItemModArmor( PRESTON, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> PRESTON_CHEST = ITEMS.register("preston_chestplate", () -> new ItemModArmor( PRESTON, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PRESTON_LEGS = ITEMS.register("preston_leggings", () -> new ItemModArmor( PRESTON, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> PRESTON_BOOTS = ITEMS.register("preston_boots", () -> new ItemModArmor( PRESTON, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> S_HELM = ITEMS.register("s_helmet", () -> new ItemModArmor( S, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> S_CHEST = ITEMS.register("s_chestplate", () -> new ItemModArmor( S, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> S_LEGS = ITEMS.register("s_leggings", () -> new ItemModArmor( S, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> S_BOOTS = ITEMS.register("s_boots", () -> new ItemModArmor( S, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> STAMPY_HELM = ITEMS.register("stampy_helmet", () -> new ItemModArmor( STAMPY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> STAMPY_CHEST = ITEMS.register("stampy_chestplate", () -> new ItemModArmor( STAMPY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> STAMPY_LEGS = ITEMS.register("stampy_leggings", () -> new ItemModArmor( STAMPY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> STAMPY_BOOTS = ITEMS.register("stampy_boots", () -> new ItemModArmor( STAMPY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> THNX_HELM = ITEMS.register("thnx_helmet", () -> new ItemModArmor( THNX, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> THNX_CHEST = ITEMS.register("thnx_chestplate", () -> new ItemModArmor( THNX, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> THNX_LEGS = ITEMS.register("thnx_leggings", () -> new ItemModArmor( THNX, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> THNX_BOOTS = ITEMS.register("thnx_boots", () -> new ItemModArmor( THNX, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> ANT_HELM = ITEMS.register("ant_helmet", () -> new ItemModArmor( ANT, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> ANT_CHEST = ITEMS.register("ant_chestplate", () -> new ItemModArmor( ANT, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> ANT_LEGS = ITEMS.register("ant_leggings", () -> new ItemModArmor( ANT, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> ANT_BOOTS = ITEMS.register("ant_boots", () -> new ItemModArmor( ANT, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> CAP_HELM = ITEMS.register("cap_helmet", () -> new ItemModArmor( CAP, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> CAP_CHEST = ITEMS.register("cap_chestplate", () -> new ItemModArmor( CAP, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> CAP_LEGS = ITEMS.register("cap_leggings", () -> new ItemModArmor( CAP, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> CAP_BOOTS = ITEMS.register("cap_boots", () -> new ItemModArmor( CAP, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> DAN_HELM = ITEMS.register("dan_helmet", () -> new ItemModArmor( DAN, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> DAN_CHEST = ITEMS.register("dan_chestplate", () -> new ItemModArmor( DAN, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> DAN_LEGS = ITEMS.register("dan_leggings", () -> new ItemModArmor( DAN, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> DAN_BOOTS = ITEMS.register("dan_boots", () -> new ItemModArmor( DAN, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> SQUID_HELM = ITEMS.register("squid_helmet", () -> new ItemModArmor( SQUID, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SQUID_CHEST = ITEMS.register("squid_chestplate", () -> new ItemModArmor( SQUID, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SQUID_LEGS = ITEMS.register("squid_leggings", () -> new ItemModArmor( SQUID, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SQUID_BOOTS = ITEMS.register("squid_boots", () -> new ItemModArmor( SQUID, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> LOG_HELM = ITEMS.register("log_helmet", () -> new ItemModArmor( LO_G, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> LOG_CHEST = ITEMS.register("log_chestplate", () -> new ItemModArmor( LO_G, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> LOG_LEGS = ITEMS.register("log_leggings", () -> new ItemModArmor( LO_G, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> LOG_BOOTS = ITEMS.register("log_boots", () -> new ItemModArmor( LO_G, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> POP_HELM = ITEMS.register("pop_helmet", () -> new ItemModArmor( POP, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> POP_CHEST = ITEMS.register("pop_chestplate", () -> new ItemModArmor( POP, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> POP_LEGS = ITEMS.register("pop_leggings", () -> new ItemModArmor( POP, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> POP_BOOTS = ITEMS.register("pop_boots", () -> new ItemModArmor( POP, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> SP_HELM = ITEMS.register("sp_helmet", () -> new ItemModArmor( SP, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SP_CHEST = ITEMS.register("sp_chestplate", () -> new ItemModArmor( SP, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SP_LEGS = ITEMS.register("sp_leggings", () -> new ItemModArmor( SP, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SP_BOOTS = ITEMS.register("sp_boots", () -> new ItemModArmor( SP, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> SKY_HELM = ITEMS.register("sky_helmet", () -> new ItemModArmor( SKY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SKY_CHEST = ITEMS.register("sky_chestplate", () -> new ItemModArmor( SKY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SKY_LEGS = ITEMS.register("sky_leggings", () -> new ItemModArmor( SKY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SKY_BOOTS = ITEMS.register("sky_boots", () -> new ItemModArmor( SKY, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> SUPER_HELM = ITEMS.register("super_helmet", () -> new ItemModArmor( SUPER, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SUPER_CHEST = ITEMS.register("super_chestplate", () -> new ItemModArmor( SUPER, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SUPER_LEGS = ITEMS.register("super_leggings", () -> new ItemModArmor( SUPER, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SUPER_BOOTS = ITEMS.register("super_boots", () -> new ItemModArmor( SUPER, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> TRUE_HELM = ITEMS.register("true_helmet", () -> new ItemModArmor( TRUE, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TRUE_CHEST = ITEMS.register("true_chestplate", () -> new ItemModArmor( TRUE, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TRUE_LEGS = ITEMS.register("true_leggings", () -> new ItemModArmor( TRUE, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TRUE_BOOTS = ITEMS.register("true_boots", () -> new ItemModArmor( TRUE, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> ALEX_HELM = ITEMS.register("alex_helmet", () -> new ItemModArmor( ALEX, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> ALEX_CHEST = ITEMS.register("alex_chestplate", () -> new ItemModArmor( ALEX, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> ALEX_LEGS = ITEMS.register("alex_leggings", () -> new ItemModArmor( ALEX, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> ALEX_BOOTS = ITEMS.register("alex_boots", () -> new ItemModArmor( ALEX, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> BAJAN_HELM = ITEMS.register("bajan_helmet", () -> new ItemModArmor( BAJAN, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> BAJAN_CHEST = ITEMS.register("bajan_chestplate", () -> new ItemModArmor( BAJAN, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> BAJAN_LEGS = ITEMS.register("bajan_leggings", () -> new ItemModArmor( BAJAN, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> BAJAN_BOOTS = ITEMS.register("bajan_boots", () -> new ItemModArmor( BAJAN, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> FRIZZ_HELM = ITEMS.register("frizz_helmet", () -> new ItemModArmor( FRIZZ, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> FRIZZ_CHEST = ITEMS.register("frizz_chestplate", () -> new ItemModArmor( FRIZZ, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> FRIZZ_LEGS = ITEMS.register("frizz_leggings", () -> new ItemModArmor( FRIZZ, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> FRIZZ_BOOTS = ITEMS.register("frizz_boots", () -> new ItemModArmor( FRIZZ, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> JEROME_HELM = ITEMS.register("jerome_helmet", () -> new ItemModArmor( JEROME, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> JEROME_CHEST = ITEMS.register("jerome_chestplate", () -> new ItemModArmor( JEROME, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> JEROME_LEGS = ITEMS.register("jerome_leggings", () -> new ItemModArmor( JEROME, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item>JEROME_BOOTS = ITEMS.register("jerome_boots", () -> new ItemModArmor( JEROME, EquipmentSlotType.FEET, new Item.Properties()));
    public static final RegistryObject<Item> TEWITY_HELM = ITEMS.register("tewity_helmet", () -> new ItemModArmor( TEW_ITY, EquipmentSlotType.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TEWITY_CHEST = ITEMS.register("tewity_chestplate", () -> new ItemModArmor( TEW_ITY, EquipmentSlotType.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TEWITY_LEGS = ITEMS.register("tewity_leggings", () -> new ItemModArmor( TEW_ITY, EquipmentSlotType.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TEWITY_BOOTS = ITEMS.register("tewity_boots", () -> new ItemModArmor( TEW_ITY, EquipmentSlotType.FEET, new Item.Properties()));

}
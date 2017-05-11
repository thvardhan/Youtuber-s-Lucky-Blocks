package thvardhan.ytluckyblocks;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thvardhan.ytluckyblocks.entity.*;


@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {
    public static final String MODID = "ytluckyblocks";
    public static final String VERSION = "6.1.1";
    public static final String NAME = "YouTuber's Lucky Blocks Mod";
    @SidedProxy(clientSide = "thvardhan.ytluckyblocks.ClientProxy", serverSide = "thvardhan.ytluckyblocks.ServerProxy")
    public static CommonProxy proxy;
    @Instance(MODID)
    public static Main instance;
    private static int modEntitys = 0;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {


        registerEntities();
        proxy.preInit(e);
    }


    @EventHandler
    public void init(FMLInitializationEvent e) {
        Biome[] spawnForLuckMob=new Biome[10];
        spawnForLuckMob[0]=Biome.getBiome(1);
        spawnForLuckMob[1]=Biome.getBiome(17);
        spawnForLuckMob[2]=Biome.getBiome(2);
        spawnForLuckMob[3]=Biome.getBiome(3);
        spawnForLuckMob[4]=Biome.getBiome(4);
        spawnForLuckMob[5]=Biome.getBiome(5);
        spawnForLuckMob[6]=Biome.getBiome(11);
        spawnForLuckMob[7]=Biome.getBiome(12);
        spawnForLuckMob[8]=Biome.getBiome(13);
        spawnForLuckMob[9]=Biome.getBiome(35);
        EntityRegistry.addSpawn(EntityLuckyMob.class, 6, 15, 50, EnumCreatureType.MONSTER, spawnForLuckMob);
        proxy.init(e);
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        proxy.postInit(e);
    }


    //WHOLE FORGE INITS END HERE =================================================


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
    }


    public void registerModEntityWithEgg(Class parEntityClass, String parEntityName,
                                         int parEggColor, int parEggSpotsColor) {
        EntityRegistry.registerModEntity(parEntityClass, parEntityName, ++modEntitys,
                Main.instance, 80, 3, false);
        registerSpawnEgg(parEntityName, parEntityClass, parEggColor, parEggSpotsColor);
    }

    private void registerSpawnEgg(String parEntityName, Class parEntityClass, int parEggColor,
                                  int parEggSpotsColor) {
        EntityRegistry.registerEgg(parEntityClass, parEggColor, parEggSpotsColor);

    }


}

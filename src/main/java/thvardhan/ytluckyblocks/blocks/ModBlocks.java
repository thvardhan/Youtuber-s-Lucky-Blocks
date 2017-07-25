package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.TabYTStuffMod;

public class ModBlocks {

    public static Block luckyPressurePlate;
    public static Block youtubeLuckyBlock;
    public static Block serialPlayerLuckyBlock;
    public static Block popularMMOLuckyBlock;
    public static Block antVenomLuckyBlock;
    public static Block captainSparkelzLuckyBlock;
    public static Block skyDoesMinecraftLuckyBlock;
    public static Block danTDMLuckyBlock;
    public static Block iBallisticSquidLuckyBlock;
    public static Block gamingWithJenLuckyBlock;
    public static Block trueMuLuckyBlock;
    public static Block alexircraftLuckyBlock;
    public static Block bajanCanadianLuckyBlock;
    public static Block frizzleandpopLuckyBlock;
    public static Block jeromeASFLuckyBlock;
    public static Block tewityLuckyBlock;
    public static Block lDShadowLadyLuckyBlock;
    public static Block prestonPlayzLuckyBlock;
    public static Block sSundeeLuckyBlock;
    public static Block stampylongheadLuckyBlock;
    public static Block iHasCupcakeLuckyBlock;
    public static Block thnxCyaLuckyBlock;
    public static Block exploadingTNTLuckyBlock;
    public static Block lachlanLuckyBlock;
    public static Block mrwooflessLuckyBlock;
    public static Block petaZahHuttLuckyBlock;
    public static Block pinkSheepYTLuckyBlock;
    public static Block vikkstar123LuckyBlock;


    public static Block babyDuckLuckyBlock;
    public static Block babyLeahLuckyBlock;
    public static Block babyMaxLuckyBlock;
    public static Block cassieTheCatLuckyBlock;
    public static Block donutTheDogLuckyBlock;
    public static Block evilLittleKellyLuckyBlock;
    public static Block littleAllyLuckyBlock;
    public static Block littleCarlyMcLuckyBlock;
    public static Block littleDonnyLuckyBlock;
    public static Block littleKellyMcLuckyBlock;
    public static Block littleLizardGamingLuckyBlock;
    public static Block maxTheMonkeyLuckyBlock;
    public static Block sharkyLuckyBlock;
    public static Block tinyTurtleLuckyBlock;

    public static Block scubaSteveLuckyBlock;
    public static Block littleAngelLuckyBlock;
    public static Block aphmauLuckyBlock;
    public static Block littleRopoLuckyBlock;
    public static Block mrCrainerLuckyBlock;

    public static Block youtube;
    public static Block mic;
    public static Block goldButton;
    public static Block ironButton;
    public static Block diamondButton;


    public static void createBlocks() {

        registerBlock(youtubeLuckyBlock = new LuckyBlock("youtube_lucky_block"), "youtube_lucky_block");
        registerBlock(serialPlayerLuckyBlock = new SPLuckyBlock("sp_lucky_block"), "sp_lucky_block");
        registerBlock(popularMMOLuckyBlock = new PopularMMOLuckyBlock("pop_lucky_block"), "pop_lucky_block");
        registerBlock(antVenomLuckyBlock = new AntVenomLuckyBlock("ant_lucky_block"), "ant_lucky_block");
        registerBlock(captainSparkelzLuckyBlock = new CaptainSparkelzLuckyBlock("cap_lucky_block"), "");
        registerBlock(skyDoesMinecraftLuckyBlock = new SkyDoesMinecraftLuckyBlock("sky_lucky_block"), "sky_lucky_block");
        registerBlock(danTDMLuckyBlock = new DanTDMLuckyBlock("dan_lucky_block"), "dan_lucky_block");
        registerBlock(iBallisticSquidLuckyBlock = new IBallisticSquidLuckyBlock("squid_lucky_block"), "squid_lucky_block");
        registerBlock(gamingWithJenLuckyBlock = new GammingWithJenLuckyBlock("jen_lucky_block"), "jen_lucky_block");
        registerBlock(trueMuLuckyBlock = new TrueMuLuckyBlock("truemu_lucky_block"), "truemu_lucky_block");
        //nice posture update
        registerBlock(alexircraftLuckyBlock = new AlexircraftLuckyBlock("alexircraft_lucky_block"), "alexircraft_lucky_block");
        registerBlock(bajanCanadianLuckyBlock = new BajanCanadianLuckyBlock("bajancanadian_lucky_block"), "bajancanadian_lucky_block");
        registerBlock(frizzleandpopLuckyBlock = new FrizzleandpopLuckyBlock("frizzleandpop_lucky_block"), "frizzleandpop_lucky_block");
        registerBlock(jeromeASFLuckyBlock = new JeromeASFLuckyBlock("jeromeasf_lucky_block"), "jeromeasf_lucky_block");
        registerBlock(tewityLuckyBlock = new TewityLuckyBlock("tewity_lucky_block"), "tewity_lucky_block");
        //sublime update
        registerBlock(lDShadowLadyLuckyBlock = new LDShadowLadyLuckyBlock("ldshadowlady_lucky_block"), "ldshadowlady_lucky_block");
        registerBlock(prestonPlayzLuckyBlock = new PrestonPlayzLuckyBlock("prestonplayz_lucky_block"), "prestonplayz_lucky_block");
        registerBlock(sSundeeLuckyBlock = new SSundeeLuckyBlock("ssundee_lucky_block"), "ssundee_lucky_block");
        registerBlock(stampylongheadLuckyBlock = new StampyLongHeadLuckyBlock("stampy_lucky_block"), "stampy_lucky_block");
        registerBlock(iHasCupcakeLuckyBlock = new IHasCupcakeLuckyBlock("ihascupquake_lucky_block"), "ihascupquake_lucky_block");
        registerBlock(thnxCyaLuckyBlock = new ThnxCyaLuckyBlock("thnxcya_lucky_block"), "thnxcya_lucky_block");
        //Sparkle Update
        registerBlock(exploadingTNTLuckyBlock = new ExploadingTNTLuckyBlock("exploadingtnt_lucky_block"), "exploadingtnt_lucky_block");
        registerBlock(lachlanLuckyBlock = new LachlanLuckyBlock("lachlan_lucky_block"), "lachlan_lucky_block");
        registerBlock(mrwooflessLuckyBlock = new MrWooflessLuckyBlockLuckyBlock("mrwoofless_lucky_block"), "mrwoofless_lucky_block");
        registerBlock(petaZahHuttLuckyBlock = new PetaZahHuttLuckyBlock("petazahhutt_lucky_block"), "petazahhutt_lucky_block");
        registerBlock(pinkSheepYTLuckyBlock = new PinkSheepYTLuckyBlock("pinksheep_lucky_block"), "pinksheep_lucky_block");
        registerBlock(vikkstar123LuckyBlock = new Vikkstar123LuckyBlock("vikkstar123_lucky_block"), "vikkstar123_lucky_block");
        //Little update
        registerBlock(babyDuckLuckyBlock = new BabyDuckLuckyBlock("baby_duck_lucky_block"), "baby_duck_lucky_block");
        registerBlock(babyLeahLuckyBlock = new BabyLeahLuckyBlock("baby_leah_lucky_block"), "baby_leah_lucky_block");
        registerBlock(babyMaxLuckyBlock = new BabyMaxLuckyBlock("baby_max_lucky_block"), "baby_max_lucky_block");
        registerBlock(cassieTheCatLuckyBlock = new CassieTheCatLuckyBlock("cassie_the_cat_lucky_block"), "cassie_the_cat_lucky_block");
        registerBlock(donutTheDogLuckyBlock = new DonutTheDogLuckyBlock("donut_the_dog_lucky_block"), "donut_the_dog_lucky_block");
        registerBlock(evilLittleKellyLuckyBlock = new EvilLittleKellyLuckyBlock("evil_little_kelly_lucky_block"), "evil_little_kelly_lucky_block");
        registerBlock(littleAllyLuckyBlock = new LittleAllyLuckyBlock("little_ally_lucky_block"), "little_ally_lucky_block");
        registerBlock(littleCarlyMcLuckyBlock = new LittleCarlyMcLuckyBlock("little_carly_lucky_block"), "little_carly_lucky_block");
        registerBlock(littleDonnyLuckyBlock = new LittleDonnyLuckyBlock("little_donny_lucky_block"), "little_donny_lucky_block");
        registerBlock(littleKellyMcLuckyBlock = new LittleKellyMcLuckyBlock("little_kelly_lucky_block"), "little_kelly_lucky_block");
        registerBlock(littleLizardGamingLuckyBlock = new LittleLizardGamingLuckyBlock("little_lizard_gaming_lucky_block"), "little_lizard_gaming_lucky_block");
        registerBlock(maxTheMonkeyLuckyBlock = new MaxTheMonkeyLuckyBlock("max_the_monkey_lucky_block"), "max_the_monkey_lucky_block");
        registerBlock(sharkyLuckyBlock = new SharkyLuckyBlock("sharky_lucky_block"), "sharky_lucky_block");
        registerBlock(tinyTurtleLuckyBlock = new TinyTurtleLuckyBlock("tiny_turtle_lucky_block"), "tiny_turtle_lucky_block");
        //Guardian Update
        registerBlock(scubaSteveLuckyBlock = new ScubaSteveLuckyBlock("scuba_steve_lucky_block"), "scuba_steve_lucky_block");
        registerBlock(littleAngelLuckyBlock = new LittleAngelLuckyBlock("little_angel_lucky_block"), "little_angel_lucky_block");
        registerBlock(aphmauLuckyBlock = new AphmauLuckyBlock("aphmau_lucky_block"), "aphmau_lucky_block");
        registerBlock(littleRopoLuckyBlock = new LittleRopoLuckyBlock("little_ropo_lucky_block"), "little_ropo_lucky_block");
        registerBlock(mrCrainerLuckyBlock = new MrCrainerLuckyBlock("mrcrainer_lucky_block"), "mrcrainer_lucky_block");


        registerBlock(luckyPressurePlate = new LuckyPressurePlate("lucky_pressure_plate"), "lucky_pressure_plate");
        registerBlock(youtube = new YoutubeBlock("youtube_block"), "youtube_block");
        registerBlock(mic = new MicBlock("mic_block"), "mic_block");
        registerBlock(goldButton = new GoldButton("gold_button_block"), "gold_button_block");
        registerBlock(ironButton = new IronButton("iron_button_block"), "iron_button_block");
        registerBlock(diamondButton = new DiamondButton("diamond_button_block"), "diamond_button_block");


    }

    public static void registerBlock(Block block, String name) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }


    public static void registerBlock(Block block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
    }


}

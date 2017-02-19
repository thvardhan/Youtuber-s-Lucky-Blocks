package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

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

	
	public static void createBlocks(){

		GameRegistry.registerBlock(youtubeLuckyBlock = new LuckyBlock("youtube_lucky_block"), "youtube_lucky_block");
		GameRegistry.registerBlock(serialPlayerLuckyBlock=new SPLuckyBlock("sp_lucky_block"),"sp_lucky_block");
		GameRegistry.registerBlock(popularMMOLuckyBlock=new PopularMMOLuckyBlock("pop_lucky_block"),"pop_lucky_block");
		GameRegistry.registerBlock(antVenomLuckyBlock=new AntVenomLuckyBlock("ant_lucky_block"),"ant_lucky_block");
		GameRegistry.registerBlock(captainSparkelzLuckyBlock=new CaptainSparkelzLuckyBlock("cap_lucky_block"),"cap_lucky_block");
		GameRegistry.registerBlock(skyDoesMinecraftLuckyBlock=new SkyDoesMinecraftLuckyBlock("sky_lucky_block"),"sky_lucky_block");
		GameRegistry.registerBlock(danTDMLuckyBlock=new DanTDMLuckyBlock("dan_lucky_block"),"dan_lucky_block");
		GameRegistry.registerBlock(iBallisticSquidLuckyBlock=new IBallisticSquidLuckyBlock("squid_lucky_block"),"squid_lucky_block");
		GameRegistry.registerBlock(gamingWithJenLuckyBlock=new GammingWithJenLuckyBlock("jen_lucky_block"),"jen_lucky_block");
		GameRegistry.registerBlock(trueMuLuckyBlock=new TrueMuLuckyBlock("truemu_lucky_block"),"truemu_lucky_block");
		//nice posture update
		GameRegistry.registerBlock(alexircraftLuckyBlock=new AlexircraftLuckyBlock("alexircraft_lucky_block"),"alexircraft_lucky_block");
		GameRegistry.registerBlock(bajanCanadianLuckyBlock=new BajanCanadianLuckyBlock("bajancanadian_lucky_block"),"bajancanadian_lucky_block");
		GameRegistry.registerBlock(frizzleandpopLuckyBlock=new FrizzleandpopLuckyBlock("frizzleandpop_lucky_block"),"frizzleandpop_lucky_block");
		GameRegistry.registerBlock(jeromeASFLuckyBlock=new JeromeASFLuckyBlock("jeromeasf_lucky_block"),"jeromeasf_lucky_block");
		GameRegistry.registerBlock(tewityLuckyBlock=new TewityLuckyBlock("tewity_lucky_block"),"tewity_lucky_block");
		//sublime update
		GameRegistry.registerBlock(lDShadowLadyLuckyBlock=new LDShadowLadyLuckyBlock("ldshadowlady_lucky_block"),"ldshadowlady_lucky_block");
		GameRegistry.registerBlock(prestonPlayzLuckyBlock=new PrestonPlayzLuckyBlock("prestonplayz_lucky_block"),"prestonplayz_lucky_block");
		GameRegistry.registerBlock(sSundeeLuckyBlock=new SSundeeLuckyBlock("ssundee_lucky_block"),"ssundee_lucky_block");
		GameRegistry.registerBlock(stampylongheadLuckyBlock=new StampyLongHeadLuckyBlock("stampy_lucky_block"),"stampy_lucky_block");
		GameRegistry.registerBlock(iHasCupcakeLuckyBlock=new IHasCupcakeLuckyBlock("ihascupquake_lucky_block"),"ihascupquake_lucky_block");
		GameRegistry.registerBlock(thnxCyaLuckyBlock=new ThnxCyaLuckyBlock("thnxcya_lucky_block"),"thnxcya_lucky_block");
		//Sparkle Update
		GameRegistry.registerBlock(exploadingTNTLuckyBlock=new ExploadingTNTLuckyBlock("exploadingtnt_lucky_block"),"exploadingtnt_lucky_block");
		GameRegistry.registerBlock(lachlanLuckyBlock=new LachlanLuckyBlock("lachlan_lucky_block"),"lachlan_lucky_block");
		GameRegistry.registerBlock(mrwooflessLuckyBlock=new MrWooflessLuckyBlockLuckyBlock("mrwoofless_lucky_block"),"mrwoofless_lucky_block");
		GameRegistry.registerBlock(petaZahHuttLuckyBlock=new PetaZahHuttLuckyBlock("petazahhutt_lucky_block"),"petazahhutt_lucky_block");
		GameRegistry.registerBlock(pinkSheepYTLuckyBlock=new PinkSheepYTLuckyBlock("pinksheep_lucky_block"),"pinksheep_lucky_block");
		GameRegistry.registerBlock(vikkstar123LuckyBlock=new Vikkstar123LuckyBlock("vikkstar123_lucky_block"),"vikkstar123_lucky_block");
		//Little update
		GameRegistry.registerBlock(babyDuckLuckyBlock=new BabyDuckLuckyBlock("baby_duck_lucky_block"),"baby_duck_lucky_block");
		GameRegistry.registerBlock(babyLeahLuckyBlock=new BabyLeahLuckyBlock("baby_leah_lucky_block"),"baby_leah_lucky_block");
		GameRegistry.registerBlock(babyMaxLuckyBlock=new BabyMaxLuckyBlock("baby_max_lucky_block"),"baby_max_lucky_block");
		GameRegistry.registerBlock(cassieTheCatLuckyBlock=new CassieTheCatLuckyBlock("cassie_the_cat_lucky_block"),"cassie_the_cat_lucky_block");
		GameRegistry.registerBlock(donutTheDogLuckyBlock=new DonutTheDogLuckyBlock("donut_the_dog_lucky_block"),"donut_the_dog_lucky_block");
		GameRegistry.registerBlock(evilLittleKellyLuckyBlock=new EvilLittleKellyLuckyBlock("evil_little_kelly_lucky_block"),"evil_little_kelly_lucky_block");
		GameRegistry.registerBlock(littleAllyLuckyBlock=new LittleAllyLuckyBlock("little_ally_lucky_block"),"little_ally_lucky_block");
		GameRegistry.registerBlock(littleCarlyMcLuckyBlock=new LittleCarlyMcLuckyBlock("little_carly_lucky_block"),"little_carly_lucky_block");
		GameRegistry.registerBlock(littleDonnyLuckyBlock=new LittleDonnyLuckyBlock("little_donny_lucky_block"),"little_donny_lucky_block");
		GameRegistry.registerBlock(littleKellyMcLuckyBlock=new LittleKellyMcLuckyBlock("little_kelly_lucky_block"),"little_kelly_lucky_block");
		GameRegistry.registerBlock(littleLizardGamingLuckyBlock=new LittleLizardGamingLuckyBlock("little_lizard_gaming_lucky_block"),"little_lizard_gaming_lucky_block");
		GameRegistry.registerBlock(maxTheMonkeyLuckyBlock=new MaxTheMonkeyLuckyBlock("max_the_monkey_lucky_block"),"max_the_monkey_lucky_block");
		GameRegistry.registerBlock(sharkyLuckyBlock=new SharkyLuckyBlock("sharky_lucky_block"),"sharky_lucky_block");
		GameRegistry.registerBlock(tinyTurtleLuckyBlock=new TinyTurtleLuckyBlock("tiny_turtle_lucky_block"),"tiny_turtle_lucky_block");
		//Guardian Update
		GameRegistry.registerBlock(scubaSteveLuckyBlock=new ScubaSteveLuckyBlock("scuba_steve_lucky_block"),"scuba_steve_lucky_block");
		GameRegistry.registerBlock(littleAngelLuckyBlock=new LittleAngelLuckyBlock("little_angel_lucky_block"),"little_angel_lucky_block");
		GameRegistry.registerBlock(aphmauLuckyBlock=new AphmauLuckyBlock("aphmau_lucky_block"),"aphmau_lucky_block");
		GameRegistry.registerBlock(littleRopoLuckyBlock=new LittleRopoLuckyBlock("little_ropo_lucky_block"),"little_ropo_lucky_block");
		GameRegistry.registerBlock(mrCrainerLuckyBlock=new MrCrainerLuckyBlock("mrcrainer_lucky_block"),"mrcrainer_lucky_block");
		
		
		
		
		GameRegistry.registerBlock(luckyPressurePlate=new LuckyPressurePlate("lucky_pressure_plate"),"lucky_pressure_plate");
		GameRegistry.registerBlock(youtube=new YoutubeBlock("youtube_block"),"youtube_block");
		GameRegistry.registerBlock(mic=new MicBlock("mic_block"),"mic_block");
		GameRegistry.registerBlock(goldButton=new GoldButton("gold_button_block"),"gold_button_block");
		GameRegistry.registerBlock(ironButton=new IronButton("iron_button_block"),"iron_button_block");
		GameRegistry.registerBlock(diamondButton=new DiamondButton("diamond_button_block"),"diamond_button_block");

		
	}



	
}

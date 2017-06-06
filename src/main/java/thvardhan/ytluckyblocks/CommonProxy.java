package thvardhan.ytluckyblocks;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thvardhan.ytluckyblocks.blocks.ModBlocks;
import thvardhan.ytluckyblocks.items.ModItems;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class CommonProxy {

    public static CreativeTabs tabYTStuffMod = new TabYTStuffMod(CreativeTabs.getNextID(), "YTSuffMod");
    public static CreativeTabs tabYtStuffArmor = new TabYTStuffArmor(CreativeTabs.getNextID(), "YTStuffArmor");
    public static boolean addonsFound=false;

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.createTools();
        ModBlocks.createBlocks();
        registerAddons(e);
    }

    public void init(FMLInitializationEvent e) {
        //		registerRecipes();
        FMLCommonHandler.instance().bus().register(new YTEventHandler());

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    public void registerRecipes() {
      /*
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.youtubeLuckyBlock), "AAA","AXA","AAA",'A',Items.egg,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.serialPlayerLuckyBlock), "AAA","AXA","AAA",'A',Items.redstone,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.popularMMOLuckyBlock), "AAA","AXA","AAA",'A',Blocks.obsidian,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.antVenomLuckyBlock), "AAA","AXA","AAA",'A',Items.coal,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.captainSparkelzLuckyBlock), "AAA","AXA","AAA",'A',Items.blaze_powder,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.skyDoesMinecraftLuckyBlock), "AAA","AXA","AAA",'A',Items.gold_ingot,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.danTDMLuckyBlock), "AAA","AXA","AAA",'A',Items.diamond,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.iBallisticSquidLuckyBlock), "AAA","AXA","AAA",'A',new ItemStack(Items.dye,1,0),'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.gamingWithJenLuckyBlock), "AAA","AXA","AAA",'A',Items.nether_wart,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.trueMuLuckyBlock), "AAA","AXA","AAA",'A',Blocks.lapis_block,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.alexircraftLuckyBlock), "AAA","AXA","AAA",'A',Items.sugar,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.bajanCanadianLuckyBlock), "AAA","AXA","AAA",'A',Blocks.redstone_block,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.frizzleandpopLuckyBlock), "AAA","AXA","AAA",'A',Blocks.sand,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.jeromeASFLuckyBlock), "AAA","AXA","AAA",'A',Items.bowl,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.tewityLuckyBlock), "AAA","AXA","AAA",'A',Blocks.pumpkin,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.iHasCupcakeLuckyBlock), "AAA","AXA","AAA",'A',Blocks.cactus,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lDShadowLadyLuckyBlock), "AAA","AXA","AAA",'A',Blocks.packed_ice,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.prestonPlayzLuckyBlock), "AAA","AXA","AAA",'A',Items.lava_bucket,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.sSundeeLuckyBlock), "AAA","AXA","AAA",'A',Blocks.coal_block,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.stampylongheadLuckyBlock), "AAA","AXA","AAA",'A',Items.pumpkin_seeds,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.thnxCyaLuckyBlock), "AAA","AXA","AAA",'A',Items.emerald,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.exploadingTNTLuckyBlock), "AAA","AXA","AAA",'A',Blocks.tnt,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lachlanLuckyBlock), "AAA","AXA","AAA",'A',new ItemStack(Items.dye,1,4),'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.mrwooflessLuckyBlock), "AAA","AXA","AAA",'A',Items.arrow,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.petaZahHuttLuckyBlock), "AAA","AXA","AAA",'A',Items.slime_ball,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.pinkSheepYTLuckyBlock), "AAA","AXA","AAA",'A',new ItemStack(Blocks.wool,1,6),'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.vikkstar123LuckyBlock), "AAA","AXA","AAA",'A',Items.feather,'X',Items.iron_ingot);
	    	
	    	*/

    }


    private static void registerAddons(FMLPreInitializationEvent e){
        zipParser(e);

    }

    private static void zipParser(FMLPreInitializationEvent e){
        try {
            ZipFile zipFile = new ZipFile(e.getModConfigurationDirectory()+"/splash.ytlb");
            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                InputStream stream = zipFile.getInputStream(entry);
                System.out.println(entry.getName());
            }
        }catch (Exception E){
            System.out.println("something went wrong while loading addons. If the issue persists please contact the creator of youtubers lucky block "+Main.VERSION+" "+ Minecraft.getMinecraft().getVersion());
            E.printStackTrace(System.out);
        }
    }

}
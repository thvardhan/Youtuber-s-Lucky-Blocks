package thvardhan.ytluckyblocks.proxy;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import thvardhan.ytluckyblocks.TabYTStuffArmor;
import thvardhan.ytluckyblocks.TabYTStuffMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thvardhan.ytluckyblocks.handler.YTEventHandler;
import thvardhan.ytluckyblocks.init.ModItems;
import thvardhan.ytluckyblocks.init.ModTabs;

/**
 * Created by patrick on 25/07/2017.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        //ModBlocks.createBlocks();
        ModTabs.createTabs();
    }

    public void init(FMLInitializationEvent e) {
        //		registerRecipes();

        MinecraftForge.EVENT_BUS.register(new YTEventHandler());

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}

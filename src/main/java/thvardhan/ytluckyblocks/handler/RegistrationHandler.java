package thvardhan.ytluckyblocks.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thvardhan.ytluckyblocks.init.ModBlocks;
import thvardhan.ytluckyblocks.init.ModItems;

/**
 * Created by patrick on 25/07/2017.
 */
@Mod.EventBusSubscriber
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //Misc Items
        ModItems.registerItem(event.getRegistry());
        ModBlocks.registerItemBlocks(event.getRegistry());

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //Blocks
        ModBlocks.registerBlocks(event.getRegistry());
        //ModFurnaces.registerBlocks(event.getRegistry());
    }
}

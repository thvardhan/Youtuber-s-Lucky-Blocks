package thvardhan.ytluckyblocks.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import thvardhan.ytluckyblocks.Main;

/**
 * Created by patrick on 25/07/2017.
 */
public class YTEventHandler {

        @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

        if (event.player instanceof EntityPlayer && FMLCommonHandler.instance().getSide() == Side.CLIENT) {


            TextComponentString enter = new TextComponentString(TextFormatting.AQUA + "You Are Using " + TextFormatting.GREEN + "Youtuber's Lucky block" + TextFormatting.RED + " Mod V" + Main.VERSION + " By thvardhan / Serial Player");
            TextComponentString enter2 = new TextComponentString(TextFormatting.AQUA + "Press Me To Visit To " + TextFormatting.GREEN + "thvardhan's / SerialPlayer" + TextFormatting.YELLOW + " Youtube Channel For More Cool Stuff" + TextFormatting.GREEN);


            ClickEvent site1 = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/channel/UCLCDATvGikpHpoC1LsSRm8w");


            Style s2 = new Style();
            s2.setBold(true);
            s2.setClickEvent(site1);


            enter2.setStyle(s2);


            event.player.sendMessage(enter);
            event.player.sendMessage(enter2);
        } else {

            TextComponentString enter = new TextComponentString("You Are Using YTStuff Mod V" + Main.VERSION + " By thvardhan / Serial Player");
            TextComponentString enter2 = new TextComponentString("Press Me To Visit To thvardhan's / SerialPlayer Youtube Channel For More Cool Stuff");

            ClickEvent site1 = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/channel/UCLCDATvGikpHpoC1LsSRm8w");

            Style s1 = new Style();

            Style s2 = new Style();
            s2.setBold(true);
            s2.setClickEvent(site1);


            enter2.setStyle(s2);


            event.player.sendMessage(enter);
            event.player.sendMessage(enter2);
        }


    }
}

package thvardhan.ytluckyblocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;

public class YTEventHandler {


    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

        if (event.player instanceof EntityPlayer && FMLCommonHandler.instance().getSide() == Side.CLIENT) {


            TextComponentString enter = new TextComponentString(ChatFormatting.AQUA + "You Are Using " + ChatFormatting.GREEN + "Youtuber's Lucky block" + ChatFormatting.RED + " Mod V" + Main.VERSION + " By thvardhan / Serial Player");
            TextComponentString enter2 = new TextComponentString(ChatFormatting.AQUA + "Press Me To Visit To " + ChatFormatting.GREEN + "thvardhan's / SerialPlayer" + ChatFormatting.YELLOW + " Youtube Channel For More Cool Stuff" + ChatFormatting.GREEN);


            ClickEvent site1 = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/channel/UCLCDATvGikpHpoC1LsSRm8w");


            Style s2 = new Style();
            s2.setBold(true);
            s2.setClickEvent(site1);


            enter2.setStyle(s2);


            event.player.addChatMessage(enter);
            event.player.addChatComponentMessage(enter2);
        } else {

            TextComponentString enter = new TextComponentString("You Are Using YTStuff Mod V" + Main.VERSION + " By thvardhan / Serial Player");
            TextComponentString enter2 = new TextComponentString("Press Me To Visit To thvardhan's / SerialPlayer Youtube Channel For More Cool Stuff");

            ClickEvent site1 = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/channel/UCLCDATvGikpHpoC1LsSRm8w");

            Style s1 = new Style();

            Style s2 = new Style();
            s2.setBold(true);
            s2.setClickEvent(site1);


            enter2.setStyle(s2);


            event.player.addChatMessage(enter);
            event.player.addChatComponentMessage(enter2);
        }


    }


}

package thvardhan.ytluckyblocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;

public class YTEventHandler {


    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

        if (event.player instanceof EntityPlayer && FMLCommonHandler.instance().getSide() == Side.CLIENT) {

            ChatComponentText enter = new ChatComponentText(EnumChatFormatting.AQUA + "You Are Using " + ChatFormatting.GREEN + "Youtuber's Lucky block" + ChatFormatting.RED + " Mod V" + Main.VERSION + " By thvardhan / Serial Player and "+ChatFormatting.AQUA+"Spikespaz" + ChatFormatting.GREEN);
            ChatComponentText enter2 = new ChatComponentText(ChatFormatting.AQUA + "Press Me To Visit To " + ChatFormatting.GREEN + "thvardhan's / SerialPlayer" + ChatFormatting.YELLOW + " Youtube Channel For More Cool Stuff" + ChatFormatting.GREEN);

            ClickEvent site1 = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/channel/UCLCDATvGikpHpoC1LsSRm8w");


            ChatStyle s2 = new ChatStyle();
            s2.setBold(true);
            s2.setChatClickEvent(site1);


            enter2.setChatStyle(s2);


            event.player.addChatMessage(enter);
            event.player.addChatComponentMessage(enter2);
        } else {

            ChatComponentText enter = new ChatComponentText("You Are Using YTStuff Mod V" + Main.VERSION + " By thvardhan / Serial Player");
            ChatComponentText enter2 = new ChatComponentText("Press Me To Visit To thvardhan's / SerialPlayer Youtube Channel For More Cool Stuff");

            ClickEvent site1 = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/channel/UCLCDATvGikpHpoC1LsSRm8w");

            ChatStyle s1 = new ChatStyle();

            ChatStyle s2 = new ChatStyle();
            s2.setBold(true);
            s2.setChatClickEvent(site1);


            enter2.setChatStyle(s2);


            event.player.addChatMessage(enter);
            event.player.addChatComponentMessage(enter2);
        }


    }


}

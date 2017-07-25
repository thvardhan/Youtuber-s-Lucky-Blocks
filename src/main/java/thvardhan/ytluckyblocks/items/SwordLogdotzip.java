package thvardhan.ytluckyblocks.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.CommonProxy;

import java.util.List;

public class SwordLogdotzip extends ItemSword {

    public SwordLogdotzip(String u, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(u);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);

    }


    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {

        tooltip.add(ChatFormatting.RED + "I Have Power Of Logdotzip");
        tooltip.add(ChatFormatting.BLUE + "And I Seriously Dont Have Any Enchantments");


        super.addInformation(stack, playerIn, tooltip, advanced);
    }


}

package thvardhan.ytluckyblocks.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
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

        tooltip.add(EnumChatFormatting.RED + "I Have Power Of Logdotzip");
        tooltip.add(EnumChatFormatting.BLUE + "And I Seriously Dont Have Any Enchantments");


        super.addInformation(stack, playerIn, tooltip, advanced);
    }


}

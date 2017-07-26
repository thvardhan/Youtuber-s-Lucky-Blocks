package thvardhan.ytluckyblocks.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import thvardhan.ytluckyblocks.init.ModTabs;

import javax.annotation.Nullable;
import java.util.List;

public class SwordLogdotzip extends ItemSword {

    public SwordLogdotzip(String u, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(u);
        this.setRegistryName(u);
        this.setCreativeTab(ModTabs.tabYTStuffMod);

    }


    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(ChatFormatting.RED + "I Have Power Of Logdotzip");
        tooltip.add(ChatFormatting.BLUE + "And I Seriously Dont Have Any Enchantments");

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }


}

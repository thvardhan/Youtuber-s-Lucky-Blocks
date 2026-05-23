package thvardhan.ytluckyblocks.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import thvardhan.ytluckyblocks.CommonProxy;

import javax.annotation.Nullable;
import java.util.List;

public class SwordLogdotzip extends SwordItem {

    public SwordLogdotzip(IItemTier tier) {
        super(tier, 4, -2.4F, new net.minecraft.item.Item.Properties().tab(CommonProxy.tabYTStuffMod));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent(TextFormatting.RED + "I Have Power Of Logdotzip"));
        tooltip.add(new StringTextComponent(TextFormatting.BLUE + "And I Seriously Dont Have Any Enchantments"));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

}

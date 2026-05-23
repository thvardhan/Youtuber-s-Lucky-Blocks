package thvardhan.ytluckyblocks.items;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.NonNullList;
import thvardhan.ytluckyblocks.CommonProxy;

public class NastySword extends SwordItem {

    public NastySword(IItemTier tier) {
        super(tier, 4, -2.4F, new net.minecraft.item.Item.Properties().tab(CommonProxy.tabYTStuffMod));
    }

    @Override
    public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
        if (this.allowdedIn(group)) {
            ItemStack stack = new ItemStack(this);
            stack.enchant(Enchantments.FIRE_ASPECT, 60);
            items.add(stack);
        }
    }

}

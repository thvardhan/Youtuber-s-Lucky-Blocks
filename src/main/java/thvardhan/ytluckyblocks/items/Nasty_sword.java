package thvardhan.ytluckyblocks.items;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.NonNullList;

public class Nasty_sword extends SwordItem {
    public Nasty_sword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if (this.isInGroup(group)) {
            ItemStack s = new ItemStack(this);
            s.addEnchantment(Enchantments.FIRE_ASPECT, 60);
            items.add(s);
        }
    }
}

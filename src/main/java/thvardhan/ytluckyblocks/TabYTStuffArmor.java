package thvardhan.ytluckyblocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thvardhan.ytluckyblocks.items.ModItems;

public class TabYTStuffArmor extends ItemGroup {

    public TabYTStuffArmor() {
        super(ItemGroup.TABS.length, Main.MODID + ".yt_armor");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.ytChestplate);
    }
}

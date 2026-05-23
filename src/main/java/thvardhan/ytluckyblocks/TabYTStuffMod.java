package thvardhan.ytluckyblocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thvardhan.ytluckyblocks.items.ModItems;

public class TabYTStuffMod extends ItemGroup {

    public TabYTStuffMod() {
        super(ItemGroup.TABS.length, Main.MODID + ".yt_stuff");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.ytIcon);
    }
}

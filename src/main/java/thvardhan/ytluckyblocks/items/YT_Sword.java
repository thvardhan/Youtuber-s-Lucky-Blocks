package thvardhan.ytluckyblocks.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import thvardhan.ytluckyblocks.CommonProxy;

public class YT_Sword extends SwordItem {

    public YT_Sword(IItemTier tier) {
        super(tier, 4, -2.4F, new net.minecraft.item.Item.Properties().tab(CommonProxy.tabYTStuffMod));
    }

}

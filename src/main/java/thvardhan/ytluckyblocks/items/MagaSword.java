package thvardhan.ytluckyblocks.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import thvardhan.ytluckyblocks.CommonProxy;

public class MagaSword extends SwordItem {

    public MagaSword(IItemTier tier) {
        super(tier, 4, -2.4F, new net.minecraft.item.Item.Properties().tab(CommonProxy.tabYTStuffMod));
    }

}

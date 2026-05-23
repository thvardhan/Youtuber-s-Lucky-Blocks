package thvardhan.ytluckyblocks.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import thvardhan.ytluckyblocks.CommonProxy;

public class M_sword extends SwordItem {

    public M_sword(IItemTier tier) {
        super(tier, 4, -2.4F, new net.minecraft.item.Item.Properties().tab(CommonProxy.tabYTStuffMod));
    }

}

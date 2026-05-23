package thvardhan.ytluckyblocks.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import thvardhan.ytluckyblocks.CommonProxy;

public class BattleAxe extends SwordItem {

    public BattleAxe(IItemTier tier) {
        super(tier, 4, -2.4F, new net.minecraft.item.Item.Properties().tab(CommonProxy.tabYTStuffMod));
    }

}

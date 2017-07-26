package thvardhan.ytluckyblocks.items;

import net.minecraft.item.Item;
import thvardhan.ytluckyblocks.init.ModTabs;
import thvardhan.ytluckyblocks.proxy.CommonProxy;

public class MicItem extends Item {

    public MicItem(String string) {
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setCreativeTab(ModTabs.tabYTStuffMod);
    }

}

package thvardhan.ytluckyblocks.items;

import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.CommonProxy;

public class SwordBlack extends ItemSword {

    public SwordBlack(String u, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(u);
        this.setRegistryName(u);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);


    }

}

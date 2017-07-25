package thvardhan.ytluckyblocks.items;

import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.CommonProxy;

public class RainbowBlade extends ItemSword {

    public RainbowBlade(String u, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(u);
        this.setRegistryName(u);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);


    }

}

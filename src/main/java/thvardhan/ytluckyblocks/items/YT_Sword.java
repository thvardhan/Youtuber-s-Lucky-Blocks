package thvardhan.ytluckyblocks.items;

import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.CommonProxy;

public class YT_Sword extends ItemSword {

    public YT_Sword(String u, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(u);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);


    }

}

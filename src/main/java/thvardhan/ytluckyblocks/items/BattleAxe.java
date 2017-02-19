package thvardhan.ytluckyblocks.items;

import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.CommonProxy;

public class BattleAxe extends ItemSword {

    public BattleAxe(String u, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(u);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);


    }

}

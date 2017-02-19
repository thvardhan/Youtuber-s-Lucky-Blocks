package thvardhan.ytluckyblocks.items;
import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.item.ItemSword;

public class BattleAxe extends ItemSword {

	public BattleAxe(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

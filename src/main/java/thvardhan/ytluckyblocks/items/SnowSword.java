package thvardhan.ytluckyblocks.items;
import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.item.ItemSword;

public class SnowSword extends ItemSword {

	public SnowSword(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

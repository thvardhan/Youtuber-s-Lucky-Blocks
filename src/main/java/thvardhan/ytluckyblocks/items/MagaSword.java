package thvardhan.ytluckyblocks.items;
import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.item.ItemSword;

public class MagaSword extends ItemSword {

	public MagaSword(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

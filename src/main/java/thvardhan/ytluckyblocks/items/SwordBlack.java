package thvardhan.ytluckyblocks.items;
import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.item.ItemSword;

public class SwordBlack extends ItemSword {

	public SwordBlack(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

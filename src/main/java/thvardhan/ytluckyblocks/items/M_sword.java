package thvardhan.ytluckyblocks.items;

import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.item.ItemSword;

public class M_sword extends ItemSword {

	public M_sword(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

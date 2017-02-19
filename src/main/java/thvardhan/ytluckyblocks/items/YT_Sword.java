package thvardhan.ytluckyblocks.items;

import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.item.ItemSword;

public class YT_Sword extends ItemSword {
	
	public YT_Sword(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

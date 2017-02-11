package com.thvardhan.ytstuff.items;
import com.thvardhan.ytstuff.CommonProxy;

import net.minecraft.item.ItemSword;

public class SwordBlack extends ItemSword {

	public SwordBlack(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

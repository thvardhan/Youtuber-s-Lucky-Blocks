package com.thvardhan.ytstuff.items;
import com.thvardhan.ytstuff.CommonProxy;

import net.minecraft.item.ItemSword;

public class SnowSword extends ItemSword {

	public SnowSword(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

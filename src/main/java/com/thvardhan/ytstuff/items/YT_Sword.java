package com.thvardhan.ytstuff.items;

import com.thvardhan.ytstuff.CommonProxy;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class YT_Sword extends ItemSword {
	
	public YT_Sword(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

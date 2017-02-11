package com.thvardhan.ytstuff.items;

import net.minecraft.item.Item;

import com.thvardhan.ytstuff.CommonProxy;

import net.minecraft.item.ItemSword;

public class M_sword extends ItemSword {

	public M_sword(String u,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(u);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
		
	}

}

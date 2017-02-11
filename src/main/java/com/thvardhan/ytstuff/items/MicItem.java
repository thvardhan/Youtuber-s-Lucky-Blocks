package com.thvardhan.ytstuff.items;

import com.thvardhan.ytstuff.CommonProxy;

import net.minecraft.item.Item;

public class MicItem extends Item {

	public MicItem(String string) {
		this.setUnlocalizedName(string);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
	}

}

package com.thvardhan.ytstuff;

import com.thvardhan.ytstuff.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabYTStuffArmor extends CreativeTabs {

	public TabYTStuffArmor(int index, String label) {
		super(index, label);
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ModItems.ytChestplate;
	}
	
	

}

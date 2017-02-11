package com.thvardhan.ytstuff.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thvardhan.ytstuff.CommonProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class NastySword extends ItemSword {

	public NastySword(String string, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(string);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
			
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		ItemStack s=new ItemStack(this);
		s.addEnchantment(Enchantment.fireAspect, 60);
		subItems.add(s);
	
	}


}

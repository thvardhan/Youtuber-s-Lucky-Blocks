package com.thvardhan.ytstuff.items;

import com.thvardhan.ytstuff.CommonProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class LevinSword extends ItemSword {

	public LevinSword(String string, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(string);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		
	}
	
	
	@Override
	public Item setNoRepair() {
		return super.setNoRepair();
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
	
		
		return super.onLeftClickEntity(stack, player, entity);
	}

}

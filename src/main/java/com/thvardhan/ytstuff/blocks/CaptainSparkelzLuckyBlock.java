package com.thvardhan.ytstuff.blocks;

import java.util.Random;

import com.thvardhan.ytstuff.CommonProxy;
import com.thvardhan.ytstuff.entity.*;
import com.thvardhan.ytstuff.functions.ExtraFunctions;
import com.thvardhan.ytstuff.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CaptainSparkelzLuckyBlock extends Block {


	public CaptainSparkelzLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
	}

	public CaptainSparkelzLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public CaptainSparkelzLuckyBlock(String unlocalizedName) {
		this(unlocalizedName, 2.0f, 10.0f);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		for (int i = 0; i < 3; ++i)
		{
			int j = rand.nextInt(2) * 2 - 1;
			int k = rand.nextInt(2) * 2 - 1;
			double d0 = (double)pos.getX() + 0.5D + 0.25D * (double)j;
			double d1 = (double)((float)pos.getY() + rand.nextFloat());
			double d2 = (double)pos.getZ() + 0.5D + 0.25D * (double)k;
			double d3 = (double)(rand.nextFloat() * (float)j);
			double d4 = ((double)rand.nextFloat() - 0.5D) * 0.125D;
			double d5 = (double)(rand.nextFloat() * (float)k);
			worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5, new int[0]);
		}
	}

	@Override
	public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {

		if(!world.isRemote && player != null && !(player instanceof FakePlayer)){
			world.setBlockToAir(pos);
			drops(world, pos, player);
		}

		return true;

	}

	private void drops(World worldIn,BlockPos pos,EntityPlayer player){

		Random rand=new Random();

		switch(rand.nextInt(55)){
			default:{
				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}
			case 0:{

				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}
			case 1:{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}
			case 2:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 2, 0, 0);
				break;
			}
			case 3:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.mic), 1, 0, 0);
				break;
			}case 4:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				break;
			}case 5:{
				ExtraFunctions.hellWellStructure(worldIn, pos,rand);
				break;
			}case 6:{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}case 7:{
				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}case 8:{
				ExtraFunctions.toVoid(worldIn, pos);
				break;
			}case 9:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntitySkeleton(worldIn), 25,worldIn,pos);
				break;
			}case 10:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn),rand.nextInt(50)+1,worldIn,pos);
				break;
			}case 11:{
				ExtraFunctions.orcArmy(worldIn, pos, 0, rand);
				break;
			}case 12:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn),rand.nextInt(0)+1,worldIn,pos);
				break;
			}case 13:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.anvil);
				ExtraFunctions.chat( EnumChatFormatting.DARK_BLUE+"You Should Be Happy It Dint Fell On Ya", player);
				break;
			}case 14:{
				ExtraFunctions.burgerStruct(worldIn, pos);
				break;
			}case 15:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 10,worldIn,pos);
				break;
			}case 16:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), 3,worldIn,pos);
				break;
			}case 17:{
				ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.diamond, 12, 0, 0);
				break;
			}case 18:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
				break;
			}case 19:{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.swordLogdotzip, EnumChatFormatting.RED+"LogDotZip's Best Sword", Enchantment.fireAspect, 7);
				break;
			}case 20:{
				ExtraFunctions.materialKit(worldIn, pos,rand);
				break;
			}case 21:{
				ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
				break;
			}case 22:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.command_block);
				ExtraFunctions.chat( EnumChatFormatting.GREEN+"Try To Use This :D", player);
				break;
			}case 23:{
				EntityRabbit rab=new EntityRabbit(worldIn);
				rab.setRabbitType(99);
				ExtraFunctions.summonMobsOnBreakBlock(rab, 5,worldIn,pos);
				break;
			}case 24:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn),3,worldIn,pos);
				break;
			}case 25:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityPopularMMO(worldIn),3,worldIn,pos);
				break;
			}case 26:{
				ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
				break;
			}case 27:{
				ExtraFunctions.potionKit(worldIn, pos,rand);
				break;
			}case 28:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.golden_apple), 64, 0, 0);
				break;
			}case 29:{
				ExtraFunctions.burgerStruct(worldIn, pos);
				break;
			}case 30:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
				break;
			}case 31:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityBlaze(worldIn),rand.nextInt(5)+1,worldIn,pos);
				break;
			}case 32:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 5,worldIn,pos);
				break;
			}case 33:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 10,worldIn,pos);
				break;
			}case 34:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn),rand.nextInt(40)+1,worldIn,pos);
				break;
			}case 35:{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.mic, "mic", Enchantment.fireAspect, 8);
				break;
			}case 36:{
				Enchantment[] e={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_boots), e, 8, worldIn, pos);
				break;
			}case 37:{Enchantment[] e={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};

				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_leggings), e, 5, worldIn, pos);

				break;
			}case 38:{Enchantment[] e={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_chestplate), e, 4, worldIn, pos);

				break;
			}case 39:{Enchantment[] e={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};

				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_helmet), e, 6, worldIn, pos);
				break;
			}case 40:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), 5,worldIn,pos);
				break;
			}case 41:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn),rand.nextInt(0)+1,worldIn,pos);
				break;
			}case 42:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.golden_apple), 44, 1, 50);
				break;
			}case 43:{
				ExtraFunctions.tntFix(worldIn, pos, 5, player);
				break;
			}case 44:{
				ExtraFunctions.tntFix(worldIn, pos, 12, player);
				break;
			}case 45:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.beacon);
				break;
			}case 46:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.cake);
				break;
			}case 47:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.clay);
				break;
			}case 48:{
				ExtraFunctions.holeDeathTrap(worldIn, pos);
				break;
			}case 49:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
				break;
			}case 50:{
				ExtraFunctions.mountain(worldIn, pos,rand);
				break;
			}
			case 51:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capChestplate));
				break;
			}
			case 52:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capBoots));
				break;
			}
			case 53:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capHelmet));
				break;
			}
			case 54:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capLeggings));
				break;
			}

		}

	}//method end
}

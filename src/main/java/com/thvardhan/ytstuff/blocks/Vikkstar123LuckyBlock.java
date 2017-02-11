package com.thvardhan.ytstuff.blocks;

import java.util.Random;

import com.thvardhan.ytstuff.CommonProxy;
import com.thvardhan.ytstuff.entity.EntityExplodingTNT;
import com.thvardhan.ytstuff.entity.EntityISquid;
import com.thvardhan.ytstuff.entity.EntityPeteZahHutt;
import com.thvardhan.ytstuff.entity.EntityVikkstar123;
import com.thvardhan.ytstuff.functions.ExtraFunctions;
import com.thvardhan.ytstuff.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Vikkstar123LuckyBlock extends Block {
	public Vikkstar123LuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
	}

	public Vikkstar123LuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public Vikkstar123LuckyBlock(String unlocalizedName) {
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
			worldIn.spawnParticle(EnumParticleTypes.SPELL_WITCH, d0, d1, d2, d3, d4, d5, new int[0]);
		}
	}


	@Override
	public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
		if(!world.isRemote && player != null && !(player instanceof FakePlayer)){

			world.setBlockToAir(pos);
			drops(world, pos, player);
		}
		return true;

		//super.onBlockDestroyedByPlayer(worldIn, pos, state);
	}

	private void drops(World worldIn,BlockPos pos,EntityPlayer player){

		Enchantment[] e=new Enchantment[5];
		e[0]=Enchantment.flame;
		e[1]=Enchantment.knockback;
		e[2]=Enchantment.power;
		e[3]=Enchantment.thorns;
		e[4]=Enchantment.looting;


		Random rand = new Random();


		switch(rand.nextInt(51)){

			default:{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e,5, worldIn, pos);}
			case 0:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}
			case 1:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 2:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}
			case 3:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
				break;
			}
			case 4:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.vikBoots));
				break;
			}
			case 5:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.vikChestplate));
				break;
			}
			case 6:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.vikHelmet));
				break;
			}
			case 7:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.vikLeggings));
				break;
			}
			case 8:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
				break;
			}
			case 9:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.glowstone);
				break;
			}
			case 10:
			{
				ExtraFunctions.summonMobsNearby(new EntityPeteZahHutt(worldIn), 25, worldIn, pos, rand);
				break;
			}
			case 11:
			{
				ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 15, worldIn, pos, rand);
				break;
			}
			case 12:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.flower_pot), 23, 1, 2);
				break;
			}
			case 13:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1,worldIn,pos);
				break;
			}
			case 14:
			{
				ExtraFunctions.holeDeathTrap(worldIn, pos);
				break;
			}
			case 15:
			{
				ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 70, worldIn, pos, rand);
				break;
			}
			case 16:
			{
				ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
				break;
			}
			case 17:
			{
				ExtraFunctions.tpPlayerInGround(player);
				break;
			}
			case 18:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
				break;
			}
			case 19:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
				break;
			}
			case 20:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
				break;
			}
			case 21:
			{
				ExtraFunctions.anvilRain(worldIn, pos);
				break;
			}
			case 22:
			{
				ExtraFunctions.flyingIsle(worldIn, pos);
				break;
			}
			case 23:
			{
				ExtraFunctions.luckyBlockTower(worldIn, pos);
				break;
			}
			case 24:
			{
				ExtraFunctions.luckyBlockBox(worldIn, pos,rand);
				break;
			}
			case 25:
			{
				ExtraFunctions.mountainOne(worldIn, pos,rand);
				break;
			}
			case 26:
			{
				ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
				break;
			}
			case 27:
			{
				ExtraFunctions.toVoid(worldIn, pos);
				break;
			}
			case 28:
			{
				ExtraFunctions.randomSixtyFourTower(worldIn, pos,rand);
				break;
			}
			case 29:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
				break;
			}
			case 30:
			{
				ExtraFunctions.summonMobsNearby(new EntityExplodingTNT(worldIn), 50, worldIn, pos, rand);
				break;
			}
			case 31:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
				break;

			}
			case 32:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.diamondButton);
				break;
			}
			case 33:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.ironButton);
				break;
			}
			case 34:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
				break;
			}
			case 35:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.exploadingTNTLuckyBlock);
				break;
			}
			case 36:
			{
				ExtraFunctions.tntNearby(worldIn, pos, 100, player,rand);
				break;
			}
			case 37:
			{
				ExtraFunctions.slimeFort(worldIn,  player);
				break;
			}
			case 38:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
				break;
			}
			case 39:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1,worldIn,pos);
				break;
			}
			case 40:
			{
				ExtraFunctions.summonMobsNearby(new EntityVikkstar123(worldIn), 50, worldIn, pos, rand);
				break;
			}
			case 41:
			{
				ExtraFunctions.tntPlaceNearby(worldIn, pos, 30,rand);
				break;
			}
			case 42:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.cauldron);
				break;
			}
			case 43:
			{
				ExtraFunctions.summonCowNearby(worldIn, pos, 40, rand);
				break;
			}
			case 44:
			{
				ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 5, worldIn, pos, rand);
				break;
			}
			case 45:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 150,worldIn,pos);
				break;
			}
			case 46:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.golden_apple));
				break;
			}
			case 47:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e, 4, worldIn, pos);
				break;
			}
			case 48:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.water);
				break;
			}
			case 49:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.ice),64, 1, 1);
				break;
			}
			case 50:
			{
				ExtraFunctions.summonMobsNearby(new EntityVikkstar123(worldIn), 31, worldIn, pos, rand);
				break;
			}



		}//switch ends
	}//method end
}

package com.thvardhan.ytstuff.blocks;

import java.util.Random;

import com.thvardhan.ytstuff.CommonProxy;
import com.thvardhan.ytstuff.entity.EntityDanTDM;
import com.thvardhan.ytstuff.entity.EntityLittleDonny;
import com.thvardhan.ytstuff.functions.ExtraFunctions;
import com.thvardhan.ytstuff.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntitySkeleton;
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

public class LittleDonnyLuckyBlock extends Block {

	public LittleDonnyLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public LittleDonnyLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public LittleDonnyLuckyBlock(String unlocalizedName) {
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
			worldIn.spawnParticle(EnumParticleTypes.CRIT_MAGIC, d0, d1, d2, d3, d4, d5, new int[0]);
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
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
				break;
			}
			case 1:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donnyBoots));
				break;
			}
			case 2:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donnyChestplate));
				break;
			}
			case 3:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donnyHelmet));
				break;
			}
			case 4:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donnyLeggings));
				break;
			}
			case 5:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
				break;
			}
			case 6:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityLittleDonny(worldIn), 40,worldIn,pos);
				break;
			}
			case 7:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityLittleDonny(worldIn),rand.nextInt(50)+1,worldIn,pos);
				break;
			}
			case 8:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.bow), 1, 0, 0);
				break;
			}
			case 9:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.bow), new Enchantment[]{Enchantment.flame,Enchantment.punch,Enchantment.power}, 8, worldIn, pos);
				break;
			}
			case 10:
			{
				ExtraFunctions.tntPlaceNearby(worldIn, pos, 100,rand);
				break;
			}
			case 11:
			{
				ExtraFunctions.fireCamp(worldIn, player);
				break;
			}
			case 12:
			{
				ExtraFunctions.towerStruct(worldIn, pos);
				break;
			}
			case 13:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}
			case 14:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 15:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}
			case 16:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
				break;
			}
			case 17:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.diamondButton);
				break;
			}
			case 18:
			{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}
			case 19:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.swordBlack),1, 0, 0);
				break;
			}
			case 20:
			{
				ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 50, worldIn, pos, rand);
				break;
			}
			case 21:
			{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.mic);
				break;
			}
			case 22:
			{
				ExtraFunctions.deathHole(worldIn, player);
				break;
			}
			case 23:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
				break;
			}
			case 24:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
				break;
			}
			case 25:
			{
				ExtraFunctions.tntFix(worldIn, pos, 30, player);
				break;
			}
			case 26:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
				break;
			}
			case 27:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
				break;

			}
			case 28:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
				break;
			}
			case 29:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
				break;
			}
			case 30:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.flowing_lava);
				break;
			}
			case 31:
			{
				ExtraFunctions.saflyTeleportPlayer(worldIn, player);
				break;
			}
			case 32:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.bone), 50, 1, 4);
				break;
			}
			case 33:
			{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.bedrock);
				break;
			}
			case 34:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.saddle));
				break;
			}
			case 35:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn),rand.nextInt(20)+1,worldIn,pos);
				break;
			}
			case 36:
			{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
				break;
			}
			case 37:
			{
				ExtraFunctions.summonCowNearby(worldIn, pos, 40, rand);
				ExtraFunctions.chat( "GET THE COWS BEFORE OTHERS!", player);
				break;
			}
			case 38:
			{
				ExtraFunctions.summonMobsNearby(new EntityLittleDonny(worldIn), 5, worldIn, pos, rand);break;
			}
			case 39:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.end_portal);
				break;
			}
			case 40:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.nether_brick);
				break;
			}
			case 41:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModBlocks.petaZahHuttLuckyBlock), 10, 1, 4);
				break;
			}
			case 42:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.command_block_minecart));
				break;
			}
			case 43:
			{
				ItemStack[] stack={new ItemStack(Items.diamond_sword),new ItemStack(Items.diamond_axe)
						,new ItemStack(Items.wooden_sword),new ItemStack(Items.bone),new ItemStack(Items.golden_boots),
						new ItemStack(Items.diamond_pickaxe)};
				Enchantment[] ench={Enchantment.fortune,Enchantment.fireAspect,Enchantment.punch,Enchantment.efficiency,Enchantment.flame
						,Enchantment.unbreaking,Enchantment.infinity,Enchantment.looting};


				ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, ench, 8, pos,rand);


				break;
			}
			case 44:
			{

				ExtraFunctions.holeDeathTrap(worldIn, pos);
				ExtraFunctions.trollChat(player);

				break;
			}
			case 45:
			{
				ItemStack[] s={new ItemStack(Items.stone_axe),new ItemStack(Items.stone_hoe)
						,new ItemStack(Items.stone_pickaxe),new ItemStack(Items.stone_sword),new ItemStack(Items.diamond_chestplate),
						new ItemStack(Items.acacia_door)};
				Enchantment[] ench={Enchantment.fortune,Enchantment.fireAspect,Enchantment.punch,Enchantment.efficiency,Enchantment.flame
						,Enchantment.unbreaking,Enchantment.infinity,Enchantment.looting};


				ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, ench, 8, pos,rand);


				break;
			}
			case 46:
			{


				ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);

				break;
			}
			case 47:
			{

				ExtraFunctions.toVoid(worldIn, pos);
				break;
			}
			case 48:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
				break;
			}
			case 49:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.popularMMOLuckyBlock);
				break;
			}
			case 50:
			{

				ExtraFunctions.summonMobsOnBreakBlock(new EntityLittleDonny(worldIn), 40,worldIn,pos);
				break;
			}


		}//switch ends
	}//method end
}

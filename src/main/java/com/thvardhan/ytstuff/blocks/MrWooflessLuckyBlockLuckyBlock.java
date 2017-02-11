package com.thvardhan.ytstuff.blocks;

import java.util.Random;

import com.thvardhan.ytstuff.CommonProxy;
import com.thvardhan.ytstuff.entity.EntityDanTDM;
import com.thvardhan.ytstuff.entity.EntityGhost;
import com.thvardhan.ytstuff.entity.EntityMrWoofless;
import com.thvardhan.ytstuff.functions.ExtraFunctions;
import com.thvardhan.ytstuff.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntitySkeleton;
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

public class MrWooflessLuckyBlockLuckyBlock extends Block {
	public MrWooflessLuckyBlockLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
	}

	public MrWooflessLuckyBlockLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public MrWooflessLuckyBlockLuckyBlock(String unlocalizedName) {
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
				ExtraFunctions.chat( EnumChatFormatting.RED+"Passive Aggression. We win games. With no kills.", player);
				break;
			}
			case 1:
			{
				ExtraFunctions.chat( "What's going on guys? It is Wednesday, and if it's Wednesday, it is time for Story Time With Taffy! 	", player);
				break;
			}
			case 2:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 23,worldIn,pos);
				break;
			}
			case 3:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.soul_sand);
				break;
			}
			case 4:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}
			case 5:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 6:
			{

				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}
			case 7:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
				break;
			}
			case 8:
			{
				ExtraFunctions.summonMobsNearby(new EntityMrWoofless(worldIn), 14, worldIn, pos, rand);break;
			}
			case 9:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.apple));
				break;
			}
			case 10:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 20,worldIn,pos);
				break;
			}
			case 11:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.emerald), 64, 1, 4);
				break;
			}
			case 12:
			{
				ExtraFunctions.holeDeathTrap(worldIn, pos);
				break;
			}
			case 13:
			{
				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}
			case 14:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityEndermite(worldIn), 64,worldIn,pos);
				break;
			}
			case 15:
			{
				ExtraFunctions.anvilRain(worldIn, pos);
				break;
			}
			case 16:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_axe));
				break;
			}
			case 17:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));

				break;
			}
			case 18:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 3,worldIn,pos);
				break;
			}
			case 19:
			{
				ExtraFunctions.summonMobsNearby(new EntityMrWoofless(worldIn), 51, worldIn, pos, rand);
				break;
			}
			case 20:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.arrow), e, 5, worldIn, pos);
				break;
			}
			case 21:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.cake);
				break;
			}
			case 22:
			{
				ExtraFunctions.towerStruct(worldIn, pos);
				break;
			}
			case 23:
			{
				ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 41, worldIn, pos, rand);
				break;
			}
			case 24:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.fire);
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
				ExtraFunctions.chat( "GET THE COWS BEFORE OTHERS", player);
				break;
			}
			case 38:
			{
				ExtraFunctions.summonMobsNearby(new EntityMrWoofless(worldIn), 25, worldIn, pos, rand);
				break;
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
				ExtraFunctions.tntRain(worldIn, pos, 30, 1, player);
				break;
			}
			case 44:
			{
				ExtraFunctions.musicKit(worldIn, pos);
				break;
			}
			case 45:
			{
				ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
				break;
			}
			case 46:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_sword));
				break;
			}
			case 47:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mrBoots));
				break;
			}
			case 48:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mrChestplate));
				break;
			}
			case 49:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mrHelmet));
				break;
			}
			case 50:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mrLeggings));
				break;
			}



		}//switch ends
	}//method end
}

package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityLittleCarlyMC;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LittleCarlyMcLuckyBlock extends Block {

	public LittleCarlyMcLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public LittleCarlyMcLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public LittleCarlyMcLuckyBlock(String unlocalizedName) {
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
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytBoots), e, 10, worldIn, pos);
				ExtraFunctions.chat( EnumChatFormatting.AQUA+"What is this? Defence or offence?", player);
				break;
			}
			case 1:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.nightVision.getId(),1200,1,true,true));
				break;
			}
			case 2:
			{
				ExtraFunctions.effectPlayer(player,new PotionEffect(Potion.moveSpeed.getId(),2000,100,true,true));
				break;
			}
			case 3:
			{
				ExtraFunctions.setHoleWithMites(worldIn,  player);
				break;
			}
			case 4:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
				break;
			}
			case 5:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
				break;
			}
			case 6:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityLittleCarlyMC(worldIn),rand.nextInt(50)+1,worldIn,pos);
				break;
			}
			case 7:
			{
				ExtraFunctions.deathHole(worldIn, player);
				break;
			}
			case 8:
			{
				ExtraFunctions.orcArmy(worldIn, pos, 30, rand);
				break;
			}
			case 9:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityLittleCarlyMC(worldIn), 30,worldIn,pos);
				break;
			}
			case 10:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.poison.id,600,5));
				break;
			}
			case 11:
			{
				ExtraFunctions.tpPlayer(player);
				break;
			}
			case 12:
			{
				ExtraFunctions.tpPlayerInGround(player);
				break;
			}
			case 13:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
				break;
			}
			case 14:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
				break;
			}
			case 15:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityLittleCarlyMC(worldIn), 50,worldIn,pos);
				break;
			}
			case 16:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}
			case 17:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 18:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}
			case 19:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.hunger.id,600,30));
				break;
			}
			case 20:
			{
				ExtraFunctions.tpPlayerInGround(player);
				break;
			}
			case 21:
			{
				ExtraFunctions.setHoleWithMites(worldIn, player);
				break;
			}
			case 22:
			{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}
			case 23:
			{
				ExtraFunctions.tpPlayer(player);
				break;
			}
			case 24:
			{
				ExtraFunctions.anvilRain(worldIn, pos);
				break;
			}
			case 25:
			{
				ExtraFunctions.luckyBlockTower(worldIn, pos);
				break;
			}
			case 26:
			{
				ExtraFunctions.luckyBlockBox(worldIn, pos,rand);
				break;
			}
			case 27:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.carlyBoots));
				break;
			}
			case 28:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.carlyChestplate));
				break;
			}
			case 29:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.carlyHelmet));
				break;
			}
			case 30:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.carlyLeggings));
				break;
			}
			case 31:
			{
				ExtraFunctions.luckyBlockTower(worldIn, pos);
				break;
			}
			case 32:
			{
				ExtraFunctions.randomSixtyFourTower(worldIn, pos,rand);
				break;
			}
			case 33:
			{
				ExtraFunctions.sandRain(worldIn, player);
				break;
			}
			case 34:
			{
				ExtraFunctions.tntRain(worldIn, pos, rand.nextInt(100)+1, 20, player);
				break;
			}
			case 35:
			{
				ExtraFunctions.setHoleWithMites(worldIn,  player);
				break;
			}
			case 36:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.wooden_sword), e, 2, worldIn, pos);
				break;
			}
			case 37:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
				break;
			}
			case 38:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.mic);
				break;
			}
			case 39:
			{
				ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 5, worldIn, pos, rand);break;
			}
			case 40:
			{
				ExtraFunctions.anvilRain(worldIn, pos);
				break;
			}
			case 41:
			{
				ExtraFunctions.fireCamp(worldIn, player);
				break;
			}
			case 42:
			{
				ExtraFunctions.summonMobsNearby(new EntityLittleCarlyMC(worldIn), 15, worldIn, pos, rand);break;
			}
			case 43:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
				break;
			}
			case 44:
			{
				ExtraFunctions.redstoneKit(worldIn, pos);
				break;
			}
			case 45:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
				break;
			}
			case 46:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 40,worldIn,pos);
				break;
			}
			case 47:
			{
				ExtraFunctions.tpPlayerInGround(player);
				break;
			}
			case 48:
			{
				ExtraFunctions.deathHole(worldIn, player);
				break;
			}
			case 49:
			{
				ExtraFunctions.tpPlayerInGround(player);
				break;
			}
			case 50:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 40,worldIn,pos);
				break;
			}



		}//switch ends
	}//method end
}

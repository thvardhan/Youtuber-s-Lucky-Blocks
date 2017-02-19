package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.entity.EntityTinyTurtle;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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

public class TinyTurtleLuckyBlock extends Block {

	public TinyTurtleLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public TinyTurtleLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public TinyTurtleLuckyBlock(String unlocalizedName) {
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
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
				break;
			}
			case 2:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityTinyTurtle(worldIn), 40,worldIn,pos);
				break;
			}
			case 3:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}
			case 4:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 5:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}
			case 6:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
				break;
			}
			case 7:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.turtleBoots));
				break;
			}
			case 8:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.turtleChestplate));
				break;
			}
			case 9:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.turtleHelmet));
				break;
			}
			case 10:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.turtleLeggings));
				break;
			}
			case 11:
			{
				ExtraFunctions.fireCamp(worldIn, player);
				break;
			}
			case 12:
			{
				ExtraFunctions.deathHole(worldIn, player);
				break;
			}
			case 13:
			{
				ExtraFunctions.luckyBlockBox(worldIn, pos,rand);
				break;
			}
			case 14:
			{
				ExtraFunctions.tntPlaceNearby(worldIn, pos, 700,rand);
				break;
			}
			case 15:
			{
				ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 51, worldIn, pos, rand);
				break;
			}
			case 16:
			{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.dragon_egg);
				break;
			}
			case 17:
			{
				ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.cake, 20, 0, 0);
				break;
			}
			case 18:
			{
				ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
				break;
			}
			case 19:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.swordBlack),1, 0, 0);
				break;
			}
			case 20:
			{
				ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 5, worldIn, pos, rand);
				break;
			}
			case 21:
			{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.mic);
				break;
			}
			case 22:
			{
				ExtraFunctions.tntNearby(worldIn, pos, 400, player,rand);
				break;
			}
			case 23:
			{
				ExtraFunctions.chat( EnumChatFormatting.BOLD+"This One Was Empty", player);
				break;
			}
			case 24:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 5,worldIn,pos);
				break;
			}
			case 25:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
				break;
			}
			case 26:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
				break;
			}
			case 27:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
				break;
			}
			case 28:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
				break;
			}
			case 29:
			{
				ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 25, worldIn, pos, rand);
				break;
			}
			case 30:
			{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
				break;
			}
			case 31:
			{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
				break;
			}
			case 32:
			{
				ExtraFunctions.materialKit(worldIn, pos,rand);
				break;
			}
			case 33:
			{
				ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
				break;
			}
			case 34:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.damageBoost.getId(),1000,20,true,true));
				break;
			}
			case 35:
			{
				ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
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
				ExtraFunctions.summonMobsNearby(new EntityTinyTurtle(worldIn), 35, worldIn, pos, rand);
				break;
			}
			case 40:
			{
				ExtraFunctions.materialKit(worldIn, pos,rand);
				break;
			}
			case 41:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.dragon_egg));
				break;
			}
			case 42:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.cake));
				break;
			}
			case 43:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.command_block));
				break;
			}
			case 44:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.arrow), 64, 0, 0);
				break;
			}
			case 45:
			{
				ExtraFunctions.flyingIsle(worldIn, pos);
				break;
			}
			case 46:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_horse_armor));
				break;
			}
			case 47:
			{
				ExtraFunctions.summonMobsNearby(new EntityTinyTurtle(worldIn), 55, worldIn, pos, rand);
				break;
			}
			case 48:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_sword));
				break;
			}
			case 49:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.enchanting_table);
				break;
			}
			case 50:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
				break;
			}


		}//switch ends
	}//method end
}

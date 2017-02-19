package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
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

public class IBallisticSquidLuckyBlock extends Block {

	public IBallisticSquidLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
	}

	public IBallisticSquidLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public IBallisticSquidLuckyBlock(String unlocalizedName) {
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
				ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn),rand.nextInt(50)+1,worldIn,pos);
				break;
			}
			case 3:{
				ExtraFunctions.randomSixtyFourTower(worldIn, pos,rand);
				break;
			}case 4:{
				Enchantment[] e={Enchantment.sharpness,Enchantment.baneOfArthropods,Enchantment.fireAspect,Enchantment.smite};
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_shovel), e, 9, worldIn, pos);
				ExtraFunctions.chat( "Someone Just Got "+EnumChatFormatting.DARK_AQUA+"GOD"+EnumChatFormatting.WHITE+" Shovel", player);
				break;
			}case 5:{
				ExtraFunctions.summonCowNearby(worldIn, pos, 64, rand);
				break;
			}case 6:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				break;
			}case 7:{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}case 8:{
				ExtraFunctions.burgerStruct(worldIn, pos);
				break;
			}case 9:{
				ExtraFunctions.burgerStructOne(worldIn, pos);
				break;
			}case 10:{
				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}case 11:{
				ExtraFunctions.tpPlayer(player);
				break;
			}case 12:{
				ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 13, worldIn, pos, rand);
				break;
			}case 13:{
				ExtraFunctions.randomSixtyFourTower(worldIn, pos,rand);
				break;
			}case 14:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 2,worldIn,pos);
				break;
			}case 15:{
				ExtraFunctions.musicKit(worldIn, pos);
				break;
			}case 16:{
				EntityRabbit rab=new EntityRabbit(worldIn);
				rab.setRabbitType(99);
				ExtraFunctions.summonMobsOnBreakBlock(rab,rand.nextInt(50),worldIn,pos);
				break;
			}case 17:{
				ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
				break;
			}case 18:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 25,worldIn,pos);
				break;
			}case 19:{
				ExtraFunctions.toVoid(worldIn, pos);
				break;
			}case 20:{
				ExtraFunctions.potionKit(worldIn, pos,rand);
				break;
			}case 21:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}case 22:{
				ExtraFunctions.mountain(worldIn, pos,rand);
				break;
			}case 23:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.enchanting_table);
				break;
			}case 24:{
				ExtraFunctions.chat( "You May Want To Craft Anything :3", player);
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.crafting_table);
				break;
			}case 25:{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, rand.nextBoolean());
				break;
			}case 26:{
				ExtraFunctions.redstoneKit(worldIn, pos);
				break;
			}case 27:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.bedrock), 64, 0, 0);
				break;
			}case 28:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.obsidian), 64, 0,0);
				break;
			}case 29:{
				ExtraFunctions.tntRain(worldIn, pos, 50, 0, player);
				break;
			}case 30:{
				ExtraFunctions.tntNearby(worldIn, pos, 500, player,rand);
				ExtraFunctions.chat( "Only 500 Tnts Are About To Blast", player);
				break;
			}case 31:{
				ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 35, worldIn, pos, rand);
				break;
			}case 32:{
				ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 15, worldIn, pos, rand);
				break;
			}case 33:{
				ExtraFunctions.potionKit(worldIn, pos,rand);
				break;
			}case 34:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.cake);
				break;
			}case 35:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.dragon_egg);
				break;
			}case 36:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.iBallisticSquidLuckyBlock);
				break;
			}case 37:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_boots));
				break;
			}case 38:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.brewing_stand);
				ExtraFunctions.potionKit(worldIn, pos,rand);
				break;
			}case 39:{
				ExtraFunctions.redstoneKit(worldIn, pos);
				break;
			}case 40:{
				ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.emerald_block, 20, 0, 0);
				break;
			}case 41:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn),rand.nextInt(6)+1,worldIn,pos);
				break;
			}case 42:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 20,worldIn,pos);
				break;
			}case 43:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn),rand.nextInt(20)+1,worldIn,pos);
				break;
			}case 44:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.diamond_block), 10, 0, 0);
				break;
			}case 45:{
				ExtraFunctions.trollChat(player);
				break;
			}case 46:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);
				break;
			}case 47:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
				break;
			}case 48:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				break;
			}case 49:{
				ExtraFunctions.hellWellStructure(worldIn, pos,rand);
				break;
			}case 50:{
				ExtraFunctions.tpPlayer(player);
				break;
			}
			case 51:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.squidBoots));
				break;
			}
			case 52:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.squidChestplate));
				break;
			}
			case 53:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.squidHelmet));
				break;
			}
			case 54:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.squidLeggings));
				break;
			}

		}
	}//method ends
}

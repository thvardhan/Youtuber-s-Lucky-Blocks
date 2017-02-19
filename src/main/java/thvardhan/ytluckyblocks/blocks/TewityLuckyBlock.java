package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.entity.*;

public class TewityLuckyBlock extends Block {

	public TewityLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public TewityLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public TewityLuckyBlock(String unlocalizedName) {
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
			worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, d0, d1, d2, d3, d4, d5, new int[0]);
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


		Enchantment[] e=new Enchantment[4];
		e[0]=Enchantment.flame;
		e[2]=Enchantment.power;
		e[3]=Enchantment.thorns;
		e[1]=Enchantment.looting;



		Random rand = new Random();


		switch(rand.nextInt(101)){

			default:{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e,5, worldIn, pos);}
			case 0:
			{
				ExtraFunctions.slimeFort(worldIn, player);
				break;
			}
			case 1:
			{
				ExtraFunctions.summonMobsNearby(new EntityTewity(worldIn), 5, worldIn, pos, rand);
				break;
			}
			case 2:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityBoots));
				break;
			}
			case 3:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityChestplate));
				break;
			}
			case 4:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityHelmet));
				break;
			}
			case 5:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityLeggings));
				break;
			}
			case 6:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}
			case 7:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 8:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}
			case 9:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
				break;
			}
			case 10:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
				break;
			}
			case 11:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
				break;
			}
			case 12:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
				break;
			}
			case 13:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
				break;
			}
			case 14:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
				break;
			}
			case 15:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
				break;
			}
			case 16:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
				break;
			}
			case 17:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
				break;
			}
			case 18:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
				break;
			}
			case 19:
			{
				ExtraFunctions.summonMobsNearby(new EntityTewity(worldIn), 32, worldIn, pos, rand);
				break;
			}
			case 20:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
				break;
			}
			case 21:
			{
				ExtraFunctions.setHoleWithMites(worldIn,  player);
				break;
			}
			case 22:
			{
				ExtraFunctions.burgerStruct(worldIn, pos);
				break;
			}
			case 23:
			{
				ExtraFunctions.anvilRain(worldIn, pos);
				break;
			}
			case 24:
			{
				ExtraFunctions.summonCowNearby(worldIn, pos, 20, rand);
				break;
			}
			case 25:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn),rand.nextInt(6)+1,worldIn,pos);
				break;
			}
			case 26:
			{
				ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
				break;
			}
			case 27:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityBoots));
				break;
			}
			case 28:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityChestplate));
				break;
			}
			case 29:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityHelmet));
				break;
			}
			case 30:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityLeggings));
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
				ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 36, worldIn, pos, rand);
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
				ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), 42, worldIn, pos, rand);
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
			case 51:{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.iron_pickaxe),new Enchantment[]{Enchantment.efficiency,Enchantment.fortune}, 4, worldIn, pos);
				break;
			}
			case 52:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.heavy_weighted_pressure_plate);
				break;
			}
			case 53:{
				ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
				break;
			}
			case 54:{
				ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 25, worldIn, pos, rand);
				break;
			}
			case 55:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 20,worldIn,pos);
				break;
			}case 56:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn),3,worldIn,pos);
				break;
			}case 57:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn),rand.nextInt(20)+1,worldIn,pos);
				break;
			}case 58:{
				ExtraFunctions.tntNearby(worldIn, pos, 100, player,rand);
				break;
			}case 59:{
				ExtraFunctions.hellWellStructure(worldIn, pos,rand);
				break;
			}case 60:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				break;
			}case 61:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 20,worldIn,pos);
				break;
			}case 62:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1,worldIn,pos);
				break;
			}case 63:{
				EntityRabbit rab=new EntityRabbit(worldIn);
				rab.setRabbitType(99);
				ExtraFunctions.summonMobsOnBreakBlock(rab, 20,worldIn,pos);
				break;
			}case 64:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.skull);
				break;
			}case 65:{
                ExtraFunctions.summonMobsNearby(new EntityFrizzleandpop(worldIn), 52, worldIn, pos, rand);
				break;
			}case 66:{
				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}case 67:{
				ExtraFunctions.burgerStructOne(worldIn, pos);
				break;
			}case 68:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.command_block_minecart));
				break;
			}case 69:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.flowing_lava);
				break;
			}case 70:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.golden_sword));
				break;
			}case 71:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.stone_sword));
				break;
			}case 72:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.iron_sword));
				break;
			}case 73:{
                ExtraFunctions.summonMobsNearby(new EntityTewity(worldIn), 27, worldIn, pos, rand);break;
			}case 74:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.gold_ingot), 20, 1, 20);
				break;
			}case 75:{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.blindness.getId(),700,20));
				break;
			}case 76:{
				ExtraFunctions.mountain(worldIn, pos,rand);
				break;
			}case 77:{
				ExtraFunctions.mountainOne(worldIn, pos,rand);
				break;
			}case 78:{
				ExtraFunctions.toVoid(worldIn, pos);
				break;
			}case 79:{
				ExtraFunctions.tpPlayer(player);
				break;
			}case 80:{
				ExtraFunctions.musicKit(worldIn, pos);
				break;
			}case 81:{
				ExtraFunctions.redstoneKit(worldIn, pos);
				break;
			}case 82:{
				ExtraFunctions.tntFix(worldIn, pos, 70, player);
				break;
			}case 83:{
				ExtraFunctions.towerStruct(worldIn, pos);
				break;
			}case 84:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.shears));
				break;
			}case 85:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 3, 0, 0);
				break;
			}case 86:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.emerald_block);
				break;
			}case 87:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.brewing_stand);
				break;
			}case 88:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn),rand.nextInt(20)+1,worldIn,pos);
				break;
			}case 89:{
				ExtraFunctions.trollChat(player);
				break;
			}case 90:{
                ExtraFunctions.summonMobsNearby(new EntityTewity(worldIn), 20, worldIn, pos, rand);
				break;
			}case 91:{
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 15, worldIn, pos, rand);
				break;
			}case 92:{
                ExtraFunctions.summonMobsNearby(new EntityHorse(worldIn), 35, worldIn, pos, rand);
				break;
			}case 93:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityEndermite(worldIn), 70,worldIn,pos);
				break;
			}case 94:{
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 50, worldIn, pos, rand);
				break;
			}case 95:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), 3,worldIn,pos);
				break;
			}case 96:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntitySkyDoesMinecraft(worldIn), 5,worldIn,pos);
				break;
			}case 97:{
                ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 20, worldIn, pos, rand);
				break;
			}case 98:{
				ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.bread, 20, 0, 0);
				break;
			}case 99:{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
				break;
			}case 100:{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
				break;
			}





		}//switch ends
	}//method end
}

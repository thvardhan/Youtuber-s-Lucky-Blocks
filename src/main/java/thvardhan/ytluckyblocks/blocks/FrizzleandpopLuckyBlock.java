package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
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

public class FrizzleandpopLuckyBlock extends Block {

	public FrizzleandpopLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public FrizzleandpopLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public FrizzleandpopLuckyBlock(String unlocalizedName) {
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
				ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn),rand.nextInt(5)+1,worldIn,pos);
				break;
			}
			case 1:
			{
				ExtraFunctions.summonMobsNearby(new EntityFrizzleandpop(worldIn), 25, worldIn, pos, rand);
				break;
			}
			case 2:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzBoots));
				break;
			}
			case 3:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzChestplate));
				break;
			}
			case 4:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzHelmet));

				break;
			}
			case 5:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzLeggings));
				break;
			}
			case 6:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_pickaxe));
				break;
			}
			case 7:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_pickaxe), new Enchantment[]{Enchantment.fortune,Enchantment.unbreaking}, 4, worldIn, pos);
				break;
			}
			case 8:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_chestplate));
				break;
			}
			case 9:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.beacon));
				break;
			}
			case 10:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.end_portal_frame), 8, 0, 0);
				break;
			}
			case 11:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.rabbit_stew), 10, 1, 50);
				break;
			}
			case 12:
			{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.ender_chest);
				break;
			}
			case 13:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.golden_apple), 4, 0, 0);
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.golden_apple,1,1), 2, 0, 0);
				break;
			}
			case 14:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_helmet));
				break;
			}
			case 15:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_leggings));
				break;
			}
			case 16:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_boots));
				break;
			}
			case 17:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.saddle));
				break;
			}
			case 18:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.dragon_egg));
				break;
			}
			case 19:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.cake));
				break;
			}
			case 20:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.quartz_block), 40, 1, 1);
				break;
			}
			case 21:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.flower_pot));
				break;
			}
			case 22:
			{
				ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 5, worldIn, pos, rand);break;
			}
			case 23:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.skull));
				break;
			}
			case 24:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.wooden_axe));
				break;
			}
			case 25:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.wooden_hoe));
				break;
			}
			case 26:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.wooden_pickaxe));
				break;
			}
			case 27:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.wooden_sword));
				break;
			}
			case 28:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.wooden_sword));
				break;
			}
			case 29:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
				break;
			}
			case 30:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGuardian(worldIn), 15,worldIn,pos);
				break;
			}
			case 31:
			{
				ExtraFunctions.summonMobsNearby(new EntityFrizzleandpop(worldIn), 15, worldIn, pos, rand);
				break;
			}
			case 32:
			{
				ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 5, worldIn, pos, rand);	break;
			}
			case 33:
			{
				ExtraFunctions.anvilRain(worldIn, pos);
				break;
			}
			case 34:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
				break;
			}
			case 35:
			{
				ExtraFunctions.randomSixtyFourTower(worldIn, pos,rand);
				break;
			}
			case 36:
			{
				ExtraFunctions.summonTammedWolfs(worldIn, player, 10,pos);
				break;
			}
			case 37:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.milk_bucket));
				break;
			}
			case 38:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.carrot_on_a_stick));
				break;
			}
			case 39:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.megaSword), e, 7, worldIn, pos);
				break;
			}
			case 40:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
				break;
			}
			case 41:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.blaze_rod));
				break;
			}
			case 42:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.frizzChestplate), 1, 0, 0);
				break;
			}
			case 43:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.slime_block), 40, 1, 1);
				break;
			}
			case 44:
			{
				ExtraFunctions.burgerStruct(worldIn, pos);
				break;
			}
			case 45:
			{
				ExtraFunctions.luckyBlockTower(worldIn, pos);
				break;
			}
			case 46:
			{
				ExtraFunctions.setHoleWithMites(worldIn,  player);
				break;
			}
			case 47:
			{
				ExtraFunctions.flyingIsle(worldIn, pos);
				break;
			}
			case 48:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
				break;
			}
			case 49:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.wooden_sword), new Enchantment[]{Enchantment.flame,Enchantment.fireAspect,Enchantment.sharpness,Enchantment.smite,Enchantment.baneOfArthropods}, 5, worldIn, pos);
				break;
			}
			case 50:
			{
				ExtraFunctions.redstoneKit(worldIn, pos);
				break;
			}
			case 51:{
				ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
				break;
			}
			case 52:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.tnt);
				worldIn.setBlockState(new BlockPos(pos.getX(),pos.getY(),pos.getZ()), Blocks.flowing_lava.getDefaultState());
				break;
			}
			case 53:{
				ExtraFunctions.chat( "YAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAY ^.^ (empty)", player);
				break;
			}
			case 54:{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
				break;
			}
			case 55:{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
				break;
			}case 56:{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.absorption.getId(),1000,10));
				break;
			}case 57:{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}case 58:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.bedrock);
				break;
			}case 59:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.obsidian), 40, 0, 0);
				break;
			}case 60:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.stained_glass), 40, 1, 50);
				break;
			}case 61:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
				break;
			}case 62:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
				break;
			}case 63:{
				ExtraFunctions.potionKit(worldIn, pos,rand);
				break;
			}case 64:{
				ExtraFunctions.orcArmy(worldIn, pos, 10, rand);
				break;
			}case 65:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}case 66:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}case 67:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}case 68:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
				break;
			}case 69:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.flint_and_steel));
				break;
			}case 70:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.monster_egg);
				break;
			}case 71:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.reeds));
				break;
			}case 72:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.redstone_ore);
				break;
			}case 73:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.glowstone);
				break;
			}case 74:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.flowing_lava);
				break;
			}case 75:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.baked_potato));
				break;
			}case 76:{
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.mic), e,4, worldIn, pos);
				ExtraFunctions.chat( "Is This God Mic?", player);
				break;
			}case 77:{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.end_portal_frame);
				break;
			}case 78:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.gold_block);
				break;
			}case 79:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.iron_block);
				break;
			}case 80:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.coal_block);
				break;
			}case 81:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.enchanting_table);
				break;
			}case 82:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 40,worldIn,pos);
				break;
			}case 83:{
				ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 25, worldIn, pos, rand);
				break;
			}case 84:{
				ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 50, worldIn, pos, rand);break;
			}case 85:{
				ExtraFunctions.burgerStructOne(worldIn, pos);
				break;
			}case 86:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityTruemu(worldIn), 10,worldIn,pos);
				break;
			}case 87:{
				ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 15, worldIn, pos, rand);break;
			}case 88:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.monster_egg));
				break;
			}case 89:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.frizzleandpopLuckyBlock));
				break;
			}case 90:{
				ExtraFunctions.hellWellStructure(worldIn, pos,rand);
				break;
			}case 91:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				break;
			}case 92:{
				ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 45, worldIn, pos, rand);break;
			}case 93:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 10,worldIn,pos);
				break;
			}case 94:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
				break;
			}case 95:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.apple), 64, 1, 40);
				break;
			}case 96:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.bedrock), 64, 1, 40);
				break;
			}case 97:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.redstone), 120, 0, 0);
				break;
			}case 98:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.arrow));
				break;
			}case 99:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.sponge));
				break;
			}case 100:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.gold_ingot));
				break;
			}





		}//switch ends
	}//method end
}

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
import net.minecraft.entity.passive.EntityRabbit;
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
import thvardhan.ytluckyblocks.entity.*;

public class JeromeASFLuckyBlock extends Block {

	public JeromeASFLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public JeromeASFLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public JeromeASFLuckyBlock(String unlocalizedName) {
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

		Enchantment[] e=new Enchantment[7];
		e[0]=Enchantment.flame;
		e[2]=Enchantment.power;
		e[3]=Enchantment.thorns;
		e[4]=Enchantment.looting;
		e[5]=Enchantment.sharpness;
		e[6]=Enchantment.blastProtection;
		e[1]=Enchantment.baneOfArthropods;

		Random rand = new Random();


		switch(rand.nextInt(101)){

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
				ExtraFunctions.setHoleWithMites(worldIn, player);
				break;
			}
			case 4:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.diamond_block);
				break;
			}
			case 5:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.gold_block);
				break;
			}
			case 6:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.moveSlowdown.getId(),2000,200,true,true));
				break;
			}
			case 7:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.jump.getId(),100,200,true,true));
				ExtraFunctions.chat( EnumChatFormatting.RED+"Hurry! JUMP! here will be lava in 2 seconds", player);
				break;
			}
			case 8:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.poison.getId(),1000,20,true,true));
				break;
			}
			case 9:
			{
				player.setDead();
				break;
			}
			case 10:
			{
				ExtraFunctions.burgerStruct(worldIn, pos);
				break;
			}
			case 11:
			{
				ExtraFunctions.burgerStructOne(worldIn, pos);
				break;
			}
			case 12:
			{
				ExtraFunctions.holeDeathTrap(worldIn, pos);
				break;
			}
			case 13:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 14:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordBlack), e, 9, worldIn, pos);
				break;
			}
			case 15:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_hoe), new Enchantment[]{Enchantment.knockback}, 4, worldIn, pos);
				break;
			}
			case 16:
			{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}
			case 17:
			{
				ExtraFunctions.luckyBlockTower(worldIn, pos);
				break;
			}
			case 18:
			{
				ExtraFunctions.musicKit(worldIn, pos);
				break;
			}
			case 19:
			{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.blindness.getId(),1400,50,true,true));
				break;
			}
			case 20:
			{
				ExtraFunctions.summonBlockWithLoop(worldIn, pos, ModBlocks.alexircraftLuckyBlock, 5, 0, 0);
				break;
			}
			case 21:
			{
				ExtraFunctions.toVoid(worldIn, pos);
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
				ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 50, worldIn, pos, rand);
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
				ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 23, worldIn, pos, rand);
				break;
			}
			case 37:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), new Enchantment[]{Enchantment.sharpness}, rand.nextInt(50)+40, worldIn, pos);
				break;
			}
			case 38:
			{
				ExtraFunctions.potionKit(worldIn, pos,rand);
				break;
			}
			case 39:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn),rand.nextInt(5)+1,worldIn,pos);
				break;
			}
			case 40:
			{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.apple), 40, 0, 0);
				ExtraFunctions.chat( EnumChatFormatting.GOLD+"Normal Apples ^^", player);
				break;
			}
			case 41:
			{
				ExtraFunctions.randomSixtyFourTower(worldIn, pos,rand);
				break;
			}
			case 42:
			{
				ExtraFunctions.redstoneKit(worldIn, pos);
				break;
			}
			case 43:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn),rand.nextInt(10)+1,worldIn,pos);
				break;
			}
			case 44:
			{
				ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 6, worldIn, pos, rand);
				break;
			}
			case 45:
			{
				ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 200, worldIn, pos, rand);
				break;
			}
			case 46:
			{
				ExtraFunctions.summonCowNearby(worldIn, pos, 100, rand);
				break;
			}
			case 47:
			{
				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}
			case 48:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.frizzleandpopLuckyBlock);
				break;
			}
			case 49:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 60,worldIn,pos);
				break;
			}
			case 50:
			{
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordLogdotzip), e, 7, worldIn, pos);
				break;
			}
			case 51:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeHelmet));
				break;
			}
			case 52:{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.jeromeBoots, "Boots", Enchantment.protection, 5);
				break;
			}
			case 53:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeChestplate));
				break;
			}
			case 54:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeLeggings));
				break;
			}
			case 55:{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.snowSword, "Icy", Enchantment.smite, 10);
				break;
			}case 56:{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.megaSword, "MegaKilla", Enchantment.sharpness, 6);
				break;
			}case 57:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
				break;
			}case 58:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
				break;
			}case 59:{
				ExtraFunctions.mountainOne(worldIn, pos,rand);
				break;
			}case 60:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.milk_bucket),50, 1, 2);
				ExtraFunctions.chat( "Use these to clean any bad effects you get while opening these lucky blocks", player);
				break;
			}case 61:{
				ExtraFunctions.tntFix(worldIn, pos, 5, player);
				break;
			}case 62:{
				ExtraFunctions.summonTammedWolfs(worldIn, player, 5,pos);
				break;
			}case 63:{
				ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 60, worldIn, pos, rand);
				break;
			}case 64:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.baked_potato));
				ExtraFunctions.chat( "Here, take this one potato (which you cant even plant :v) for your efforts", player);
				break;
			}case 65:{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.poisonous_potato, "Eat Me!", Enchantment.knockback, 50);
				break;
			}case 66:{
				ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.fireResistance.getId(),1000,20));
				break;
			}case 67:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.golden_apple,1,1));
				break;
			}case 68:{
				ExtraFunctions.addRandomEnchtToRandomItems(worldIn, new ItemStack[]{new ItemStack(ModItems.jeromeBoots),new ItemStack(ModItems.jeromeChestplate)}, e, 5, pos,rand);
				break;
			}case 69:{
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.jeromeChestplate), e, 10, worldIn, pos);
				break;
			}case 70:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				break;
			}case 71:{
				ExtraFunctions.hellWellStructure(worldIn, pos,rand);
				break;
			}case 72:{
				ExtraFunctions.holeDeathTrap(worldIn, pos);
				break;
			}case 73:{
				EntityRabbit rab=new EntityRabbit(worldIn);
				rab.setRabbitType(99);
				ExtraFunctions.summonMobsOnBreakBlock(rab, 60,worldIn,pos);
				break;
			}case 74:{
				ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 50, worldIn, pos, rand);
				break;
			}case 75:{
				ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 25, worldIn, pos, rand);
				break;
			}case 76:{
				ExtraFunctions.potionKit(worldIn, pos,rand);
				break;
			}case 77:{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_sword, "I AM NOT DIAMOND", Enchantment.sharpness, rand.nextInt(50)+1);
				break;
			}case 78:{
				ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 15, worldIn, pos, rand);
				break;
			}case 79:{
				ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 5, worldIn, pos, rand);break;
			}case 80:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.youtubeLuckyBlock));
				break;
			}case 81:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.alexircraftLuckyBlock);
				break;
			}case 82:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.water);
				break;
			}case 83:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.enchanting_table);
				break;
			}case 84:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 10,worldIn,pos);
				break;
			}case 85:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeLeggings));
				break;
			}case 86:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeHelmet));
				break;
			}case 87:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 60,worldIn,pos);
				break;
			}case 88:{
				ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
				ExtraFunctions.chat( "KILL THE COW", player);
				break;
			}case 89:{
				ExtraFunctions.summonCowNearby(worldIn, pos, 10 , rand);
				break;
			}case 90:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.tnt), 64, 1, 5);
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.flint_and_steel));
				break;
			}case 91:{
				ExtraFunctions.lookUp(worldIn,  player);
				break;
			}case 92:{
				ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.snowSword), e, 5, worldIn, pos);
				break;
			}case 93:{
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.bed), new Enchantment[]{Enchantment.sharpness,Enchantment.knockback}, 4, worldIn, pos);
				break;
			}case 94:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.cake));
				break;
			}case 95:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.dragon_egg));
				break;
			}case 96:{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.bedrock));
				break;
			}case 97:{
				ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.obsidian), 64, 1, 50);
				break;
			}case 98:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), 1,worldIn,pos);
				break;
			}case 99:{
				ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 15, worldIn, pos, rand);break;
			}case 100:{
				ExtraFunctions.sandRain(worldIn, player);
				break;
			}





		}//switch ends
	}//method end
}

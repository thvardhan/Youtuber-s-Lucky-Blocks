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
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
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

public class PrestonPlayzLuckyBlock extends Block {

	public PrestonPlayzLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public PrestonPlayzLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public PrestonPlayzLuckyBlock(String unlocalizedName) {
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
			worldIn.spawnParticle(EnumParticleTypes.SPELL_MOB, d0, d1, d2, d3, d4, d5, new int[0]);
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
				ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 35, worldIn, pos, rand);
				break;
			}case 10:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn),rand.nextInt(50)+1,worldIn,pos);
				break;
			}case 11:{
				ExtraFunctions.orcArmy(worldIn, pos, 0, rand);
				break;
			}case 12:{
				ExtraFunctions.summonMobsNearby(new EntityPrestonPlayz(worldIn), 35, worldIn, pos, rand);
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
				ExtraFunctions.summonMobsNearby(new EntityPrestonPlayz(worldIn), 5, worldIn, pos, rand);break;
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
				ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), rand.nextInt(10)+1, worldIn, pos, rand);break;
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
				Enchantment[] ea={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_boots), ea, 8, worldIn, pos);
				break;
			}case 37:{Enchantment[] ea={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};

				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_leggings), ea, 5, worldIn, pos);

				break;
			}case 38:{Enchantment[] ea={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_chestplate), ea, 4, worldIn, pos);

				break;
			}case 39:{Enchantment[] ea={Enchantment.fireAspect,Enchantment.aquaAffinity,Enchantment.fireProtection,Enchantment.protection,Enchantment.respiration,Enchantment.projectileProtection,Enchantment.blastProtection};

				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_helmet), ea, 6, worldIn, pos);
				break;
			}case 40:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), 5,worldIn,pos);
				break;
			}
			case 41:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Boots));
				break;
			}
			case 42:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Chestplate));
				break;
			}
			case 43:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Helmet));
				break;
			}
			case 44:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Leggings));
				break;
			}
			case 45:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Helmet));
				break;
			}
			case 46:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Chestplate));
				break;
			}
			case 47:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Leggings));
				break;
			}
			case 48:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.preston_Boots));
				break;
			}
			case 49:
			{
				ExtraFunctions.parabolaStruct(worldIn, pos);
				break;
			}
			case 50:
			{
				ExtraFunctions.sandRain(worldIn, player);
				break;
			}
			case 51:{
				ExtraFunctions.slimeFort(worldIn,  player);
				break;
			}
			case 52:{
				ExtraFunctions.saflyTeleportPlayer(worldIn, player);
				break;
			}
			case 53:{
				ExtraFunctions.tntFix(worldIn, pos, 100, player);
				break;
			}
			case 54:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.captainSparkelzLuckyBlock);
				break;
			}
			case 55:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
				break;
			}case 56:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.sSundeeLuckyBlock);
				break;
			}case 57:{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.lDShadowLadyLuckyBlock);
				break;
			}case 58:{
				ExtraFunctions.anvilRain(worldIn, pos);
				break;
			}case 59:{
				ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
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
				ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 51, worldIn, pos, rand);
				break;
			}case 84:{
				ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 70, worldIn, pos, rand);
				break;
			}case 85:{
				ExtraFunctions.burgerStructOne(worldIn, pos);
				break;
			}case 86:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityTruemu(worldIn), 10,worldIn,pos);
				break;
			}case 87:{
				ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 25, worldIn, pos, rand);
				break;
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
				ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 51, worldIn, pos, rand);
				break;
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
				break;}





		}//switch ends
	}//method end
}

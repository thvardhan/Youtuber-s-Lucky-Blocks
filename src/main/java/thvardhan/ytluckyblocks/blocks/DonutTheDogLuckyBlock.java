package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityDonutTheDog;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.entity.EntityThnxCya;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityCreeper;
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

public class DonutTheDogLuckyBlock extends Block {


	public DonutTheDogLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(0F);
	}

	public DonutTheDogLuckyBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, 0, 10000);
	}

	public DonutTheDogLuckyBlock(String unlocalizedName) {
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
				ExtraFunctions.lookUp(worldIn, player);
				break;
			}
			case 0:{

				ExtraFunctions.lookUp(worldIn, player);
				break;
			}
			case 1:{
				ExtraFunctions.foodKit(worldIn, pos);
				break;
			}
			case 2:{
				ExtraFunctions.chat( EnumChatFormatting.BLACK+"Special Troll",player);
				break;
			}
			case 3:{
				Enchantment[] e1={Enchantment.protection,Enchantment.fireProtection,Enchantment.blastProtection,Enchantment.featherFalling,Enchantment.fireProtection};
				ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_boots), e1, 5, worldIn, pos);
				break;
			}case 4:{
				ExtraFunctions.materialKit(worldIn, pos,rand);
				break;
			}case 5:{
				ExtraFunctions.tntFix(worldIn, pos, 64, player);
				break;
			}case 6:{
				ExtraFunctions.burgerStruct(worldIn, pos);
				break;
			}case 7:{
				ExtraFunctions.materialKit(worldIn, pos,rand);
				break;
			}case 8:{
				ExtraFunctions.holeDeathTrap(worldIn, pos);
				break;
			}case 9:{
				ExtraFunctions.endWellStruct(worldIn, pos,rand);
				break;
			}case 10:{
				ExtraFunctions.hellWellStructure(worldIn, pos,rand);
				break;
			}case 11:{
				ExtraFunctions.orcArmy(worldIn, pos, 20, rand);
				break;
			}case 12:{
				ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.golden_apple, 15, 1, 5);
				break;
			}
			case 13:
			{
				ExtraFunctions.fireCamp(worldIn, player);
				break;
			}
			case 14:
			{
				ExtraFunctions.tntPlaceNearby(worldIn, pos, 700,rand);
				break;
			}
			case 15:
			{
				ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 35, worldIn, pos, rand);
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
				ExtraFunctions.summonMobsOnBreakBlock(new EntitySkeleton(worldIn),10,worldIn,pos);
				break;
			}
			case 21:
			{
				ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.mic);
				break;
			}
			case 22:
			{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_boots, EnumChatFormatting.BLUE+"Log.zip Not So Lucky Boots", Enchantment.featherFalling, 30);
				break;
			}
			case 23:
			{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_chestplate, EnumChatFormatting.BLUE+"Log.zip Not So Lucky Chestplate", Enchantment.thorns, 10);
				break;
			}
			case 24:
			{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_leggings, EnumChatFormatting.BLUE+"Log.zip Not So Lucky Leggings", Enchantment.blastProtection,6);
			}
			case 25:
			{
				ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_helmet, EnumChatFormatting.BLUE+"Log.zip Not So Lucky Helmet", Enchantment.projectileProtection, 15);
				break;
			}
			case 26:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.beacon));
				break;
			}
			case 27:
			{
				ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
				break;
			}
			case 28:
			{
				ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
				break;
			}
			case 29:
			{
				ExtraFunctions.slimeFort(worldIn,  player);
				break;
			}
			case 30:
			{
				ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
				break;
			}
			case 31:
			{
				ExtraFunctions.summonMobsNearby(new EntityThnxCya(worldIn), 35, worldIn, pos, rand);
				break;
			}
			case 32:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutHelmet));
				break;
			}
			case 33:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutLeggings));
				break;
			}
			case 34:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutChestplate));
				break;
			}
			case 35:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutBoots));
				break;
			}
			case 36:
			{
				ExtraFunctions.tntFix(worldIn, pos, 50, player);
				break;
			}
			case 37:
			{
				ExtraFunctions.tntNearby(worldIn, pos, 200, player,rand);
				break;
			}
			case 38:
			{
				ExtraFunctions.tntRain(worldIn, pos, 10, 1, player);
				break;
			}
			case 39:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
				break;
			}
			case 40:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
				break;
			}
			case 41:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
				break;
			}
			case 42:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
				break;
			}
			case 43:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
				break;
			}
			case 44:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
				break;
			}
			case 45:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
				break;
			}
			case 46:
			{
				ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 50, worldIn, pos, rand);break;
			}
			case 47:
			{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityDonutTheDog(worldIn), 40,worldIn,pos);
				break;
			}
			case 48:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
				break;
			}
			case 49:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
				break;
			}
			case 50:
			{
				ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
				break;
			}



		}//switch ends
	}//method end
}

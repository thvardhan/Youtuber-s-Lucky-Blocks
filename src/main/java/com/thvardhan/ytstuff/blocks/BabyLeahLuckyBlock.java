package com.thvardhan.ytstuff.blocks;

import java.util.Random;

import com.thvardhan.ytstuff.CommonProxy;
import com.thvardhan.ytstuff.entity.EntityBabyLeah;
import com.thvardhan.ytstuff.entity.EntityDanTDM;
import com.thvardhan.ytstuff.entity.EntityExplodingTNT;
import com.thvardhan.ytstuff.entity.EntityGhost;
import com.thvardhan.ytstuff.functions.ExtraFunctions;
import com.thvardhan.ytstuff.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BabyLeahLuckyBlock extends Block {
	
	
	public BabyLeahLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }
	
	public BabyLeahLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public BabyLeahLuckyBlock(String unlocalizedName) {
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
    	ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.leahBoots));
    	break;
    	}
    	case 1:
    	{
    	ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.leahChestplate));
    	break;
    	}
      	case 2:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.leahHelmet));
    	break;
    	}
      	case 3:
    	{
    	ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.leahLeggings));
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
    		ExtraFunctions.tntNearby(worldIn, pos, 300, player,rand);
    	break;
    	}
      	case 9:
    	{
    		ExtraFunctions.summonCowNearby(worldIn, pos, 10,rand);
    	break;
    	}
      	case 10:
    	{
    ExtraFunctions.luckyBlockBox(worldIn, pos,rand);
    	break;
    	}
      	case 11:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityBabyLeah(worldIn),30,worldIn,pos);
    	break;
    	}
      	case 12:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityChicken(worldIn),40,worldIn,pos);
    	break;
    	}
      	case 13:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
    	break;
    	}
      	case 14:
    	{

			ExtraFunctions.summonMobsOnBreakBlock(new EntityExplodingTNT(worldIn),20,worldIn,pos);
    	    	break;
    	}
      	case 15:
    	{
    		ExtraFunctions.setHoleWithMites(worldIn, player);
    	break;
    	}
      	case 16:
    	{
    		ExtraFunctions.deathHole(worldIn, player);
    	break;
    	}
      	case 17:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
    	break;
    	}
      	case 18:
    	{
			EntityRabbit rab=new EntityRabbit(worldIn);
			rab.setRabbitType(99);
			ExtraFunctions.summonMobsOnBreakBlock(rab,30,worldIn,pos);
    	break;
    	}
      	case 19:
    	{
    		ExtraFunctions.towerStruct(worldIn, pos);
    	break;
    	}
      	case 20:
    	{
    		ExtraFunctions.randomSixtyFourTower(worldIn, pos,rand);
    	break;
    	}
      	case 21:
    	{
			ExtraFunctions.summonMobsNearby(new EntityGhast(worldIn), 30, worldIn, pos, rand);
    	break;
    	}
      	case 22:
    	{
    		ExtraFunctions.lookUp(worldIn, player);
    	break;
    	}
      	case 23:
    	{
    		ExtraFunctions.saflyTeleportPlayer(worldIn, player);
    	break;
    	}
      	case 24:
    	{
    		ExtraFunctions.tpPlayer(player);
    	break;
    	}
      	case 25:{
			ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.wooden_sword, EnumChatFormatting.BLUE+"Mama", Enchantment.featherFalling, 100);
			break;    			
		}case 26:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn),3,worldIn,pos);
			break;    			
		}case 27:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityBabyLeah(worldIn),10,worldIn,pos);
			break;    			
		}case 28:{
			ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
			break;    			
		}case 29:{
			ExtraFunctions.setOneBlock(worldIn, pos, Blocks.cake);
			break;    			
		}case 30:{
			ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.iron_block);
			break;    			
		}case 31:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityBabyLeah(worldIn),6,worldIn,pos);
			break;    			
		}case 32:{
				EntityRabbit rab=new EntityRabbit(worldIn);
				rab.setRabbitType(99);
				ExtraFunctions.summonMobsOnBreakBlock(rab,30,worldIn,pos);
			break;    			
		}case 33:{
			ExtraFunctions.burgerStruct(worldIn, pos);
			break;    			
		}case 34:{
			ExtraFunctions.foodKit(worldIn, pos);
			break;    			
		}case 35:{
			ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.cake);
			break;    			
		}case 36:{
			ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.dragon_egg);
			break;    			
		}case 37:{
			ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.bed);
			break;    			
		}case 38:{
			ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
			break;    			
		}case 39:{
			ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
			break;    			
		}case 40:{
			ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
			break;    			
		}case 41:{
			ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
			break;    			
		}case 42:{
			ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.diamond, 64, 0, 0);
			break;    			
		}case 43:{
			ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.gold_block),55, 1, 5);
			break;    			
		}case 44:{
			ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.emerald), 54, 0, 0);
			break;    			
		}case 45:{
			ExtraFunctions.trollChat(player);
			break;    			
		}case 46:{
			ExtraFunctions.summonItemStackWithLoop(worldIn,pos,new ItemStack(ModBlocks.antVenomLuckyBlock),5,0,0);

			break;    			
		}case 47:{
			ExtraFunctions.redstoneKit(worldIn, pos);
			break;    			
		}case 48:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntitySkeleton(worldIn),10,worldIn,pos);

				break;
		}case 49:{
			ExtraFunctions.materialKit(worldIn, pos,rand);
			break;    			
		}case 50:{
				ExtraFunctions.summonMobsOnBreakBlock(new EntityBabyLeah(worldIn),35,worldIn,pos);

				break;
		}

		
    	}//switch ends
    }//method end
		

}

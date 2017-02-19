package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityBlaze;
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
import thvardhan.ytluckyblocks.entity.*;

public class BabyDuckLuckyBlock extends Block {
	
	
	public BabyDuckLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }
	
	public BabyDuckLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public BabyDuckLuckyBlock(String unlocalizedName) {
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
    	
		
    	switch(rand.nextInt(55)){
		
    	default:{
        	ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e,5, worldIn, pos);}
    	case 0:
    	{
    	ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e,5, worldIn, pos);
    	
    	break;
    	}
    	case 1:
    	{
    	ExtraFunctions.mountain(worldIn, pos,rand);
    	
    	break;
    	}
      	case 2:
    	{
    	ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
    
    	break;
    	}
      	case 3:
    	{
			ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 20, worldIn, pos, rand);
    	
    	break;
    	}
      	case 4:
    	{
			ExtraFunctions.summonMobsNearby(new EntityCaptainSparklez(worldIn), 5, worldIn, pos, rand);
    
    	break;
    	}
      	case 5:
    	{
    	ExtraFunctions.endWellStruct(worldIn, pos,rand);
    
    	break;
    	}
      	case 6:
    	{
    	ExtraFunctions.hellWellStructure(worldIn, pos,rand);
  
    	break;
    	}
      	case 7:
    	{
    	ExtraFunctions.redstoneKit(worldIn, pos);
  
    	break;
    	}
      	case 8:
    	{
    	ExtraFunctions.foodKit(worldIn, pos);
  
    	break;
    	}
      	case 9:
    	{
    	ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytBoots), 1, 0, 0);
  
    	break;
    	}
      	case 10:
    	{
    
        	ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytChestplate), 1, 0, 0);
    	break;
    	}
      	case 11:
    	{
  
        	ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytLeggings), 1, 0, 0);
    	break;
    	}
      	case 12:
    	{
    		ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytHelmet), 1, 0, 0);
    	break;
    	}
      	case 13:
    	{
    		ExtraFunctions.summonMobsOnBreakBlock(new EntityBlaze(worldIn),5,worldIn, pos);
    	break;
    	}
      	case 14:
    	{
			ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 15, worldIn, pos, rand);
    	break;
    	}
      	case 15:
    	{
    		ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
    	break;
    	}
      	case 16:
    	{
    		ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 1, 0, 0);
    	break;
    	}
      	case 17:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn),1,worldIn,pos);
    	break;
    	}
      	case 18:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityPopularMMO(worldIn),5,worldIn,pos);
    	break;
    	}
      	case 19:
    	{
    		ExtraFunctions.chat("Something Is Not Right Here....", player);
    	break;
    	}
      	case 20:
    	{
    		ExtraFunctions.chat("Something Is Not Right Here....", player);
    		ExtraFunctions.materialKit(worldIn, pos,rand);
    	break;
    	}
      	case 21:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn),rand.nextInt(10)+1,worldIn,pos);
    	break;
    	}
      	case 22:
    	{
    		ExtraFunctions.tpPlayer(player);
    		ExtraFunctions.chat("Fresh Air :'D", player);
    	break;
    	}
      	case 23:
    	{
    		ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.dragon_egg), 50, 1, 5);
    		ExtraFunctions.chat("How Are You Going To Train These Many Dragons?", player);
    	break;
    	}
      	case 24:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn),2,worldIn,pos);
    	break;
    	}
      	case 25:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn),rand.nextInt(10),worldIn,pos);
    	break;
    	}
      	case 26:
    	{
    		ExtraFunctions.endWellStruct(worldIn, pos,rand);
    	break;
    	}
      	case 27:
    	{
    		ExtraFunctions.burgerStruct(worldIn, pos);	
    	break;
    	}
      	case 28:
    	{
    		ExtraFunctions.setOneBlock(worldIn, pos, Blocks.command_block);
    		ExtraFunctions.chat(EnumChatFormatting.GOLD+"I Wonder If You Can Do Anything With This Command Block..", player);
    	break;
    	}
      	case 29:
    	{
    		ExtraFunctions.toVoid(worldIn, pos);
    	break;
    	}
      	case 30:
    	{
    		ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.melon_block), 25, 0, 0);
    	break;
    	}
      	case 31:
    	{
    		ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.pumpkin), 25, 0, 0);
    	break;
    	}
      	case 32:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntitySerialPlayer(worldIn),30,worldIn,pos);
    	break;
    	}
      	case 33:
    	{
    		ExtraFunctions.materialKit(worldIn, pos,rand);
    	break;
    	}
      	case 34:
    	{
    		ItemStack[] i= {new ItemStack(Items.apple),new ItemStack(Items.arrow),new ItemStack(Items.baked_potato)
    				,new ItemStack(Items.blaze_powder),new ItemStack(Items.map),new ItemStack(Items.diamond_axe),
    				new ItemStack(Items.diamond_horse_armor)};
    		ExtraFunctions.addRandomEnchtToRandomItems(worldIn, i, e, 8, pos,rand);
    	break;
    	}
      	case 35:
    	{
    		ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.baked_potato, 50, 1, 10);
    		ExtraFunctions.chat("ItS PoTaT RaIn!", player);
    	break;
    	}
      	case 36:
    	{
    		ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.iron_axe), 5, 1, 50);
    	break;
    	}
      	case 37:
    	{
    		ExtraFunctions.orcArmy(worldIn, pos, rand.nextInt(50),rand);
    	break;
    	}
      	case 38:
    	{
    		ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordLogdotzip), e, 8, worldIn, pos);
    	break;
    	}
      	case 39:
    	{
    		ExtraFunctions.redstoneKit(worldIn, pos);
    	break;
    	}
      	case 40:
    	{
    		ExtraFunctions.foodKit(worldIn, pos);
    	break;
    	}
      	case 41:
    	{
    		ExtraFunctions.hellWellStructure(worldIn, pos,rand);
    	break;
    	}
      	case 42:
    	{
    		ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
    	break;
    	}
      	case 43:
    	{
    		ExtraFunctions.lookUp(worldIn,player);
    	break;
    	}
      	case 44:
    	{
    		ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.captainSparkelzLuckyBlock);
    	break;
    	}
      	case 45:
    	{
    		ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
    	break;
    	}
      	case 46:
    	{
    		ExtraFunctions.setOneBlock(worldIn, pos, Blocks.tnt);
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.flint_and_steel));
    	break;
    	}
      	case 47:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityBabyDuck(worldIn),30,worldIn,pos);
    	break;
    	}
      	case 48:
    	{
    		ExtraFunctions.endWellStruct(worldIn, pos,rand);
    	break;
    	}
      	case 49:
    	{
    		ExtraFunctions.holeDeathTrap(worldIn, pos);
    	break;
    	}
      	case 50:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityBabyDuck(worldIn),40,worldIn,pos);
    	break;
    	}
		case 51:{
		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.duckBoots));
			break;
		}
		case 52:{
		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.duckChestplate));
			break;
		}
		case 53:{
		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.duckHelmet));
		break;	
		}
		case 54:{
		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.duckLeggings));
			break;
		}
    	}
    	}
		
		
    
    
}

package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityBabyMax;
import thvardhan.ytluckyblocks.entity.EntityIhasCupquake;
import thvardhan.ytluckyblocks.entity.EntityJeromeASF;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BabyMaxLuckyBlock extends Block {
	
	public BabyMaxLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }
	
	public BabyMaxLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public BabyMaxLuckyBlock(String unlocalizedName) {
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
    	ExtraFunctions.fireCamp(worldIn, player);
    	break;
    	}
    	case 1:
    	{
			ExtraFunctions.summonMobsNearby(new EntityGhast(worldIn), 15, worldIn, pos, rand);
    	break;
    	}
      	case 2:
    	{
    	ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
    	break;
    	}
      	case 3:
    	{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.anvil);
    	break;
    	}
      	case 4:
    	{
    		ExtraFunctions.luckyBlockTower(worldIn, pos);
    	break;
    	}
      	case 5:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.maxBoots));
    	break;
    	}
      	case 6:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.maxChestplate));
    	break;
    	}
      	case 7:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.maxHelmet));
    	break;
    	}
      	case 8:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.maxLeggings));
    	break;
    	}
      	case 9:
    	{
    		ExtraFunctions.fireCamp(worldIn, player);
    	break;
    	}
      	case 10:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
    	break;
    	}
      	case 11:
    	{
    		ExtraFunctions.setTntWithBlock(worldIn, pos,rand);
    	break;
    	}
      	case 12:
    	{
			ExtraFunctions.summonMobsNearby(new EntitySquid(worldIn), 125, worldIn, pos, rand);
    	break;
    	}
      	case 13:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityBabyMax(worldIn),10,worldIn,pos);
    	break;
    	}
      	case 14:
    	{
    		ExtraFunctions.materialKit(worldIn, pos,rand);
			break;
    	}
      	case 15:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityChicken(worldIn),30,worldIn,pos);
    	break;
    	}
      	case 16:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
    	break;
    	}
      	case 17:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
    	break;
    	}
      	case 18:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
    	break;
    	}
      	case 19:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
    	break;
    	}
      	case 20:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
    	break;
    	}
      	case 21:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityJeromeASF(worldIn),30,worldIn,pos);
    	break;
    	}
      	case 22:
    	{
    		ExtraFunctions.fireCamp(worldIn, player);
    	break;
    	}
      	case 23:
    	{
    		ExtraFunctions.tornadoStruct(worldIn, pos,rand);
    	break;
    	}
      	case 24:
    	{
    		ExtraFunctions.tpPlayer(player);
    	break;
    	}
      	case 25:
    	{
    		ExtraFunctions.deathHole(worldIn, player);
    	break;
    	}
      	case 26:
    	{
    		ExtraFunctions.luckyBlockBox(worldIn, pos,rand);
    	break;
    	}
      	case 27:
    	{
    		ExtraFunctions.luckyBlockTower(worldIn, pos);
    	break;
    	}
      	case 28:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
    	break;
    	}
      	case 29:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityIhasCupquake(worldIn),10,worldIn,pos);
    	break;
    	}
      	case 30:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
    	break;
    	}
      	case 31:
    	{
    		ExtraFunctions.summonTammedWolfs(worldIn, player, 40,pos);
    	break;
    	}
      	case 32:
    	{
    		ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos,ModItems.maxBoots, "AAAA!!", Enchantment.protection, 100);
    	break;
    	}
      	case 33:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityGuardian(worldIn),30,worldIn,pos);
    	break;
    	}
      	case 34:
    	{
    		EntityGuardian a=new EntityGuardian(worldIn);
			a.setElder();
			ExtraFunctions.summonMobsOnBreakBlock(a,30,worldIn,pos);
    	break;
    	}
      	case 35:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
    	break;
    	}
      	case 36:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
    	break;
    	}
      	case 37:
    	{
    		ExtraFunctions.toVoid(worldIn, pos);
    	break;
    	}
      	case 38:
    	{
			ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn),30,worldIn,pos);
    	break;
    	}
      	case 39:
    	{
    		ExtraFunctions.summonCowNearby(worldIn, pos, 20,rand);
    	break;
    	}
      	case 40:
    	{
    		ExtraFunctions.summonCowNearby(worldIn, pos, 20, rand);
    	break;
    	}
      	case 41:
    	{
    		ExtraFunctions.slimeFort(worldIn,player);
    	break;
    	}
      	case 42:
    	{
			ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 35, worldIn, pos, rand);
    	break;
    	}
      	case 43:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.potionitem));
    	break;
    	}
      	case 44:
    	{
    		ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
    	break;
    	}
      	case 45:
    	{
			ExtraFunctions.summonMobsNearby(new EntityBabyMax(worldIn), 55, worldIn, pos, rand);
    	break;
    	}
      	case 46:
    	{
    		ExtraFunctions.mountain(worldIn, pos,rand);
    	break;
    	}
      	case 47:
    	{
			ExtraFunctions.summonMobsNearby(new EntityBabyMax(worldIn), 40, worldIn, pos, rand);
    	break;
    	}
      	case 48:
    	{
			ExtraFunctions.summonMobsNearby(new EntityBabyMax(worldIn), 15, worldIn, pos, rand);
    	break;
    	}
      	case 49:
    	{
    		ExtraFunctions.redstoneKit(worldIn, pos);
    	break;
    	}
      	case 50:
    	{
    		ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.bone, 20, 1,2);
    	break;
    	}
		

		
    	}//switch ends
    }//method end
		

}

package thvardhan.ytluckyblocks.items;

import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.CommonProxy;

public class DevilSword extends ItemSword {

    public DevilSword(String string, ToolMaterial devil) {
        super(devil);
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);


    }

	
	/*	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity player, int itemSlot, boolean isSelected) {
	if(isSelected){
		Random rand=new Random();
		
	//	if(w.isRemote)
	//	{
		//	World w=Minecraft.getMinecraft().theWorld;

			  for (int i = 0; i < 3; ++i)
		        {
		            int j = rand.nextInt(2) * 2 - 1;
		            int k = rand.nextInt(2) * 2 - 1;
		            double d0 = (double)player.posX + 0.5D + 0.25D * (double)j;
		            double d1 = (double)((float)player.posY + rand.nextFloat());
		            double d2 = (double)player.posZ + 0.5D + 0.25D * (double)k;
		            double d3 = (double)(rand.nextFloat() * (float)j);
		            double d4 = ((double)rand.nextFloat() - 0.5D) * 0.125D;
		            double d5 = (double)(rand.nextFloat() * (float)k);
	//	            w.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5, new int[0]);
		        }
			 
			
	//	}
	//	else
				
		super.onUpdate(stack, worldIn, player, itemSlot, isSelected);
	}
	}*/


}

package thvardhan.ytluckyblocks.items;

import java.util.List;

import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class NastySword extends ItemSword {

	public NastySword(String string, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(string);
		this.setCreativeTab(CommonProxy.tabYTStuffMod);
			
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		ItemStack s=new ItemStack(this);
		s.addEnchantment(Enchantment.fireAspect, 60);
		subItems.add(s);
	
	}


}

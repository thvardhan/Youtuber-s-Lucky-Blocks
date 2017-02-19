package thvardhan.ytluckyblocks.items;

import thvardhan.ytluckyblocks.CommonProxy;

import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor {

	public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(CommonProxy.tabYtStuffArmor);
        this.setUnlocalizedName(unlocalizedName);
    }
	
	
	
	
	
	

}

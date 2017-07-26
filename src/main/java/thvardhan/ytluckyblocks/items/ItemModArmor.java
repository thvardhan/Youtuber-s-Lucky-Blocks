package thvardhan.ytluckyblocks.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import thvardhan.ytluckyblocks.init.ModTabs;
import thvardhan.ytluckyblocks.proxy.CommonProxy;

public class ItemModArmor extends ItemArmor {

    public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(ModTabs.tabYtStuffArmor);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
    }


}

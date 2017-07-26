package thvardhan.ytluckyblocks.items;

import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.init.ModTabs;

public class NastySword extends ItemSword {


    public NastySword(String string, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setCreativeTab(ModTabs.tabYTStuffMod);
    }

    /*@Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {

            ItemStack s = new ItemStack(this);
            s.addEnchantment(Enchantment.getEnchantmentByID(20), 60);
            items.add(s);

    }*/


}

package thvardhan.ytluckyblocks.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentFireAspect;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;
import thvardhan.ytluckyblocks.CommonProxy;

import java.util.List;

public class NastySword extends ItemSword {

    public NastySword(String string, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);

    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
        ItemStack s = new ItemStack(this);
        s.addEnchantment(Enchantment.getEnchantmentByID(20), 60);
        subItems.add(s);

    }


}

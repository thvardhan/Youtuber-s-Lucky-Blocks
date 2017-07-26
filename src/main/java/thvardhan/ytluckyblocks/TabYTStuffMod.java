package thvardhan.ytluckyblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.init.ModItems;

/**
 * Created by patrick on 25/07/2017.
 */
public class TabYTStuffMod extends CreativeTabs {

    public TabYTStuffMod(int index, String label) {
        super(index, label);
    }

    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ytIcon);
    }
}

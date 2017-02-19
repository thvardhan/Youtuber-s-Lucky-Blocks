package thvardhan.ytluckyblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.items.ModItems;

public class TabYTStuffMod extends CreativeTabs {

    public TabYTStuffMod(int index, String label) {
        super(index, label);
    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModItems.ytIcon;
    }


}

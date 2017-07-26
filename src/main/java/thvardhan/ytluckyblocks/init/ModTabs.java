package thvardhan.ytluckyblocks.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thvardhan.ytluckyblocks.TabYTStuffArmor;
import thvardhan.ytluckyblocks.TabYTStuffMod;

/**
 * Created by patrick on 25/07/2017.
 */
public class ModTabs {

    public static CreativeTabs tabYTStuffMod;
    public static CreativeTabs tabYtStuffArmor;

    public static void createTabs() {

        tabYTStuffMod = new CreativeTabs(CreativeTabs.getNextID(), "YTSuffMod") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ModItems.ytIcon);
            }

            @Override
            public String getTranslatedTabLabel() {
                return "Youtuber Lucky Block Main";
            }
        };

        tabYtStuffArmor = new CreativeTabs(CreativeTabs.getNextID(), "YTStuffArmor") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ModItems.ytChestplate);
            }

            @Override
            public String getTranslatedTabLabel() {
                return "Youtuber Lucky Block Armor";
            }
        };

    }
}

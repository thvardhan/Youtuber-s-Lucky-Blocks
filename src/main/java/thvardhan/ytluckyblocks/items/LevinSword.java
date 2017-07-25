package thvardhan.ytluckyblocks.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import thvardhan.ytluckyblocks.CommonProxy;

public class LevinSword extends ItemSword {

    public LevinSword(String string, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);

    }


    @Override
    public Item setNoRepair() {
        return super.setNoRepair();
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {


        return super.onLeftClickEntity(stack, player, entity);
    }

}

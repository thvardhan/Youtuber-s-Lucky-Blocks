package thvardhan.ytluckyblocks.items;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.CommonProxy;

public class ItemModArmor extends ArmorItem {

    private final ResourceLocation armorTextureBase;

    public ItemModArmor(IArmorMaterial material, EquipmentSlotType slot, ResourceLocation armorTextureBase) {
        super(material, slot, new Item.Properties().tab(CommonProxy.tabYtStuffArmor));
        this.armorTextureBase = armorTextureBase;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        int layer = slot == EquipmentSlotType.LEGS ? 2 : 1;
        return String.format("%s:textures/models/armor/%s_layer_%d.png",
                this.armorTextureBase.getNamespace(), this.armorTextureBase.getPath(), layer);
    }

}

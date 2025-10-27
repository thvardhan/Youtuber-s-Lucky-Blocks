package thvardhan.ytluckyblocks.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {
    MSWORD( 0, 1000, 0, 3F, 0),
    BATTLE( 0, 2000, 0, 2F, 100),
    DEVIL( 0, 5000, 0, 3F, 100),
    LEVIN( 0, 1, 0, 996F, 0),
    MEGA(0, 1000, 0, 1.5F, 30),
    RAINBOW(0, 300, 0, 3F, 0),
    SNOW(0, 150, 0, 0.5F, 0),
    BLACK_NEON(0, 2005, 0, 1F, 22),
    HAMMER(0, 1000, 0, 5F, 0),
    NASTY(0, 20, 0, 0F, 0),
    LOG(0, 4000, 0, 1.5F, 40);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
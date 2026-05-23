package thvardhan.ytluckyblocks.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import thvardhan.ytluckyblocks.Main;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    private static IItemTier tool(final int harvestLevel, final int maxUses, final float efficiency,
            final float attackDamageBonus, final int enchantability) {
        return new IItemTier() {
            @Override
            public int getUses() {
                return maxUses;
            }

            @Override
            public float getSpeed() {
                return efficiency;
            }

            @Override
            public float getAttackDamageBonus() {
                return attackDamageBonus;
            }

            @Override
            public int getLevel() {
                return harvestLevel;
            }

            @Override
            public int getEnchantmentValue() {
                return enchantability;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }
        };
    }

    private static IArmorMaterial armorMat(final ResourceLocation tex, final int durabilityFactor,
            final int feet, final int legs, final int chest, final int head,
            final int enchantability, final SoundEvent equipSound, final float toughness) {
        return new IArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlotType slot) {
                switch (slot) {
                    case FEET:
                        return 13 * durabilityFactor;
                    case LEGS:
                        return 15 * durabilityFactor;
                    case CHEST:
                        return 16 * durabilityFactor;
                    case HEAD:
                        return 11 * durabilityFactor;
                    default:
                        return 0;
                }
            }

            @Override
            public int getDefenseForSlot(EquipmentSlotType slot) {
                switch (slot) {
                    case FEET:
                        return feet;
                    case LEGS:
                        return legs;
                    case CHEST:
                        return chest;
                    case HEAD:
                        return head;
                    default:
                        return 0;
                }
            }

            @Override
            public int getEnchantmentValue() {
                return enchantability;
            }

            @Override
            public SoundEvent getEquipSound() {
                return equipSound;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            @Override
            public String getName() {
                return tex.getNamespace() + "_" + tex.getPath().replace('/', '_');
            }

            @Override
            public float getToughness() {
                return toughness;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.0F;
            }
        };
    }

    private static ResourceLocation tex(String rl) {
        return new ResourceLocation(rl);
    }

    private static final IItemTier TIER_NASTY = tool(0, 20, 0.0F, 0.0F, 0);
    private static final IItemTier TIER_YT = tool(0, 1000, 0.0F, 5.0F, 0);
    private static final IItemTier TIER_M = tool(0, 1000, 0.0F, 3.0F, 0);
    private static final IItemTier TIER_BLACK = tool(0, 2005, 0.0F, 1.0F, 22);
    private static final IItemTier TIER_LOG = tool(0, 4000, 0.0F, 1.5F, 40);
    private static final IItemTier TIER_DEVIL = tool(0, 5000, 0.0F, 3.0F, 100);
    private static final IItemTier TIER_LEVIN = tool(0, 1, 0.0F, 996.0F, 0);
    private static final IItemTier TIER_SNOW = tool(0, 150, 0.0F, 0.5F, 0);
    private static final IItemTier TIER_MEGA = tool(0, 1000, 0.0F, 1.5F, 30);
    private static final IItemTier TIER_BATTLE = tool(0, 2000, 0.0F, 2.0F, 100);
    private static final IItemTier TIER_RAINBOW = tool(0, 300, 0.0F, 3.0F, 0);

    private static final IArmorMaterial DUCK_ARMOR = armorMat(tex("ytluckyblocks:duckarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LEAH_ARMOR = armorMat(tex("ytluckyblocks:leaharmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial MAX_ARMOR = armorMat(tex("ytluckyblocks:maxarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial CASSIE_THE_CAT_ARMOR = armorMat(tex("ytluckyblocks:cassiethecat"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial DONUT_ARMOR = armorMat(tex("ytluckyblocks:donutarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial EVIL_LITTLE_KELLY_ARMOR = armorMat(tex("ytluckyblocks:evillittlekellyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LITTLE_ALLY_ARMOR = armorMat(tex("ytluckyblocks:littleallyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LITTLE_CARLY_ARMOR = armorMat(tex("ytluckyblocks:littlecarlyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LITTLE_DONNY_ARMOR = armorMat(tex("ytluckyblocks:littledonnyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LITTLE_KELLY_ARMOR = armorMat(tex("ytluckyblocks:littlekellyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LITTLE_LIZARD_GAMING_ARMOR = armorMat(tex("ytluckyblocks:littlelizardgaming"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial MAX_THE_MONKEY_ARMOR = armorMat(tex("ytluckyblocks:maxthemonkeyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial SHARKY_ARMOR = armorMat(tex("ytluckyblocks:sharkyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial TINY_TURTULE_ARMOR = armorMat(tex("ytluckyblocks:tinyturtulearmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial APHMAU_ARMOR = armorMat(tex("ytluckyblocks:aphmauarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial ROPO_ARMOR = armorMat(tex("ytluckyblocks:ropoarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial SCUBA_ARMOR = armorMat(tex("ytluckyblocks:scubaarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial CRAINER_ARMOR = armorMat(tex("ytluckyblocks:crainerarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial ANGEL_ARMOR = armorMat(tex("ytluckyblocks:angelarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial TNT_ARMOR = armorMat(tex("ytluckyblocks:tnt"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LAC_ARMOR = armorMat(tex("ytluckyblocks:lac"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial MR_ARMOR = armorMat(tex("ytluckyblocks:mr"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial PETA_ARMOR = armorMat(tex("ytluckyblocks:peta"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial PINK_ARMOR = armorMat(tex("ytluckyblocks:pink"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial VIK_ARMOR = armorMat(tex("ytluckyblocks:vik"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial IHAS_ARMOR = armorMat(tex("ytluckyblocks:ihasarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LD_ARMOR = armorMat(tex("ytluckyblocks:ldarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial PRESTON_ARMOR = armorMat(tex("ytluckyblocks:prestonarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial S_ARMOR = armorMat(tex("ytluckyblocks:sarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial STAMPY_ARMOR = armorMat(tex("ytluckyblocks:stampyarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial THNX_ARMOR = armorMat(tex("ytluckyblocks:thnxarmor"), 80, 4, 8, 6, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial YT_ARMOR = armorMat(tex("ytluckyblocks:ytarmor"), 100, 4, 7, 5, 4, 1, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial ANT_ARMOR = armorMat(tex("ytluckyblocks:antarmor"), 80, 7, 4, 5, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial CAP_ARMOR = armorMat(tex("ytluckyblocks:caparmor"), 80, 4, 8, 5, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial DAN_ARMOR = armorMat(tex("ytluckyblocks:danarmor"), 80, 4, 7, 5, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial SQUID_ARMOR = armorMat(tex("ytluckyblocks:squidarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial LOG_ARMOR = armorMat(tex("ytluckyblocks:logarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial POP_ARMOR = armorMat(tex("ytluckyblocks:poparmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial SP_ARMOR = armorMat(tex("ytluckyblocks:sparmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial SKY_ARMOR = armorMat(tex("ytluckyblocks:skyarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial SUPER_ARMOR = armorMat(tex("ytluckyblocks:superarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial TRUE_ARMOR = armorMat(tex("ytluckyblocks:truearmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial ALEX_ARMOR = armorMat(tex("ytluckyblocks:alexarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial BAJAN_ARMOR = armorMat(tex("ytluckyblocks:bajanarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial FRIZZ_ARMOR = armorMat(tex("ytluckyblocks:frizzarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial JEROME_ARMOR = armorMat(tex("ytluckyblocks:jeromearmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);
    private static final IArmorMaterial TEWITY_ARMOR = armorMat(tex("ytluckyblocks:tewityarmor"), 80, 4, 8, 6, 4, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F);

    public static Item nastySword;
    public static Item yt_Sword;
    public static Item m_sword;
    public static Item swordBlack;
    public static Item swordLogdotzip;
    public static Item devilSword;
    public static Item levinSword;
    public static Item snowSword;
    public static Item megaSword;
    public static Item battleAxe;
    public static Item rainbowBlade;
    public static Item mic;
    public static Item ytIcon;

    public static Item tntHelmet;
    public static Item tntChestplate;
    public static Item tntLeggings;
    public static Item tntBoots;
    public static Item lacHelmet;
    public static Item lacChestplate;
    public static Item lacLeggings;
    public static Item lacBoots;
    public static Item mrHelmet;
    public static Item mrChestplate;
    public static Item mrLeggings;
    public static Item mrBoots;
    public static Item petaHelmet;
    public static Item petaChestplate;
    public static Item petaLeggings;
    public static Item petaBoots;
    public static Item pinkHelmet;
    public static Item pinkChestplate;
    public static Item pinkLeggings;
    public static Item pinkBoots;
    public static Item vikHelmet;
    public static Item vikChestplate;
    public static Item vikLeggings;
    public static Item vikBoots;
    public static Item ihas_Helmet;
    public static Item ihas_Chestplate;
    public static Item ihas_Leggings;
    public static Item ihas_Boots;
    public static Item ld_Helmet;
    public static Item ld_Chestplate;
    public static Item ld_Leggings;
    public static Item ld_Boots;
    public static Item preston_Helmet;
    public static Item preston_Chestplate;
    public static Item preston_Leggings;
    public static Item preston_Boots;
    public static Item s_Helmet;
    public static Item s_Chestplate;
    public static Item s_Leggings;
    public static Item s_Boots;
    public static Item stampy_Helmet;
    public static Item stampy_Chestplate;
    public static Item stampy_Leggings;
    public static Item stampy_Boots;
    public static Item thnx_Helmet;
    public static Item thnx_Chestplate;
    public static Item thnx_Leggings;
    public static Item thnx_Boots;
    public static Item ytHelmet;
    public static Item ytChestplate;
    public static Item ytLeggings;
    public static Item ytBoots;
    public static Item antHelmet;
    public static Item antChestplate;
    public static Item antLeggings;
    public static Item antBoots;
    public static Item capHelmet;
    public static Item capChestplate;
    public static Item capLeggings;
    public static Item capBoots;
    public static Item danHelmet;
    public static Item danChestplate;
    public static Item danLeggings;
    public static Item danBoots;
    public static Item squidHelmet;
    public static Item squidChestplate;
    public static Item squidLeggings;
    public static Item squidBoots;
    public static Item logHelmet;
    public static Item logChestplate;
    public static Item logLeggings;
    public static Item logBoots;
    public static Item popHelmet;
    public static Item popChestplate;
    public static Item popLeggings;
    public static Item popBoots;
    public static Item spHelmet;
    public static Item spChestplate;
    public static Item spLeggings;
    public static Item spBoots;
    public static Item skyHelmet;
    public static Item skyChestplate;
    public static Item skyLeggings;
    public static Item skyBoots;
    public static Item superHelmet;
    public static Item superChestplate;
    public static Item superLeggings;
    public static Item superBoots;
    public static Item trueHelmet;
    public static Item trueChestplate;
    public static Item trueLeggings;
    public static Item trueBoots;
    public static Item alexHelmet;
    public static Item alexChestplate;
    public static Item alexLeggings;
    public static Item alexBoots;
    public static Item bajanHelmet;
    public static Item bajanChestplate;
    public static Item bajanLeggings;
    public static Item bajanBoots;
    public static Item frizzHelmet;
    public static Item frizzChestplate;
    public static Item frizzLeggings;
    public static Item frizzBoots;
    public static Item jeromeHelmet;
    public static Item jeromeChestplate;
    public static Item jeromeLeggings;
    public static Item jeromeBoots;
    public static Item tewityHelmet;
    public static Item tewityChestplate;
    public static Item tewityLeggings;
    public static Item tewityBoots;

    public static Item duckHelmet;
    public static Item duckChestplate;
    public static Item duckLeggings;
    public static Item duckBoots;
    public static Item leahHelmet;
    public static Item leahChestplate;
    public static Item leahLeggings;
    public static Item leahBoots;
    public static Item maxHelmet;
    public static Item maxChestplate;
    public static Item maxLeggings;
    public static Item maxBoots;
    public static Item cassieTheCatHelmet;
    public static Item cassieTheCatChestplate;
    public static Item cassieTheCatLeggings;
    public static Item cassieTheCatBoots;
    public static Item donutHelmet;
    public static Item donutChestplate;
    public static Item donutLeggings;
    public static Item donutBoots;
    public static Item evilLittleKellyHelmet;
    public static Item evilLittleKellyChestplate;
    public static Item evilLittleKellyLeggings;
    public static Item evilLittleKellyBoots;
    public static Item allyHelmet;
    public static Item allyChestplate;
    public static Item allyLeggings;
    public static Item allyBoots;
    public static Item carlyHelmet;
    public static Item carlyChestplate;
    public static Item carlyLeggings;
    public static Item carlyBoots;
    public static Item donnyHelmet;
    public static Item donnyChestplate;
    public static Item donnyLeggings;
    public static Item donnyBoots;
    public static Item littleKellyHelmet;
    public static Item littleKellyChestplate;
    public static Item littleKellyLeggings;
    public static Item littleKellyBoots;
    public static Item littlelizardHelmet;
    public static Item littlelizardChestplate;
    public static Item littlelizardLeggings;
    public static Item littlelizardBoots;
    public static Item monkeyHelmet;
    public static Item monkeyChestplate;
    public static Item monkeyLeggings;
    public static Item monkeyBoots;
    public static Item sharkyHelmet;
    public static Item sharkyChestplate;
    public static Item sharkyLeggings;
    public static Item sharkyBoots;
    public static Item turtleHelmet;
    public static Item turtleChestplate;
    public static Item turtleLeggings;
    public static Item turtleBoots;

    public static Item aphmauHelmet;
    public static Item aphmauChestplate;
    public static Item aphmauLeggings;
    public static Item aphmauBoots;
    public static Item ropoHelmet;
    public static Item ropoChestplate;
    public static Item ropoLeggings;
    public static Item ropoBoots;
    public static Item scubaHelmet;
    public static Item scubaChestplate;
    public static Item scubaLeggings;
    public static Item scubaBoots;
    public static Item crainerHelmet;
    public static Item crainerChestplate;
    public static Item crainerLeggings;
    public static Item crainerBoots;
    public static Item angelHelmet;
    public static Item angelChestplate;
    public static Item angelLeggings;
    public static Item angelBoots;

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();

        register(r, nastySword = new NastySword(TIER_NASTY), "nasty_sword");
        register(r, swordBlack = new SwordBlack(TIER_BLACK), "black_sword");
        register(r, swordLogdotzip = new SwordLogdotzip(TIER_LOG), "logdotzip_sword");
        register(r, devilSword = new DevilSword(TIER_DEVIL), "devil_sword");
        register(r, levinSword = new LevinSword(TIER_LEVIN), "levin_sword");
        register(r, mic = new MicItem(), "mic");
        register(r, ytIcon = new YtIcon(), "yticon");
        register(r, snowSword = new SnowSword(TIER_SNOW), "snow_sword");
        register(r, megaSword = new MagaSword(TIER_MEGA), "mega_sword");
        register(r, battleAxe = new BattleAxe(TIER_BATTLE), "battle_axe");
        register(r, rainbowBlade = new RainbowBlade(TIER_RAINBOW), "rainbow_blade");
        register(r, m_sword = new M_sword(TIER_M), "m_sword");
        register(r, yt_Sword = new YT_Sword(TIER_YT), "yt_sword");

        register(r, tntHelmet = new ItemModArmor(TNT_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:tnt")), "tnt_helmet");
        register(r, tntChestplate = new ItemModArmor(TNT_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:tnt")), "tnt_chestplate");
        register(r, tntLeggings = new ItemModArmor(TNT_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:tnt")), "tnt_leggings");
        register(r, tntBoots = new ItemModArmor(TNT_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:tnt")), "tnt_boots");
        register(r, lacHelmet = new ItemModArmor(LAC_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:lac")), "lac_helmet");
        register(r, lacChestplate = new ItemModArmor(LAC_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:lac")), "lac_chestplate");
        register(r, lacLeggings = new ItemModArmor(LAC_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:lac")), "lac_leggings");
        register(r, lacBoots = new ItemModArmor(LAC_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:lac")), "lac_boots");
        register(r, mrHelmet = new ItemModArmor(MR_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:mr")), "mr_helmet");
        register(r, mrChestplate = new ItemModArmor(MR_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:mr")), "mr_chestplate");
        register(r, mrLeggings = new ItemModArmor(MR_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:mr")), "mr_leggings");
        register(r, mrBoots = new ItemModArmor(MR_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:mr")), "mr_boots");
        register(r, petaHelmet = new ItemModArmor(PETA_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:peta")), "peta_helmet");
        register(r, petaChestplate = new ItemModArmor(PETA_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:peta")), "peta_chestplate");
        register(r, petaLeggings = new ItemModArmor(PETA_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:peta")), "peta_leggings");
        register(r, petaBoots = new ItemModArmor(PETA_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:peta")), "peta_boots");
        register(r, pinkHelmet = new ItemModArmor(PINK_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:pink")), "pink_helmet");
        register(r, pinkChestplate = new ItemModArmor(PINK_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:pink")), "pink_chestplate");
        register(r, pinkLeggings = new ItemModArmor(PINK_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:pink")), "pink_leggings");
        register(r, pinkBoots = new ItemModArmor(PINK_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:pink")), "pink_boots");
        register(r, vikHelmet = new ItemModArmor(VIK_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:vik")), "vik_helmet");
        register(r, vikChestplate = new ItemModArmor(VIK_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:vik")), "vik_chestplate");
        register(r, vikLeggings = new ItemModArmor(VIK_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:vik")), "vik_leggings");
        register(r, vikBoots = new ItemModArmor(VIK_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:vik")), "vik_boots");

        register(r, ytHelmet = new ItemModArmor(YT_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:ytarmor")), "yt_helmet");
        register(r, ytChestplate = new ItemModArmor(YT_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:ytarmor")), "yt_chestplate");
        register(r, ytLeggings = new ItemModArmor(YT_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:ytarmor")), "yt_leggings");
        register(r, ytBoots = new ItemModArmor(YT_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:ytarmor")), "yt_boots");
        register(r, antHelmet = new ItemModArmor(ANT_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:antarmor")), "ant_helmet");
        register(r, antChestplate = new ItemModArmor(ANT_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:antarmor")), "ant_chestplate");
        register(r, antLeggings = new ItemModArmor(ANT_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:antarmor")), "ant_leggings");
        register(r, antBoots = new ItemModArmor(ANT_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:antarmor")), "ant_boots");
        register(r, capHelmet = new ItemModArmor(CAP_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:caparmor")), "cap_helmet");
        register(r, capChestplate = new ItemModArmor(CAP_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:caparmor")), "cap_chestplate");
        register(r, capLeggings = new ItemModArmor(CAP_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:caparmor")), "cap_leggings");
        register(r, capBoots = new ItemModArmor(CAP_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:caparmor")), "cap_boots");
        register(r, danHelmet = new ItemModArmor(DAN_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:danarmor")), "dan_helmet");
        register(r, danChestplate = new ItemModArmor(DAN_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:danarmor")), "dan_chestplate");
        register(r, danLeggings = new ItemModArmor(DAN_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:danarmor")), "dan_leggings");
        register(r, danBoots = new ItemModArmor(DAN_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:danarmor")), "dan_boots");
        register(r, squidHelmet = new ItemModArmor(SQUID_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:squidarmor")), "squid_helmet");
        register(r, squidChestplate = new ItemModArmor(SQUID_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:squidarmor")), "squid_chestplate");
        register(r, squidLeggings = new ItemModArmor(SQUID_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:squidarmor")), "squid_leggings");
        register(r, squidBoots = new ItemModArmor(SQUID_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:squidarmor")), "squid_boots");
        register(r, logHelmet = new ItemModArmor(LOG_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:logarmor")), "log_helmet");
        register(r, logChestplate = new ItemModArmor(LOG_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:logarmor")), "log_chestplate");
        register(r, logLeggings = new ItemModArmor(LOG_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:logarmor")), "log_leggings");
        register(r, logBoots = new ItemModArmor(LOG_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:logarmor")), "log_boots");
        register(r, popHelmet = new ItemModArmor(POP_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:poparmor")), "pop_helmet");
        register(r, popChestplate = new ItemModArmor(POP_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:poparmor")), "pop_chestplate");
        register(r, popLeggings = new ItemModArmor(POP_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:poparmor")), "pop_leggings");
        register(r, popBoots = new ItemModArmor(POP_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:poparmor")), "pop_boots");
        register(r, spHelmet = new ItemModArmor(SP_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:sparmor")), "sp_helmet");
        register(r, spChestplate = new ItemModArmor(SP_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:sparmor")), "sp_chestplate");
        register(r, spLeggings = new ItemModArmor(SP_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:sparmor")), "sp_leggings");
        register(r, spBoots = new ItemModArmor(SP_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:sparmor")), "sp_boots");
        register(r, skyHelmet = new ItemModArmor(SKY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:skyarmor")), "sky_helmet");
        register(r, skyChestplate = new ItemModArmor(SKY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:skyarmor")), "sky_chestplate");
        register(r, skyLeggings = new ItemModArmor(SKY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:skyarmor")), "sky_leggings");
        register(r, skyBoots = new ItemModArmor(SKY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:skyarmor")), "sky_boots");
        register(r, superHelmet = new ItemModArmor(SUPER_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:superarmor")), "super_helmet");
        register(r, superChestplate = new ItemModArmor(SUPER_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:superarmor")), "super_chestplate");
        register(r, superLeggings = new ItemModArmor(SUPER_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:superarmor")), "super_leggings");
        register(r, superBoots = new ItemModArmor(SUPER_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:superarmor")), "super_boots");
        register(r, trueHelmet = new ItemModArmor(TRUE_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:truearmor")), "true_helmet");
        register(r, trueChestplate = new ItemModArmor(TRUE_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:truearmor")), "true_chestplate");
        register(r, trueLeggings = new ItemModArmor(TRUE_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:truearmor")), "true_leggings");
        register(r, trueBoots = new ItemModArmor(TRUE_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:truearmor")), "true_boots");
        register(r, alexHelmet = new ItemModArmor(ALEX_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:alexarmor")), "alex_helmet");
        register(r, alexChestplate = new ItemModArmor(ALEX_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:alexarmor")), "alex_chestplate");
        register(r, alexLeggings = new ItemModArmor(ALEX_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:alexarmor")), "alex_leggings");
        register(r, alexBoots = new ItemModArmor(ALEX_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:alexarmor")), "alex_boots");
        register(r, bajanHelmet = new ItemModArmor(BAJAN_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:bajanarmor")), "bajan_helmet");
        register(r, bajanChestplate = new ItemModArmor(BAJAN_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:bajanarmor")), "bajan_chestplate");
        register(r, bajanLeggings = new ItemModArmor(BAJAN_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:bajanarmor")), "bajan_leggings");
        register(r, bajanBoots = new ItemModArmor(BAJAN_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:bajanarmor")), "bajan_boots");
        register(r, frizzHelmet = new ItemModArmor(FRIZZ_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:frizzarmor")), "frizz_helmet");
        register(r, frizzChestplate = new ItemModArmor(FRIZZ_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:frizzarmor")), "frizz_chestplate");
        register(r, frizzLeggings = new ItemModArmor(FRIZZ_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:frizzarmor")), "frizz_leggings");
        register(r, frizzBoots = new ItemModArmor(FRIZZ_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:frizzarmor")), "frizz_boots");
        register(r, jeromeHelmet = new ItemModArmor(JEROME_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:jeromearmor")), "jerome_helmet");
        register(r, jeromeChestplate = new ItemModArmor(JEROME_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:jeromearmor")), "jerome_chestplate");
        register(r, jeromeLeggings = new ItemModArmor(JEROME_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:jeromearmor")), "jerome_leggings");
        register(r, jeromeBoots = new ItemModArmor(JEROME_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:jeromearmor")), "jerome_boots");
        register(r, tewityHelmet = new ItemModArmor(TEWITY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:tewityarmor")), "tewity_helmet");
        register(r, tewityChestplate = new ItemModArmor(TEWITY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:tewityarmor")), "tewity_chestplate");
        register(r, tewityLeggings = new ItemModArmor(TEWITY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:tewityarmor")), "tewity_leggings");
        register(r, tewityBoots = new ItemModArmor(TEWITY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:tewityarmor")), "tewity_boots");
        register(r, ihas_Helmet = new ItemModArmor(IHAS_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:ihasarmor")), "ihas_helmet");
        register(r, ihas_Chestplate = new ItemModArmor(IHAS_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:ihasarmor")), "ihas_chestplate");
        register(r, ihas_Leggings = new ItemModArmor(IHAS_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:ihasarmor")), "ihas_leggings");
        register(r, ihas_Boots = new ItemModArmor(IHAS_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:ihasarmor")), "ihas_boots");
        register(r, ld_Helmet = new ItemModArmor(LD_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:ldarmor")), "ld_helmet");
        register(r, ld_Chestplate = new ItemModArmor(LD_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:ldarmor")), "ld_chestplate");
        register(r, ld_Leggings = new ItemModArmor(LD_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:ldarmor")), "ld_leggings");
        register(r, ld_Boots = new ItemModArmor(LD_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:ldarmor")), "ld_boots");
        register(r, preston_Helmet = new ItemModArmor(PRESTON_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:prestonarmor")), "preston_helmet");
        register(r, preston_Chestplate = new ItemModArmor(PRESTON_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:prestonarmor")), "preston_chestplate");
        register(r, preston_Leggings = new ItemModArmor(PRESTON_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:prestonarmor")), "preston_leggings");
        register(r, preston_Boots = new ItemModArmor(PRESTON_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:prestonarmor")), "preston_boots");
        register(r, s_Helmet = new ItemModArmor(S_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:sarmor")), "s_helmet");
        register(r, s_Chestplate = new ItemModArmor(S_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:sarmor")), "s_chestplate");
        register(r, s_Leggings = new ItemModArmor(S_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:sarmor")), "s_leggings");
        register(r, s_Boots = new ItemModArmor(S_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:sarmor")), "s_boots");
        register(r, stampy_Helmet = new ItemModArmor(STAMPY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:stampyarmor")), "stampy_helmet");
        register(r, stampy_Chestplate = new ItemModArmor(STAMPY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:stampyarmor")), "stampy_chestplate");
        register(r, stampy_Leggings = new ItemModArmor(STAMPY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:stampyarmor")), "stampy_leggings");
        register(r, stampy_Boots = new ItemModArmor(STAMPY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:stampyarmor")), "stampy_boots");
        register(r, thnx_Helmet = new ItemModArmor(THNX_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:thnxarmor")), "thnx_helmet");
        register(r, thnx_Chestplate = new ItemModArmor(THNX_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:thnxarmor")), "thnx_chestplate");
        register(r, thnx_Leggings = new ItemModArmor(THNX_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:thnxarmor")), "thnx_leggings");
        register(r, thnx_Boots = new ItemModArmor(THNX_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:thnxarmor")), "thnx_boots");

        register(r, duckHelmet = new ItemModArmor(DUCK_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:duckarmor")), "duckhelmet");
        register(r, duckChestplate = new ItemModArmor(DUCK_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:duckarmor")), "duckchestplate");
        register(r, duckLeggings = new ItemModArmor(DUCK_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:duckarmor")), "duckleggings");
        register(r, duckBoots = new ItemModArmor(DUCK_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:duckarmor")), "duckboots");
        register(r, leahHelmet = new ItemModArmor(LEAH_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:leaharmor")), "leahhelmet");
        register(r, leahChestplate = new ItemModArmor(LEAH_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:leaharmor")), "leahchestplate");
        register(r, leahLeggings = new ItemModArmor(LEAH_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:leaharmor")), "leahleggings");
        register(r, leahBoots = new ItemModArmor(LEAH_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:leaharmor")), "leahboots");
        register(r, maxHelmet = new ItemModArmor(MAX_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:maxarmor")), "maxhelmet");
        register(r, maxChestplate = new ItemModArmor(MAX_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:maxarmor")), "maxchestplate");
        register(r, maxLeggings = new ItemModArmor(MAX_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:maxarmor")), "maxleggings");
        register(r, maxBoots = new ItemModArmor(MAX_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:maxarmor")), "maxboots");
        register(r, cassieTheCatHelmet = new ItemModArmor(CASSIE_THE_CAT_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:cassiethecat")), "cassiethecathelmet");
        register(r, cassieTheCatChestplate = new ItemModArmor(CASSIE_THE_CAT_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:cassiethecat")), "cassiethecatchestplate");
        register(r, cassieTheCatLeggings = new ItemModArmor(CASSIE_THE_CAT_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:cassiethecat")), "cassiethecatleggings");
        register(r, cassieTheCatBoots = new ItemModArmor(CASSIE_THE_CAT_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:cassiethecat")), "cassiethecatboots");
        register(r, donutHelmet = new ItemModArmor(DONUT_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:donutarmor")), "donuthelmet");
        register(r, donutChestplate = new ItemModArmor(DONUT_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:donutarmor")), "donutchestplate");
        register(r, donutLeggings = new ItemModArmor(DONUT_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:donutarmor")), "donutleggings");
        register(r, donutBoots = new ItemModArmor(DONUT_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:donutarmor")), "donutboots");
        register(r, evilLittleKellyHelmet = new ItemModArmor(EVIL_LITTLE_KELLY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:evillittlekellyarmor")), "evillittlekellyhelmet");
        register(r, evilLittleKellyChestplate = new ItemModArmor(EVIL_LITTLE_KELLY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:evillittlekellyarmor")), "evillittlekellychestplate");
        register(r, evilLittleKellyLeggings = new ItemModArmor(EVIL_LITTLE_KELLY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:evillittlekellyarmor")), "evillittlekellyleggings");
        register(r, evilLittleKellyBoots = new ItemModArmor(EVIL_LITTLE_KELLY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:evillittlekellyarmor")), "evillittlekellyboots");
        register(r, allyHelmet = new ItemModArmor(LITTLE_ALLY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:littleallyarmor")), "allyhelmet");
        register(r, allyChestplate = new ItemModArmor(LITTLE_ALLY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:littleallyarmor")), "allychestplate");
        register(r, allyLeggings = new ItemModArmor(LITTLE_ALLY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:littleallyarmor")), "allyleggings");
        register(r, allyBoots = new ItemModArmor(LITTLE_ALLY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:littleallyarmor")), "allyboots");
        register(r, carlyHelmet = new ItemModArmor(LITTLE_CARLY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:littlecarlyarmor")), "carlyhelmet");
        register(r, carlyChestplate = new ItemModArmor(LITTLE_CARLY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:littlecarlyarmor")), "carlychestplate");
        register(r, carlyLeggings = new ItemModArmor(LITTLE_CARLY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:littlecarlyarmor")), "carlyleggings");
        register(r, carlyBoots = new ItemModArmor(LITTLE_CARLY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:littlecarlyarmor")), "carlyboots");
        register(r, donnyHelmet = new ItemModArmor(LITTLE_DONNY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:littledonnyarmor")), "donnyhelmet");
        register(r, donnyChestplate = new ItemModArmor(LITTLE_DONNY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:littledonnyarmor")), "donnychestplate");
        register(r, donnyLeggings = new ItemModArmor(LITTLE_DONNY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:littledonnyarmor")), "donnyleggings");
        register(r, donnyBoots = new ItemModArmor(LITTLE_DONNY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:littledonnyarmor")), "donnyboots");
        register(r, littleKellyHelmet = new ItemModArmor(LITTLE_KELLY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:littlekellyarmor")), "littlekellyhelmet");
        register(r, littleKellyChestplate = new ItemModArmor(LITTLE_KELLY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:littlekellyarmor")), "littlekellychestplate");
        register(r, littleKellyLeggings = new ItemModArmor(LITTLE_KELLY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:littlekellyarmor")), "littlekellyleggings");
        register(r, littleKellyBoots = new ItemModArmor(LITTLE_KELLY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:littlekellyarmor")), "littlekellyboots");
        register(r, littlelizardHelmet = new ItemModArmor(LITTLE_LIZARD_GAMING_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:littlelizardgaming")), "littlelizardhelmet");
        register(r, littlelizardChestplate = new ItemModArmor(LITTLE_LIZARD_GAMING_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:littlelizardgaming")), "littlelizardchestplate");
        register(r, littlelizardLeggings = new ItemModArmor(LITTLE_LIZARD_GAMING_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:littlelizardgaming")), "littlelizardleggings");
        register(r, littlelizardBoots = new ItemModArmor(LITTLE_LIZARD_GAMING_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:littlelizardgaming")), "littlelizardboots");
        register(r, monkeyHelmet = new ItemModArmor(MAX_THE_MONKEY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:maxthemonkeyarmor")), "monkeyhelmet");
        register(r, monkeyChestplate = new ItemModArmor(MAX_THE_MONKEY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:maxthemonkeyarmor")), "monkeychestplate");
        register(r, monkeyLeggings = new ItemModArmor(MAX_THE_MONKEY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:maxthemonkeyarmor")), "monkeyleggings");
        register(r, monkeyBoots = new ItemModArmor(MAX_THE_MONKEY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:maxthemonkeyarmor")), "monkeyboots");
        register(r, sharkyHelmet = new ItemModArmor(SHARKY_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:sharkyarmor")), "sharkyhelmet");
        register(r, sharkyChestplate = new ItemModArmor(SHARKY_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:sharkyarmor")), "sharkychestplate");
        register(r, sharkyLeggings = new ItemModArmor(SHARKY_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:sharkyarmor")), "sharkyleggings");
        register(r, sharkyBoots = new ItemModArmor(SHARKY_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:sharkyarmor")), "sharkyboots");
        register(r, turtleHelmet = new ItemModArmor(TINY_TURTULE_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:tinyturtulearmor")), "turtlehelmet");
        register(r, turtleChestplate = new ItemModArmor(TINY_TURTULE_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:tinyturtulearmor")), "turtlechestplate");
        register(r, turtleLeggings = new ItemModArmor(TINY_TURTULE_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:tinyturtulearmor")), "turtleleggings");
        register(r, turtleBoots = new ItemModArmor(TINY_TURTULE_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:tinyturtulearmor")), "turtleboots");

        register(r, aphmauHelmet = new ItemModArmor(APHMAU_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:aphmauarmor")), "aphmauhelmet");
        register(r, aphmauChestplate = new ItemModArmor(APHMAU_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:aphmauarmor")), "aphmauchestplate");
        register(r, aphmauLeggings = new ItemModArmor(APHMAU_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:aphmauarmor")), "aphmauleggings");
        register(r, aphmauBoots = new ItemModArmor(APHMAU_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:aphmauarmor")), "aphmauboots");
        register(r, ropoHelmet = new ItemModArmor(ROPO_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:ropoarmor")), "ropohelmet");
        register(r, ropoChestplate = new ItemModArmor(ROPO_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:ropoarmor")), "ropochestplate");
        register(r, ropoLeggings = new ItemModArmor(ROPO_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:ropoarmor")), "ropoleggings");
        register(r, ropoBoots = new ItemModArmor(ROPO_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:ropoarmor")), "ropoboots");
        register(r, scubaHelmet = new ItemModArmor(SCUBA_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:scubaarmor")), "scubahelmet");
        register(r, scubaChestplate = new ItemModArmor(SCUBA_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:scubaarmor")), "scubachestplate");
        register(r, scubaLeggings = new ItemModArmor(SCUBA_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:scubaarmor")), "scubaleggings");
        register(r, scubaBoots = new ItemModArmor(SCUBA_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:scubaarmor")), "scubaboots");
        register(r, crainerHelmet = new ItemModArmor(CRAINER_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:crainerarmor")), "crainerhelmet");
        register(r, crainerChestplate = new ItemModArmor(CRAINER_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:crainerarmor")), "crainerchestplate");
        register(r, crainerLeggings = new ItemModArmor(CRAINER_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:crainerarmor")), "crainerleggings");
        register(r, crainerBoots = new ItemModArmor(CRAINER_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:crainerarmor")), "crainerboots");
        register(r, angelHelmet = new ItemModArmor(ANGEL_ARMOR, EquipmentSlotType.HEAD, tex("ytluckyblocks:angelarmor")), "angelhelmet");
        register(r, angelChestplate = new ItemModArmor(ANGEL_ARMOR, EquipmentSlotType.CHEST, tex("ytluckyblocks:angelarmor")), "angelchestplate");
        register(r, angelLeggings = new ItemModArmor(ANGEL_ARMOR, EquipmentSlotType.LEGS, tex("ytluckyblocks:angelarmor")), "angelleggings");
        register(r, angelBoots = new ItemModArmor(ANGEL_ARMOR, EquipmentSlotType.FEET, tex("ytluckyblocks:angelarmor")), "angelboots");

        ModSpawnEggs.registerAll(r);
    }

    private static void register(IForgeRegistry<Item> reg, Item item, String name) {
        item.setRegistryName(new ResourceLocation(Main.MODID, name));
        reg.register(item);
    }

}

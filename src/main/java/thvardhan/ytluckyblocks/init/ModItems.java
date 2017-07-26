package thvardhan.ytluckyblocks.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import thvardhan.ytluckyblocks.items.*;

/**
 * Created by patrick on 25/07/2017.
 */
public class ModItems {

    //------------------------------tool mat.
    public static ToolMaterial NastySword = EnumHelper.addToolMaterial("Nastysword", 0, 20, 0, 0F, 0);
    public static ToolMaterial YTSword = EnumHelper.addToolMaterial("YTsword", 0, 1000, 0, 5F, 0);
    public static ToolMaterial MSword = EnumHelper.addToolMaterial("Msword", 0, 1000, 0, 3F, 0);
    public static ToolMaterial Black = EnumHelper.addToolMaterial("Black", 0, 2005, 0, 1F, 22);
    public static ToolMaterial Log = EnumHelper.addToolMaterial("log", 0, 4000, 0, 1.5F, 40);
    public static ToolMaterial Devil = EnumHelper.addToolMaterial("devil", 0, 5000, 0, 3F, 100);
    public static ToolMaterial Levin = EnumHelper.addToolMaterial("levin", 0, 1, 0, 996F, 0);
    public static ToolMaterial Snow = EnumHelper.addToolMaterial("snow", 0, 150, 0, 0.5F, 0);
    public static ToolMaterial Mega = EnumHelper.addToolMaterial("mega", 0, 1000, 0, 1.5F, 30);
    public static ToolMaterial Battle = EnumHelper.addToolMaterial("battle", 0, 2000, 0, 2F, 100);
    public static ToolMaterial Rainbow = EnumHelper.addToolMaterial("rainbow", 0, 300, 0, 3F, 0);


    //-----------------------------Armors
    public static ArmorMaterial DuckArmor = EnumHelper.addArmorMaterial("DuckArmor", "ytluckyblocks:duckarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LeahArmor = EnumHelper.addArmorMaterial("LeahArmor", "ytluckyblocks:leaharmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial MaxArmor = EnumHelper.addArmorMaterial("MaxArmor", "ytluckyblocks:maxarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial CassieTheCat = EnumHelper.addArmorMaterial("CassieTheCat", "ytluckyblocks:cassiethecat", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial DonutArmor = EnumHelper.addArmorMaterial("DonutArmor", "ytluckyblocks:donutarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial EvilLittleKellyArmor = EnumHelper.addArmorMaterial("EvilLittleKellyArmor", "ytluckyblocks:evillittlekellyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LittleAllyArmor = EnumHelper.addArmorMaterial("LittleAllyArmor", "ytluckyblocks:littleallyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LittleCarlyArmor = EnumHelper.addArmorMaterial("LittleCarlyArmor", "ytluckyblocks:littlecarlyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LittleDonnyArmor = EnumHelper.addArmorMaterial("LittleDonnyArmor", "ytluckyblocks:littledonnyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LittleKellyArmor = EnumHelper.addArmorMaterial("LittleKellyArmor", "ytluckyblocks:littlekellyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LittleLizardGaming = EnumHelper.addArmorMaterial("LittleLizardGaming", "ytluckyblocks:littlelizardgaming", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial MaxTheMonkeyArmor = EnumHelper.addArmorMaterial("MaxTheMonkeyArmor", "ytluckyblocks:maxthemonkeyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial SharkyArmor = EnumHelper.addArmorMaterial("SharkyArmor", "ytluckyblocks:sharkyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial TinyTurtuleArmor = EnumHelper.addArmorMaterial("TinyTurtuleArmor", "ytluckyblocks:tinyturtulearmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);

    public static ArmorMaterial aphmauArmor = EnumHelper.addArmorMaterial("aphmauArmor", "ytluckyblocks:aphmauarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial ropoArmor = EnumHelper.addArmorMaterial("ropoArmor", "ytluckyblocks:ropoarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial scubaArmor = EnumHelper.addArmorMaterial("scubaArmor", "ytluckyblocks:scubaarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial crainerArmor = EnumHelper.addArmorMaterial("crainerArmor", "ytluckyblocks:crainerarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial angelArmor = EnumHelper.addArmorMaterial("angelArmor", "ytluckyblocks:angelarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);

    public static ArmorMaterial TntArmor = EnumHelper.addArmorMaterial("TntArmor", "ytluckyblocks:tnt", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LacArmor = EnumHelper.addArmorMaterial("LacArmor", "ytluckyblocks:lac", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial MrArmor = EnumHelper.addArmorMaterial("MrArmor", "ytluckyblocks:mr", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial PetaArmor = EnumHelper.addArmorMaterial("PetaArmor", "ytluckyblocks:peta", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial PinkArmor = EnumHelper.addArmorMaterial("PinkArmor", "ytluckyblocks:pink", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial VikArmor = EnumHelper.addArmorMaterial("VikArmor", "ytluckyblocks:vik", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial IHasArmor = EnumHelper.addArmorMaterial("IHasArmor", "ytluckyblocks:ihasarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LDArmor = EnumHelper.addArmorMaterial("LDArmor", "ytluckyblocks:ldarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial PrestonArmor = EnumHelper.addArmorMaterial("PrestonArmor", "ytluckyblocks:prestonarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial SArmor = EnumHelper.addArmorMaterial("SArmor", "ytluckyblocks:sarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial StampyArmor = EnumHelper.addArmorMaterial("StampyArmor", "ytluckyblocks:stampyarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial ThnxArmor = EnumHelper.addArmorMaterial("ThnxArmor", "ytluckyblocks:thnxarmor", 80, new int[]{4, 8, 6, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial YtArmor = EnumHelper.addArmorMaterial("YtArmor", "ytluckyblocks:ytarmor", 100, new int[]{4, 7, 5, 4}, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial AntArmor = EnumHelper.addArmorMaterial("AntArmor", "ytluckyblocks:antarmor", 80, new int[]{7, 4, 5, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial CapArmor = EnumHelper.addArmorMaterial("CapArmor", "ytluckyblocks:caparmor", 80, new int[]{4, 8, 5, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial DanArmor = EnumHelper.addArmorMaterial("DanArmor", "ytluckyblocks:danarmor", 80, new int[]{4, 7, 5, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial SquidArmor = EnumHelper.addArmorMaterial("SquidArmor", "ytluckyblocks:squidarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial LogArmor = EnumHelper.addArmorMaterial("LogArmor", "ytluckyblocks:logarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial PopArmor = EnumHelper.addArmorMaterial("PopArmor", "ytluckyblocks:poparmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial SpArmor = EnumHelper.addArmorMaterial("SpArmor", "ytluckyblocks:sparmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial SkyArmor = EnumHelper.addArmorMaterial("SkyArmor", "ytluckyblocks:skyarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial SuperArmor = EnumHelper.addArmorMaterial("SuperArmor", "ytluckyblocks:superarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial TrueArmor = EnumHelper.addArmorMaterial("TrueArmor", "ytluckyblocks:truearmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial AlexArmor = EnumHelper.addArmorMaterial("AlexArmor", "ytluckyblocks:alexarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial BajanArmor = EnumHelper.addArmorMaterial("BajanArmor", "ytluckyblocks:bajanarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial FrizzArmor = EnumHelper.addArmorMaterial("FrizzArmor", "ytluckyblocks:frizzarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial JeromeArmor = EnumHelper.addArmorMaterial("JeromeArmor", "ytluckyblocks:jeromearmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static ArmorMaterial TewityArmor = EnumHelper.addArmorMaterial("TewityArmor", "ytluckyblocks:tewityarmor", 80, new int[]{4, 8, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);

    //--------------------------------ITEMS
    public static Item nastySword = new NastySword("nasty_sword", NastySword);
    public static Item yt_Sword = new YT_Sword("yt_sword", YTSword);
    public static Item m_sword = new M_sword("m_sword", MSword);
    public static Item swordBlack = new SwordBlack("black_sword", Black);
    public static Item swordLogdotzip = new SwordLogdotzip("logdotzip_sword", Log);
    public static Item devilSword = new DevilSword("devil_sword", Devil);
    public static Item levinSword = new LevinSword("levin_sword", Levin);
    public static Item snowSword = new SnowSword("snow_sword", Snow);
    public static Item megaSword = new MagaSword("mega_sword", Mega);
    public static Item battleAxe = new BattleAxe("battle_axe", Battle);
    public static Item rainbowBlade = new RainbowBlade("rainbow_blade", Rainbow);
    public static Item mic = new MicItem("mic");
    public static Item ytIcon = new YtIcon("yticon");
    //-------------------------------ARMS

    public static Item tntHelmet = new ItemModArmor("tnt_helmet", TntArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item tntChestplate = new ItemModArmor("tnt_chestplate", TntArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item tntLeggings = new ItemModArmor("tnt_leggings", TntArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item tntBoots = new ItemModArmor("tnt_boots", TntArmor, 1, EntityEquipmentSlot.FEET);
    public static Item lacHelmet = new ItemModArmor("lac_helmet", LacArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item lacChestplate = new ItemModArmor("lac_chestplate", LacArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item lacLeggings = new ItemModArmor("lac_leggings", LacArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item lacBoots = new ItemModArmor("lac_boots", LacArmor, 1, EntityEquipmentSlot.FEET);
    public static Item mrHelmet = new ItemModArmor("mr_helmet", MrArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item mrChestplate = new ItemModArmor("mr_chestplate", MrArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item mrLeggings = new ItemModArmor("mr_leggings", MrArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item mrBoots = new ItemModArmor("mr_boots", MrArmor, 1, EntityEquipmentSlot.FEET);
    public static Item petaHelmet = new ItemModArmor("peta_helmet", PetaArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item petaChestplate = new ItemModArmor("peta_chestplate", PetaArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item petaLeggings = new ItemModArmor("peta_leggings", PetaArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item petaBoots = new ItemModArmor("peta_boots", PetaArmor, 1, EntityEquipmentSlot.FEET);
    public static Item pinkHelmet = new ItemModArmor("pink_helmet", PinkArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item pinkChestplate = new ItemModArmor("pink_chestplate", PinkArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item pinkLeggings = new ItemModArmor("pink_leggings", PinkArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item pinkBoots = new ItemModArmor("pink_boots", PinkArmor, 1, EntityEquipmentSlot.FEET);
    public static Item vikHelmet = new ItemModArmor("vik_helmet", VikArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item vikChestplate = new ItemModArmor("vik_chestplate", VikArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item vikLeggings = new ItemModArmor("vik_leggings", VikArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item vikBoots = new ItemModArmor("vik_boots", VikArmor, 1, EntityEquipmentSlot.FEET);
    public static Item ihas_Helmet = new ItemModArmor("ihas_helmet", IHasArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item ihas_Chestplate = new ItemModArmor("ihas_chestplate", IHasArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item ihas_Leggings = new ItemModArmor("ihas_leggings", IHasArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item ihas_Boots = new ItemModArmor("ihas_boots", IHasArmor, 1, EntityEquipmentSlot.FEET);
    public static Item ld_Helmet = new ItemModArmor("ld_helmet", LDArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item ld_Chestplate = new ItemModArmor("ld_chestplate", LDArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item ld_Leggings = new ItemModArmor("ld_leggings", LDArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item ld_Boots = new ItemModArmor("ld_boots", LDArmor, 1, EntityEquipmentSlot.FEET);
    public static Item preston_Helmet = new ItemModArmor("preston_helmet", PrestonArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item preston_Chestplate = new ItemModArmor("preston_chestplate", PrestonArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item preston_Leggings = new ItemModArmor("preston_leggings", PrestonArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item preston_Boots = new ItemModArmor("preston_boots", PrestonArmor, 1, EntityEquipmentSlot.FEET);
    public static Item s_Helmet = new ItemModArmor("s_helmet", SArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item s_Chestplate = new ItemModArmor("s_chestplate", SArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item s_Leggings = new ItemModArmor("s_leggings", SArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item s_Boots = new ItemModArmor("s_boots", SArmor, 1, EntityEquipmentSlot.FEET);
    public static Item stampy_Helmet = new ItemModArmor("stampy_helmet", StampyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item stampy_Chestplate = new ItemModArmor("stampy_chestplate", StampyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item stampy_Leggings = new ItemModArmor("stampy_leggings", StampyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item stampy_Boots = new ItemModArmor("stampy_boots", StampyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item thnx_Helmet = new ItemModArmor("thnx_helmet", ThnxArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item thnx_Chestplate = new ItemModArmor("thnx_chestplate", ThnxArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item thnx_Leggings = new ItemModArmor("thnx_leggings", ThnxArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item thnx_Boots = new ItemModArmor("thnx_boots", ThnxArmor, 1, EntityEquipmentSlot.FEET);
    public static Item ytHelmet = new ItemModArmor("yt_helmet", YtArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item ytChestplate = new ItemModArmor("yt_chestplate", YtArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item ytLeggings = new ItemModArmor("yt_leggings", YtArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item ytBoots = new ItemModArmor("yt_boots", YtArmor, 1, EntityEquipmentSlot.FEET);
    public static Item antHelmet = new ItemModArmor("ant_helmet", AntArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item antChestplate = new ItemModArmor("ant_chestplate", AntArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item antLeggings = new ItemModArmor("ant_leggings", AntArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item antBoots = new ItemModArmor("ant_boots", AntArmor, 1, EntityEquipmentSlot.FEET);
    public static Item capHelmet = new ItemModArmor("cap_helmet", CapArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item capChestplate = new ItemModArmor("cap_chestplate", CapArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item capLeggings = new ItemModArmor("cap_leggings", CapArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item capBoots = new ItemModArmor("cap_boots", CapArmor, 1, EntityEquipmentSlot.FEET);
    public static Item danHelmet = new ItemModArmor("dan_helmet", DanArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item danChestplate = new ItemModArmor("dan_chestplate", DanArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item danLeggings = new ItemModArmor("dan_leggings", DanArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item danBoots = new ItemModArmor("dan_boots", DanArmor, 1, EntityEquipmentSlot.FEET);
    public static Item squidHelmet = new ItemModArmor("squid_helmet", SquidArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item squidChestplate = new ItemModArmor("squid_chestplate", SquidArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item squidLeggings = new ItemModArmor("squid_leggings", SquidArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item squidBoots = new ItemModArmor("squid_boots", SquidArmor, 1, EntityEquipmentSlot.FEET);
    public static Item logHelmet = new ItemModArmor("log_helmet", LogArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item logChestplate = new ItemModArmor("log_chestplate", LogArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item logLeggings = new ItemModArmor("log_leggings", LogArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item logBoots = new ItemModArmor("log_boots", LogArmor, 1, EntityEquipmentSlot.FEET);
    public static Item popHelmet = new ItemModArmor("pop_helmet", PopArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item popChestplate = new ItemModArmor("pop_chestplate", PopArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item popLeggings = new ItemModArmor("pop_leggings", PopArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item popBoots = new ItemModArmor("pop_boots", PopArmor, 1, EntityEquipmentSlot.FEET);
    public static Item spHelmet = new ItemModArmor("sp_helmet", SpArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item spChestplate = new ItemModArmor("sp_chestplate", SpArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item spLeggings = new ItemModArmor("sp_leggings", SpArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item spBoots = new ItemModArmor("sp_boots", SpArmor, 1, EntityEquipmentSlot.FEET);
    public static Item skyHelmet = new ItemModArmor("sky_helmet", SkyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item skyChestplate = new ItemModArmor("sky_chestplate", SkyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item skyLeggings = new ItemModArmor("sky_leggings", SkyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item skyBoots = new ItemModArmor("sky_boots", SkyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item superHelmet = new ItemModArmor("super_helmet", SuperArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item superChestplate = new ItemModArmor("super_chestplate", SuperArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item superLeggings = new ItemModArmor("super_leggings", SuperArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item superBoots = new ItemModArmor("super_boots", SuperArmor, 1, EntityEquipmentSlot.FEET);
    public static Item trueHelmet = new ItemModArmor("true_helmet", TrueArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item trueChestplate = new ItemModArmor("true_chestplate", TrueArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item trueLeggings = new ItemModArmor("true_leggings", TrueArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item trueBoots = new ItemModArmor("true_boots", TrueArmor, 1, EntityEquipmentSlot.FEET);
    public static Item alexHelmet = new ItemModArmor("alex_helmet", AlexArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item alexChestplate = new ItemModArmor("alex_chestplate", AlexArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item alexLeggings = new ItemModArmor("alex_leggings", AlexArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item alexBoots = new ItemModArmor("alex_boots", AlexArmor, 1, EntityEquipmentSlot.FEET);
    public static Item bajanHelmet = new ItemModArmor("bajan_helmet", BajanArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item bajanChestplate = new ItemModArmor("bajan_chestplate", BajanArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item bajanLeggings = new ItemModArmor("bajan_leggings", BajanArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item bajanBoots = new ItemModArmor("bajan_boots", BajanArmor, 1, EntityEquipmentSlot.FEET);
    public static Item frizzHelmet = new ItemModArmor("frizz_helmet", FrizzArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item frizzChestplate = new ItemModArmor("frizz_chestplate", FrizzArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item frizzLeggings = new ItemModArmor("frizz_leggings", FrizzArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item frizzBoots = new ItemModArmor("frizz_boots", FrizzArmor, 1, EntityEquipmentSlot.FEET);
    public static Item jeromeHelmet = new ItemModArmor("jerome_helmet", JeromeArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item jeromeChestplate = new ItemModArmor("jerome_chestplate", JeromeArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item jeromeLeggings = new ItemModArmor("jerome_leggings", JeromeArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item jeromeBoots = new ItemModArmor("jerome_boots", JeromeArmor, 1, EntityEquipmentSlot.FEET);
    public static Item tewityHelmet = new ItemModArmor("tewity_helmet", TewityArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item tewityChestplate = new ItemModArmor("tewity_chestplate", TewityArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item tewityLeggings = new ItemModArmor("tewity_leggings", TewityArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item tewityBoots = new ItemModArmor("tewity_boots", TewityArmor, 1, EntityEquipmentSlot.FEET);

    public static Item duckHelmet = new ItemModArmor("duckhelmet", DuckArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item duckChestplate = new ItemModArmor("duckchestplate", DuckArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item duckLeggings = new ItemModArmor("duckleggings", DuckArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item duckBoots = new ItemModArmor("duckboots", DuckArmor, 1, EntityEquipmentSlot.FEET);
    public static Item leahHelmet = new ItemModArmor("leahhelmet", LeahArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item leahChestplate = new ItemModArmor("leahchestplate", LeahArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item leahLeggings = new ItemModArmor("leahleggings", LeahArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item leahBoots = new ItemModArmor("leahboots", LeahArmor, 1, EntityEquipmentSlot.FEET);
    public static Item maxHelmet = new ItemModArmor("maxhelmet", MaxArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item maxChestplate = new ItemModArmor("maxchestplate", MaxArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item maxLeggings = new ItemModArmor("maxleggings", MaxArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item maxBoots = new ItemModArmor("maxboots", MaxArmor, 1, EntityEquipmentSlot.FEET);
    public static Item cassieTheCatHelmet = new ItemModArmor("cassiethecathelmet", CassieTheCat, 1, EntityEquipmentSlot.HEAD);
    public static Item cassieTheCatChestplate = new ItemModArmor("cassiethecatchestplate", CassieTheCat, 1, EntityEquipmentSlot.CHEST);
    public static Item cassieTheCatLeggings = new ItemModArmor("cassiethecatleggings", CassieTheCat, 2, EntityEquipmentSlot.LEGS);
    public static Item cassieTheCatBoots = new ItemModArmor("cassiethecatboots", CassieTheCat, 1, EntityEquipmentSlot.FEET);
    public static Item donutHelmet = new ItemModArmor("donuthelmet", DonutArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item donutChestplate = new ItemModArmor("donutchestplate", DonutArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item donutLeggings = new ItemModArmor("donutleggings", DonutArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item donutBoots = new ItemModArmor("donutboots", DonutArmor, 1, EntityEquipmentSlot.FEET);
    public static Item evilLittleKellyHelmet = new ItemModArmor("evillittlekellyhelmet", EvilLittleKellyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item evilLittleKellyChestplate = new ItemModArmor("evillittlekellychestplate", EvilLittleKellyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item evilLittleKellyLeggings = new ItemModArmor("evillittlekellyleggings", EvilLittleKellyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item evilLittleKellyBoots = new ItemModArmor("evillittlekellyboots", EvilLittleKellyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item allyHelmet = new ItemModArmor("allyhelmet", LittleAllyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item allyChestplate = new ItemModArmor("allychestplate", LittleAllyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item allyLeggings = new ItemModArmor("allyleggings", LittleAllyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item allyBoots = new ItemModArmor("allyboots", LittleAllyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item carlyHelmet = new ItemModArmor("carlyhelmet", LittleCarlyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item carlyChestplate = new ItemModArmor("carlychestplate", LittleCarlyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item carlyLeggings = new ItemModArmor("carlyleggings", LittleCarlyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item carlyBoots = new ItemModArmor("carlyboots", LittleCarlyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item donnyHelmet = new ItemModArmor("donnyhelmet", LittleDonnyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item donnyChestplate = new ItemModArmor("donnychestplate", LittleDonnyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item donnyLeggings = new ItemModArmor("donnyleggings", LittleDonnyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item donnyBoots = new ItemModArmor("donnyboots", LittleDonnyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item littleKellyHelmet = new ItemModArmor("littlekellyhelmet", LittleKellyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item littleKellyChestplate = new ItemModArmor("littlekellychestplate", LittleKellyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item littleKellyLeggings = new ItemModArmor("littlekellyleggings", LittleKellyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item littleKellyBoots = new ItemModArmor("littlekellyboots", LittleKellyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item littlelizardHelmet = new ItemModArmor("littlelizardhelmet", LittleLizardGaming, 1, EntityEquipmentSlot.HEAD);
    public static Item littlelizardChestplate = new ItemModArmor("littlelizardchestplate", LittleLizardGaming, 1, EntityEquipmentSlot.CHEST);
    public static Item littlelizardLeggings = new ItemModArmor("littlelizardleggings", LittleLizardGaming, 2, EntityEquipmentSlot.LEGS);
    public static Item littlelizardBoots = new ItemModArmor("littlelizardboots", LittleLizardGaming, 1, EntityEquipmentSlot.FEET);
    public static Item monkeyHelmet = new ItemModArmor("monkeyhelmet", MaxTheMonkeyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item monkeyChestplate = new ItemModArmor("monkeychestplate", MaxTheMonkeyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item monkeyLeggings = new ItemModArmor("monkeyleggings", MaxTheMonkeyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item monkeyBoots = new ItemModArmor("monkeyboots", MaxTheMonkeyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item sharkyHelmet = new ItemModArmor("sharkyhelmet", SharkyArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item sharkyChestplate = new ItemModArmor("sharkychestplate", SharkyArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item sharkyLeggings = new ItemModArmor("sharkyleggings", SharkyArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item sharkyBoots = new ItemModArmor("sharkyboots", SharkyArmor, 1, EntityEquipmentSlot.FEET);
    public static Item turtleHelmet = new ItemModArmor("turtlehelmet", TinyTurtuleArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item turtleChestplate = new ItemModArmor("turtlechestplate", TinyTurtuleArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item turtleLeggings = new ItemModArmor("turtleleggings", TinyTurtuleArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item turtleBoots = new ItemModArmor("turtleboots", TinyTurtuleArmor, 1, EntityEquipmentSlot.FEET);


    public static Item aphmauHelmet = new ItemModArmor("aphmauhelmet", aphmauArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item aphmauChestplate = new ItemModArmor("aphmauchestplate", aphmauArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item aphmauLeggings = new ItemModArmor("aphmauleggings", aphmauArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item aphmauBoots = new ItemModArmor("aphmauboots", aphmauArmor, 1, EntityEquipmentSlot.FEET);
    public static Item ropoHelmet = new ItemModArmor("ropohelmet", ropoArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item ropoChestplate = new ItemModArmor("ropochestplate", ropoArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item ropoLeggings = new ItemModArmor("ropoleggings", ropoArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item ropoBoots = new ItemModArmor("ropoboots", ropoArmor, 1, EntityEquipmentSlot.FEET);
    public static Item scubaHelmet = new ItemModArmor("scubahelmet", scubaArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item scubaChestplate = new ItemModArmor("scubachestplate", scubaArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item scubaLeggings = new ItemModArmor("scubaleggings", scubaArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item scubaBoots = new ItemModArmor("scubaboots", scubaArmor, 1, EntityEquipmentSlot.FEET);
    public static Item crainerHelmet = new ItemModArmor("crainerhelmet", crainerArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item crainerChestplate = new ItemModArmor("crainerchestplate", crainerArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item crainerLeggings = new ItemModArmor("crainerleggings", crainerArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item crainerBoots = new ItemModArmor("crainerboots", crainerArmor, 1, EntityEquipmentSlot.FEET);
    public static Item angelHelmet = new ItemModArmor("angelhelmet", angelArmor, 1, EntityEquipmentSlot.HEAD);
    public static Item angelChestplate = new ItemModArmor("angelchestplate", angelArmor, 1, EntityEquipmentSlot.CHEST);
    public static Item angelLeggings = new ItemModArmor("angelleggings", angelArmor, 2, EntityEquipmentSlot.LEGS);
    public static Item angelBoots = new ItemModArmor("angelboots", angelArmor, 1, EntityEquipmentSlot.FEET);

    public static void registerItem(IForgeRegistry<Item> registry) {
        registry.registerAll(
                nastySword ,
                yt_Sword,
                m_sword,
                swordBlack,
                swordLogdotzip,
                devilSword,
                levinSword,
                snowSword,
                megaSword,
                battleAxe,
                rainbowBlade,
                mic,
                ytIcon,
                tntHelmet, tntChestplate, tntLeggings, tntBoots,
                lacHelmet, lacChestplate, lacLeggings, lacBoots,
                mrHelmet, mrChestplate, mrLeggings, mrBoots,
                petaHelmet, petaChestplate, petaLeggings, petaBoots,
                pinkHelmet, pinkChestplate, pinkLeggings, pinkBoots,
                vikHelmet, vikChestplate, vikLeggings, vikBoots,
                ihas_Helmet, ihas_Chestplate, ihas_Leggings, ihas_Boots,
                ld_Helmet, ld_Chestplate, ld_Leggings, ld_Boots,
                preston_Helmet, preston_Chestplate, preston_Leggings, preston_Boots,
                s_Helmet, s_Chestplate, s_Leggings, s_Boots,
                stampy_Helmet, stampy_Chestplate, stampy_Leggings, stampy_Boots,
                thnx_Helmet, thnx_Chestplate, thnx_Leggings, thnx_Boots,
                ytHelmet, ytChestplate, ytLeggings, ytBoots,
                antHelmet, antChestplate, antLeggings, antBoots,
                capHelmet, capChestplate, capLeggings, capBoots,
                danHelmet, danChestplate, danLeggings, danBoots,
                squidHelmet, squidChestplate, squidLeggings, squidBoots,
                logHelmet, logChestplate, logLeggings, logBoots,
                popHelmet, popChestplate, popLeggings, popBoots,
                spHelmet, spChestplate, spLeggings, spBoots,
                skyHelmet, skyChestplate, skyLeggings, skyBoots,
                superHelmet, superChestplate, superLeggings, superBoots,
                trueHelmet, trueChestplate, trueLeggings, trueBoots,
                alexHelmet, alexChestplate, alexLeggings, alexBoots,
                bajanHelmet, bajanChestplate, bajanLeggings, bajanBoots,
                frizzHelmet, frizzChestplate, frizzLeggings, frizzBoots,
                jeromeHelmet, jeromeChestplate, jeromeLeggings, jeromeBoots,
                tewityHelmet, tewityChestplate, tewityLeggings, tewityBoots,
                duckHelmet, duckChestplate, duckLeggings, duckBoots,
                leahHelmet, leahChestplate, leahLeggings, leahBoots,
                maxHelmet, maxChestplate, maxLeggings, maxBoots,
                cassieTheCatHelmet, cassieTheCatChestplate, cassieTheCatLeggings, cassieTheCatBoots,
                donutHelmet, donutChestplate, donutLeggings, donutBoots,
                evilLittleKellyHelmet, evilLittleKellyChestplate, evilLittleKellyLeggings, evilLittleKellyBoots,
                allyHelmet, allyChestplate, allyLeggings, allyBoots,
                carlyHelmet, carlyChestplate, carlyLeggings, carlyBoots,
                donnyHelmet, donnyChestplate, donnyLeggings, donnyBoots,
                littleKellyHelmet, littleKellyChestplate, littleKellyLeggings, littleKellyBoots,
                littlelizardHelmet, littlelizardChestplate, littlelizardLeggings, littlelizardBoots,
                monkeyHelmet, monkeyChestplate, monkeyLeggings, monkeyBoots,
                sharkyHelmet, sharkyChestplate, sharkyLeggings, sharkyBoots,
                turtleHelmet, turtleChestplate, turtleLeggings, turtleBoots,
                aphmauHelmet, aphmauChestplate, aphmauLeggings, aphmauBoots,
                ropoHelmet, ropoChestplate, ropoLeggings, ropoBoots,
                scubaHelmet, scubaChestplate, scubaLeggings, scubaBoots,
                crainerHelmet, crainerChestplate, crainerLeggings, crainerBoots,
                angelHelmet, angelChestplate, angelLeggings, angelBoots
        );
    }

}

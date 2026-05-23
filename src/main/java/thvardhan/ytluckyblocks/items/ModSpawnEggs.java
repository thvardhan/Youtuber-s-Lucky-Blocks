package thvardhan.ytluckyblocks.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.IForgeRegistry;
import thvardhan.ytluckyblocks.Main;

import java.util.function.Supplier;
import thvardhan.ytluckyblocks.entity.EntityAlexirCraft;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityAphmau;
import thvardhan.ytluckyblocks.entity.EntityBabyAngel;
import thvardhan.ytluckyblocks.entity.EntityBabyDuck;
import thvardhan.ytluckyblocks.entity.EntityBabyLeah;
import thvardhan.ytluckyblocks.entity.EntityBabyMax;
import thvardhan.ytluckyblocks.entity.EntityBajanCanadian;
import thvardhan.ytluckyblocks.entity.EntityCaptainSparklez;
import thvardhan.ytluckyblocks.entity.EntityCassieTheCat;
import thvardhan.ytluckyblocks.entity.EntityDanTDM;
import thvardhan.ytluckyblocks.entity.EntityDonutTheDog;
import thvardhan.ytluckyblocks.entity.EntityEvilLittleKelly;
import thvardhan.ytluckyblocks.entity.EntityExplodingTNT;
import thvardhan.ytluckyblocks.entity.EntityFrizzleandpop;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityIhasCupquake;
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.entity.EntityJeromeASF;
import thvardhan.ytluckyblocks.entity.EntityLachlan;
import thvardhan.ytluckyblocks.entity.EntityLDShadowLady;
import thvardhan.ytluckyblocks.entity.EntityLittleAlly;
import thvardhan.ytluckyblocks.entity.EntityLittleCarlyMC;
import thvardhan.ytluckyblocks.entity.EntityLittleDonny;
import thvardhan.ytluckyblocks.entity.EntityLittleKellyMC;
import thvardhan.ytluckyblocks.entity.EntityLittleLizardGaming;
import thvardhan.ytluckyblocks.entity.EntityLittleRopo;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntityLuckyMob;
import thvardhan.ytluckyblocks.entity.EntityMaxTheMonkey;
import thvardhan.ytluckyblocks.entity.EntityMrCrainer;
import thvardhan.ytluckyblocks.entity.EntityMrWoofless;
import thvardhan.ytluckyblocks.entity.EntityPeteZahHutt;
import thvardhan.ytluckyblocks.entity.EntityPinkSheep;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.entity.EntityPrestonPlayz;
import thvardhan.ytluckyblocks.entity.EntityScubaSteve;
import thvardhan.ytluckyblocks.entity.EntitySerialPlayer;
import thvardhan.ytluckyblocks.entity.EntitySharky;
import thvardhan.ytluckyblocks.entity.EntitySkyDoesMinecraft;
import thvardhan.ytluckyblocks.entity.EntitySSundee;
import thvardhan.ytluckyblocks.entity.EntityStampylonghead;
import thvardhan.ytluckyblocks.entity.EntitySuperGirlyGamer;
import thvardhan.ytluckyblocks.entity.EntityTewity;
import thvardhan.ytluckyblocks.entity.EntityThnxCya;
import thvardhan.ytluckyblocks.entity.EntityTinyTurtle;
import thvardhan.ytluckyblocks.entity.EntityTruemu;
import thvardhan.ytluckyblocks.entity.EntityVikkstar123;

public final class ModSpawnEggs {

    private ModSpawnEggs() {
    }

    private static void register(IForgeRegistry<Item> reg, Supplier<? extends EntityType<? extends MobEntity>> typeSupplier,
            String name, int primary, int secondary) {
        ForgeSpawnEggItem egg = new ForgeSpawnEggItem(typeSupplier, primary, secondary,
                new Item.Properties().tab(ItemGroup.TAB_MISC));
        egg.setRegistryName(new ResourceLocation(Main.MODID, name));
        reg.register(egg);
    }

    public static void registerAll(IForgeRegistry<Item> r) {
        register(r, () -> EntityScubaSteve.TYPE, "scuba_steve_spawn_egg", 0xffcc00, 0xffff00);
        register(r, () -> EntityLittleRopo.TYPE, "little_ropo_spawn_egg", 0xcc00cc, 0xffffb3);
        register(r, () -> EntityMrCrainer.TYPE, "mr_crainer_spawn_egg", 0x000000, 0xff944d);
        register(r, () -> EntityBabyAngel.TYPE, "baby_angel_spawn_egg", 0x999999, 0xe6e6e6);
        register(r, () -> EntityAphmau.TYPE, "aphmau_spawn_egg", 0x000000, 0xff944d);
        register(r, () -> EntityBabyDuck.TYPE, "baby_duck_spawn_egg", 0xffcc00, 0xffff00);
        register(r, () -> EntityBabyLeah.TYPE, "baby_leah_spawn_egg", 0xcc00cc, 0xffffb3);
        register(r, () -> EntityBabyMax.TYPE, "baby_max_spawn_egg", 0x000000, 0xff944d);
        register(r, () -> EntityCassieTheCat.TYPE, "cassie_the_cat_spawn_egg", 0x999999, 0xe6e6e6);
        register(r, () -> EntityDonutTheDog.TYPE, "donut_the_dog_spawn_egg", 0x000000, 0xff944d);
        register(r, () -> EntityEvilLittleKelly.TYPE, "evil_little_kelly_spawn_egg", 0xff1a1a, 0xffffb3);
        register(r, () -> EntityLittleAlly.TYPE, "little_ally_spawn_egg", 0xff8566, 0xffffb3);
        register(r, () -> EntityLittleCarlyMC.TYPE, "little_carly_mc_spawn_egg", 0x66ccff, 0xffffb3);
        register(r, () -> EntityLittleDonny.TYPE, "little_donny_spawn_egg", 0x1ab2ff, 0xff8c1a);
        register(r, () -> EntityLittleKellyMC.TYPE, "little_kelly_mc_spawn_egg", 0xff99ff, 0x99ff66);
        register(r, () -> EntityLittleLizardGaming.TYPE, "little_lizard_gaming_spawn_egg", 0x009933, 0xccffcc);
        register(r, () -> EntityMaxTheMonkey.TYPE, "max_the_monkey_spawn_egg", 0xcc6600, 0xffcc99);
        register(r, () -> EntitySharky.TYPE, "sharky_spawn_egg", 0x6666ff, 0x00ccff);
        register(r, () -> EntityTinyTurtle.TYPE, "tiny_turtle_spawn_egg", 0x006600, 0x994d00);
        register(r, () -> EntityExplodingTNT.TYPE, "exploding_tnt_spawn_egg", 0xff0000, 0x000000);
        register(r, () -> EntityMrWoofless.TYPE, "mr_woofless_spawn_egg", 0x3366ff, 0xffaa80);
        register(r, () -> EntityLachlan.TYPE, "lachlan_spawn_egg", 0xff944d, 0xffcc99);
        register(r, () -> EntityVikkstar123.TYPE, "vikkstar123_spawn_egg", 0x005ce6, 0xffcc00);
        register(r, () -> EntityPeteZahHutt.TYPE, "pete_zah_hutt_spawn_egg", 0xccff99, 0x66ff66);
        register(r, () -> EntityPinkSheep.TYPE, "pink_sheep_spawn_egg", 0xff00ff, 0x330033);
        register(r, () -> EntityThnxCya.TYPE, "thnx_cya_spawn_egg", 0x00cc66, 0x333300);
        register(r, () -> EntityStampylonghead.TYPE, "stampylonghead_spawn_egg", 0xffcc00, 0xff9933);
        register(r, () -> EntitySSundee.TYPE, "ssundee_spawn_egg", 0x000000, 0xcc6600);
        register(r, () -> EntityPrestonPlayz.TYPE, "preston_playz_spawn_egg", 0xff0000, 0xff6600);
        register(r, () -> EntityLDShadowLady.TYPE, "ldshadow_lady_spawn_egg", 0xcc99ff, 0x000066);
        register(r, () -> EntityIhasCupquake.TYPE, "ihas_cupquake_spawn_egg", 0xff66ff, 0x66ff66);
        register(r, () -> EntityTewity.TYPE, "tewity_spawn_egg", 0xffcc00, 0xffff1a);
        register(r, () -> EntityFrizzleandpop.TYPE, "frizzleandpop_spawn_egg", 0xffcc00, 0x86b300);
        register(r, () -> EntityBajanCanadian.TYPE, "bajan_canadian_spawn_egg", 0xe60000, 0x000000);
        register(r, () -> EntityAlexirCraft.TYPE, "alexir_craft_spawn_egg", 0xcc00cc, 0x330033);
        register(r, () -> EntityJeromeASF.TYPE, "jerome_asf_spawn_egg", 0xb37700, 0xffad33);
        register(r, () -> EntityLogDotZip.TYPE, "log_dot_zip_spawn_egg", 0xff3333, 0xffaa00);
        register(r, () -> EntityPopularMMO.TYPE, "popular_mmo_spawn_egg", 0x262626, 0x005580);
        register(r, () -> EntityAntVenom.TYPE, "ant_venom_spawn_egg", 0x77b300, 0x111a00);
        register(r, () -> EntityCaptainSparklez.TYPE, "captain_sparklez_spawn_egg", 0xff4d4d, 0xffffcc);
        register(r, () -> EntityGhost.TYPE, "ghost_spawn_egg", 0x4d0000, 0x000000);
        register(r, () -> EntityDanTDM.TYPE, "dan_tdm_spawn_egg", 0x66ffff, 0xffffff);
        register(r, () -> EntitySerialPlayer.TYPE, "serial_player_spawn_egg", 0xcc9900, 0xffff66);
        register(r, () -> EntitySuperGirlyGamer.TYPE, "super_girly_gamer_spawn_egg", 0xff33cc, 0xe6005c);
        register(r, () -> EntityISquid.TYPE, "isquid_spawn_egg", 0x000066, 0x000000);
        register(r, () -> EntitySkyDoesMinecraft.TYPE, "sky_does_minecraft_spawn_egg", 0xffff33, 0x000000);
        register(r, () -> EntityTruemu.TYPE, "truemu_spawn_egg", 0x0066ff, 0xff9933);
        register(r, () -> EntityLuckyMob.TYPE, "luckymob_spawn_egg", 0x0, 0x0);
    }
}

package thvardhan.ytluckyblocks;

import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.Heightmap;

import java.util.Random;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
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

public class CommonProxy {

    public static ItemGroup tabYTStuffMod = new TabYTStuffMod();
    public static ItemGroup tabYtStuffArmor = new TabYTStuffArmor();

    public void onCommonSetup(FMLCommonSetupEvent event) {
        registerMonsterSpawnPlacements();
    }

    /**
     * Same idea as Alex's Mobs {@code AMEntityRegistry} static init: register
     * {@link EntitySpawnPlacementRegistry} for each mob so vanilla {@link net.minecraft.item.SpawnEggItem} works.
     */
    private static void registerMonsterSpawnPlacements() {
        registerGroundMonster(EntityScubaSteve.TYPE);
        registerGroundMonster(EntityLittleRopo.TYPE);
        registerGroundMonster(EntityMrCrainer.TYPE);
        registerGroundMonster(EntityBabyAngel.TYPE);
        registerGroundMonster(EntityAphmau.TYPE);
        registerGroundMonster(EntityBabyDuck.TYPE);
        registerGroundMonster(EntityBabyLeah.TYPE);
        registerGroundMonster(EntityBabyMax.TYPE);
        registerGroundMonster(EntityCassieTheCat.TYPE);
        registerGroundMonster(EntityDonutTheDog.TYPE);
        registerGroundMonster(EntityEvilLittleKelly.TYPE);
        registerGroundMonster(EntityLittleAlly.TYPE);
        registerGroundMonster(EntityLittleCarlyMC.TYPE);
        registerGroundMonster(EntityLittleDonny.TYPE);
        registerGroundMonster(EntityLittleKellyMC.TYPE);
        registerGroundMonster(EntityLittleLizardGaming.TYPE);
        registerGroundMonster(EntityMaxTheMonkey.TYPE);
        registerGroundMonster(EntitySharky.TYPE);
        registerGroundMonster(EntityTinyTurtle.TYPE);
        registerGroundMonster(EntityExplodingTNT.TYPE);
        registerGroundMonster(EntityMrWoofless.TYPE);
        registerGroundMonster(EntityLachlan.TYPE);
        registerGroundMonster(EntityVikkstar123.TYPE);
        registerGroundMonster(EntityPeteZahHutt.TYPE);
        registerGroundMonster(EntityPinkSheep.TYPE);
        registerGroundMonster(EntityThnxCya.TYPE);
        registerGroundMonster(EntityStampylonghead.TYPE);
        registerGroundMonster(EntitySSundee.TYPE);
        registerGroundMonster(EntityPrestonPlayz.TYPE);
        registerGroundMonster(EntityLDShadowLady.TYPE);
        registerGroundMonster(EntityIhasCupquake.TYPE);
        registerGroundMonster(EntityTewity.TYPE);
        registerGroundMonster(EntityFrizzleandpop.TYPE);
        registerGroundMonster(EntityBajanCanadian.TYPE);
        registerGroundMonster(EntityAlexirCraft.TYPE);
        registerGroundMonster(EntityJeromeASF.TYPE);
        registerGroundMonster(EntityLogDotZip.TYPE);
        registerGroundMonster(EntityPopularMMO.TYPE);
        registerGroundMonster(EntityAntVenom.TYPE);
        registerGroundMonster(EntityCaptainSparklez.TYPE);
        registerGroundMonster(EntityGhost.TYPE);
        registerGroundMonster(EntityDanTDM.TYPE);
        registerGroundMonster(EntitySerialPlayer.TYPE);
        registerGroundMonster(EntitySuperGirlyGamer.TYPE);
        registerGroundMonster(EntityISquid.TYPE);
        registerGroundMonster(EntitySkyDoesMinecraft.TYPE);
        registerGroundMonster(EntityTruemu.TYPE);
        registerGroundMonster(EntityLuckyMob.TYPE);
    }

    private static void registerGroundMonster(EntityType<? extends MonsterEntity> type) {
        if (type == null) {
            return;
        }
        EntitySpawnPlacementRegistry.register(type,
                EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                CommonProxy::allowMonsterSpawnPlacement);
    }

    /**
     * Predicate shape matches Alex's Mobs spawn placement methods ({@code IWorld}, not only {@link IServerWorld}).
     * Delegates to {@link MonsterEntity#checkMonsterSpawnRules} when the world is a server level.
     */
    private static <T extends MonsterEntity> boolean allowMonsterSpawnPlacement(EntityType<T> entityType, IWorld world,
            SpawnReason reason, BlockPos pos, Random random) {
        if (!(world instanceof IServerWorld)) {
            return false;
        }
        return MonsterEntity.checkMonsterSpawnRules(entityType, (IServerWorld) world, reason, pos, random);
    }

}

package thvardhan.ytluckyblocks;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import thvardhan.ytluckyblocks.entity.EntityLuckyMob;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "ytluckyblocks";
    public static final String VERSION = "6.1.2";
    public static final String NAME = "YouTuber's Lucky Blocks Mod";

    public static CommonProxy PROXY;

    private static final ImmutableSet<ResourceLocation> LUCKY_MOB_SPAWN_BIOMES = ImmutableSet.of(
            Biomes.PLAINS.location(),
            Biomes.RIVER.location(),
            Biomes.DESERT.location(),
            Biomes.MOUNTAINS.location(),
            Biomes.FOREST.location(),
            Biomes.TAIGA.location(),
            Biomes.FROZEN_RIVER.location(),
            Biomes.SNOWY_TUNDRA.location(),
            Biomes.SNOWY_MOUNTAINS.location(),
            Biomes.SAVANNA.location()
    );

    public Main() {
        PROXY = DistExecutor.runForDist(
                () -> () -> new ClientProxy(),
                () -> () -> new ServerProxy()
        );
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::onCommonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> PROXY.onCommonSetup(event));
    }

    @SubscribeEvent
    public void onBiomeLoading(BiomeLoadingEvent event) {
        ResourceLocation name = event.getName();
        if (name == null) {
            return;
        }
        if (!LUCKY_MOB_SPAWN_BIOMES.contains(name)) {
            return;
        }
        if (EntityLuckyMob.TYPE == null) {
            return;
        }
        // Matches corrected 1.12.2 tuning: moderate weight vs other monsters, small pack so placement succeeds.
        event.getSpawns().addSpawn(EntityClassification.MONSTER,
                new MobSpawnInfo.Spawners(EntityLuckyMob.TYPE, 35, 1, 2));
    }
}

package thvardhan.ytluckyblocks;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.entity.model.*;
import thvardhan.ytluckyblocks.entity.render.*;
import thvardhan.ytluckyblocks.items.render.ItemRenderRegistry;
import thvardhan.ytluckyblocks.render.blocks.BlockRenderRegister;


public class ClientProxy extends CommonProxy {


    @Override
    public void preInit(FMLPreInitializationEvent e) {


        super.preInit(e);

    }


    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        BlockRenderRegister.registerBlockRenderer();
        ItemRenderRegistry.registerItemRender();


        RenderingRegistry.registerEntityRenderingHandler(EntityScubaSteve.class, new EntityScubaSteveRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLittleRopo.class, new EntityLittleRopoRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMrCrainer.class, new EntityMrCrainerRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBabyAngel.class, new EntityBabyAngelRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAphmau.class, new EntityAphmauRender(new ModelBiped(), 0.5F));


        RenderingRegistry.registerEntityRenderingHandler(EntityBabyDuck.class, new EntityBabyDuckRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBabyLeah.class, new EntityBabyLeahRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBabyMax.class, new EntityBabyMaxRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCassieTheCat.class, new EntityCassieTheCatRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDonutTheDog.class, new EntityDonutTheDogRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEvilLittleKelly.class, new EntityEvilLittleKellyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLittleAlly.class, new EntityLittleAllyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLittleCarlyMC.class, new EntityLittleCarlyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLittleDonny.class, new EntityLittleDonnyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLittleKellyMC.class, new EntityLittleKellyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLittleLizardGaming.class, new EntityLittleLizardGamingRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMaxTheMonkey.class, new EntityMaxTheMonkeyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySharky.class, new EntitySharkyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTinyTurtle.class, new EntityTinyTurtleRender(new ModelBiped(), 0.5F));


        RenderingRegistry.registerEntityRenderingHandler(EntityExplodingTNT.class, new EntityExplodingTNTRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMrWoofless.class, new EntityMrWooflessRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLachlan.class, new EntityLachlanRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVikkstar123.class, new EntityVikkstar123Render(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPeteZahHutt.class, new EntityPeteZahHuttRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPinkSheep.class, new EntityPinkSheepRender(new ModelBiped(), 0.5F));


        RenderingRegistry.registerEntityRenderingHandler(EntityIhasCupquake.class, new EntityIhasCupquakeRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLDShadowLady.class, new EntityLDShadowLadyRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPrestonPlayz.class, new EntityPrestonPlayzRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySSundee.class, new EntitySSundeeRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityStampylonghead.class, new EntityStampylongheadRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityThnxCya.class, new EntityThnxCyaRender(new ModelBiped(), 0.5F));


        RenderingRegistry.registerEntityRenderingHandler(EntityBajanCanadian.class, new EntityBajanCanadianRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrizzleandpop.class, new EntityFrizzleandpopRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTewity.class, new EntityTewityRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAlexirCraft.class, new EntityAlexircraftRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJeromeASF.class, new EntityJeromeRender(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLuckyMob.class, new EntityLuckyMobRender(new EntityLuckyMobModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTruemu.class, new EntityTruemuRender(new EntityTruemuModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityISquid.class, new EntityISquidRender(new EntityISquidModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkyDoesMinecraft.class, new EntitySkyDoesMinecraftRender(new EntitySkyDoesMinecraftModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySuperGirlyGamer.class, new EntitySuperGirlyGamerRender(new EntitySuperGirlyGamerModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerialPlayer.class, new EntitySerialPlayerRender(new EntitySerialPlayerModel(), 0.1F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDanTDM.class, new EntityDanTDMRender(new EntityDanTDMModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new EntityGhostRender(new EntityGhostModel(), 0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaptainSparklez.class, new EntityCaptainSparklezRender(new EntityCaptiainSparklezModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLogDotZip.class, new EntityLogDotZipRender(new EntityLogDotZipModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPopularMMO.class, new EntityPopularMMORender(new EntityPopularMMOModel(), 0.5F));

        RenderingRegistry.registerEntityRenderingHandler(EntityAntVenom.class, new EntityAntVenomRender(new EntityAntVenomModel(), 0.8F));

    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }


}
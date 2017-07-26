package thvardhan.ytluckyblocks.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.init.ModBlocks;

public class BlockRenderRegister {

    public static void registerBlockRenderer() {
        reg(ModBlocks.luckyPressurePlate);
        reg(ModBlocks.scubaSteveLuckyBlock);
        reg(ModBlocks.littleRopoLuckyBlock);
        reg(ModBlocks.mrCrainerLuckyBlock);
        reg(ModBlocks.aphmauLuckyBlock);
        reg(ModBlocks.littleAngelLuckyBlock);

        reg(ModBlocks.youtubeLuckyBlock);
        reg(ModBlocks.mic);
        reg(ModBlocks.youtube);
        reg(ModBlocks.goldButton);
        reg(ModBlocks.ironButton);
        reg(ModBlocks.diamondButton);
        reg(ModBlocks.serialPlayerLuckyBlock);
        reg(ModBlocks.popularMMOLuckyBlock);
        reg(ModBlocks.skyDoesMinecraftLuckyBlock);
        reg(ModBlocks.danTDMLuckyBlock);
        reg(ModBlocks.gamingWithJenLuckyBlock);
        reg(ModBlocks.iBallisticSquidLuckyBlock);
        reg(ModBlocks.antVenomLuckyBlock);
        reg(ModBlocks.captainSparkelzLuckyBlock);
        reg(ModBlocks.trueMuLuckyBlock);
        reg(ModBlocks.alexircraftLuckyBlock);
        reg(ModBlocks.bajanCanadianLuckyBlock);
        reg(ModBlocks.frizzleandpopLuckyBlock);
        reg(ModBlocks.jeromeASFLuckyBlock);
        reg(ModBlocks.tewityLuckyBlock);
        reg(ModBlocks.iHasCupcakeLuckyBlock);
        reg(ModBlocks.lDShadowLadyLuckyBlock);
        reg(ModBlocks.prestonPlayzLuckyBlock);
        reg(ModBlocks.sSundeeLuckyBlock);
        reg(ModBlocks.stampylongheadLuckyBlock);
        reg(ModBlocks.thnxCyaLuckyBlock);
        reg(ModBlocks.exploadingTNTLuckyBlock);
        reg(ModBlocks.lachlanLuckyBlock);
        reg(ModBlocks.mrwooflessLuckyBlock);
        reg(ModBlocks.petaZahHuttLuckyBlock);
        reg(ModBlocks.pinkSheepYTLuckyBlock);
        reg(ModBlocks.vikkstar123LuckyBlock);

        reg(ModBlocks.babyDuckLuckyBlock);
        reg(ModBlocks.babyLeahLuckyBlock);
        reg(ModBlocks.babyMaxLuckyBlock);
        reg(ModBlocks.cassieTheCatLuckyBlock);
        reg(ModBlocks.donutTheDogLuckyBlock);
        reg(ModBlocks.evilLittleKellyLuckyBlock);
        reg(ModBlocks.littleAllyLuckyBlock);
        reg(ModBlocks.littleCarlyMcLuckyBlock);
        reg(ModBlocks.littleDonnyLuckyBlock);
        reg(ModBlocks.littleKellyMcLuckyBlock);
        reg(ModBlocks.littleLizardGamingLuckyBlock);
        reg(ModBlocks.maxTheMonkeyLuckyBlock);
        reg(ModBlocks.sharkyLuckyBlock);
        reg(ModBlocks.tinyTurtleLuckyBlock);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));

    }

}

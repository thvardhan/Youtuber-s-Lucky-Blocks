package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import thvardhan.ytluckyblocks.CommonProxy;

import java.util.Random;

public class MicBlock extends Block {

    public MicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);

        this.setLightLevel(1F);
    }

    public MicBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 20, 10000);
    }

    public MicBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }


    @Override
    public boolean isVisuallyOpaque() {
        return false;
    }


    @Override
    public boolean getTickRandomly() {
        return true;
    }

    @Override
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        super.randomDisplayTick(stateIn, worldIn, pos, rand);

        worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, (double) pos.getX() + 0.5D, (double) pos.getY() + 2.0D, (double) pos.getZ() + 0.5D, (double) ((float) +rand.nextFloat()) - 0.5D, (double) (-rand.nextFloat() - 1.0F), (double) ((float) +rand.nextFloat()) - 0.5D);

    }


}

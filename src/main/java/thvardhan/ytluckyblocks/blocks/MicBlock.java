package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
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
        this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
        this.setLightLevel(1F);
    }

    public MicBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 20, 10000);
    }

    public MicBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean canProvidePower() {
        return true;
    }


    @Override
    public boolean getTickRandomly() {
        return true;
    }

    @Override
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {

        super.randomDisplayTick(worldIn, pos, state, rand);

        worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, (double) pos.getX() + 0.5D, (double) pos.getY() + 2.0D, (double) pos.getZ() + 0.5D, (double) ((float) +rand.nextFloat()) - 0.5D, (double) ((float) -rand.nextFloat() - 1.0F), (double) ((float) +rand.nextFloat()) - 0.5D, new int[0]);


    }


}

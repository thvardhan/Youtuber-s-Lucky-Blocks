package thvardhan.ytluckyblocks.blocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import thvardhan.ytluckyblocks.CommonProxy;

import java.util.Random;

public class MicBlock extends Block {

    public MicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> 15).randomTicks());
    }

    public MicBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 20, 10000);
    }

    public MicBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
        super.animateTick(state, worldIn, pos, rand);
        worldIn.addParticle(ParticleTypes.ENCHANT, (double) pos.getX() + 0.5D, (double) pos.getY() + 2.0D, (double) pos.getZ() + 0.5D, (double) ((float) +rand.nextFloat()) - 0.5D, (double) (-rand.nextFloat() - 1.0F), (double) ((float) +rand.nextFloat()) - 0.5D);
    }
}

package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import net.minecraftforge.common.ToolType;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MicBlock extends Block {

    public MicBlock() {
        super(Properties.create(Material.ROCK)
                        .hardnessAndResistance(20, 10000)
                        .setRequiresTool()
                        .harvestLevel(0)
                        .harvestTool(ToolType.PICKAXE)
                        .setLightLevel(state -> 12));
    }
    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        super.animateTick(stateIn, worldIn, pos, rand);

        double x = (double) pos.getX() + 0.5D;
        double y = (double) pos.getY() + 2.0D;
        double z = (double) pos.getZ() + 0.5D;
        double xOffset = rand.nextFloat() - 0.5D;
        double yOffset = -rand.nextFloat() - 1.0F;
        double zOffset = rand.nextFloat() - 0.5D;

        worldIn.addParticle(ParticleTypes.ENCHANT, x, y, z, xOffset, yOffset, zOffset);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.create(0.1D, 0.0D, 0.0D, 0.9D, 1.0D, 1.0D);
    }
}
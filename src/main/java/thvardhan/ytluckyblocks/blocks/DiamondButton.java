package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import net.minecraftforge.common.ToolType;

import java.util.Collections;
import java.util.List;

public class DiamondButton extends Block {

    public DiamondButton() {
        super(Properties.create(Material.ROCK)
                        .hardnessAndResistance(20, 10000)
                        .setRequiresTool()
                        .harvestLevel(0)
                        .harvestTool(ToolType.PICKAXE)
                        .setLightLevel(state -> 12));
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
        return VoxelShapes.create(0, 0.1, 0.5, 1, 0.8, 0.6);
    }

}
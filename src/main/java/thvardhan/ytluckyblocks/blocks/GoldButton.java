package thvardhan.ytluckyblocks.blocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.Main;

public class GoldButton extends Block {

    public GoldButton(String unlocalizedName, Material material, float hardness, float resistance) {
        super(AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int) (15.0F * (1F))));
    }

    public GoldButton(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 20, 10000);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader level, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.box(0, 0.1, 0.5, 1, 0.8, 0.6);
    }

    public GoldButton(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    public Item createItemBlock() {
        return new BlockItem(this, new net.minecraft.item.Item.Properties().tab(CommonProxy.tabYTStuffMod)).setRegistryName(new ResourceLocation(Main.MODID, "gold_button_block"));
    }
}

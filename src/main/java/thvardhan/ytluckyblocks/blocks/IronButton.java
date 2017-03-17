package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thvardhan.ytluckyblocks.CommonProxy;

public class IronButton extends Block {


    public IronButton(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        //  this.setBlockBounds(0, 0.1F, 0.5F, 1, 0.8F, 0.6F);
        this.setLightLevel(1F);
    }

    public IronButton(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 20, 10000);
    }

    public IronButton(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isVisuallyOpaque() {
        return false;
    }

}

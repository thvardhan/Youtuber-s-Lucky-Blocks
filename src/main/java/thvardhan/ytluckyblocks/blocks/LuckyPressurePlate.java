package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;

import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LuckyPressurePlate extends Block {

    public LuckyPressurePlate(String unlocalizedName, Material material, float hardness, float resistance) {
        super(AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int) (15.0F * (0F))));
        //      this.setBlockBounds(0.03f, 0, 0.03f, 0.93F, 0.2F, 0.93F);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader level, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.box(0.03d, 0.0d, 0.03d, 0.93d, 0.2d, 0.93d);
    }

    public LuckyPressurePlate(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public LuckyPressurePlate(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    private void tryActivate(World worldIn, BlockPos pos, Entity entityIn) {
        if (worldIn.isClientSide() || !(entityIn instanceof PlayerEntity)) {
            return;
        }
        if (!worldIn.getBlockState(pos).is(this)) {
            return;
        }

        ExtraFunctions.setOneBlock(worldIn, pos, Blocks.AIR);


        //GOLDENAPPLE FAKE!


        Random rand = new Random();

        switch (rand.nextInt(51)) {

            default: {
                ExtraFunctions.chat("EMPTY", (PlayerEntity) entityIn);
            }
            case 0: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 1: {
                ExtraFunctions.deathHole(worldIn, (PlayerEntity) entityIn);
                break;
            }
            case 2: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 3: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
                break;
            }
            case 4: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 5: {
                ExtraFunctions.fireCamp(worldIn, (PlayerEntity) entityIn);
                break;
            }
            case 6: {
                ExtraFunctions.summonTammedWolfs(worldIn, (PlayerEntity) entityIn, 21, pos);
                break;
            }
            case 7: {
                ExtraFunctions.tpPlayerInGround((PlayerEntity) entityIn);
                break;
            }
            case 8: {
                ExtraFunctions.tpPlayer((PlayerEntity) entityIn);
                break;
            }
            case 9: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.DIAMOND), 40, 1, 4);
                break;
            }
            case 10: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.EMERALD), 15, 1, 6);
                break;
            }
            case 11: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.babyDuckLuckyBlock);
                break;
            }
            case 12: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                ExtraFunctions.chat("Look Up ^", (PlayerEntity) entityIn);
                break;
            }
            case 13: {
                ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()), Blocks.LAVA);
                break;
            }
            case 14: {

                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.tntNearby(worldIn, pos, 150, (PlayerEntity) entityIn, rand);
                break;
            }
            case 16: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 19: {
                ExtraFunctions.summonTammedWolfs(worldIn, (PlayerEntity) entityIn, 21, pos);
                break;
            }
            case 20: {
                ExtraFunctions.obsidianCageStruct(worldIn, (PlayerEntity) entityIn);
                break;
            }
            case 21: {
                ExtraFunctions.sandRain(worldIn, (PlayerEntity) entityIn);
                break;
            }
            case 22: {
                ExtraFunctions.tntFix(worldIn, pos, 5, (PlayerEntity) entityIn);
                break;
            }
            case 23: {
                ExtraFunctions.chat("DONT EAT ME! I BEG! :3", (PlayerEntity) entityIn);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.GOLDEN_APPLE, "apule", ExtraFunctions.enchantmentByLegacyNumericId(20), 60);
                break;
            }
            case 24: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ExtraFunctions.randomBlock()));
                break;
            }
            case 25: {
                ExtraFunctions.slimeFort(worldIn, (PlayerEntity) entityIn);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_PICKAXE));
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_SWORD));
                break;
            }
            case 29: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.rainbowBlade, "Rainbow", ExtraFunctions.enchantmentByLegacyNumericId(16), 10);
                break;
            }
            case 30: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 34: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 35: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 41: {
                ExtraFunctions.summonLuckyMobs(worldIn, 5, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.WHEAT.asItem()));
                break;
            }
            case 43: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.JACK_O_LANTERN);
                break;
            }
            case 44: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.END_PORTAL);
                break;
            }
            case 45: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENDER_CHEST);
                break;
            }
            case 46: {
                ExtraFunctions.tpPlayerInGround((PlayerEntity) entityIn);
                break;
            }
            case 47: {
                ExtraFunctions.orcArmy(worldIn, pos, 25, rand);
                break;
            }
            case 48: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 49: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 25, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.fireCamp(worldIn, (PlayerEntity) entityIn);
                break;
            }
        }
    }

    @Override
    public void entityInside(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        tryActivate(worldIn, pos, entityIn);
        super.entityInside(state, worldIn, pos, entityIn);
    }

    @Override
    public void fallOn(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        tryActivate(worldIn, pos, entityIn);
        super.fallOn(worldIn, pos, entityIn, fallDistance);
    }
}

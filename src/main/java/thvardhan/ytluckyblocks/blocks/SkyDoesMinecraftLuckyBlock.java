package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class SkyDoesMinecraftLuckyBlock extends Block {
    public SkyDoesMinecraftLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public SkyDoesMinecraftLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public SkyDoesMinecraftLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
@OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i < 3; ++i) {
            int j = rand.nextInt(2) * 2 - 1;
            int k = rand.nextInt(2) * 2 - 1;
            double d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
            double d1 = (double) ((float) pos.getY() + rand.nextFloat());
            double d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) k;
            double d3 = (double) (rand.nextFloat() * (float) j);
            double d4 = ((double) rand.nextFloat() - 0.5D) * 0.125D;
            double d5 = (double) (rand.nextFloat() * (float) k);
            worldIn.addParticle(ParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
        }
    }

    @Override
    public void playerWillDestroy(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, net.minecraft.entity.player.PlayerEntity player) {
        super.playerWillDestroy(world, pos, state, player);
        LuckyBlock.creativeLuckyBreak(world, pos, player, () -> drops(world, pos, player));
    }




        @Override
    public void playerDestroy(net.minecraft.world.World world, net.minecraft.entity.player.PlayerEntity player, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, @javax.annotation.Nullable net.minecraft.tileentity.TileEntity blockEntity, net.minecraft.item.ItemStack tool) {
        if (!world.isClientSide() && player != null && !(player instanceof FakePlayer) && !player.abilities.instabuild) {

            world.removeBlock(pos, false);
            drops(world, pos, player);
        }
    }

    private void drops(World worldIn, BlockPos pos, PlayerEntity player) {


        Random rand = new Random();


        switch (rand.nextInt(55)) {
            default: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 0: {

                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 2: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 3: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.GOLD_INGOT, TextFormatting.GOLD + "Butter", ExtraFunctions.enchantmentByLegacyNumericId(19), 10);
                break;
            }
            case 4: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 5: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 6: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 9: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.popularMMOLuckyBlock);
                break;
            }
            case 10: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 11: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, ModItems.devilSword, 1, 0, 0);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySkyDoesMinecraft.TYPE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 14: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 15: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 19: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 20: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 100, worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.tntFix(worldIn, pos, 1, player);
                break;
            }
            case 22: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.tntNearby(worldIn, pos, 52, player, rand);
                break;
            }
            case 24: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityTruemu.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 27: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 1, pos);
                break;
            }
            case 28: {
                ExtraFunctions.orcArmy(worldIn, pos, 25, rand);
                break;
            }
            case 29: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.WHITE_BED);
                break;
            }
            case 30: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityAntVenom.TYPE.create(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySkyDoesMinecraft.TYPE.create(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 32: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(19), ExtraFunctions.enchantmentByLegacyNumericId(17), ExtraFunctions.enchantmentByLegacyNumericId(18)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), e, 4, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.LAVA);
                break;
            }
            case 37: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 38: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 39: {
                ExtraFunctions.tntRain(worldIn, pos, 5, 10, player);
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsNearby(EntitySkyDoesMinecraft.TYPE.create(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 41: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.summonMobsNearby(EntityType.ZOMBIE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 52, worldIn, pos, rand);
                break;
            }
            case 45: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 25, worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.GOLD_BLOCK, 64, 1, 25);
                break;
            }
            case 49: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySuperGirlyGamer.TYPE.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 25, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyLeggings));
                break;
            }

        }

    }


//method ends
}

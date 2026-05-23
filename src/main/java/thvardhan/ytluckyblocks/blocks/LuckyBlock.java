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
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LuckyBlock extends Block {
    public LuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public LuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 18000000);
    }

    public LuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    /**
     * 1.11 used {@code removedByPlayer}, which runs for creative breaks. In 1.16 creative does not call
     * {@link #playerDestroy}; call this from {@link #playerWillDestroy} so drops still run in creative.
     */
    public static void creativeLuckyBreak(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.player.PlayerEntity player, java.lang.Runnable runDropsAfterAir) {
        if (world.isClientSide() || player == null || player instanceof FakePlayer || !player.abilities.instabuild) {
            return;
        }
        world.removeBlock(pos, false);
        runDropsAfterAir.run();
    }

    @Override
    public void playerWillDestroy(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, net.minecraft.entity.player.PlayerEntity player) {
        super.playerWillDestroy(world, pos, state, player);
        creativeLuckyBreak(world, pos, player, () -> drops(world, pos, player));
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


        switch (rand.nextInt(55)) {//you must have cases that is (4)-1=3

            default: {
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 52, worldIn, pos, rand);
                break;
            }
            case 0: {
                ExtraFunctions.summonMobsNearby(EntityGhost.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 1: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.DIAMOND_BLOCK, 10, 0, 0);
                break;
            }
            case 2: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.GOLD_BLOCK, 64, 1, 0);
                break;
            }
            case 3: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.COBBLESTONE, 128, 1, 2);
                break;
            }
            case 4: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.APPLE, "Super Apple", ExtraFunctions.enchantmentByLegacyNumericId(16), 10);
                break;
            }
            case 6: {
                ExtraFunctions.summonMobsNearby(EntityLogDotZip.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 7: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.MELON_SEEDS, "Seeds?", ExtraFunctions.enchantmentByLegacyNumericId(20), 20);
                break;
            }
            case 8: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 30, pos);
                break;
            }
            case 10: {
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.LAVA);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.WHITE_BED, 64, 0, 0);
                break;
            }
            case 13: {
                ExtraFunctions.summonMobsNearby(EntityLogDotZip.TYPE.create(worldIn), 51, worldIn, pos, rand);
                break;
            }
            case 14: {
                ExtraFunctions.summonMobsNearby(EntityLogDotZip.TYPE.create(worldIn), 21, worldIn, pos, rand);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 16: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 17: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.CAKE, 20, 0, 0);
                break;
            }
            case 18: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 19: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.swordBlack), 1, 0, 0);
                break;
            }
            case 20: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 52, worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.mic);
                break;
            }
            case 22: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_BOOTS, TextFormatting.BLUE + "Log.zip Not So Lucky Boots", ExtraFunctions.enchantmentByLegacyNumericId(2), 30);
                break;
            }
            case 23: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_CHESTPLATE, TextFormatting.BLUE + "Log.zip Not So Lucky Chestplate", ExtraFunctions.enchantmentByLegacyNumericId(7), 10);
                break;
            }
            case 24: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_LEGGINGS, TextFormatting.BLUE + "Log.zip Not So Lucky Leggings", ExtraFunctions.enchantmentByLegacyNumericId(3), 6);
            }
            case 25: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_HELMET, TextFormatting.BLUE + "Log.zip Not So Lucky Helmet", ExtraFunctions.enchantmentByLegacyNumericId(4), 15);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.BEACON.asItem()));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.BUCKET, 64, 0, 0);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.BUCKET, "You Found Me~!" + TextFormatting.AQUA, ExtraFunctions.enchantmentByLegacyNumericId(20), 10);
                break;
            }
            case 28: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 29: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
                break;
            }
            case 31: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 1, 0, 0);
                break;
            }
            case 32: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModBlocks.youtube), 30, 1, 5);
                break;
            }
            case 33: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);
                break;
            }
            case 34: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;
            }
            case 35: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
                break;
            }
            case 36: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.goldButton);
                break;
            }
            case 38: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 39: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.ENCHANTING_TABLE, 4, 0, 0);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.mic), 60, 1, 10);
                break;
            }
            case 41: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 43: {
                ItemStack[] stack = {new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_AXE)
                        , new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.BONE), new ItemStack(Items.GOLDEN_BOOTS),
                        new ItemStack(Items.DIAMOND_PICKAXE)};
                Enchantment[] ench = {ExtraFunctions.enchantmentByLegacyNumericId(35), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(49), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(50)
                        , ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(51), ExtraFunctions.enchantmentByLegacyNumericId(21)};


                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, ench, 8, pos, rand);


                break;
            }
            case 44: {

                ExtraFunctions.holeDeathTrap(worldIn, pos);
                ExtraFunctions.trollChat(player);

                break;
            }
            case 45: {
                ItemStack[] s = {new ItemStack(Items.STONE_AXE), new ItemStack(Items.STONE_HOE)
                        , new ItemStack(Items.STONE_PICKAXE), new ItemStack(Items.STONE_SWORD), new ItemStack(Items.DIAMOND_CHESTPLATE),
                        new ItemStack(Items.ACACIA_DOOR)};
                Enchantment[] ench = {ExtraFunctions.enchantmentByLegacyNumericId(35), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(49), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(50)
                        , ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(51), ExtraFunctions.enchantmentByLegacyNumericId(21)};


                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, ench, 8, pos, rand);


                break;
            }
            case 46: {


                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);

                break;
            }
            case 47: {

                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 49: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.popularMMOLuckyBlock);
                break;
            }
            case 50: {

                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logLeggings));
                break;
            }
        }
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


}

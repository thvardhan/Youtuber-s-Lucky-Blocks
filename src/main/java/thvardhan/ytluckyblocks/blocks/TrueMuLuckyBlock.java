package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.passive.RabbitEntity;
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

public class TrueMuLuckyBlock extends Block {
    public TrueMuLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public TrueMuLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public TrueMuLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.tntFix(worldIn, pos, 100, player);
                break;
            }
            case 3: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 4: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 5: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityTruemu.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 6: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 7: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(1)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytBoots), e, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytChestplate), e, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytHelmet), e, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytLeggings), e, 10, worldIn, pos);
                ExtraFunctions.chat("Congracts On Getting <GOD> Kit", player);
                break;
            }
            case 8: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 25, worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.DIAMOND_BLOCK, 10, 0, 0);

                break;
            }
            case 13: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.MELON_SEEDS, "Seeds?", ExtraFunctions.enchantmentByLegacyNumericId(20), 20);

                break;
            }
            case 14: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);

                break;
            }
            case 15: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.BUCKET, 64, 0, 0);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.BUCKET, "You Found Me~!" + TextFormatting.AQUA, ExtraFunctions.enchantmentByLegacyNumericId(20), 10);

                break;
            }
            case 16: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                ExtraFunctions.chat("Believe It Or Not I Think Its The Most Lucky Drop", player);
                break;
            }
            case 17: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEACON);
                break;
            }
            case 18: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySerialPlayer.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), 50, worldIn, pos);
                break;
            }
            case 21: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 30, 0, 0);
                break;
            }
            case 22: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 23: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, rand.nextBoolean());
                break;
            }
            case 24: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BARRIER);
                ExtraFunctions.chat("Its Barrier", player);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), rand.nextInt(25) + 1, worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.summonMobsNearby(EntityTruemu.TYPE.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 50, worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), 25, worldIn, pos);
                break;
            }
            case 31: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 32: {
                ExtraFunctions.chat("Ths r lky blks", player);
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 34: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 38: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 41: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.DRAGON_EGG.asItem()), 50, 1, 5);
                ExtraFunctions.chat("How Are You Going To Train These Many Dragons?", player);
                break;
            }
            case 43: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(33), ExtraFunctions.enchantmentByLegacyNumericId(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.SHEARS), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 44: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(2), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(7)};
                ItemStack[] s = {new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.DIAMOND_CHESTPLATE)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, e, 10, pos, rand);
                break;
            }
            case 45: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(33), ExtraFunctions.enchantmentByLegacyNumericId(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 46: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(17), ExtraFunctions.enchantmentByLegacyNumericId(18), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(21), ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(34)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), e, 10, worldIn, pos);

                break;
            }
            case 47: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.EMERALD_BLOCK, 5, 0, 0);

                break;
            }
            case 48: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 15, 0, 0);
                break;
            }
            case 49: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueLeggings));
                break;
            }

        }
    }//method ends
}

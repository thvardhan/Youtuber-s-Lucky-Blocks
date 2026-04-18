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
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class PopularMMOLuckyBlock extends Block {
    public PopularMMOLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public PopularMMOLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public PopularMMOLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 3: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 4: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 20, worldIn, pos);
                break;
            }
            case 5: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(30), worldIn, pos);
                break;
            }
            case 6: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 7: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(48), ExtraFunctions.enchantmentByLegacyNumericId(49), ExtraFunctions.enchantmentByLegacyNumericId(51)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BOW), e, rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_PICKAXE, "Ore Eater", ExtraFunctions.enchantmentByLegacyNumericId(35), 20);
                break;
            }
            case 9: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_PICKAXE, "Ore Placer", ExtraFunctions.enchantmentByLegacyNumericId(32), 30);
                break;
            }
            case 10: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(33), ExtraFunctions.enchantmentByLegacyNumericId(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.SHEARS), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 11: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(2), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(7)};
                ItemStack[] s = {new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.DIAMOND_CHESTPLATE)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, e, 10, pos, rand);
                break;
            }
            case 12: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(33), ExtraFunctions.enchantmentByLegacyNumericId(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 13: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(17), ExtraFunctions.enchantmentByLegacyNumericId(18), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(21), ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(34)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), e, 10, worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityAntVenom.TYPE.create(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 17: {
                ExtraFunctions.chat(TextFormatting.AQUA + "Oh Well", player);
                break;
            }
            case 18: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 19: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 20: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.mic);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.captainSparkelzLuckyBlock);
                break;
            }
            case 22: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 20, worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLogDotZip.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 26: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 27: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.BEACON);
                break;
            }
            case 28: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.EMERALD_BLOCK, 5, 0, 0);
                break;
            }
            case 29: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 34: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
                break;
            }
            case 35: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEACON);
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.GOLDEN_APPLE, 64, 1, 30);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.GOLDEN_CARROT, 5, 1, 5);
                break;
            }
            case 41: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.SADDLE));
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 51, worldIn, pos, rand);
                break;
            }
            case 46: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 47: {
                ExtraFunctions.tntRain(worldIn, pos, 10, 2, player);
                break;
            }
            case 48: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 49: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 25, pos);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 53, worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popLeggings));
                break;
            }

        }

    }//method ends
}

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
import thvardhan.ytluckyblocks.entity.EntityDonutTheDog;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.entity.EntityThnxCya;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class DonutTheDogLuckyBlock extends Block {
    public DonutTheDogLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public DonutTheDogLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public DonutTheDogLuckyBlock(String unlocalizedName) {
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
            worldIn.addParticle(ParticleTypes.CRIT, d0, d1, d2, d3, d4, d5);
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

        Enchantment[] e = new Enchantment[5];
        e[0] = ExtraFunctions.enchantmentByLegacyNumericId(50);
        e[1] = ExtraFunctions.enchantmentByLegacyNumericId(19);
        e[2] = ExtraFunctions.enchantmentByLegacyNumericId(48);
        e[3] = ExtraFunctions.enchantmentByLegacyNumericId(7);
        e[4] = ExtraFunctions.enchantmentByLegacyNumericId(21);


        Random rand = new Random();


        switch (rand.nextInt(51)) {

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
                ExtraFunctions.chat(TextFormatting.BLACK + "Special Troll", player);
                break;
            }
            case 3: {
                Enchantment[] e1 = {ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(2), ExtraFunctions.enchantmentByLegacyNumericId(1)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), e1, 5, worldIn, pos);
                break;
            }
            case 4: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.tntFix(worldIn, pos, 64, player);
                break;
            }
            case 6: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.orcArmy(worldIn, pos, 20, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.GOLDEN_APPLE, 15, 1, 5);
                break;
            }
            case 13: {
                ExtraFunctions.fireCamp(worldIn, player);
                break;
            }
            case 14: {
                ExtraFunctions.tntPlaceNearby(worldIn, pos, 700, rand);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 35, worldIn, pos, rand);
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
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.SKELETON.create(worldIn), 10, worldIn, pos);
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
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 28: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 30: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsNearby(EntityThnxCya.TYPE.create(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutHelmet));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutLeggings));
                break;
            }
            case 34: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutChestplate));
                break;
            }
            case 35: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.donutBoots));
                break;
            }
            case 36: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 37: {
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                break;
            }
            case 38: {
                ExtraFunctions.tntRain(worldIn, pos, 10, 1, player);
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 40: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
                break;
            }
            case 45: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityDonutTheDog.TYPE.create(worldIn), 40, worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }


        }//switch ends
    }//method end
}

package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityExplodingTNT;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class ExploadingTNTLuckyBlock extends Block {
    public ExploadingTNTLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public ExploadingTNTLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public ExploadingTNTLuckyBlock(String unlocalizedName) {
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
            worldIn.addParticle(ParticleTypes.WITCH, d0, d1, d2, d3, d4, d5);
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
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.summonMobsNearby(EntityExplodingTNT.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 1: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 2: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 3: {

                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1, 500));
                break;
            }
            case 4: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 5: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.diamondButton);
                break;
            }
            case 6: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.ironButton);
                break;
            }
            case 7: {
                ExtraFunctions.tntPlaceNearby(worldIn, pos, 150, rand);
                ExtraFunctions.tntFix(worldIn, pos, 1, player);
                ExtraFunctions.chat(TextFormatting.DARK_RED + "BLAST LIKE TNT :)", player);
                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 9: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 10: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 11: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsNearby(EntityType.ELDER_GUARDIAN.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 15: {
                ExtraFunctions.chat(TextFormatting.RED + "I AM A MOUSE ~!", player);
                break;
            }
            case 16: {
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                ExtraFunctions.tntFix(worldIn, pos, 12, player);
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GUNPOWDER));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.TNT_MINECART), 15, 0, 0);
                break;
            }
            case 19: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.TNT.asItem()), 15, 0, 0);
                break;
            }
            case 20: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);

                break;
            }
            case 22: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 23: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 24: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 25: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.REDSTONE), 64, 0, 0);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE), 25, 0, 0);
                break;
            }
            case 27: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 28: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DRAGON_EGG);
                break;
            }
            case 29: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_SWORD));
                break;
            }
            case 31: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.POPPY);
                break;
            }
            case 32: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.REDSTONE_BLOCK);
                break;
            }
            case 33: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsNearby(EntityType.ZOMBIE.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.SPONGE.asItem()));
                break;
            }
            case 39: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 10, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;
            }
            case 41: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.pinkSheepYTLuckyBlock);
                break;
            }
            case 42: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.tntPlaceNearby(worldIn, pos, 50, rand);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.TNT.asItem()), 30, 1, 2);
                break;
            }
            case 45: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModBlocks.pinkSheepYTLuckyBlock), 5, 0, 0);
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntBoots));
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntChestplate));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntHelmet));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntLeggings));
                break;
            }


        }//switch ends
    }//method end
}
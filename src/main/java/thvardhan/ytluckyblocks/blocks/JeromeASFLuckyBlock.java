package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import net.minecraft.util.DamageSource;
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
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class JeromeASFLuckyBlock extends Block {
    public JeromeASFLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public JeromeASFLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public JeromeASFLuckyBlock(String unlocalizedName) {
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
            worldIn.addParticle(ParticleTypes.ENCHANT, d0, d1, d2, d3, d4, d5);
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

        Enchantment[] e = new Enchantment[7];
        e[0] = ExtraFunctions.enchantmentByLegacyNumericId(50);
        e[2] = ExtraFunctions.enchantmentByLegacyNumericId(48);
        e[3] = ExtraFunctions.enchantmentByLegacyNumericId(7);
        e[4] = ExtraFunctions.enchantmentByLegacyNumericId(21);
        e[5] = ExtraFunctions.enchantmentByLegacyNumericId(16);
        e[6] = ExtraFunctions.enchantmentByLegacyNumericId(3);
        e[1] = ExtraFunctions.enchantmentByLegacyNumericId(18);

        Random rand = new Random();


        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytBoots), e, 10, worldIn, pos);
                ExtraFunctions.chat(TextFormatting.AQUA + "What is this? Defence or offence?", player);
                break;
            }
            case 1: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.NIGHT_VISION, 1200, 1, true, true));
                break;
            }
            case 2: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.POISON, 2000, 100, true, true));
                break;
            }
            case 3: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 4: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 5: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.GOLD_BLOCK);
                break;
            }
            case 6: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 2000, 200, true, true));
                break;
            }
            case 7: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.JUMP, 100, 200, true, true));
                ExtraFunctions.chat(TextFormatting.RED + "Hurry! JUMP! here will be lava in 2 seconds", player);
                break;
            }
            case 8: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.POISON, 1000, 20, true, true));
                break;
            }
            case 9: {
                player.hurt(DamageSource.OUT_OF_WORLD, Float.MAX_VALUE);
                break;
            }
            case 10: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 11: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 12: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 14: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordBlack), e, 9, worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_HOE), new Enchantment[]{ExtraFunctions.enchantmentByLegacyNumericId(19)}, 4, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1400, 50, true, true));
                break;
            }
            case 20: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, ModBlocks.alexircraftLuckyBlock, 5, 0, 0);
                break;
            }
            case 21: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 22: {
                ExtraFunctions.tntNearby(worldIn, pos, 400, player, rand);
                break;
            }
            case 23: {
                ExtraFunctions.chat(TextFormatting.BOLD + "This One Was Empty", player);
                break;
            }
            case 24: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                break;
            }
            case 28: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                break;
            }
            case 29: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 30: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
                break;
            }
            case 31: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 32: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 34: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.DAMAGE_BOOST, 1000, 20, true, true));
                break;
            }
            case 35: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 23, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), new Enchantment[]{ExtraFunctions.enchantmentByLegacyNumericId(16)}, rand.nextInt(50) + 40, worldIn, pos);
                break;
            }
            case 38: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 40, 0, 0);
                ExtraFunctions.chat(TextFormatting.GOLD + "Normal Apples ^^", player);
                break;
            }
            case 41: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 6, worldIn, pos, rand);
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 200, worldIn, pos, rand);
                break;
            }
            case 46: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 100, rand);
                break;
            }
            case 47: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 48: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.frizzleandpopLuckyBlock);
                break;
            }
            case 49: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 60, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordLogdotzip), e, 7, worldIn, pos);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeHelmet));
                break;
            }
            case 52: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.jeromeBoots, "Boots", ExtraFunctions.enchantmentByLegacyNumericId(0), 5);
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeChestplate));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeLeggings));
                break;
            }
            case 55: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.snowSword, "Icy", ExtraFunctions.enchantmentByLegacyNumericId(17), 10);
                break;
            }
            case 56: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.megaSword, "MegaKilla", ExtraFunctions.enchantmentByLegacyNumericId(16), 6);
                break;
            }
            case 57: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
                break;
            }
            case 58: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
                break;
            }
            case 59: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 60: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MILK_BUCKET), 50, 1, 2);
                ExtraFunctions.chat("Use these to clean any bad effects you get while opening these lucky blocks", player);
                break;
            }
            case 61: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 62: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 5, pos);
                break;
            }
            case 63: {
                ExtraFunctions.summonMobsNearby(EntityJeromeASF.TYPE.create(worldIn), 60, worldIn, pos, rand);
                break;
            }
            case 64: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BAKED_POTATO));
                ExtraFunctions.chat("Here, take this one potato (which you cant even plant :v) for your efforts", player);
                break;
            }
            case 65: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.POISONOUS_POTATO, "Eat Me!", ExtraFunctions.enchantmentByLegacyNumericId(19), 50);
                break;
            }
            case 66: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.FIRE_RESISTANCE, 1000, 20));
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                break;
            }
            case 68: {
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, new ItemStack[]{new ItemStack(ModItems.jeromeBoots), new ItemStack(ModItems.jeromeChestplate)}, e, 5, pos, rand);
                break;
            }
            case 69: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.jeromeChestplate), e, 10, worldIn, pos);
                break;
            }
            case 70: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 71: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 72: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 73: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 60, worldIn, pos);
                break;
            }
            case 74: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 75: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 76: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 77: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_SWORD, "I AM NOT DIAMOND", ExtraFunctions.enchantmentByLegacyNumericId(16), rand.nextInt(50) + 1);
                break;
            }
            case 78: {
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 79: {
                ExtraFunctions.summonMobsNearby(EntityType.ZOMBIE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 80: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.youtubeLuckyBlock));
                break;
            }
            case 81: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.alexircraftLuckyBlock);
                break;
            }
            case 82: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.WATER);
                break;
            }
            case 83: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 84: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 85: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeLeggings));
                break;
            }
            case 86: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.jeromeHelmet));
                break;
            }
            case 87: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 60, worldIn, pos);
                break;
            }
            case 88: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                ExtraFunctions.chat("KILL THE COW", player);
                break;
            }
            case 89: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 90: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.TNT.asItem()), 64, 1, 5);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 91: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 92: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.snowSword), e, 5, worldIn, pos);
                break;
            }
            case 93: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WHITE_BED), new Enchantment[]{ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(19)}, 4, worldIn, pos);
                break;
            }
            case 94: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.CAKE.asItem()));
                break;
            }
            case 95: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.DRAGON_EGG.asItem()));
                break;
            }
            case 96: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.BEDROCK.asItem()));
                break;
            }
            case 97: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN.asItem()), 64, 1, 50);
                break;
            }
            case 98: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityAntVenom.TYPE.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 99: {
                ExtraFunctions.summonMobsNearby(EntityJeromeASF.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 100: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }


        }//switch ends
    }//method end
}
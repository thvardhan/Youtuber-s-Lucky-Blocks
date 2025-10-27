package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import thvardhan.ytluckyblocks.ExtraFunctions;
import thvardhan.ytluckyblocks.RegistrationHandler;
import thvardhan.ytluckyblocks.entity.*;

import java.util.Random;

public class JeromeASFLuckyBlock extends Block {

    public JeromeASFLuckyBlock() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0, 10000)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE));
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i < 3; ++i) {
            int j = rand.nextInt(2) * 2 - 1;
            int k = rand.nextInt(2) * 2 - 1;

            double d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
            double d1 = (double) pos.getY() + rand.nextFloat();
            double d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) k;
            double d3 = (double) (rand.nextFloat() * (float) j);
            double d4 = ((double) rand.nextFloat() - 0.5D) * 0.125D;
            double d5 = (double) (rand.nextFloat() * (float) k);

            worldIn.addParticle(ParticleTypes.ENCHANT, d0, d1, d2, d3, d4, d5);
        }
    }


    @Override
    public void onBlockHarvested(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(world, pos, state, player);
        drops(world, pos, player);
    }

    private void drops(World worldIn, BlockPos pos, PlayerEntity player) {

        Enchantment[] e = new Enchantment[7];
        e[0] = Enchantments.FLAME;
        e[2] = Enchantments.POWER;
        e[3] = Enchantments.THORNS;
        e[4] = Enchantments.LOOTING;
        e[5] = Enchantments.SHARPNESS;
        e[6] = Enchantments.BLAST_PROTECTION;
        e[1] = Enchantments.BANE_OF_ARTHROPODS;

        Random rand = new Random();


        switch (rand.nextInt(102)) {

            case 0: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 1: {
                ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.YT_BOOTS.get()), e, 10, worldIn, pos);
                ExtraFunctions.chat(TextFormatting.AQUA + "What is this? Defence or offence?", player);
                break;
            }
            case 2: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.NIGHT_VISION, 1200, 1, true, true));
                break;
            }
            case 3: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.SPEED, 2000, 100, true, true));
                break;
            }
            case 4: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 5: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 6: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.GOLD_BLOCK);
                break;
            }
            case 7: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.SLOWNESS, 2000, 200, true, true));
                break;
            }
            case 8: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.JUMP_BOOST, 100, 200, true, true));
                ExtraFunctions.chat(TextFormatting.RED + "Hurry! JUMP! here will be lava in 2 seconds", player);
                break;
            }
            case 9: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.POISON, 1000, 20, true, true));
                break;
            }
            case 10: {
//                player.setDead();
                break;
            }
            case 11: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 12: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.YT_CHEST.get()));
                break;
            }
            case 15: {
                ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.BLACK_NEON_SWORD.get()), e, 9, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_HOE), new Enchantment[]{Enchantments.KNOCKBACK}, 4, worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 18: {
               // ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.BLINDNESS, 1400, 50, true, true));
                break;
            }
            case 21: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, RegistrationHandler.ALEXIRCRAFT_LUCKY_BLOCK.get(), 5, 0, 0);
                break;
            }
            case 22: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.tntNearby(worldIn, pos, 400, player, rand);
                break;
            }
            case 24: {
                ExtraFunctions.chat(TextFormatting.BOLD + "This One Was Empty", player);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST, 5, worldIn, pos, null);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.DEVIL_SWORD.get()));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.LEVIN_SWORD.get()));
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.MIC.get()));
                break;
            }
            case 29: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                break;
            }
            case 30: {
                ExtraFunctions.summonMobsNearby(new IronGolemEntity(EntityType.IRON_GOLEM,worldIn), 50, worldIn, pos, rand);
                break;
            }

            case 31: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
                break;
            }
            case 32: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 33: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 34: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 35: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.STRENGTH, 1000, 20, true, true));
                break;
            }
            case 36: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.summonMobsNearby(new SkeletonEntity(EntityType.SKELETON, worldIn), 23, worldIn, pos, rand);
                break;
            }

            case 38: {
                ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.DEVIL_SWORD.get()), new Enchantment[]{Enchantments.SHARPNESS}, rand.nextInt(50) + 40, worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER,rand.nextInt(5) + 1, worldIn, pos, null);
                break;
            }
            case 41: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 40, 0, 0);
                ExtraFunctions.chat(TextFormatting.GOLD + "Normal Apples ^^", player);
                break;
            }
            case 42: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsOnBreakBlock(RegistrationHandler.ISQUID.get(), rand.nextInt(10) + 1, worldIn, pos, null);
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(RegistrationHandler.POPULARMMOS.get(), worldIn), 6, worldIn, pos, rand);
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsNearby(new CreeperEntity(EntityType.CREEPER,worldIn), 200, worldIn, pos, rand);
                break;
            }
            case 47: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 100, rand);
                break;
            }
            case 48: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 49: {
               // ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.frizzleandpopLuckyBlock);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST, 60, worldIn, pos, null);
                break;
            }
            case 51: {
                ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.LOG_SWORD.get()), e, 7, worldIn, pos);
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.JEROME_HELM.get()));
                break;
            }
            case 53: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, RegistrationHandler.JEROME_BOOTS.get(), "Boots", Enchantments.PROTECTION, 5);
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.JEROME_CHEST.get()));
                break;
            }
            case 55: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.JEROME_LEGS.get()));
                break;
            }
            case 56: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, RegistrationHandler.SNOW_SWORD.get(), "Icy", Enchantments.SMITE, 10);
                break;
            }
            case 57: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, RegistrationHandler.MEGA_SWORD.get(), "MegaKilla", Enchantments.SHARPNESS, 6);
                break;
            }
            case 58: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.BATTLE_AXE.get()));
                break;
            }
            case 59: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.RAINBOW_SWORD.get()));
                break;
            }
            case 60: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 61: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MILK_BUCKET), 50, 1, 2);
                ExtraFunctions.chat("Use these to clean any bad effects you get while opening these lucky blocks", player);
                break;
            }
            case 62: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 63: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 5, pos);
                break;
            }
            case 64: {
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(RegistrationHandler.JEROMEASF.get(),worldIn), 60, worldIn, pos, rand);
                break;
            }
            case 65: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BAKED_POTATO));
                ExtraFunctions.chat("Here, take this one potato (which you cant even plant :v) for your efforts", player);
                break;
            }
            case 66: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.POISONOUS_POTATO, "Eat Me!", Enchantments.KNOCKBACK, 50);
                break;
            }
            case 67: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.FIRE_RESISTANCE, 1000, 20));
                break;
            }
            case 68: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1));
                break;
            }
            case 69: {
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, new ItemStack[]{new ItemStack(RegistrationHandler.JEROME_BOOTS.get()), new ItemStack(RegistrationHandler.JEROME_CHEST.get())}, e, 5, pos, rand);
                break;
            }
            case 70: {
                ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.JEROME_CHEST.get()), e, 10, worldIn, pos);
                break;
            }
            case 71: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 72: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 73: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 74: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.RABBIT, 60, worldIn, pos, rabbit -> {
                    rabbit.setRabbitType(99); // customize the rabbit
                });
                break;
            }
            case 75: {
                ExtraFunctions.summonMobsNearby(new CreeperEntity(EntityType.CREEPER,worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 76: {
                ExtraFunctions.summonMobsNearby(new IronGolemEntity(EntityType.IRON_GOLEM,worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 77: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 78: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_SWORD, "I AM NOT DIAMOND", Enchantments.SHARPNESS, rand.nextInt(50) + 1);
                break;
            }
            case 79: {
                ExtraFunctions.summonMobsNearby(new BlazeEntity(EntityType.BLAZE,worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 80: {
                ExtraFunctions.summonMobsNearby(new ZombieEntity(EntityType.ZOMBIE,worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 81: {
             //   ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.youtubeLuckyBlock));
                break;
            }
            case 82: {
                ExtraFunctions.setOneBlock(worldIn, pos, RegistrationHandler.ALEXIRCRAFT_LUCKY_BLOCK.get());
                break;
            }
            case 83: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.WATER);
                break;
            }
            case 84: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 85: {
                ExtraFunctions.summonMobsOnBreakBlock(RegistrationHandler.CAPTAIN_SPARKLEZ.get(), 10, worldIn, pos, null);
                break;
            }
            case 86: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.JEROME_LEGS.get()));
                break;
            }
            case 87: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.JEROME_HELM.get()));
                break;
            }
            case 88: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST, 60, worldIn, pos, null);
                break;
            }
            case 89: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                ExtraFunctions.chat("KILL THE COW", player);
                break;
            }
            case 90: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 91: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.TNT), 64, 1, 5);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 92: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 93: {
                ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.SNOW_SWORD.get()), e, 5, worldIn, pos);
                break;
            }
            case 94: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BLUE_BED), new Enchantment[]{Enchantments.SHARPNESS, Enchantments.KNOCKBACK}, 4, worldIn, pos);
                break;
            }
            case 95: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.CAKE));
                break;
            }
            case 96: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.DRAGON_EGG));
                break;
            }
            case 97: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.BEDROCK));
                break;
            }
            case 98: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN), 64, 1, 50);
                break;
            }
            case 99: {
                ExtraFunctions.summonMobsOnBreakBlock(RegistrationHandler.ANTVENNOM.get(), 1, worldIn, pos, null);
                break;
            }
            case 100: {
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(RegistrationHandler.JEROMEASF.get(),worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 101: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }


        }//switch ends
    }//method end
}

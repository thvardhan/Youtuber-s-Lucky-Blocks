package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeFluidState;
import net.minecraftforge.common.util.FakePlayer;

import thvardhan.ytluckyblocks.ExtraFunctions;
import thvardhan.ytluckyblocks.RegistrationHandler;
import thvardhan.ytluckyblocks.entity.EntityAlexirCraft;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntitySerialPlayer;

import java.util.Random;

public class AlexircraftLuckyBlock extends Block {

    private static Random rand = new Random();

    public AlexircraftLuckyBlock() {
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

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.create(0.1D, 0.0D, 0.0D, 0.9D, 1.0D, 1.0D);
    }

    private void drops(World worldIn, BlockPos pos, PlayerEntity player) {

        Enchantment[] e = new Enchantment[4];
        e[0] = Enchantments.FLAME;
        e[2] = Enchantments.POWER;
        e[3] = Enchantments.THORNS;
        e[1] = Enchantments.LOOTING;


        switch (rand.nextInt(102)) {

            case 0: {
             ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
                break;
            }
            case 1: {
              ExtraFunctions.summonMobsOnBreakBlock(EntityType.ZOMBIE, rand.nextInt(50), worldIn, pos, null);
                break;
            }
            case 2: {
               worldIn.setBlockState(player.getPosition(), Blocks.LAVA.getDefaultState());
                break;
            }
            case 3: {
                ExtraFunctions.hellWellStructure(worldIn, new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 2), rand);
                   ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 64, 1, 50);
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 5: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BOW), new Enchantment[]{Enchantments.POWER, Enchantments.FLAME, Enchantments.PUNCH}, 10, worldIn, pos);
                break;
            }
            case 6: {
                 ExtraFunctions.chat("That Was Nothing Go Open Other Block", player);
                break;
            }
            case 7: {
                 ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 8: {
               ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.MEGA_SWORD.get()));
                break;
            }
            case 9: {
                 ExtraFunctions.trollChat(player);
                break;
            }
            case 10: {
                  ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 11: {
                  ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 12: {
                   ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 13: {
                 ExtraFunctions.summonMobsOnBreakBlock(RegistrationHandler.ALEXIRCRAFT.get(), 40, worldIn, pos, null);
                break;
            }
            case 14: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 15: {
               ExtraFunctions.addEnchantsMany(new ItemStack(Items.EGG), new Enchantment[]{Enchantments.FIRE_ASPECT}, 2, worldIn, pos);
                break;
            }
            case 16: {
                  ExtraFunctions.summonMobsOnBreakBlock(RegistrationHandler.SERIALPLAYER.get(), 2, worldIn, pos, null);
                break;
            }
            case 17: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.APPLE));
                break;
            }
            case 18: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WOODEN_HOE), e, 10, worldIn, pos);
                break;
            }
            case 19: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.ALEX_BOOTS.get()));
                break;
            }
            case 20: {
                  ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.ALEX_CHEST.get()));
                break;
            }
            case 21: {
                  ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.ALEX_HELM.get()));
                break;
            }
            case 22: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.ALEX_LEGS.get()));
                break;
            }
            case 23: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.SPONGE));
                break;
            }
            case 24: {
            // ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 25: {
                 ExtraFunctions.musicKit(worldIn, pos);
                ExtraFunctions.chat("Go Listen To Some Music...", player);
                break;
            }
            case 26: {
               ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 28: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.BLAZE, 5, worldIn, pos, null);
                break;
            }
            case 29: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.DEVIL_SWORD.get()));
                break;
            }
            case 30: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.LOG_SWORD.get()));
                break;
            }
            case 31: {
               ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.BLACK_NEON_SWORD.get()));
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.ALEX_BOOTS.get()));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.YT_CHEST.get()));
                break;
            }
            case 34: {
                  ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.JUMP_BOOST, 200, 10));
                break;
            }
            case 35: {
               ExtraFunctions.summonMobsOnBreakBlock(RegistrationHandler.ALEXIRCRAFT.get(),50, worldIn, pos, null);
                break;
            }
            case 36: {
                  ExtraFunctions.summonMobsOnBreakBlock(EntityType.IRON_GOLEM, 50, worldIn, pos, null);
                break;
            }
            case 37: {
                ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.SNOW_SWORD.get()), e, 4, worldIn, pos);
                break;
            }
            case 38: {
               Random rand = worldIn.getRandom();
               int golemCount = rand.nextInt(5); // 0–4
                  ExtraFunctions.summonMobsOnBreakBlock(EntityType.IRON_GOLEM, golemCount, worldIn, pos, null);
                break;
            }
            case 39: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);
                  ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 41: {
               ExtraFunctions.summonMobsOnBreakBlock(RegistrationHandler.GHOST.get(), 50, worldIn, pos, null);
                break;
            }
            case 42: {
               ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(RegistrationHandler.LEVIN_SWORD.get()), 1, 0, 0);
                break;
            }
            case 43: {
            ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.BATTLE_AXE.get()));
                break;
            }
            case 44: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, RegistrationHandler.RAINBOW_SWORD.get(), "RAINBOW", Enchantment.getEnchantmentByID(12), 6);
                break;
            }
            case 45: {
               ExtraFunctions.tpPlayerInGround(player);
                break;
            }
            case 46: {
               ExtraFunctions.tntRain(worldIn, pos, 50, 0, player);
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.RABBIT, 50, worldIn, pos, rabbit -> {
                   rabbit.setRabbitType(99); // customize the rabbit
               });
                break;
            }
            case 48: {
                  ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.SNOW_SWORD.get()));
                break;
            }
            case 49: {
                Enchantment[] a = {Enchantments.AQUA_AFFINITY, Enchantments.BANE_OF_ARTHROPODS,
                        Enchantments.BLAST_PROTECTION, Enchantments.KNOCKBACK, Enchantments.POWER,
                        Enchantments.LOOTING, Enchantments.FIRE_ASPECT, Enchantments.SHARPNESS};
               ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_AXE), a, 3, worldIn, pos);
                break;
            }
            case 50: {
                Enchantment[] a = {Enchantments.AQUA_AFFINITY, Enchantments.BANE_OF_ARTHROPODS, Enchantments.BLAST_PROTECTION, Enchantments.POWER, Enchantments.LOOTING,
                       Enchantments.FIRE_ASPECT, Enchantments.SHARPNESS, Enchantments.EFFICIENCY, Enchantments.FEATHER_FALLING};
               ItemStack[] stack = {new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.DIAMOND_HOE), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_SHOVEL)};
                    ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, a, 8, pos, rand);
                break;
            }
            case 51: {
                 ExtraFunctions.tpPlayer(player);
                break;
            }
            case 52: {
                  ExtraFunctions.endWellStruct(worldIn, new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 2), rand);
                ExtraFunctions.lookUp(worldIn, player);
               ExtraFunctions.chat("Dont Die...", player);
                break;
            }

            case 53: {
                  ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.EMERALD_BLOCK), 64, 0, 0);
                break;
            }
            case 54: {
                  ExtraFunctions.chat(TextFormatting.AQUA + "Hello" + TextFormatting.BLACK + " Just" + TextFormatting.BLUE + " For" + TextFormatting.BOLD + " Your" + TextFormatting.DARK_AQUA + " Info " + TextFormatting.DARK_BLUE + "This" + TextFormatting.DARK_GRAY + " Is" + TextFormatting.DARK_GREEN + " Made" + TextFormatting.DARK_PURPLE + " By" + TextFormatting.DARK_RED + " thvardhan", player);
                break;
            }
            case 55: {
               ExtraFunctions.addEnchantsMany(new ItemStack(Items.WOODEN_HOE), e, 60, worldIn, pos);
                  ExtraFunctions.chat("You Just Got A God Hoe", player);
                break;
            }
            case 56: {
               ExtraFunctions.orcArmy(worldIn, pos, rand.nextInt(60), rand);
                break;
            }
            case 57: {
                 ExtraFunctions.summonCowNearby(worldIn, pos, 30, rand);
                break;
            }
            case 58: {
                ExtraFunctions.summonMobsNearby(new ZombieEntity(worldIn), 14, worldIn, pos, rand);
                break;
            }
            case 59: {
                 ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 60: {
                 ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER, 2, worldIn, pos, null);
                break;
            }
            case 61: {
                   ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 62: {
                 ExtraFunctions.chat("You May Want To Craft Anything :3", player);
               ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CRAFTING_TABLE);
                break;
            }
            case 63: {
                 ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.BEDROCK), 64, 0, 0);
                break;
            }
            case 64: {
                 ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN), 64, 0, 0);
                break;
            }
            case 65: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, RegistrationHandler.JEROMEASF_LUCKY_BLOCK.get());
                break;
            }
            case 66: {
                  ExtraFunctions.trollChat(player);
                break;
            }
            case 67: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 68: {
                 ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 69: {
                  ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.YT_BOOTS.get()));
                break;
            }
            case 70: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.YT_CHEST.get()));
                break;
            }
            case 71: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.YT_HELM.get()));
                break;
            }
            case 72: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.YT_LEGS.get()));
                break;
            }
            case 73: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 10, pos);
                break;
            }
            case 74: {
                Enchantment[] a = {Enchantments.SHARPNESS, Enchantments.KNOCKBACK, Enchantments.SMITE, Enchantments.BANE_OF_ARTHROPODS};
                  ExtraFunctions.addEnchantsMany(new ItemStack(RegistrationHandler.DEVIL_SWORD.get()), a, 3, worldIn, pos);
                break;
            }
            case 75: {
                 ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 76: {
                 ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.GOLD_BLOCK, 64, 1, 25);
                break;
            }
            case 77: {
                 ExtraFunctions.summonTammedWolfs(worldIn, player, 15, pos);
                break;
            }
            case 78: {
                 ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 79: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(RegistrationHandler.LEVIN_SWORD.get()));
                break;
            }
            case 80: {
              // ExtraFunctions.setOneBlock(worldIn, pos, RegistrationHandler.youtube);
                break;
            }
            case 81: {
                   ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 82: {
                  ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ANVIL);
              ExtraFunctions.chat(TextFormatting.DARK_BLUE + "You Should Be Happy It Dint Fell On Ya", player);
                break;
            }
            case 83: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.DIAMOND, 12, 0, 0);
                break;
            }
            case 84: {
                Enchantment[] a = {Enchantments.FIRE_ASPECT, Enchantments.AQUA_AFFINITY, Enchantments.FIRE_PROTECTION, Enchantments.PROTECTION, Enchantments.RESPIRATION, Enchantments.PROJECTILE_PROTECTION, Enchantments.BLAST_PROTECTION};
                 ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), a, 5, worldIn, pos);
                break;
            }
            case 85: {
                Enchantment[] a = {Enchantments.FIRE_ASPECT, Enchantments.AQUA_AFFINITY, Enchantments.FIRE_PROTECTION, Enchantments.PROTECTION, Enchantments.RESPIRATION, Enchantments.PROJECTILE_PROTECTION, Enchantments.BLAST_PROTECTION};
                 ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_CHESTPLATE), a, 4, worldIn, pos);
                break;
            }
            case 86: {
                  ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 87: {
                 ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 88: {
              //  ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
                break;
            }
            case 89: {
                 ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COAL_BLOCK);
                break;
            }
            case 90: {
                  ExtraFunctions.setOneBlock(worldIn, pos, Blocks.INFESTED_STONE);
                break;
            }
            case 91: {
                 ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.PAPER));
                break;
            }
            case 92: {
                  ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.MELON));
                break;
            }
            case 93: {
                  ExtraFunctions.summonMobsNearby(new EntityAlexirCraft(RegistrationHandler.ALEXIRCRAFT.get(), worldIn), 14, worldIn, pos, rand);
                break;
            }
            case 94: {
                   ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 95: {
                   ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 96: {
                  ExtraFunctions.summonCowNearby(worldIn, pos, 13, rand);
                break;
            }
            case 97: {
                   ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 98: {
                ItemStack waterBottle = new ItemStack(Items.POTION);
                waterBottle.getOrCreateTag().putString("Potion", "minecraft:water");

                ExtraFunctions.summonItemAsDrop(pos, worldIn, waterBottle);
                break;
            }
            case 99: {
                  ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.STONE_BUTTON));
                break;
            }
            case 100: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 101: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_SWORD));
                break;
            }

        }//switch ends
    }//method end
}

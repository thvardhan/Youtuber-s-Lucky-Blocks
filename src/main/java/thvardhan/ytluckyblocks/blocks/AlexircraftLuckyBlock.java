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
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityAlexirCraft;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntitySerialPlayer;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class AlexircraftLuckyBlock extends Block {

    private static Random rand = new Random();
    public AlexircraftLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public AlexircraftLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public AlexircraftLuckyBlock(String unlocalizedName) {
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

        Enchantment[] e = new Enchantment[4];
        e[0] = ExtraFunctions.enchantmentByLegacyNumericId(50);
        e[2] = ExtraFunctions.enchantmentByLegacyNumericId(48);
        e[3] = ExtraFunctions.enchantmentByLegacyNumericId(7);
        e[1] = ExtraFunctions.enchantmentByLegacyNumericId(21);




        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.ZOMBIE.create(worldIn), rand.nextInt(50), worldIn, pos);
                break;
            }
            case 1: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.LAVA);
                break;
            }
            case 2: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1), 64, 1, 50);
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 4: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BOW), new Enchantment[]{ExtraFunctions.enchantmentByLegacyNumericId(48), ExtraFunctions.enchantmentByLegacyNumericId(50), ExtraFunctions.enchantmentByLegacyNumericId(49)}, 10, worldIn, pos);
                break;
            }
            case 5: {
                ExtraFunctions.chat("That Was Nothing Go Open Other Block", player);
                break;
            }
            case 6: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 8: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 9: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 11: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityAlexirCraft.TYPE.create(worldIn), 40, worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.EGG), new Enchantment[]{ExtraFunctions.enchantmentByLegacyNumericId(20)}, 2, worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySerialPlayer.TYPE.create(worldIn), 2, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.APPLE));
                break;
            }
            case 17: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WOODEN_HOE), e, 10, worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.alexBoots));
                break;
            }
            case 19: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.alexChestplate));
                break;
            }
            case 20: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.alexHelmet));
                break;
            }
            case 21: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.alexLeggings));
                break;
            }
            case 22: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.SPONGE.asItem()));
                break;
            }
            case 23: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.musicKit(worldIn, pos);
                ExtraFunctions.chat("Go Listen To Some Music...", player);
                break;
            }
            case 25: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 26: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.BLAZE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.alexBoots));
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 33: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.JUMP, 10, 10));
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityAlexirCraft.TYPE.create(worldIn), 50, worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.IRON_GOLEM.create(worldIn), 50, worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.snowSword), e, 4, worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.IRON_GOLEM.create(worldIn), rand.nextInt(5), worldIn, pos);
                break;
            }
            case 38: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 50, worldIn, pos);
                break;
            }
            case 41: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 1, 0, 0);
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
                break;
            }
            case 43: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.rainbowBlade, "RAINBOW", ExtraFunctions.enchantmentByLegacyNumericId(16), 6);
                break;
            }
            case 44: {
                ExtraFunctions.tpPlayerInGround(player);
                break;
            }
            case 45: {
                ExtraFunctions.tntRain(worldIn, pos, 50, 0, player);
                break;
            }
            case 46: {
                net.minecraft.entity.passive.RabbitEntity a = EntityType.RABBIT.create(worldIn);
                a.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(a, 50, worldIn, pos);
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 48: {
                Enchantment[] a = {ExtraFunctions.enchantmentByLegacyNumericId(6), ExtraFunctions.enchantmentByLegacyNumericId(18),
                        ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(19), ExtraFunctions.enchantmentByLegacyNumericId(48),
                        ExtraFunctions.enchantmentByLegacyNumericId(21), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_AXE), a, 3, worldIn, pos);

                break;
            }
            case 49: {
                Enchantment[] a = {ExtraFunctions.enchantmentByLegacyNumericId(6), ExtraFunctions.enchantmentByLegacyNumericId(18), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(48), ExtraFunctions.enchantmentByLegacyNumericId(21),
                        ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(2)};
                ItemStack[] stack = {new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.DIAMOND_HOE), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_SHOVEL)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, a, 8, pos, rand);
                break;
            }
            case 50: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 51: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                ExtraFunctions.lookUp(worldIn, player);
                ExtraFunctions.chat("Dont Die...", player);
                break;
            }
            case 52: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.EMERALD_BLOCK.asItem()), 64, 0, 0);
                break;
            }
            case 53: {
                ExtraFunctions.chat(TextFormatting.AQUA + "Hello" + TextFormatting.BLACK + " Just" + TextFormatting.BLUE + " For" + TextFormatting.BOLD + " Your" + TextFormatting.DARK_AQUA + " Info " + TextFormatting.DARK_BLUE + "This" + TextFormatting.DARK_GRAY + " Is" + TextFormatting.DARK_GREEN + " Made" + TextFormatting.DARK_PURPLE + " By" + TextFormatting.DARK_RED + " thvardhan", player);
                break;
            }
            case 54: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WOODEN_HOE), e, 60, worldIn, pos);
                ExtraFunctions.chat("You Just Got A God Hoe", player);
                break;
            }
            case 55: {
                ExtraFunctions.orcArmy(worldIn, pos, rand.nextInt(60), rand);
                break;
            }
            case 56: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 30, rand);
                break;
            }
            case 57: {
                ExtraFunctions.summonMobsNearby(EntityType.ZOMBIE.create(worldIn), 14, worldIn, pos, rand);
                break;
            }
            case 58: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 59: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 2, worldIn, pos);
                break;
            }
            case 60: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 61: {
                ExtraFunctions.chat("You May Want To Craft Anything :3", player);
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CRAFTING_TABLE);
                break;
            }
            case 62: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.BEDROCK.asItem()), 64, 0, 0);
                break;
            }
            case 63: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN.asItem()), 64, 0, 0);
                break;
            }
            case 64: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 65: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 66: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);

                break;
            }
            case 67: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);

                break;
            }
            case 68: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));

                break;
            }
            case 69: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));

                break;
            }
            case 70: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));

                break;
            }
            case 71: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));

                break;
            }
            case 72: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 10, pos);

                break;
            }
            case 73: {
                Enchantment[] a = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(19), ExtraFunctions.enchantmentByLegacyNumericId(17), ExtraFunctions.enchantmentByLegacyNumericId(18)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), a, 3, worldIn, pos);

                break;
            }
            case 74: {
                ExtraFunctions.toVoid(worldIn, pos);

                break;
            }
            case 75: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.GOLD_BLOCK, 64, 1, 25);

                break;
            }
            case 76: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 15, pos);

                break;
            }
            case 77: {
                ExtraFunctions.towerStruct(worldIn, pos);

                break;
            }
            case 78: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));

                break;
            }
            case 79: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);

                break;
            }
            case 80: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);

                break;
            }
            case 81: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ANVIL);
                ExtraFunctions.chat(TextFormatting.DARK_BLUE + "You Should Be Happy It Dint Fell On Ya", player);

                break;
            }
            case 82: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.DIAMOND, 12, 0, 0);

                break;
            }
            case 83: {
                Enchantment[] a = {ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(6),
                        ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(5), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(3)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), a, 5, worldIn, pos);

                break;
            }
            case 84: {
                Enchantment[] a = {ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(6), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(5), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(3)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_CHESTPLATE), a, 4, worldIn, pos);

                break;
            }
            case 85: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 86: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 87: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
                break;
            }
            case 88: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COAL_BLOCK);
                break;
            }
            case 89: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.INFESTED_STONE);
                break;
            }
            case 90: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.PAPER));
                break;
            }
            case 91: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.MELON.asItem()));
                break;
            }
            case 92: {
                ExtraFunctions.summonMobsNearby(EntityAlexirCraft.TYPE.create(worldIn), 14, worldIn, pos, rand);
                break;
            }
            case 93: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 94: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 95: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 13, rand);
                break;
            }
            case 96: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 97: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.POTION));
                break;
            }
            case 98: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.STONE_BUTTON.asItem()));
                break;
            }
            case 99: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 100: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_SWORD));
                break;
            }


        }//switch ends
    }//method end


}
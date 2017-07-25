package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public AlexircraftLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public AlexircraftLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }


    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        for (int i = 0; i < 3; ++i) {
            int j = rand.nextInt(2) * 2 - 1;
            int k = rand.nextInt(2) * 2 - 1;
            double d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
            double d1 = (double) ((float) pos.getY() + rand.nextFloat());
            double d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) k;
            double d3 = (double) (rand.nextFloat() * (float) j);
            double d4 = ((double) rand.nextFloat() - 0.5D) * 0.125D;
            double d5 = (double) (rand.nextFloat() * (float) k);
            worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, d0, d1, d2, d3, d4, d5);
        }
    }


    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (!world.isRemote && player != null && !(player instanceof FakePlayer)) {
            world.setBlockToAir(pos);
            drops(world, pos, player);
        }
        return false;
    }

    private void drops(World worldIn, BlockPos pos, EntityPlayer player) {

        Enchantment[] e = new Enchantment[4];
        e[0] = Enchantment.getEnchantmentByID(50);
        e[2] = Enchantment.getEnchantmentByID(48);
        e[3] = Enchantment.getEnchantmentByID(7);
        e[1] = Enchantment.getEnchantmentByID(21);




        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityZombie(worldIn), rand.nextInt(50), worldIn, pos);
                break;
            }
            case 1: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWING_LAVA);
                break;
            }
            case 2: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE, 1, 1), 64, 1, 50);
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 4: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BOW), new Enchantment[]{Enchantment.getEnchantmentByID(48), Enchantment.getEnchantmentByID(50), Enchantment.getEnchantmentByID(49)}, 10, worldIn, pos);
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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAlexirCraft(worldIn), 40, worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.EGG), new Enchantment[]{Enchantment.getEnchantmentByID(20)}, 2, worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySerialPlayer(worldIn), 2, worldIn, pos);
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.SPONGE));
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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityBlaze(worldIn), 5, worldIn, pos);
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
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.LEAPING.getEffects().get(0).getPotion(), 10, 10));
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAlexirCraft(worldIn), 50, worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityIronGolem(worldIn), 50, worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.snowSword), e, 4, worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityIronGolem(worldIn), rand.nextInt(5), worldIn, pos);
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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 50, worldIn, pos);
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
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.rainbowBlade, "RAINBOW", Enchantment.getEnchantmentByID(16), 6);
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
                EntityRabbit a = new EntityRabbit(worldIn);
                a.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(a, 50, worldIn, pos);
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 48: {
                Enchantment[] a = {Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(18),
                        Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(19), Enchantment.getEnchantmentByID(48),
                        Enchantment.getEnchantmentByID(21), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_AXE), a, 3, worldIn, pos);

                break;
            }
            case 49: {
                Enchantment[] a = {Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(18), Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(48), Enchantment.getEnchantmentByID(21),
                        Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(32), Enchantment.getEnchantmentByID(2)};
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
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.EMERALD_BLOCK), 64, 0, 0);
                break;
            }
            case 53: {
                ExtraFunctions.chat(ChatFormatting.AQUA + "Hello" + ChatFormatting.BLACK + " Just" + ChatFormatting.BLUE + " For" + ChatFormatting.BOLD + " Your" + ChatFormatting.DARK_AQUA + " Info " + ChatFormatting.DARK_BLUE + "This" + ChatFormatting.DARK_GRAY + " Is" + ChatFormatting.DARK_GREEN + " Made" + ChatFormatting.DARK_PURPLE + " By" + ChatFormatting.DARK_RED + " thvardhan", player);
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
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 14, worldIn, pos, rand);
                break;
            }
            case 58: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 59: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 2, worldIn, pos);
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
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.BEDROCK), 64, 0, 0);
                break;
            }
            case 63: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN), 64, 0, 0);
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
                Enchantment[] a = {Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(19), Enchantment.getEnchantmentByID(17), Enchantment.getEnchantmentByID(18)};
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
                ExtraFunctions.chat(ChatFormatting.DARK_BLUE + "You Should Be Happy It Dint Fell On Ya", player);

                break;
            }
            case 82: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.DIAMOND, 12, 0, 0);

                break;
            }
            case 83: {
                Enchantment[] a = {Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(6),
                        Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(5), Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(3)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), a, 5, worldIn, pos);

                break;
            }
            case 84: {
                Enchantment[] a = {Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(5), Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(3)};
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
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.MONSTER_EGG);
                break;
            }
            case 90: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.PAPER));
                break;
            }
            case 91: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.MELON_BLOCK));
                break;
            }
            case 92: {
                ExtraFunctions.summonMobsNearby(new EntityAlexirCraft(worldIn), 14, worldIn, pos, rand);
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.POTIONITEM));
                break;
            }
            case 98: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.STONE_BUTTON));
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

package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class SSundeeLuckyBlock extends Block {


    public SSundeeLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public SSundeeLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public SSundeeLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.SPELL_MOB, d0, d1, d2, d3, d4, d5);
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

        Enchantment[] e = new Enchantment[5];
        e[0] = Enchantment.getEnchantmentByID(50);
        e[1] = Enchantment.getEnchantmentByID(19);
        e[2] = Enchantment.getEnchantmentByID(48);
        e[3] = Enchantment.getEnchantmentByID(7);
        e[4] = Enchantment.getEnchantmentByID(21);


        Random rand = new Random();


        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
                break;
            }
            case 1: {
                ExtraFunctions.mountain(worldIn, pos, rand);

                break;
            }
            case 2: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), rand.nextInt(10) + 1, worldIn, pos);

                break;
            }
            case 3: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 20, worldIn, pos);

                break;
            }
            case 4: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 20, worldIn, pos);

                break;
            }
            case 5: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);

                break;
            }
            case 6: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);

                break;
            }
            case 7: {
                ExtraFunctions.redstoneKit(worldIn, pos);

                break;
            }
            case 8: {
                ExtraFunctions.foodKit(worldIn, pos);

                break;
            }
            case 9: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytBoots), 1, 0, 0);

                break;
            }
            case 10: {

                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytChestplate), 1, 0, 0);
                break;
            }
            case 11: {

                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytLeggings), 1, 0, 0);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.ytHelmet), 1, 0, 0);
                break;
            }
            case 13: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 14: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 15: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
                break;
            }
            case 16: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 1, 0, 0);
                break;
            }
            case 17: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn), 3, worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 19: {
                ExtraFunctions.chat("Something Is Not Right Here....", player);
                break;
            }
            case 20: {
                ExtraFunctions.chat("Something Is Not Right Here....", player);
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 22: {
                ExtraFunctions.tpPlayer(player);
                ExtraFunctions.chat("Fresh Air :'D", player);
                break;
            }
            case 23: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.DRAGON_EGG), 50, 1, 5);
                ExtraFunctions.chat("How Are You Going To Train These Many Dragons?", player);
                break;
            }
            case 24: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), 1, worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), rand.nextInt(30) + 1, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.BEDROCK), 64, 0, 0);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN), 64, 0, 0);
                break;
            }
            case 29: {
                ExtraFunctions.tntRain(worldIn, pos, 50, 0, player);
                break;
            }
            case 30: {
                ExtraFunctions.tntNearby(worldIn, pos, 500, player, rand);
                ExtraFunctions.chat("Only 500 Tnts Are About To Blast", player);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 32: {
                ExtraFunctions.summonMobsNearby(new EntitySSundee(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 34: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 35: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 36: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.iBallisticSquidLuckyBlock);
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_BOOTS));
                break;
            }
            case 38: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BREWING_STAND);
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.EMERALD_BLOCK, 20, 0, 0);
                break;
            }
            case 41: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(6) + 1, worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 20, worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), rand.nextInt(20) + 1, worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.DIAMOND_BLOCK), 10, 0, 0);
                break;
            }
            case 45: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 46: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySerialPlayer(worldIn), 20, worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 49: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.s_Boots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.s_Chestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.s_Helmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.s_Leggings));
                break;
            }
            case 55: {
                ExtraFunctions.summonMobsNearby(new EntitySSundee(worldIn), 44, worldIn, pos, rand);
                break;
            }
            case 56: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 57: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 30, worldIn, pos);
                break;
            }
            case 58: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 59: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 60: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), 54, worldIn, pos, rand);
                break;
            }
            case 61: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.OBSIDIAN);
                break;
            }
            case 62: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 63: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 64: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 65: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 66: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 68: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 69: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.iHasCupcakeLuckyBlock);
                break;
            }
            case 70: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.lDShadowLadyLuckyBlock);
                break;
            }
            case 71: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 11, worldIn, pos, rand);
                break;
            }
            case 72: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.antVenomLuckyBlock);
                break;
            }
            case 73: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 51, worldIn, pos, rand);
                break;
            }
            case 74: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 75: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), rand.nextInt(40) + 1, worldIn, pos, rand);
                break;
            }
            case 76: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BAKED_POTATO), e, 1, worldIn, pos);
                break;
            }
            case 77: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 78: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 79: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 80: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 60, worldIn, pos);
                break;
            }
            case 81: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 82: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 83: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.APPLE));
                break;
            }
            case 84: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.COOKED_PORKCHOP));
                break;
            }
            case 85: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.BOW, "BOWWWW", Enchantment.getEnchantmentByID(49), 4);
                break;
            }
            case 86: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 87: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BOAT), 10, 1, 10);
                break;
            }
            case 88: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 89: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 10, pos);
                break;
            }
            case 90: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 91: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BLAZE_POWDER));
                break;
            }
            case 92: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 93: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 94: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn), 3, worldIn, pos);
                break;
            }
            case 95: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySuperGirlyGamer(worldIn), 10, worldIn, pos);
                break;
            }
            case 96: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ARROW));
                break;
            }
            case 97: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MUSHROOM_STEW), 10, 0, 0);
                break;
            }
            case 98: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 99: {
                ExtraFunctions.tntFix(worldIn, pos, 40, player);
                break;
            }
            case 100: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
                break;
            }


        }//switch ends
    }//method end
}

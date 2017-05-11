package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
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
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class FrizzleandpopLuckyBlock extends Block {

    public FrizzleandpopLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public FrizzleandpopLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public FrizzleandpopLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    @Override
    public boolean isVisuallyOpaque() {
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


        Random rand = new Random();
        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsNearby(new EntityFrizzleandpop(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzBoots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzChestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzHelmet));

                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.frizzLeggings));
                break;
            }
            case 6: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_PICKAXE));
                break;
            }
            case 7: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_PICKAXE), new Enchantment[]{Enchantment.getEnchantmentByID(35), Enchantment.getEnchantmentByID(34)}, 4, worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_CHESTPLATE));
                break;
            }
            case 9: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.BEACON));
                break;
            }
            case 10: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.END_PORTAL_FRAME), 8, 0, 0);
                break;
            }
            case 11: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.RABBIT_STEW), 10, 1, 50);
                break;
            }
            case 12: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.ENDER_CHEST);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE), 4, 0, 0);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE, 1, 1), 2, 0, 0);
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_HELMET));
                break;
            }
            case 15: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_LEGGINGS));
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_BOOTS));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.SADDLE));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.DRAGON_EGG));
                break;
            }
            case 19: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.CAKE));
                break;
            }
            case 20: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.QUARTZ_BLOCK), 40, 1, 1);
                break;
            }
            case 21: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLOWER_POT));
                break;
            }
            case 22: {
                ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 23: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.SKULL));
                break;
            }
            case 24: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.WOODEN_AXE));
                break;
            }
            case 25: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.WOODEN_HOE));
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.WOODEN_PICKAXE));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.WOODEN_SWORD));
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.WOODEN_SWORD));
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 30: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGuardian(worldIn), 15, worldIn, pos);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsNearby(new EntityFrizzleandpop(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 32: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 35: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 10, pos);
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MILK_BUCKET));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.CARROT_ON_A_STICK));
                break;
            }
            case 39: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.megaSword), e, 7, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BLAZE_ROD));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.frizzChestplate), 1, 0, 0);
                break;
            }
            case 43: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.SLIME_BLOCK), 40, 1, 1);
                break;
            }
            case 44: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 45: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 46: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 47: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 49: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WOODEN_SWORD), new Enchantment[]{Enchantment.getEnchantmentByID(50), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(17), Enchantment.getEnchantmentByID(18)}, 5, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 51: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 52: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), Blocks.FLOWING_LAVA.getDefaultState());
                break;
            }
            case 53: {
                ExtraFunctions.chat("YAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAY ^.^ (empty)", player);
                break;
            }
            case 54: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
                break;
            }
            case 55: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 56: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.REGENERATION.getEffects().get(0).getPotion(), 1000, 10));
                break;
            }
            case 57: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 58: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.BEDROCK);
                break;
            }
            case 59: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN), 40, 0, 0);
                break;
            }
            case 60: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.STAINED_GLASS), 40, 1, 50);
                break;
            }
            case 61: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 62: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 63: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 64: {
                ExtraFunctions.orcArmy(worldIn, pos, 10, rand);
                break;
            }
            case 65: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 66: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 68: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 69: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 70: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.MONSTER_EGG);
                break;
            }
            case 71: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.REEDS));
                break;
            }
            case 72: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.REDSTONE_ORE);
                break;
            }
            case 73: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.GLOWSTONE);
                break;
            }
            case 74: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWING_LAVA);
                break;
            }
            case 75: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BAKED_POTATO));
                break;
            }
            case 76: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.mic), e, 4, worldIn, pos);
                ExtraFunctions.chat("Is This God Mic?", player);
                break;
            }
            case 77: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.END_PORTAL_FRAME);
                break;
            }
            case 78: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.GOLD_BLOCK);
                break;
            }
            case 79: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.IRON_BLOCK);
                break;
            }
            case 80: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COAL_BLOCK);
                break;
            }
            case 81: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 82: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 40, worldIn, pos);
                break;
            }
            case 83: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 84: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 85: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 86: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityTruemu(worldIn), 10, worldIn, pos);
                break;
            }
            case 87: {
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 88: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.MONSTER_EGG));
                break;
            }
            case 89: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.frizzleandpopLuckyBlock));
                break;
            }
            case 90: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 91: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 92: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 45, worldIn, pos, rand);
                break;
            }
            case 93: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 10, worldIn, pos);
                break;
            }
            case 94: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                break;
            }
            case 95: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 64, 1, 40);
                break;
            }
            case 96: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.BEDROCK), 64, 1, 40);
                break;
            }
            case 97: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.REDSTONE), 120, 0, 0);
                break;
            }
            case 98: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ARROW));
                break;
            }
            case 99: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.SPONGE));
                break;
            }
            case 100: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLD_INGOT));
                break;
            }


        }//switch ends
    }//method end
}

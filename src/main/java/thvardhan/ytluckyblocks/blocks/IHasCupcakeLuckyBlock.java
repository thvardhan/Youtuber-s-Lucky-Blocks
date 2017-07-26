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
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.init.*;

import java.util.Random;

public class IHasCupcakeLuckyBlock extends Block {

    public IHasCupcakeLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public IHasCupcakeLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public IHasCupcakeLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
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

        //super.onBlockDestroyedByPlayer(worldIn, pos, state);
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
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 1: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Boots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Chestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Helmet));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Leggings));
                break;
            }
            case 6: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 10, worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.summonMobsNearby(new EntityIhasCupquake(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 9: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                ExtraFunctions.chat("Alwys rmber whn evr u gt ths drp kll the cws MOOO", player);
                break;
            }
            case 11: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 12: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.FIRE_RESISTANCE.getEffects().get(0).getPotion(), 1000, 24));
                break;
            }
            case 13: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ARROW), 40, 1, 40);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.BOW, "KnockBow", Enchantment.getEnchantmentByID(49), 4);
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.SNOWBALL));
                ExtraFunctions.chat("<3 Snowballs", player);
                break;
            }
            case 15: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 16: {
                ExtraFunctions.anvilRain(worldIn, pos);
                ExtraFunctions.chat("Dont Move Or Look Up For Next 3 Seconds", player);
                break;
            }
            case 17: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityEndermite(worldIn), 40, worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 20: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 22: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 23: {
                ExtraFunctions.chat("Look Up", player);
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 25: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.IRON_ORE);
                break;
            }
            case 26: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 27: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ACTIVATOR_RAIL);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(this));
                break;
            }
            case 29: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.tntFix(worldIn, pos, 40, player);
                break;
            }
            case 31: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 32: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.mic);
                break;
            }
            case 33: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 34: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 35: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.thnxCyaLuckyBlock);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 38: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BAKED_POTATO), 1, 0, 0);
                ExtraFunctions.chat("Take this for your affords :D", player);
                break;
            }
            case 41: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.REGENERATION.getEffects().get(0).getPotion(), 1200, 5));
                break;
            }
            case 42: {
                ExtraFunctions.orcArmy(worldIn, pos, 0, rand);
                break;
            }
            case 43: {
                ExtraFunctions.tntNearby(worldIn, pos, 2, player, rand);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ENDER_PEARL));
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;

            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MAP));
                break;
            }
            case 47: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 49: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 51: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.APPLE), e, 4, worldIn, pos);
                break;
            }
            case 52: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 53: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);
                ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), Blocks.FIRE);
                break;
            }
            case 54: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 55: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 56: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 57: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 58: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 59: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 60: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 61: {
                ExtraFunctions.chat("look up", player);
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 62: {
                ExtraFunctions.orcArmy(worldIn, pos, 5, rand);
                break;
            }
            case 63: {
                ExtraFunctions.summonMobsNearby(new EntityIhasCupquake(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 64: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 65: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 66: {
                ExtraFunctions.tntNearby(worldIn, pos, 50, player, rand);
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.iBallisticSquidLuckyBlock));
                break;
            }
            case 68: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 69: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWER_POT);
                break;
            }
            case 70: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 71: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 72: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 73: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.sSundeeLuckyBlock);
                break;
            }
            case 74: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Boots));
                break;
            }
            case 75: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Chestplate));
                break;
            }
            case 76: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Helmet));
                break;
            }
            case 77: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Leggings));
                break;
            }
            case 78: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 79: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.ARROW, 40, 0, 0);
                break;
            }
            case 80: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 81: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.CAKE));
                break;
            }
            case 82: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 83: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 84: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 85: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BUCKET));
                break;
            }
            case 86: {

                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.STRENGTH.getEffects().get(0).getPotion(), 1000, 24));
                break;
            }
            case 87: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 88: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                break;
            }
            case 89: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
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
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 93: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 94: {
                ExtraFunctions.tntFix(worldIn, pos, 10, player);
                break;
            }
            case 95: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ANVIL);
                break;
            }
            case 96: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 97: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 98: {
                ExtraFunctions.summonMobsNearby(new EntitySSundee(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 99: {
                ExtraFunctions.summonMobsNearby(new EntityIhasCupquake(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 100: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }


        }//switch ends
    }//method end
}

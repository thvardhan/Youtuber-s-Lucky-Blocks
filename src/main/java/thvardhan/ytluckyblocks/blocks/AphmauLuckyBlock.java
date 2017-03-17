package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityAphmau;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityTewity;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class AphmauLuckyBlock extends Block {

    private static Random rand = new Random();

    public AphmauLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public AphmauLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public AphmauLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
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
            worldIn.spawnParticle(EnumParticleTypes.SPELL, d0, d1, d2, d3, d4, d5);
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


        switch (rand.nextInt(51)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsNearby(new EntityTewity(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.aphmauBoots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.aphmauChestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.aphmauHelmet));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.aphmauLeggings));
                break;
            }
            case 6: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 9: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 10: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 11: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 12: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 15: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                break;
            }
            case 19: {
                ExtraFunctions.summonMobsNearby(new EntityAphmau(worldIn), 30, worldIn, pos, rand);
                break;
            }
            case 20: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 21: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 22: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 20, rand);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(6) + 1, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE), 64, 0, 0);
                break;
            }
            case 29: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsNearby(new EntityAphmau(worldIn), rand.nextInt(10) + 1, worldIn, pos, rand);
                break;
            }
            case 32: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 5, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 10, worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), rand.nextInt(40) + 1, worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.mic, "mic", Enchantment.getEnchantmentByID(20), 8);
                break;
            }
            case 36: {
                Enchantment[] ea = {Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(5), Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(3)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), ea, 8, worldIn, pos);
                break;
            }
            case 37: {
                Enchantment[] ea = {Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(5), Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(3)};

                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_LEGGINGS), ea, 5, worldIn, pos);

                break;
            }
            case 38: {
                Enchantment[] ea = {Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(5), Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(3)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_CHESTPLATE), ea, 4, worldIn, pos);

                break;
            }
            case 39: {
                Enchantment[] ea = {Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(5), Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(3)};

                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_HELMET), ea, 6, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAphmau(worldIn), 5, worldIn, pos);
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.youtube));
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
                break;
            }
            case 45: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.cassieTheCatLuckyBlock));
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.mic));
                break;
            }
            case 49: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }


        }//switch ends
    }//method end


}

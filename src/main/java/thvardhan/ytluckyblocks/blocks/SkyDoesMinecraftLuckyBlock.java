package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class SkyDoesMinecraftLuckyBlock extends Block {

    public SkyDoesMinecraftLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);

    }

    public SkyDoesMinecraftLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public SkyDoesMinecraftLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
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


        Random rand = new Random();


        switch (rand.nextInt(55)) {
            default: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 0: {

                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 2: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 3: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.GOLD_INGOT, ChatFormatting.GOLD + "Butter", Enchantment.getEnchantmentByID(19), 10);
                break;
            }
            case 4: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 5: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 6: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 9: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.popularMMOLuckyBlock);
                break;
            }
            case 10: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                break;
            }
            case 11: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, ModItems.devilSword, 1, 0, 0);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySkyDoesMinecraft(worldIn), 5, worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 14: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 15: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 19: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 20: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 100, worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.tntFix(worldIn, pos, 1, player);
                break;
            }
            case 22: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 5, worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.tntNearby(worldIn, pos, 52, player, rand);
                break;
            }
            case 24: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityTruemu(worldIn), 10, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 27: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 1, pos);
                break;
            }
            case 28: {
                ExtraFunctions.orcArmy(worldIn, pos, 25, rand);
                break;
            }
            case 29: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BED);
                break;
            }
            case 30: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySkyDoesMinecraft(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 32: {
                Enchantment[] e = {Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(19), Enchantment.getEnchantmentByID(17), Enchantment.getEnchantmentByID(18)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), e, 4, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWING_LAVA);
                break;
            }
            case 37: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 38: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 39: {
                ExtraFunctions.tntRain(worldIn, pos, 5, 10, player);
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsNearby(new EntitySkyDoesMinecraft(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 41: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 52, worldIn, pos, rand);
                break;
            }
            case 45: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 10, worldIn, pos);
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 25, worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.GOLD_BLOCK, 64, 1, 25);
                break;
            }
            case 49: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySuperGirlyGamer(worldIn), 1, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 25, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.skyLeggings));
                break;
            }

        }

    }


//method ends
}

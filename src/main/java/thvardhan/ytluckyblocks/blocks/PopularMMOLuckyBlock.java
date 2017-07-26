package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.init.*;

import java.util.Random;

public class PopularMMOLuckyBlock extends Block {


    public PopularMMOLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);


    }

    public PopularMMOLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public PopularMMOLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
        }
    }


    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (!world.isRemote && player != null && !(player instanceof FakePlayer)) {
            world.setBlockToAir(pos);
            drops(world, pos, player);
        }
        return true;

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
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 3: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 4: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 20, worldIn, pos);
                break;
            }
            case 5: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(30), worldIn, pos);
                break;
            }
            case 6: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 7: {
                Enchantment[] e = {Enchantment.getEnchantmentByID(48), Enchantment.getEnchantmentByID(49), Enchantment.getEnchantmentByID(51)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BOW), e, rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_PICKAXE, "Ore Eater", Enchantment.getEnchantmentByID(35), 20);
                break;
            }
            case 9: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_PICKAXE, "Ore Placer", Enchantment.getEnchantmentByID(32), 30);
                break;
            }
            case 10: {
                Enchantment[] e = {Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(32), Enchantment.getEnchantmentByID(33), Enchantment.getEnchantmentByID(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.SHEARS), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 11: {
                Enchantment[] e = {Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(2), Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(7)};
                ItemStack[] s = {new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.DIAMOND_CHESTPLATE)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, e, 10, pos, rand);
                break;
            }
            case 12: {
                Enchantment[] e = {Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(32), Enchantment.getEnchantmentByID(33), Enchantment.getEnchantmentByID(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 13: {
                Enchantment[] e = {Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(17), Enchantment.getEnchantmentByID(18), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(21), Enchantment.getEnchantmentByID(34), Enchantment.getEnchantmentByID(34), Enchantment.getEnchantmentByID(34)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), e, 10, worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 17: {
                ExtraFunctions.chat(ChatFormatting.AQUA + "Oh Well", player);
                break;
            }
            case 18: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 19: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 20: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.mic);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.captainSparkelzLuckyBlock);
                break;
            }
            case 22: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 20, worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn), 3, worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 26: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 27: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.BEACON);
                break;
            }
            case 28: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.EMERALD_BLOCK, 5, 0, 0);
                break;
            }
            case 29: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 34: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
                break;
            }
            case 35: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEACON);
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.GOLDEN_APPLE, 64, 1, 30);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.GOLDEN_CARROT, 5, 1, 5);
                break;
            }
            case 41: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.SADDLE));
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 51, worldIn, pos, rand);
                break;
            }
            case 46: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 47: {
                ExtraFunctions.tntRain(worldIn, pos, 10, 2, player);
                break;
            }
            case 48: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 49: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 25, pos);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 53, worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popLeggings));
                break;
            }

        }

    }//method ends
}

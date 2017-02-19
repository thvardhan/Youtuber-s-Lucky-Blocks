package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
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

public class MrCrainerLuckyBlock extends Block {

    public MrCrainerLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public MrCrainerLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public MrCrainerLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube() {
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
    public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (!world.isRemote && player != null && !(player instanceof FakePlayer)) {

            world.setBlockToAir(pos);
            drops(world, pos, player);
        }
        return true;

        //super.onBlockDestroyedByPlayer(worldIn, pos, state);
    }

    private void drops(World worldIn, BlockPos pos, EntityPlayer player) {

        Enchantment[] e = new Enchantment[5];
        e[0] = Enchantment.flame;
        e[1] = Enchantment.knockback;
        e[2] = Enchantment.power;
        e[3] = Enchantment.thorns;
        e[4] = Enchantment.looting;


        Random rand = new Random();


        switch (rand.nextInt(51)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.chat("HeeeLLLOO!!! My Crazie Family!... and welcome back to yet another episode", player);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityMrCrainer(worldIn), 20, worldIn, pos);
                break;
            }
            case 2: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityMrCrainer(worldIn), 10, worldIn, pos);
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.crainerBoots));
                break;
            }
            case 22: {
                ExtraFunctions.tpPlayer(player);
                ExtraFunctions.chat("Fresh Air :'D", player);
                break;
            }
            case 23: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.dragon_egg), 50, 1, 5);
                ExtraFunctions.chat("How Are You Going To Train These Many Dragons?", player);
                break;
            }
            case 24: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.crainerLeggings));
                break;
            }
            case 25: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.crainerChestplate));
                break;
            }
            case 26: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.bedrock), 64, 0, 0);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.obsidian), 64, 0, 0);
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
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_leggings));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_boots));
                break;
            }
            case 34: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 37: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.dark_oak_door);
                break;
            }
            case 38: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 39: {
                Enchantment[] ea = {Enchantment.sharpness, Enchantment.knockback, Enchantment.fireAspect};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.wooden_hoe), ea, 60, worldIn, pos);
                ExtraFunctions.chat("Someone Just Got A God Hoe", player);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.crainerHelmet));
                break;
            }
            case 41: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsNearby(new EntityMrCrainer(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 45: {
                ExtraFunctions.orcArmy(worldIn, pos, 60, rand);
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySerialPlayer(worldIn), 10, worldIn, pos);
                break;
            }
            case 47: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }


        }//switch ends
    }//method end


}

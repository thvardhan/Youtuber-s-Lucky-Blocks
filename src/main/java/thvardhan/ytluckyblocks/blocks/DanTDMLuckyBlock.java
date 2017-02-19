package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
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

public class DanTDMLuckyBlock extends Block {

    public DanTDMLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
    }

    public DanTDMLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public DanTDMLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5, new int[0]);
        }
    }


    @Override
    public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
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
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 3: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.diamond_block);
                break;
            }
            case 4: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 5: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 6: {
                Enchantment[] e = {Enchantment.aquaAffinity, Enchantment.baneOfArthropods, Enchantment.blastProtection, Enchantment.power, Enchantment.looting, Enchantment.fireAspect, Enchantment.sharpness};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_axe), e, 6, worldIn, pos);
                break;
            }
            case 7: {
                Enchantment[] e = {Enchantment.aquaAffinity, Enchantment.baneOfArthropods, Enchantment.blastProtection, Enchantment.power, Enchantment.looting, Enchantment.fireAspect, Enchantment.sharpness, Enchantment.efficiency, Enchantment.featherFalling};
                ItemStack[] stack = {new ItemStack(Items.diamond_axe), new ItemStack(Items.diamond_hoe), new ItemStack(Items.diamond_sword), new ItemStack(Items.diamond_shovel)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, e, 10, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 11: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 20, worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 10, worldIn, pos);
                ExtraFunctions.chat(EnumChatFormatting.RED + "You Are Done.. Worst Drop Of This Mod", player);
                break;
            }
            case 14: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 10, 0, 0);
                break;
            }
            case 17: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 18: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                ExtraFunctions.lookUp(worldIn, player);
                ExtraFunctions.chat("Dont Die...", player);
                break;
            }
            case 19: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 20: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 21: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 22: {
                ExtraFunctions.tntFix(worldIn, pos, 8, player);
                break;
            }
            case 23: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.diamond_block), 64, 1, 3);
                break;
            }
            case 24: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.emerald_block), 64, 0, 0);
                break;
            }
            case 25: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 26: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.fireAspect};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.golden_apple), e, 50, worldIn, pos);
                ExtraFunctions.chat(EnumChatFormatting.DARK_AQUA + "Up To You.. Use Or Throw", player);
                break;
            }
            case 27: {
                ExtraFunctions.chat(EnumChatFormatting.AQUA + "Hello" + EnumChatFormatting.BLACK + " Just" + EnumChatFormatting.BLUE + " For" + EnumChatFormatting.BOLD + " Your" + EnumChatFormatting.DARK_AQUA + " Info " + EnumChatFormatting.DARK_BLUE + "This" + EnumChatFormatting.DARK_GRAY + " Is" + EnumChatFormatting.DARK_GREEN + " Made" + EnumChatFormatting.DARK_PURPLE + " By" + EnumChatFormatting.DARK_RED + " thvardhan", player);
                break;
            }
            case 28: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 29: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 31: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 32: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.tntRain(worldIn, pos, 10, 4, player);
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 35: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(7), worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 37: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.end_portal);
                break;
            }
            case 38: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 39: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.knockback, Enchantment.fireAspect};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.wooden_hoe), e, 60, worldIn, pos);
                ExtraFunctions.chat("Someone Just Got A God Hoe", player);
                break;
            }
            case 40: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 41: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.cake, 10, 0, 0);
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
                ExtraFunctions.orcArmy(worldIn, pos, 20, rand);
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
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.danBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.danChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.danHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.danLeggings));
                break;
            }

        }
    }//method ends
}

package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityIronGolem;
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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.init.*;

import java.util.Random;

public class SharkyLuckyBlock extends Block {

    public SharkyLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public SharkyLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public SharkyLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.CRIT_MAGIC, d0, d1, d2, d3, d4, d5);
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

                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 2: {
                ExtraFunctions.tntFix(worldIn, pos, 100, player);
                break;
            }
            case 3: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 4: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 5: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityTruemu(worldIn), 10, worldIn, pos);
                break;
            }
            case 6: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 7: {
                Enchantment[] e1 = {Enchantment.getEnchantmentByID(4), Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(1)};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytBoots), e1, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytChestplate), e1, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytHelmet), e1, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytLeggings), e1, 10, worldIn, pos);
                ExtraFunctions.chat("Congracts On Getting <GOD> Kit", player);
                break;
            }
            case 8: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 25, worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.DIAMOND_BLOCK, 10, 0, 0);

                break;
            }
            case 13: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.MELON_SEEDS, "Seeds?", Enchantment.getEnchantmentByID(20), 20);

                break;
            }
            case 14: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);

                break;
            }
            case 15: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.BUCKET, 64, 0, 0);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.BUCKET, "You Found Me~!" + ChatFormatting.AQUA, Enchantment.getEnchantmentByID(20), 10);

                break;
            }
            case 16: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                ExtraFunctions.chat("Believe It Or Not I Think Its The Most Lucky Drop", player);
                break;
            }
            case 17: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEACON);
                break;
            }
            case 18: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySerialPlayer(worldIn), 10, worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 50, worldIn, pos);
                break;
            }
            case 21: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySharky(worldIn), 30, worldIn, pos);
                break;
            }
            case 22: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.sharkyBoots));
                break;
            }
            case 23: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.sharkyChestplate));
                break;
            }
            case 24: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.sharkyHelmet));
                break;
            }
            case 25: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.sharkyLeggings));
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 28: {
                ExtraFunctions.fireCamp(worldIn, player);
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
                break;
            }
            case 30: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWING_LAVA);
                break;
            }
            case 31: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 32: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BONE), 50, 1, 4);
                break;
            }
            case 33: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.BEDROCK);
                break;
            }
            case 34: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.SADDLE));
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), rand.nextInt(20) + 1, worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 37: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 40, rand);
                ExtraFunctions.chat("GET THE COWS BEFORE OTHERS GETS!", player);
                break;
            }
            case 38: {
                ExtraFunctions.summonMobsNearby(new EntitySharky(worldIn), 45, worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.END_PORTAL);
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
                ExtraFunctions.summonMobsNearby(new EntitySharky(worldIn), 25, worldIn, pos, rand);
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


        }//switch ends
    }//method end
}

package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityRabbit;
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

public class TrueMuLuckyBlock extends Block {

    public TrueMuLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
    }

    public TrueMuLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public TrueMuLuckyBlock(String unlocalizedName) {
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
                Enchantment[] e = {Enchantment.projectileProtection, Enchantment.protection, Enchantment.blastProtection, Enchantment.fireProtection};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytBoots), e, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytChestplate), e, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytHelmet), e, 10, worldIn, pos);
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ytLeggings), e, 10, worldIn, pos);
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
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 25, worldIn, pos, rand);
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
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.diamond_block, 10, 0, 0);

                break;
            }
            case 13: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.melon_seeds, "Seeds?", Enchantment.fireAspect, 20);

                break;
            }
            case 14: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.dragon_egg);

                break;
            }
            case 15: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.bucket, 64, 0, 0);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.bucket, "You Found Me~!" + ChatFormatting.AQUA, Enchantment.fireAspect, 10);

                break;
            }
            case 16: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                ExtraFunctions.chat("Believe It Or Not I Think Its The Most Lucky Drop", player);
                break;
            }
            case 17: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.beacon);
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
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.golden_apple, 1, 1), 30, 0, 0);
                break;
            }
            case 22: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 23: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, rand.nextBoolean());
                break;
            }
            case 24: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.barrier);
                ExtraFunctions.chat("Its Barrier", player);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), rand.nextInt(25) + 1, worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.summonMobsNearby(new EntityTruemu(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 50, worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 25, worldIn, pos);
                break;
            }
            case 31: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 32: {
                ExtraFunctions.chat("Ths r lky blks", player);
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 34: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 38: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.cake);
                break;
            }
            case 41: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.dragon_egg), 50, 1, 5);
                ExtraFunctions.chat("How Are You Going To Train These Many Dragons?", player);
                break;
            }
            case 43: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.efficiency, Enchantment.silkTouch, Enchantment.sharpness};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.shears), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 44: {
                Enchantment[] e = {Enchantment.protection, Enchantment.fireProtection, Enchantment.featherFalling, Enchantment.blastProtection, Enchantment.blastProtection, Enchantment.projectileProtection, Enchantment.thorns};
                ItemStack[] s = {new ItemStack(Items.diamond_boots), new ItemStack(Items.diamond_chestplate)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, e, 10, pos, rand);
                break;
            }
            case 45: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.efficiency, Enchantment.silkTouch, Enchantment.sharpness};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 46: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.smite, Enchantment.baneOfArthropods, Enchantment.fireAspect, Enchantment.looting, Enchantment.unbreaking, Enchantment.unbreaking, Enchantment.unbreaking};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), e, 10, worldIn, pos);

                break;
            }
            case 47: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.emerald_block, 5, 0, 0);

                break;
            }
            case 48: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.golden_apple, 1, 1), 15, 0, 0);
                break;
            }
            case 49: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.trueLeggings));
                break;
            }

        }
    }//method ends
}

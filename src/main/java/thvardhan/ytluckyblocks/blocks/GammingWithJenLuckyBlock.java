package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityRabbit;
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
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityCaptainSparklez;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntitySuperGirlyGamer;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class GammingWithJenLuckyBlock extends Block {

    public GammingWithJenLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);

    }

    public GammingWithJenLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public GammingWithJenLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
        }
    }


    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (!world.isRemote && player != null && !(player instanceof FakePlayer)) {
            ExtraFunctions.setOneBlock(world, pos, Blocks.AIR);
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
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 3: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySuperGirlyGamer(worldIn), 5, worldIn, pos);
                break;
            }
            case 4: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySuperGirlyGamer(worldIn), rand.nextInt(30) + 1, worldIn, pos);
                break;
            }
            case 6: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 10: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 25, pos);
                ExtraFunctions.chat("Tame Them If You Want Them.", player);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BONE), 64, 0, 0);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BONE), 64, 1, 10);
                break;
            }
            case 12: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, rand.nextBoolean());
                break;
            }
            case 14: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.COMMAND_BLOCK));
                ExtraFunctions.chat("If You Are On Creative Then Nice Else Its Waste.", player);
                break;
            }
            case 16: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                break;
            }
            case 17: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 18: {
                ExtraFunctions.chat("These Blocks Are Called GamingWithJen Lucky Blocks (In Case You Dont Know)", player);
                break;
            }
            case 19: {
                Enchantment[] e1 = {Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(19)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BED), e1, 10, worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.tntFix(worldIn, pos, 200, player);
                break;
            }
            case 22: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 23: {
                ExtraFunctions.chat(ChatFormatting.DARK_RED + "BEEP BEEP NUKE =WARNING=", player);
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                break;
            }
            case 24: {
                ExtraFunctions.orcArmy(worldIn, pos, 5, rand);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySuperGirlyGamer(worldIn), 30, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn), 3, worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), rand.nextInt(25) + 1, worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 31: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 32: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 34: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), rand.nextInt(30) + 1, worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 40: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 43: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 45: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;
            }
            case 46: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.skyDoesMinecraftLuckyBlock);
                break;
            }
            case 47: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 48: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 49: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), rand.nextInt(19) + 1, worldIn, pos);
                break;
            }
            case 50: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(50), worldIn, pos);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superLeggings));
                break;
            }

        }


    }//method ends
}

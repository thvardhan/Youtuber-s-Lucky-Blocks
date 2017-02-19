package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityZombie;
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
import thvardhan.ytluckyblocks.entity.EntityJeromeASF;
import thvardhan.ytluckyblocks.entity.EntityPeteZahHutt;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class PetaZahHuttLuckyBlock extends Block {
    public PetaZahHuttLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
    }

    public PetaZahHuttLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public PetaZahHuttLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.SPELL_WITCH, d0, d1, d2, d3, d4, d5, new int[0]);
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 1: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.petaBoots));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.petaChestplate));
                break;
            }
            case 6: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.petaHelmet));
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.petaLeggings));
                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 9: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.glowstone);
                break;
            }
            case 10: {
                ExtraFunctions.summonMobsNearby(new EntityPeteZahHutt(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.flower_pot), 23, 1, 2);
                break;
            }
            case 13: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 111, worldIn, pos, rand);
                break;
            }
            case 16: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 17: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
                break;
            }
            case 19: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
                break;
            }
            case 20: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 21: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 22: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 25: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 26: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.flowing_lava);
                break;
            }
            case 27: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.sponge);
                break;
            }
            case 28: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.bedrock);
                break;
            }
            case 29: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.petaHelmet), 15, 0, 0);
                break;
            }
            case 30: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 31: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 32: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_sword));
                break;
            }
            case 34: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_helmet));
                break;
            }
            case 35: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_chestplate));
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_leggings));
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_boots));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.golden_shovel));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.barrier));
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bed);
                break;
            }
            case 41: {
                ExtraFunctions.chat("Hello Its ME!!", player);
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.arrow));
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.beacon));
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 45: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bookshelf);
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 47: {

                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 48: {
                ExtraFunctions.tntFix(worldIn, pos, 30, player);
                break;
            }
            case 49: {
                ExtraFunctions.tntNearby(worldIn, pos, 50, player, rand);
                break;
            }
            case 50: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }


        }//switch ends
    }//method end
}

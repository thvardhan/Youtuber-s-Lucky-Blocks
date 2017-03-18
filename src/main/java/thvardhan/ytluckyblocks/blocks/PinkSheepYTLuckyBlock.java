package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityExplodingTNT;
import thvardhan.ytluckyblocks.entity.EntityPinkSheep;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class PinkSheepYTLuckyBlock extends Block {
    public PinkSheepYTLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);

    }

    public PinkSheepYTLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public PinkSheepYTLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
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
            worldIn.spawnParticle(EnumParticleTypes.SPELL_WITCH, d0, d1, d2, d3, d4, d5);
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 1: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));

                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.pinkBoots));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.pinkChestplate));
                break;
            }
            case 6: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.pinkHelmet));
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.pinkLeggings));
                break;
            }
            case 8: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 9: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 10: {
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 10; j++) {
                        if (j % 2 == 1 && i == 0 || (j % 2 == 0 && i == 1)) {
                            continue;
                        }


                        worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + i, pos.getZ()), Blocks.COAL_BLOCK.getDefaultState(), 2);
                    }

                break;
            }
            case 11: {
                //mustache struc
                break;
            }
            case 12: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.APPLE));
                break;
            }
            case 15: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.QUARTZ_BLOCK);
                break;
            }
            case 16: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.LONG_SLOWNESS.getEffects().get(0).getPotion(), 50, 500));
                break;
            }
            case 17: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWING_LAVA);
                break;
            }
            case 18: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 21: {
                ExtraFunctions.chat(ChatFormatting.DARK_PURPLE + "THE MOD MAKER AND " + player.getName() + " " + ChatFormatting.DARK_PURPLE + "ARE PRANKSTER GANGSTER", player);
                break;
            }
            case 22: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }
            case 23: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CARPET);
                break;
            }
            case 24: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 25: {
                ExtraFunctions.lookUp(worldIn, player);

                break;

            }
            case 26: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 30: {
                ExtraFunctions.summonMobsNearby(new EntityExplodingTNT(worldIn), 55, worldIn, pos, rand);
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                ExtraFunctions.chat("IAM PRNKSTRGNGSTR", player);
                break;

            }
            case 32: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.diamondButton);
                break;
            }
            case 33: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.ironButton);
                break;
            }
            case 34: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 35: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.exploadingTNTLuckyBlock);
                break;
            }
            case 36: {
                ExtraFunctions.tntNearby(worldIn, pos, 100, player, rand);
                break;
            }
            case 37: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsNearby(new EntityPinkSheep(worldIn), 54, worldIn, pos, rand);
                break;
            }
            case 41: {
                ExtraFunctions.tntPlaceNearby(worldIn, pos, 30, rand);
                break;
            }
            case 42: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAULDRON);
                break;
            }
            case 43: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 40, rand);
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 23, worldIn, pos, rand);
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(new EntityPinkSheep(worldIn), 23, worldIn, pos, rand);
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE));
                break;
            }
            case 47: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 4, worldIn, pos);
                break;
            }
            case 48: {
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 10; j++) {
                        if (j % 2 == 1 && i == 0 || (j % 2 == 0 && i == 1)) {
                            continue;
                        }


                        worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + i, pos.getZ()), Blocks.COAL_BLOCK.getDefaultState(), 2);
                    }

                break;
            }
            case 49: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.ICE), 64, 1, 1);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(new EntityExplodingTNT(worldIn), 35, worldIn, pos, rand);
                break;
            }


        }//switch ends
    }//method end
}

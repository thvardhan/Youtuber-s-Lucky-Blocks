package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityExplodingTNT;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class ExploadingTNTLuckyBlock extends Block {
    public ExploadingTNTLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
    }

    public ExploadingTNTLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public ExploadingTNTLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.summonMobsNearby(new EntityExplodingTNT(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 1: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 2: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 3: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.blindness.getId(), 1, 500));
                break;
            }
            case 4: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 5: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.diamondButton);
                break;
            }
            case 6: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.ironButton);
                break;
            }
            case 7: {
                ExtraFunctions.tntPlaceNearby(worldIn, pos, 150, rand);
                ExtraFunctions.tntFix(worldIn, pos, 1, player);
                ExtraFunctions.chat(EnumChatFormatting.DARK_RED + "BLAST LIKE TNT :)", player);
                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 9: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 10: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 11: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 12: {
                EntityGuardian g = new EntityGuardian(worldIn);
                ExtraFunctions.summonMobsNearby(g, 15, worldIn, pos, rand);
                g.setElder();
                ExtraFunctions.summonMobsNearby(g, 5, worldIn, pos, rand);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 15: {
                ExtraFunctions.chat(EnumChatFormatting.RED + "I AM A MOUSE ~!", player);
                break;
            }
            case 16: {
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                ExtraFunctions.tntFix(worldIn, pos, 12, player);
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.gunpowder));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.tnt_minecart), 15, 0, 0);
                break;
            }
            case 19: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.tnt), 15, 0, 0);
                break;
            }
            case 20: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.tnt);

                break;
            }
            case 22: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 23: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 24: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 25: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.redstone), 64, 0, 0);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.golden_apple), 25, 0, 0);
                break;
            }
            case 27: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 28: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.dragon_egg);
                break;
            }
            case 29: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_sword));
                break;
            }
            case 31: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.red_flower);
                break;
            }
            case 32: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.redstone_block);
                break;
            }
            case 33: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.cake);
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.sponge));
                break;
            }
            case 39: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 10, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;
            }
            case 41: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.pinkSheepYTLuckyBlock);
                break;
            }
            case 42: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.tntPlaceNearby(worldIn, pos, 50, rand);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.tnt), 30, 1, 2);
                break;
            }
            case 45: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModBlocks.pinkSheepYTLuckyBlock), 5, 0, 0);
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.flint_and_steel));
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntBoots));
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntChestplate));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntHelmet));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tntLeggings));
                break;
            }


        }//switch ends
    }//method end
}

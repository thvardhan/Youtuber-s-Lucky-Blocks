package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityZombie;
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
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.entity.EntityLachlan;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LachlanLuckyBlock extends Block {
    public LachlanLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);

    }

    public LachlanLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public LachlanLuckyBlock(String unlocalizedName) {
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
    public boolean removedByPlayer(IBlockState state, World worldIn, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (!worldIn.isRemote && player != null && !(player instanceof FakePlayer)) {

            worldIn.setBlockToAir(pos);


            drops(worldIn, pos, player);
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
                ExtraFunctions.summonMobsNearby(new EntityLachlan(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsNearby(new EntityLachlan(worldIn), 29, worldIn, pos, rand);
                break;
            }
            case 2: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 10, worldIn, pos);
                break;
            }
            case 3: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.exploadingTNTLuckyBlock);
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_SWORD));
                break;
            }
            case 5: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 6: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.WOOL);
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 8: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.APPLE, 10, 0, 0);
                break;
            }
            case 9: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 12: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));

                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 15: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;

            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 19: {
                ExtraFunctions.summonMobsNearby(new EntityLachlan(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 20: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.LEAD));
                break;
            }
            case 21: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.NETHER_STAR));
                break;
            }
            case 22: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.SNOWBALL), 64, 1, 1);
                break;
            }
            case 23: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 24: {
                ExtraFunctions.setOneBlock(worldIn, new BlockPos(player.posX, player.posY, player.posZ), Blocks.FLOWING_LAVA);
                break;
            }
            case 25: {
                ExtraFunctions.setOneBlock(worldIn, new BlockPos(player.posX, player.posY, player.posZ), Blocks.FLOWING_WATER);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE));
                break;
            }
            case 27: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.tntRain(worldIn, pos, 100, 1, player);
                break;
            }
            case 29: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BLAZE_ROD), 15, 0, 0);
                break;
            }
            case 31: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 32: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.EMERALD_BLOCK);
                break;
            }
            case 33: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_PICKAXE), e, 3, worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.chat(ChatFormatting.AQUA + "Hello There ~", player);
                break;
            }
            case 36: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 38: {
                EntityGuardian q = new EntityGuardian(worldIn);
                q.setElder();
                ExtraFunctions.summonMobsNearby(q, 5, worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MILK_BUCKET));
                break;
            }
            case 40: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                break;
            }
            case 41: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 300, worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BOOKSHELF);
                break;
            }
            case 44: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 45: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 46: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.REGENERATION.getEffects().get(0).getPotion(), 10, 500));
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacBoots));
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacChestplate));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacHelmet));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacLeggings));
                break;
            }


        }//switch ends
    }//method end
}

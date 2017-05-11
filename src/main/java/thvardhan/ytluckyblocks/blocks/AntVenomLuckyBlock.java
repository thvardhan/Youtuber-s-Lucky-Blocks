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
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityDanTDM;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

//import com.mojang.realmsclient.gui.ChatFormatting;

public class AntVenomLuckyBlock extends Block {

    private static Random rand = new Random();

    public AntVenomLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);

    }

    public AntVenomLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public AntVenomLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    private static void drops(World worldIn, BlockPos pos, EntityPlayer player) {


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
                ExtraFunctions.chat(ChatFormatting.BLACK + "Special Troll", player);
                break;
            }
            case 3: {
                Enchantment[] e = {Enchantment.getEnchantmentByID(0), Enchantment.getEnchantmentByID(1), Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(2), Enchantment.getEnchantmentByID(1)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), e, 5, worldIn, pos);
                break;
            }
            case 4: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.tntFix(worldIn, pos, 64, player);
                break;
            }
            case 6: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.orcArmy(worldIn, pos, 20, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.GOLDEN_APPLE, 15, 1, 5);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.APPLE, 64, 0, 0);
                break;
            }
            case 14: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsNearby(new EntityAntVenom(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 16: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 30, worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityBlaze(worldIn), 20, worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 19: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWING_LAVA);
                break;
            }
            case 22: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                ExtraFunctions.chat(ChatFormatting.BLACK + "Try to break me :V", player);
                break;
            }
            case 23: {
                ExtraFunctions.chat(ChatFormatting.AQUA + "This Lucky Block You Just Opened Is Buged -_- Please Open Other One :D", player);
                break;
            }
            case 24: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 25: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.WOODEN_SWORD, ChatFormatting.BLUE + "Mama", Enchantment.getEnchantmentByID(2), 100);
                break;
            }
            case 26: {
                ExtraFunctions.summonMobsNearby(new EntityDanTDM(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 28: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 30: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.IRON_BLOCK);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityPopularMMO(worldIn), 5, worldIn, pos);
                break;
            }
            case 32: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 25, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 36: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 37: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.BED);
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 40: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.DIAMOND, 64, 0, 0);
                break;
            }
            case 43: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.GOLD_BLOCK), 55, 1, 5);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.EMERALD), 54, 0, 0);
                break;
            }
            case 45: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 46: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, ModBlocks.antVenomLuckyBlock, 5, 0, 0);
                break;
            }
            case 47: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 49: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antChestplate));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antHelmet));
                break;
            }
            case 53: {

                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antLeggings));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antBoots));
                break;
            }

        }
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


}

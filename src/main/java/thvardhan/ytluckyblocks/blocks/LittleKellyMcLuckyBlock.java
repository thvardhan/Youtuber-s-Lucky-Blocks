package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityDanTDM;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.entity.EntityLittleKellyMC;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LittleKellyMcLuckyBlock extends Block {

    public LittleKellyMcLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public LittleKellyMcLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public LittleKellyMcLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), rand.nextInt(50) + 1, worldIn, pos);
                break;
            }
            case 3: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 4: {
                Enchantment[] e1 = {Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(18), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(17)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SHOVEL), e1, 9, worldIn, pos);
                ExtraFunctions.chat("Someone Just Got " + ChatFormatting.DARK_AQUA + "GOD" + ChatFormatting.WHITE + " Shovel", player);
                break;
            }
            case 5: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 64, rand);
                break;
            }
            case 6: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 7: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 10: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 11: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 13: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 14: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 2, worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 16: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(50), worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 18: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 25, worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 22: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 23: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 24: {
                ExtraFunctions.chat("You May Want To Craft Anything :3", player);
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CRAFTING_TABLE);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityLittleKellyMC(worldIn), 40, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littleKellyBoots));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littleKellyChestplate));
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littleKellyHelmet));
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littleKellyLeggings));
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
                ExtraFunctions.chat("GET THE COWS BEFORE OTHERS!", player);
                break;
            }
            case 38: {
                ExtraFunctions.summonMobsNearby(new EntityLittleKellyMC(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.END_PORTAL);
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.NETHER_BRICK);
                break;
            }
            case 41: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModBlocks.petaZahHuttLuckyBlock), 10, 1, 4);
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.COMMAND_BLOCK_MINECART));
                break;
            }
            case 43: {
                ItemStack[] stack = {new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_AXE)
                        , new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.BONE), new ItemStack(Items.GOLDEN_BOOTS),
                        new ItemStack(Items.DIAMOND_PICKAXE)};
                Enchantment[] ench = {Enchantment.getEnchantmentByID(35), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(49), Enchantment.getEnchantmentByID(32), Enchantment.getEnchantmentByID(50)
                        , Enchantment.getEnchantmentByID(34), Enchantment.getEnchantmentByID(51), Enchantment.getEnchantmentByID(21)};


                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, ench, 8, pos, rand);


                break;
            }
            case 44: {

                ExtraFunctions.holeDeathTrap(worldIn, pos);
                ExtraFunctions.trollChat(player);

                break;
            }
            case 45: {
                ItemStack[] s = {new ItemStack(Items.STONE_AXE), new ItemStack(Items.STONE_HOE)
                        , new ItemStack(Items.STONE_PICKAXE), new ItemStack(Items.STONE_SWORD), new ItemStack(Items.DIAMOND_CHESTPLATE),
                        new ItemStack(Items.ACACIA_DOOR)};
                Enchantment[] ench = {Enchantment.getEnchantmentByID(35), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(49), Enchantment.getEnchantmentByID(32), Enchantment.getEnchantmentByID(50)
                        , Enchantment.getEnchantmentByID(34), Enchantment.getEnchantmentByID(51), Enchantment.getEnchantmentByID(21)};


                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, ench, 8, pos, rand);


                break;
            }
            case 46: {


                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);

                break;
            }
            case 47: {

                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 49: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.popularMMOLuckyBlock);
                break;
            }
            case 50: {

                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }


        }//switch ends
    }//method end
}

package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
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
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LuckyBlock extends Block {

    public LuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);
    }

    public LuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 18000000);
    }

    public LuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
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


        switch (rand.nextInt(55)) {//you must have cases that is (4)-1=3

            default: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 52, worldIn, pos, rand);
                break;
            }
            case 0: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 1: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.diamond_block, 10, 0, 0);
                break;
            }
            case 2: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.gold_block, 64, 1, 0);
                break;
            }
            case 3: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.cobblestone, 128, 1, 2);
                break;
            }
            case 4: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.apple, "Super Apple", Enchantment.sharpness, 10);
                break;
            }
            case 6: {
                ExtraFunctions.summonMobsNearby(new EntityLogDotZip(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 7: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.melon_seeds, "Seeds?", Enchantment.fireAspect, 20);
                break;
            }
            case 8: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 30, pos);
                break;
            }
            case 10: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.flowing_lava);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.bed, 64, 0, 0);
                break;
            }
            case 13: {
                ExtraFunctions.summonMobsNearby(new EntityLogDotZip(worldIn), 51, worldIn, pos, rand);
                break;
            }
            case 14: {
                ExtraFunctions.summonMobsNearby(new EntityLogDotZip(worldIn), 21, worldIn, pos, rand);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 16: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.dragon_egg);
                break;
            }
            case 17: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.cake, 20, 0, 0);
                break;
            }
            case 18: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 19: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.swordBlack), 1, 0, 0);
                break;
            }
            case 20: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 52, worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.mic);
                break;
            }
            case 22: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_boots, EnumChatFormatting.BLUE + "Log.zip Not So Lucky Boots", Enchantment.featherFalling, 30);
                break;
            }
            case 23: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_chestplate, EnumChatFormatting.BLUE + "Log.zip Not So Lucky Chestplate", Enchantment.thorns, 10);
                break;
            }
            case 24: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_leggings, EnumChatFormatting.BLUE + "Log.zip Not So Lucky Leggings", Enchantment.blastProtection, 6);
            }
            case 25: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_helmet, EnumChatFormatting.BLUE + "Log.zip Not So Lucky Helmet", Enchantment.projectileProtection, 15);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.beacon));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.bucket, 64, 0, 0);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.bucket, "You Found Me~!" + ChatFormatting.AQUA, Enchantment.fireAspect, 10);
                break;
            }
            case 28: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 29: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
                break;
            }
            case 31: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 1, 0, 0);
                break;
            }
            case 32: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModBlocks.youtube), 30, 1, 5);
                break;
            }
            case 33: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);
                break;
            }
            case 34: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;
            }
            case 35: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtube);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
                break;
            }
            case 36: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.goldButton);
                break;
            }
            case 38: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 39: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.enchanting_table, 4, 0, 0);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.mic), 60, 1, 10);
                break;
            }
            case 41: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 43: {
                ItemStack[] stack = {new ItemStack(Items.diamond_sword), new ItemStack(Items.diamond_axe)
                        , new ItemStack(Items.wooden_sword), new ItemStack(Items.bone), new ItemStack(Items.golden_boots),
                        new ItemStack(Items.diamond_pickaxe)};
                Enchantment[] ench = {Enchantment.fortune, Enchantment.fireAspect, Enchantment.punch, Enchantment.efficiency, Enchantment.flame
                        , Enchantment.unbreaking, Enchantment.infinity, Enchantment.looting};


                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, ench, 8, pos, rand);


                break;
            }
            case 44: {

                ExtraFunctions.holeDeathTrap(worldIn, pos);
                ExtraFunctions.trollChat(player);

                break;
            }
            case 45: {
                ItemStack[] s = {new ItemStack(Items.stone_axe), new ItemStack(Items.stone_hoe)
                        , new ItemStack(Items.stone_pickaxe), new ItemStack(Items.stone_sword), new ItemStack(Items.diamond_chestplate),
                        new ItemStack(Items.acacia_door)};
                Enchantment[] ench = {Enchantment.fortune, Enchantment.fireAspect, Enchantment.punch, Enchantment.efficiency, Enchantment.flame
                        , Enchantment.unbreaking, Enchantment.infinity, Enchantment.looting};


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

                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.logLeggings));
                break;
            }
        }
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


}

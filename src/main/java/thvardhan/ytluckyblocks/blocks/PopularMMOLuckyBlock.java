package thvardhan.ytluckyblocks.blocks;

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
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class PopularMMOLuckyBlock extends Block {


    public PopularMMOLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setBlockBounds(0, 0, 0, 1, 0.9F, 1);

    }

    public PopularMMOLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public PopularMMOLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 3: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 4: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 20, worldIn, pos);
                break;
            }
            case 5: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(30), worldIn, pos);
                break;
            }
            case 6: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 7: {
                Enchantment[] e = {Enchantment.power, Enchantment.punch, Enchantment.infinity};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.bow), e, rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_pickaxe, "Ore Eater", Enchantment.fortune, 20);
                break;
            }
            case 9: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_pickaxe, "Ore Placer", Enchantment.efficiency, 30);
                break;
            }
            case 10: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.efficiency, Enchantment.silkTouch, Enchantment.sharpness};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.shears), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 11: {
                Enchantment[] e = {Enchantment.protection, Enchantment.fireProtection, Enchantment.featherFalling, Enchantment.blastProtection, Enchantment.blastProtection, Enchantment.projectileProtection, Enchantment.thorns};
                ItemStack[] s = {new ItemStack(Items.diamond_boots), new ItemStack(Items.diamond_chestplate)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, s, e, 10, pos, rand);
                break;
            }
            case 12: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.efficiency, Enchantment.silkTouch, Enchantment.sharpness};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e, rand.nextInt(15) + 1, worldIn, pos);
                break;
            }
            case 13: {
                Enchantment[] e = {Enchantment.sharpness, Enchantment.smite, Enchantment.baneOfArthropods, Enchantment.fireAspect, Enchantment.looting, Enchantment.unbreaking, Enchantment.unbreaking, Enchantment.unbreaking};
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), e, 10, worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 17: {
                ExtraFunctions.chat(EnumChatFormatting.AQUA + "Oh Well", player);
                break;
            }
            case 18: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 19: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 20: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.mic);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.captainSparkelzLuckyBlock);
                break;
            }
            case 22: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 20, worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn), 3, worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 26: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.diamond_block);
                break;
            }
            case 27: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.beacon);
                break;
            }
            case 28: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, Blocks.emerald_block, 5, 0, 0);
                break;
            }
            case 29: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.dragon_egg);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 34: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
                break;
            }
            case 35: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.beacon);
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.golden_apple, 64, 1, 30);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.golden_carrot, 5, 1, 5);
                break;
            }
            case 41: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.cake);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.saddle));
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 51, worldIn, pos, rand);
                break;
            }
            case 46: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 47: {
                ExtraFunctions.tntRain(worldIn, pos, 10, 2, player);
                break;
            }
            case 48: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 49: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 25, pos);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 53, worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.popLeggings));
                break;
            }

        }

    }//method ends
}

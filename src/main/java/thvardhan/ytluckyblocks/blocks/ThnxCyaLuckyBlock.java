package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
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

public class ThnxCyaLuckyBlock extends Block {

    public ThnxCyaLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public ThnxCyaLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public ThnxCyaLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.SPELL_MOB, d0, d1, d2, d3, d4, d5);
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


        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 1: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.APPLE));
                break;
            }
            case 2: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.lDShadowLadyLuckyBlock);
                break;
            }
            case 3: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.ironButton);
                break;
            }
            case 4: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.diamondButton);
                break;
            }
            case 5: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 6: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 8: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 9: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 10: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 11: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 12: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 14: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 16: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 17: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 18: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 20: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 21: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 22: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 23: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 25: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }
            case 26: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 27: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 28: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 30: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsNearby(new EntityThnxCya(worldIn), 58, worldIn, pos, rand);
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.thnx_Boots));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.thnx_Chestplate));
                break;
            }
            case 34: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.thnx_Helmet));
                break;
            }
            case 35: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.thnx_Leggings));
                break;
            }
            case 36: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 37: {
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                break;
            }
            case 38: {
                ExtraFunctions.tntRain(worldIn, pos, 10, 1, player);
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
                break;
            }
            case 45: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 51: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.levinSword, "ThnxCya's Own Sword", Enchantment.getEnchantmentByID(21), 10);
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
                break;
            }
            case 55: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
                break;
            }
            case 56: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 57: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.STICKY_PISTON), 10, 1, 10);
                break;
            }
            case 58: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.tewityLuckyBlock);
                break;
            }
            case 59: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.frizzleandpopLuckyBlock);
                break;
            }
            case 60: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MILK_BUCKET), 50, 1, 2);
                break;
            }
            case 61: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 62: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 5, pos);
                break;
            }
            case 63: {
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 64: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BAKED_POTATO));
                break;
            }
            case 65: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.POISONOUS_POTATO, "Eat Me!", Enchantment.getEnchantmentByID(19), 50);
                break;
            }
            case 66: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.FIRE_RESISTANCE.getEffects().get(0).getPotion(), 1000, 20));
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE, 1, 1));
                break;
            }
            case 68: {
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, new ItemStack[]{new ItemStack(ModItems.thnx_Helmet), new ItemStack(ModItems.thnx_Boots)}, e, 5, pos, rand);
                break;
            }
            case 69: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.thnx_Chestplate), e, 10, worldIn, pos);
                break;
            }
            case 70: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 71: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 72: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 73: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 60, worldIn, pos);
                break;
            }
            case 74: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 75: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 11, worldIn, pos, rand);
                break;
            }
            case 76: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 77: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_SWORD, "I AM NOT DIAMOND", Enchantment.getEnchantmentByID(16), rand.nextInt(50) + 1);
                break;
            }
            case 78: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 79: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 80: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.youtubeLuckyBlock));
                break;
            }
            case 81: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.alexircraftLuckyBlock);
                break;
            }
            case 82: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.WATER);
                break;
            }
            case 83: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 84: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 10, worldIn, pos);
                break;
            }
            case 85: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.thnx_Leggings));
                break;
            }
            case 86: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.thnx_Boots));
                break;
            }
            case 87: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 60, worldIn, pos);
                break;
            }
            case 88: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                ExtraFunctions.chat("KILL THE COW", player);
                break;
            }
            case 89: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                break;
            }
            case 90: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.TNT), 64, 1, 5);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.FLINT_AND_STEEL));
                break;
            }
            case 91: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 92: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.snowSword), e, 5, worldIn, pos);
                break;
            }
            case 93: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BED), new Enchantment[]{Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(19)}, 4, worldIn, pos);
                break;
            }
            case 94: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.CAKE));
                break;
            }
            case 95: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.DRAGON_EGG));
                break;
            }
            case 96: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.BEDROCK));
                break;
            }
            case 97: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN), 64, 1, 50);
                break;
            }
            case 98: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), 1, worldIn, pos);
                break;
            }
            case 99: {
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 100: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }


        }//switch ends
    }//method end
}

package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
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

public class LDShadowLadyLuckyBlock extends Block {

    public LDShadowLadyLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public LDShadowLadyLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public LDShadowLadyLuckyBlock(String unlocalizedName) {
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
            worldIn.spawnParticle(EnumParticleTypes.SPELL_MOB, d0, d1, d2, d3, d4, d5, new int[0]);
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

        Enchantment[] e = new Enchantment[4];
        e[0] = Enchantment.flame;
        e[2] = Enchantment.power;
        e[3] = Enchantment.thorns;
        e[1] = Enchantment.looting;


        Random rand = new Random();


        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsNearby(new EntityTewity(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Boots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Chestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Helmet));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Leggings));
                break;
            }
            case 6: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 9: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 10: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 11: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 12: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 15: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                break;
            }
            case 19: {
                ExtraFunctions.summonMobsNearby(new EntityAlexirCraft(worldIn), 30, worldIn, pos, rand);
                break;
            }
            case 20: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 21: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 22: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 23: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 20, rand);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityAntVenom(worldIn), rand.nextInt(6) + 1, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Boots));
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Chestplate));
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Helmet));
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ld_Leggings));
                break;
            }
            case 31: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 32: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }
            case 34: {
                ExtraFunctions.tntRain(worldIn, pos, rand.nextInt(100) + 1, 20, player);
                break;
            }
            case 35: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 36: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.wooden_sword), e, 2, worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
                break;
            }
            case 38: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.mic);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.dragon_egg));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.cake));
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.command_block));
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.arrow), 64, 0, 0);
                break;
            }
            case 45: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_horse_armor));
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), 30, worldIn, pos, rand);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_sword));
                break;
            }
            case 49: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.enchanting_table);
                break;
            }
            case 50: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
                break;
            }
            case 51: {
                ExtraFunctions.summonMobsNearby(new EntityLDShadowLady(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 52: {
                ExtraFunctions.chat("WHY NOT ONLY 200 CREEPS?", player);
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 53: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), 3, worldIn, pos);
                break;
            }
            case 54: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.thnxCyaLuckyBlock);
                break;
            }
            case 55: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.snowSword, "Icy", Enchantment.smite, 10);
                break;
            }
            case 56: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.megaSword, "MegaKilla", Enchantment.sharpness, 6);
                break;
            }
            case 57: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
                break;
            }
            case 58: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
                break;
            }
            case 59: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 60: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.milk_bucket), 50, 1, 2);
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
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), 60, worldIn, pos, rand);
                break;
            }
            case 64: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.baked_potato));
                ExtraFunctions.chat("Here, take this one potato (which you cant even plant :v) for your efforts", player);
                break;
            }
            case 65: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.poisonous_potato, "Eat Me!", Enchantment.knockback, 50);
                break;
            }
            case 66: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.fireResistance.getId(), 1000, 20));
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.golden_apple, 1, 1));
                break;
            }
            case 68: {
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, new ItemStack[]{new ItemStack(ModItems.jeromeBoots), new ItemStack(ModItems.jeromeChestplate)}, e, 5, pos, rand);
                break;
            }
            case 69: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.ld_Chestplate), e, 10, worldIn, pos);
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
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 75: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 76: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 77: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.diamond_sword, "I AM NOT DIAMOND", Enchantment.sharpness, rand.nextInt(50) + 1);
                break;
            }
            case 78: {
                ExtraFunctions.summonMobsNearby(new EntityBlaze(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 79: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 80: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.youtubeLuckyBlock));
                break;
            }
            case 81: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.cake));
                break;
            }
            case 82: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 83: {
                ExtraFunctions.summonMobsNearby(new EntityZombie(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 84: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 85: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.bucket));
                break;
            }
            case 86: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(Potion.damageBoost.getId(), 1000, 24));
                break;
            }
            case 87: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), 40, worldIn, pos, rand);
                break;
            }
            case 88: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                break;
            }
            case 89: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.command_block);
                break;
            }
            case 90: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 91: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 92: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 93: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 94: {
                ExtraFunctions.tntFix(worldIn, pos, 10, player);
                break;
            }
            case 95: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.anvil);
                break;
            }
            case 96: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 97: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 98: {
                ExtraFunctions.summonMobsNearby(new EntitySSundee(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 99: {
                ExtraFunctions.summonMobsNearby(new EntityIhasCupquake(worldIn), 40, worldIn, pos, rand);
                break;
            }
            case 100: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }


        }//switch ends
    }//method end
}

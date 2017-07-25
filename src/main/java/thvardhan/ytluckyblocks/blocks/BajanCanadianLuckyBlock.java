package thvardhan.ytluckyblocks.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySquid;
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
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class BajanCanadianLuckyBlock extends Block {

    public BajanCanadianLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public BajanCanadianLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public BajanCanadianLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
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
            worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, d0, d1, d2, d3, d4, d5);
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


        Enchantment[] e = new Enchantment[4];
        e[0] = Enchantment.getEnchantmentByID(50);
        e[2] = Enchantment.getEnchantmentByID(48);
        e[3] = Enchantment.getEnchantmentByID(7);
        e[1] = Enchantment.getEnchantmentByID(21);


        Random rand = new Random();


        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 1: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanBoots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanChestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanHelmet));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanLeggings));
                break;
            }
            case 6: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanBoots));

                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanChestplate));

                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanHelmet));

                break;
            }
            case 9: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.bajanLeggings));

                break;
            }
            case 10: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.YELLOW_FLOWER);
                break;
            }
            case 11: {
                ExtraFunctions.chat("Hey doods, it's Mitch or BajanCanadian here!", player);
                break;
            }
            case 12: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_AXE, "Betty", Enchantment.getEnchantmentByID(16), 2);
                break;
            }
            case 13: {
                ItemStack s = new ItemStack(Items.GOLD_INGOT);
                s.setStackDisplayName("Chicken Nugget Butter");
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, s, 40, 1, 5);
                break;
            }
            case 14: {
                ItemStack s = new ItemStack(Items.DYE, 1, 4);
                s.setStackDisplayName("Blue Pickels");
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, s, 64, 1, 5);

                break;
            }
            case 15: {
                ItemStack s = new ItemStack(Items.PUMPKIN_PIE);
                s.setStackDisplayName("Pumpkin Pie made by NoochM's Mom");
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, s, 15, 0, 0);
                break;
            }
            case 16: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.FISHING_ROD, "Spec Cannon", Enchantment.getEnchantmentByID(61), 4);
                break;
            }
            case 17: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.DIAMOND_SWORD, "Big Bertha", Enchantment.getEnchantmentByID(16), rand.nextInt(20) + 1);
                break;
            }
            case 18: {
                ItemStack item = new ItemStack(Items.COOKED_FISH);
                item.setStackDisplayName("Vile Creature");
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, item, 40, 0, 0);
                break;
            }
            case 19: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                ExtraFunctions.chat(ChatFormatting.BOLD + "DIAMONDS?!", player);
                break;
            }
            case 20: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                ExtraFunctions.chat("RUUUUUUUUN!!!", player);
                break;
            }
            case 21: {
                ExtraFunctions.chat("Slap dat like button witchya forehead! Take care. -- Best Line :3", player);
                break;
            }
            case 22: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 23: {

                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.REGENERATION.getEffects().get(0).getPotion(), 1000, 4));
                break;
            }
            case 24: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, new ItemStack[]{new ItemStack(Items.BOW)}, e, 10, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 28: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.orcArmy(worldIn, pos, 25, rand);
                break;
            }
            case 31: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 32: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), rand.nextInt(50) + 1, worldIn, pos, rand);
                break;
            }
            case 34: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, rand.nextBoolean());
                break;
            }
            case 35: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 36: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(25), worldIn, pos);

                break;
            }
            case 37: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 38: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.alexircraftLuckyBlock);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), 3, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.tntNearby(worldIn, pos, 50, player, rand);
                break;
            }
            case 41: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityBlaze(worldIn), 25, worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), rand.nextInt(4) + 1, worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 40, rand);
                break;
            }
            case 45: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 48: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 49: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 50: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 51: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BED));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.GLOWSTONE), 50, 0, 0);
                break;
            }
            case 54: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 10, worldIn, pos);
                break;
            }
            case 55: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.battleAxe, "BATTLE!", Enchantment.getEnchantmentByID(50), 5);
                break;
            }
            case 56: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityPopularMMO(worldIn), 3, worldIn, pos);
                break;
            }
            case 57: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }
            case 58: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 59: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), rand.nextInt(5) + 1, worldIn, pos, rand);
                break;
            }
            case 60: {
                ExtraFunctions.summonMobsNearby(new EntityJeromeASF(worldIn), rand.nextInt(40) + 1, worldIn, pos, rand);
                break;
            }
            case 61: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }
            case 62: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 10, worldIn, pos);
                break;
            }
            case 63: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhost(worldIn), 10, worldIn, pos);
                break;
            }
            case 64: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityTruemu(worldIn), 3, worldIn, pos);
                break;
            }
            case 65: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySkyDoesMinecraft(worldIn), 4, worldIn, pos);
                break;
            }
            case 66: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
                break;
            }
            case 67: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWING_LAVA);
                break;
            }
            case 68: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.OBSIDIAN);
                ExtraFunctions.chat(ChatFormatting.AQUA + "Try To Break Me :P", player);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_PICKAXE));
                break;
            }
            case 69: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySerialPlayer(worldIn), 10, worldIn, pos);
                break;
            }
            case 70: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 71: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 72: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 73: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.BREWING_STAND, 40, 1, 10);
                break;
            }
            case 74: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 75: {
                ExtraFunctions.summonMobsNearby(new EntityGhost(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 76: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.BAKED_POTATO), e, 1, worldIn, pos);
                break;
            }
            case 77: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 78: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 79: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), rand.nextInt(30) + 1, worldIn, pos, rand);
                break;
            }
            case 80: {
                ExtraFunctions.summonMobsNearby(new EntitySquid(worldIn), 60, worldIn, pos, rand);
                break;
            }
            case 81: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 82: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 83: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.APPLE));
                break;
            }
            case 84: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.COOKED_PORKCHOP));
                break;
            }
            case 85: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.BOW, "BOWWWW", Enchantment.getEnchantmentByID(49), 4);
                break;
            }
            case 86: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 87: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BOAT), 10, 1, 10);
                break;
            }
            case 88: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 89: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 10, pos);
                break;
            }
            case 90: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 91: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BLAZE_POWDER));
                break;
            }
            case 92: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 93: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 94: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityLogDotZip(worldIn), 3, worldIn, pos);
                break;
            }
            case 95: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySuperGirlyGamer(worldIn), 10, worldIn, pos);
                break;
            }
            case 96: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ARROW));
                break;
            }
            case 97: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MUSHROOM_STEW), 10, 0, 0);
                break;
            }
            case 98: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 99: {
                ExtraFunctions.tntFix(worldIn, pos, 40, player);
                break;
            }
            case 100: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
                break;
            }


        }//switch ends
    }//method end
}

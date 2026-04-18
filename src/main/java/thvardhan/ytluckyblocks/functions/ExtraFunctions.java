package thvardhan.ytluckyblocks.functions;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.EffectInstance;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import thvardhan.ytluckyblocks.blocks.ModBlocks;
import thvardhan.ytluckyblocks.entity.EntityLuckyMob;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class ExtraFunctions {

    public static void stackEnchant(ItemStack stack, Enchantment enchantment, int level) {
        Map<Enchantment, Integer> map = new HashMap<>(EnchantmentHelper.getEnchantments(stack));
        map.put(enchantment, level);
        EnchantmentHelper.setEnchantments(map, stack);
    }

    /** Maps pre-flattening enchantment numeric ids used throughout this mod to 1.16 {@link Enchantment} instances. */
    public static Enchantment enchantmentByLegacyNumericId(int id) {
        switch (id) {
            case 0:
                return Enchantments.ALL_DAMAGE_PROTECTION;
            case 1:
                return Enchantments.FIRE_PROTECTION;
            case 2:
                return Enchantments.FALL_PROTECTION;
            case 3:
                return Enchantments.BLAST_PROTECTION;
            case 4:
                return Enchantments.PROJECTILE_PROTECTION;
            case 5:
                return Enchantments.RESPIRATION;
            case 6:
                return Enchantments.AQUA_AFFINITY;
            case 7:
                return Enchantments.THORNS;
            case 16:
                return Enchantments.SHARPNESS;
            case 17:
                return Enchantments.SMITE;
            case 18:
                return Enchantments.BANE_OF_ARTHROPODS;
            case 19:
                return Enchantments.KNOCKBACK;
            case 20:
                return Enchantments.FIRE_ASPECT;
            case 21:
                return Enchantments.MOB_LOOTING;
            case 32:
                return Enchantments.BLOCK_EFFICIENCY;
            case 33:
                return Enchantments.SILK_TOUCH;
            case 34:
                return Enchantments.UNBREAKING;
            case 35:
                return Enchantments.BLOCK_FORTUNE;
            case 48:
                return Enchantments.POWER_ARROWS;
            case 49:
                return Enchantments.PUNCH_ARROWS;
            case 50:
                return Enchantments.FLAMING_ARROWS;
            case 51:
                return Enchantments.INFINITY_ARROWS;
            case 61:
                return Enchantments.FISHING_LUCK;
            case 62:
                return Enchantments.FISHING_SPEED;
            default:
                return Enchantments.UNBREAKING;
        }
    }

    private static Block[] luckyBlocksForRandom() {
        return new Block[]{ModBlocks.alexircraftLuckyBlock, ModBlocks.antVenomLuckyBlock, ModBlocks.bajanCanadianLuckyBlock, ModBlocks.captainSparkelzLuckyBlock, ModBlocks.danTDMLuckyBlock, ModBlocks.exploadingTNTLuckyBlock, ModBlocks.frizzleandpopLuckyBlock, ModBlocks.gamingWithJenLuckyBlock,
                ModBlocks.iBallisticSquidLuckyBlock, ModBlocks.iHasCupcakeLuckyBlock, ModBlocks.jeromeASFLuckyBlock, ModBlocks.lachlanLuckyBlock, ModBlocks.lDShadowLadyLuckyBlock, ModBlocks.youtubeLuckyBlock, ModBlocks.vikkstar123LuckyBlock, ModBlocks.trueMuLuckyBlock, ModBlocks.thnxCyaLuckyBlock,
                ModBlocks.tewityLuckyBlock, ModBlocks.stampylongheadLuckyBlock, ModBlocks.sSundeeLuckyBlock, ModBlocks.skyDoesMinecraftLuckyBlock, ModBlocks.serialPlayerLuckyBlock, ModBlocks.prestonPlayzLuckyBlock, ModBlocks.mrwooflessLuckyBlock, ModBlocks.petaZahHuttLuckyBlock,
                ModBlocks.pinkSheepYTLuckyBlock, ModBlocks.popularMMOLuckyBlock, ModBlocks.babyDuckLuckyBlock, ModBlocks.babyLeahLuckyBlock, ModBlocks.babyMaxLuckyBlock, ModBlocks.donutTheDogLuckyBlock, ModBlocks.evilLittleKellyLuckyBlock, ModBlocks.littleAllyLuckyBlock, ModBlocks.littleCarlyMcLuckyBlock
                , ModBlocks.littleDonnyLuckyBlock, ModBlocks.littleKellyMcLuckyBlock, ModBlocks.littleLizardGamingLuckyBlock, ModBlocks.maxTheMonkeyLuckyBlock, ModBlocks.sharkyLuckyBlock, ModBlocks.tinyTurtleLuckyBlock, ModBlocks.aphmauLuckyBlock, ModBlocks.scubaSteveLuckyBlock, ModBlocks.littleRopoLuckyBlock,
                ModBlocks.mrCrainerLuckyBlock, ModBlocks.littleAngelLuckyBlock};
    }


    /**
     * Summon Blocks As Drop With Loops
     * Par World,BlockPos,Block,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1)
     */
    public static void summonBlockWithLoop(World worldIn, BlockPos pos, Block block, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        ItemEntity entityitem = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block.asItem()));
        entityitem.setDefaultPickUpDelay();
        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(block.asItem()));
                worldIn.addFreshEntity(entityitem1);
            } else {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block.asItem()));
                worldIn.addFreshEntity(entityitem1);
            }
        }

    }


    /**
     * Summons A Block Like A Drop
     */
    public static void summonBlockAsDrop(BlockPos pos, World worldIn, Block block) {

        float f = 0.5F;
        double d0 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        ItemEntity entityitem = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block.asItem()));
        entityitem.setDefaultPickUpDelay();
        worldIn.addFreshEntity(entityitem);

    }


    /**
     * Summons A Item Like A Drop
     */

    public static void summonItemAsDrop(BlockPos pos, World worldIn, ItemStack stack) {

        float f = 0.5F;
        double d0 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        ItemEntity entityitem = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, stack);
        entityitem.setDefaultPickUpDelay();
        worldIn.addFreshEntity(entityitem);

    }


    /**
     * Set TNT on top of random block.
     * from location of block broken to x+5 x-5 z+5 z-5
     */

    public static void setTntWithBlock(World worldIn, BlockPos pos, Random rand) {

        Block random;
        switch (rand.nextInt(5)) {
            case 0: {
                random = Blocks.DIAMOND_BLOCK;
                break;
            }
            case 1: {
                random = Blocks.OBSIDIAN;
                break;
            }
            case 2: {
                random = Blocks.DIRT;
                break;
            }
            case 3: {
                random = Blocks.OAK_LOG;
                break;
            }
            case 4: {
                random = Blocks.ANVIL;
                break;
            }
            default: {
                random = Blocks.DRAGON_EGG;
                break;
            }
        }

        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() + 5, pos.getY(), pos.getZ() - 2 + i);
            worldIn.setBlock(a, random.defaultBlockState(), 3);
            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlock(b, Blocks.TNT.defaultBlockState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlock(c, Blocks.FIRE.defaultBlockState(), 3);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() - 5, pos.getY(), pos.getZ() + 2 - i);
            worldIn.setBlock(a, random.defaultBlockState(), 3);

            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlock(b, Blocks.TNT.defaultBlockState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlock(c, Blocks.FIRE.defaultBlockState(), 3);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() - 2 + i, pos.getY(), pos.getZ() + 5);
            worldIn.setBlock(a, random.defaultBlockState(), 3);

            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlock(b, Blocks.TNT.defaultBlockState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlock(c, Blocks.FIRE.defaultBlockState(), 3);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() + 2 - i, pos.getY(), pos.getZ() - 5);
            worldIn.setBlock(a, random.defaultBlockState(), 3);

            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlock(b, Blocks.TNT.defaultBlockState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlock(c, Blocks.FIRE.defaultBlockState(), 3);
        }


    }


    public static void summonEnchantedItemAsDrop(World worldIn, BlockPos pos,
                                                 Item i, String name, Enchantment e, int amp) {

        ItemStack itemE = new ItemStack(i);
        stackEnchant(itemE, e, amp);
        itemE.setHoverName(new StringTextComponent(name));
        summonItemAsDrop(pos, worldIn, itemE);
    }


    /**
     * Tp to Random Loc.
     */


    public static void tpPlayer(PlayerEntity player) {
        player.setPos(player.getX(), (int) player.getY() + 500, player.getZ());


    }


    public static void setOneBlock(World worldIn, BlockPos pos, Block block) {
        worldIn.setBlock(pos, block.defaultBlockState(), 2);
    }


    /**
     * Summon Items As Drop With Loops
     * Par World,BlockPos,Item,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1)
     */

    public static void summonItemWithLoop(World worldIn, BlockPos pos, Item item, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;

        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(item));
                entityitem1.setDefaultPickUpDelay();
                worldIn.addFreshEntity(entityitem1);
            } else {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(item));
                entityitem1.setDefaultPickUpDelay();
                worldIn.addFreshEntity(entityitem1);
            }
        }

    }


    /**
     * Summon ItemsStack As Drop With Loops
     * Par World,BlockPos,Itemstack,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1)
     */

    public static void summonItemStackWithLoop(World worldIn, BlockPos pos, ItemStack item, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.getRandom().nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        ItemEntity entityitem = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, item);
        entityitem.setDefaultPickUpDelay();
        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), item);
                worldIn.addFreshEntity(entityitem1);
            } else {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, item);
                worldIn.addFreshEntity(entityitem1);
            }
        }

    }


    /**
     * lets make a troll chat XD
     */
    public static void trollChat(PlayerEntity player) {


        player.sendMessage(new StringTextComponent("It Was A Troll... Or Maybe....").withStyle(TextFormatting.BLUE), Util.NIL_UUID);


    }


    public static void toVoid(World worldIn, BlockPos pos) {


        int h = pos.getY();
        for (int i = 0; i <= h; i++) {
            BlockPos AIR = new BlockPos(pos.getX(), pos.getY() - i, pos.getZ());
            worldIn.setBlock(AIR, Blocks.AIR.defaultBlockState(), 2);
        }


    }


    /**
     * contains Some Stuff!
     */

    public static void redstoneKit(World worldIn, BlockPos pos) {

        summonItemWithLoop(worldIn, pos, Items.REDSTONE, 64, 0, 0);
        summonBlockWithLoop(worldIn, pos, Blocks.STICKY_PISTON, 20, 0, 0);
        summonItemWithLoop(worldIn, pos, Items.SLIME_BALL, 40, 1, 5);
        summonItemWithLoop(worldIn, pos, Items.REPEATER, 10, 0, 0);

    }


    public static void hellWellStructure(World worldIn, BlockPos pos, Random rand) {


        worldIn.setBlock(pos, Blocks.LAVA.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);

        int r = rand.nextInt(5) + 1;
        for (int i = 0; i < r; i++) {
            worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.NETHER_BRICK_FENCE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.NETHER_BRICK_FENCE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.NETHER_BRICK_FENCE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.NETHER_BRICK_FENCE.defaultBlockState(), 2);

        }

        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ()), Blocks.GLOWSTONE.defaultBlockState(), 2);
        //setting bricks and NETHERRACKs
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHERRACK.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHERRACK.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHERRACK.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHERRACK.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 2, pos.getZ()), ModBlocks.luckyPressurePlate.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.FIRE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.FIRE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.FIRE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.FIRE.defaultBlockState(), 2);

        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ()), Blocks.NETHER_BRICKS.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ()), Blocks.NETHER_BRICKS.defaultBlockState(), 2);


    }


    public static void endWellStruct(World worldIn, BlockPos pos, Random rand) {


        worldIn.setBlock(pos, Blocks.WATER.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() - 1), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 1), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 1), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() + 1), Blocks.END_STONE.defaultBlockState(), 2);

        int r = rand.nextInt(6) + 1;
        for (int i = 0; i < r; i++) {
            worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.BIRCH_FENCE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.BIRCH_FENCE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.BIRCH_FENCE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.BIRCH_FENCE.defaultBlockState(), 2);

        }

        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ()), Blocks.BEACON.defaultBlockState(), 2);
        //setting bricks and NETHERRACKs
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.OBSIDIAN.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.OBSIDIAN.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.OBSIDIAN.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.OBSIDIAN.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.END_PORTAL_FRAME.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 2, pos.getZ()), ModBlocks.luckyPressurePlate.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.END_PORTAL_FRAME.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.END_PORTAL_FRAME.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.END_PORTAL_FRAME.defaultBlockState(), 2);

        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() - 1), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() + 1), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ()), Blocks.END_STONE.defaultBlockState(), 2);
        worldIn.setBlock(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ()), Blocks.END_STONE.defaultBlockState(), 2);


    }


    public static void addEnchantsMany(ItemStack stack, Enchantment[] e, int amp, World worldIn, BlockPos pos) {

        for (Enchantment anE : e) {
            stackEnchant(stack, anE, amp);
        }

        summonItemAsDrop(pos, worldIn, stack);

    }


    public static void addRandomEnchtToRandomItems(World worldIn, ItemStack[] stack, Enchantment[] ench, int ampUpperLimit, BlockPos pos, Random rand) {


        int r = rand.nextInt(stack.length);
        int a = rand.nextInt(stack.length);
        if (r == a) {
            a -= 1;
        }
        for (int i = a; i < r; i++) {
            int y = rand.nextInt(ench.length);
            int z = rand.nextInt(ench.length);
            if (y == z) {
                z -= 1;
            }
            for (int j = z; j < y; j++) {

                int n = rand.nextInt(ench.length);
                stackEnchant(stack[i], ench[n], rand.nextInt(ampUpperLimit) + 1);


            }
            summonItemStackWithLoop(worldIn, pos, stack[i], 1, 0, 0);

        }


    }


    public static void holeDeathTrap(World worldIn, BlockPos pos) {


        int h = pos.getY();
        for (int i = 0; i < h; i++) {
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - i, pos.getZ()), Blocks.AIR.defaultBlockState(), 2);
        }


    }


    public static void mountain(World worldIn, BlockPos pos, Random rand) {
        int r = rand.nextInt(6) + 1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY() + i, pos.getZ() + j), Blocks.DIAMOND_BLOCK.defaultBlockState(), 2);


            }

        }

    }

    public static void mountainOne(World worldIn, BlockPos pos, Random rand) {
        int r = rand.nextInt(6) + 1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY() + i, pos.getZ() + j), Blocks.EMERALD_BLOCK.defaultBlockState(), 2);


            }

        }

    }


    public static void foodKit(World worldIn, BlockPos pos) {

        summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 10, 1, 30);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BREAD), 16, 1, 10);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 5, 0, 0);
        summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.COOKED_BEEF), 34, 0, 0);

    }


    public static void chat(String chat, PlayerEntity player) {


        player.sendMessage(new StringTextComponent(chat), Util.NIL_UUID);


    }

    public static void materialKit(World worldIn, BlockPos pos, Random rand) {


        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.DIAMOND), rand.nextInt(50) + 1, 1, rand.nextInt(5));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLD_INGOT), rand.nextInt(50) + 1, 1, rand.nextInt(15));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.IRON_INGOT), rand.nextInt(30) + 1, 1, rand.nextInt(10));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.EMERALD), rand.nextInt(40) + 1, 1, rand.nextInt(4));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.COAL), rand.nextInt(10) + 1, 1, rand.nextInt(30));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.CHEST_MINECART), rand.nextInt(10) + 1, 0, 0);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BLAZE_POWDER), rand.nextInt(64) + 1, 1, rand.nextInt(15));

    }


    public static void burgerStruct(World worldIn, BlockPos pos) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY(), pos.getZ() + i), Blocks.IRON_BLOCK.defaultBlockState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY() + 1, pos.getZ() + i), Blocks.DIAMOND_BLOCK.defaultBlockState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY() + 2, pos.getZ() + i), Blocks.EMERALD_BLOCK.defaultBlockState(), 2);
            }
        }


    }


    public static void burgerStructOne(World worldIn, BlockPos pos) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY(), pos.getZ() + i), Blocks.GLOWSTONE.defaultBlockState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY() + 1, pos.getZ() + i), Blocks.DRAGON_EGG.defaultBlockState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlock(new BlockPos(pos.getX() + j, pos.getY() + 2, pos.getZ() + i), Blocks.BEACON.defaultBlockState(), 2);
            }
        }


    }


    public static void orcArmy(World worldIn, BlockPos pos, int loop, Random rand) {


        for (int i = 0; i <= loop - 1; i++) {

            ZombieEntity e = EntityType.ZOMBIE.create(worldIn);
            if (e == null) {
                continue;
            }
            e.setPos(pos.getX(), pos.getY(), pos.getZ());
            e.setCustomNameVisible(true);
            e.setCustomName(new StringTextComponent("Orc Army"));

            e.setItemSlot(EquipmentSlotType.HEAD, new ItemStack(ModItems.ytHelmet));

            switch (rand.nextInt(5)) {
                case 1: {
                    e.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.DIAMOND_SWORD));
                    break;
                }
                case 2: {
                    e.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
                    break;
                }
                case 3: {
                    e.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.STONE_AXE));
                    break;
                }
                case 0: {
                    e.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
                    break;
                }

                case 4: {
                    e.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(ModItems.devilSword));

                }

            }


            worldIn.addFreshEntity(e);
        }


    }


    public static void lookUp(World w, PlayerEntity p) {


        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();

        setOneBlock(w, new BlockPos(x, y + 10, z), Blocks.ANVIL);


    }

    //e.setRabbitType(99);

    public static void tntFix(World worldIn, BlockPos pos, int amOfTNT, PlayerEntity player) {

        for (int i = 0; i < amOfTNT; i++) {
            TNTEntity entityTNTprimed = new TNTEntity(worldIn, (double) ((float) pos.getX() + 0.5F), (double) pos.getY(), (double) ((float) pos.getZ() + 0.5F), player);
            entityTNTprimed.setFuse(worldIn.getRandom().nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.addFreshEntity(entityTNTprimed);

        }

    }

    public static void tntNearby(World worldIn, BlockPos pos, int amOfTNT, PlayerEntity player, Random rand) {
        for (int i = 0; i < amOfTNT; i++) {
            TNTEntity entityTNTprimed = new TNTEntity(worldIn, (double) ((float) pos.getX() + 0.5F) + rand.nextInt(20), (double) pos.getY() + rand.nextInt(20), (double) ((float) pos.getZ() + 0.5F) + rand.nextInt(20), player);
            entityTNTprimed.setFuse(worldIn.getRandom().nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.addFreshEntity(entityTNTprimed);

        }

    }

    public static void tntRain(World worldIn, BlockPos pos, int amOfTNT, int skip, PlayerEntity player) {

        for (int i = 0; i < amOfTNT; i++) {
            TNTEntity entityTNTprimed = new TNTEntity(worldIn, (double) ((float) pos.getX() + 0.5F), (double) pos.getY() + (skip * i), (double) ((float) pos.getZ() + 0.5F), player);
            entityTNTprimed.setFuse(worldIn.getRandom().nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.addFreshEntity(entityTNTprimed);

        }

    }

    public static void potionKit(World worldIn, BlockPos pos, Random rand) {


        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENDER_PEARL), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENDER_EYE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MAGMA_CREAM), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BREWING_STAND), 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.FERMENTED_SPIDER_EYE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GLISTERING_MELON_SLICE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLD_NUGGET), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.SPIDER_EYE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.NETHER_WART), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GLASS_BOTTLE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BLAZE_ROD), rand.nextInt(50) + 1, 0, 0);


    }


    public static void musicKit(World worldIn, BlockPos pos) {
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX.asItem()));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_11));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_13));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_BLOCKS));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_CAT));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_CHIRP));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_FAR));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_MALL));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_MELLOHI));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_STAL));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_STRAD));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_WAIT));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_WARD));


    }

    public static void towerStruct(World worldIn, BlockPos pos) {

        int flags = 2;
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), Blocks.REDSTONE_BLOCK.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), Blocks.LAPIS_BLOCK.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()), Blocks.COAL_BLOCK.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ()), Blocks.GOLD_BLOCK.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 4, pos.getZ()), Blocks.IRON_BLOCK.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 5, pos.getZ()), Blocks.EMERALD_BLOCK.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 6, pos.getZ()), Blocks.DIAMOND_BLOCK.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 7, pos.getZ()), Blocks.OBSIDIAN.defaultBlockState(), flags);
        worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + 8, pos.getZ()), Blocks.DRAGON_EGG.defaultBlockState(), flags);


    }


    public static void randomSixtyFourTower(World worldIn, BlockPos pos, Random rand) {

        for (int i = 0; i < 64; i++) {
            int r = rand.nextInt(8);
            if (r == 0) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.IRON_BLOCK.defaultBlockState(), 2);
            } else if (r == 1) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.DIAMOND_BLOCK.defaultBlockState(), 2);
            } else if (r == 2) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.GOLD_BLOCK.defaultBlockState(), 2);
            } else if (r == 3) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.EMERALD_BLOCK.defaultBlockState(), 2);
            } else if (r == 4) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.BEACON.defaultBlockState(), 2);
            } else if (r == 5) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.COAL_BLOCK.defaultBlockState(), 2);
            } else if (r == 6) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.REDSTONE_BLOCK.defaultBlockState(), 2);
            } else if (r == 7) {
                worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.DRAGON_EGG.defaultBlockState(), 2);
            }


        }
    }

    public static void trollDiamondTrapWithChanceOfNotTroll(World worldIn, BlockPos pos, boolean isTrap) {


        if (isTrap) {
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), Blocks.DIAMOND_ORE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 2, pos.getZ()), Blocks.DIAMOND_ORE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 3, pos.getZ()), Blocks.DIAMOND_ORE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 4, pos.getZ()), Blocks.LAVA.defaultBlockState(), 2);

        } else {
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), Blocks.DIAMOND_ORE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 2, pos.getZ()), Blocks.DIAMOND_ORE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 3, pos.getZ()), Blocks.DIAMOND_ORE.defaultBlockState(), 2);
            worldIn.setBlock(new BlockPos(pos.getX(), pos.getY() - 4, pos.getZ()), Blocks.WATER.defaultBlockState(), 2);

        }


    }


    public static void summonCowNearby(World worldIn, BlockPos pos, int loop, Random rand) {


        for (int i = 0; i <= loop - 1; i++) {

            CowEntity e = EntityType.COW.create(worldIn);
            if (e == null) {
                continue;
            }
            e.setPos(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            e.setCustomNameVisible(true);
            e.setDropChance(EquipmentSlotType.MAINHAND, 0.7F);
            e.setDropChance(EquipmentSlotType.HEAD, 1.0F);
            e.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.GOLDEN_APPLE));
            e.setItemSlot(EquipmentSlotType.HEAD, new ItemStack(Items.GOLD_INGOT));
            e.setCustomName(new StringTextComponent("I AM SPECIAL"));
            worldIn.addFreshEntity(e);
        }


    }


    public static void luckyBlockTower(World worldIn, BlockPos pos) {
        Block[] luckyBlocks = luckyBlocksForRandom();
        for (int i = 0; i < luckyBlocks.length; i++) {
            setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), luckyBlocks[i]);
        }
    }

    public static void effectPlayer(PlayerEntity player, EffectInstance effect) {
        player.addEffect(effect);
    }

    public static void setHoleWithMites(World worldIn, PlayerEntity player) {

        double x = player.getX() - 1;
        double y = player.getY();
        double z = player.getZ() - 1;


        worldIn.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(x + 1, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(x, y - 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(x + 1, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(x + 1, y - 2, z + 1), Blocks.AIR.defaultBlockState(), 3);


        EndermiteEntity miteTemplate = EntityType.ENDERMITE.create(worldIn);
        if (miteTemplate != null) {
            ExtraFunctions.summonMobsOnBreakBlock(miteTemplate, 50, worldIn, new BlockPos(x, y, z));
        }


    }


    public static void sandRain(World worldIn, PlayerEntity player) {
        worldIn.setBlock(new BlockPos(player.getX(), player.getY() + 2, player.getZ()), Blocks.SAND.defaultBlockState(), 2);
    }


    public static void flyingIsle(World worldIn, BlockPos pos) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                worldIn.setBlock(new BlockPos(pos.getX() + i, pos.getY() + 40, pos.getZ() + j), Blocks.DIAMOND_BLOCK.defaultBlockState(), 2);
        }

    }


    public static void anvilRain(World worldIn, BlockPos pos) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                worldIn.setBlock(new BlockPos(pos.getX() + i, pos.getY() + 40, pos.getZ() + j), Blocks.ANVIL.defaultBlockState(), 2);
        }

    }


    public static void slimeFort(World worldIn, PlayerEntity player) {
        worldIn.setBlock(new BlockPos(player.getX(), player.getY() - 1, player.getZ()), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX() + 1, player.getY() - 1, player.getZ()), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX() - 1, player.getY() - 1, player.getZ()), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX(), player.getY() - 1, player.getZ() + 1), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX(), player.getY() - 1, player.getZ() - 1), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX() + 1, player.getY() - 1, player.getZ() + 1), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX() - 1, player.getY() - 1, player.getZ() - 1), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX() - 1, player.getY() - 1, player.getZ() + 1), Blocks.SLIME_BLOCK.defaultBlockState(), 3);
        worldIn.setBlock(new BlockPos(player.getX() + 1, player.getY() - 1, player.getZ() - 1), Blocks.SLIME_BLOCK.defaultBlockState(), 3);

        //	for(int i=0;i<4;i++)
        //		for(int j=0;j<3;j++)
        //			worldIn.setBlock(new BlockPos(player.getX(),player.getY()-1,player.getZ()), Blocks.SLIME_BLOCK.defaultBlockState(), 3);


    }

    /*
     * summons 40 blocks in each dir.
     */
    public static void parabolaStruct(World worldIn, BlockPos pos) {
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ() + i), Blocks.OAK_PLANKS);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() + i, pos.getY() + i, pos.getZ()), Blocks.COAL_ORE);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - i, pos.getY() + i, pos.getZ()), Blocks.NETHER_QUARTZ_ORE);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ() - i), Blocks.OBSIDIAN);
        }
    }//TODO ENHANCE THIS THING.


    public static void saflyTeleportPlayer(World worldIn, PlayerEntity player) {
        flyingIsle(worldIn, new BlockPos(player.getX(), player.getY(), player.getZ()));
        tpPlayer(player);
    }


    public static void tntPlaceNearby(World worldIn, BlockPos pos, int amOfTNT, Random rand) {
        for (int i = 0; i < amOfTNT; i++) {
            worldIn.setBlock(new BlockPos(pos.getX() + rand.nextInt(30), pos.getY() + rand.nextInt(30), pos.getZ() + rand.nextInt(30)), Blocks.TNT.defaultBlockState(), 2);
        }

    }


    public static void luckyBlockBox(World worldIn, BlockPos pos, Random r) {
        Block[] luckyBlocks = luckyBlocksForRandom();
        for (int k = 0; k < 4; k++)
            for (int i = -1; i < 4; i++)
                for (int j = 0; j < 5; j++)
                    ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - 2 + j, pos.getY() - 1 + k, pos.getZ() + i), Blocks.RED_SANDSTONE);

        for (int k = 0; k < 2; k++)
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - 1 + j, pos.getY() + k, pos.getZ() + i), luckyBlocks[r.nextInt(luckyBlocks.length)]);
    }


    public static void deathHole(World worldIn, PlayerEntity player) {
        double x = player.getX();
        double y = player.getY();
        double z = player.getZ();

        for (int i = 1; i < (int) y; i++) {
            setOneBlock(worldIn, new BlockPos(x, y - i, z), Blocks.COBWEB);

        }


    }
    /*
	 * IT SAYS SOMTHING AND DOES SOMTHING
	 */

    public static void tornadoStruct(World worldIn, BlockPos pos, Random r) {
        Block[] luckyBlocks = luckyBlocksForRandom();
        summonItemAsDrop(pos, worldIn, new ItemStack(luckyBlocks[r.nextInt(luckyBlocks.length)]));
    }

    public static Item randomBlock() {
        Random rand = new Random();
        Block[] luckyBlocks = luckyBlocksForRandom();
        return Item.byBlock(luckyBlocks[rand.nextInt(luckyBlocks.length)]);
    }

    public static void fireCamp(World worldIn, PlayerEntity player) {
        setOneBlock(worldIn, new BlockPos(player.getX(), player.getY() - 1, player.getZ()), Blocks.NETHERRACK);
        setOneBlock(worldIn, new BlockPos(player.getX(), player.getY(), player.getZ()), Blocks.FIRE);
        double x = player.getX();
        double y = player.getY();
        double z = player.getZ();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++)
                    setOneBlock(worldIn, new BlockPos(x - 3 + j, y - 3 + i, z + k), Blocks.TNT);


            }
        }

        tntFix(worldIn, new BlockPos(x, y, z), 1, player);

    }


    public static void tpPlayerInGround(PlayerEntity player) {

        player.setPos(player.getX(), (int) player.getY() - 3, player.getZ());

    }

    public static void obsidianCageStruct(World worldIn, PlayerEntity player) {
        double x = player.getX();
        double y = player.getY();
        double z = player.getZ();

        setOneBlock(worldIn, new BlockPos(x + 1, y, z), Blocks.OBSIDIAN);
        setOneBlock(worldIn, new BlockPos(x + 1, y + 1, z), Blocks.OBSIDIAN);

        setOneBlock(worldIn, new BlockPos(x - 1, y, z), Blocks.OBSIDIAN);
        setOneBlock(worldIn, new BlockPos(x - 1, y + 1, z), Blocks.OBSIDIAN);

        setOneBlock(worldIn, new BlockPos(x, y, z + 1), Blocks.OBSIDIAN);
        setOneBlock(worldIn, new BlockPos(x, y + 1, z + 1), Blocks.OBSIDIAN);

        setOneBlock(worldIn, new BlockPos(x, y, z - 1), Blocks.OBSIDIAN);
        setOneBlock(worldIn, new BlockPos(x, y + 1, z - 1), Blocks.OBSIDIAN);

        setOneBlock(worldIn, new BlockPos(x, y - 1, z), Blocks.OBSIDIAN);
        setOneBlock(worldIn, new BlockPos(x, y + 2, z), Blocks.OBSIDIAN);
    }


    private static MobEntity copyMobFromTemplate(MobEntity template, World level) {
        Entity spawned = template.getType().create(level);
        if (spawned instanceof MobEntity) {
            return (MobEntity) spawned;
        }
        return null;
    }

    public static void summonMobsOnBreakBlock(MobEntity mob, int loop, World worldIn, BlockPos pos) {
        for (int i = 0; i < loop; i++) {
            MobEntity spawned = copyMobFromTemplate(mob, worldIn);
            if (spawned == null) {
                continue;
            }
            spawned.setPos(pos.getX(), pos.getY(), pos.getZ());
            spawned.setCustomNameVisible(true);
            worldIn.addFreshEntity(spawned);
        }
    }

    public static void summonMobsNearby(MobEntity mob, int loop, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i < loop; i++) {
            MobEntity spawned = copyMobFromTemplate(mob, worldIn);
            if (spawned == null) {
                continue;
            }
            spawned.setPos(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            spawned.setCustomNameVisible(true);
            worldIn.addFreshEntity(spawned);
        }
    }

    public static void summonTammedWolfs(World worldIn, PlayerEntity player, int loop, BlockPos pos) {


        for (int i = 0; i <= loop - 1; i++) {

            WolfEntity w = EntityType.WOLF.create(worldIn);
            if (w == null) {
                continue;
            }
            w.setPos(pos.getX(), pos.getY(), pos.getZ());
            w.setTame(true);
            w.setOrderedToSit(true);
            w.setOwnerUUID(player.getUUID());
            worldIn.addFreshEntity(w);
        }
    }

    public static void summonLuckyMobs(World worldIn, int loop, BlockPos pos) {


        for (int i = 0; i <= loop - 1; i++) {

            if (EntityLuckyMob.TYPE == null) {
                continue;
            }
            EntityLuckyMob w = EntityLuckyMob.TYPE.create(worldIn);
            if (w == null) {
                continue;
            }
            w.setPos(pos.getX(), pos.getY(), pos.getZ());
            worldIn.addFreshEntity(w);
        }
    }


}//CLASS END HERE
		
		
		


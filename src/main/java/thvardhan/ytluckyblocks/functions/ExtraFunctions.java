package thvardhan.ytluckyblocks.functions;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import thvardhan.ytluckyblocks.blocks.ModBlocks;
import thvardhan.ytluckyblocks.entity.EntityLuckyMob;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;
import java.util.UUID;

public class ExtraFunctions {


    private static Block[] b = {ModBlocks.alexircraftLuckyBlock, ModBlocks.antVenomLuckyBlock, ModBlocks.bajanCanadianLuckyBlock, ModBlocks.captainSparkelzLuckyBlock, ModBlocks.danTDMLuckyBlock, ModBlocks.exploadingTNTLuckyBlock, ModBlocks.frizzleandpopLuckyBlock, ModBlocks.gamingWithJenLuckyBlock,
            ModBlocks.iBallisticSquidLuckyBlock, ModBlocks.iHasCupcakeLuckyBlock, ModBlocks.jeromeASFLuckyBlock, ModBlocks.lachlanLuckyBlock, ModBlocks.lDShadowLadyLuckyBlock, ModBlocks.youtubeLuckyBlock, ModBlocks.vikkstar123LuckyBlock, ModBlocks.trueMuLuckyBlock, ModBlocks.thnxCyaLuckyBlock,
            ModBlocks.tewityLuckyBlock, ModBlocks.stampylongheadLuckyBlock, ModBlocks.sSundeeLuckyBlock, ModBlocks.skyDoesMinecraftLuckyBlock, ModBlocks.serialPlayerLuckyBlock, ModBlocks.prestonPlayzLuckyBlock, ModBlocks.mrwooflessLuckyBlock, ModBlocks.petaZahHuttLuckyBlock,
            ModBlocks.pinkSheepYTLuckyBlock, ModBlocks.popularMMOLuckyBlock, ModBlocks.babyDuckLuckyBlock, ModBlocks.babyLeahLuckyBlock, ModBlocks.babyMaxLuckyBlock, ModBlocks.donutTheDogLuckyBlock, ModBlocks.evilLittleKellyLuckyBlock, ModBlocks.littleAllyLuckyBlock, ModBlocks.littleCarlyMcLuckyBlock
            , ModBlocks.littleDonnyLuckyBlock, ModBlocks.littleKellyMcLuckyBlock, ModBlocks.littleLizardGamingLuckyBlock, ModBlocks.maxTheMonkeyLuckyBlock, ModBlocks.sharkyLuckyBlock, ModBlocks.tinyTurtleLuckyBlock, ModBlocks.aphmauLuckyBlock, ModBlocks.scubaSteveLuckyBlock, ModBlocks.littleRopoLuckyBlock,
            ModBlocks.mrCrainerLuckyBlock, ModBlocks.littleAngelLuckyBlock};


    /**
     * Summon Blocks As Drop With Loops
     * Par World,BlockPos,Block,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1)
     */
    public static void summonBlockWithLoop(World worldIn, BlockPos pos, Block block, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
        entityitem.setDefaultPickupDelay();
        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(block));
                worldIn.spawnEntityInWorld(entityitem1);
            } else {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
                worldIn.spawnEntityInWorld(entityitem1);
            }
        }

    }


    /**
     * Summons A Block Like A Drop
     */
    public static void summonBlockAsDrop(BlockPos pos, World worldIn, Block block) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
        entityitem.setDefaultPickupDelay();
        worldIn.spawnEntityInWorld(entityitem);

    }


    /**
     * Summons A Item Like A Drop
     */

    public static void summonItemAsDrop(BlockPos pos, World worldIn, ItemStack stack) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, stack);
        entityitem.setDefaultPickupDelay();
        worldIn.spawnEntityInWorld(entityitem);

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
                random = Blocks.LOG;
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
            worldIn.setBlockState(a, random.getDefaultState(), 3);
            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlockState(b, Blocks.TNT.getDefaultState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlockState(c, Blocks.FIRE.getDefaultState(), 3);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() - 5, pos.getY(), pos.getZ() + 2 - i);
            worldIn.setBlockState(a, random.getDefaultState(), 3);

            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlockState(b, Blocks.TNT.getDefaultState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlockState(c, Blocks.FIRE.getDefaultState(), 3);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() - 2 + i, pos.getY(), pos.getZ() + 5);
            worldIn.setBlockState(a, random.getDefaultState(), 3);

            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlockState(b, Blocks.TNT.getDefaultState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlockState(c, Blocks.FIRE.getDefaultState(), 3);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() + 2 - i, pos.getY(), pos.getZ() - 5);
            worldIn.setBlockState(a, random.getDefaultState(), 3);

            BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
            worldIn.setBlockState(b, Blocks.TNT.getDefaultState(), 3);
            BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
            worldIn.setBlockState(c, Blocks.FIRE.getDefaultState(), 3);
        }


    }


    public static void summonEnchantedItemAsDrop(World worldIn, BlockPos pos,
                                                 Item i, String name, Enchantment e, int amp) {

        ItemStack itemE = new ItemStack(i);
        itemE.addEnchantment(e, amp);
        itemE.setStackDisplayName(name);
        summonItemAsDrop(pos, worldIn, itemE);
    }


    /**
     * Tp to Random Loc.
     */


    public static void tpPlayer(EntityPlayer player) {
        player.setPosition(player.posX, player.serverPosY = (int) player.posY + 500, player.posZ);


    }


    public static void setOneBlock(World worldIn, BlockPos pos, Block block) {
        worldIn.setBlockState(pos, block.getDefaultState(), 2);
    }


    /**
     * Summon Items As Drop With Loops
     * Par World,BlockPos,Item,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1)
     */

    public static void summonItemWithLoop(World worldIn, BlockPos pos, Item item, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;

        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(item));
                entityitem1.setDefaultPickupDelay();
                worldIn.spawnEntityInWorld(entityitem1);
            } else {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(item));
                entityitem1.setDefaultPickupDelay();
                worldIn.spawnEntityInWorld(entityitem1);
            }
        }

    }


    /**
     * Summon ItemsStack As Drop With Loops
     * Par World,BlockPos,Itemstack,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1)
     */

    public static void summonItemStackWithLoop(World worldIn, BlockPos pos, ItemStack item, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, item);
        entityitem.setDefaultPickupDelay();
        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), item);
                worldIn.spawnEntityInWorld(entityitem1);
            } else {
                EntityItem entityitem1 = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, item);
                worldIn.spawnEntityInWorld(entityitem1);
            }
        }

    }


    /**
     * lets make a troll chat XD
     */
    public static void trollChat(EntityPlayer player) {


        player.addChatMessage(new TextComponentString(ChatFormatting.BLUE + "It Was A Troll... Or Maybe...."));


    }


    public static void toVoid(World worldIn, BlockPos pos) {


        int h = pos.getY();
        for (int i = 0; i <= h; i++) {
            BlockPos AIR = new BlockPos(pos.getX(), pos.getY() - i, pos.getZ());
            worldIn.setBlockState(AIR, Blocks.AIR.getDefaultState(), 2);
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


        worldIn.setBlockState(pos, Blocks.LAVA.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICK.getDefaultState(), 2);

        int r = rand.nextInt(5) + 1;
        for (int i = 0; i < r; i++) {
            worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);

        }

        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ()), Blocks.GLOWSTONE.getDefaultState(), 2);
        //setting bricks and NETHERRACKs
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHERRACK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHERRACK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHERRACK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHERRACK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 2, pos.getZ()), ModBlocks.luckyPressurePlate.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.FIRE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.FIRE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.FIRE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.FIRE.getDefaultState(), 2);

        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ()), Blocks.NETHER_BRICK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ()), Blocks.NETHER_BRICK.getDefaultState(), 2);


    }


    public static void endWellStruct(World worldIn, BlockPos pos, Random rand) {


        worldIn.setBlockState(pos, Blocks.WATER.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() - 1), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 1), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 1), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() + 1), Blocks.END_STONE.getDefaultState(), 2);

        int r = rand.nextInt(6) + 1;
        for (int i = 0; i < r; i++) {
            worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.BIRCH_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.BIRCH_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.BIRCH_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.BIRCH_FENCE.getDefaultState(), 2);

        }

        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ()), Blocks.BEACON.getDefaultState(), 2);
        //setting bricks and NETHERRACKs
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.END_PORTAL_FRAME.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 2, pos.getZ()), ModBlocks.luckyPressurePlate.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.END_PORTAL_FRAME.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.END_PORTAL_FRAME.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.END_PORTAL_FRAME.getDefaultState(), 2);

        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() - 1), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() + 1), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ()), Blocks.END_STONE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ()), Blocks.END_STONE.getDefaultState(), 2);


    }


    public static void addEnchantsMany(ItemStack stack, Enchantment[] e, int amp, World worldIn, BlockPos pos) {

        for (Enchantment anE : e) {
            stack.addEnchantment(anE, amp);
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
                stack[i].addEnchantment(ench[n], rand.nextInt(ampUpperLimit) + 1);


            }
            summonItemStackWithLoop(worldIn, pos, stack[i], 1, 0, 0);

        }


    }


    public static void holeDeathTrap(World worldIn, BlockPos pos) {


        int h = pos.getY();
        for (int i = 0; i < h; i++) {
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - i, pos.getZ()), Blocks.AIR.getDefaultState(), 2);
        }


    }


    public static void mountain(World worldIn, BlockPos pos, Random rand) {
        int r = rand.nextInt(6) + 1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + i, pos.getZ() + j), Blocks.DIAMOND_BLOCK.getDefaultState(), 2);


            }

        }

    }

    public static void mountainOne(World worldIn, BlockPos pos, Random rand) {
        int r = rand.nextInt(6) + 1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + i, pos.getZ() + j), Blocks.EMERALD_BLOCK.getDefaultState(), 2);


            }

        }

    }


    public static void foodKit(World worldIn, BlockPos pos) {

        summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE, 1, 1), 10, 1, 30);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BREAD), 16, 1, 10);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 5, 0, 0);
        summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.COOKED_BEEF), 34, 0, 0);

    }


    public static void chat(String chat, EntityPlayer player) {


        player.addChatMessage(new TextComponentString(chat));


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
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY(), pos.getZ() + i), Blocks.IRON_BLOCK.getDefaultState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + 1, pos.getZ() + i), Blocks.DIAMOND_BLOCK.getDefaultState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + 2, pos.getZ() + i), Blocks.EMERALD_BLOCK.getDefaultState(), 2);
            }
        }


    }


    public static void burgerStructOne(World worldIn, BlockPos pos) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY(), pos.getZ() + i), Blocks.GLOWSTONE.getDefaultState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + 1, pos.getZ() + i), Blocks.DRAGON_EGG.getDefaultState(), 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                worldIn.setBlockState(new BlockPos(pos.getX() + j, pos.getY() + 2, pos.getZ() + i), Blocks.BEACON.getDefaultState(), 2);
            }
        }


    }


    public static void orcArmy(World worldIn, BlockPos pos, int loop, Random rand) {


        for (int i = 0; i <= loop - 1; i++) {

            EntityZombie e = new EntityZombie(worldIn);
            e.setPosition(pos.getX(), pos.getY(), pos.getZ());
            e.setAlwaysRenderNameTag(true);
            e.setCustomNameTag("Orc Army");

            e.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(ModItems.ytHelmet));

            switch (rand.nextInt(5)) {
                case 1: {
                    e.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.DIAMOND_SWORD));
                    break;
                }
                case 2: {
                    e.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
                    break;
                }
                case 3: {
                    e.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.STONE_AXE));
                    break;
                }
                case 0: {
                    e.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
                    break;
                }

                case 4: {
                    e.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(ModItems.devilSword));

                }

            }


            worldIn.spawnEntityInWorld(e);
        }


    }


    public static void lookUp(World w, EntityPlayer p) {


        double x = p.posX;
        double y = p.posY;
        double z = p.posZ;

        setOneBlock(w, new BlockPos(x, y + 10, z), Blocks.ANVIL);


    }

    //e.setRabbitType(99);

    public static void tntFix(World worldIn, BlockPos pos, int amOfTNT, EntityPlayer player) {

        for (int i = 0; i < amOfTNT; i++) {
            EntityTNTPrimed entityTNTprimed = new EntityTNTPrimed(worldIn, (double) ((float) pos.getX() + 0.5F), (double) pos.getY(), (double) ((float) pos.getZ() + 0.5F), player);
            entityTNTprimed.setFuse(worldIn.rand.nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.spawnEntityInWorld(entityTNTprimed);

        }

    }

    public static void tntNearby(World worldIn, BlockPos pos, int amOfTNT, EntityPlayer player, Random rand) {
        for (int i = 0; i < amOfTNT; i++) {
            EntityTNTPrimed entityTNTprimed = new EntityTNTPrimed(worldIn, (double) ((float) pos.getX() + 0.5F) + rand.nextInt(20), (double) pos.getY() + rand.nextInt(20), (double) ((float) pos.getZ() + 0.5F) + rand.nextInt(20), player);
            entityTNTprimed.setFuse(worldIn.rand.nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.spawnEntityInWorld(entityTNTprimed);

        }

    }

    public static void tntRain(World worldIn, BlockPos pos, int amOfTNT, int skip, EntityPlayer player) {

        for (int i = 0; i < amOfTNT; i++) {
            EntityTNTPrimed entityTNTprimed = new EntityTNTPrimed(worldIn, (double) ((float) pos.getX() + 0.5F), (double) pos.getY() + (skip * i), (double) ((float) pos.getZ() + 0.5F), player);
            entityTNTprimed.setFuse(worldIn.rand.nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.spawnEntityInWorld(entityTNTprimed);

        }

    }

    public static void potionKit(World worldIn, BlockPos pos, Random rand) {


        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENDER_PEARL), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENDER_EYE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MAGMA_CREAM), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BREWING_STAND), 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.FERMENTED_SPIDER_EYE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.SPECKLED_MELON), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLD_NUGGET), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.SPIDER_EYE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.NETHER_WART), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GLASS_BOTTLE), rand.nextInt(50) + 1, 0, 0);
        ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BLAZE_ROD), rand.nextInt(50) + 1, 0, 0);


    }


    public static void musicKit(World worldIn, BlockPos pos) {
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_11));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_13));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_BLOCKS));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_CAT));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_CHIRP));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_FAR));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_MALL));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_MELLOHI));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_STAL));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_STRAD));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_WAIT));
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.RECORD_WARD));


    }

    public static void towerStruct(World worldIn, BlockPos pos) {

        int flags = 2;
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), Blocks.REDSTONE_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), Blocks.LAPIS_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()), Blocks.COAL_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ()), Blocks.GOLD_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 4, pos.getZ()), Blocks.IRON_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 5, pos.getZ()), Blocks.EMERALD_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 6, pos.getZ()), Blocks.DIAMOND_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 7, pos.getZ()), Blocks.OBSIDIAN.getDefaultState(), flags);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + 8, pos.getZ()), Blocks.DRAGON_EGG.getDefaultState(), flags);


    }


    public static void randomSixtyFourTower(World worldIn, BlockPos pos, Random rand) {

        for (int i = 0; i < 64; i++) {
            int r = rand.nextInt(8);
            if (r == 0) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.IRON_BLOCK.getDefaultState(), 2);
            } else if (r == 1) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.DIAMOND_BLOCK.getDefaultState(), 2);
            } else if (r == 2) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.GOLD_BLOCK.getDefaultState(), 2);
            } else if (r == 3) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.EMERALD_BLOCK.getDefaultState(), 2);
            } else if (r == 4) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.BEACON.getDefaultState(), 2);
            } else if (r == 5) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.COAL_BLOCK.getDefaultState(), 2);
            } else if (r == 6) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.REDSTONE_BLOCK.getDefaultState(), 2);
            } else if (r == 7) {
                worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), Blocks.DRAGON_EGG.getDefaultState(), 2);
            }


        }
    }

    public static void trollDiamondTrapWithChanceOfNotTroll(World worldIn, BlockPos pos, boolean isTrap) {


        if (isTrap) {
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 2, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 3, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 4, pos.getZ()), Blocks.FLOWING_LAVA.getDefaultState(), 2);

        } else {
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 2, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 3, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 4, pos.getZ()), Blocks.FLOWING_WATER.getDefaultState(), 2);

        }


    }


    public static void summonCowNearby(World worldIn, BlockPos pos, int loop, Random rand) {


        for (int i = 0; i <= loop - 1; i++) {

            EntityCow e = new EntityCow(worldIn);
            e.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            e.setAlwaysRenderNameTag(true);
            e.setDropChance(EntityEquipmentSlot.MAINHAND, 70F);
            e.setDropChance(EntityEquipmentSlot.HEAD,100F);
            e.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_APPLE));
            e.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(Items.GOLD_INGOT));
            e.setCustomNameTag("I AM SPECIAL");
            worldIn.spawnEntityInWorld(e);
        }


    }


    public static void luckyBlockTower(World worldIn, BlockPos pos) {

        for (int i = 0; i < b.length; i++) {
            setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), b[i]);
        }


    }

    public static void effectPlayer(EntityPlayer player, PotionEffect effect) {
        player.addPotionEffect(effect);
    }

    public static void setHoleWithMites(World worldIn, EntityPlayer player) {

        double x = player.posX - 1;
        double y = player.posY;
        double z = player.posZ - 1;


        worldIn.setBlockState(new BlockPos(x, y - 1, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x, y - 2, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 1, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 2, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x, y - 1, z + 1), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x, y - 2, z + 1), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 1, z + 1), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 2, z + 1), Blocks.AIR.getDefaultState());


        ExtraFunctions.summonMobsOnBreakBlock(new EntityEndermite(worldIn), 50, worldIn, new BlockPos(x, y, z));


    }


    public static void sandRain(World worldIn, EntityPlayer player) {
        worldIn.setBlockState(new BlockPos(player.posX, player.posY + 2, player.posZ), Blocks.SAND.getDefaultState(), 2);
    }


    public static void flyingIsle(World worldIn, BlockPos pos) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                worldIn.setBlockState(new BlockPos(pos.getX() + i, pos.getY() + 40, pos.getZ() + j), Blocks.DIAMOND_BLOCK.getDefaultState(), 2);
        }

    }


    public static void anvilRain(World worldIn, BlockPos pos) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                worldIn.setBlockState(new BlockPos(pos.getX() + i, pos.getY() + 40, pos.getZ() + j), Blocks.ANVIL.getDefaultState(), 2);
        }

    }


    public static void slimeFort(World worldIn, EntityPlayer player) {
        worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX - 1, player.posY - 1, player.posZ + 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.posX + 1, player.posY - 1, player.posZ - 1), Blocks.SLIME_BLOCK.getDefaultState());

        //	for(int i=0;i<4;i++)
        //		for(int j=0;j<3;j++)
        //			worldIn.setBlockState(new BlockPos(player.posX,player.posY-1,player.posZ), Blocks.SLIME_BLOCK.getDefaultState());


    }

    /*
     * summons 40 blocks in each dir.
     */
    public static void parabolaStruct(World worldIn, BlockPos pos) {
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ() + i), Blocks.PLANKS);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() + i, pos.getY() + i, pos.getZ()), Blocks.COAL_ORE);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - i, pos.getY() + i, pos.getZ()), Blocks.QUARTZ_ORE);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ() - i), Blocks.OBSIDIAN);
        }
    }//TODO ENHANCE THIS THING.


    public static void saflyTeleportPlayer(World worldIn, EntityPlayer player) {
        flyingIsle(worldIn, new BlockPos(player.posX, player.posY, player.posZ));
        tpPlayer(player);
    }


    public static void tntPlaceNearby(World worldIn, BlockPos pos, int amOfTNT, Random rand) {
        for (int i = 0; i < amOfTNT; i++) {
            worldIn.setBlockState(new BlockPos(pos.getX() + rand.nextInt(30), pos.getY() + rand.nextInt(30), pos.getZ() + rand.nextInt(30)), Blocks.TNT.getDefaultState(), 2);
        }

    }


    public static void luckyBlockBox(World worldIn, BlockPos pos, Random r) {

        for (int k = 0; k < 4; k++)
            for (int i = -1; i < 4; i++)
                for (int j = 0; j < 5; j++)
                    ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - 2 + j, pos.getY() - 1 + k, pos.getZ() + i), Blocks.RED_SANDSTONE);


        for (int k = 0; k < 2; k++)
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - 1 + j, pos.getY() + k, pos.getZ() + i), b[r.nextInt(b.length)]);


    }


    //TODO fake apple
    //TODO Invisible set
    //TODO armr--ghst
    //


    public static void deathHole(World worldIn, EntityPlayer player) {
        double x = player.posX;
        double y = player.posY;
        double z = player.posZ;

        for (int i = 1; i < (int) y; i++) {
            setOneBlock(worldIn, new BlockPos(x, y - i, z), Blocks.WEB);

        }


    }
    /*
	 * IT SAYS SOMTHING AND DOES SOMTHING
	 */

    public static void tornadoStruct(World worldIn, BlockPos pos, Random r) {
        summonItemAsDrop(pos, worldIn, new ItemStack(b[r.nextInt(b.length)]));
    }

    public static Item randomBlock() {
        Random rand = new Random();
        return Item.getItemFromBlock(b[rand.nextInt(b.length)]);
    }

    public static void fireCamp(World worldIn, EntityPlayer player) {
        setOneBlock(worldIn, new BlockPos(player.posX, player.posY - 1, player.posZ), Blocks.NETHERRACK);
        setOneBlock(worldIn, new BlockPos(player.posX, player.posY, player.posZ), Blocks.FIRE);
        double x = player.posX;
        double y = player.posY;
        double z = player.posZ;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++)
                    setOneBlock(worldIn, new BlockPos(x - 3 + j, y - 3 + i, z + k), Blocks.TNT);


            }
        }

        tntFix(worldIn, new BlockPos(x, y, z), 1, player);

    }


    public static void tpPlayerInGround(EntityPlayer player) {

        player.setPosition(player.posX, player.serverPosY = (int) player.posY - 3, player.posZ);

    }

    public static void obsidianCageStruct(World worldIn, EntityPlayer player) {
        double x = player.posX;
        double y = player.posY;
        double z = player.posZ;

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


    public static void summonMobsOnBreakBlock(EntityMob mob, int loop, World worldIn, BlockPos pos) {

        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }

    }


    public static void summonMobsOnBreakBlock(EntityFlying mob, int loop, World worldIn, BlockPos pos) {

        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }

    }

    public static void summonMobsOnBreakBlock(EntityGolem mob, int loop, World worldIn, BlockPos pos) {

        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }

    }

    public static void summonMobsOnBreakBlock(EntityAnimal mob, int loop, World worldIn, BlockPos pos) {

        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }

    }

    public static void summonMobsNearby(EntityAnimal mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }


    }

    public static void summonMobsNearby(EntityIronGolem mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }


    }


    public static void summonMobsNearby(EntityFlying mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }


    }

    public static void summonMobsNearby(EntityMob mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }


    }

    public static void summonMobsNearby(EntityWaterMob mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setAlwaysRenderNameTag(true);
            worldIn.spawnEntityInWorld(mob);
        }


    }

    public static void summonTammedWolfs(World worldIn, EntityPlayer player, int loop, BlockPos pos) {


        for (int i = 0; i <= loop - 1; i++) {

            EntityWolf w = new EntityWolf(worldIn);
            w.setPosition(pos.getX(), pos.getY(), pos.getZ());
            w.setTamed(true);
            w.setSitting(true);
            w.setOwnerId(UUID.fromString(player.getUniqueID().toString()));
            worldIn.spawnEntityInWorld(w);
        }
    }

    public static void summonLuckyMobs(World worldIn, int loop, BlockPos pos) {


        for (int i = 0; i <= loop - 1; i++) {

            EntityLuckyMob w = new EntityLuckyMob(worldIn);
            w.setPosition(pos.getX(), pos.getY(), pos.getZ());
            worldIn.spawnEntityInWorld(w);
        }
    }


}//CLASS END HERE
		
		
		


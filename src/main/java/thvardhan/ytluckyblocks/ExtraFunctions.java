package thvardhan.ytluckyblocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import net.minecraftforge.server.command.TextComponentHelper;

//import thvardhan.ytluckyblocks.entity.EntityLuckyMob;


import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;

public class ExtraFunctions {


  /*  private static Block[] b = {ModBlocks.alexircraftLuckyBlock, ModBlocks.antVenomLuckyBlock, ModBlocks.bajanCanadianLuckyBlock, ModBlocks.captainSparkelzLuckyBlock, ModBlocks.danTDMLuckyBlock, ModBlocks.exploadingTNTLuckyBlock, ModBlocks.frizzleandpopLuckyBlock, ModBlocks.gamingWithJenLuckyBlock,
            ModBlocks.iBallisticSquidLuckyBlock, ModBlocks.iHasCupcakeLuckyBlock, ModBlocks.jeromeASFLuckyBlock, ModBlocks.lachlanLuckyBlock, ModBlocks.lDShadowLadyLuckyBlock, ModBlocks.youtubeLuckyBlock, ModBlocks.vikkstar123LuckyBlock, ModBlocks.trueMuLuckyBlock, ModBlocks.thnxCyaLuckyBlock,
            ModBlocks.tewityLuckyBlock, ModBlocks.stampylongheadLuckyBlock, ModBlocks.sSundeeLuckyBlock, ModBlocks.skyDoesMinecraftLuckyBlock, ModBlocks.serialPlayerLuckyBlock, ModBlocks.prestonPlayzLuckyBlock, ModBlocks.mrwooflessLuckyBlock, ModBlocks.petaZahHuttLuckyBlock,
            ModBlocks.pinkSheepYTLuckyBlock, ModBlocks.popularMMOLuckyBlock, ModBlocks.babyDuckLuckyBlock, ModBlocks.babyLeahLuckyBlock, ModBlocks.babyMaxLuckyBlock, ModBlocks.donutTheDogLuckyBlock, ModBlocks.evilLittleKellyLuckyBlock, ModBlocks.littleAllyLuckyBlock, ModBlocks.littleCarlyMcLuckyBlock
            , ModBlocks.littleDonnyLuckyBlock, ModBlocks.littleKellyMcLuckyBlock, ModBlocks.littleLizardGamingLuckyBlock, ModBlocks.maxTheMonkeyLuckyBlock, ModBlocks.sharkyLuckyBlock, ModBlocks.tinyTurtleLuckyBlock, ModBlocks.aphmauLuckyBlock, ModBlocks.scubaSteveLuckyBlock, ModBlocks.littleRopoLuckyBlock,
            ModBlocks.mrCrainerLuckyBlock, ModBlocks.littleAngelLuckyBlock};
*/

    /**
     * Summon Blocks As Drop With Loops
     * Par World,BlockPos,Block,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1)
     */
    public static void summonBlockWithLoop(World worldIn, BlockPos pos, Block block, int loop, int style, int skip) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;

        ItemEntity entityitem = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
        entityitem.setDefaultPickupDelay();
        for (int i = 0; i <= loop - 1; i++) {

            if (style == 1) {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(block));
                worldIn.addEntity(entityitem1);
            } else {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
                worldIn.addEntity(entityitem1);
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
        ItemEntity entityitem = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(block));
        entityitem.setDefaultPickupDelay();
        worldIn.addEntity(entityitem);

    }


    /**
     * Summons A Item Like A Drop
     */

    public static void summonItemAsDrop(BlockPos pos, World worldIn, ItemStack stack) {

        float f = 0.5F;
        double d0 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (worldIn.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        ItemEntity entityitem = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, stack);
        entityitem.setDefaultPickupDelay();
        worldIn.addEntity(entityitem);

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
            setBlocksForTNT(worldIn, random, a);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() - 5, pos.getY(), pos.getZ() + 2 - i);
            setBlocksForTNT(worldIn, random, a);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() - 2 + i, pos.getY(), pos.getZ() + 5);
            setBlocksForTNT(worldIn, random, a);
        }
        for (int i = 0; i <= 4; i++) {
            BlockPos a = new BlockPos(pos.getX() + 2 - i, pos.getY(), pos.getZ() - 5);
            setBlocksForTNT(worldIn, random, a);
        }


    }

    private static void setBlocksForTNT(World worldIn, Block random, BlockPos a) {
        worldIn.setBlockState(a, random.getDefaultState(), 3);
        BlockPos b = new BlockPos(a.getX(), a.getY() + 1, a.getZ());
        worldIn.setBlockState(b, Blocks.TNT.getDefaultState(), 3);
        BlockPos c = new BlockPos(b.getX(), b.getY() + 1, b.getZ());
        worldIn.setBlockState(c, Blocks.FIRE.getDefaultState(), 3);
    }


    public static void summonEnchantedItemAsDrop(World worldIn, BlockPos pos,
                                                 Item i, String name, Enchantment e, int amp) {
        ItemStack itemE = new ItemStack(i);
        itemE.addEnchantment(e, amp);
        itemE.setDisplayName(new StringTextComponent(name));
        summonItemAsDrop(pos, worldIn, itemE);
    }


    /**
     * Tp to Random Loc.
     */

    public static void tpPlayer(PlayerEntity player) {
        if (player == null || player.world.isRemote) return;

        if (player instanceof PlayerEntity) {
            ServerPlayerEntity sp = (ServerPlayerEntity) player;
            ServerWorld world = sp.getServerWorld();

            double newY = sp.getPosY() + 500;
            if (newY > world.getHeight()) {
                newY = world.getHeight() - 1;
            }

            double x = sp.getPosX();
            double z = sp.getPosZ();

            sp.teleport(world, x, newY, z, sp.rotationYaw, sp.rotationPitch);
        }
    }

    public static void setOneBlock(World worldIn, BlockPos pos, Block block) {
        if (worldIn.isRemote) return;
        BlockPos basePos = pos.east();
        worldIn.setBlockState(basePos, block.getDefaultState(), 2);
        worldIn.notifyNeighborsOfStateChange(basePos, block);
        worldIn.getPendingBlockTicks().scheduleTick(basePos, block, 1);
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
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX(), (double) pos.getY() + i + skip, (double) pos.getZ(), new ItemStack(item));
                entityitem1.setDefaultPickupDelay();
                worldIn.addEntity(entityitem1);
            } else {
                ItemEntity entityitem1 = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(item));
                entityitem1.setDefaultPickupDelay();
                worldIn.addEntity(entityitem1);
            }
        }
    }

    /**
     * Summon ItemsStack As Drop With Loops
     * Par World,BlockPos,Itemstack,loop(how many items you want to summon),style(1=down-top, anything else simple.),skip(ONLY USE FOR STYLE=1. Lowers the start height)
     */

    public static void summonItemStackWithLoop(World worldIn, BlockPos pos, ItemStack item, int loop, int style, int skip) {
        float f = 0.5F;
        double d0 = (double)(worldIn.rand.nextFloat() * f) + (1.0D - f) * 0.5D;
        double d1 = (double)(worldIn.rand.nextFloat() * f) + (1.0D - f) * 0.5D;
        double d2 = (double)(worldIn.rand.nextFloat() * f) + (1.0D - f) * 0.5D;

        for (int i = 0; i < loop; i++) {
            ItemStack stackCopy = item.copy(); // ✅ make a new copy each time
            ItemEntity entityItem;

            if (style == 1) {
                entityItem = new ItemEntity(worldIn, pos.getX(), pos.getY() + i + skip, pos.getZ(), stackCopy);
            } else {
                entityItem = new ItemEntity(worldIn, pos.getX() + d0, pos.getY() + d1, pos.getZ() + d2, stackCopy);
            }

            entityItem.setDefaultPickupDelay();
            worldIn.addEntity(entityItem);
        }
    }


    /**
     * lets make a troll chat XD
     */
    public static void trollChat(PlayerEntity player) {
        if (!player.world.isRemote) { // <-- Only execute on server side
            TextComponent message = TextComponentHelper.createComponentTranslation(player, "message.troll", player.getDisplayName());
            message.mergeStyle(TextFormatting.BLUE);
            player.sendMessage(message, player.getUniqueID());
        }
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

        if (worldIn.isRemote) {
            return;
        }
        worldIn.setBlockState(pos, Blocks.LAVA.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() + 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);

        int r = rand.nextInt(5) + 1;
        for (int i = 0; i < r; i++) {
            worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + 1 + i, pos.getZ() - 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);
            worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + 1 + i, pos.getZ() + 1), Blocks.NETHER_BRICK_FENCE.getDefaultState(), 2);
        }

        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ()), Blocks.GLOWSTONE.getDefaultState(), 2);
        //setting bricks and netherracks
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHERRACK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHERRACK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHERRACK.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHERRACK.getDefaultState(), 2);
        //worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 2, pos.getZ()), ModBlocks.luckyPressurePlate.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.FIRE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.FIRE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.FIRE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() - 1), Blocks.FIRE.getDefaultState(), 2);

        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() - 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 1, pos.getZ() + 1), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ()), Blocks.NETHER_BRICKS.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ()), Blocks.NETHER_BRICKS.getDefaultState(), 2);
    }

    public static void endWellStruct(World worldIn, BlockPos pos, Random rand) {
        if (worldIn.isRemote) {
            return;
        }
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

        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + r + 1, pos.getZ() + 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 1, pos.getZ() - 1), Blocks.OBSIDIAN.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + r + 2, pos.getZ() + 1), Blocks.END_PORTAL_FRAME.getDefaultState(), 2);
        // worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() + r + 2, pos.getZ()), RegistrationHandler.luckyPressurePlate.getDefaultState(), 2);
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
        if (stack.length == 0 || ench.length == 0) return;

        int r = rand.nextInt(stack.length);
        int a = rand.nextInt(stack.length);

        // Ensure the loop has a valid range
        if (a > r) {
            int temp = a;
            a = r;
            r = temp;
        } else if (a == r) {
            // If they're equal, sometimes spawn 1 item, sometimes none
            if (rand.nextBoolean()) {
                // keep it as a single-item spawn
            } else if (a > 0) {
                a -= 1;
            } else if (r < stack.length - 1) {
                r += 1;
            }
        }

        // Randomly decide if we’ll skip spawning anything at all (just like 1.8.9 sometimes did)
        if (rand.nextInt(10) == 0) {
            // ~10% chance to skip entirely
            return;
        }

        // Loop through the chosen item range — includes 'r' now, so last item (e.g., shovel) can spawn
        for (int i = Math.max(0, a); i <= r && i < stack.length; i++) {

            int y = rand.nextInt(ench.length);
            int z = rand.nextInt(ench.length);

            if (z > y) {
                int temp = y;
                y = z;
                z = temp;
            } else if (y == z && z > 0) {
                z -= 1;
            }

            for (int j = z; j < y && j < ench.length; j++) {
                if (rand.nextInt(3) != 0) { // about 66% chance to apply each potential enchant
                    int n = rand.nextInt(ench.length);
                    stack[i].addEnchantment(ench[n], rand.nextInt(ampUpperLimit) + 1);
                }
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
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1), 10, 1, 30);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BREAD), 16, 1, 10);
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 5, 0, 0);
        summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE));
        summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.COOKED_BEEF), 34, 0, 0);

    }

    public static void chat(String chat, PlayerEntity player) {

        if (!player.world.isRemote) { // Only send from server side
            player.sendMessage(new StringTextComponent(chat), player.getUniqueID());

        }
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
        // Move the structure one block to the east so we don't overwrite the trigger block
        BlockPos basePos = pos.east();

        // Bottom layer - Iron blocks
        for (int x = 0; x < 3; x++) {
            for (int z = 0; z < 3; z++) {
                worldIn.setBlockState(basePos.add(x, 0, z), Blocks.IRON_BLOCK.getDefaultState(), 2);
            }
        }

        // Middle layer - Diamond blocks
        for (int x = 0; x < 3; x++) {
            for (int z = 0; z < 3; z++) {
                worldIn.setBlockState(basePos.add(x, 1, z), Blocks.DIAMOND_BLOCK.getDefaultState(), 2);
            }
        }

        // Top layer - Emerald blocks
        for (int x = 0; x < 3; x++) {
            for (int z = 0; z < 3; z++) {
                worldIn.setBlockState(basePos.add(x, 2, z), Blocks.EMERALD_BLOCK.getDefaultState(), 2);
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

            ZombieEntity e = new ZombieEntity(worldIn);
            e.setPosition(pos.getX(), pos.getY(), pos.getZ());
            e.setCustomNameVisible(true);
            e.setCustomName(new StringTextComponent("Orc Army"));

            e.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(RegistrationHandler.YT_HELM.get()));

            switch (rand.nextInt(5)) {
                case 1: {
                    e.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.DIAMOND_SWORD));
                    break;
                }
                case 2: {
                    e.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
                    break;
                }
                case 3: {
                    e.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.STONE_AXE));
                    break;
                }
                case 0: {
                    e.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
                    break;
                }

                case 4: {
                    e.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(RegistrationHandler.DEVIL_SWORD.get()));

                }
            }
            double offsetX = (worldIn.rand.nextDouble() - 0.5) * 3.0;
            double offsetZ = (worldIn.rand.nextDouble() - 0.5) * 3.0;

            e.setPosition(pos.getX() + 0.5 + offsetX, pos.getY(), pos.getZ() + 0.5 + offsetZ);
            worldIn.addEntity(e);
        }
    }

    public static void lookUp(World w, PlayerEntity p) {

        double x = p.getPosX();
        double y = p.getPosY();
        double z = p.getPosZ();

        setOneBlock(w, new BlockPos(x, y + 10, z), Blocks.ANVIL);

    }

    //e.setRabbitType(99);

    public static void tntFix(World worldIn, BlockPos pos, int amOfTNT, PlayerEntity player) {

        for (int i = 0; i < amOfTNT; i++) {
            TNTEntity entityTNTprimed = new TNTEntity(worldIn, (double) ((float) pos.getX() + 0.5F), (double) pos.getY(), (double) ((float) pos.getZ() + 0.5F), player);
            entityTNTprimed.setFuse(worldIn.rand.nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.addEntity(entityTNTprimed);

        }
    }

    public static void tntNearby(World worldIn, BlockPos pos, int amOfTNT, PlayerEntity player, Random rand) {
        for (int i = 0; i < amOfTNT; i++) {
            TNTEntity entityTNTprimed = new TNTEntity(worldIn, (double) ((float) pos.getX() + 0.5F) + rand.nextInt(20), (double) pos.getY() + rand.nextInt(20), (double) ((float) pos.getZ() + 0.5F) + rand.nextInt(20), player);
            entityTNTprimed.setFuse(worldIn.rand.nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.addEntity(entityTNTprimed);

        }
    }

    public static void tntRain(World worldIn, BlockPos pos, int amOfTNT, int skip, PlayerEntity player) {

        for (int i = 0; i < amOfTNT; i++) {
            TNTEntity entityTNTprimed = new TNTEntity(worldIn, (double) ((float) pos.getX() + 0.5F), (double) pos.getY() + (skip * i), (double) ((float) pos.getZ() + 0.5F), player);
            entityTNTprimed.setFuse(worldIn.rand.nextInt(entityTNTprimed.getFuse() / 4) + entityTNTprimed.getFuse() / 8);
            worldIn.addEntity(entityTNTprimed);

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
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.JUKEBOX));
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
        ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MUSIC_DISC_PIGSTEP));

    }

    public static void towerStruct(World worldIn, BlockPos pos) {
        int flags = 2;

        // Shift the entire tower 1 block east (positive X)
        BlockPos base = pos.add(1, 0, 0);

        worldIn.setBlockState(base, Blocks.REDSTONE_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(base.up(1), Blocks.LAPIS_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(base.up(2), Blocks.COAL_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(base.up(3), Blocks.GOLD_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(base.up(4), Blocks.IRON_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(base.up(5), Blocks.EMERALD_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(base.up(6), Blocks.DIAMOND_BLOCK.getDefaultState(), flags);
        worldIn.setBlockState(base.up(7), Blocks.OBSIDIAN.getDefaultState(), flags);
        worldIn.setBlockState(base.up(8), Blocks.DRAGON_EGG.getDefaultState(), flags);
    }

    public static void randomSixtyFourTower(World worldIn, BlockPos pos, Random rand) {
        // Offset tower to the east of the broken block
        BlockPos towerBase = pos.east();

        for (int i = 0; i < 64; i++) {
            BlockPos blockPos = towerBase.up(i);
            int r = rand.nextInt(8);

            switch (r) {
                case 0:
                    worldIn.setBlockState(blockPos, Blocks.IRON_BLOCK.getDefaultState(), 2);
                    break;
                case 1:
                    worldIn.setBlockState(blockPos, Blocks.DIAMOND_BLOCK.getDefaultState(), 2);
                    break;
                case 2:
                    worldIn.setBlockState(blockPos, Blocks.GOLD_BLOCK.getDefaultState(), 2);
                    break;
                case 3:
                    worldIn.setBlockState(blockPos, Blocks.EMERALD_BLOCK.getDefaultState(), 2);
                    break;
                case 4:
                    worldIn.setBlockState(blockPos, Blocks.BEACON.getDefaultState(), 2);
                    break;
                case 5:
                    worldIn.setBlockState(blockPos, Blocks.COAL_BLOCK.getDefaultState(), 2);
                    break;
                case 6:
                    worldIn.setBlockState(blockPos, Blocks.REDSTONE_BLOCK.getDefaultState(), 2);
                    break;
                case 7:
                    worldIn.setBlockState(blockPos, Blocks.DRAGON_EGG.getDefaultState(), 2);
                    break;
            }
        }
    }

    public static void trollDiamondTrapWithChanceOfNotTroll(World worldIn, BlockPos pos, boolean isTrap) {
        if (isTrap) {
            setBlocksForTrollTrap(worldIn, pos);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 4, pos.getZ()), Blocks.LAVA.getDefaultState(), 2);

        } else {
            setBlocksForTrollTrap(worldIn, pos);
            worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 4, pos.getZ()), Blocks.WATER.getDefaultState(), 2);
        }
    }

    private static void setBlocksForTrollTrap(World worldIn, BlockPos pos) {
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 2, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
        worldIn.setBlockState(new BlockPos(pos.getX(), pos.getY() - 3, pos.getZ()), Blocks.DIAMOND_ORE.getDefaultState(), 2);
    }

    public static void summonCowNearby(World worldIn, BlockPos pos, int loop, Random rand) {

        for (int i = 0; i <= loop - 1; i++) {

            CowEntity e = new CowEntity(EntityType.COW,worldIn);
            e.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            e.setCustomNameVisible(true);
            e.setDropChance(EquipmentSlotType.MAINHAND, 100F);
            e.setDropChance(EquipmentSlotType.HEAD,100F);
            e.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.GOLDEN_APPLE));
            e.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(Items.GOLD_INGOT));
            e.setCustomName(new StringTextComponent("I AM SPECIAL"));
            worldIn.addEntity(e);
        }
    }

   /* public static void luckyBlockTower(World worldIn, BlockPos pos) {

        for (int i = 0; i < b.length; i++) {
            setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ()), b[i]);
        }


    }*/

    public static void effectPlayer(PlayerEntity player, EffectInstance effect) {
        player.addPotionEffect(effect);
    }

    public static void setHoleWithMites(World worldIn, PlayerEntity player) {

        double x = player.getPosX() - 1;
        double y = player.getPosY();
        double z = player.getPosZ() - 1;

        worldIn.setBlockState(new BlockPos(x, y - 1, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x, y - 2, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 1, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 2, z), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x, y - 1, z + 1), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x, y - 2, z + 1), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 1, z + 1), Blocks.AIR.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 1, y - 2, z + 1), Blocks.AIR.getDefaultState());

        ExtraFunctions.summonMobsOnBreakBlock(EntityType.ENDERMITE, 50, worldIn, new BlockPos(x, y, z), null);

    }


    public static void sandRain(World worldIn, PlayerEntity player) {
        worldIn.setBlockState(new BlockPos(player.getPosX(), player.getPosY() + 2, player.getPosZ()), Blocks.SAND.getDefaultState(), 2);
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

    public static void slimeFort(World worldIn, PlayerEntity player) {
        worldIn.setBlockState(new BlockPos(player.getPosX(), player.getPosY() - 1, player.getPosZ()), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX() + 1, player.getPosY() - 1, player.getPosZ()), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX() - 1, player.getPosY() - 1, player.getPosZ()), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX(), player.getPosY() - 1, player.getPosZ() + 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX(), player.getPosY() - 1, player.getPosZ() - 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX() + 1, player.getPosY() - 1, player.getPosZ() + 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX() - 1, player.getPosY() - 1, player.getPosZ() - 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX() - 1, player.getPosY() - 1, player.getPosZ() + 1), Blocks.SLIME_BLOCK.getDefaultState());
        worldIn.setBlockState(new BlockPos(player.getPosX() + 1, player.getPosY() - 1, player.getPosZ() - 1), Blocks.SLIME_BLOCK.getDefaultState());

        //	for(int i=0;i<4;i++)
        //		for(int j=0;j<3;j++)
        //			worldIn.setBlockState(new BlockPos(player.posX,player.posY-1,player.posZ), Blocks.SLIME_BLOCK.getDefaultState());
    }

    /*
     * summons 40 blocks in each dir.
     */
    public static void parabolaStruct(World worldIn, BlockPos pos) {
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ() + i), Blocks.ACACIA_PLANKS);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() + i, pos.getY() + i, pos.getZ()), Blocks.COAL_ORE);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - i, pos.getY() + i, pos.getZ()), Blocks.QUARTZ_BLOCK);
        }
        for (int i = 0; i < 80; i++) {
            ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + i, pos.getZ() - i), Blocks.OBSIDIAN);
        }
    }//TODO ENHANCE THIS THING.


    public static void saflyTeleportPlayer(World worldIn, ServerPlayerEntity player) {
        flyingIsle(worldIn, new BlockPos(player.getPosX(), player.getPosY(), player.getPosZ()));
        tpPlayer(player);
    }


    public static void tntPlaceNearby(World worldIn, BlockPos pos, int amOfTNT, Random rand) {
        for (int i = 0; i < amOfTNT; i++) {
            worldIn.setBlockState(new BlockPos(pos.getX() + rand.nextInt(30), pos.getY() + rand.nextInt(30), pos.getZ() + rand.nextInt(30)), Blocks.TNT.getDefaultState(), 2);
        }

    }


    /*public static void luckyBlockBox(World worldIn, BlockPos pos, Random r) {

        for (int k = 0; k < 4; k++)
            for (int i = -1; i < 4; i++)
                for (int j = 0; j < 5; j++)
                    ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - 2 + j, pos.getY() - 1 + k, pos.getZ() + i), Blocks.RED_SANDSTONE);


        for (int k = 0; k < 2; k++)
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX() - 1 + j, pos.getY() + k, pos.getZ() + i), b[r.nextInt(b.length)]);


    }*/


    //TODO fake apple
    //TODO Invisible set
    //TODO armr--ghst
    //


    public static void deathHole(World worldIn, PlayerEntity player) {
        double x = player.getPosX();
        double y = player.getPosY();
        double z = player.getPosZ();

        for (int i = 1; i < (int) y; i++) {
            setOneBlock(worldIn, new BlockPos(x, y - i, z), Blocks.COBWEB);

        }
    }
    /*
	 * IT SAYS SOMETHING AND DOES SOMETHING
	 */
 /*   public static void tornadoStruct(World worldIn, BlockPos pos, Random r) {
        summonItemAsDrop(pos, worldIn, new ItemStack(b[r.nextInt(b.length)]));
    }

    public static Item randomBlock() {
        Random rand = new Random();
        return Item.getItemFromBlock(b[rand.nextInt(b.length)]);
    } */

    public static void fireCamp(World worldIn, PlayerEntity player) {
        setOneBlock(worldIn, new BlockPos(player.getPosX(), player.getPosY() - 1, player.getPosZ()), Blocks.NETHERRACK);
        setOneBlock(worldIn, new BlockPos(player.getPosX(), player.getPosY(), player.getPosZ()), Blocks.FIRE);
        double x = player.getPosX();
        double y = player.getPosY();
        double z = player.getPosZ();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++)
                    setOneBlock(worldIn, new BlockPos(x - 3 + j, y - 3 + i, z + k), Blocks.TNT);


            }
        }

        tntFix(worldIn, new BlockPos(x, y, z), 1, player);

    }

    public static void tpPlayerInGround(PlayerEntity player) {
        double x = player.getPosX();
        double y = player.getPosY() - 3; // Adjust the Y-coordinate to move the player down by 3 blocks.
        double z = player.getPosZ();

        player.setPositionAndUpdate(x, y, z);
    }

    public static void obsidianCageStruct(World worldIn, PlayerEntity player) {
        double x = player.getPosX();
        double y = player.getPosY();
        double z = player.getPosZ();

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

    public static <T extends MobEntity> void summonMobsOnBreakBlock(EntityType<T> type, int loop, World worldIn, BlockPos pos, Consumer<T> customizer) {
        if (worldIn.isRemote) return;

        for (int i = 0; i < loop; i++) {
            T mob = type.create(worldIn);
            if (mob == null) continue;

            double offsetX = (worldIn.rand.nextDouble() - 0.5) * 3.0;
            double offsetZ = (worldIn.rand.nextDouble() - 0.5) * 3.0;

            mob.setPosition(pos.getX() + 0.5 + offsetX, pos.getY(), pos.getZ() + 0.5 + offsetZ);

            if (customizer != null) customizer.accept(mob);

            if (worldIn instanceof ServerWorld) ((ServerWorld) worldIn).addEntity(mob);
        }
    }



    public static void summonMobsNearby(AnimalEntity mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setCustomNameVisible(true);
            worldIn.addEntity(mob);
        }


    }

    public static void summonMobsNearby(IronGolemEntity mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setCustomNameVisible(true);
            worldIn.addEntity(mob);
        }


    }


    public static void summonMobsNearby(FlyingEntity mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setCustomNameVisible(true);
            worldIn.addEntity(mob);
        }


    }

    public static void summonMobsNearby(MobEntity mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            worldIn.addEntity(mob);
        }


    }

    public static void summonMobsNearby(WaterMobEntity mob, int loop, World worldIn, BlockPos pos, Random rand) {


        for (int i = 0; i < loop; i++) {
            try {
                mob = mob.getClass().getConstructor(World.class).newInstance(worldIn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mob.setPosition(pos.getX() + rand.nextInt(30), pos.getY(), pos.getZ() + rand.nextInt(30));
            mob.setCustomNameVisible(true);
            worldIn.addEntity(mob);
        }


    }

    public static void summonTammedWolfs(World worldIn, PlayerEntity player, int loop, BlockPos pos) {


        for (int i = 0; i <= loop - 1; i++) {

            WolfEntity w = new WolfEntity(EntityType.WOLF,worldIn);
            w.setPosition(pos.getX(), pos.getY(), pos.getZ());
            w.setTamed(true);
            w.setSitting(true);
            w.setOwnerId(UUID.fromString(player.getUniqueID().toString()));
            worldIn.addEntity(w);
        }
    }

   /* public static void summonLuckyMobs(World worldIn, int loop, BlockPos pos) {


        for (int i = 0; i <= loop - 1; i++) {

            EntityLuckyMob w = new EntityLuckyMob(worldIn);
            w.setPosition(pos.getX(), pos.getY(), pos.getZ());
            worldIn.addEntity(w);
        }
    }*/


}//CLASS END HERE
		
		
		


package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
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
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public LittleKellyMcLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public LittleKellyMcLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
@OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i < 3; ++i) {
            int j = rand.nextInt(2) * 2 - 1;
            int k = rand.nextInt(2) * 2 - 1;
            double d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
            double d1 = (double) ((float) pos.getY() + rand.nextFloat());
            double d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) k;
            double d3 = (double) (rand.nextFloat() * (float) j);
            double d4 = ((double) rand.nextFloat() - 0.5D) * 0.125D;
            double d5 = (double) (rand.nextFloat() * (float) k);
            worldIn.addParticle(ParticleTypes.CRIT, d0, d1, d2, d3, d4, d5);
        }
    }

    @Override
    public void playerWillDestroy(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, net.minecraft.entity.player.PlayerEntity player) {
        super.playerWillDestroy(world, pos, state, player);
        LuckyBlock.creativeLuckyBreak(world, pos, player, () -> drops(world, pos, player));
    }




        @Override
    public void playerDestroy(net.minecraft.world.World world, net.minecraft.entity.player.PlayerEntity player, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, @javax.annotation.Nullable net.minecraft.tileentity.TileEntity blockEntity, net.minecraft.item.ItemStack tool) {
        if (!world.isClientSide() && player != null && !(player instanceof FakePlayer) && !player.abilities.instabuild) {
            world.removeBlock(pos, false);
            drops(world, pos, player);
        }
    }

    private void drops(World worldIn, BlockPos pos, PlayerEntity player) {

        Enchantment[] e = new Enchantment[5];
        e[0] = ExtraFunctions.enchantmentByLegacyNumericId(50);
        e[1] = ExtraFunctions.enchantmentByLegacyNumericId(19);
        e[2] = ExtraFunctions.enchantmentByLegacyNumericId(48);
        e[3] = ExtraFunctions.enchantmentByLegacyNumericId(7);
        e[4] = ExtraFunctions.enchantmentByLegacyNumericId(21);


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
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), rand.nextInt(50) + 1, worldIn, pos);
                break;
            }
            case 3: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 4: {
                Enchantment[] e1 = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(18), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(17)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SHOVEL), e1, 9, worldIn, pos);
                ExtraFunctions.chat("Someone Just Got " + TextFormatting.DARK_AQUA + "GOD" + TextFormatting.WHITE + " Shovel", player);
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
                ExtraFunctions.summonMobsNearby(EntityType.ZOMBIE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 13: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 14: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 2, worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 16: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(50), worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 18: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 25, worldIn, pos);
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
                ExtraFunctions.summonMobsOnBreakBlock(EntityLittleKellyMC.TYPE.create(worldIn), 40, worldIn, pos);
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
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.LAVA);
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
                ExtraFunctions.summonMobsOnBreakBlock(EntityDanTDM.TYPE.create(worldIn), rand.nextInt(20) + 1, worldIn, pos);
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
                ExtraFunctions.summonMobsNearby(EntityLittleKellyMC.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.END_PORTAL);
                break;
            }
            case 40: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.NETHER_BRICKS);
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
                Enchantment[] ench = {ExtraFunctions.enchantmentByLegacyNumericId(35), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(49), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(50)
                        , ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(51), ExtraFunctions.enchantmentByLegacyNumericId(21)};


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
                Enchantment[] ench = {ExtraFunctions.enchantmentByLegacyNumericId(35), ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(49), ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(50)
                        , ExtraFunctions.enchantmentByLegacyNumericId(34), ExtraFunctions.enchantmentByLegacyNumericId(51), ExtraFunctions.enchantmentByLegacyNumericId(21)};


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

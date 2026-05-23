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
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class CaptainSparkelzLuckyBlock extends Block {
    public CaptainSparkelzLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public CaptainSparkelzLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public CaptainSparkelzLuckyBlock(String unlocalizedName) {
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
            worldIn.addParticle(ParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
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
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 2, 0, 0);
                break;
            }
            case 3: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.mic), 1, 0, 0);
                break;
            }
            case 4: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 6: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 8: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.SKELETON.create(worldIn), 25, worldIn, pos);
                break;
            }
            case 10: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), rand.nextInt(50) + 1, worldIn, pos);
                break;
            }
            case 11: {
                ExtraFunctions.orcArmy(worldIn, pos, 0, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityDanTDM.TYPE.create(worldIn), rand.nextInt(0) + 1, worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ANVIL);
                ExtraFunctions.chat(TextFormatting.DARK_BLUE + "You Should Be Happy It Dint Fell On Ya", player);
                break;
            }
            case 14: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityDanTDM.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.DIAMOND, 12, 0, 0);
                break;
            }
            case 18: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
                break;
            }
            case 19: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.swordLogdotzip, TextFormatting.RED + "LogDotZip's Best Sword", ExtraFunctions.enchantmentByLegacyNumericId(20), 7);
                break;
            }
            case 20: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 22: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
                ExtraFunctions.chat(TextFormatting.GREEN + "Try To Use This :D", player);
                break;
            }
            case 23: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 5, worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLogDotZip.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityPopularMMO.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE), 64, 0, 0);
                break;
            }
            case 29: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.BLAZE.create(worldIn), rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 32: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), rand.nextInt(40) + 1, worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.mic, "mic", ExtraFunctions.enchantmentByLegacyNumericId(20), 8);
                break;
            }
            case 36: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(6), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(5), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(3)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), e, 8, worldIn, pos);
                break;
            }
            case 37: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(6), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(5), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(3)};

                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_LEGGINGS), e, 5, worldIn, pos);

                break;
            }
            case 38: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(6), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(5), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(3)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_CHESTPLATE), e, 4, worldIn, pos);

                break;
            }
            case 39: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(6), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(5), ExtraFunctions.enchantmentByLegacyNumericId(4), ExtraFunctions.enchantmentByLegacyNumericId(3)};

                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_HELMET), e, 6, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityAntVenom.TYPE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 41: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), rand.nextInt(0) + 1, worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLDEN_APPLE), 44, 1, 50);
                break;
            }
            case 43: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 44: {
                ExtraFunctions.tntFix(worldIn, pos, 12, player);
                break;
            }
            case 45: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.BEACON);
                break;
            }
            case 46: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 47: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CLAY);
                break;
            }
            case 48: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 49: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
                break;
            }
            case 50: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capChestplate));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capBoots));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.capLeggings));
                break;
            }

        }

    }//method end
}

package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityAlexirCraft;
import thvardhan.ytluckyblocks.entity.EntityLittleLizardGaming;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntitySuperGirlyGamer;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LittleLizardGamingLuckyBlock extends Block {
    public LittleLizardGamingLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public LittleLizardGamingLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public LittleLizardGamingLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littlelizardBoots));
                break;
            }
            case 1: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littlelizardChestplate));
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littlelizardHelmet));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.littlelizardLeggings));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 6: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLittleLizardGaming.TYPE.create(worldIn), 34, worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.fireCamp(worldIn, player);
                break;
            }
            case 8: {
                ExtraFunctions.tornadoStruct(worldIn, pos, rand);
                break;
            }
            case 9: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 10: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 11: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsNearby(EntityType.ELDER_GUARDIAN.create(worldIn), 15, worldIn, pos, rand);
                ExtraFunctions.summonMobsNearby(EntityType.ELDER_GUARDIAN.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 15: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 17: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 18: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 19: {
                Enchantment[] e1 = {ExtraFunctions.enchantmentByLegacyNumericId(20), ExtraFunctions.enchantmentByLegacyNumericId(19)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WHITE_BED), e1, 10, worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.tntFix(worldIn, pos, 200, player);
                break;
            }
            case 22: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 23: {
                ExtraFunctions.chat(TextFormatting.DARK_RED + "BEEP BEEP NUKE =WARNING=", player);
                ExtraFunctions.tntNearby(worldIn, pos, 200, player, rand);
                break;
            }
            case 24: {
                ExtraFunctions.orcArmy(worldIn, pos, 5, rand);
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySuperGirlyGamer.TYPE.create(worldIn), 30, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.summonMobsNearby(EntityLittleLizardGaming.TYPE.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLogDotZip.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 31: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 32: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 34: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 35: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.BAKED_POTATO, 50, 1, 10);
                ExtraFunctions.chat("ItS PoTaT RaIn!", player);
                break;
            }
            case 36: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.IRON_AXE), 5, 1, 50);
                break;
            }
            case 37: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 38: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordLogdotzip), e, 8, worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 41: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 44: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.captainSparkelzLuckyBlock);
                break;
            }
            case 45: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.gamingWithJenLuckyBlock);
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLittleLizardGaming.TYPE.create(worldIn), 40, worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.summonMobsNearby(EntityAlexirCraft.TYPE.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 49: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 30, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.deathHole(worldIn, player);
                break;
            }


        }//switch ends
    }//method end
}

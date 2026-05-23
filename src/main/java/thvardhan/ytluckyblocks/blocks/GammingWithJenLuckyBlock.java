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
import thvardhan.ytluckyblocks.entity.EntityAntVenom;
import thvardhan.ytluckyblocks.entity.EntityCaptainSparklez;
import thvardhan.ytluckyblocks.entity.EntityLogDotZip;
import thvardhan.ytluckyblocks.entity.EntitySuperGirlyGamer;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class GammingWithJenLuckyBlock extends Block {
    public GammingWithJenLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public GammingWithJenLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public GammingWithJenLuckyBlock(String unlocalizedName) {
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
            ExtraFunctions.setOneBlock(world, pos, Blocks.AIR);
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
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 3: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySuperGirlyGamer.TYPE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 4: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySuperGirlyGamer.TYPE.create(worldIn), rand.nextInt(30) + 1, worldIn, pos);
                break;
            }
            case 6: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 10: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 25, pos);
                ExtraFunctions.chat("Tame Them If You Want Them.", player);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BONE), 64, 0, 0);
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BONE), 64, 1, 10);
                break;
            }
            case 12: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, rand.nextBoolean());
                break;
            }
            case 14: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.COMMAND_BLOCK.asItem()));
                ExtraFunctions.chat("If You Are On Creative Then Nice Else Its Waste.", player);
                break;
            }
            case 16: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                break;
            }
            case 17: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 18: {
                ExtraFunctions.chat("These Blocks Are Called GamingWithJen Lucky Blocks (In Case You Dont Know)", player);
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
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLogDotZip.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), rand.nextInt(25) + 1, worldIn, pos, rand);
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
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), rand.nextInt(30) + 1, worldIn, pos);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityAntVenom.TYPE.create(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordLogdotzip));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 43: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 45: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;
            }
            case 46: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.skyDoesMinecraftLuckyBlock);
                break;
            }
            case 47: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 48: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 49: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), rand.nextInt(19) + 1, worldIn, pos);
                break;
            }
            case 50: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(50), worldIn, pos);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superBoots));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superChestplate));
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superHelmet));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.superLeggings));
                break;
            }

        }


    }//method ends
}

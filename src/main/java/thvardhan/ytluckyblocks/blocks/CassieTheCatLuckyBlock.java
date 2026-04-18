package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
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
import thvardhan.ytluckyblocks.entity.EntityCassieTheCat;
import thvardhan.ytluckyblocks.entity.EntityIhasCupquake;
import thvardhan.ytluckyblocks.entity.EntityJeromeASF;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class CassieTheCatLuckyBlock extends Block {
    public CassieTheCatLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public CassieTheCatLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public CassieTheCatLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.fireCamp(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 2: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                break;
            }
            case 3: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.ANVIL);
                break;
            }
            case 4: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.cassieTheCatBoots));
                break;
            }
            case 6: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.cassieTheCatChestplate));
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.cassieTheCatHelmet));
                break;
            }
            case 8: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.cassieTheCatLeggings));
                break;
            }
            case 9: {
                ExtraFunctions.fireCamp(worldIn, player);
                break;
            }
            case 10: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 11: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsNearby(EntityType.SQUID.create(worldIn), 60, worldIn, pos, rand);
                break;
            }
            case 13: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCassieTheCat.TYPE.create(worldIn), 30, worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsNearby(EntityType.CHICKEN.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 19: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 20: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 21: {
                ExtraFunctions.summonMobsNearby(EntityJeromeASF.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 22: {
                ExtraFunctions.fireCamp(worldIn, player);
                break;
            }
            case 23: {
                ExtraFunctions.tornadoStruct(worldIn, pos, rand);
                break;
            }
            case 24: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 25: {
                ExtraFunctions.deathHole(worldIn, player);
                break;
            }
            case 26: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 29: {
                ExtraFunctions.summonMobsNearby(EntityIhasCupquake.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 31: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 10, pos);
                break;
            }
            case 32: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.maxBoots, "AAAA!!", ExtraFunctions.enchantmentByLegacyNumericId(0), 100);
                break;
            }
            case 33: {
                ExtraFunctions.summonMobsNearby(EntityType.GUARDIAN.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 34: {
                ExtraFunctions.summonMobsNearby(EntityType.ELDER_GUARDIAN.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 35: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 37: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 38: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 40, worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 20, rand);
                break;
            }
            case 40: {
                ExtraFunctions.summonMobsNearby(EntityCassieTheCat.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 41: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.POTION));
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 50, worldIn, pos);
                break;
            }
            case 46: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 49: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.BONE, 20, 1, 2);
                break;
            }


        }//switch ends
    }//method end
}

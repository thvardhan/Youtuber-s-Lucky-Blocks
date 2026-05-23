package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
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
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LittleAllyLuckyBlock extends Block {
    public LittleAllyLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public LittleAllyLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public LittleAllyLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsNearby(EntityTewity.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyBoots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyChestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyHelmet));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyLeggings));
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
                ExtraFunctions.summonMobsNearby(EntityAlexirCraft.TYPE.create(worldIn), 30, worldIn, pos, rand);
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
                ExtraFunctions.summonMobsOnBreakBlock(EntityAntVenom.TYPE.create(worldIn), rand.nextInt(6) + 1, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyBoots));
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyChestplate));
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyLeggings));
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.allyHelmet));
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
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WOODEN_SWORD), e, 2, worldIn, pos);
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
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 32, worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 41: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLittleAlly.TYPE.create(worldIn), 30, worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLittleAlly.TYPE.create(worldIn), rand.nextInt(30) + 1, worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 44: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 45: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsNearby(EntityLittleAlly.TYPE.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 47: {
                ExtraFunctions.tpPlayerInGround(player);
                break;
            }
            case 48: {
                ExtraFunctions.deathHole(worldIn, player);
                break;
            }
            case 49: {
                ExtraFunctions.tpPlayerInGround(player);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 40, worldIn, pos);
                break;
            }


        }//switch ends
    }//method end
}

package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.entity.EntityLachlan;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LachlanLuckyBlock extends Block {
    public LachlanLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public LachlanLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public LachlanLuckyBlock(String unlocalizedName) {
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
            worldIn.addParticle(ParticleTypes.WITCH, d0, d1, d2, d3, d4, d5);
        }
    }

    @Override
    public void playerWillDestroy(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, net.minecraft.entity.player.PlayerEntity player) {
        super.playerWillDestroy(worldIn, pos, state, player);
        LuckyBlock.creativeLuckyBreak(worldIn, pos, player, () -> drops(worldIn, pos, player));
    }




        @Override
    public void playerDestroy(net.minecraft.world.World worldIn, net.minecraft.entity.player.PlayerEntity player, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, @javax.annotation.Nullable net.minecraft.tileentity.TileEntity blockEntity, net.minecraft.item.ItemStack tool) {
        if (!worldIn.isClientSide() && player != null && !(player instanceof FakePlayer) && !player.abilities.instabuild) {

            worldIn.removeBlock(pos, false);


            drops(worldIn, pos, player);
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
                ExtraFunctions.summonMobsNearby(EntityLachlan.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsNearby(EntityLachlan.TYPE.create(worldIn), 29, worldIn, pos, rand);
                break;
            }
            case 2: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 3: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.exploadingTNTLuckyBlock);
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_SWORD));
                break;
            }
            case 5: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 6: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.WHITE_WOOL);
                break;
            }
            case 7: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_AXE));
                break;
            }
            case 8: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.APPLE, 10, 0, 0);
                break;
            }
            case 9: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 12: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));

                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 15: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtube);
                break;

            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 19: {
                ExtraFunctions.summonMobsNearby(EntityLachlan.TYPE.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 20: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.LEAD));
                break;
            }
            case 21: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.NETHER_STAR));
                break;
            }
            case 22: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.SNOWBALL), 64, 1, 1);
                break;
            }
            case 23: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 24: {
                ExtraFunctions.setOneBlock(worldIn, new BlockPos(player.getX(), player.getY(), player.getZ()), Blocks.LAVA);
                break;
            }
            case 25: {
                ExtraFunctions.setOneBlock(worldIn, new BlockPos(player.getX(), player.getY(), player.getZ()), Blocks.WATER);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_APPLE));
                break;
            }
            case 27: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.tntRain(worldIn, pos, 100, 1, player);
                break;
            }
            case 29: {
                ExtraFunctions.summonMobsNearby(EntityType.ZOMBIE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BLAZE_ROD), 15, 0, 0);
                break;
            }
            case 31: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 32: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.EMERALD_BLOCK);
                break;
            }
            case 33: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_PICKAXE), e, 3, worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.chat(TextFormatting.AQUA + "Hello There ~", player);
                break;
            }
            case 36: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 37: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 38: {
                ExtraFunctions.summonMobsNearby(EntityType.ELDER_GUARDIAN.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MILK_BUCKET));
                break;
            }
            case 40: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 50, rand);
                break;
            }
            case 41: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 300, worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BOOKSHELF);
                break;
            }
            case 44: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 45: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 46: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.REGENERATION, 10, 500));
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacBoots));
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacChestplate));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacHelmet));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.lacLeggings));
                break;
            }


        }//switch ends
    }//method end
}
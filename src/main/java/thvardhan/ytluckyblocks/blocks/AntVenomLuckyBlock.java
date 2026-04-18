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
import thvardhan.ytluckyblocks.entity.EntityDanTDM;
import thvardhan.ytluckyblocks.entity.EntityGhost;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

//import net.minecraft.util.text.TextFormatting;

public class AntVenomLuckyBlock extends Block {

    private static Random rand = new Random();
    public AntVenomLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion());
    }

    public AntVenomLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public AntVenomLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    private static void drops(World worldIn, BlockPos pos, PlayerEntity player) {


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
                ExtraFunctions.chat(TextFormatting.BLACK + "Special Troll", player);
                break;
            }
            case 3: {
                Enchantment[] e = {ExtraFunctions.enchantmentByLegacyNumericId(0), ExtraFunctions.enchantmentByLegacyNumericId(1), ExtraFunctions.enchantmentByLegacyNumericId(3), ExtraFunctions.enchantmentByLegacyNumericId(2), ExtraFunctions.enchantmentByLegacyNumericId(1)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_BOOTS), e, 5, worldIn, pos);
                break;
            }
            case 4: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.tntFix(worldIn, pos, 64, player);
                break;
            }
            case 6: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 11: {
                ExtraFunctions.orcArmy(worldIn, pos, 20, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.GOLDEN_APPLE, 15, 1, 5);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.APPLE, 64, 0, 0);
                break;
            }
            case 14: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsNearby(EntityAntVenom.TYPE.create(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 16: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 30, worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.BLAZE.create(worldIn), 20, worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 19: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 20: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.LAVA);
                break;
            }
            case 22: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                ExtraFunctions.chat(TextFormatting.BLACK + "Try to break me :V", player);
                break;
            }
            case 23: {
                ExtraFunctions.chat(TextFormatting.AQUA + "This Lucky Block You Just Opened Is Buged -_- Please Open Other One :D", player);
                break;
            }
            case 24: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 25: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.WOODEN_SWORD, TextFormatting.BLUE + "Mama", ExtraFunctions.enchantmentByLegacyNumericId(2), 100);
                break;
            }
            case 26: {
                ExtraFunctions.summonMobsNearby(EntityDanTDM.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.summonMobsNearby(EntityGhost.TYPE.create(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 28: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 29: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.CAKE);
                break;
            }
            case 30: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.IRON_BLOCK);
                break;
            }
            case 31: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityPopularMMO.TYPE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 32: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 25, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.CAKE);
                break;
            }
            case 36: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.DRAGON_EGG);
                break;
            }
            case 37: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.WHITE_BED);
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 40: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.levinSword));
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.DIAMOND, 64, 0, 0);
                break;
            }
            case 43: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.GOLD_BLOCK.asItem()), 55, 1, 5);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.EMERALD), 54, 0, 0);
                break;
            }
            case 45: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 46: {
                ExtraFunctions.summonBlockWithLoop(worldIn, pos, ModBlocks.antVenomLuckyBlock, 5, 0, 0);
                break;
            }
            case 47: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 49: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 50: {
                ExtraFunctions.summonMobsNearby(EntityGhost.TYPE.create(worldIn), 10, worldIn, pos, rand);
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antChestplate));
                break;
            }
            case 52: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antHelmet));
                break;
            }
            case 53: {

                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antLeggings));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.antBoots));
                break;
            }

        }
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


}

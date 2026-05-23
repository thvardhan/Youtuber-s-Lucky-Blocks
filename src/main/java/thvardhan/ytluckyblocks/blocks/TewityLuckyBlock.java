package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.passive.RabbitEntity;
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
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class TewityLuckyBlock extends Block {
    public TewityLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public TewityLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public TewityLuckyBlock(String unlocalizedName) {
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
            worldIn.addParticle(ParticleTypes.ENCHANT, d0, d1, d2, d3, d4, d5);
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


        Enchantment[] e = new Enchantment[4];
        e[0] = ExtraFunctions.enchantmentByLegacyNumericId(50);
        e[2] = ExtraFunctions.enchantmentByLegacyNumericId(48);
        e[3] = ExtraFunctions.enchantmentByLegacyNumericId(7);
        e[1] = ExtraFunctions.enchantmentByLegacyNumericId(21);


        Random rand = new Random();


        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.slimeFort(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.summonMobsNearby(EntityTewity.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityBoots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityChestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityHelmet));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityLeggings));
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
                ExtraFunctions.summonMobsNearby(EntityTewity.TYPE.create(worldIn), 32, worldIn, pos, rand);
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityBoots));
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityChestplate));
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityHelmet));
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.tewityLeggings));
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
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 36, worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.DRAGON_EGG.asItem()));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.CAKE.asItem()));
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.COMMAND_BLOCK.asItem()));
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ARROW), 64, 0, 0);
                break;
            }
            case 45: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_HORSE_ARMOR));
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsNearby(EntityBajanCanadian.TYPE.create(worldIn), 42, worldIn, pos, rand);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_SWORD));
                break;
            }
            case 49: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 50: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                break;
            }
            case 51: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.IRON_PICKAXE), new Enchantment[]{ExtraFunctions.enchantmentByLegacyNumericId(32), ExtraFunctions.enchantmentByLegacyNumericId(35)}, 4, worldIn, pos);
                break;
            }
            case 52: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
                break;
            }
            case 53: {
                ExtraFunctions.summonMobsNearby(EntityGhost.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 54: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 55: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), 20, worldIn, pos);
                break;
            }
            case 56: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityLogDotZip.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 57: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), rand.nextInt(20) + 1, worldIn, pos);
                break;
            }
            case 58: {
                ExtraFunctions.tntNearby(worldIn, pos, 100, player, rand);
                break;
            }
            case 59: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 60: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 61: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), 20, worldIn, pos);
                break;
            }
            case 62: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 63: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 20, worldIn, pos);
                break;
            }
            case 64: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.SKELETON_SKULL);
                break;
            }
            case 65: {
                ExtraFunctions.summonMobsNearby(EntityFrizzleandpop.TYPE.create(worldIn), 52, worldIn, pos, rand);
                break;
            }
            case 66: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 67: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 68: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.COMMAND_BLOCK_MINECART));
                break;
            }
            case 69: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.LAVA);
                break;
            }
            case 70: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLDEN_SWORD));
                break;
            }
            case 71: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.STONE_SWORD));
                break;
            }
            case 72: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.IRON_SWORD));
                break;
            }
            case 73: {
                ExtraFunctions.summonMobsNearby(EntityTewity.TYPE.create(worldIn), 27, worldIn, pos, rand);
                break;
            }
            case 74: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.GOLD_INGOT), 20, 1, 20);
                break;
            }
            case 75: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 700, 20));
                break;
            }
            case 76: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 77: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 78: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 79: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 80: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 81: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 82: {
                ExtraFunctions.tntFix(worldIn, pos, 70, player);
                break;
            }
            case 83: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 84: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.SHEARS));
                break;
            }
            case 85: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 3, 0, 0);
                break;
            }
            case 86: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.EMERALD_BLOCK);
                break;
            }
            case 87: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BREWING_STAND);
                break;
            }
            case 88: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), rand.nextInt(20) + 1, worldIn, pos);
                break;
            }
            case 89: {
                ExtraFunctions.trollChat(player);
                break;
            }
            case 90: {
                ExtraFunctions.summonMobsNearby(EntityTewity.TYPE.create(worldIn), 20, worldIn, pos, rand);
                break;
            }
            case 91: {
                ExtraFunctions.summonMobsNearby(EntityJeromeASF.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 92: {
                ExtraFunctions.summonMobsNearby(EntityType.HORSE.create(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 93: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.ENDERMITE.create(worldIn), 70, worldIn, pos);
                break;
            }
            case 94: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 95: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityDanTDM.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 96: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySkyDoesMinecraft.TYPE.create(worldIn), 5, worldIn, pos);
                break;
            }
            case 97: {
                ExtraFunctions.summonMobsNearby(EntityType.GUARDIAN.create(worldIn), 20, worldIn, pos, rand);
                break;
            }
            case 98: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.BREAD, 20, 0, 0);
                break;
            }
            case 99: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 100: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
                break;
            }


        }//switch ends
    }//method end
}
package thvardhan.ytluckyblocks.blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

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
import thvardhan.ytluckyblocks.entity.*;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class IHasCupcakeLuckyBlock extends Block {
    public IHasCupcakeLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public IHasCupcakeLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public IHasCupcakeLuckyBlock(String unlocalizedName) {
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
            worldIn.addParticle(ParticleTypes.ENTITY_EFFECT, d0, d1, d2, d3, d4, d5);
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
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 1: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Boots));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Chestplate));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Helmet));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Leggings));
                break;
            }
            case 6: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.summonMobsNearby(EntityIhasCupquake.TYPE.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 8: {
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 9: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 10: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                ExtraFunctions.chat("Alwys rmber whn evr u gt ths drp kll the cws MOOO", player);
                break;
            }
            case 11: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 12: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.FIRE_RESISTANCE, 1000, 24));
                break;
            }
            case 13: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.ARROW), 40, 1, 40);
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.BOW, "KnockBow", ExtraFunctions.enchantmentByLegacyNumericId(49), 4);
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.SNOWBALL));
                ExtraFunctions.chat("<3 Snowballs", player);
                break;
            }
            case 15: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 10, rand);
                break;
            }
            case 16: {
                ExtraFunctions.anvilRain(worldIn, pos);
                ExtraFunctions.chat("Dont Move Or Look Up For Next 3 Seconds", player);
                break;
            }
            case 17: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.ENDERMITE.create(worldIn), 40, worldIn, pos);
                break;
            }
            case 19: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 20: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
                break;
            }
            case 21: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 22: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 23: {
                ExtraFunctions.chat("Look Up", player);
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 25: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.IRON_ORE);
                break;
            }
            case 26: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DIAMOND_BLOCK);
                break;
            }
            case 27: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ACTIVATOR_RAIL);
                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(this));
                break;
            }
            case 29: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.tntFix(worldIn, pos, 40, player);
                break;
            }
            case 31: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 32: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.mic);
                break;
            }
            case 33: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.danTDMLuckyBlock);
                break;
            }
            case 34: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 35: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.thnxCyaLuckyBlock);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 38: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsNearby(EntityType.GUARDIAN.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BAKED_POTATO), 1, 0, 0);
                ExtraFunctions.chat("Take this for your affords :D", player);
                break;
            }
            case 41: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.REGENERATION, 1200, 5));
                break;
            }
            case 42: {
                ExtraFunctions.orcArmy(worldIn, pos, 0, rand);
                break;
            }
            case 43: {
                ExtraFunctions.tntNearby(worldIn, pos, 2, player, rand);
                break;
            }
            case 44: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ENDER_PEARL));
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;

            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.MAP));
                break;
            }
            case 47: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 48: {
                ExtraFunctions.tntFix(worldIn, pos, 50, player);
                break;
            }
            case 49: {
                ExtraFunctions.sandRain(worldIn, player);
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
                break;
            }
            case 51: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.APPLE), e, 4, worldIn, pos);
                break;
            }
            case 52: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 53: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.TNT);
                ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), Blocks.FIRE);
                break;
            }
            case 54: {
                ExtraFunctions.saflyTeleportPlayer(worldIn, player);
                break;
            }
            case 55: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 56: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 57: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 58: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 59: {
                ExtraFunctions.towerStruct(worldIn, pos);
                break;
            }
            case 60: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 61: {
                ExtraFunctions.chat("look up", player);
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 62: {
                ExtraFunctions.orcArmy(worldIn, pos, 5, rand);
                break;
            }
            case 63: {
                ExtraFunctions.summonMobsNearby(EntityIhasCupquake.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 64: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 65: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 66: {
                ExtraFunctions.tntNearby(worldIn, pos, 50, player, rand);
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.iBallisticSquidLuckyBlock));
                break;
            }
            case 68: {
                ExtraFunctions.setHoleWithMites(worldIn, player);
                break;
            }
            case 69: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.FLOWER_POT);
                break;
            }
            case 70: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 71: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 72: {
                ExtraFunctions.musicKit(worldIn, pos);
                break;
            }
            case 73: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.sSundeeLuckyBlock);
                break;
            }
            case 74: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Boots));
                break;
            }
            case 75: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Chestplate));
                break;
            }
            case 76: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Helmet));
                break;
            }
            case 77: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ihas_Leggings));
                break;
            }
            case 78: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 79: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.ARROW, 40, 0, 0);
                break;
            }
            case 80: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 81: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.CAKE.asItem()));
                break;
            }
            case 82: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 83: {
                ExtraFunctions.summonMobsNearby(EntityType.ZOMBIE.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 84: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 85: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BUCKET));
                break;
            }
            case 86: {

                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.DAMAGE_BOOST, 1000, 24));
                break;
            }
            case 87: {
                ExtraFunctions.summonMobsNearby(EntityBajanCanadian.TYPE.create(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 88: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), 1, worldIn, pos);
                break;
            }
            case 89: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
                break;
            }
            case 90: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 91: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 92: {
                ExtraFunctions.mountain(worldIn, pos, rand);
                break;
            }
            case 93: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 94: {
                ExtraFunctions.tntFix(worldIn, pos, 10, player);
                break;
            }
            case 95: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ANVIL);
                break;
            }
            case 96: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 97: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.jeromeASFLuckyBlock);
                break;
            }
            case 98: {
                ExtraFunctions.summonMobsNearby(EntitySSundee.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 99: {
                ExtraFunctions.summonMobsNearby(EntityIhasCupquake.TYPE.create(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 100: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }


        }//switch ends
    }//method end
}
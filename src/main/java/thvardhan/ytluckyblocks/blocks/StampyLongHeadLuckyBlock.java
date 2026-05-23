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

public class StampyLongHeadLuckyBlock extends Block {
    public StampyLongHeadLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public StampyLongHeadLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public StampyLongHeadLuckyBlock(String unlocalizedName) {
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

        Enchantment[] e = new Enchantment[5];
        e[0] = ExtraFunctions.enchantmentByLegacyNumericId(50);
        e[1] = ExtraFunctions.enchantmentByLegacyNumericId(19);
        e[2] = ExtraFunctions.enchantmentByLegacyNumericId(48);
        e[3] = ExtraFunctions.enchantmentByLegacyNumericId(7);
        e[4] = ExtraFunctions.enchantmentByLegacyNumericId(21);


        Random rand = new Random();


        switch (rand.nextInt(101)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_SWORD), e, 5, worldIn, pos);
            }
            case 0: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.stampy_Boots));
                break;
            }
            case 1: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.stampy_Chestplate));
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.stampy_Helmet));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.stampy_Leggings));
                break;
            }
            case 4: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.m_sword));
                break;
            }
            case 5: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.megaSword));
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
                ExtraFunctions.summonMobsOnBreakBlock(EntityAntVenom.TYPE.create(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 16: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, rand.nextInt(5), worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.summonMobsNearby(EntityType.BLAZE.create(worldIn), 35, worldIn, pos, rand);
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 23: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.goldButton);
                break;
            }
            case 24: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.frizzleandpopLuckyBlock);
                break;
            }
            case 25: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.youtubeLuckyBlock);
                break;
            }
            case 26: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 27: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.OBSIDIAN.asItem()), 30, 0, 0);
                break;
            }
            case 28: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 29: {
                ExtraFunctions.parabolaStruct(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_CHESTPLATE));
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_HELMET));
                break;
            }
            case 32: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_LEGGINGS));
                break;
            }
            case 33: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.DIAMOND_BOOTS));
                break;
            }
            case 34: {
                ExtraFunctions.anvilRain(worldIn, pos);
                break;
            }
            case 35: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 37: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.DARK_OAK_DOOR);
                break;
            }
            case 38: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 39: {
                Enchantment[] ea = {ExtraFunctions.enchantmentByLegacyNumericId(16), ExtraFunctions.enchantmentByLegacyNumericId(19), ExtraFunctions.enchantmentByLegacyNumericId(20)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.WOODEN_HOE), ea, 60, worldIn, pos);
                ExtraFunctions.chat("Someone Just Got A God Hoe", player);
                break;
            }
            case 40: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 41: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 42: {
                ExtraFunctions.summonMobsNearby(EntityStampylonghead.TYPE.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 43: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 45: {
                ExtraFunctions.orcArmy(worldIn, pos, 60, rand);
                break;
            }
            case 46: {
                ExtraFunctions.summonMobsOnBreakBlock(EntitySerialPlayer.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 47: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.serialPlayerLuckyBlock);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 49: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.swordBlack));
                break;
            }
            case 50: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 51: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.stampy_Helmet));
                break;
            }
            case 52: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.stampy_Boots, "Boots", ExtraFunctions.enchantmentByLegacyNumericId(0), 5);
                break;
            }
            case 53: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.stampy_Chestplate));
                break;
            }
            case 54: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.stampy_Leggings));
                break;
            }
            case 55: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.snowSword, "Icy", ExtraFunctions.enchantmentByLegacyNumericId(17), 10);
                break;
            }
            case 56: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.megaSword, "MegaKilla", ExtraFunctions.enchantmentByLegacyNumericId(16), 6);
                break;
            }
            case 57: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
                break;
            }
            case 58: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
                break;
            }
            case 59: {
                ExtraFunctions.mountainOne(worldIn, pos, rand);
                break;
            }
            case 60: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.MILK_BUCKET), 50, 1, 2);
                ExtraFunctions.chat("Use these to clean any bad effects you get while opening these lucky blocks", player);
                break;
            }
            case 61: {
                ExtraFunctions.tntFix(worldIn, pos, 5, player);
                break;
            }
            case 62: {
                ExtraFunctions.summonTammedWolfs(worldIn, player, 5, pos);
                break;
            }
            case 63: {
                ExtraFunctions.summonMobsNearby(EntityStampylonghead.TYPE.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 64: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.BAKED_POTATO));
                ExtraFunctions.chat("Here, take this one potato (which you cant even plant :v) for your efforts", player);
                break;
            }
            case 65: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.POISONOUS_POTATO, "Eat Me!", ExtraFunctions.enchantmentByLegacyNumericId(19), 50);
                break;
            }
            case 66: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.FIRE_RESISTANCE, 1000, 20));
                break;
            }
            case 67: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                break;
            }
            case 68: {
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, new ItemStack[]{new ItemStack(ModItems.stampy_Boots), new ItemStack(ModItems.stampy_Leggings)}, e, 5, pos, rand);
                break;
            }
            case 69: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.stampy_Chestplate), e, 10, worldIn, pos);
                break;
            }
            case 70: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 71: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 72: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 73: {
                RabbitEntity rab = EntityType.RABBIT.create(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 60, worldIn, pos);
                break;
            }
            case 74: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 51, worldIn, pos, rand);
                break;
            }
            case 75: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 20, worldIn, pos, rand);
                break;
            }
            case 76: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 77: {
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, Blocks.END_PORTAL_FRAME);
                break;
            }
            case 78: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.GOLD_BLOCK);
                break;
            }
            case 79: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.IRON_BLOCK);
                break;
            }
            case 80: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COAL_BLOCK);
                break;
            }
            case 81: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ENCHANTING_TABLE);
                break;
            }
            case 82: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityCaptainSparklez.TYPE.create(worldIn), 40, worldIn, pos);
                break;
            }
            case 83: {
                ExtraFunctions.summonMobsNearby(EntityGhost.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 84: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 35, worldIn, pos, rand);
                break;
            }
            case 85: {
                ExtraFunctions.burgerStructOne(worldIn, pos);
                break;
            }
            case 86: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityTruemu.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 87: {
                ExtraFunctions.summonMobsNearby(EntityJeromeASF.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 88: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.INFESTED_STONE.asItem()));
                break;
            }
            case 89: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.frizzleandpopLuckyBlock));
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
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 40, worldIn, pos, rand);
                break;
            }
            case 93: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityGhost.TYPE.create(worldIn), 10, worldIn, pos);
                break;
            }
            case 94: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                break;
            }
            case 95: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 64, 1, 40);
                break;
            }
            case 96: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.BEDROCK.asItem()), 64, 1, 40);
                break;
            }
            case 97: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.REDSTONE), 120, 0, 0);
                break;
            }
            case 98: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ARROW));
                break;
            }
            case 99: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.SPONGE.asItem()));
                break;
            }
            case 100: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.GOLD_INGOT));
                break;
            }


        }//switch ends
    }//method end
}
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
import thvardhan.ytluckyblocks.entity.EntityEvilLittleKelly;
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class EvilLittleKellyLuckyBlock extends Block {
    public EvilLittleKellyLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(net.minecraft.block.AbstractBlock.Properties.of(material).strength(hardness, resistance).noOcclusion().lightLevel(s -> (int)(15.0F * (0F))));
    }

    public EvilLittleKellyLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.STONE, 0, 10000);
    }

    public EvilLittleKellyLuckyBlock(String unlocalizedName) {
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
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.evilLittleKellyBoots));

                break;
            }
            case 1: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.evilLittleKellyChestplate));
                break;
            }
            case 2: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.evilLittleKellyHelmet));
                break;
            }
            case 3: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.evilLittleKellyLeggings));
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
                ExtraFunctions.summonMobsOnBreakBlock(EntityEvilLittleKelly.TYPE.create(worldIn), 35, worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.deathHole(worldIn, player);
                break;
            }
            case 8: {
                ExtraFunctions.orcArmy(worldIn, pos, 30, rand);
                break;
            }
            case 9: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), 3, worldIn, pos);
                break;
            }
            case 10: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.POISON, 600, 5));
                break;
            }
            case 11: {
                ExtraFunctions.tpPlayer(player);
                break;
            }
            case 12: {
                ExtraFunctions.tpPlayerInGround(player);
                break;
            }
            case 13: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 14: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.nastySword));
                break;
            }
            case 15: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 17: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 19: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.NIGHT_VISION, 600, 30));
                break;
            }
            case 20: {
                ExtraFunctions.tpPlayerInGround(player);
                break;
            }
            case 21: {
                ExtraFunctions.obsidianCageStruct(worldIn, player);
                break;
            }
            case 22: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1200, 30));
                break;
            }
            case 23: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.DAMAGE_BOOST, 600, 10));
                break;
            }
            case 24: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.FIRE_RESISTANCE, 1200, 1));
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityEvilLittleKelly.TYPE.create(worldIn), rand.nextInt(50) + 1, worldIn, pos);
                break;
            }
            case 26: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                break;
            }
            case 27: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.mic));
                break;
            }
            case 28: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.BEDROCK);
                break;
            }
            case 29: {
                ExtraFunctions.summonMobsNearby(EntityType.IRON_GOLEM.create(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 30: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
                break;
            }
            case 31: {
                ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                break;
            }
            case 32: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 33: {
                ExtraFunctions.orcArmy(worldIn, pos, 50, rand);
                break;
            }
            case 34: {
                ExtraFunctions.effectPlayer(player, new EffectInstance(Effects.DAMAGE_BOOST, 1000, 20, true, true));
                break;
            }
            case 35: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsNearby(EntityType.SKELETON.create(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), new Enchantment[]{ExtraFunctions.enchantmentByLegacyNumericId(16)}, rand.nextInt(50) + 1, worldIn, pos);
                break;
            }
            case 38: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.WITHER.create(worldIn), rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 40, 0, 0);
                ExtraFunctions.chat(TextFormatting.GOLD + "Normal Apples ^^", player);
                break;
            }
            case 41: {
                ExtraFunctions.randomSixtyFourTower(worldIn, pos, rand);
                break;
            }
            case 42: {
                ExtraFunctions.redstoneKit(worldIn, pos);
                break;
            }
            case 43: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityISquid.TYPE.create(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsNearby(EntityPopularMMO.TYPE.create(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(EntityType.CREEPER.create(worldIn), 200, worldIn, pos, rand);
                break;
            }
            case 46: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 100, rand);
                break;
            }
            case 47: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 48: {
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.frizzleandpopLuckyBlock);
                break;
            }
            case 49: {
                ExtraFunctions.summonMobsOnBreakBlock(EntityType.GHAST.create(worldIn), 60, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordLogdotzip), e, 7, worldIn, pos);
                break;
            }


        }//switch ends
    }//method end
}
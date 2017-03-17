package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityEvilLittleKelly;
import thvardhan.ytluckyblocks.entity.EntityISquid;
import thvardhan.ytluckyblocks.entity.EntityPopularMMO;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class EvilLittleKellyLuckyBlock extends Block {

    public EvilLittleKellyLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public EvilLittleKellyLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public EvilLittleKellyLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isVisuallyOpaque() {
        return false;
    }
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        for (int i = 0; i < 3; ++i) {
            int j = rand.nextInt(2) * 2 - 1;
            int k = rand.nextInt(2) * 2 - 1;
            double d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
            double d1 = (double) ((float) pos.getY() + rand.nextFloat());
            double d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) k;
            double d3 = (double) (rand.nextFloat() * (float) j);
            double d4 = ((double) rand.nextFloat() - 0.5D) * 0.125D;
            double d5 = (double) (rand.nextFloat() * (float) k);
            worldIn.spawnParticle(EnumParticleTypes.CRIT_MAGIC, d0, d1, d2, d3, d4, d5);
        }
    }


    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (!world.isRemote && player != null && !(player instanceof FakePlayer)) {
            world.setBlockToAir(pos);
            drops(world, pos, player);
        }
        return false;
    }

    private void drops(World worldIn, BlockPos pos, EntityPlayer player) {

        Enchantment[] e = new Enchantment[5];
        e[0] = Enchantment.getEnchantmentByID(50);
        e[1] = Enchantment.getEnchantmentByID(19);
        e[2] = Enchantment.getEnchantmentByID(48);
        e[3] = Enchantment.getEnchantmentByID(7);
        e[4] = Enchantment.getEnchantmentByID(21);


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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityEvilLittleKelly(worldIn), 35, worldIn, pos);
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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), 3, worldIn, pos);
                break;
            }
            case 10: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.POISON.getEffects().get(0).getPotion(), 600, 5));
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
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.NIGHT_VISION.getEffects().get(0).getPotion(), 600, 30));
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
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.SLOWNESS.getEffects().get(0).getPotion(), 1200, 30));
                break;
            }
            case 23: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.STRENGTH.getEffects().get(0).getPotion(), 600, 10));
                break;
            }
            case 24: {
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.FIRE_RESISTANCE.getEffects().get(0).getPotion(), 1200, 1));
                break;
            }
            case 25: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityEvilLittleKelly(worldIn), rand.nextInt(50) + 1, worldIn, pos);
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
                ExtraFunctions.summonMobsNearby(new EntityIronGolem(worldIn), 25, worldIn, pos, rand);
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
                ExtraFunctions.effectPlayer(player, new PotionEffect(PotionTypes.STRENGTH.getEffects().get(0).getPotion(), 1000, 20, true, true));
                break;
            }
            case 35: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.devilSword), new Enchantment[]{Enchantment.getEnchantmentByID(16)}, rand.nextInt(50) + 1, worldIn, pos);
                break;
            }
            case 38: {
                ExtraFunctions.potionKit(worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), rand.nextInt(5) + 1, worldIn, pos);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.APPLE), 40, 0, 0);
                ExtraFunctions.chat(ChatFormatting.GOLD + "Normal Apples ^^", player);
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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityISquid(worldIn), rand.nextInt(10) + 1, worldIn, pos);
                break;
            }
            case 44: {
                ExtraFunctions.summonMobsNearby(new EntityPopularMMO(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 45: {
                ExtraFunctions.summonMobsNearby(new EntityCreeper(worldIn), 200, worldIn, pos, rand);
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
                ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 60, worldIn, pos);
                break;
            }
            case 50: {
                ExtraFunctions.addEnchantsMany(new ItemStack(ModItems.swordLogdotzip), e, 7, worldIn, pos);
                break;
            }


        }//switch ends
    }//method end
}

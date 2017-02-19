package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityBajanCanadian;
import thvardhan.ytluckyblocks.entity.EntityScubaSteve;
import thvardhan.ytluckyblocks.entity.EntitySerialPlayer;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class ScubaSteveLuckyBlock extends Block {

    public ScubaSteveLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public ScubaSteveLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public ScubaSteveLuckyBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube() {
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
            worldIn.spawnParticle(EnumParticleTypes.SPELL, d0, d1, d2, d3, d4, d5, new int[0]);
        }
    }


    @Override
    public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (!world.isRemote && player != null && !(player instanceof FakePlayer)) {

            world.setBlockToAir(pos);
            drops(world, pos, player);
        }
        return true;

        //super.onBlockDestroyedByPlayer(worldIn, pos, state);
    }

    private void drops(World worldIn, BlockPos pos, EntityPlayer player) {

        Enchantment[] e = new Enchantment[5];
        e[0] = Enchantment.flame;
        e[1] = Enchantment.knockback;
        e[2] = Enchantment.power;
        e[3] = Enchantment.thorns;
        e[4] = Enchantment.looting;


        Random rand = new Random();


        switch (rand.nextInt(51)) {

            default: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_sword), e, 5, worldIn, pos);
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
                ExtraFunctions.summonMobsNearby(new EntityScubaSteve(worldIn), 50, worldIn, pos, rand);
                break;
            }
            case 4: {
                ExtraFunctions.summonMobsNearby(new EntitySkeleton(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.summonMobsNearby(new EntityScubaSteve(worldIn), 25, worldIn, pos, rand);
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
                ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.luckyPressurePlate);
                break;
            }
            case 12: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.ghast_tear));
                break;
            }
            case 13: {
                ExtraFunctions.holeDeathTrap(worldIn, pos);
                break;
            }
            case 14: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.egg), new Enchantment[]{Enchantment.fireAspect}, 2, worldIn, pos);
                break;
            }
            case 15: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntitySerialPlayer(worldIn), 2, worldIn, pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.apple));
                break;
            }
            case 17: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.wooden_hoe), e, 10, worldIn, pos);
                break;
            }
            case 18: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.scubaBoots));
                break;
            }
            case 19: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.scubaChestplate));
                break;
            }
            case 20: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.scubaHelmet));
                break;
            }
            case 21: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.scubaLeggings));
                break;
            }
            case 22: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.sponge));
                break;
            }
            case 23: {
                ExtraFunctions.luckyBlockTower(worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.musicKit(worldIn, pos);
                ExtraFunctions.chat(EnumChatFormatting.GREEN + "Go Listen To Some Music...", player);
                break;
            }
            case 25: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.devilSword));
                break;
            }
            case 26: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityIronGolem(worldIn), 50, worldIn, pos);
                break;
            }
            case 27: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.tnt);
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.flint_and_steel));

                break;
            }
            case 28: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                break;
            }
            case 29: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                break;
            }
            case 30: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                break;
            }
            case 31: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                break;
            }
            case 32: {

                Enchantment[] a = {Enchantment.aquaAffinity, Enchantment.baneOfArthropods, Enchantment.blastProtection, Enchantment.knockback, Enchantment.power, Enchantment.looting, Enchantment.fireAspect, Enchantment.sharpness};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.diamond_axe), a, 3, worldIn, pos);
                break;
            }
            case 33: {
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.wooden_sword), e, 2, worldIn, pos);
                break;
            }
            case 34: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 35: {
                ExtraFunctions.summonCowNearby(worldIn, pos, 20, rand);
                break;
            }
            case 36: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.rainbowBlade));
                break;
            }
            case 37: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.youtube));
                break;
            }
            case 38: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.nether_star));
                break;
            }
            case 39: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                break;
            }
            case 40: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
                break;
            }
            case 41: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.dragon_egg));
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.cake));
                break;
            }
            case 43: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.command_block));
                break;
            }
            case 44: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.arrow), 64, 0, 0);
                break;
            }
            case 45: {
                ExtraFunctions.flyingIsle(worldIn, pos);
                break;
            }
            case 46: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_horse_armor));
                break;
            }
            case 47: {
                ExtraFunctions.summonMobsNearby(new EntityBajanCanadian(worldIn), 42, worldIn, pos, rand);
                break;
            }
            case 48: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_sword));
                break;
            }
            case 49: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.enchanting_table);
                break;
            }
            case 50: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.bedrock);
                break;
            }


        }//switch ends
    }//method end


}

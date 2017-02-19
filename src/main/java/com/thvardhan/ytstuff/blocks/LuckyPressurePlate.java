package com.thvardhan.ytstuff.blocks;

import com.thvardhan.ytstuff.CommonProxy;
import com.thvardhan.ytstuff.entity.EntityLogDotZip;
import com.thvardhan.ytstuff.entity.EntityPinkSheep;
import com.thvardhan.ytstuff.functions.ExtraFunctions;
import com.thvardhan.ytstuff.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

public class LuckyPressurePlate extends Block {

    private BlockPos pos;

    public LuckyPressurePlate(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
        this.setBlockBounds(0.03f,0,0.03f,0.93F,0.2F,0.93F);
    }


    public LuckyPressurePlate(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public LuckyPressurePlate(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }


    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        this.pos=pos;
        super.onBlockAdded(worldIn, pos, state);
    }

    @Override
    public void onLanded(World worldIn, Entity entityIn) {

        if (!worldIn.isRemote && entityIn instanceof EntityPlayer) {


            ExtraFunctions.setOneBlock(worldIn, pos, Blocks.air);


            //GOLDENAPPLE FAKE!


            Random rand = new Random();

            switch (rand.nextInt(51)) {

                default: {
                    ExtraFunctions.chat("EMPTY", (EntityPlayer) entityIn);
                }
                case 0: {
                    ExtraFunctions.materialKit(worldIn, pos, rand);
                    break;
                }
                case 1: {
                    ExtraFunctions.deathHole(worldIn, (EntityPlayer) entityIn);
                    break;
                }
                case 2: {
                    ExtraFunctions.anvilRain(worldIn, pos);
                    break;
                }
                case 3: {
                    ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, false);
                    break;
                }
                case 4: {
                    ExtraFunctions.trollDiamondTrapWithChanceOfNotTroll(worldIn, pos, true);
                    break;
                }
                case 5: {
                    ExtraFunctions.fireCamp(worldIn, (EntityPlayer) entityIn);
                    break;
                }
                case 6: {
                    ExtraFunctions.summonTammedWolfs(worldIn, (EntityPlayer) entityIn, 21, pos);
                    break;
                }
                case 7: {
                    ExtraFunctions.tpPlayerInGround((EntityPlayer) entityIn);
                    break;
                }
                case 8: {
                    ExtraFunctions.tpPlayer((EntityPlayer) entityIn);
                    break;
                }
                case 9: {
                    ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.diamond), 40, 1, 4);
                    break;
                }
                case 10: {
                    ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.emerald), 15, 1, 6);
                    break;
                }
                case 11: {
                    ExtraFunctions.setOneBlock(worldIn, pos, ModBlocks.babyDuckLuckyBlock);
                    break;
                }
                case 12: {
                    ExtraFunctions.flyingIsle(worldIn, pos);
                    ExtraFunctions.chat("Look Up ^", (EntityPlayer) entityIn);
                    break;
                }
                case 13: {
                    ExtraFunctions.setOneBlock(worldIn, new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()), Blocks.flowing_lava);
                    break;
                }
                case 14: {

                    ExtraFunctions.burgerStruct(worldIn, pos);
                    break;
                }
                case 15: {
                    ExtraFunctions.tntNearby(worldIn, pos, 150, (EntityPlayer) entityIn, rand);
                    break;
                }
                case 16: {
                    ExtraFunctions.musicKit(worldIn, pos);
                    break;
                }
                case 17: {
                    ExtraFunctions.luckyBlockTower(worldIn, pos);
                    break;
                }
                case 18: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.flint_and_steel));
                    break;
                }
                case 19: {
                    ExtraFunctions.summonTammedWolfs(worldIn, (EntityPlayer) entityIn, 21, pos);
                    break;
                }
                case 20: {
                    ExtraFunctions.obsidianCageStruct(worldIn, (EntityPlayer) entityIn);
                    break;
                }
                case 21: {
                    ExtraFunctions.sandRain(worldIn, (EntityPlayer) entityIn);
                    break;
                }
                case 22: {
                    ExtraFunctions.tntFix(worldIn, pos, 5, (EntityPlayer) entityIn);
                    break;
                }
                case 23: {
                    ExtraFunctions.chat("DONT EAT ME! I BEG! :3", (EntityPlayer) entityIn);
                    ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, Items.golden_apple, "apule", Enchantment.fireAspect, 60);
                    break;
                }
                case 24: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ExtraFunctions.randomBlock()));
                    break;
                }
                case 25: {
                    ExtraFunctions.slimeFort(worldIn, (EntityPlayer) entityIn);
                    break;
                }
                case 26: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_axe));
                    break;
                }
                case 27: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_pickaxe));
                    break;
                }
                case 28: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Items.diamond_sword));
                    break;
                }
                case 29: {
                    ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.rainbowBlade, "Rainbow", Enchantment.sharpness, 10);
                    break;
                }
                case 30: {
                    ExtraFunctions.potionKit(worldIn, pos, rand);
                    break;
                }
                case 31: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytBoots));
                    break;
                }
                case 32: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.yt_Sword));
                    break;
                }
                case 33: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytChestplate));
                    break;
                }
                case 34: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytHelmet));
                    break;
                }
                case 35: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ytLeggings));
                    break;
                }
                case 36: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.ironButton));
                    break;
                }
                case 37: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.goldButton));
                    break;
                }
                case 38: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModBlocks.diamondButton));
                    break;
                }
                case 39: {
                    ExtraFunctions.summonMobsOnBreakBlock(new EntityWither(worldIn), 1, worldIn, pos);
                    break;
                }
                case 40: {
                    ExtraFunctions.luckyBlockBox(worldIn, pos, rand);
                    break;
                }
                case 41: {
                    ExtraFunctions.summonLuckyMobs(worldIn, 5, pos);
                    break;
                }
                case 42: {
                    ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(Blocks.wheat));
                    break;
                }
                case 43: {
                    ExtraFunctions.setOneBlock(worldIn, pos, Blocks.lit_pumpkin);
                    break;
                }
                case 44: {
                    ExtraFunctions.setOneBlock(worldIn, pos, Blocks.end_portal);
                    break;
                }
                case 45: {
                    ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ender_chest);
                    break;
                }
                case 46: {
                    ExtraFunctions.tpPlayerInGround((EntityPlayer) entityIn);
                    break;
                }
                case 47: {
                    ExtraFunctions.orcArmy(worldIn, pos, 25, rand);
                    break;
                }
                case 48: {
                    ExtraFunctions.redstoneKit(worldIn, pos);
                    break;
                }
                case 49: {
                    ExtraFunctions.summonMobsOnBreakBlock(new EntityGhast(worldIn), 25, worldIn, pos);
                    break;
                }
                case 50: {
                    ExtraFunctions.fireCamp(worldIn, (EntityPlayer) entityIn);
                    break;
                }
            }
        }

                super.onLanded(worldIn, entityIn);
    }


}
package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.entity.EntityDanTDM;
import thvardhan.ytluckyblocks.entity.EntityLittleRopo;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;
import thvardhan.ytluckyblocks.items.ModItems;

import java.util.Random;

public class LittleRopoLuckyBlock extends Block {


    public LittleRopoLuckyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }

    public LittleRopoLuckyBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 0, 10000);
    }

    public LittleRopoLuckyBlock(String unlocalizedName) {
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

            worldIn.spawnParticle(EnumParticleTypes.SPELL, d0, d1, d2, d3, d4, d5);
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

                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 1: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 2: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 2, 0, 0);
                break;
            }
            case 3: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.mic), 1, 0, 0);
                break;
            }
            case 4: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 5: {
                ExtraFunctions.hellWellStructure(worldIn, pos, rand);
                break;
            }
            case 6: {
                ExtraFunctions.foodKit(worldIn, pos);
                break;
            }
            case 7: {
                ExtraFunctions.lookUp(worldIn, player);
                break;
            }
            case 8: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 9: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ropoBoots));
                break;
            }
            case 10: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ropoLeggings));
                break;
            }
            case 11: {
                ExtraFunctions.orcArmy(worldIn, pos, 0, rand);
                break;
            }
            case 12: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), rand.nextInt(0) + 1, worldIn, pos);
                break;
            }
            case 13: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.ANVIL);
                ExtraFunctions.chat(ChatFormatting.DARK_BLUE + "You Should Be Happy It Dint Fell On Ya", player);
                break;
            }
            case 14: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 15: {
                //         ExtraFunctions.summonMobsOnBreakBlock(new EntityCaptainSparklez(worldIn), 10,worldIn,pos);
                break;
            }
            case 16: {
                ExtraFunctions.summonMobsOnBreakBlock(new EntityDanTDM(worldIn), 3, worldIn, pos);
                break;
            }
            case 17: {
                ExtraFunctions.summonItemWithLoop(worldIn, pos, Items.DIAMOND, 12, 0, 0);
                break;
            }
            case 18: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.devilSword), 1, 0, 0);
                break;
            }
            case 19: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.swordLogdotzip, ChatFormatting.RED + "LogDotZip's Best Sword", Enchantment.getEnchantmentByID(20), 7);
                break;
            }
            case 20: {
                ExtraFunctions.materialKit(worldIn, pos, rand);
                break;
            }
            case 21: {
                ExtraFunctions.setTntWithBlock(worldIn, pos, rand);
                break;
            }
            case 22: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
                ExtraFunctions.chat(ChatFormatting.GREEN + "Try To Use This :D", player);
                break;
            }
            case 23: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 5, worldIn, pos);
                break;
            }
            case 24: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ropoChestplate));
                break;
            }
            case 25: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.ropoHelmet));
                break;
            }
            case 26: {
                ExtraFunctions.endWellStruct(worldIn, pos, rand);
                break;
            }
            case 27: {
                ExtraFunctions.burgerStruct(worldIn, pos);
                break;
            }
            case 28: {
                ExtraFunctions.setOneBlock(worldIn, pos, Blocks.COMMAND_BLOCK);
                ExtraFunctions.chat(ChatFormatting.GOLD + "I Wonder If You Can Do Anything With This Command Block..", player);
                break;
            }
            case 29: {
                ExtraFunctions.toVoid(worldIn, pos);
                break;
            }
            case 30: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Blocks.MELON_BLOCK), 25, 0, 0);
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
                ExtraFunctions.summonMobsNearby(new EntityLittleRopo(worldIn), 25, worldIn, pos, rand);
                break;
            }
            case 37: {
                ExtraFunctions.summonMobsNearby(new EntityLittleRopo(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 38: {
                ExtraFunctions.summonMobsNearby(new EntityWither(worldIn), 5, worldIn, pos, rand);
                break;
            }
            case 39: {
                ExtraFunctions.summonMobsNearby(new EntityGuardian(worldIn), 15, worldIn, pos, rand);
                break;
            }
            case 40: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(Items.BAKED_POTATO), 1, 0, 0);
                ExtraFunctions.chat("Take this for your affords :D", player);
                break;
            }
            case 41: {
                ExtraFunctions.summonItemStackWithLoop(worldIn, pos, new ItemStack(ModItems.levinSword), 1, 0, 0);
                break;
            }
            case 42: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.battleAxe));
                break;
            }
            case 43: {
                ExtraFunctions.summonEnchantedItemAsDrop(worldIn, pos, ModItems.rainbowBlade, "RAINBOW", Enchantment.getEnchantmentByID(16), 6);
                break;
            }
            case 44: {
                ExtraFunctions.tpPlayerInGround(player);
                break;
            }
            case 45: {
                ExtraFunctions.tntRain(worldIn, pos, 50, 0, player);
                break;
            }
            case 46: {
                EntityRabbit rab = new EntityRabbit(worldIn);
                rab.setRabbitType(99);
                ExtraFunctions.summonMobsOnBreakBlock(rab, 40, worldIn, pos);
                break;
            }
            case 47: {
                ExtraFunctions.summonItemAsDrop(pos, worldIn, new ItemStack(ModItems.snowSword));
                break;
            }
            case 48: {
                Enchantment[] a = {Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(18), Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(19), Enchantment.getEnchantmentByID(48), Enchantment.getEnchantmentByID(21), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(16)};
                ExtraFunctions.addEnchantsMany(new ItemStack(Items.DIAMOND_AXE), a, 3, worldIn, pos);

                break;
            }
            case 49: {
                Enchantment[] a = {Enchantment.getEnchantmentByID(6), Enchantment.getEnchantmentByID(18), Enchantment.getEnchantmentByID(3), Enchantment.getEnchantmentByID(48), Enchantment.getEnchantmentByID(21), Enchantment.getEnchantmentByID(20), Enchantment.getEnchantmentByID(16), Enchantment.getEnchantmentByID(32), Enchantment.getEnchantmentByID(2)};
                ItemStack[] stack = {new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.DIAMOND_HOE), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_SHOVEL)};
                ExtraFunctions.addRandomEnchtToRandomItems(worldIn, stack, a, 8, pos, rand);
                break;
            }
            case 50: {
                ExtraFunctions.tpPlayer(player);
                break;
            }


        }//switch ends
    }//method end


}

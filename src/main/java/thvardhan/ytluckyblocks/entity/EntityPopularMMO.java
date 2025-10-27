package thvardhan.ytluckyblocks.entity;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

public class EntityPopularMMO extends CreatureEntity {

    private String name = "FuriousDestroyer";

    public EntityPopularMMO(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
        ((PathNavigator) this.getNavigator()).setCanSwim(true);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(5, new MoveTowardsRestrictionGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new RandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
        this.applyEntityAI();
        this.setCustomName(new StringTextComponent(name));
        ItemStack stackHold = new ItemStack(Items.IRON_SWORD);
        stackHold.addEnchantment(Enchantment.getEnchantmentByID(17), 5);
        this.setItemStackToSlot(EquipmentSlotType.MAINHAND, stackHold);
    }

    protected void applyEntityAI() {
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        // this.goalSelector.addGoal(6, new MoveThroughVillageGoal(this, 1.0D, false, 10, this::isBreakDoorsTaskSet));
        this.goalSelector.addGoal(1, new HurtByTargetGoal(this, ZombifiedPiglinEntity.class));
        this.goalSelector.addGoal(2, new NearestAttackableTargetGoal(this, PlayerEntity.class, true));
        this.goalSelector.addGoal(3, new NearestAttackableTargetGoal(this, VillagerEntity.class, false));
        this.goalSelector.addGoal(3, new NearestAttackableTargetGoal(this, IronGolemEntity.class, true));
    }
    public static AttributeModifierMap.MutableAttribute getAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 80D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 10.0D)
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 5D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 30D);
    }
        @Override
        public ILivingEntityData onInitialSpawn(IServerWorld inWorld, DifficultyInstance difficulty, SpawnReason reason, ILivingEntityData livingdata, CompoundNBT dataTag) {
            return super.onInitialSpawn(inWorld, difficulty, reason, livingdata, dataTag);
        }

        @Override
        public boolean getAlwaysRenderNameTagForRender() {
            return true;
        }

    @Override
    public void swingArm(Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            this.playSound(SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, 1.0F, 1.0F);
            this.world.setEntityState(this, (byte) 0);
        }
    }
    }

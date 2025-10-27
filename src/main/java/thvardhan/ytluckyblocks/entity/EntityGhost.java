package thvardhan.ytluckyblocks.entity;

import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

public class EntityGhost extends CreatureEntity {

    private String name = "Ghost";

    public EntityGhost(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
        ((PathNavigator) this.getNavigator()).setCanSwim(true);
        this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Blocks.CARVED_PUMPKIN));
        this.setCustomName(new StringTextComponent(name));
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        // Movement / behavior goals
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(5, new MoveTowardsRestrictionGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new RandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(9, new LookRandomlyGoal(this));

        // Target goals — these belong in targetSelector, not goalSelector
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, VillagerEntity.class, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
    }

    public static AttributeModifierMap.MutableAttribute getAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.4D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 10.0D)
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 2D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 20D);

    }
    @Override
    public ILivingEntityData onInitialSpawn(IServerWorld inWorld, DifficultyInstance difficulty, SpawnReason reason, ILivingEntityData livingdata, CompoundNBT dataTag) {
        return super.onInitialSpawn(inWorld, difficulty, reason, livingdata, dataTag);
    }

    @Override
    public void livingTick() {
        super.livingTick();

        if (this.world.isRemote) {
            if (rand.nextBoolean() && rand.nextBoolean()) {
                for (int i = 0; i < 2; ++i) {
                    double d0 = this.getPosX() + (this.rand.nextDouble() - 0.5D) * (double) this.getWidth();
                    double d1 = this.getPosY() + this.rand.nextDouble() * (double) this.getHeight() - 0.25D;
                    double d2 = this.getPosZ() + (this.rand.nextDouble() - 0.5D) * (double) this.getWidth();
                    double d3 = (this.rand.nextDouble() - 0.5D) * 2.0D;
                    double d4 = -this.rand.nextDouble();
                    double d5 = (this.rand.nextDouble() - 0.5D) * 2.0D;

                    this.world.addParticle(ParticleTypes.DRIPPING_LAVA, d0, d1, d2, d3, d4, d5);
                }
            }
        }
    }

    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);
        if (!this.world.isRemote) { // Ensure this is on the server side
            this.entityDropItem(Items.PUMPKIN_SEEDS);
        }
    }
    @Override
    public boolean getAlwaysRenderNameTagForRender() {
        return true;
    }
}
package thvardhan.ytluckyblocks.entity;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.MoveTowardsRestrictionGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraft.world.IServerWorld;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import thvardhan.ytluckyblocks.Main;
import net.minecraft.block.Blocks;

import net.minecraft.particles.ParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityGhost extends MonsterEntity {

    public static EntityType<EntityGhost> TYPE;

    boolean alwaysRenderNameTag = true;
    private final String displayName = "Ghost";

    public EntityGhost(EntityType<? extends EntityGhost> type, World worldIn) {
        super(type, worldIn);
        if (this.getNavigation() instanceof GroundPathNavigator) {
            ((GroundPathNavigator) this.getNavigation()).setCanOpenDoors(true);
        }
        this.setCustomNameVisible(alwaysRenderNameTag);
        this.setCustomName(new StringTextComponent(displayName));
        this.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Blocks.PUMPKIN.asItem()));
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                .add(Attributes.ATTACK_DAMAGE, 10.0D)
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 2.0D);
    }

    @SubscribeEvent
    public static void registerType(net.minecraftforge.event.RegistryEvent.Register<EntityType<?>> event) {
        TYPE = EntityType.Builder.of(EntityGhost::new, EntityClassification.MONSTER)
                .sized(0.8F, 2.0F)
                .clientTrackingRange(80)
                .updateInterval(3)
                .build(new ResourceLocation(Main.MODID, "ghost").toString());
        TYPE.setRegistryName(new ResourceLocation(Main.MODID, "ghost"));
        event.getRegistry().register(TYPE);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(TYPE, createAttributes().build());
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(5, new MoveTowardsRestrictionGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D, 0.0F));
        this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, ZombifiedPiglinEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, VillagerEntity.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
    }

    @Override
    public ILivingEntityData finalizeSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable net.minecraft.nbt.CompoundNBT dataTag) {
        return spawnDataIn;
    }
    @Override
    public void setCustomNameVisible(boolean alwaysVisible) {
        super.setCustomNameVisible(alwaysRenderNameTag);
    }
    @Override
    public void tick() {
        super.tick();
        if (this.level.isClientSide) {
            if (this.random.nextBoolean() && this.random.nextBoolean()) {
                for (int i = 0; i < 2; ++i) {
                    this.level.addParticle(ParticleTypes.DRIPPING_LAVA,
                            this.getX() + (this.random.nextDouble() - 0.5D) * (double) this.getBbWidth(),
                            this.getY() + this.random.nextDouble() * (double) this.getBbHeight() - 0.25D,
                            this.getZ() + (this.random.nextDouble() - 0.5D) * (double) this.getBbWidth(),
                            (this.random.nextDouble() - 0.5D) * 2.0D,
                            -this.random.nextDouble(),
                            (this.random.nextDouble() - 0.5D) * 2.0D);
                }
            }
        }
    }
    @Override
    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHit) {
        super.dropCustomDeathLoot(source, looting, recentlyHit);
        int i = this.random.nextInt(3);
        if (looting > 0) {
            i += this.random.nextInt(looting + 1);
        }
        if (i > 0) {
            this.spawnAtLocation(new ItemStack(Items.PUMPKIN_SEEDS, i));
        }
    }
}
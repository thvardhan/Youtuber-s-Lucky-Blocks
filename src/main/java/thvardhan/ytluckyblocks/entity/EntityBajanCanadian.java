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
import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityBajanCanadian extends MonsterEntity {

    public static EntityType<EntityBajanCanadian> TYPE;

    boolean alwaysRenderNameTag = true;
    private final String displayName = "BajanCanadian";

    public EntityBajanCanadian(EntityType<? extends EntityBajanCanadian> type, World worldIn) {
        super(type, worldIn);
        if (this.getNavigation() instanceof GroundPathNavigator) {
            ((GroundPathNavigator) this.getNavigation()).setCanOpenDoors(true);
        }
        this.setCustomNameVisible(alwaysRenderNameTag);
        this.setCustomName(new StringTextComponent(displayName));
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_DAMAGE, 5.0D)
                .add(Attributes.MAX_HEALTH, 40.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.1D);
    }

    @SubscribeEvent
    public static void registerType(net.minecraftforge.event.RegistryEvent.Register<EntityType<?>> event) {
        TYPE = EntityType.Builder.of(EntityBajanCanadian::new, EntityClassification.MONSTER)
                .sized(0.6F, 2.0F)
                .clientTrackingRange(80)
                .updateInterval(3)
                .build(new ResourceLocation(Main.MODID, "bajan_canadian").toString());
        TYPE.setRegistryName(new ResourceLocation(Main.MODID, "bajan_canadian"));
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
        super.setCustomNameVisible(true);
    }
}
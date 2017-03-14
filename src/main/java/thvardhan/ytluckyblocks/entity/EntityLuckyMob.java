package thvardhan.ytluckyblocks.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;

public class EntityLuckyMob extends EntityMob {

    boolean alwaysRenderNameTag = true;
    private String name = "Lucky Monster";

    public EntityLuckyMob(World worldIn) {
        super(worldIn);
        ((PathNavigateGround) this.getNavigator()).setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
         this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
        this.setSize(0.6F, 2.0F);

        this.setAlwaysRenderNameTag(alwaysRenderNameTag);
        this.setCustomNameTag(name);

    }

    protected void applyEntityAI() {
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityPigZombie.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(80.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty,
                                            IEntityLivingData livingdata) {


        return livingdata;
    }

    @Override
    protected void setSize(float width, float height) {
        super.setSize(width, height);
    }


    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
    }


    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        return super.attackEntityAsMob(entityIn);
    }


    @Override
    protected boolean isValidLightLevel() {
        return super.isValidLightLevel();
    }

    @Override
    public boolean getCanSpawnHere() {
        return super.getCanSpawnHere();
    }


    @Override
    public void setAlwaysRenderNameTag(boolean alwaysRenderNameTag) {
        super.setAlwaysRenderNameTag(alwaysRenderNameTag);
    }


    @Override
    protected Item getDropItem() {

        return ExtraFunctions.randomBlock();
    }


}
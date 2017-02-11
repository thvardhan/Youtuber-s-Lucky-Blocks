package com.thvardhan.ytstuff.entity;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityGhost extends EntityMob {
	
	private String name="Ghost";
	boolean alwaysRenderNameTag=true;
	
	public EntityGhost(World worldIn) {
		super(worldIn);
		((PathNavigateGround)this.getNavigator()).setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
        this.setSize(0.8F, 2.0F);
        this.setCurrentItemOrArmor(0, new ItemStack(Blocks.pumpkin));
        
		this.setAlwaysRenderNameTag(alwaysRenderNameTag);
		 this.setCustomNameTag(name);	
      
	}
	
	 protected void applyEntityAI()
	    {
	        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
	        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityIronGolem.class, 1.0D, true));
	        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityPigZombie.class}));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
	    }

	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10D);
	        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(2D);
	    }
	 
	 @Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty,
			IEntityLivingData livingdata) {
	
 
	
		  
		return livingdata;
	}
	 
	 
	 
	  public void onLivingUpdate()
	    {
		  if (this.worldObj.isRemote)
	        {
	           if(rand.nextBoolean() && rand.nextBoolean()){
	        	   for (int i = 0; i < 2; ++i)
	               {
	                   this.worldObj.spawnParticle(EnumParticleTypes.DRIP_LAVA, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D, new int[0]);
	               }}
	        }
		  
		  
	      

	        super.onLivingUpdate();
	    }

	 
	 
	 
	 @Override
	protected Item getDropItem() {
		 
		return  Items.pumpkin_seeds;
		//return super.getDropItem();
	}
	 
	 
	 @Override
	protected void setSize(float width, float height) {
		super.setSize(width, height);
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
	public float getBlockPathWeight(BlockPos pos) {
		return super.getBlockPathWeight(pos);
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
	public void onDeath(DamageSource cause) {
		
		
		super.onDeath(cause);
	}
	
	@Override
	public void setAlwaysRenderNameTag(boolean alwaysRenderNameTag) {
		super.setAlwaysRenderNameTag(alwaysRenderNameTag);
	}
	
	
	
	
}
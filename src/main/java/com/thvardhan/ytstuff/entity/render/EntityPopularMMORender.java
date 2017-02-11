package com.thvardhan.ytstuff.entity.render;

import org.lwjgl.opengl.GL11;

import com.thvardhan.ytstuff.Main;
import com.thvardhan.ytstuff.entity.EntityPopularMMO;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class EntityPopularMMORender extends RenderBiped {

	protected ResourceLocation Popularmmo;
	
	public EntityPopularMMORender(ModelBiped par1ModelBase, float parShadowSize)
    {
		
        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, parShadowSize);
        
        setEntityTexture();        
    }
 
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        preRenderCallbackPopularMMO((EntityPopularMMO) entity, f);

    }
  
    protected void preRenderCallbackPopularMMO(EntityPopularMMO entity, float f)

    {
    	
        // some people do some G11 transformations or blends here, like you can do
    	
        GL11.glScalef(3F, 3F, 3F);

        // which is used for Slime entities.  I suggest having the entity cast to

        // your custom type to make it easier to access fields from your 

        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor, 

        // entity.scaleFactor); 

    }

    protected void setEntityTexture()
    {
       Popularmmo = new ResourceLocation(Main.MODID+":textures/entity/popularmmo.png");

    }


    /**
    * Returns the location of an entity's texture. Doesn't seem to be called 
    * unless you call Render.bindEntityTexture.
    */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return Popularmmo;

    }
    
    
	

    
	
	
}

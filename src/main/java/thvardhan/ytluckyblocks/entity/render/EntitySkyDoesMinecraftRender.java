package thvardhan.ytluckyblocks.entity.render;

import thvardhan.ytluckyblocks.Main;
import thvardhan.ytluckyblocks.entity.EntitySkyDoesMinecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class EntitySkyDoesMinecraftRender extends RenderBiped {
	
	protected ResourceLocation sky;
	
	public EntitySkyDoesMinecraftRender(ModelBiped par1ModelBase, float parShadowSize)
    {
		
        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, parShadowSize);
        
        setEntityTexture();        
    }
 
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        preRenderCallbackSky((EntitySkyDoesMinecraft) entity, f);

    }
  
    protected void preRenderCallbackSky(EntitySkyDoesMinecraft entity, float f)

    {
    	
        // some people do some G11 transformations or blends here, like you can do
    	
       // GL11.glScalef(0.5F, 0.5F, 0.5F);

        // which is used for Slime entities.  I suggest having the entity cast to

        // your custom type to make it easier to access fields from your 

        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor, 

        // entity.scaleFactor); 

    }

    protected void setEntityTexture()
    {
        sky = new ResourceLocation(Main.MODID+":textures/entity/sky_skin.png");

    }


    /**
    * Returns the location of an entity's texture. Doesn't seem to be called 
    * unless you call Render.bindEntityTexture.
    */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return sky;

    }
    
    
	

    
    
}

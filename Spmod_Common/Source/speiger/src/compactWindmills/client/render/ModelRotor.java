package speiger.src.compactWindmills.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import speiger.src.api.common.world.items.IRotorItem.IRotorModel;

public class ModelRotor extends ModelBase implements IRotorModel
{
	ModelRenderer arm1;
	ModelRenderer arm2;
	ModelRenderer arm3;
	ModelRenderer arm4;
	ModelRenderer arm5;
	ModelRenderer arm6;
	ModelRenderer arm7;
	ModelRenderer arm8;
	int size;
	
	public ModelRotor()
	{
		int radius = 12;
		textureWidth = 32;
		textureHeight = 256;
		size = radius;
		
		arm1 = new ModelRenderer(this, 0, 0);
		arm1.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm1.setRotationPoint(-8F, 0F, 0F);
		arm1.setTextureSize(32, 256);
		arm1.mirror = true;
		setRotation(arm1, 0F, -0.3926991F, 0F);
		arm2 = new ModelRenderer(this, 0, 0);
		arm2.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm2.setRotationPoint(-8F, 0F, 0F);
		arm2.setTextureSize(32, 256);
		arm2.mirror = true;
		setRotation(arm2, 1.570796F, 0F, -0.3926991F);
		arm3 = new ModelRenderer(this, 0, 0);
		arm3.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm3.setRotationPoint(-8F, 0F, 0F);
		arm3.setTextureSize(32, 256);
		arm3.mirror = true;
		setRotation(arm3, -1.570796F, 0F, 0.3926991F);
		arm4 = new ModelRenderer(this, 0, 0);
		arm4.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm4.setRotationPoint(-8F, 0F, 0F);
		arm4.setTextureSize(32, 256);
		arm4.mirror = true;
		setRotation(arm4, 3.141593F, 0.3926991F, 0F);
		arm5 = new ModelRenderer(this, 0, 0);
		arm5.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm5.setRotationPoint(-8F, 0F, 0F);
		arm5.setTextureSize(32, 256);
		arm5.mirror = true;
		setRotation(arm5, 0.7853982F, -0.3926991F, -0.3926991F);
		arm6 = new ModelRenderer(this, 0, 0);
		arm6.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm6.setRotationPoint(-8F, 0F, 0F);
		arm6.setTextureSize(32, 256);
		arm6.mirror = true;
		setRotation(arm6, 2.356194F, 0.3926991F, -0.3926991F);
		arm7 = new ModelRenderer(this, 0, 0);
		arm7.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm7.setRotationPoint(-8F, 0F, 0F);
		arm7.setTextureSize(32, 256);
		arm7.mirror = true;
		setRotation(arm7, 3.926991F, 0.3926991F, 0.3926991F);
		arm8 = new ModelRenderer(this, 0, 0);
		arm8.addBox(0F, 0F, -4F, 1, radius * 8, 8);
		arm8.setRotationPoint(-8F, 0F, 0F);
		arm8.setTextureSize(32, 256);
		arm8.mirror = true;
		setRotation(arm8, 5.497787F, -0.3926991F, 0.3926991F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		arm1.render(f5);
		arm2.render(f5);
		arm3.render(f5);
		arm4.render(f5);
		arm5.render(f5);
		arm6.render(f5);
		arm7.render(f5);
		arm8.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void render(float f5)
	{
		arm1.render(f5);
		arm2.render(f5);
		arm3.render(f5);
		arm4.render(f5);
		arm5.render(f5);
		arm6.render(f5);
		arm7.render(f5);
		arm8.render(f5);
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}
	
}

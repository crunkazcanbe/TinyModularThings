package speiger.src.tinymodularthings.client.models.storage;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAdvTinyChest extends ModelBase
{
	// fields
	ModelRenderer Cube_Top_Front;
	ModelRenderer Cube_Top_Right;
	ModelRenderer Cube_Top_Left;
	ModelRenderer Cube_Top_Back;
	ModelRenderer Cube_Front_Bottom;
	ModelRenderer Cube_Front_Right;
	ModelRenderer Cube_Front_Left;
	ModelRenderer Cube_Front_Top;
	ModelRenderer Cube_Right_Bottom;
	ModelRenderer Cube_Right_Right;
	ModelRenderer Cube_Right_Left;
	ModelRenderer Cube_Right_Top;
	ModelRenderer Cube_Back_Bottom;
	ModelRenderer Cube_Back_Right;
	ModelRenderer Cube_Back_Left;
	ModelRenderer Cube_Back_Top;
	ModelRenderer Cube_Left_Bottom;
	ModelRenderer Cube_Left_Right;
	ModelRenderer Cube_Left_Left;
	ModelRenderer Cube_Left_Top;
	ModelRenderer Cube_Bottom_Front;
	ModelRenderer Cube_Bottom_Right;
	ModelRenderer Cube_Bottom_Left;
	ModelRenderer Cube_Bottom_Back;
	ModelRenderer Tiny_Chest;
	ModelRenderer Button;
	ModelRenderer BlockedFront;
	ModelRenderer BlockedBottom;
	ModelRenderer BlockedLeft;
	ModelRenderer BlockedBack;
	ModelRenderer BlockedTop;
	ModelRenderer BlockedRight;
	
	public ModelAdvTinyChest()
	{
		textureWidth = 128;
		textureHeight = 128;
		
		Cube_Top_Front = new ModelRenderer(this, 78, 0);
		Cube_Top_Front.addBox(0F, 0F, 0F, 12, 2, 2);
		Cube_Top_Front.setRotationPoint(-6F, 8F, -6F);
		Cube_Top_Front.setTextureSize(64, 32);
		Cube_Top_Front.mirror = true;
		setRotation(Cube_Top_Front, 0F, 0F, 0F);
		Cube_Top_Right = new ModelRenderer(this, 107, 0);
		Cube_Top_Right.addBox(0F, 0F, 0F, 2, 2, 8);
		Cube_Top_Right.setRotationPoint(-6F, 8F, -4F);
		Cube_Top_Right.setTextureSize(64, 32);
		Cube_Top_Right.mirror = true;
		setRotation(Cube_Top_Right, 0F, 0F, 0F);
		Cube_Top_Left = new ModelRenderer(this, 107, 12);
		Cube_Top_Left.addBox(0F, 0F, 0F, 2, 2, 8);
		Cube_Top_Left.setRotationPoint(4F, 8F, -4F);
		Cube_Top_Left.setTextureSize(64, 32);
		Cube_Top_Left.mirror = true;
		setRotation(Cube_Top_Left, 0F, 0F, 0F);
		Cube_Top_Back = new ModelRenderer(this, 78, 6);
		Cube_Top_Back.addBox(0F, 0F, 0F, 12, 2, 2);
		Cube_Top_Back.setRotationPoint(-6F, 8F, 4F);
		Cube_Top_Back.setTextureSize(64, 32);
		Cube_Top_Back.mirror = true;
		setRotation(Cube_Top_Back, 0F, 0F, 0F);
		Cube_Front_Bottom = new ModelRenderer(this, 91, 30);
		Cube_Front_Bottom.addBox(0F, 0F, 0F, 16, 4, 2);
		Cube_Front_Bottom.setRotationPoint(-8F, 20F, -8F);
		Cube_Front_Bottom.setTextureSize(64, 32);
		Cube_Front_Bottom.mirror = true;
		setRotation(Cube_Front_Bottom, 0F, 0F, 0F);
		Cube_Front_Right = new ModelRenderer(this, 78, 30);
		Cube_Front_Right.addBox(0F, 0F, 0F, 4, 8, 2);
		Cube_Front_Right.setRotationPoint(-8F, 12F, -8F);
		Cube_Front_Right.setTextureSize(64, 32);
		Cube_Front_Right.mirror = true;
		setRotation(Cube_Front_Right, 0F, 0F, 0F);
		Cube_Front_Left = new ModelRenderer(this, 78, 42);
		Cube_Front_Left.addBox(0F, 0F, 0F, 4, 8, 2);
		Cube_Front_Left.setRotationPoint(4F, 12F, -8F);
		Cube_Front_Left.setTextureSize(64, 32);
		Cube_Front_Left.mirror = true;
		setRotation(Cube_Front_Left, 0F, 0F, 0F);
		Cube_Front_Top = new ModelRenderer(this, 91, 38);
		Cube_Front_Top.addBox(0F, 0F, 0F, 16, 4, 2);
		Cube_Front_Top.setRotationPoint(-8F, 8F, -8F);
		Cube_Front_Top.setTextureSize(64, 32);
		Cube_Front_Top.mirror = true;
		setRotation(Cube_Front_Top, 0F, 0F, 0F);
		Cube_Right_Bottom = new ModelRenderer(this, 99, 58);
		Cube_Right_Bottom.addBox(0F, 0F, 0F, 2, 4, 12);
		Cube_Right_Bottom.setRotationPoint(-8F, 20F, -6F);
		Cube_Right_Bottom.setTextureSize(64, 32);
		Cube_Right_Bottom.mirror = true;
		setRotation(Cube_Right_Bottom, 0F, 0F, 0F);
		Cube_Right_Right = new ModelRenderer(this, 90, 58);
		Cube_Right_Right.addBox(0F, 0F, 0F, 2, 8, 2);
		Cube_Right_Right.setRotationPoint(-8F, 12F, 4F);
		Cube_Right_Right.setTextureSize(64, 32);
		Cube_Right_Right.mirror = true;
		setRotation(Cube_Right_Right, 0F, 0F, 0F);
		Cube_Right_Left = new ModelRenderer(this, 90, 70);
		Cube_Right_Left.addBox(0F, 0F, 0F, 2, 8, 2);
		Cube_Right_Left.setRotationPoint(-8F, 12F, -6F);
		Cube_Right_Left.setTextureSize(64, 32);
		Cube_Right_Left.mirror = true;
		setRotation(Cube_Right_Left, 0F, 0F, 0F);
		Cube_Right_Top = new ModelRenderer(this, 99, 76);
		Cube_Right_Top.addBox(0F, 0F, 0F, 2, 4, 12);
		Cube_Right_Top.setRotationPoint(-8F, 8F, -6F);
		Cube_Right_Top.setTextureSize(64, 32);
		Cube_Right_Top.mirror = true;
		setRotation(Cube_Right_Top, 0F, 0F, 0F);
		Cube_Back_Bottom = new ModelRenderer(this, 91, 97);
		Cube_Back_Bottom.addBox(0F, 0F, 0F, 16, 4, 2);
		Cube_Back_Bottom.setRotationPoint(-8F, 20F, 6F);
		Cube_Back_Bottom.setTextureSize(64, 32);
		Cube_Back_Bottom.mirror = true;
		setRotation(Cube_Back_Bottom, 0F, 0F, 0F);
		Cube_Back_Right = new ModelRenderer(this, 78, 97);
		Cube_Back_Right.addBox(0F, 0F, 0F, 4, 8, 2);
		Cube_Back_Right.setRotationPoint(-8F, 12F, 6F);
		Cube_Back_Right.setTextureSize(64, 32);
		Cube_Back_Right.mirror = true;
		setRotation(Cube_Back_Right, 0F, 0F, 0F);
		Cube_Back_Left = new ModelRenderer(this, 78, 109);
		Cube_Back_Left.addBox(0F, 0F, 0F, 4, 8, 2);
		Cube_Back_Left.setRotationPoint(4F, 12F, 6F);
		Cube_Back_Left.setTextureSize(64, 32);
		Cube_Back_Left.mirror = true;
		setRotation(Cube_Back_Left, 0F, 0F, 0F);
		Cube_Back_Top = new ModelRenderer(this, 91, 105);
		Cube_Back_Top.addBox(0F, 0F, 0F, 16, 4, 2);
		Cube_Back_Top.setRotationPoint(-8F, 8F, 6F);
		Cube_Back_Top.setTextureSize(64, 32);
		Cube_Back_Top.mirror = true;
		setRotation(Cube_Back_Top, 0F, 0F, 0F);
		Cube_Left_Bottom = new ModelRenderer(this, 46, 0);
		Cube_Left_Bottom.addBox(0F, 0F, 0F, 2, 4, 12);
		Cube_Left_Bottom.setRotationPoint(6F, 20F, -6F);
		Cube_Left_Bottom.setTextureSize(64, 32);
		Cube_Left_Bottom.mirror = true;
		setRotation(Cube_Left_Bottom, 0F, 0F, 0F);
		Cube_Left_Right = new ModelRenderer(this, 37, 0);
		Cube_Left_Right.addBox(0F, 0F, 0F, 2, 8, 2);
		Cube_Left_Right.setRotationPoint(6F, 12F, 4F);
		Cube_Left_Right.setTextureSize(64, 32);
		Cube_Left_Right.mirror = true;
		setRotation(Cube_Left_Right, 0F, 0F, 0F);
		Cube_Left_Left = new ModelRenderer(this, 37, 12);
		Cube_Left_Left.addBox(0F, 0F, 0F, 2, 8, 2);
		Cube_Left_Left.setRotationPoint(6F, 12F, -6F);
		Cube_Left_Left.setTextureSize(64, 32);
		Cube_Left_Left.mirror = true;
		setRotation(Cube_Left_Left, 0F, 0F, 0F);
		Cube_Left_Top = new ModelRenderer(this, 46, 18);
		Cube_Left_Top.addBox(0F, 0F, 0F, 2, 4, 12);
		Cube_Left_Top.setRotationPoint(6F, 8F, -6F);
		Cube_Left_Top.setTextureSize(64, 32);
		Cube_Left_Top.mirror = true;
		setRotation(Cube_Left_Top, 0F, 0F, 0F);
		Cube_Bottom_Front = new ModelRenderer(this, 46, 42);
		Cube_Bottom_Front.addBox(0F, 0F, 0F, 12, 2, 2);
		Cube_Bottom_Front.setRotationPoint(-6F, 22F, -6F);
		Cube_Bottom_Front.setTextureSize(64, 32);
		Cube_Bottom_Front.mirror = true;
		setRotation(Cube_Bottom_Front, 0F, 0F, 0F);
		Cube_Bottom_Right = new ModelRenderer(this, 25, 42);
		Cube_Bottom_Right.addBox(0F, 0F, 0F, 2, 2, 8);
		Cube_Bottom_Right.setRotationPoint(-6F, 22F, -4F);
		Cube_Bottom_Right.setTextureSize(64, 32);
		Cube_Bottom_Right.mirror = true;
		setRotation(Cube_Bottom_Right, 0F, 0F, 0F);
		Cube_Bottom_Left = new ModelRenderer(this, 25, 54);
		Cube_Bottom_Left.addBox(0F, 0F, 0F, 2, 2, 8);
		Cube_Bottom_Left.setRotationPoint(4F, 22F, -4F);
		Cube_Bottom_Left.setTextureSize(64, 32);
		Cube_Bottom_Left.mirror = true;
		setRotation(Cube_Bottom_Left, 0F, 0F, 0F);
		Cube_Bottom_Back = new ModelRenderer(this, 46, 48);
		Cube_Bottom_Back.addBox(0F, 0F, 0F, 12, 2, 2);
		Cube_Bottom_Back.setRotationPoint(-6F, 22F, 4F);
		Cube_Bottom_Back.setTextureSize(64, 32);
		Cube_Bottom_Back.mirror = true;
		setRotation(Cube_Bottom_Back, 0F, 0F, 0F);
		Tiny_Chest = new ModelRenderer(this, 58, 71);
		Tiny_Chest.addBox(0F, 0F, 0F, 4, 4, 4);
		Tiny_Chest.setRotationPoint(-2F, 14F, -2F);
		Tiny_Chest.setTextureSize(64, 32);
		Tiny_Chest.mirror = true;
		setRotation(Tiny_Chest, 0F, 0F, 0F);
		Button = new ModelRenderer(this, 80, 69);
		Button.addBox(0F, 0F, 0F, 1, 1, 1);
		Button.setRotationPoint(-0.5F, 15F, -2.5F);
		Button.setTextureSize(64, 32);
		Button.mirror = true;
		setRotation(Button, 0F, 0F, 0F);
		BlockedFront = new ModelRenderer(this, 0, 119);
		BlockedFront.addBox(0F, 0F, 0F, 8, 8, 1);
		BlockedFront.setRotationPoint(-4F, 12F, -8F);
		BlockedFront.setTextureSize(128, 128);
		BlockedFront.mirror = true;
		setRotation(BlockedFront, 0F, 0F, 0F);
		BlockedBottom = new ModelRenderer(this, 0, 108);
		BlockedBottom.addBox(0F, 0F, 0F, 8, 1, 8);
		BlockedBottom.setRotationPoint(-4F, 23F, -4F);
		BlockedBottom.setTextureSize(128, 128);
		BlockedBottom.mirror = true;
		setRotation(BlockedBottom, 0F, 0F, 0F);
		BlockedLeft = new ModelRenderer(this, 0, 90);
		BlockedLeft.addBox(0F, 0F, 0F, 1, 8, 8);
		BlockedLeft.setRotationPoint(-8F, 12F, -4F);
		BlockedLeft.setTextureSize(128, 128);
		BlockedLeft.mirror = true;
		setRotation(BlockedLeft, 0F, 0F, 0F);
		BlockedBack = new ModelRenderer(this, 0, 79);
		BlockedBack.addBox(0F, 0F, 0F, 8, 8, 1);
		BlockedBack.setRotationPoint(-4F, 12F, 7F);
		BlockedBack.setTextureSize(128, 128);
		BlockedBack.mirror = true;
		setRotation(BlockedBack, 0F, 0F, 0F);
		BlockedTop = new ModelRenderer(this, 0, 68);
		BlockedTop.addBox(0F, 0F, 0F, 8, 1, 8);
		BlockedTop.setRotationPoint(-4F, 8F, -4F);
		BlockedTop.setTextureSize(128, 128);
		BlockedTop.mirror = true;
		setRotation(BlockedTop, 0F, 0F, 0F);
		BlockedRight = new ModelRenderer(this, 0, 50);
		BlockedRight.addBox(0F, 0F, 0F, 1, 8, 8);
		BlockedRight.setRotationPoint(7F, 12F, -4F);
		BlockedRight.setTextureSize(128, 128);
		BlockedRight.mirror = true;
		setRotation(BlockedRight, 0F, 0F, 0F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Cube_Top_Front.render(f5);
		Cube_Top_Right.render(f5);
		Cube_Top_Left.render(f5);
		Cube_Top_Back.render(f5);
		Cube_Front_Bottom.render(f5);
		Cube_Front_Right.render(f5);
		Cube_Front_Left.render(f5);
		Cube_Front_Top.render(f5);
		Cube_Right_Bottom.render(f5);
		Cube_Right_Right.render(f5);
		Cube_Right_Left.render(f5);
		Cube_Right_Top.render(f5);
		Cube_Back_Bottom.render(f5);
		Cube_Back_Right.render(f5);
		Cube_Back_Left.render(f5);
		Cube_Back_Top.render(f5);
		Cube_Left_Bottom.render(f5);
		Cube_Left_Right.render(f5);
		Cube_Left_Left.render(f5);
		Cube_Left_Top.render(f5);
		Cube_Bottom_Front.render(f5);
		Cube_Bottom_Right.render(f5);
		Cube_Bottom_Left.render(f5);
		Cube_Bottom_Back.render(f5);
		Tiny_Chest.render(f5);
		Button.render(f5);
		BlockedFront.render(f5);
		BlockedBottom.render(f5);
		BlockedLeft.render(f5);
		BlockedBack.render(f5);
		BlockedTop.render(f5);
		BlockedRight.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity f6)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, f6);
	}
	
	public void render(float f5)
	{
		Cube_Top_Front.render(f5);
		Cube_Top_Right.render(f5);
		Cube_Top_Left.render(f5);
		Cube_Top_Back.render(f5);
		Cube_Front_Bottom.render(f5);
		Cube_Front_Right.render(f5);
		Cube_Front_Left.render(f5);
		Cube_Front_Top.render(f5);
		Cube_Right_Bottom.render(f5);
		Cube_Right_Right.render(f5);
		Cube_Right_Left.render(f5);
		Cube_Right_Top.render(f5);
		Cube_Back_Bottom.render(f5);
		Cube_Back_Right.render(f5);
		Cube_Back_Left.render(f5);
		Cube_Back_Top.render(f5);
		Cube_Left_Bottom.render(f5);
		Cube_Left_Right.render(f5);
		Cube_Left_Left.render(f5);
		Cube_Left_Top.render(f5);
		Cube_Bottom_Front.render(f5);
		Cube_Bottom_Right.render(f5);
		Cube_Bottom_Left.render(f5);
		Cube_Bottom_Back.render(f5);
		Tiny_Chest.render(f5);
		Button.render(f5);
		BlockedFront.render(f5);
		BlockedBottom.render(f5);
		BlockedLeft.render(f5);
		BlockedBack.render(f5);
		BlockedTop.render(f5);
		BlockedRight.render(f5);
	}
}

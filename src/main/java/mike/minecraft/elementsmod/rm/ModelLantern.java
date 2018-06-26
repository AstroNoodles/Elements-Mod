package mike.minecraft.elementsmod.rm;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLantern extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer StickT;
    ModelRenderer TorchT;
    ModelRenderer RimShape1;
    ModelRenderer RimShape2;
    ModelRenderer Bar1;
    ModelRenderer Bar2;
    ModelRenderer RimShape3;
    ModelRenderer Bar3;
    ModelRenderer Bar4;
    ModelRenderer RimShape4;
    ModelRenderer RimShape5;
    ModelRenderer Bar5;
    ModelRenderer Bar6;
    ModelRenderer Bar7;
    ModelRenderer Bar8;
    ModelRenderer RimShape6;
    ModelRenderer RimShape7;
    ModelRenderer Bar9;
    ModelRenderer Bar10;
    ModelRenderer Bar11;
    ModelRenderer Bar12;
    ModelRenderer RimShape8;
    ModelRenderer Bar13;
    ModelRenderer Bar14;
    ModelRenderer Bar15;
    ModelRenderer Bar16;
    ModelRenderer Top;
    ModelRenderer TopDecor;
  
  public ModelLantern()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 11, 1, 12);
      Base.setRotationPoint(-5F, 23F, -6F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      StickT = new ModelRenderer(this, 0, 0);
      StickT.addBox(0F, 0F, 0F, 1, 3, 1);
      StickT.setRotationPoint(0F, 20F, 0F);
      StickT.setTextureSize(64, 32);
      StickT.mirror = true;
      setRotation(StickT, 0F, 0F, 0F);
      TorchT = new ModelRenderer(this, 0, 0);
      TorchT.addBox(0F, 0F, 0F, 1, 1, 1);
      TorchT.setRotationPoint(0F, 19F, 0F);
      TorchT.setTextureSize(64, 32);
      TorchT.mirror = true;
      setRotation(TorchT, 0F, 0F, 0F);
      RimShape1 = new ModelRenderer(this, 0, 0);
      RimShape1.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape1.setRotationPoint(-5F, 13F, -6F);
      RimShape1.setTextureSize(64, 32);
      RimShape1.mirror = true;
      setRotation(RimShape1, 0F, 0F, 0F);
      RimShape2 = new ModelRenderer(this, 0, 0);
      RimShape2.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape2.setRotationPoint(0F, 13F, -6F);
      RimShape2.setTextureSize(64, 32);
      RimShape2.mirror = true;
      setRotation(RimShape2, 0F, 0F, 0F);
      Bar1 = new ModelRenderer(this, 0, 0);
      Bar1.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar1.setRotationPoint(-5F, 14F, 0F);
      Bar1.setTextureSize(64, 32);
      Bar1.mirror = true;
      setRotation(Bar1, -1.570796F, 0F, 0F);
      Bar2 = new ModelRenderer(this, 0, 0);
      Bar2.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar2.setRotationPoint(0F, 18F, -5F);
      Bar2.setTextureSize(64, 32);
      Bar2.mirror = true;
      setRotation(Bar2, -1.570796F, 1.570796F, 0F);
      RimShape3 = new ModelRenderer(this, 0, 0);
      RimShape3.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape3.setRotationPoint(5F, 13F, -6F);
      RimShape3.setTextureSize(64, 32);
      RimShape3.mirror = true;
      setRotation(RimShape3, 0F, 0F, 0F);
      Bar3 = new ModelRenderer(this, 0, 0);
      Bar3.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar3.setRotationPoint(6F, 14F, -5F);
      Bar3.setTextureSize(64, 32);
      Bar3.mirror = true;
      setRotation(Bar3, -1.570796F, 1.570796F, 0F);
      Bar4 = new ModelRenderer(this, 0, 0);
      Bar4.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar4.setRotationPoint(6F, 18F, -5F);
      Bar4.setTextureSize(64, 32);
      Bar4.mirror = true;
      setRotation(Bar4, -1.570796F, 1.570796F, 0F);
      RimShape4 = new ModelRenderer(this, 0, 0);
      RimShape4.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape4.setRotationPoint(-5F, 13F, 5F);
      RimShape4.setTextureSize(64, 32);
      RimShape4.mirror = true;
      setRotation(RimShape4, 0F, 0F, 0F);
      RimShape5 = new ModelRenderer(this, 0, 0);
      RimShape5.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape5.setRotationPoint(-5F, 13F, 0F);
      RimShape5.setTextureSize(64, 32);
      RimShape5.mirror = true;
      setRotation(RimShape5, 0F, 0F, -0.0174533F);
      Bar5 = new ModelRenderer(this, 0, 0);
      Bar5.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar5.setRotationPoint(0F, 14F, -5F);
      Bar5.setTextureSize(64, 32);
      Bar5.mirror = true;
      setRotation(Bar5, -1.570796F, 1.570796F, 0F);
      Bar6 = new ModelRenderer(this, 0, 0);
      Bar6.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar6.setRotationPoint(-5F, 18F, 5F);
      Bar6.setTextureSize(64, 32);
      Bar6.mirror = true;
      setRotation(Bar6, -1.570796F, 0F, 0F);
      Bar7 = new ModelRenderer(this, 0, 0);
      Bar7.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar7.setRotationPoint(-5F, 14F, 5F);
      Bar7.setTextureSize(64, 32);
      Bar7.mirror = true;
      setRotation(Bar7, -1.570796F, 0F, 0F);
      Bar8 = new ModelRenderer(this, 0, 0);
      Bar8.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar8.setRotationPoint(-5F, 18F, 0F);
      Bar8.setTextureSize(64, 32);
      Bar8.mirror = true;
      setRotation(Bar8, -1.570796F, 0F, 0F);
      RimShape6 = new ModelRenderer(this, 0, 0);
      RimShape6.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape6.setRotationPoint(0F, 13F, 5F);
      RimShape6.setTextureSize(64, 32);
      RimShape6.mirror = true;
      setRotation(RimShape6, 0F, 0F, 0F);
      RimShape7 = new ModelRenderer(this, 0, 0);
      RimShape7.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape7.setRotationPoint(5F, 13F, 5F);
      RimShape7.setTextureSize(64, 32);
      RimShape7.mirror = true;
      setRotation(RimShape7, 0F, 0F, 0F);
      Bar9 = new ModelRenderer(this, 0, 0);
      Bar9.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar9.setRotationPoint(0F, 14F, 5F);
      Bar9.setTextureSize(64, 32);
      Bar9.mirror = true;
      setRotation(Bar9, 0F, 0F, 1.570796F);
      Bar10 = new ModelRenderer(this, 0, 0);
      Bar10.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar10.setRotationPoint(0F, 18F, 5F);
      Bar10.setTextureSize(64, 32);
      Bar10.mirror = true;
      setRotation(Bar10, 0F, 0F, 1.570796F);
      Bar11 = new ModelRenderer(this, 0, 0);
      Bar11.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar11.setRotationPoint(5F, 14F, 5F);
      Bar11.setTextureSize(64, 32);
      Bar11.mirror = true;
      setRotation(Bar11, 0F, 0F, 1.570796F);
      Bar12 = new ModelRenderer(this, 0, 0);
      Bar12.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar12.setRotationPoint(5F, 18F, 5F);
      Bar12.setTextureSize(64, 32);
      Bar12.mirror = true;
      setRotation(Bar12, 0F, 0F, 1.570796F);
      RimShape8 = new ModelRenderer(this, 0, 0);
      RimShape8.addBox(0F, 0F, 0F, 1, 10, 1);
      RimShape8.setRotationPoint(5F, 13F, 0F);
      RimShape8.setTextureSize(64, 32);
      RimShape8.mirror = true;
      setRotation(RimShape8, 0F, 0F, 0F);
      Bar13 = new ModelRenderer(this, 0, 0);
      Bar13.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar13.setRotationPoint(5F, 15F, 0F);
      Bar13.setTextureSize(64, 32);
      Bar13.mirror = true;
      setRotation(Bar13, 1.570796F, 0F, 0F);
      Bar14 = new ModelRenderer(this, 0, 0);
      Bar14.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar14.setRotationPoint(5F, 15F, -5F);
      Bar14.setTextureSize(64, 32);
      Bar14.mirror = true;
      setRotation(Bar14, 1.570796F, 0F, 0F);
      Bar15 = new ModelRenderer(this, 0, 0);
      Bar15.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar15.setRotationPoint(5F, 19F, 0F);
      Bar15.setTextureSize(64, 32);
      Bar15.mirror = true;
      setRotation(Bar15, 1.570796F, 0F, 0F);
      Bar16 = new ModelRenderer(this, 0, 0);
      Bar16.addBox(0F, 0F, 0F, 1, 5, 1);
      Bar16.setRotationPoint(5F, 19F, -5F);
      Bar16.setTextureSize(64, 32);
      Bar16.mirror = true;
      setRotation(Bar16, 1.570796F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(0F, 0F, 0F, 11, 1, 12);
      Top.setRotationPoint(-5F, 12F, -6F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      TopDecor = new ModelRenderer(this, 0, 0);
      TopDecor.addBox(0F, 0F, 0F, 3, 2, 2);
      TopDecor.setRotationPoint(-1F, 10F, 0F);
      TopDecor.setTextureSize(64, 32);
      TopDecor.mirror = true;
      setRotation(TopDecor, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Base.render(f5);
    StickT.render(f5);
    TorchT.render(f5);
    RimShape1.render(f5);
    RimShape2.render(f5);
    Bar1.render(f5);
    Bar2.render(f5);
    RimShape3.render(f5);
    Bar3.render(f5);
    Bar4.render(f5);
    RimShape4.render(f5);
    RimShape5.render(f5);
    Bar5.render(f5);
    Bar6.render(f5);
    Bar7.render(f5);
    Bar8.render(f5);
    RimShape6.render(f5);
    RimShape7.render(f5);
    Bar9.render(f5);
    Bar10.render(f5);
    Bar11.render(f5);
    Bar12.render(f5);
    RimShape8.render(f5);
    Bar13.render(f5);
    Bar14.render(f5);
    Bar15.render(f5);
    Bar16.render(f5);
    Top.render(f5);
    TopDecor.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void renderSingle(float f5){
	  Base.render(f5);
	    StickT.render(f5);
	    TorchT.render(f5);
	    RimShape1.render(f5);
	    RimShape2.render(f5);
	    Bar1.render(f5);
	    Bar2.render(f5);
	    RimShape3.render(f5);
	    Bar3.render(f5);
	    Bar4.render(f5);
	    RimShape4.render(f5);
	    RimShape5.render(f5);
	    Bar5.render(f5);
	    Bar6.render(f5);
	    Bar7.render(f5);
	    Bar8.render(f5);
	    RimShape6.render(f5);
	    RimShape7.render(f5);
	    Bar9.render(f5);
	    Bar10.render(f5);
	    Bar11.render(f5);
	    Bar12.render(f5);
	    RimShape8.render(f5);
	    Bar13.render(f5);
	    Bar14.render(f5);
	    Bar15.render(f5);
	    Bar16.render(f5);
	    Top.render(f5);
	    TopDecor.render(f5);
  }
  
 

}
package democretes.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSubTerraGenerator extends ModelBase {
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelSubTerraGenerator()  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 40, 0);
      Shape1.addBox(-3F, 0F, -3F, 6, 26, 6);
      Shape1.setRotationPoint(0F, -6F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 8, 8);
      Shape2.addBox(-4F, 0F, -4F, 8, 2, 8);
      Shape2.setRotationPoint(0F, -8F, 0F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 18);
      Shape3.addBox(-5F, 0F, -5F, 10, 4, 10);
      Shape3.setRotationPoint(0F, 20F, 0F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(-2F, 0F, 0F, 4, 2, 1);
      Shape4.setRotationPoint(0F, 22F, 5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(-2F, 0F, 0F, 4, 2, 1);
      Shape5.setRotationPoint(5F, 22F, 0F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 1.570796F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(-2F, 0F, 0F, 4, 2, 1);
      Shape6.setRotationPoint(0F, 22F, -6F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(-2F, 0F, 0F, 4, 2, 1);
      Shape7.setRotationPoint(-6F, 22F, 0F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 1.570796F, 0F);
  }
  
  public void render() {
    final float f5 = 1/16F;
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}

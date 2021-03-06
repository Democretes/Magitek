package democretes.render.tile;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import democretes.block.MTBlocks;
import democretes.block.generators.TilePurityGenerator;
import democretes.block.generators.TileSubTerraGenerator;
import democretes.block.machines.TilePurityInverter;
import democretes.lib.Reference;
import democretes.render.models.ModelPurityGenerator;

public class RenderPurityGenerator extends TileEntitySpecialRenderer {

	ModelPurityGenerator model = new ModelPurityGenerator();

	private static final ResourceLocation modelTexture = new ResourceLocation(Reference.MODEL_PURITY_GENERATOR_TEXTURE);
	
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glScalef(-1F, -1F, 1F);
		GL11.glTranslatef(-.5F, -1.5F, .5F);
		renderLiquid(tile, x, y, z);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		bindTexture(modelTexture);
		model.render();

		GL11.glPopMatrix();
	}
	
	public void renderLiquid(TileEntity tile, double x, double y, double z)  {
		 if (this.field_147501_a.field_147553_e == null) {
		      return;
		 }	    
		 TilePurityGenerator entity = (TilePurityGenerator)tile;

		 if(entity.getPurity() == 0) {
			 return;
		 }

		 GL11.glPushMatrix();
		 GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		 GL11.glTranslatef(0F, -1.5F, 0F);

		 RenderBlocks renderBlocks = new RenderBlocks();
		 GL11.glDisable(2896);

		 float level = Math.abs(entity.getPurity()/2000.0F) * 0.65F;

		 Tessellator t = Tessellator.instance;

		 renderBlocks.setRenderBounds(0.325D, 0.0625D, 0.325D, 0.675D, 0.125D + level, 0.675D);

		 t.startDrawingQuads();
		 t.setColorOpaque_I(255);
		    
		 int bright = 200;
		 t.setBrightness(bright);

		 IIcon icon = Blocks.lava.getIcon(0, 0);
		 this.field_147501_a.field_147553_e.bindTexture(TextureMap.locationBlocksTexture);

		 Block generator = MTBlocks.generator;

		 renderBlocks.renderFaceYNeg(generator, -0.5D, 0.0D, -0.5D, icon);
		 renderBlocks.renderFaceYPos(generator, -0.5D, 0.0D, -0.5D, icon);
		 renderBlocks.renderFaceZNeg(generator, -0.5D, 0.0D, -0.5D, icon);
		 renderBlocks.renderFaceZPos(generator, -0.5D, 0.0D, -0.5D, icon);
		 renderBlocks.renderFaceXNeg(generator, -0.5D, 0.0D, -0.5D, icon);
		 renderBlocks.renderFaceXPos(generator, -0.5D, 0.0D, -0.5D, icon);

		 t.draw();	    
		 GL11.glEnable(2896);	    
		 GL11.glPopMatrix();

		 GL11.glColor3f(1.0F, 1.0F, 1.0F);
	}
}

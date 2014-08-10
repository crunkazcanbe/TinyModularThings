package speiger.src.tinymodularthings.client.gui.machine;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import org.lwjgl.opengl.GL11;

import speiger.src.api.language.LanguageRegister;
import speiger.src.api.packets.SpmodPacketHelper;
import speiger.src.spmodapi.client.gui.GuiInventoryCore;
import speiger.src.spmodapi.common.handler.SpmodPacket;
import speiger.src.tinymodularthings.TinyModularThings;
import speiger.src.tinymodularthings.common.blocks.machine.BucketFillerBasic;
import speiger.src.tinymodularthings.common.blocks.machine.InventoryBucketFiller;
import speiger.src.tinymodularthings.common.blocks.machine.SelfPoweredBucketFiller;
import speiger.src.tinymodularthings.common.lib.TinyModularThingsLib;

public class BucketFillerGui extends GuiInventoryCore
{
	BucketFillerBasic basic;
	
	public BucketFillerGui(InventoryPlayer par1, BucketFillerBasic par2)
	{
		super(new InventoryBucketFiller(par1, par2));
		basic = par2;
	}


	
	
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    	String name = LanguageRegister.getLanguageName(this, "bucketFiller.Basic", getCore());
    	if(basic instanceof SelfPoweredBucketFiller)
    	{
    		name = LanguageRegister.getLanguageName(this, "self.bucketfiller", getCore());
    	}
    	
        this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);

        this.buttonList.clear();
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.buttonList.add(new GuiButton(0, k+15, l+35, 30, 20, basic.drain ? "Drain" : "Fill"));
    }
    
	private static final ResourceLocation gui = new ResourceLocation(TinyModularThingsLib.ModID.toLowerCase() + ":textures/gui/machine/bucket_filler_gui.png");
	private static final ResourceLocation BLOCK_TEXTURE = TextureMap.locationBlocksTexture;


    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(gui);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        
        displayGauge(k, l, 19, 123, basic.tank.getFluidAmount() / 275, basic.tank.getFluid());
        
        int ptotal = this.basic.progress / 9;
        
        this.drawTexturedModalRect(k + 75, l + 41, 176, 60, ptotal + 1, 16);
        
    
    }
    
	@Override
	public void initGui()
	{
		super.initGui();
        this.buttonList.clear();
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.buttonList.add(new GuiButton(0, k+15, l+35, 30, 20, basic.drain ? "Drain" : "Fill"));

	}




	@Override
	protected void actionPerformed(GuiButton par1GuiButton)
	{
		super.actionPerformed(par1GuiButton);
		
		if(par1GuiButton.id == 0)
		{
			boolean oppo = !this.basic.drain;
			SpmodPacket packet = SpmodPacketHelper.getHelper().createNBTPacket(basic, TinyModularThings.instance).InjectNumber(oppo ? 0 : 1).finishPacket();
			if(packet != null)
			{
				//TODO Need to create a Networkhelper
			}
		}
		this.initGui();
	}




	private void displayGauge(int j, int k, int line, int col, int squaled, FluidStack liquid)
	{
		if (liquid == null)
		{
			return;
		}
		
		int start = 0;
		
		IIcon liquidIcon = null;
		Fluid fluid = liquid.getFluid();
		if ((fluid != null) && (fluid.getStillIcon() != null))
		{
			liquidIcon = fluid.getStillIcon();
		}
		
		mc.renderEngine.bindTexture(BLOCK_TEXTURE);
		
		if (liquidIcon != null)
		{
			while (true)
			{
				int x;
				if (squaled > 16)
				{
					x = 16;
					squaled -= 16;
				}
				else
				{
					x = squaled;
					squaled = 0;
				}
				
				drawTexturedModelRectFromIcon(j + col, k + line + 58 - x - start, liquidIcon, 16, 16 - (16 - x));
				start += 16;
				
				if ((x == 0) || (squaled == 0))
				{
					break;
				}
			}
		}
		mc.renderEngine.bindTexture(gui);
		drawTexturedModalRect(j + col, k + line, 176, 0, 16, 60);
	}
    
}

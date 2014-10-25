package speiger.src.spmodapi.common.tile;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import buildcraft.BuildCraftTransport;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraftforge.common.ForgeDirection;
import speiger.src.api.blocks.BlockPosition;
import speiger.src.api.util.RedstoneUtils;
import speiger.src.spmodapi.common.config.SpmodConfig;
import speiger.src.spmodapi.common.enums.EnumColor.SpmodColor;
import speiger.src.spmodapi.common.util.TextureEngine;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class AdvTile extends TileEntity
{
	
	public void loadInformation(List par1)
	{
		
	}
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(int side)
	{
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public SpmodColor getColor()
	{
		return new SpmodColor(16777215);
	}
	
	public StepSound getStepSound()
	{
		return getBlockType().stepSound;
	}
	
	public float getBlockHardness()
	{
		return getBlockType().blockHardness;
	}
	
	public float getExplosionResistance(Entity par1)
	{
		return getBlockType().getExplosionResistance(par1);
	}
	
	public int getBlockLightLevel()
	{
		return 0;
	}
	
	public int getLightOpactiy()
	{
		return 0;
	}
	
	public void updateNeighbors(boolean needSelf)
	{
		if(needSelf)
		{
			worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord, getBlockType().blockID);
		}
		for(ForgeDirection side : ForgeDirection.VALID_DIRECTIONS)
		{
			notifyBlocksOfNeighborChange(side);
		}
	}

	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		writeToNBT(nbt);
		return new Packet132TileEntityData(xCoord, yCoord, zCoord, 0, nbt);
	}
	
	@Override
	public void onDataPacket(INetworkManager net, Packet132TileEntityData pkt)
	{
		readFromNBT(pkt.data);
	}

	protected void notifyBlocksOfNeighborChange(ForgeDirection side)
	{
		worldObj.notifyBlocksOfNeighborChange(xCoord + side.offsetX, yCoord + side.offsetY, zCoord + side.offsetZ, getBlockType().blockID);
	}
	
	public ArrayList<AxisAlignedBB> getColidingBoxes(Entity par2)
	{
		return null;
	}
	
	public boolean isPowered()
	{
		return RedstoneUtils.isBlockGettingPowered(this);
	}
	
	public AxisAlignedBB getSelectedBoxes()
	{
		Block par1 = this.getBlockType();
		return AxisAlignedBB.getAABBPool().getAABB((double)xCoord + par1.getBlockBoundsMinX(), (double)yCoord + par1.getBlockBoundsMinY(), (double)zCoord + par1.getBlockBoundsMinZ(), (double)xCoord + par1.getBlockBoundsMaxX(), (double)yCoord + par1.getBlockBoundsMaxY(), (double)zCoord + par1.getBlockBoundsMaxZ());
	}
	
	public AxisAlignedBB getColidingBox()
	{
		Block par1 = this.getBlockType();
		return AxisAlignedBB.getAABBPool().getAABB((double)xCoord + par1.getBlockBoundsMinX(), (double)yCoord + par1.getBlockBoundsMinY(), (double)zCoord + par1.getBlockBoundsMinZ(), (double)xCoord + par1.getBlockBoundsMaxX(), (double)yCoord + par1.getBlockBoundsMaxY(), (double)zCoord + par1.getBlockBoundsMaxZ());
	}
	
	@Override
	public void updateEntity()
	{
		super.updateEntity();
		
		if(!SpmodConfig.loadTiles)
		{
			return;
		}
		
		onTick();
	}
	
	public void updateBlock()
	{
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		if(worldObj.blockExists(xCoord, yCoord, zCoord))
		{
			worldObj.getChunkFromBlockCoords(xCoord, zCoord).setChunkModified();
		}
	}
	
	public void updateLight()
	{
		this.worldObj.updateAllLightTypes(this.xCoord, this.yCoord, this.zCoord);
	}
	
	public void onTick()
	{
		
	}
	
	public boolean onClick(boolean sneak, EntityPlayer par1, Block par2, int side)
	{
		return false;
	}
	
	public void onBreaking()
	{
	}
	
	public float getHardnessForPlayer(EntityPlayer par1)
	{
		return getBlockHardness();
	}
	
	public int getDroppedExp()
	{
		return -1;
	}
	
	public void onDistroyedByExplosion(Explosion par0)
	{
		
	}
	
	public boolean canPlacedOnSide(ForgeDirection side)
	{
		return canPlaced();
	}
	
	public boolean canPlaced()
	{
		return true;
	}
	
	public boolean onActivated(EntityPlayer par1)
	{
		return false;
	}
	
	public void onEntityWalk(Entity par1)
	{
		
	}
	
	public void onPlaced(int facing)
	{
		
	}
	
	public int isPowering(int side)
	{
		return 0;
	}
	
	public int isIndirectlyPowering(int side)
	{
		return isPowering(side);
	}
	
	public void onColide(Entity par1)
	{
		
	}
	
	public boolean SolidOnSide(ForgeDirection side)
	{
		return true;
	}
	
	public boolean canBeReplaced()
	{
		return false;
	}
	
	public boolean isAir()
	{
		return false;
	}
	
	public boolean removeAbleByPlayer(EntityPlayer player)
	{
		return true;
	}
	
	public int getFireBurnLenght(ForgeDirection side)
	{
		return 0;
	}
	
	public int getFireSpreadSpeed(ForgeDirection side)
	{
		return 0;
	}
	
	public ArrayList<ItemStack> onDrop(int fortune)
	{
		ArrayList<ItemStack> drop = new ArrayList<ItemStack>();
		if(dropNormalBlock())
		{
			drop.add(new ItemStack(this.getBlockType(), 1, this.getBlockMetadata()));
		}
		return drop;
	}
	
	public boolean dropNormalBlock()
	{
		return false;
	}
	
	public boolean isSilkHarvestable(EntityPlayer player)
	{
		return false;
	}
	
	public boolean canMonsterSpawn(EnumCreatureType type)
	{
		return true;
	}
	
	public boolean canConnectToWire(int side)
	{
		return false;
	}
	
	public boolean canPlaceTorchOnTop()
	{
		return true;
	}
	
	public boolean canEntityDistroyMe(Entity par1)
	{
		return true;
	}
	
	public boolean shouldCheckWeakPower(int side)
	{
		return false;
	}
	
	public void registerIcon(TextureEngine par1)
	{
		
	}
	
	public abstract Icon getIconFromSideAndMetadata(int side, int renderPass);
	
	public boolean hasContainer()
	{
		return false;
	}
	
	public Container getInventory(InventoryPlayer par1)
	{
		return null;
	}
	
	@SideOnly(Side.CLIENT)
	public GuiContainer getGui(InventoryPlayer par1)
	{
		return null;
	}
	
	public void onReciveGuiInfo(int key, int val)
	{
		
	}
	
	public void onSendingGuiInfo(Container par1, ICrafting par2)
	{
		
	}
	
	public ItemStack slotClicked(Container par1, int slotID, int mouseButton, int modifire, EntityPlayer player)
	{
		return par1.slotClick(slotID, mouseButton, modifire, player);
	}
	
	public ItemStack onItemTransfer(Container par1, EntityPlayer player, int slotID)
	{
		return par1.transferStackInSlot(player, slotID);
	}
	
	public void onAdvPlacing(int rotation, int facing)
	{
		this.onPlaced(facing);
	}
	
	public void setupUser(EntityPlayer player)
	{
		
	}
	
	public ItemStack pickBlock(MovingObjectPosition target)
	{
		return new ItemStack(worldObj.getBlockId(xCoord, yCoord, zCoord), 1, worldObj.getBlockMetadata(xCoord, yCoord, zCoord));
	}
	
	public void setBoundsOnState(Block par1)
	{
		par1.setBlockBounds(0, 0, 0, 1, 1, 1);
	}
	
	public void onClientTick()
	{
		
	}
	
	public BlockPosition getPosition()
	{
		return new BlockPosition(worldObj, xCoord, yCoord, zCoord);
	}
	
	public Logger getDebugLogger()
	{
		return FMLLog.getLogger();
	}
	
	public int upcastShort(int value)
	{
		if(value < 0)
			value += 65536;
		return value;
	}
	
	public boolean isFireSource(ForgeDirection side)
	{
		return false;
	}
	
	public boolean isNormalCube()
	{
		return true;
	}
	
	public void onFallen(Entity par5Entity)
	{
		
	}

	public void onBlockChange(Block par1, int par2)
	{
		
	}
	
}

package speiger.src.compactWindmills.common.blocks;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import speiger.src.api.common.world.items.IRotorItem;

public class WindMillSlot extends Slot
{
	
	public WindMillSlot(IInventory par1iInventory, int par2, int par3, int par4)
	{
		super(par1iInventory, par2, par3, par4);
	}
	
	@Override
	public boolean isItemValid(ItemStack par1)
	{
		WindMill mill = (WindMill) this.inventory;
		if (mill == null)
		{
			return false;
		}
		
		if (par1 == null)
		{
			return false;
		}
		if (par1.getItem() == null)
		{
			return false;
		}
		if (!(par1.getItem() instanceof IRotorItem))
		{
			return false;
		}
		return true;
	}
	
}

package speiger.src.spmodapi.common.blocks.hemp;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import speiger.src.api.common.world.blocks.BlockStack;
import speiger.src.spmodapi.common.items.core.ItemBlockSpmod;

public class ItemBlockHempDekoBase extends ItemBlockSpmod
{
	
	public ItemBlockHempDekoBase(int par1)
	{
		super(par1);
		this.setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}

	@Override
	public BlockStack getBlockToPlace(int meta)
	{
		return new BlockStack(getBlockID(), meta);
	}

	@Override
	public String getName(ItemStack par1)
	{
		switch(par1.getItemDamage())
		{
			case 4:
			case 0: return "Hemp Block";
			case 5:
			case 1: return "Hemp Brick";
			case 6:
			case 2: return "Plated Hemp Block";
			case 7:
			case 3: return "Plated Hemp Brick";
			default: return "No Name";
		}
	}
	
}

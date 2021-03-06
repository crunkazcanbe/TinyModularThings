package speiger.src.spmodapi.common.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import speiger.src.spmodapi.common.config.ModObjects.APIBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabHempDeko extends CreativeTabs
{
	
	public TabHempDeko()
	{
		super("Hemp Deko");
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public boolean hasSearchBar()
	{
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "Hemp Deko";
	}
	
	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(APIBlocks.hempBlock);
	}
	
}

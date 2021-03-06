package speiger.src.spmodapi.common.plugins.Forestry;

import speiger.src.api.common.registry.helpers.IPlugin;
import speiger.src.spmodapi.common.plugins.Forestry.core.ForestryAddon;
import cpw.mods.fml.common.Loader;

public class PluginForestry implements IPlugin
{
	
	@Override
	public boolean canLoad()
	{
		return Loader.isModLoaded("Forestry");
	}
	
	@Override
	public void init()
	{
		ForestryAddon.init();
	}

	@Override
	public Object getForgeClasses()
	{
		return null;
	}
	
}

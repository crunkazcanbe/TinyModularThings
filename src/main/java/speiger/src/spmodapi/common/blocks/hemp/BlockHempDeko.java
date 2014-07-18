package speiger.src.spmodapi.common.blocks.hemp;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.common.MinecraftForge;
import speiger.src.spmodapi.common.config.ModObjects.APIUtils;
import speiger.src.spmodapi.common.lib.SpmodAPILib;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHempDeko extends Block
{
	HempBlockInformation info;
	
	public BlockHempDeko(HempBlockInformation par2)
	{
		super(par2.getMaterial());
		info = par2;
		setCreativeTab(APIUtils.tabHempDeko);
	}
	
	public HempBlockInformation getInfos()
	{
		return info;
	}
	
	IIcon[] textures = new IIcon[16];
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1)
	{
		for (int i = 0; i < textures.length; i++)
		{
			textures[i] = par1.registerIcon(SpmodAPILib.ModID.toLowerCase() + ":hemp/" + info.getTexture() + "_" + i);
		}
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return textures[par2];
	}
	
	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z)
	{
		if (type == EnumCreatureType.monster)
		{
			return info.canMonsterSpawn();
		}
		return super.canCreatureSpawn(type, world, x, y, z);
	}
	
	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face)
	{
		return info.isHemp() ? 100 : 0;
	}

	@Override
	public int damageDropped(int par1)
	{
		return par1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int i = 0; i < textures.length; i++)
		{
			par3List.add(new ItemStack(par1, 1, i));
		}
	}
	
	@Override
	public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face)
	{
		return info.isHemp() ? 50 : 0;
	}
	
	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face)
	{
		return info.isHemp();
	}
	
	public static class HempBlockInformation
	{
		Material material;
		boolean axe;
		String name;
		String textureName;
		boolean isSave;
		
		public HempBlockInformation(Material par1, boolean axe, boolean par2, String textureName, String name)
		{
			material = par1;
			this.axe = axe;
			this.textureName = textureName;
			this.name = name;
			isSave = par2;
		}
		
		public boolean canMonsterSpawn()
		{
			return !isSave;
		}
		
		public String getName()
		{
			return name;
		}
		
		public boolean isHemp()
		{
			return axe;
		}
		
		public String getTexture()
		{
			return textureName;
		}
		
		public void registerToForge(Block par1)
		{
			par1.setHarvestLevel(axe ? "axe" : "pickaxe", 0);
			par1.setHardness(4F);
			par1.setResistance(axe ? 3F : 8F);
		}
		
		public Material getMaterial()
		{
			return material;
		}
	}
	
}

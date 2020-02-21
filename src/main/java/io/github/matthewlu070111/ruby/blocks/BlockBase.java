package io.github.matthewlu070111.ruby.blocks;

import io.github.matthewlu070111.ruby.Main;
import io.github.matthewlu070111.ruby.init.ModBlocks;
import io.github.matthewlu070111.ruby.init.ModItems;
import io.github.matthewlu070111.ruby.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material, float f, String tool, int i) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ruby);
		setHardness(f);
		setHarvestLevel(tool, i);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}

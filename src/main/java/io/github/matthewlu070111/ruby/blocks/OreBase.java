package io.github.matthewlu070111.ruby.blocks;

import io.github.matthewlu070111.ruby.Main;
import io.github.matthewlu070111.ruby.init.ModBlocks;
import io.github.matthewlu070111.ruby.init.ModItems;
import io.github.matthewlu070111.ruby.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class OreBase extends Block implements IHasModel {
	public OreBase(String name, float f, int i) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ruby);
		setHardness(f);
		setHarvestLevel("pickaxe", i);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}

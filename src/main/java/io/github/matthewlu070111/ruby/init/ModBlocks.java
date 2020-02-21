package io.github.matthewlu070111.ruby.init;

import java.util.ArrayList;
import java.util.List;

import io.github.matthewlu070111.ruby.blocks.BlockBase;
import io.github.matthewlu070111.ruby.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 5.0F, "pickaxe", 2);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", 5.0F, 2);
}

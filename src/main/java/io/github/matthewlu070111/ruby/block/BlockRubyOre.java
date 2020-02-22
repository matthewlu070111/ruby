package io.github.matthewlu070111.ruby.block;

import java.util.Random;

import io.github.matthewlu070111.ruby.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockRubyOre extends Block {

	public BlockRubyOre(Material material) {
		super(material);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(Block.soundTypeMetal);
	}

	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return Main.itemRuby;
	}
}

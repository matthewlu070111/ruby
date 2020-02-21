package io.github.matthewlu070111.ruby.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRubyBlock extends Block {
	public BlockRubyBlock(Material material) {
		super(material);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(this.soundTypeMetal);
	}
}

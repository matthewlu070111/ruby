package io.github.matthewlu070111.ruby.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIndigoOre extends Block {
	
	public BlockIndigoOre(Material material) {
		super(material);
		this.setHardness(7.0F);
		this.setHarvestLevel("pickaxe", 4);
		this.setStepSound(this.soundTypeMetal);
	}
}

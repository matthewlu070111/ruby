package io.github.matthewlu070111.ruby;

import io.github.matthewlu070111.ruby.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RubyTab extends CreativeTabs {

	public RubyTab(String label) {
		super("ruby");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RUBY);
	}

}

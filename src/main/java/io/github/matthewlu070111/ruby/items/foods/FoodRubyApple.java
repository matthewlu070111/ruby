package io.github.matthewlu070111.ruby.items.foods;

import io.github.matthewlu070111.ruby.Main;
import io.github.matthewlu070111.ruby.init.ModItems;
import io.github.matthewlu070111.ruby.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodRubyApple extends ItemFood implements IHasModel {

	public FoodRubyApple(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ruby);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

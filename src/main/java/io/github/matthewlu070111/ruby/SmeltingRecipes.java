package io.github.matthewlu070111.ruby;

import io.github.matthewlu070111.ruby.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void registerSmelting() {
		GameRegistry.addSmelting(ModItems.RUBY_APPLE, new ItemStack(ModItems.COOKED_RUBY_APPLE, 1), 5.0f);
	}
}

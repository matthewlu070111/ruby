package io.github.matthewlu070111.ruby.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemRubyArmor extends ItemArmor {

	public ItemRubyArmor(ArmorMaterial armorMaterial, int randerIndex, int armorType) {
		super(armorMaterial, randerIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(this.armorType == 2) {
			return "em:textures/models/armor/ruby_layer_2.png";
		}
		return "em:textures/models/armor/ruby_layer_1.png";
	}
}

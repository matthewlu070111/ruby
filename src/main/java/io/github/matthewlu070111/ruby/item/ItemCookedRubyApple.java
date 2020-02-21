package io.github.matthewlu070111.ruby.item;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemCookedRubyApple extends ItemFood {
	public ItemCookedRubyApple(int giveBack, float speed, boolean forDog) {
		super(giveBack, speed, forDog);
		this.setPotionEffect(Potion.moveSlowdown, 100, 3, 3.0F);
	}

	public void setPotionEffect(Potion moveslowdown, int duration, int amplifier, float propability) {
		
	}
}

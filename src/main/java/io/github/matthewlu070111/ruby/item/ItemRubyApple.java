package io.github.matthewlu070111.ruby.item;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemRubyApple extends ItemFood {

	public ItemRubyApple(int giveBack, float speed, boolean forDog) {
		super(giveBack, speed, forDog);
		this.setPotionEffect(Potion.moveSpeed, 120, 5, 1.0F);
	}

	private void setPotionEffect(Potion movespeed, int duration, int ampifier, float propability) {
		
		
	}

}

package io.github.matthewlu070111.ruby.achievement;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import io.github.matthewlu070111.ruby.Main;
import net.minecraft.item.ItemStack;

public class GetItemRubyTools {

	@SubscribeEvent
	public void whenIGetRuby(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Main.itemRubyAxe))) {
			if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Main.itemRubyPickaxe))) {
				if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Main.itemRubyHoe))) {
					if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Main.itemRubyShovel))) {
						if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Main.itemRubySword))) {
							e.player.addStat(Main.achievementGetRubyTools, 1);
						}
					}
				}
			}
		}	
	}
}

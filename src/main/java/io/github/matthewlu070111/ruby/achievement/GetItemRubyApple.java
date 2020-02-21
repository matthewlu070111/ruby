package io.github.matthewlu070111.ruby.achievement;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import io.github.matthewlu070111.ruby.Main;
import net.minecraft.item.ItemStack;

public class GetItemRubyApple {

	@SubscribeEvent
	public void whenIGetRuby(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Main.itemRubyApple))) {
			e.player.addStat(Main.achievementGetRubyApple, 1);
		}
	}
}

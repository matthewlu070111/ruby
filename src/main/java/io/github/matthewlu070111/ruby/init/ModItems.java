package io.github.matthewlu070111.ruby.init;

import java.util.ArrayList;
import java.util.List;

import io.github.matthewlu070111.ruby.items.ArmorBase;
import io.github.matthewlu070111.ruby.items.ItemBase;
import io.github.matthewlu070111.ruby.items.foods.FoodCookedRubyApple;
import io.github.matthewlu070111.ruby.items.foods.FoodRubyApple;
import io.github.matthewlu070111.ruby.items.tools.ToolAxe;
import io.github.matthewlu070111.ruby.items.tools.ToolHoe;
import io.github.matthewlu070111.ruby.items.tools.ToolPickaxe;
import io.github.matthewlu070111.ruby.items.tools.ToolShovel;
import io.github.matthewlu070111.ruby.items.tools.ToolSword;
import io.github.matthewlu070111.ruby.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("ruby_tool", 4, 2000, 10.0F, 5.0F, 30);
	public static final ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("ruby_armor", Reference.MOD_ID + ":ruby", 5000, new int[]{20,30,25,15}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final Item RUBY = new ItemBase("ruby");
	
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", RUBY_TOOL);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", RUBY_TOOL);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", RUBY_TOOL);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", RUBY_TOOL);
	public static final ItemSpade RUBY_SHOVEL = new ToolShovel("ruby_shovel", RUBY_TOOL);
	
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", RUBY_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", RUBY_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", RUBY_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", RUBY_ARMOR, 1, EntityEquipmentSlot.FEET);
	
	public static final Item RUBY_APPLE = new FoodRubyApple("ruby_apple", 10, 0.5F, false);
	public static final Item COOKED_RUBY_APPLE = new FoodCookedRubyApple("cooked_ruby_apple", 20, 5.0F, false);
}

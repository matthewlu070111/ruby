package io.github.matthewlu070111.ruby;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import io.github.matthewlu070111.ruby.achievement.GetItemCookedRubyApple;
import io.github.matthewlu070111.ruby.achievement.GetItemRuby;
import io.github.matthewlu070111.ruby.achievement.GetItemRubyApple;
import io.github.matthewlu070111.ruby.achievement.GetItemRubyArmors;
import io.github.matthewlu070111.ruby.achievement.GetItemRubyTools;
import io.github.matthewlu070111.ruby.block.BlockIndigoOre;
import io.github.matthewlu070111.ruby.block.BlockRubyBlock;
import io.github.matthewlu070111.ruby.block.BlockRubyOre;
import io.github.matthewlu070111.ruby.item.ItemCookedRubyApple;
import io.github.matthewlu070111.ruby.item.ItemIndigoIngot;
import io.github.matthewlu070111.ruby.item.ItemRuby;
import io.github.matthewlu070111.ruby.item.ItemRubyApple;
import io.github.matthewlu070111.ruby.item.ItemRubyArmor;
import io.github.matthewlu070111.ruby.tw.ItemIndigoRubyAxe;
import io.github.matthewlu070111.ruby.tw.ItemIndigoRubyHoe;
import io.github.matthewlu070111.ruby.tw.ItemIndigoRubyPickaxe;
import io.github.matthewlu070111.ruby.tw.ItemIndigoRubyShovel;
import io.github.matthewlu070111.ruby.tw.ItemIndigoRubySword;
import io.github.matthewlu070111.ruby.tw.ItemRubyAxe;
import io.github.matthewlu070111.ruby.tw.ItemRubyHoe;
import io.github.matthewlu070111.ruby.tw.ItemRubyPickaxe;
import io.github.matthewlu070111.ruby.tw.ItemRubyShovel;
import io.github.matthewlu070111.ruby.tw.ItemRubySword;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "ruby", name = "Ruby", version = "1.1")
public class Main {
	//Items
	public static Item itemRuby;
	public static Item itemIndigoIngot;
	//Blocks
	public static Block blockRubyBlock;
	public static Block blockRubyOre;
	public static Block blockIndigoOre;
	//Foods
	public static Item itemRubyApple;
	public static Item itemCookedRubyApple;
	//Tools & Weapons
	public static Item itemRubyPickaxe;
	public static Item itemRubyAxe;
	public static Item itemRubyShovel;
	public static Item itemRubyHoe;
	public static Item itemRubySword;
	public static Item itemIndigoRubyPickaxe;
	public static Item itemIndigoRubyAxe;
	public static Item itemIndigoRubyShovel;
	public static Item itemIndigoRubyHoe;
	public static Item itemIndigoRubySword;
	//Armor
	public static ItemArmor itemRubyHelmet;
	public static ItemArmor itemRubyChest;
	public static ItemArmor itemRubyLeggings;
	public static ItemArmor itemRubyBoots;
	//Achievement
	public static Achievement achievementRuby;
	public static Achievement achievementGetRubyApple;
	public static Achievement achievementGetCookedRubyApple;
	public static Achievement achievementGetRubyTools;
	public static Achievement achievementGetRubyArmors;
	//More Settings
	public static final Item.ToolMaterial itemRubyToolMaterial = EnumHelper.addToolMaterial("itemRubyToolMaterial", 4, 2000, 10.0F, 5.0F, 30);
	public static final Item.ToolMaterial itemIndigoRubyToolMaterial = EnumHelper.addToolMaterial("itemIndigoRubyToolMaterial", 5, 5000, 20.0F, 10.0F, 60);
	public static final ItemArmor.ArmorMaterial itemRubyArmorMaterial = EnumHelper.addArmorMaterial("itemRubyArmorMaterial", 5000, new int[]{20,30,25,15}, 30);
	//Pre-Initial Part
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/*Initializing and registering.
		  Configure Handling.*/
		//Unlocalized name and texture for Items
		itemRuby = new ItemRuby().setUnlocalizedName("ItemRuby").setTextureName("ruby:ruby").setCreativeTab(tabEM);
		itemIndigoIngot = new ItemIndigoIngot().setUnlocalizedName("ItemIndigoIngot").setTextureName("ruby:indigo_ingot").setCreativeTab(tabEM);
		//Unlocalized name and texture for Blocks
		blockRubyBlock = new BlockRubyBlock(Material.rock).setBlockName("BlockRubyBlock").setBlockTextureName("ruby:rubyblock").setCreativeTab(tabEM);
		blockRubyOre = new BlockRubyOre(Material.rock).setBlockName("BlockRubyOre").setBlockTextureName("ruby:ruby_ore").setCreativeTab(tabEM);
		blockIndigoOre = new BlockIndigoOre(Material.rock).setBlockName("BlockIndigoOre").setBlockTextureName("ruby:indigo_ore").setCreativeTab(tabEM);
		//Unlocalized name and texture for Food
		itemRubyApple = new ItemRubyApple(10, 0.5F, false).setUnlocalizedName("FoodRubyApple").setTextureName("ruby:rubyapple").setCreativeTab(tabEM);
		itemCookedRubyApple = new ItemCookedRubyApple(20, 5.0F, false).setUnlocalizedName("FoodCookedRubyApple").setTextureName("ruby:cookedrubyapple").setCreativeTab(tabEM);
		//Unlocalized name and texture for Tools
		itemRubyPickaxe = new ItemRubyPickaxe(itemRubyToolMaterial).setUnlocalizedName("ItemRubyPickaxe").setTextureName("ruby:rubypickaxe").setCreativeTab(tabEM);
		itemRubyAxe = new ItemRubyAxe(itemRubyToolMaterial).setUnlocalizedName("ItemRubyAxe").setTextureName("ruby:rubyaxe").setCreativeTab(tabEM);
		itemRubyShovel = new ItemRubyShovel(itemRubyToolMaterial).setUnlocalizedName("ItemRubyShovel").setTextureName("ruby:rubyshovel").setCreativeTab(tabEM);
		itemRubyHoe = new ItemRubyHoe(itemRubyToolMaterial).setUnlocalizedName("ItemRubyHoe").setTextureName("ruby:rubyhoe").setCreativeTab(tabEM);
		itemRubySword = new ItemRubySword(itemRubyToolMaterial).setUnlocalizedName("ItemRubySword").setTextureName("ruby:rubysword").setCreativeTab(tabEM);
		itemIndigoRubyPickaxe = new ItemIndigoRubyPickaxe(itemIndigoRubyToolMaterial).setUnlocalizedName("ItemIndigoRubyPickaxe").setTextureName("ruby:rubypickaxe").setCreativeTab(tabEM);
		itemIndigoRubyAxe = new ItemIndigoRubyAxe(itemIndigoRubyToolMaterial).setUnlocalizedName("ItemIndigoRubyAxe").setTextureName("ruby:indigorubyaxe").setCreativeTab(tabEM);
		itemIndigoRubyShovel = new ItemIndigoRubyShovel(itemIndigoRubyToolMaterial).setUnlocalizedName("ItemIndigoRubyShovel").setTextureName("ruby:indigorubyshovel").setCreativeTab(tabEM);
		itemIndigoRubyHoe = new ItemIndigoRubyHoe(itemIndigoRubyToolMaterial).setUnlocalizedName("ItemIndigoRubyHoe").setTextureName("ruby:indigorubyhoe").setCreativeTab(tabEM);
		itemIndigoRubySword = new ItemIndigoRubySword(itemIndigoRubyToolMaterial).setUnlocalizedName("ItemIndigoRubySword").setTextureName("ruby:indigorubysword").setCreativeTab(tabEM);
		//Unlocalized name and texture for Armors
		itemRubyHelmet = (ItemArmor) new ItemRubyArmor(itemRubyArmorMaterial, 0, 0).setUnlocalizedName("ItemRubyHelmet").setTextureName("ruby:rubyhelmet").setCreativeTab(tabEM);
		itemRubyChest = (ItemArmor) new ItemRubyArmor(itemRubyArmorMaterial, 0, 1).setUnlocalizedName("ItemRubyChest").setTextureName("ruby:rubychest").setCreativeTab(tabEM);
		itemRubyLeggings = (ItemArmor) new ItemRubyArmor(itemRubyArmorMaterial, 0, 2).setUnlocalizedName("ItemRubyLeggings").setTextureName("ruby:rubyleggings").setCreativeTab(tabEM);
		itemRubyBoots = (ItemArmor) new ItemRubyArmor(itemRubyArmorMaterial, 0, 3).setUnlocalizedName("ItemRubyBoots").setTextureName("ruby:rubyboots").setCreativeTab(tabEM);
		//Register Items
		GameRegistry.registerItem(itemRuby, itemRuby.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIndigoIngot, itemIndigoIngot.getUnlocalizedName().substring(5));
		//Register Block
		GameRegistry.registerBlock(blockRubyBlock, blockRubyBlock.getUnlocalizedName().substring(5));
		System.out.println(blockRubyBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRubyOre, blockRubyOre.getUnlocalizedName().substring(5));
		System.out.println(blockRubyOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockIndigoOre, blockIndigoOre.getUnlocalizedName().substring(5));
		System.out.println(blockIndigoOre.getUnlocalizedName().substring(5));
		//Rgister Food
		GameRegistry.registerItem(itemRubyApple, itemRubyApple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemCookedRubyApple, itemCookedRubyApple.getUnlocalizedName().substring(5));
		//Register Tools
		GameRegistry.registerItem(itemRubyAxe, itemRubyAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubyHoe, itemRubyHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubyPickaxe, itemRubyPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubyShovel, itemRubyShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubySword, itemRubySword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIndigoRubyAxe, itemIndigoRubyAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIndigoRubyHoe, itemIndigoRubyHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIndigoRubyPickaxe, itemIndigoRubyPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIndigoRubyShovel, itemIndigoRubyShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIndigoRubySword, itemIndigoRubySword.getUnlocalizedName().substring(5));
		//Register Armors
		GameRegistry.registerItem(itemRubyHelmet, itemRubyHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubyChest, itemRubyChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubyLeggings, itemRubyLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubyBoots, itemRubyBoots.getUnlocalizedName().substring(5));
		//Register OreGenerator
		GameRegistry.registerWorldGenerator(new RubyOreGeneration(), 0);
	}
	//Initial Part
	@EventHandler
	public void init(FMLInitializationEvent event) {
		/*Proxy, TileEntity, Entity, GUI and Packet Registering.*/
		//Crafting Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(blockRubyBlock), new Object[]{"###", "###", "###", '#', itemRuby});
		GameRegistry.addRecipe(new ItemStack(itemRubyAxe), new Object[]{"## ", "#R ", " R ", '#', itemCookedRubyApple, 'R', Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemRubyHoe), new Object[]{"## ", " R ", " R ", '#', itemCookedRubyApple, 'R', Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemRubyPickaxe), new Object[]{"###", " R ", " R ", '#', itemCookedRubyApple, 'R', Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemRubyShovel), new Object[]{" # ", " R ", " R ", '#', itemCookedRubyApple, 'R', Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemRubySword), new Object[]{" # ", " # ", " R ", '#', itemCookedRubyApple, 'R', Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemRubyHelmet), new Object[]{"###", "# #", "   ", '#', itemCookedRubyApple});
		GameRegistry.addRecipe(new ItemStack(itemRubyChest), new Object[]{"# #", "###", "###", '#', itemCookedRubyApple});
		GameRegistry.addRecipe(new ItemStack(itemRubyLeggings), new Object[]{"###", "# #", "# #", '#', itemCookedRubyApple});
		GameRegistry.addRecipe(new ItemStack(itemRubyBoots), new Object[]{"   ", "# #", "# #", '#', itemCookedRubyApple});
		//Crafting Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(itemRubyApple), itemRuby, Items.apple);
		GameRegistry.addShapelessRecipe(new ItemStack(itemRuby, 9), blockRubyBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(itemIndigoRubyAxe), itemRubyAxe, itemIndigoIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(itemIndigoRubyPickaxe), itemRubyPickaxe, itemIndigoIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(itemIndigoRubyHoe), itemRubyHoe, itemIndigoIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(itemIndigoRubySword), itemRubySword, itemIndigoIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(itemIndigoRubyShovel), itemRubyShovel, itemIndigoIngot);
		//Smelting Recipes
		GameRegistry.addSmelting(itemRubyApple, new ItemStack(itemCookedRubyApple), 5.0F);
		GameRegistry.addSmelting(blockIndigoOre, new ItemStack(itemIndigoIngot), 10.0F);
		//Achievement
		achievementRuby = new Achievement("achievement.ruby", "ruby", 0, 0, new ItemStack(itemRuby), (Achievement)null).initIndependentStat().registerStat();
		achievementGetRubyApple = new Achievement("achievement.getRubyApple", "getRubyApple", 0, 1, new ItemStack(itemRubyApple), achievementRuby).registerStat();
		achievementGetCookedRubyApple = new Achievement("achievement.getCookedRubyApple", "getCookedRubyApple", 0, 2, new ItemStack(itemCookedRubyApple), achievementGetRubyApple).registerStat();
		achievementGetRubyTools = new Achievement("achievement.getRubyTools", "getRubyTools", 0, 3, new ItemStack(itemRubySword), achievementGetCookedRubyApple).registerStat();
		achievementGetRubyArmors = new Achievement("achievement.getRubyArmors", "getRubyArmors", 0, 4, new ItemStack(itemRubyHelmet), achievementGetCookedRubyApple).registerStat();
		AchievementPage.registerAchievementPage(new AchievementPage("Ruby", new Achievement[]{achievementRuby, achievementGetRubyApple, achievementGetCookedRubyApple, achievementGetRubyTools, achievementGetRubyArmors}));
		FMLCommonHandler.instance().bus().register(new GetItemRuby());
		FMLCommonHandler.instance().bus().register(new GetItemRubyApple());
		FMLCommonHandler.instance().bus().register(new GetItemCookedRubyApple());
		FMLCommonHandler.instance().bus().register(new GetItemRubyTools());
		FMLCommonHandler.instance().bus().register(new GetItemRubyArmors());
	}
	//Post-Initial Part
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	//Creative Tab
	public static CreativeTabs tabEM = new CreativeTabs("tabEM") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(itemRuby).getItem();
		}
	};
}

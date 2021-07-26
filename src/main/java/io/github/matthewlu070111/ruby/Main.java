package io.github.matthewlu070111.ruby;

import io.github.matthewlu070111.ruby.ToolsMaterials.AxeBase;
import io.github.matthewlu070111.ruby.ToolsMaterials.HoeBase;
import io.github.matthewlu070111.ruby.ToolsMaterials.PickaxeBase;
import io.github.matthewlu070111.ruby.ToolsMaterials.ShovelBase;
import io.github.matthewlu070111.ruby.ToolsMaterials.SwordBase;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Main implements ModInitializer {

    public static final ItemGroup RUBY_GROUP = FabricItemGroupBuilder.build(new Identifier("ruby", "group"), () -> new ItemStack(Main.RUBY));

    public static final Item RUBY = new Item(new Item.Settings().group(Main.RUBY_GROUP));
    public static final Item RUBY_APPLE = new Item(new Item.Settings().group(Main.RUBY_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).build()));
    public static final Item COOKED_RUBY_APPLE = new Item(new Item.Settings().group(Main.RUBY_GROUP).food(new FoodComponent.Builder().hunger(20).saturationModifier(0.5f).build()));

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).breakByHand(false).build());
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).breakByHand(false).build());

    public static final ArmorMaterial RUBY_ARMOR = new RubyArmor();

    private static final String MODID = "ruby";

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_apple"), RUBY_APPLE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "cooked_ruby_apple"), COOKED_RUBY_APPLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(Main.RUBY_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(Main.RUBY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_pickaxe"), new PickaxeBase(new RubyTool()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_axe"), new AxeBase(new RubyTool()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_hoe"), new HoeBase(new RubyTool()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_sword"), new SwordBase(new RubyTool()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_shovel"), new ShovelBase(new RubyTool()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_helmet"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_chestplate"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_leggings"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_boots"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.FEET));
        //Loop over existing biomes
	    Registry.BIOME.forEach(this::handleBiome);
 
	    //Listen for other biomes being registered
	    RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));
    }

    public void handleBiome(Biome biome) {
        if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Biome.configureFeature(
                        Feature.ORE,
                    new OreFeatureConfig(
                        OreFeatureConfig.Target.NATURAL_STONE,
                        Main.RUBY_ORE.getDefaultState(),
                            8 //Ore vein size
                    ),
                        Decorator.COUNT_RANGE,
                    new RangeDecoratorConfig(
                        8, //Number of veins per chunk
                        0, //Bottom Offset
                        1, //Min y level
                        100//Max y level
                    )));
        }
    }

}
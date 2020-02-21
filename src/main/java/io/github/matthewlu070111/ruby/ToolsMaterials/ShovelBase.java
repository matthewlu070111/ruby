package io.github.matthewlu070111.ruby.ToolsMaterials;

import io.github.matthewlu070111.ruby.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, -1, -2.2f, new Item.Settings().group(Main.RUBY_GROUP));
    }
    
}
package io.github.matthewlu070111.ruby.ToolsMaterials;

import io.github.matthewlu070111.ruby.Main;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial material) {
        super(material, -1, -2.2f, new Item.Settings().group(Main.RUBY_GROUP));
    }
    
}
package io.github.matthewlu070111.ruby.ToolsMaterials;

import io.github.matthewlu070111.ruby.Main;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial material) {
        super(material, -2.2f, new Item.Settings().group(Main.RUBY_GROUP));
    }
    
}
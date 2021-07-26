package io.github.matthewlu070111.ruby;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyTool implements ToolMaterial {

    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeed() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 10.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

}
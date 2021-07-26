package io.github.matthewlu070111.ruby;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class RubyArmor implements ArmorMaterial {
    public static final int[] BASE_DURABILITY = new int[]{20,30,25,15};
    public static final int[] BASE_PROTECTION_AMOUNT = new int[]{2,5,6,3};

    @Override
    public int getDurability(EquipmentSlot arg0) {
        return BASE_DURABILITY[arg0.getEntitySlotId()]*25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return BASE_PROTECTION_AMOUNT[arg0.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 5000;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return "ruby";
    }

    @Override
    public float getToughness() {
        return 30;
    }

}
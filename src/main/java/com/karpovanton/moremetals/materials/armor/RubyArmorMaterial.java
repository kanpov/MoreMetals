package com.karpovanton.moremetals.materials.armor;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * Ruby armor material
 */
public class RubyArmorMaterial implements ArmorMaterial {
    // Material instance
    public static final RubyArmorMaterial INSTANCE = new RubyArmorMaterial();

    private static final int[] DURABILITY_VALUES = new int[] {550, 600, 650, 600};
    private static final int[] PROTECTION_VALUES = new int[] {3, 5, 6, 4};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.RUBY_INGOT);
    }

    @Override
    public String getName() {
        return "ruby";
    }

    @Override
    public float getToughness() {
        return 1.4f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}

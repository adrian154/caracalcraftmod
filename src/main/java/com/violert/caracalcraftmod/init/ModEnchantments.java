package com.violert.caracalcraftmod.init;

import java.util.ArrayList;
import java.util.List;

import com.violert.caracalcraftmod.enchantments.Ablaze;
import com.violert.caracalcraftmod.enchantments.EnchantmentBase;
import com.violert.caracalcraftmod.enchantments.SandStrider;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ModEnchantments {

	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	public static final Enchantment SAND_STRIDER = new SandStrider("sand_strider", Rarity.COMMON, EnumEnchantmentType.ARMOR_FEET, new EntityEquipmentSlot[] {EntityEquipmentSlot.FEET});
	public static final Enchantment ABLAZE = new Ablaze("ablaze", Rarity.RARE, EnumEnchantmentType.ARMOR, new EntityEquipmentSlot[] {EntityEquipmentSlot.CHEST, EntityEquipmentSlot.FEET, EntityEquipmentSlot.HEAD, EntityEquipmentSlot.LEGS});
	
}

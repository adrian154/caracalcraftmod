package com.violert.caracalcraftmod.enchantments;

import com.violert.caracalcraftmod.init.ModEnchantments;
import com.violert.caracalcraftmod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentBase extends Enchantment {

	public EnchantmentBase(String name, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot[] equipmentSlots) {
		
		super(rarity, type, equipmentSlots);
		
		this.setName(name);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
		
		ModEnchantments.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 1*enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel)+100;
	}
	
	@Override
	public int getMaxLevel() {
		return 5;
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return false;
	}
	
}

package com.violert.caracalcraftmod.items;

public class ItemDurabilityBase extends ItemBase {

	public ItemDurabilityBase(String name, int maxDurability, int maxStackSize) {
		
		super(name);
		
		this.setMaxDamage(maxDurability);
		this.setMaxStackSize(maxStackSize);
		
	}

}

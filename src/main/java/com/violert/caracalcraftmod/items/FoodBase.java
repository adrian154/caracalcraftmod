package com.violert.caracalcraftmod.items;

import com.violert.caracalcraftmod.Main;
import com.violert.caracalcraftmod.init.ModItems;
import com.violert.caracalcraftmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{

	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}

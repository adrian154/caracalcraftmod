package com.violert.caracalcraftmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ModItems.FRIED_EGG, 1), 1.5f);
		
		GameRegistry.addSmelting(Items.GOLD_INGOT, new ItemStack(Items.BLAZE_ROD, 1), 5f);
		GameRegistry.addSmelting(Blocks.DIRT, new ItemStack(Blocks.SOUL_SAND, 1), 5f);
		
		GameRegistry.addSmelting(ModItems.GUANO, new ItemStack(ModItems.SALTPETER, 1), 2f);
		
		GameRegistry.addSmelting(ModItems.MILK_CURDS, new ItemStack(ModItems.CHEESE),  2f);		
		
	}
	
}

package com.violert.caracalcraftmod.util.handler;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class CraftingHandler {

	public static void registerRecipes() {
		
	}
	
	public static void removeRecipes() {
		
		 ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
		 ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValues());	
		 
		 for(IRecipe recipe : recipes) {
			 
			 ItemStack outputStack = recipe.getRecipeOutput();
			 NonNullList<Ingredient> inputStack = recipe.getIngredients();
			 if(outputStack.getItem() == Item.getItemFromBlock(Blocks.TNT)) {
				 recipeRegistry.remove(recipe.getRegistryName());
			 }
			 
		 }
		 
	}
	
}

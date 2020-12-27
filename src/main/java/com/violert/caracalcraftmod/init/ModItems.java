package com.violert.caracalcraftmod.init;

import java.util.ArrayList;
import java.util.List;

import com.violert.caracalcraftmod.items.FoodBase;
import com.violert.caracalcraftmod.items.FoodEffectBase;
import com.violert.caracalcraftmod.items.ItemBase;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TEST_ITEM = new ItemBase("test");
	
	public static final Item FRIED_EGG = new FoodBase("fried_egg", 5, 4f, false);
	public static final Item FISH_AND_FISH = new FoodBase("fish_and_fish", 11, 12f, true);
	
	public static final Item GUANO = new FoodEffectBase("guano", 1, 1f, false, new PotionEffect(MobEffects.POISON, (60*20), 1, false, true));
	public static final Item SALTPETER = new ItemBase("saltpeter");
	
	public static final Item MILK_CURDS = new FoodBase("milk_curds", 4, 1f, false);
	public static final Item CHEESE = new FoodBase("cheese", 6, 3f, false);
	
}

package com.violert.caracalcraftmod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class XPCube extends FoodBase {

	
	public XPCube(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
		this.setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote) {
			player.addExperienceLevel(1);
		}
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}

}

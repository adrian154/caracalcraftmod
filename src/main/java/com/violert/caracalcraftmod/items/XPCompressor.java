package com.violert.caracalcraftmod.items;

import com.violert.caracalcraftmod.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class XPCompressor extends ItemDurabilityBase {

	public XPCompressor(String name, int maxDurability, int maxStackSize) {
		super(name, maxDurability, maxStackSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		
		ItemStack item = player.getHeldItem(hand);
		
		if(!world.isRemote) {
			if(player.experienceLevel > 0 && player.inventory.getFirstEmptyStack() != -1) {
				player.addExperienceLevel(-1);
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.XP_CUBE, 1));
				item.damageItem(1, player);
			}
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

}

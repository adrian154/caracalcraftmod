package com.violert.caracalcraftmod.enchantments;

import com.violert.caracalcraftmod.init.ModEnchantments;
import com.violert.caracalcraftmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class AutoSmelting extends EnchantmentBase {

	public AutoSmelting(String name, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot[] equipmentSlots) {
		
		super(name, rarity, type, equipmentSlots);
		
	}
	
	@SubscribeEvent
	public static void effectAutoSmelting(BlockEvent.HarvestDropsEvent breakEvent) {
		
		EntityLivingBase player = breakEvent.getHarvester();
		Block brokenBlock = breakEvent.getState().getBlock();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(ModEnchantments.AUTO_SMELTING, player);
		BlockPos pos = player.getPosition();
		World world = player.world;
		
		if(level > 0) {
			String brokenBlockName = brokenBlock.getRegistryName().toString();
			System.out.println(brokenBlockName);
		}
		
	}
	
	@Override
	public int getMaxLevel() {
		return 1;
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 15*enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel)+100;
	}
	
}

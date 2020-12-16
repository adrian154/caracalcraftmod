package com.violert.caracalcraftmod.enchantments;

import com.violert.caracalcraftmod.init.ModEnchantments;
import com.violert.caracalcraftmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class AutoSmelting extends EnchantmentBase {

	public AutoSmelting(String name, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot[] equipmentSlots) {
		
		super(name, rarity, type, equipmentSlots);
		
	}
	
	@SubscribeEvent
	public static void effectAblaze(BlockEvent.HarvestDropsEvent event) {
		
		EntityPlayer player = event.getHarvester();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(ModEnchantments.AUTO_SMELTING, player);
		BlockPos pos = player.getPosition();
		World world = player.world;
		
		try {
			String brokenBlockName = event.getState().getBlock().getRegistryName().toString();
			System.out.println(brokenBlockName);
			
			if(level > 0) {
				switch(brokenBlockName) {
					case "minecraft:iron_ore":
						event.getDrops().clear();
						event.getDrops().add(new ItemStack(Items.IRON_INGOT, 1));
						break;
					case "minecraft:gold_ore":
						event.getDrops().clear();
						event.getDrops().add(new ItemStack(Items.GOLD_INGOT, 1));
						break;
					default:
						
				}
			}
		}
		catch(Exception e) {
			
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

package com.violert.caracalcraftmod.enchantments;

import com.violert.caracalcraftmod.init.ModEnchantments;
import com.violert.caracalcraftmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class SandStrider extends EnchantmentBase {

	public SandStrider(String name, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot[] equipmentSlots) {
		
		super(name, rarity, type, equipmentSlots);
		
	}
	
	@SubscribeEvent
	public static void effectSandStrider(LivingUpdateEvent event) {
		
		if(event.getEntityLiving() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)event.getEntityLiving();
			int level = EnchantmentHelper.getMaxEnchantmentLevel(ModEnchantments.SAND_STRIDER, player);
			BlockPos pos = player.getPosition();
			World world = event.getEntity().world;
			
			BlockPos posBelow = pos.down();
			IBlockState blockStateBelow = player.world.getBlockState(posBelow);
			if(Block.isEqualTo(blockStateBelow.getBlock(), Blocks.SAND) && level > 0) {
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, (1*20), level-1, false, false));
			}
		}
		
	}
	
	@Override
	public int getMaxLevel() {
		return 2;
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

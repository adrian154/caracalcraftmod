package com.violert.caracalcraftmod.util.handler;

import com.violert.caracalcraftmod.init.ModItems;

import net.minecraft.entity.passive.EntityBat;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobEventHandler {

	@SubscribeEvent
	public void onMobDeath(LivingDeathEvent event) {
		
		if(event.getEntity() instanceof EntityBat) {
			if(event.getEntity().getEntityWorld().isRemote == false) {
				double chance = Math.random();
				if(chance < 0.5) {
					event.getEntity().dropItem(ModItems.GUANO, 1);
				} else {
					event.getEntity().dropItem(ModItems.GUANO, 2);
				}
			}
		}
		
	}
	
}

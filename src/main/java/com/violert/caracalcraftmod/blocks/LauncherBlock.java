package com.violert.caracalcraftmod.blocks;

import com.violert.caracalcraftmod.init.ModBlocks;
import com.violert.caracalcraftmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class LauncherBlock extends BlockFormat{
	
	static double launchVel;
	
	public LauncherBlock(String name, Material material, SoundType soundType, float hardness, float resistance, String harvestTool, int harvestLevel, double launchVel) {
		
		super(name, material, soundType, hardness, resistance, harvestTool, harvestLevel);
		this.launchVel = launchVel;
		
	}
	
	@SubscribeEvent
	public static void effectLauncher(LivingUpdateEvent event) {
		Entity entity = event.getEntity();
		BlockPos pos = entity.getPosition();
		World world = entity.world;
		if(Block.isEqualTo(world.getBlockState(pos.down()).getBlock(), ModBlocks.LAUNCHER) && entity.onGround) {
			//System.out.println("stepped on launcher");
			entity.addVelocity(0, launchVel, 0);
		}
	}

}

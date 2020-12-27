package com.violert.caracalcraftmod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.violert.caracalcraftmod.init.ModBlocks;
import com.violert.caracalcraftmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class MeatBlock extends BlockFormat {

	public MeatBlock(String name, Material material, SoundType soundType, float hardness, float resistance, String harvestTool, int harvestLevel) {
		super(name, material, soundType, hardness, resistance, harvestTool, harvestLevel);
		// TODO Auto-generated constructor stub
	}
	
	@SubscribeEvent
	public static void takeNoFallDamage(LivingFallEvent event) {
		
		Entity entity = event.getEntity();
		BlockPos pos = entity.getPosition();
		World world = entity.world;
		
		List<Block> meatBlocks = new ArrayList<Block>();
		meatBlocks.add(ModBlocks.BEEF_BLOCK);
		meatBlocks.add(ModBlocks.PORK_BLOCK);
		meatBlocks.add(ModBlocks.CHICKEN_BLOCK);
		
		for(Block meatBlock : meatBlocks) {
			if(Block.isEqualTo(world.getBlockState(pos.down()).getBlock(), meatBlock)) {
				event.setDistance(0f);
				event.setCanceled(true);
			}
		}
		
	}

}

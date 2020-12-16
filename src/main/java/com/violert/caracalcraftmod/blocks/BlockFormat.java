package com.violert.caracalcraftmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockFormat extends BlockBase {

	public BlockFormat(String name, Material material, SoundType soundType, float hardness, float resistance, String harvestTool, int harvestLevel) {
		
		super(name, material);
		
		setSoundType(soundType);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestTool, harvestLevel);
		
	}

}

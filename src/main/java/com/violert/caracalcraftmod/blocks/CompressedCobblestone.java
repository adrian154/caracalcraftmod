package com.violert.caracalcraftmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CompressedCobblestone extends BlockBase {

	public CompressedCobblestone(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(4.0f);
		setResistance(16.0f);
		setHarvestLevel("pickaxe", 1);
		
	}

}

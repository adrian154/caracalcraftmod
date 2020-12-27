package com.violert.caracalcraftmod.init;

import java.util.ArrayList;
import java.util.List;

import com.violert.caracalcraftmod.blocks.BlockBase;
import com.violert.caracalcraftmod.blocks.BlockFormat;
import com.violert.caracalcraftmod.blocks.CompressedCobblestone;
import com.violert.caracalcraftmod.blocks.LauncherBlock;
import com.violert.caracalcraftmod.blocks.MeatBlock;
import com.violert.caracalcraftmod.blocks.TestBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TEST_BLOCK = new TestBlock("test_block", Material.IRON);
	
	public static final Block COMPRESSED_COBBLESTONE = new CompressedCobblestone("compressed_cobblestone", Material.IRON);
	
	public static final Block BEEF_BLOCK = new MeatBlock("beef_block", Material.GRASS, SoundType.SLIME, 0.25f, 1.0f, null, 0);
	public static final Block PORK_BLOCK = new MeatBlock("pork_block", Material.GRASS, SoundType.SLIME, 0.25f, 1.0f, null, 0);
	public static final Block CHICKEN_BLOCK = new MeatBlock("chicken_block", Material.GRASS, SoundType.SLIME, 0.25f, 1.0f, null, 0);
	
	public static final Block LAUNCHER = new LauncherBlock("launcher", Material.IRON, SoundType.METAL, 1f, 1f, "pickaxe", 2, 2);
	
	
}

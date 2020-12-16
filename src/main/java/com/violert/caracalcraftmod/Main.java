package com.violert.caracalcraftmod;

import com.violert.caracalcraftmod.init.ModRecipes;
import com.violert.caracalcraftmod.proxy.CommonProxy;
import com.violert.caracalcraftmod.util.Reference;
import com.violert.caracalcraftmod.util.handler.MobEventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		ModRecipes.init();
		MinecraftForge.EVENT_BUS.register(new MobEventHandler());
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
		
	}

}
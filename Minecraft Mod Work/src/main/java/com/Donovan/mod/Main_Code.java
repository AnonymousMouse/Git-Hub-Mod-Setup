package com.Donovan.mod;

import com.Donovan.init.ModItems;

import cpw.mods.fml.common.Mod;
import com.Donovan.mod.CommonProxy;
import com.Donovan.mod.block.ModBlocks;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main_Code.MODID, name = Main_Code.NAME, version = Main_Code.VERSION)

public class Main_Code {
	@SidedProxy(clientSide="com.Donovan.mod.ClientProxy", serverSide="com.Donovan.com.ServerProxy")
	public static CommonProxy proxy;

	public static final String NAME = "Tutorial Mod";
    public static final String MODID = "tutorial";
    public static final String VERSION = "1.7.10-R1";
 
    @Mod.Instance("tutorial")
    public static Main_Code instance;
	
 
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ModItems.init();
    	ModBlocks.init();
    	
		proxy.preInit(event);
    }
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
        
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
        
    }

}


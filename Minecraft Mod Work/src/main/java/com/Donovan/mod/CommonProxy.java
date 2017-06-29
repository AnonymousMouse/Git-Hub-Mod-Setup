package com.Donovan.mod;

import com.Donovan.init.ModItems;
import com.Donovan.mod.block.ModBlocks;
import com.Donovan.mod.crafting.*;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
    	 ModCrafting.init();
    	    
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}

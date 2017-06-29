package com.Donovan.init;

import com.Donovan.mod.Main_Code;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	 public static Item red_diamond;
	 
	 public static void init()
	    {
red_diamond = new Item().setUnlocalizedName("red_diamond").setTextureName(Main_Code.MODID + ":red_diamond").setCreativeTab(CreativeTabs.tabMaterials);
GameRegistry.registerItem(red_diamond, red_diamond.getUnlocalizedName());

	    }

}

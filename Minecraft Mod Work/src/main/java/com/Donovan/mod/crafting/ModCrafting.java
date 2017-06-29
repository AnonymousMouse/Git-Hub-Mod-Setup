package com.Donovan.mod.crafting;
import com.Donovan.init.ModItems;
import com.Donovan.mod.block.ModBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class ModCrafting {
	public static final void init() {
		 GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), "##", "##", '#', ModItems.red_diamond);
		    
		
	}
	

}

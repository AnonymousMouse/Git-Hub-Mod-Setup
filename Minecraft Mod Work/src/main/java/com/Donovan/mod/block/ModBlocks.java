package com.Donovan.mod.block;

import com.Donovan.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public final class ModBlocks {

    public static Block tutorialBlock;

    public static final void init() {
    GameRegistry.registerBlock(tutorialBlock = new BasicBlock(Material.iron, "Blue Sun"), "Blue Sun");
   
   
    
    
    
    
    }
    
        
}


package com.Donovan.mod.block;

import com.Donovan.mod.Main_Code;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block{

	protected BasicBlock(Material brick, String unlocalizedName) {
		super(brick);
		this.setBlockName("Blue Glowstone");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(Main_Code.MODID + ":" + unlocalizedName);
		this.setHardness(1.5F);
		this.setLightLevel(1F);
		this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
	}

}

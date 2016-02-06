package com.temporalreality.trweaks.init;

import com.temporalreality.trtweaks.blocks.EnderOre;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block EnderOre;
	
	public static void initEnderOre(int least) {
		GameRegistry.registerBlock(EnderOre = new EnderOre(least), "enderOre");
	}
	
    public static final void init() {
    }

}

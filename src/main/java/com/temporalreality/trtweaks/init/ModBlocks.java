package com.temporalreality.trtweaks.init;

import com.temporalreality.trtweaks.TRTweaks;
import com.temporalreality.trtweaks.blocks.EnderOre;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block enderOre;
	
    public static void init() {
		GameRegistry.registerBlock(enderOre = new EnderOre(TRTweaks.leastDrops), "enderOre");
    }

}

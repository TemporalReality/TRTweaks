package com.temporalreality.trtweaks;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.temporalreality.trtweaks.init.ModBlocks;
import com.temporalreality.trtweaks.init.ModWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public static Logger LOGGER = LogManager.getLogger(TRTweaks.MODID);
	
	public void preInit(FMLPreInitializationEvent e) {
		LOGGER.log(Level.INFO, "Starting config init");
		ConfigHandler.init(e.getSuggestedConfigurationFile());
		LOGGER.log(Level.INFO, "Finished config init");
		LOGGER.log(Level.INFO, "Starting blocks init");
		ModBlocks.init();
		LOGGER.log(Level.INFO, "Finished blocks init");
	}
	
	public void init(FMLInitializationEvent e) {
		LOGGER.log(Level.INFO, "Starting WorldGen setup");
		GameRegistry.registerWorldGenerator(new ModWorldGen(TRTweaks.ymin, TRTweaks.ymax, TRTweaks.veinSize, TRTweaks.veinNumber), 1);
		LOGGER.log(Level.INFO, "Finished WorldGen setup");
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}

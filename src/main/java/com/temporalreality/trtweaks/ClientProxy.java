package com.temporalreality.trtweaks;

import org.apache.logging.log4j.Level;

import com.temporalreality.trweaks.init.RenderInv;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		
		LOGGER.log(Level.INFO, "Setting up item and block rendering");
		RenderInv.init();
		LOGGER.log(Level.INFO, "Finished setting up item and block rendering");
	}
	
}

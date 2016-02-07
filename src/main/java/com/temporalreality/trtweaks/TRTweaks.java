/*
 * Gunpowder ore.
 * Some way of getting enderpearls. Ender Clam might be hard (I'm only a beginner modder but I'll try). Maybe a plant? With the seed having a drop chance from grass.
 * Add bones as drop from entities
 * Rotten flesh from mobs too? Or something else?
 * For now I'll ignore witches and zombie pigmen. Maybe in a later version
 */

package com.temporalreality.trtweaks;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=TRTweaks.MODID, name=TRTweaks.MODNAME, version=TRTweaks.VERSION)

public class TRTweaks {
	public static final String MODID = "TRTweaks";
	public static final String MODNAME = "TRTweaks";
	public static final String VERSION = "1.8.9-1.0.0";
	
	@Mod.Instance
	public static TRTweaks instance;
	
	public static Logger LOGGER = LogManager.getLogger(MODID);
	
	@SidedProxy(clientSide="com.temporalreality.trtweaks.ClientProxy", serverSide="com.temporalreality.trtweaks.CommonProxy")
	public static CommonProxy proxy;
	
	public static int leastDrops;
	public static int ymin;
	public static int ymax;
	public static int veinSize;
	public static int veinNumber;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.log(Level.INFO, "Starting Pre-Init");
		proxy.preInit(event);
		LOGGER.log(Level.INFO, "Finished Pre-Init");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.log(Level.INFO, "Starting Init");
	    proxy.init(event);
	    LOGGER.log(Level.INFO, "Finished Init");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}

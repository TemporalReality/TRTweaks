package com.temporalreality.trtweaks;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	static String category;
	static ArrayList<String> generalOrder = new ArrayList<String>(Arrays.asList("YMin", "YMax", "MinDrop", "VeinSize", "VeinNumber"));
	
	public static void init(File configFile) {
		config = new Configuration(configFile);
		loadConfig();
		
	}
	    
	private static void loadConfig() {
		loadGeneralSettings();
		if (config.hasChanged()) {
			config.save();
		}
	}
	
	private static void loadGeneralSettings() {
		config.setCategoryPropertyOrder("General" , generalOrder);
		category = "General";
		TRTweaks.ymin = config.getInt("YMin", category, 0, 0, 256, "The minimum y level Ender Ore can spawn at [NEEDS TO BE LOWER THAN MAX]");
		TRTweaks.ymax = config.getInt("YMax", category, 48, 0, 256, "The maximum y level Ender Ore can spawn at [NEEDS TO BE HIGHER THAN MIN]");
		TRTweaks.least = config.getInt("MinDrop", category, 1, 1, 20, "The minimum drop from the ore");
		TRTweaks.veinSize = config.getInt("VeinSize", category, 6, 1, 20, "How many ores per vein [DOESN'T WORK WELL BELOW 5]");
		TRTweaks.veinNumber = config.getInt("VeinNumber", category, 10, 1, 20, "How many veins per chunk?");
	}
}

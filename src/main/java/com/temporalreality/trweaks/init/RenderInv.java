package com.temporalreality.trweaks.init;

import com.temporalreality.trtweaks.TRTweaks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderInv {
	
	public static void init() {
		
//		InventoryBlockRender(ModBlocks.demoBlock, "demoBlock");
		InventoryBlockRender(ModBlocks.EnderOre, "enderOre");
		
//		InventoryItemRender(ModItems.demoItem, "demoItem");
    }

    public static void InventoryBlockRender(Block block, String blockName) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(TRTweaks.MODID + ":" + blockName, "inventory"));
    }

    public static void InventoryItemRender(Item item, String itemName) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TRTweaks.MODID + ":" + itemName, "inventory"));
    }
}

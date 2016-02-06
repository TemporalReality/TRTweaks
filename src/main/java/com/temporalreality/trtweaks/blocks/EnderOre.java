package com.temporalreality.trtweaks.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EnderOre extends Block {
	
	public String unlocalizedName = "enderOre";
	
	private Item drop;
	private int meta;
	
	private int least;
	
	public EnderOre(int least) {
		super(Material.rock);
		this.least = least;
		this.drop = Items.ender_pearl;
		this.meta = 0;
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(4);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
		return this.drop;
	}

	@Override
	public int damageDropped(IBlockState state) {
		return this.meta;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
		if (fortune != 0) {
			return this.least + random.nextInt(fortune);
		}
		return this.least;
	}

}

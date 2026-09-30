/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realisticcooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.realisticcooking.item.PotatoSoupItem;
import net.mcreator.realisticcooking.RealisticCookingMod;

public class RealisticCookingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RealisticCookingMod.MODID);
	public static final RegistryObject<Item> COOKING_STATION;
	public static final RegistryObject<Item> POTATO_SOUP;
	static {
		COOKING_STATION = block(RealisticCookingModBlocks.COOKING_STATION);
		POTATO_SOUP = REGISTRY.register("potato_soup", PotatoSoupItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}
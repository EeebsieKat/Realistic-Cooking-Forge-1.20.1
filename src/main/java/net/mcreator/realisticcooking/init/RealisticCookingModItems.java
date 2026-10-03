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

import net.mcreator.realisticcooking.item.*;
import net.mcreator.realisticcooking.RealisticCookingMod;

public class RealisticCookingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RealisticCookingMod.MODID);
	public static final RegistryObject<Item> COOKING_STATION;
	public static final RegistryObject<Item> BEEF_SOUP;
	public static final RegistryObject<Item> CHICKEN_SOUP;
	public static final RegistryObject<Item> PORK_SOUP;
	public static final RegistryObject<Item> SALMON_SOUP;
	public static final RegistryObject<Item> COD_SOUP;
	public static final RegistryObject<Item> POTATO_SOUP;
	public static final RegistryObject<Item> CARROT_SOUP;
	public static final RegistryObject<Item> RABBIT_SOUP;
	public static final RegistryObject<Item> MUTTON_SOUP;
	static {
		COOKING_STATION = block(RealisticCookingModBlocks.COOKING_STATION);
		BEEF_SOUP = REGISTRY.register("beef_soup", BeefSoupItem::new);
		CHICKEN_SOUP = REGISTRY.register("chicken_soup", ChickenSoupItem::new);
		PORK_SOUP = REGISTRY.register("pork_soup", PorkSoupItem::new);
		SALMON_SOUP = REGISTRY.register("salmon_soup", SalmonSoupItem::new);
		COD_SOUP = REGISTRY.register("cod_soup", CodSoupItem::new);
		POTATO_SOUP = REGISTRY.register("potato_soup", PotatoSoupbItem::new);
		CARROT_SOUP = REGISTRY.register("carrot_soup", CarrotSoupItem::new);
		RABBIT_SOUP = REGISTRY.register("rabbit_soup", RabbitSoupItem::new);
		MUTTON_SOUP = REGISTRY.register("mutton_soup", MuttonSoupItem::new);
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
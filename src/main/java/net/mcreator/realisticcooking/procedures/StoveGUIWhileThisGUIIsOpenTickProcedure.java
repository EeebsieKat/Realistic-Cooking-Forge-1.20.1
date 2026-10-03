package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;

public class StoveGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_BEEF) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Steaky with a chance of "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ ", and"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Chicken Bones, "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu33 ? _menu33.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ ", and"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu35 ? _menu35.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_PORKCHOP) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu42 ? _menu42.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Oink, "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ ", and"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu57 ? _menu57.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_SALMON) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu59 ? _menu59.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu61 ? _menu61.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu63 ? _menu63.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu65 ? _menu65.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu65 ? _menu65.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu67 ? _menu67.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu67 ? _menu67.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu69 ? _menu69.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu69 ? _menu69.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Red Fish, "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu71 ? _menu71.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ ", and"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu73 ? _menu73.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu76 ? _menu76.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_COD) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeildv",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu80 ? _menu80.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu82 ? _menu82.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu86 ? _menu86.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu86 ? _menu86.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "White Fish, "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu90 ? _menu90.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ ", and"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu92 ? _menu92.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu95 ? _menu95.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu97 ? _menu97.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu99 ? _menu99.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
										.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu101 ? _menu101.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu103 ? _menu103.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu103 ? _menu103.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu105 ? _menu105.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu105 ? _menu105.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu107 ? _menu107.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu107 ? _menu107.getSlots().get(3).getItem() : ItemStack.EMPTY)
														.getItem().getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Rotten Tater, "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu109 ? _menu109.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ ", and" + ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu111 ? _menu111.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu114 ? _menu114.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.CARROT) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu116 ? _menu116.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu118 ? _menu118.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu120 ? _menu120.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu122 ? _menu122.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu122 ? _menu122.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu124 ? _menu124.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu124 ? _menu124.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu126 ? _menu126.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu126 ? _menu126.getSlots().get(3).getItem() : ItemStack.EMPTY)
														.getItem().getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Rabbit Food, "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu128 ? _menu128.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ ", and" + ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu130 ? _menu130.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu133 ? _menu133.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_RABBIT) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu135 ? _menu135.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu137 ? _menu137.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu139 ? _menu139.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu141 ? _menu141.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu141 ? _menu141.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu143 ? _menu143.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu143 ? _menu143.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu145 ? _menu145.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu145 ? _menu145.getSlots().get(3).getItem() : ItemStack.EMPTY)
														.getItem().getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Rabbit,"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu147 ? _menu147.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ ", and" + ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu149 ? _menu149.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu152 ? _menu152.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_MUTTON) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild",
						(((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu154 ? _menu154.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
								.replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu156 ? _menu156.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "\n"
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu158 ? _menu158.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "\n" + "Soup" + "Food Value:" + "\n"
								+ (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu160 ? _menu160.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu160 ? _menu160.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu162 ? _menu162.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu162 ? _menu162.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu164 ? _menu164.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu164 ? _menu164.getSlots().get(3).getItem() : ItemStack.EMPTY)
														.getItem().getFoodProperties().getNutrition()
												: 0))
								+ "\n" + "Baaaaahh, "
								+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu166 ? _menu166.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ ", and" + ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu168 ? _menu168.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
										.getString()).replace("[", "")).replace("]", ""))
								+ "."),
						true);
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "textfeild", "nothin here", true);
		}
	}
}
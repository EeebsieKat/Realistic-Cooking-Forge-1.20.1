package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;
import net.mcreator.realisticcooking.init.RealisticCookingModItems;

public class StoveCraftingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Items.BOWL) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
						if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
							_menu.getSlots().get(0).remove(1);
							_menu.getSlots().get(1).remove(1);
							_menu.getSlots().get(2).remove(1);
							_menu.getSlots().get(6).remove(1);
							ItemStack _setstack13 = new ItemStack(RealisticCookingModItems.POTATO_SOUP.get()).copy();
							_setstack13.setCount(getAmountInGUISlot(entity, 7) + 1);
							_menu.getSlots().get(7).set(_setstack13);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}
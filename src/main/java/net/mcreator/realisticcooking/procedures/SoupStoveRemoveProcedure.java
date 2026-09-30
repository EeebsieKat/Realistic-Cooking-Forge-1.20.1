package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;

public class SoupStoveRemoveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
			_menu.getSlots().get(0).remove(1);
			_menu.getSlots().get(1).remove(1);
			_menu.getSlots().get(2).remove(1);
			_menu.getSlots().get(3).remove(1);
			_menu.getSlots().get(4).remove(1);
			_menu.getSlots().get(5).remove(1);
			_player.containerMenu.broadcastChanges();
		}
	}
}
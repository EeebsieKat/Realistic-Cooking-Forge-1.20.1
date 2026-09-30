package net.mcreator.realisticcooking.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.realisticcooking.world.inventory.StoveGUIMenu;
import net.mcreator.realisticcooking.network.StoveGUIButtonMessage;
import net.mcreator.realisticcooking.init.RealisticCookingModScreens;
import net.mcreator.realisticcooking.RealisticCookingMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class StoveGUIScreen extends AbstractContainerScreen<StoveGUIMenu> implements RealisticCookingModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_craft;
	private static final ResourceLocation BACKGROUND = new ResourceLocation("realistic_cooking:textures/screens/stove_gui.png");

	public StoveGUIScreen(StoveGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 192;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.stove_gui.label_stove"), 69, 2, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_craft = Button.builder(Component.translatable("gui.realistic_cooking.stove_gui.button_craft"), e -> {
			int x = StoveGUIScreen.this.x;
			int y = StoveGUIScreen.this.y;
			if (true) {
				RealisticCookingMod.PACKET_HANDLER.sendToServer(new StoveGUIButtonMessage(0, x, y, z));
				StoveGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 83, 50, 20).build();
		this.addRenderableWidget(button_craft);
	}
}
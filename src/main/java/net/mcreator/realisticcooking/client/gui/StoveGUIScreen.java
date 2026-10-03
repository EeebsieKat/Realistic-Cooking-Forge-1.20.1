package net.mcreator.realisticcooking.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

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
	private EditBox textfeild;
	private Button button_craft;
	private static final ResourceLocation IMAGE_0 = new ResourceLocation("realistic_cooking:textures/screens/stove_gui.png");

	public StoveGUIScreen(StoveGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 428;
		this.imageHeight = 241;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("textfeild"))
				textfeild.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		textfeild.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(IMAGE_0, this.leftPos + 0, this.topPos + -1, 0, 0, 428, 241, 428, 241);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (textfeild.isFocused())
			return textfeild.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String textfeildValue = textfeild.getValue();
		super.resize(minecraft, width, height);
		textfeild.setValue(textfeildValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		textfeild = new EditBox(this.font, this.leftPos + 45, this.topPos + 42, 58, 20, Component.translatable("gui.realistic_cooking.stove_gui.textfeild"));
		textfeild.setMaxLength(8192);
		textfeild.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "textfeild", content, false);
		});
		textfeild.setHint(Component.translatable("gui.realistic_cooking.stove_gui.textfeild"));
		this.addWidget(this.textfeild);
		button_craft = Button.builder(Component.translatable("gui.realistic_cooking.stove_gui.button_craft"), e -> {
			int x = StoveGUIScreen.this.x;
			int y = StoveGUIScreen.this.y;
			if (true) {
				RealisticCookingMod.PACKET_HANDLER.sendToServer(new StoveGUIButtonMessage(0, x, y, z));
				StoveGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 170, 50, 20).build();
		this.addRenderableWidget(button_craft);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		textfeild.tick();
	}
}
package net.swutm.morenugget;

import net.fabricmc.api.ModInitializer;
import net.swutm.morenugget.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class morenugget implements ModInitializer {
	public static final String MOD_ID = "morenugget";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

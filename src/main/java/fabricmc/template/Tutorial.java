package fabricmc.template;

import fabricmc.template.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tutorial implements ModInitializer {

	/**
	 * calling Item registration
	 */
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
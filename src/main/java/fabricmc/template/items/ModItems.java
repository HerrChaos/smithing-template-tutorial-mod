package fabricmc.template.items;

import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    /**
     *  adding a new SmithingTemplateItem named "TUTORIAL_ARMOR_TRIM" with the MODID as "tutorial" and trimid as "tutorial_trim"
     */
    public static final Item TUTORIAL_ARMOR_TRIM = SmithingTemplateItem.of(new Identifier("tutorial", "tutorial_armor_trim"));
    /**
     * registering said Item with MODID "tutorial" and name "tutorial_armor_trim"
     */
    public static void registerModItems() {
        Registry.register(Registries.ITEM, new Identifier("tutorial", "tutorial_armor_trim"), TUTORIAL_ARMOR_TRIM);
    }
}

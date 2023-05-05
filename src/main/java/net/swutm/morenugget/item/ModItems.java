package net.swutm.morenugget.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.morenugget.morenugget;

public class ModItems {
    public static final Item COAL_NUGGETS = registerItem("coal_nuggets",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item DIAMOND_NUGGETS = registerItem("diamond_nuggets",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item EMERALD_NUGGETS = registerItem("emerald_nuggets",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item LAPIS_NUGGETS = registerItem("lapis_nuggets",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item REDSTONE_NUGGETS = registerItem("redstone_nuggets",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item NETHERITE_NUGGETS = registerItem("netherite_nuggets",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item COPPER_NUGGEST = registerItem("copper_nuggets",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(morenugget.MOD_ID, name), item);
    }

    public static void registerModItems() {
        morenugget.LOGGER.debug("Registering Mod Items for " + morenugget.MOD_ID);
    }
}

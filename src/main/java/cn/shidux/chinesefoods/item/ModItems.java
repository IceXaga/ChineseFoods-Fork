package cn.shidux.chinesefoods.item;

import cn.shidux.chinesefoods.ChineseFoods;
import cn.shidux.chinesefoods.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
//这个类包含了所有由中国传统食品模组定义的食物和材料的物品注册。
public class ModItems {
    public static final Item DOUZHIR = registerItem("douzhir", new Item(new FabricItemSettings()
            .food(ModFoodComponents.DOUZHIR)));

    public static final Item FRIED_RING = registerItem("fired_ring", new Item(new FabricItemSettings()
            .food(ModFoodComponents.FRIED_RING)));

    public static final Item SALTED_VEGETABLE = registerItem("salted_vegetable", new Item(new FabricItemSettings()
            .food(ModFoodComponents.SALTED_VEGETABLE)));

    public static final Item MUNG_BEAN_SOUP = registerItem("mung_bean_soup", new Item(new FabricItemSettings()
            .food(ModFoodComponents.MUNG_BEAN_SOUP)));

    public static final Item FLOWER_CAKE = registerItem("flower_cake", new Item(new FabricItemSettings()
            .food(ModFoodComponents.FLOWER_CAKE)));

    public static final Item BAO_ZI = registerItem("bao_zi", new Item(new FabricItemSettings()
            .food(ModFoodComponents.BAO_ZI)));

    public static final Item ROUGAMO = registerItem("rougamo", new Item(new FabricItemSettings()
            .food(ModFoodComponents.ROUGAMO)));

    public static final Item PITA_BREAD_SOAKED_IN_LAMB_SOUP = registerItem("pita_bread_soaked_in_lamb_soup", new Item(new FabricItemSettings()
            .food(ModFoodComponents.PITA_BREAD_SOAKED_IN_LAMB_SOUP)));

    public static final Item MUNG_BEANS = registerItem("mung_beans", new Item(new FabricItemSettings()));
    public static final Item MUNGBEAN_SEEDS = registerItem("mungbean_seeds",
            new AliasedBlockItem(ModBlocks.MUNGBEAN_CROP, new FabricItemSettings()));

    public static final Item RUTABAGA = registerItem("rutabaga", new Item(new FabricItemSettings()));
    public static final Item RUTABAGA_SEEDS = registerItem("rutabaga_seeds",
            new AliasedBlockItem(ModBlocks.RUTABAGA_CROP, new FabricItemSettings()));

    public static final Item A_BOWL_OF_WATER = registerItem("a_bowl_of_water", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MUNG_BEANS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChineseFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChineseFoods.LOGGER.info("Registering Mod Items for" + ChineseFoods.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

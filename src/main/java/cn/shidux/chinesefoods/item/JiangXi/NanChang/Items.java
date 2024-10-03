package cn.shidux.chinesefoods.item.JiangXi.NanChang;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import cn.shidux.chinesefoods.ChineseFoods;
import net.minecraft.item.FoodComponent;


public class Items {
    // 南昌拌粉
    public static class NanchangMixFlourItem extends Item {
        public NanchangMixFlourItem() {
            super(new Item.Settings().group(ChineseFoods.MOD_ITEM_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()));
        }
    }
    // 辣椒炒辣椒
    public static class FryGreenAndRedPepper extends Item {
        public FryGreenAndRedPepper() {
            super(new Item.Settings().group(ChineseFoods.MOD_ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build()));
        }
    }

    public static final Item FRY_GREEN_AND_RED_PEPPER = new FryGreenAndRedPepper();
    public static final Item NANCHANG_MIX_FLOUR = new NanchangMixFlourItem();

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(ChineseFoods.MOD_ID, "nanchang_mix_flour"), NANCHANG_MIX_FLOUR);
        Registry.register(Registry.ITEM, new Identifier(ChineseFoods.MOD_ID, "fry_green_and_red_pepper"), FRY_GREEN_AND_RED_PEPPER);
    }
}
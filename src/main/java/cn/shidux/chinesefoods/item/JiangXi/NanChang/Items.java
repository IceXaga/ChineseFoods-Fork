package cn.shidux.chinesefoods.item.JiangXi.NanChang;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import cn.shidux.chinesefoods.ChineseFoods;
import net.minecraft.item.FoodComponent;

public class NanchangMixFlourItem extends Item {
    public NanchangMixFlourItem() {
        super(new Item.Settings().group(ChineseFoods.MOD_ITEM_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()));
    }

    // 注册物品
    public static final Item NANCHANGMIXFLOUR = new NanchangChaoFenItem();
    public static void registerItem() {
        Registry.register(Registry.ITEM, new Identifier(ChineseFoods.MOD_ID, "nanchangmixflour"), NANCHANG_MIXFLOUR);
    }
}
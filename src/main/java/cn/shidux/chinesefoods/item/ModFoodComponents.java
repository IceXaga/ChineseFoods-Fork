package cn.shidux.chinesefoods.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DOUZHIR = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100),0.15f)
            .build();

    public static final FoodComponent FRIED_RING = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent SALTED_VEGETABLE = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent MUNG_BEAN_SOUP = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent FLOWER_CAKE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent BAO_ZI = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent ROUGAMO = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent PITA_BREAD_SOAKED_IN_LAMB_SOUP = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.25f)
            .build();
}

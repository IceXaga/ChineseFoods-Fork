package cn.shidux.chinesefoods.datagen;

import cn.shidux.chinesefoods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class AdvancementsProvider extends FabricAdvancementProvider {
    public AdvancementsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        AdvancementEntry rootAdvancement = Advancement.Builder.create()
                .display(
                        ModItems.DOUZHIR,
                        Text.literal("这叫一个地道！"),
                        Text.literal("豆汁儿得配着焦圈儿吃！"),
                        new Identifier("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        true
                )
                .criterion("got_douzhir", InventoryChangedCriterion.Conditions.items(ModItems.DOUZHIR))
                .build(consumer, "chinesefoods" + "/root");

        AdvancementEntry gotMungBeanSoup = Advancement.Builder.create()
                .display(
                        ModItems.MUNG_BEAN_SOUP,
                        Text.literal("世界未解之谜"),
                        Text.literal("绿豆汤到底是绿色的还是红色的？"),
                        new Identifier("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        true
                )
                .criterion("got_mung_bean_soup", InventoryChangedCriterion.Conditions.items(ModItems.MUNG_BEAN_SOUP))
                .build(consumer, "chinesefoods" + "/got_mung_bean_soup");
    }
}

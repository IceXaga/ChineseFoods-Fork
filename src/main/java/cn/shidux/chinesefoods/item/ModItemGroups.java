package cn.shidux.chinesefoods.item;

import cn.shidux.chinesefoods.ChineseFoods; // 引入自定义模组的包和类
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup; // 引入Fabric API的ItemGroup构建器
import net.minecraft.item.ItemGroup; // 引入Minecraft的ItemGroup接口
import net.minecraft.item.ItemStack; // 引入Minecraft的ItemStack类，用于表示物品栈
import net.minecraft.registry.Registries; // 引入Minecraft的注册表管理类
import net.minecraft.registry.Registry; // 引入Minecraft的注册表类
import net.minecraft.text.Text; // 引入Minecraft的文本类
import net.minecraft.util.Identifier; // 引入Minecraft的标识符类

public class ModItemGroups {

    public static final ItemGroup CHINESE_FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChineseFoods.MOD_ID, "chinesefoods"), // 使用模组的ID和物品组的名称创建标识符
            FabricItemGroup.builder() // 使用Fabric的ItemGroup构建器开始构建
                    .displayName(Text.translatable("itemgroup.chinesefoods")) // 设置物品组的可翻译显示名称
                    .icon(() -> new ItemStack(ModItems.DOUZHIR)) // 设置物品组的图标为豆汁儿
                    .entries((displayContext, entries) -> { // 设置物品组中应包含的物品
                        // 添加所有食物和相关物品到物品组中
                        entries.add(ModItems.DOUZHIR);
                        entries.add(ModItems.FRIED_RING);
                        entries.add(ModItems.SALTED_VEGETABLE);
                        entries.add(ModItems.MUNG_BEAN_SOUP);
                        entries.add(ModItems.FLOWER_CAKE);
                        entries.add(ModItems.BAO_ZI);
                        entries.add(ModItems.ROUGAMO);
                        entries.add(ModItems.PITA_BREAD_SOAKED_IN_LAMB_SOUP);

                        // 添加食材和种子
                        entries.add(ModItems.MUNG_BEANS);
                        entries.add(ModItems.RUTABAGA);

                        entries.add(ModItems.MUNGBEAN_SEEDS);
                        entries.add(ModItems.RUTABAGA_SEEDS);

                        // 如果有其他需要添加到物品组的物品，也可以在这里添加
                        // entries.add(ModItems.item);

                        // 添加一碗水作为示例
                        entries.add(ModItems.A_BOWL_OF_WATER);
                    }).build()); // 完成构建并返回ItemGroup实例

    public static void registerItemGroups() {
        ChineseFoods.LOGGER.info("Registering Item Groups for " + ChineseFoods.MOD_ID); // 记录日志信息
    }
}
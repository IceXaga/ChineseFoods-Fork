package cn.shidux.chinesefoods.datagen;

import cn.shidux.chinesefoods.block.ModBlocks;
import cn.shidux.chinesefoods.block.custom.MungBeanCropBlock;
import cn.shidux.chinesefoods.block.custom.RutabagaCropBlock;
import cn.shidux.chinesefoods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.MUNGBEAN_CROP, MungBeanCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.RUTABAGA_CROP, RutabagaCropBlock.AGE, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DOUZHIR, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALTED_VEGETABLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUNG_BEAN_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOWER_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUNG_BEANS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUTABAGA, Models.GENERATED);
        itemModelGenerator.register(ModItems.A_BOWL_OF_WATER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAO_ZI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROUGAMO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PITA_BREAD_SOAKED_IN_LAMB_SOUP, Models.GENERATED);
    }
}

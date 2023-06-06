package lemon_juice.lemon_core.creativetab;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static ResourceLocation LEMON_CORE_TAB = new ResourceLocation(LemonCore.MOD_ID, "lemon_core");

    public static void registerTabs(CreativeModeTabEvent.Register event){

        Item tabItem = null;
        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()){
            if(item.get() instanceof IngotItem) {
                tabItem = item.get();
                break;
            }
        }
        Item finalTabItem = tabItem;

        event.registerCreativeModeTab(LEMON_CORE_TAB, builder -> builder
                .title(Component.translatable("itemGroup.lemon_core"))
                .icon(() -> new ItemStack(finalTabItem))
                .displayItems((features, output) -> {
                    /* Items */
                    // Ingots
                    for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                        if(item.get() instanceof IngotItem) output.accept(item.get());
                    }
                    // Nuggets
                    for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                        if(item.get() instanceof NuggetItem) output.accept(item.get());
                    }

                    // Gems
                    for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                        if(item.get() instanceof GemItem) output.accept(item.get());
                    }

                    // Fragments
                    for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                        if(item.get() instanceof FragmentItem) output.accept(item.get());
                    }

                    // Other
                    output.accept(new ItemStack(ModItems.GRAIN_OF_GLOWSTONE_DUST.get()));
                    output.accept(new ItemStack(ModItems.GRAIN_OF_REDSTONE_DUST.get()));
                    output.accept(new ItemStack(ModItems.OBSIDIAN_SHARD.get()));
                    output.accept(new ItemStack(ModItems.TINY_CHARCOAL.get()));
                    output.accept(new ItemStack(ModItems.TINY_COAL.get()));

                    // Ore Crushing Hammers
                    for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                        if(item.get() instanceof OreCrushingHammerItem) output.accept(item.get());
                    }

                    /* Blocks */
                    // Ingots
                    for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                        if(block.get() instanceof MetalBlock) output.accept(block.get());
                    }
                    // Gems
                    for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                        if(block.get() instanceof GemBlock) output.accept(block.get());
                    }
                }));
    }


}

package lemon_juice.lemon_core.creativetab;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {
    public static ResourceLocation LEMON_CORE_TAB = new ResourceLocation(LemonCore.MOD_ID, "lemon_core");

    public static void registerTabs(CreativeModeTabEvent.Register event){
        event.registerCreativeModeTab(LEMON_CORE_TAB, builder -> builder
                .title(Component.translatable("itemGroup.lemon_core"))
                .icon(() -> new ItemStack(ModItems.ALUMINUM_INGOT.get()))
                .displayItems((features, output) -> {
                    /* Items */
                    // Ingots
                    output.accept(new ItemStack(ModItems.ALUMINUM_INGOT.get()));
                    output.accept(new ItemStack(ModItems.COBALT_INGOT.get()));
                    output.accept(new ItemStack(ModItems.LEAD_INGOT.get()));
                    output.accept(new ItemStack(ModItems.NICKEL_INGOT.get()));
                    output.accept(new ItemStack(ModItems.OSMIUM_INGOT.get()));
                    output.accept(new ItemStack(ModItems.SILVER_INGOT.get()));
                    output.accept(new ItemStack(ModItems.TIN_INGOT.get()));
                    output.accept(new ItemStack(ModItems.URANIUM_INGOT.get()));
                    output.accept(new ItemStack(ModItems.ZINC_INGOT.get()));
                    output.accept(new ItemStack(ModItems.BRASS_INGOT.get()));
                    output.accept(new ItemStack(ModItems.BRONZE_INGOT.get()));
                    output.accept(new ItemStack(ModItems.CONSTANTAN_INGOT.get()));
                    output.accept(new ItemStack(ModItems.ELECTRUM_INGOT.get()));
                    output.accept(new ItemStack(ModItems.INVAR_INGOT.get()));
                    output.accept(new ItemStack(ModItems.STEEL_INGOT.get()));

                    // Nuggets
                    output.accept(new ItemStack(ModItems.ALUMINUM_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.COBALT_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.LEAD_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.NICKEL_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.OSMIUM_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.SILVER_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.TIN_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.URANIUM_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.ZINC_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.BRASS_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.BRONZE_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.CONSTANTAN_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.ELECTRUM_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.INVAR_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.STEEL_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.COPPER_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.NETHERITE_NUGGET.get()));

                    // Gems
                    output.accept(new ItemStack(ModItems.RUBY.get()));
                    output.accept(new ItemStack(ModItems.SAPPHIRE.get()));

                    /* Blocks */
                    // Metals
                    output.accept(new ItemStack(ModBlocks.ALUMINUM_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.COBALT_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.LEAD_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.NICKEL_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.OSMIUM_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.SILVER_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.TIN_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.URANIUM_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.ZINC_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.BRASS_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.BRONZE_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.CONSTANTAN_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.ELECTRUM_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.INVAR_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.STEEL_BLOCK.get()));

                    // Gems
                    output.accept(new ItemStack(ModBlocks.RUBY_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.SAPPHIRE_BLOCK.get()));
                }));
    }


}

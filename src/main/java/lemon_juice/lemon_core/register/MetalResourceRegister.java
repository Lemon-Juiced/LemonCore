package lemon_juice.lemon_core.register;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.data_type.DataTable;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.metal.IngotItem;
import lemon_juice.lemon_core.item.custom.metal.MetalDustItem;
import lemon_juice.lemon_core.item.custom.metal.NuggetItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MetalResourceRegister {
    /**
     * Registers the group of resources related to a metal
     * Includes: Ingot, Nugget, and Block
     * Assumes a metal is given a fully-false <code>DataTable</code>
     *
     * @param name The name of the metal
     */
    public void registerMetalGroup(String name){
        registerMetalGroup(name, new DataTable());
    }

    /**
     * Registers the group of resources related to a metal
     * Includes: Ingot, Nugget, Dust, and Block
     * Optionally Includes: Raw Metal and Raw Metal Blocks (Commented Out Right Now)
     *
     * @param name The name of the metal
     * @param table The table that holds the true/false values for this item
     */
    public void registerMetalGroup(String name, DataTable table){
        //Items
        ModItems.ITEMS.register(name + "_ingot", () -> new IngotItem(new Item.Properties(), table));
        ModItems.ITEMS.register(name + "_nugget", () -> new NuggetItem(new Item.Properties(), table));
        ModItems.ITEMS.register(name + "_dust", () -> new MetalDustItem(new Item.Properties(), table));

        //if(!table.getIsAlloy()) ModItems.ITEMS.register("raw_" + name, () -> new RawMetalItem(new Item.Properties(), table));

        //Blocks & BlockItems
        ModBlocks.registerBlock(name + "_block", () -> new MetalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)), table);

        //if(!table.getIsAlloy()) ModBlocks.registerBlock("raw_" + name + "_block", () -> new RawMetalBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)), modItems, modBlocks, table);
    }
}

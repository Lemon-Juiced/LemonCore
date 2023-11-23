package lemon_juice.lemon_core.block;

import lemon_juice.data_type.DataTable;
import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.item.LemonCoreItems;
import lemon_juice.lemon_core.item.custom.blockitem.AbstractBaseBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static lemon_juice.lemon_core.item.LemonCoreItems.ITEMS;

public class LemonCoreBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LemonCore.MOD_ID);

    /******************************** Registry ********************************/
    public static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> block, DataTable table) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, table);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<Block> block, DataTable table) {
        return ITEMS.register(name, () -> new AbstractBaseBlockItem(block.get(), new Item.Properties(), table));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

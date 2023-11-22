package lemon_juice.lemon_core.block;

import lemon_juice.data_type.DataTable;
import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.blockitem.AbstractBaseBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LemonCore.MOD_ID);

    /******************************** Registry ********************************/
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, DataTable table) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, table);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, DataTable table) {
        return ModItems.ITEMS.register(name, () -> new AbstractBaseBlockItem(block.get(), new Item.Properties(), table));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

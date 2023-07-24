package lemon_juice.lemon_core.block;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.blockitem.IntegrationTooltipBlockItem;
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
    public static <T extends Block> RegistryObject<T> registerBlock(String name, String modID, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, modID, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, String modID, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new IntegrationTooltipBlockItem(block.get(), modID, new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

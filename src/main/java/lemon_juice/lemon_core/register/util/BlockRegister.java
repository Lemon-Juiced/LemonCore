package lemon_juice.lemon_core.register.util;

import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.blockitem.FireproofBlockItem;
import lemon_juice.lemon_core.item.custom.blockitem.GlowingBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static lemon_juice.lemon_core.block.ModBlocks.BLOCKS;

public class BlockRegister {
    public static <T extends Block> RegistryObject<T> registerFireproofBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFireproofBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerFireproofBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new FireproofBlockItem(block.get(), new Item.Properties()));
    }

    public static <T extends Block> RegistryObject<T> registerGlowingBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerGlowingBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerGlowingBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new GlowingBlockItem(block.get(), new Item.Properties()));
    }
}

package lemon_juice.lemon_core.register.util;

import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.blockitem.CoalCokeBlockItem;
import lemon_juice.lemon_core.item.custom.blockitem.FireproofBlockItem;
import lemon_juice.lemon_core.item.custom.blockitem.GlowingBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static lemon_juice.lemon_core.block.ModBlocks.BLOCKS;

public class BlockRegister {
    public static <T extends Block> RegistryObject<T> registerCoalCokeBlock(String name, String modID, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerCoalCokeBlockItem(name, modID, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerCoalCokeBlockItem(String name, String modID, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new CoalCokeBlockItem(block.get(), modID, new Item.Properties()));
    }

    public static <T extends Block> RegistryObject<T> registerFireproofBlock(String name, String modID, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFireproofBlockItem(name, modID, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerFireproofBlockItem(String name, String modID, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new FireproofBlockItem(block.get(), modID, new Item.Properties()));
    }

    public static <T extends Block> RegistryObject<T> registerGlowingBlock(String name, String modID,Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerGlowingBlockItem(name, modID, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerGlowingBlockItem(String name, String modID, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new GlowingBlockItem(block.get(), modID, new Item.Properties()));
    }
}

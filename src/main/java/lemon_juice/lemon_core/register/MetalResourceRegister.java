package lemon_juice.lemon_core.register;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.FireproofBlockItem;
import lemon_juice.lemon_core.item.custom.IngotItem;
import lemon_juice.lemon_core.item.custom.NuggetItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static lemon_juice.lemon_core.block.ModBlocks.BLOCKS;

public class MetalResourceRegister {

    /**
     * Registers the group of resources related to a metal
     * Includes: Ingot, Nugget, and Block
     * Assumes the item is not fireproof
     *
     * @param name The name of the metal
     */
    public void registerMetalGroup(String name){
        registerMetalGroup(name, false);
    }

    /**
     * Registers the group of resources related to a metal
     * Includes: Ingot, Nugget, and Block
     *
     * @param name The name of the metal
     * @param isFireproof true if the group is fireproof, false otherwise
     */
    public void registerMetalGroup(String name, boolean isFireproof){
        ModItems.ITEMS.register(name + "_ingot", () -> new IngotItem(new Item.Properties(), isFireproof));
        ModItems.ITEMS.register(name + "_nugget", () -> new NuggetItem(new Item.Properties(), isFireproof));

        if(!isFireproof) ModBlocks.registerBlock(name + "_block", () -> new MetalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        else MetalResourceRegister.registerFireproofBlock(name + "_block", () -> new MetalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    }

    private static <T extends Block> RegistryObject<T> registerFireproofBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFireproofBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerFireproofBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new FireproofBlockItem(block.get(), new Item.Properties()));
    }
}

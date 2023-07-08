package lemon_juice.lemon_core.register;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.gem.FragmentItem;
import lemon_juice.lemon_core.item.custom.gem.GemItem;
import lemon_juice.lemon_core.register.util.BlockRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class GemResourceRegister {
    /**
     * Registers the group of resources related to a gem
     * Includes: Gem, Fragment, and Block
     *
     * @param name The name of the gem
     */
    public void registerGemGroup(String name){
        registerGemGroup(name, false);
    }

    /**
     * Registers the group of resources related to a gem
     * Includes: Gem, Fragment, and Block
     *
     * @param name The name of the gem
     * @param isGlowing true if the group is glowing, false otherwise
     */
    public void registerGemGroup(String name, boolean isGlowing){
        ModItems.ITEMS.register(name, () -> new GemItem(new Item.Properties(), isGlowing));
        ModItems.ITEMS.register(name + "_fragment", () -> new FragmentItem(new Item.Properties(), isGlowing));

        if(!isGlowing) ModBlocks.registerBlock(name + "_block", () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        else BlockRegister.registerGlowingBlock(name + "_block", () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    }
}

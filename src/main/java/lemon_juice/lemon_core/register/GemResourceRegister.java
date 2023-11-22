package lemon_juice.lemon_core.register;

import lemon_juice.data_type.DataTable;
import lemon_juice.lemon_core.block.LemonCoreBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.item.LemonCoreItems;
import lemon_juice.lemon_core.item.custom.gem.FragmentItem;
import lemon_juice.lemon_core.item.custom.gem.GemDustItem;
import lemon_juice.lemon_core.item.custom.gem.GemItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class GemResourceRegister {

    /**
     * Registers the group of resources related to a gem
     * Includes: Gem, Fragment, Dust, and Block
     * Assumes a gem is given a fully-false <code>DataTable</code>
     *
     * @param name The name of the gem
     */
    public void registerGemGroup(String name){
        registerGemGroup(name, new DataTable());
    }

    /**
     * Registers the group of resources related to a gem
     * Includes: Gem, Fragment, Dust, and Block
     *
     * @param name The name of the gem
     * @param table The table that holds the true/false values for this item
     */
    public void registerGemGroup(String name, DataTable table){
        if(name.equals("coal_coke")) registerCoalCoke(name, table);
        else {
            //Items
            LemonCoreItems.ITEMS.register(name, () -> new GemItem(new Item.Properties(), table));
            LemonCoreItems.ITEMS.register(name + "_fragment", () -> new FragmentItem(new Item.Properties(), table));
            LemonCoreItems.ITEMS.register(name + "_dust", () -> new GemDustItem(new Item.Properties(), table));

            //Blocks & BlockItems
            LemonCoreBlocks.registerBlock(name + "_block", () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)), table);

        }
    }

    /**
     * Registers Coal Coke as it is particular
     * Includes: Gem, Dust, and Block
     *
     * @param name The name of the gem
     * @param table The table that holds the true/false values for this item
     */
    public void registerCoalCoke(String name, DataTable table){
        //Items
        LemonCoreItems.ITEMS.register(name, () -> new GemItem(new Item.Properties(), table));

        //This is done so the dust can't be used as fuel
        LemonCoreItems.ITEMS.register(name + "_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(table.getIsAlloy(), 0, table.getIsFireproof(), table.getIsGlowing(), table.getModID())));

        //Blocks & BlockItems
        LemonCoreBlocks.registerBlock(name + "_block", () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)), table);
    }
}
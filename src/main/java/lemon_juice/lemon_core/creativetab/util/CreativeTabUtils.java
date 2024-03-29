package lemon_juice.lemon_core.creativetab.util;

import lemon_juice.item.custom.OreCrushingHammerItem;
import lemon_juice.lemon_core.item.LemonCoreItems;
import lemon_juice.lemon_core.item.custom.gem.GemItem;
import lemon_juice.lemon_core.item.custom.metal.IngotItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

import static lemon_juice.lemon_core.creativetab.LemonCoreCreativeTabs.*;

public class CreativeTabUtils {

    /**
     * Returns an Item of a type that the tab represents
     *
     * @param tabType The type of tab the Item will represent
     * @return an Item of a type that the tab represents
     */
    public static Item getFirstItem(String tabType){
        Item tabItem = null;
        for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
            if(tabType.equals(gemTabType)){
                if(item.get() instanceof GemItem) {
                    tabItem = item.get();
                    break; //Out of the for-loop
                }
            } else if(tabType.equals(metalTabType)){
                if(item.get() instanceof IngotItem) {
                    tabItem = item.get();
                    break; //Out of the for-loop
                }
            } else if(tabType.equals(vanillaPlusTabType)){
                tabItem = LemonCoreItems.TINY_COAL.get();
                break; //Out of the for-loop
            } else { //This catches "other"
                if(item.get() instanceof OreCrushingHammerItem) {
                    tabItem = item.get();
                    break; //Out of the for-loop
                }
            }
        }

        return tabItem;
    }
}

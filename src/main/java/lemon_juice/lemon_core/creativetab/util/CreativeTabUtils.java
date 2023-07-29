package lemon_juice.lemon_core.creativetab.util;

import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.gem.GemItem;
import lemon_juice.lemon_core.item.custom.metal.IngotItem;
import lemon_juice.lemon_core.item.custom.other.AbstractTinyCoalItem;
import lemon_juice.lemon_core.item.custom.other.OreCrushingHammerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import static lemon_juice.lemon_core.creativetab.ModCreativeTabs.*;

public class CreativeTabUtils {

    /**
     * Returns an Item of a type that the tab represents
     *
     * @param tabType The type of tab the Item will represent
     * @return an Item of a type that the tab represents
     */
    public static Item getFirstItem(String tabType){
        Item tabItem = null;
        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()){
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
                if(item.get() instanceof AbstractTinyCoalItem) {
                    tabItem = item.get();
                    break; //Out of the for-loop
                }
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

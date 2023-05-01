package lemon_juice.lemon_core.item.custom;

import net.minecraft.world.item.Item;

/**
 * This Item represents a Nugget in Game (Only For Use In Sorting)
 */
public class NuggetItem extends Item {

    boolean isFireproof = false;

    public NuggetItem(Properties properties, boolean isFireproof) {
        super(properties);
        this.isFireproof = isFireproof;
    }

    @Override
    public boolean isFireResistant() {
        return isFireproof;
    }
}

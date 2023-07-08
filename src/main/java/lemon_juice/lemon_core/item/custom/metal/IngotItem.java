package lemon_juice.lemon_core.item.custom.metal;

import net.minecraft.world.item.Item;

/**
 * This Item represents an Ingot in Game (Only For Use In Sorting)
 */
public class IngotItem extends Item {
    boolean isFireproof = false;

    public IngotItem(Properties properties, boolean isFireproof) {
        super(properties);
        this.isFireproof = isFireproof;
    }

    @Override
    public boolean isFireResistant() {
        return isFireproof;
    }
}

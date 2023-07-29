package lemon_juice.lemon_core.item.custom.other;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class OreCrushingHammerItem extends Item {
    private final String tier;

    public OreCrushingHammerItem(Properties properties, String tier) {
        super(properties.setNoRepair());
        this.tier = tier;
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return switch (tier) {
            case "gold" -> 32;
            case "wood" -> 59;
            case "stone" -> 131;
            case "iron" -> 250;
            case "diamond" -> 1561;
            case "netherite" -> 2031;
            default -> 32; //Assume its gold so it doesn't get extra durability
        };
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    // This is a little broken...
    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        int durability = itemStack.getDamageValue();
        itemStack.setDamageValue(durability+1);
        if(itemStack.getDamageValue()==itemStack.getMaxDamage()) { return ItemStack.EMPTY; }
        return itemStack.copy();
    }
}

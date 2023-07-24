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
        if (tier.equals("gold")) return 32;
        else if (tier.equals("wood")) return 59;
        else if (tier.equals("stone")) return 131;
        else if (tier.equals("iron")) return 250;
        else if (tier.equals("diamond")) return 1561;
        else if (tier.equals("netherite")) return 2031;
        else return 32; //Assume its gold so it doesn't get extra durability
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

package lemon_juice.lemon_core.item.custom.metal;

import lemon_juice.lemon_core.item.custom.other.IntegrationTooltipItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * This Item represents an Ingot in Game (Only For Use In Sorting)
 */
public class IngotItem extends IntegrationTooltipItem {
    boolean isFireproof = false;
    String modID;

    public IngotItem(Properties properties, String modID, boolean isFireproof) {
        super(properties, modID);
        this.isFireproof = isFireproof;
    }


    @Override
    public boolean isFireResistant() {
        return isFireproof;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.lemon_core.integration").append(" x " + modID));
    }
}

package lemon_juice.lemon_core.item.custom.metal;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * This Item represents a Nugget in Game (Only For Use In Sorting)
 */
public class NuggetItem extends Item {
    boolean isFireproof = false;
    String modID;

    public NuggetItem(Item.Properties properties, String modID, boolean isFireproof) {
        super(properties);
        this.isFireproof = isFireproof;
        this.modID = modID;
    }

    @Override
    public boolean isFireResistant() {
        return isFireproof;
    }


    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String xModID = " x " + modID;
        components.add(Component.translatable("tooltip.lemon_core.integration").append(xModID));
    }

    public String getModID() {
        return modID;
    }
}

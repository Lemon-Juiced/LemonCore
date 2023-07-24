package lemon_juice.lemon_core.item.custom.other;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractTinyCoalItem extends Item {
    String modID;

    public AbstractTinyCoalItem(Properties properties, String modID) {
        super(properties);
        this.modID = modID;
    }

    //Set Burn Time To 200 Ticks (1 Second)
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 200;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.lemon_core.abstract_tiny_coal"));
        components.add(Component.translatable("tooltip.lemon_core.integration").append(" " + modID));
    }
}
package lemon_juice.lemon_core.item.custom.blockitem;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CoalCokeBlockItem extends IntegrationTooltipBlockItem{
    public CoalCokeBlockItem(Block block, String modID, Properties properties) {
        super(block, modID, properties);
    }

    //Set Burn Time To 28800 Ticks (144 Seconds)
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 28800;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.lemon_core.coal_coke_block"));
        String xModID = " x " + modID;
        components.add(Component.translatable("tooltip.lemon_core.integration").append(xModID));
    }
}

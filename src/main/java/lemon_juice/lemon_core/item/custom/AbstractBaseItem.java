package lemon_juice.lemon_core.item.custom;

import lemon_juice.lemon_core.data_type.DataTable;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SimpleFoiledItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Do Not Use: This is an abstract base and should not be instantiated itself.
 */
public class AbstractBaseItem extends SimpleFoiledItem {
    int isBurnable;
    boolean isFireproof;
    boolean isGlowing;
    String modID;

    public AbstractBaseItem(Properties properties, DataTable table) {
        super(properties);
        this.isBurnable = table.getIsBurnable();
        this.isFireproof = table.getIsFireproof();
        this.isGlowing = table.getIsGlowing();
        this.modID = table.getModID();
    }

    // Only effects burnable items
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return isBurnable;
    }

    // Only effects fireproof items
    @Override
    public boolean isFireResistant() {
        return isFireproof;
    }

    // Only effects glowing items
    @Override
    public boolean isFoil(ItemStack itemStack) {
        return isGlowing;
    }

    // Only effects Lemon Core items
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String xModID = " x " + modID;
        components.add(Component.translatable("tooltip.lemon_core.integration").append(xModID));
    }

    public String getModID() {
        return modID;
    }
}

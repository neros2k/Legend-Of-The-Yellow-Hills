package n2k_.lotyh.item.type;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
public class FoilItem extends Item {
    public FoilItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(@NotNull ItemStack itemStack) {
        return true;
    }
}

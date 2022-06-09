package n2k_.lotyh.item;
import n2k_.lotyh.core.IBaseItem;
import n2k_.lotyh.item.type.BaseItem;
import n2k_.lotyh.item.type.ConfigItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
public enum ItemRegister {
    TELDER_STEEL_INGOT("telder_steel_ingot", "tab")

    ;

    private final IBaseItem ITEM;

    ItemRegister(String itemId, @NotNull String configPatternStr) {
        String[] configPattern = configPatternStr.split(" ");
        this.ITEM = new ConfigItem(itemId, configPattern);
    }

    ItemRegister(String itemId) {
        this.ITEM = new BaseItem(itemId, new Item(new Item.Properties()));
    }

    public IBaseItem getItem() {
        return this.ITEM;
    }

    public static void register(DeferredRegister<Item> deferredRegister) {
        for(ItemRegister itemRegister : ItemRegister.values()) {
            IBaseItem item = itemRegister.getItem();
            deferredRegister.register(item.getItemId(), item::getItem);
        }
    }
}

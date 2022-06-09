package n2k_.lotyh.item;
import n2k_.lotyh.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
public class BaseItem implements IBaseItem {
    private final String ITEM_ID;
    private final Item ITEM;
    private final RegistryObject<Item> REGISTRY_OBJECT;

    public BaseItem(String itemId, Item item) {
        this.ITEM_ID = itemId;
        this.ITEM = item;
        this.REGISTRY_OBJECT = this.register(Main.getItemDeferredRegister());
    }

    @Override
    public RegistryObject<Item> register(@NotNull DeferredRegister<Item> itemRegister) {
        return itemRegister.register(this.ITEM_ID, () -> this.ITEM);
    }

    public String getItemId() {
        return this.ITEM_ID;
    }

    public Item getItem() {
        return this.ITEM;
    }

    public RegistryObject<Item> getRegistryObject() {
        return REGISTRY_OBJECT;
    }
}

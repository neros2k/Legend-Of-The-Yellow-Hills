package n2k_.lotyh.item;
import n2k_.lotyh.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class ItemRegister {
    private final static DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Main.getModId());

    static {
        ItemRegister.register("telder_steel_ingot", new Item(new Item.Properties()));
        ItemRegister.register("telder_steel_nugget", new Item(new Item.Properties()));
        ItemRegister.register("ethril_ingot", new Item(new Item.Properties()));
        ItemRegister.register("ethril_nugget", new Item(new Item.Properties()));

    }

    static void register(String itemId, Item item) {
        ITEM_DEFERRED_REGISTER.register(itemId, () -> item);
    }

    public static DeferredRegister<Item> getItemDeferredRegister() {
        return ItemRegister.ITEM_DEFERRED_REGISTER;
    }
}

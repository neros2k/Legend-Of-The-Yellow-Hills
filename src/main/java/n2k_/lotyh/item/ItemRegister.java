package n2k_.lotyh.item;
import n2k_.lotyh.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import java.util.function.Supplier;
public enum ItemRegister {
    ///////////////////////////////////////////////////////////////////////////
    // Материалы
    ///////////////////////////////////////////////////////////////////////////
    telder_steel_ingot(() -> new Item(new Item.Properties())),
    telder_steel_nugget(() -> new Item(new Item.Properties())),
    ethril_ingot(() -> new Item(new Item.Properties())),
    ethril_nugget(() -> new Item(new Item.Properties())),
    /* ------------------------- */
    heavenly_shard(() -> new Item(new Item.Properties())),
    terrestrial_shard(() -> new Item(new Item.Properties())),
    aquatic_shard(() -> new Item(new Item.Properties())),
    deep_shard(() -> new Item(new Item.Properties())),
    distortion_shard(() -> new Item(new Item.Properties())),
    /* ------------------------- */
    singularity_stone(() -> new Item(new Item.Properties())),
    reality_stone(() -> new Item(new Item.Properties())),
    soul_stone(() -> new Item(new Item.Properties())),
    /* ------------------------- */
    ether_silk(() -> new Item(new Item.Properties())),
    etheroscope(() -> new Item(new Item.Properties())),
    ///////////////////////////////////////////////////////////////////////////
    // Еда
    ///////////////////////////////////////////////////////////////////////////
    peach(() -> new Item(new Item.Properties())),
    echpochmak(() -> new Item(new Item.Properties())),
    golden_echpochmak(() -> new Item(new Item.Properties())),
    /* ------------------------- */
    peach_jam(() -> new Item(new Item.Properties())),
    berry_jam(() -> new Item(new Item.Properties())),
    lightberry_jam(() -> new Item(new Item.Properties())),
    /* ------------------------- */
    peach_pie(() -> new Item(new Item.Properties())),
    berry_pie(() -> new Item(new Item.Properties())),
    lightberry_pie(() -> new Item(new Item.Properties())),
    ///////////////////////////////////////////////////////////////////////////
    // Прочие предметы мода
    ///////////////////////////////////////////////////////////////////////////
    clay_kettle(() -> new Item(new Item.Properties()))

    ;

    private final String ITEM_ID;
    private final Supplier<? extends Item> SUPPLIER;
    private RegistryObject<Item> REGISTRY_OBJECT;

    ItemRegister(Supplier<? extends Item> supplier) {
        this.ITEM_ID = this.name();
        this.SUPPLIER = supplier;
    }

    public String getItemId() {
        return this.ITEM_ID;
    }

    public Supplier<? extends Item> getSupplier() {
        return this.SUPPLIER;
    }

    public Item getItem() {
        return this.SUPPLIER.get();
    }

    public RegistryObject<Item> getRegistryObject() {
        return this.REGISTRY_OBJECT;
    }

    public void register(@NotNull DeferredRegister<Item> deferredRegister) {
        this.REGISTRY_OBJECT = deferredRegister.register(this.ITEM_ID, this.SUPPLIER);
    }

    private final static DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Main.getModId());

    static {
        for(ItemRegister itemRegister : ItemRegister.values()) {
            itemRegister.register(ItemRegister.ITEM_DEFERRED_REGISTER);
        }
    }

    public static DeferredRegister<Item> getDeferredRegister() {
        return ItemRegister.ITEM_DEFERRED_REGISTER;
    }
}

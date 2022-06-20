package n2k_.lotyh.item;
import n2k_.lotyh.Main;
import n2k_.lotyh.base.ModTier;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import java.util.function.Supplier;
public enum ItemRegister {
    ///////////////////////////////////////////////////////////////////////////
    // Инструменты
    ///////////////////////////////////////////////////////////////////////////
    // фиксани ломание у кирок
    telder_steel_pickaxe(() -> new PickaxeItem(ModTier.TELDER_STEEL, 3, -2.8F, new Item.Properties())),
    //telder_steel_battle_pickaxe(() -> ),
    telder_steel_sword(() -> new SwordItem(ModTier.TELDER_STEEL, 3, -2.4F, new Item.Properties())),
    telder_steel_axe(() -> new AxeItem(ModTier.TELDER_STEEL, 8.0F, -3.1F, new Item.Properties())),
    telder_steel_shovel(() -> new ShovelItem(ModTier.TELDER_STEEL, 3.5F, -3.0F, new Item.Properties())),
    telder_steel_hoe(() -> new HoeItem(ModTier.TELDER_STEEL, 1, -1.0F, new Item.Properties())),
    /* ------------------------- */
    ethril_pickaxe(() -> new PickaxeItem(ModTier.ETHRIL, 1, -2.8F, new Item.Properties())),
    //ethril_battle_pickaxe(() -> ),
    ethril_sword(() -> new SwordItem(ModTier.ETHRIL, 1, -2.4F, new Item.Properties())),
    ethril_axe(() -> new AxeItem(ModTier.ETHRIL, 6.0F, -3.0F, new Item.Properties())),
    ethril_shovel(() -> new ShovelItem(ModTier.ETHRIL, 1.5F, -3.0F, new Item.Properties())),
    ethril_hoe(() -> new HoeItem(ModTier.ETHRIL, 1, -3.0F, new Item.Properties())),
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
    peach(() -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(3).saturationMod(satMod(3.0F, 2.2F)).build()))),
    echpochmak(() -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(satMod(6.0F, 8.0F)).build()))),
    golden_echpochmak(() -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(satMod(6.0F, 10.0F)).build()))),
    /* ------------------------- */
    peach_jam(() -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(9).saturationMod(satMod(9.0F, 8.5F)).build()))),
    berry_jam(() -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(satMod(6.0F, 2.5F)).build()))),
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

    public static float satMod(float nutrition, float satLevel) {
        return satLevel/(nutrition*2);
    }
}

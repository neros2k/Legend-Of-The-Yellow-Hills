package n2k_.lotyh.item;
import n2k_.lotyh.Main;
import n2k_.lotyh.base.ModTabs;
import n2k_.lotyh.base.ModTiers;
import n2k_.lotyh.item.type.FoilItem;
import n2k_.lotyh.item.type.GlowItem;
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
    // TODO: фиксани ломание у кирок
    telder_steel_pickaxe(() -> new PickaxeItem(ModTiers.TELDER_STEEL, 3, -2.8F, new Item.Properties().tab(ModTabs.TOOLS))),
    telder_steel_sword(() -> new SwordItem(ModTiers.TELDER_STEEL, 3, -2.4F, new Item.Properties().tab(ModTabs.TOOLS))),
    telder_steel_axe(() -> new AxeItem(ModTiers.TELDER_STEEL, 8.0F, -3.1F, new Item.Properties().tab(ModTabs.TOOLS))),
    telder_steel_shovel(() -> new ShovelItem(ModTiers.TELDER_STEEL, 3.5F, -3.0F, new Item.Properties().tab(ModTabs.TOOLS))),
    telder_steel_hoe(() -> new HoeItem(ModTiers.TELDER_STEEL, 1, -1.0F, new Item.Properties().tab(ModTabs.TOOLS))),
    /* ------------------------- */
    ethril_pickaxe(() -> new PickaxeItem(ModTiers.ETHRIL, 1, -2.8F, new Item.Properties().tab(ModTabs.TOOLS))),
    ethril_sword(() -> new SwordItem(ModTiers.ETHRIL, 1, -2.4F, new Item.Properties().tab(ModTabs.TOOLS))),
    ethril_axe(() -> new AxeItem(ModTiers.ETHRIL, 6.0F, -3.0F, new Item.Properties().tab(ModTabs.TOOLS))),
    ethril_shovel(() -> new ShovelItem(ModTiers.ETHRIL, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.TOOLS))),
    ethril_hoe(() -> new HoeItem(ModTiers.ETHRIL, 1, -3.0F, new Item.Properties().tab(ModTabs.TOOLS))),
    /* ------------------------- */
    scepter(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    teldecore(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    lootbag(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    melon_cannon(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    interspatial_chain(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    reality_halo(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    amethyst_pendant(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    wooden_mug(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    /* ------------------------- */
    wooden_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    stone_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    iron_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    diamond_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    gold_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    netherite_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    telder_steel_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    ethril_battle_pickaxe(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    /* ------------------------- */
    wooden_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    stone_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    iron_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    diamond_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    gold_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    netherite_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    telder_steel_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    ethril_hammer(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    /* ------------------------- */
    telder_steel_shield(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    ///////////////////////////////////////////////////////////////////////////
    // Материалы
    ///////////////////////////////////////////////////////////////////////////
    telder_steel_ingot(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    telder_steel_nugget(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    ethril_ingot(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    ethril_nugget(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    /* ------------------------- */
    heavenly_shard(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    terrestrial_shard(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    aquatic_shard(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    deep_shard(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    distortion_shard(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    /* ------------------------- */
    singularity_stone(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    reality_stone(() -> new FoilItem(new Item.Properties().tab(ModTabs.MATERIAL))),
    soul_stone(() -> new GlowItem(new Item.Properties().tab(ModTabs.MATERIAL), 1.0F)),
    /* ------------------------- */
    ether_silk(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    etheroscope(() -> new Item(new Item.Properties().tab(ModTabs.MATERIAL))),
    little_jar(() -> new Item(new Item.Properties().tab(ModTabs.TOOLS))),
    ///////////////////////////////////////////////////////////////////////////
    // Еда
    ///////////////////////////////////////////////////////////////////////////
    peach(() -> new Item(new Item.Properties().tab(ModTabs.FOOD).food((new FoodProperties.Builder()).nutrition(3).saturationMod(satMod(3.0F, 2.2F)).build()))),
    echpochmak(() -> new Item(new Item.Properties().tab(ModTabs.FOOD).food((new FoodProperties.Builder()).nutrition(6).saturationMod(satMod(6.0F, 8.0F)).build()))),
    golden_echpochmak(() -> new Item(new Item.Properties().tab(ModTabs.FOOD).food((new FoodProperties.Builder()).nutrition(6).saturationMod(satMod(6.0F, 10.0F)).build()))),
    /* ------------------------- */
    peach_jam(() -> new Item(new Item.Properties().tab(ModTabs.FOOD).food((new FoodProperties.Builder()).nutrition(9).saturationMod(satMod(9.0F, 8.5F)).build()))),
    berry_jam(() -> new Item(new Item.Properties().tab(ModTabs.FOOD).food((new FoodProperties.Builder()).nutrition(6).saturationMod(satMod(6.0F, 2.5F)).build()))),
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

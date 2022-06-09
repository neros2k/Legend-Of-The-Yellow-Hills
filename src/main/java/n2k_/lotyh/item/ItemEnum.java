package n2k_.lotyh.item;
import n2k_.lotyh.item.type.ConfigItem;
import n2k_.lotyh.item.type.PatternEnum;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public enum ItemEnum {
    TELDER_STEEL_INGOT("telder_steel_ingot", new String[]{"tab"}),
    ETHRIL_INGOT("ethril_steel_ingot", new String[]{"tab"}),
    TELDER_STEEL_NUGGET("telder_steel_nugget", new String[]{"tab"}),
    ETHRIL_NUGGET("ethril_nugget", new String[]{"tab"})

    ;

    private final ConfigItem ITEM;

    ItemEnum(String itemId, String[] propertyPattern) {
        this.ITEM = new ConfigItem(itemId);
        AtomicReference<Item.Properties> properties = new AtomicReference<>(new Item.Properties());
        Arrays.stream(PatternEnum.values()).toList().forEach(patternEnum -> {
            if(Arrays.stream(propertyPattern).toList().contains(patternEnum.getPatternName())) {
                properties.set(patternEnum.getPatternImpl().decorate(properties.get(), this.ITEM.getConfigParameter(patternEnum.getPatternName())));
            }
        });
        this.ITEM.createItem(properties.get());
    }

    ItemEnum(String itemId) {
        this.ITEM = new ConfigItem(itemId);
    }

    ItemEnum(ConfigItem item) {
        this.ITEM = item;
    }

    public static void registerItems(DeferredRegister<Item> itemRegister) {
        Arrays.stream(ItemEnum.values()).toList().forEach(
                item -> itemRegister.register(item.ITEM.getItemId(), item.ITEM::getItem)
        );
    }
}

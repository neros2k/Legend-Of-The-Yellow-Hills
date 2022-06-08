package n2k_.lotyh.item;
import n2k_.lotyh.item.type.ConfigItem;
public enum ItemEnum {

    ;

    private final ConfigItem ITEM;

    ItemEnum(String itemId) {
        this.ITEM = new ConfigItem(itemId);
    }

    ItemEnum(ConfigItem item) {
        this.ITEM = item;
    }
}

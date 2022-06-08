package n2k_.lotyh.item.type;
public class ConfigItem {
    private final String ITEM_ID;

    public ConfigItem(String itemId) {
        this.ITEM_ID = itemId;
    }

    protected String getItemProperty(String property) {
        return "";
    }
}

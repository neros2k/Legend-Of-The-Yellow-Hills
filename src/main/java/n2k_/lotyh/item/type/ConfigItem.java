package n2k_.lotyh.item.type;
import net.minecraft.world.item.Item;
public class ConfigItem {
    private ItemAdapter ITEM;
    private final String ITEM_ID;

    public ConfigItem(String itemId) {
        this.ITEM_ID = itemId;
    }

    public void createItem(Item.Properties properties) {
        this.ITEM = new ItemAdapter(properties);
    }

    public String getConfigParameter(String parameter) {
        return "";
    }

    public ItemAdapter getItem() {
        return this.ITEM;
    }

    public String getItemId() {
        return this.ITEM_ID;
    }
}

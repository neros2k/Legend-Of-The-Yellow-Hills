package n2k_.lotyh.item.type;
import net.minecraft.world.item.Item;
public class ConfigItem extends BaseItem {
    public ConfigItem(String itemId, String[] configPattern) {
        super(itemId, new Item(ConfigItem.getProperties(itemId, configPattern)));
    }

    public static Item.Properties getProperties(String itemId, String[] configPattern) {
        return new Item.Properties();
    }

    public static String getConfigProperty(String itemId, String parameter) {
        return "";
    }
}

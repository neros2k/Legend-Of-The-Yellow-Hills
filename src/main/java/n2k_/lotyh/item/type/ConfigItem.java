package n2k_.lotyh.item.type;
import n2k_.lotyh.item.config.ConfigProperty;
import net.minecraft.world.item.Item;
public class ConfigItem extends BaseItem {
    public ConfigItem(String itemId, String[] configPattern) {
        super(itemId, new Item(new ConfigProperty(itemId, configPattern)));
    }
}

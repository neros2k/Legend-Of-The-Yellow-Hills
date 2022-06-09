package n2k_.lotyh.item.config;
import n2k_.lotyh.Main;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;
public class ConfigProperty extends Item.Properties {
    private final String ITEM_ID;

    public ConfigProperty(String itemId, String @NotNull [] configPattern) {
        this.ITEM_ID = itemId;
        for(String s : configPattern) {
            for(PatternDecorator patternDecorator : PatternDecorator.values()) {
                if(patternDecorator.getName().equalsIgnoreCase(s)) {
                    patternDecorator.decorate(this, this.getConfigProperty(s));
                }
            }
        }
    }

    public String getConfigProperty(String parameter) {
        return Main.getInstance().getItemConfig().getValue(ITEM_ID +"."+parameter);
    }
}

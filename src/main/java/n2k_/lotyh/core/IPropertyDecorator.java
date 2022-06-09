package n2k_.lotyh.core;
import net.minecraft.world.item.Item;
public interface IPropertyDecorator {
    Item.Properties decorate(Item.Properties properties, String arg);
}

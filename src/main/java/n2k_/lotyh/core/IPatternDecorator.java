package n2k_.lotyh.core;
import net.minecraft.world.item.Item;
public interface IPatternDecorator {
    String getName();
    IPropertyDecorator getPropertyDecorator();
    Item.Properties decorate(Item.Properties properties, String arg);
}

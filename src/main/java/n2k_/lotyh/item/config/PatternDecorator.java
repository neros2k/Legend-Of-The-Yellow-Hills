package n2k_.lotyh.item.config;
import n2k_.lotyh.core.IPatternDecorator;
import n2k_.lotyh.core.IPropertyDecorator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
public enum PatternDecorator implements IPatternDecorator {
    TAB("", (properties, arg) -> {
        properties.tab(CreativeModeTab.TAB_MATERIALS);
        System.out.println(arg);
    })

    ;

    private final String NAME;
    private final IPropertyDecorator PROPERTY_DECORATOR;

    PatternDecorator(String name, IPropertyDecorator propertyDecorator) {
        this.NAME = name;
        this.PROPERTY_DECORATOR = propertyDecorator;
    }

    @Override
    public String getName() {
        return this.NAME;
    }

    @Override
    public IPropertyDecorator getPropertyDecorator() {
        return this.PROPERTY_DECORATOR;
    }

    @Override
    public void decorate(Item.Properties properties, String arg) {
        this.PROPERTY_DECORATOR.decorate(properties, arg);
    }
}

package n2k_.lotyh.item;
import net.minecraft.world.item.Item;
public enum ItemRegister {
    telder_steel_ingot(new Item(new Item.Properties())),
    telder_steel_nugget(new Item(new Item.Properties())),
    ethril_ingot(new Item(new Item.Properties())),
    ethril_nugget(new Item(new Item.Properties()))

    ;

    private final IBaseItem ITEM;

    ItemRegister(Item item) {
        this.ITEM = new BaseItem(this.name(), item);
    }

    public IBaseItem getItem() {
        return this.ITEM;
    }
}

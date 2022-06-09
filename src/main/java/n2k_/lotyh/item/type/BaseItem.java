package n2k_.lotyh.item.type;
import n2k_.lotyh.core.IBaseItem;
import net.minecraft.world.item.Item;
public class BaseItem implements IBaseItem {
    private final String ITEM_ID;
    private final Item ITEM;

    public BaseItem(String itemId, Item item) {
        this.ITEM_ID = itemId;
        this.ITEM = item;
    }

    @Override
    public String getItemId() {
        return this.ITEM_ID;
    }

    @Override
    public Item getItem() {
        return this.ITEM;
    }
}

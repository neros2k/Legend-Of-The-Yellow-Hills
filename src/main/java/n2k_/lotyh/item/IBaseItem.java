package n2k_.lotyh.item;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
public interface IBaseItem {
    RegistryObject<Item> register(DeferredRegister<Item> itemRegister);
}

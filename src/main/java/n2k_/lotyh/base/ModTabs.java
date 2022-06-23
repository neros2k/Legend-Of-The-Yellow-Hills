package n2k_.lotyh.base;
import n2k_.lotyh.Main;
import n2k_.lotyh.item.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
public class ModTabs {
    // TODO: преобразуй в enum
    public final static CreativeModeTab TOOLS = ModTabs.createTab(ItemRegister.ethril_pickaxe, "tools_tab");
    public final static CreativeModeTab MATERIAL = ModTabs.createTab(ItemRegister.etheroscope, "material_tab");
    public final static CreativeModeTab FOOD = ModTabs.createTab(ItemRegister.echpochmak, "food_tab");

    @Contract("_, _ -> new")
    public static @NotNull CreativeModeTab createTab(ItemRegister item, String id) {
        return new CreativeModeTab(Main.getModId()+"."+id) {
            @Override @NotNull
            public ItemStack makeIcon() {
                return item.getRegistryObject().get().getDefaultInstance();
            }
        };
    }
}

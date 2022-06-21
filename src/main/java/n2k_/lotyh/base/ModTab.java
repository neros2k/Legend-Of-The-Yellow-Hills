package n2k_.lotyh.base;
import n2k_.lotyh.Main;
import n2k_.lotyh.item.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
public enum ModTab {
    tools_tab(ItemRegister.ethril_pickaxe.getItem()),
    material_tab(ItemRegister.etheroscope.getItem()),
    food_tab(ItemRegister.echpochmak.getItem())

    ;

    private final CreativeModeTab CREATIVE_MOD_TAB;

    ModTab(Item item) {
        this.CREATIVE_MOD_TAB = new CreativeModeTab(Main.getModId()+this.name()) {
            @Override
            public @NotNull ItemStack makeIcon() {
                return item.getDefaultInstance();
            }
        };
    }

    public CreativeModeTab getTab() {
        return this.CREATIVE_MOD_TAB;
    }

    static {
        for(ModTab modTab : ModTab.values()) {
            FMLJavaModLoadingContext.get().getModEventBus().register(modTab.getTab());
        }
    }
}

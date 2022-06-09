package n2k_.lotyh;
import n2k_.lotyh.item.ItemConfig;
import n2k_.lotyh.item.ItemRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.io.IOException;
@Mod("loyellowhills")
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public final class Main {
    private static Main INSTANCE;
    private final ItemConfig ITEM_CONFIG;

    public Main() {
        Main.INSTANCE = this;
        this.ITEM_CONFIG = new ItemConfig("item_config.json");
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DeferredRegister<Item> itemDeferredRegister = DeferredRegister.create(ForgeRegistries.ITEMS, "loyellowhills");
        itemDeferredRegister.register(eventBus);
        ItemRegister.register(itemDeferredRegister);
    }

    public ItemConfig getItemConfig() {
        return this.ITEM_CONFIG;
    }

    public static Main getInstance() {
        return Main.INSTANCE;
    }
}

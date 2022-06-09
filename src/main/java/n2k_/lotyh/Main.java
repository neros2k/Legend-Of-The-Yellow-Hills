package n2k_.lotyh;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
@Mod("loyellowhills")
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public final class Main {
    private static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, "loyellowhills");

    public Main() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Main.ITEM_DEFERRED_REGISTER.register(eventBus);
    }

    public static DeferredRegister<Item> getItemDeferredRegister() {
        return Main.ITEM_DEFERRED_REGISTER;
    }
}

package n2k_.lotyh;
import n2k_.lotyh.item.ItemRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod("loyellowhills")
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public final class Main {
    private final static String MOD_ID = "loyellowhills";

    public Main() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegister.getDeferredRegister().register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static String getModId() {
        return Main.MOD_ID;
    }
}

package n2k_.lotyh.item.type;
import net.minecraft.world.item.Item;
public class GlowItem extends Item {
    // TODO: доделай
    private final float GLOW_VALUE;

    public GlowItem(Properties properties, float glowValue) {
        super(properties);
        this.GLOW_VALUE = glowValue;
    }

    public float getGlowValue() {
        return this.GLOW_VALUE;
    }
}

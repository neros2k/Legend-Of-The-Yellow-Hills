package n2k_.lotyh.base;
import n2k_.lotyh.item.ItemRegister;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import java.util.function.Supplier;
public enum ModTiers implements Tier {
    TELDER_STEEL(2, 320, 6.0F, 2.0F, 16,
            () -> Ingredient.of(ItemRegister.telder_steel_ingot.getItem())
    ),
    ETHRIL(1, 51, 12.0F, 0.0F, 24,
            () -> Ingredient.of(ItemRegister.ethril_ingot.getItem())
    )

    ;

    private final int LEVEL;
    private final int USES;
    private final float SPEED;
    private final float DAMAGE;
    private final int ENCHANTMENT_VALUE;
    private final LazyLoadedValue<Ingredient> REPAIR_INGREDIENT;

    ModTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.LEVEL = level;
        this.USES = uses;
        this.SPEED = 0.0F;
        this.DAMAGE = 0.0F;
        this.ENCHANTMENT_VALUE = enchantmentValue;
        this.REPAIR_INGREDIENT = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.USES;
    }

    public float getSpeed() {
        return this.SPEED;
    }

    public float getAttackDamageBonus() {
        return this.DAMAGE;
    }

    public int getLevel() {
        return this.LEVEL;
    }

    public int getEnchantmentValue() {
        return this.ENCHANTMENT_VALUE;
    }

    @NotNull
    public Ingredient getRepairIngredient() {
        return this.REPAIR_INGREDIENT.get();
    }
}

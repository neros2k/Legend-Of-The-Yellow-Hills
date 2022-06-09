package n2k_.lotyh.item;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import n2k_.lotyh.core.IConfig;
import java.lang.reflect.Type;
import java.util.Map;
public class ItemConfig implements IConfig {
    private final Map<String, String> VALUES;

    public ItemConfig(String fileName) {
        Gson GSON = new Gson();
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        this.VALUES = GSON.fromJson(this.readFileFromResources(fileName), type);
    }

    @Override
    public String getValue(String parameter) {
        return this.VALUES.get(parameter);
    }

    private String readFileFromResources(String fileName) {
        return "";
    }
}

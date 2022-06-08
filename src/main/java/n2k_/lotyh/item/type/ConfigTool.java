package n2k_.lotyh.item.type;
import n2k_.lotyh.base.BaseToolModel;
public class ConfigTool extends ConfigItem {
    public ConfigTool(String itemId) {
        super(itemId);
    }

    public BaseToolModel getModel() {
        return new BaseToolModel();
    }
}

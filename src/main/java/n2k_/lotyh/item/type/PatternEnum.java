package n2k_.lotyh.item.type;
import n2k_.lotyh.TabsEnum;
public enum PatternEnum {
    TAB("tab", (property, str) -> property.tab(TabsEnum.getTabByName(str)))

    ;

    private final String patternName;
    private final IPatternImpl patternImpl;

    PatternEnum(String patternName, IPatternImpl patternImpl) {
        this.patternName = patternName;
        this.patternImpl = patternImpl;
    }

    public String getPatternName() {
        return this.patternName;
    }

    public IPatternImpl getPatternImpl() {
        return this.patternImpl;
    }
}

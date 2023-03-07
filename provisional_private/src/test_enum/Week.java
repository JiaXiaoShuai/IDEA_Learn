package test_enum;

public enum Week {
    MONDAY("星期一"),//No modifiers allowed for enum constants，枚举常量不允许使用修饰符
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private final String description;

    Week(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()+":"+description;
    }

}

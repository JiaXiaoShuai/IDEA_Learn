package com.jc.enumtype;

public enum Week {
    MONDAY,//表示使用无参构造创建的对象
    TUESDAY("星期二"), //表示使用有参构造创建的对象
    WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    private final String description;

    public String getDescription() {
        return description;
    }

    Week() {//这里省略的是private,和普通的类有所不同
        System.out.println("无参构造");
        description = "";
    }

    Week(String description){
        System.out.println("有参构造");
        this.description = description;
    }
}

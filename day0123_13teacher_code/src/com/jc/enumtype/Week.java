package com.jc.enumtype;

public enum Week {
    MONDAY("星期一"), //表示调用有参构造
    //等价于 public static final Week MONDAY = new Week("星期一");
    TUESDAY,	//表示调用无参构造
    //等价于 public static final Week TUESDAY = new Week();
    WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    private String description;
    Week(){

    }
    Week(String description){this.description = description;}

    @Override
    public String toString() {
        return "Week{" +
                "description='" + description + '\'' +
                '}';

    }
}

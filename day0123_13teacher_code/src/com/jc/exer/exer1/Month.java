package com.jc.exer.exer1;

public enum Month {
    //    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
    JANUARY("一月"),
    FEBRUARY("二月"),
    MARCH("三月"),
    APRIL("四月"),
    MAY("五月"),
    JUNE("六月"),
    JULY("七月"),
    AUGUST("八月"),
    SEPTEMBER("九月"),
    OCTOBER("十月"),
    NOVEMBER("十一月"),
    DECEMBER("十二月");



    private final String description;
    Month(String description){
        this.description = description;
    }
    public static Month getByValue(int value){
        Month[] months = Month.values();
        return Month.values()[value-1];
    }

    //返回月份对象的总天数
    public static int length(Month month,boolean leapYear){
        switch(month){
            case FEBRUARY:
                return leapYear?29:28;
            case APRIL:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return (ordinal()+1) + "->" + name() +"->" + description;
    }
}

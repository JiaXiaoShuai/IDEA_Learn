package com.jc.xiaobai.oop9;

/**
 * 测试枚举类
 */
public class TestWeekDays02 {
    public static void main(String[] args) {
        //day工作日变量
        WeekDays02 day = WeekDays02.FRIDAY;
        System.out.println(day);

        switch(day){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
            case THURSDAY:
                System.out.println("星期四");
            default:
                System.out.println("星期五");
        }

        System.out.println(day);
        System.out.println(day.getInfo());
        System.out.println(WeekDays02.getStaticVar());
    }
}

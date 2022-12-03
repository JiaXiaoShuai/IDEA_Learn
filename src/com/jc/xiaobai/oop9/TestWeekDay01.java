package com.jc.xiaobai.oop9;

public class TestWeekDay01 implements WeekDays01{
    public static void main(String[] args) {
        int day = WeekDays01.THURSDAY;

        switch(day){
            case WeekDays01.MONDAY:
                System.out.println("今天星期一");
                break;
            case WeekDays01.TUESDAY:
                System.out.println("今天星期二");
                break;
            case WeekDays01.WEDNESDAY:
                System.out.println("今天星期三");
                break;
            case THURSDAY:
                System.out.println("今天星期四");
                break;
            case FRIDAY:
                System.out.println("今天星期五");
                break;
        }
    }
}

package com.jc.xiaobai.oop9;

import java.util.Arrays;

public class TestWeekDays04 {
    public static void main(String[] args) {
        //返回一个包含全部枚举常量的数组
        WeekDays04[] allValues = WeekDays04.values();
        System.out.println(Arrays.toString(allValues));
        WeekDays04[] a = new WeekDays04[3];
        for(WeekDays04 value : WeekDays04.values()){
            System.out.println(value);
        }

        for(WeekDays04 value : WeekDays04.values()){
            System.out.print(value.ordinal());
        }


        WeekDays04 day01 = WeekDays04.WEDNESDAY;
        WeekDays04 day02 = WeekDays04.valueOf("WEDNESDAY");

        System.out.println(day01 == day02);




    }
}

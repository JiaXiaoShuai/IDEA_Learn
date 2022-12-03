package com.jc.enumtype;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*
    通过enum关键字声明的枚举类型，默认的父类是java.lang.Enum类，它间接的父类还是Object
    所以enum关键字声明的枚举类型的对象，可以调用Enum类和Object中声明的方法

    Enum类中部分常用方法：
    (1)String name():返回枚举常量的名称
    (2)int ordinal();返回常量对象的下标
    (3)String toString():Enum父类又重写了Object类的toString，返回的也是常量对象的名称
    当然，子类还可以重写

    编译器会自动添加如下方法：
    (1)static 枚举类型[] values(): 返回枚举类型的所有常量的对象
    (2)static 枚举类型[] valuesOf(String name)
     */
public class TestMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Week week = Week.MONDAY;
        System.out.println(week.name());
        System.out.println(Week.MONDAY.name());
        System.out.println(week);
        System.out.println(week.ordinal());
        System.out.println(week.toString());

        String a= input.next();
        System.out.println(a==Week.MONDAY.name());
        System.out.println("-------------------------------");

        Week[] arr = Week.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("----------------------------");

        while (true) {
            System.out.println("请输入枚举常量对象名称：");
            String name = input.next();
            if (name.equals(Week.MONDAY.name())
                    || name.equals(Week.TUESDAY.name())
                    || name.equals(Week.WEDNESDAY.name())
                    || name.equals(Week.THURSDAY.name())
                    || name.equals(Week.FRIDAY.name())
                    || name.equals(Week.SATURDAY.name())
                    || name.equals(Week.SUNDAY.name())
            ) {
                Week mon = Week.valueOf(name);
                System.out.println(mon);
                return;
            } else {
                System.out.println("输入星期不对，请重新输入：");
            }
        }
    }


}

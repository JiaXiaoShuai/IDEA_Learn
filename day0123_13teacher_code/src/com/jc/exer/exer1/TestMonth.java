package com.jc.exer.exer1;

import java.util.Scanner;

/*
（1）声明月份枚举类Month：
①声明一个属性，私有化，加final修饰
- description（描述，例如：JANUARY的description为一月，FEBRUARY的description为二月，依次类推）
②声明一个有参构造Month(String description)，创建12个常量对象，常量对象的名称如下
JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER

③public static Month getByValue(int value)：返回对应月份值的枚举对象，例如实参传入1，则返回JANUARY对象。

④public int length(boolean leapYear)：返回这个月的总天数，如果当前对象是FEBRUARY，并且leapYear是true，则返回29，否则返回28。其他月份对象无论leapYear参数是true还是false，都正常返回月份总天数。

⑤重写toString()：返回对象信息，例如：1->JANUARY->一月份。

2、在测试类中，从键盘输入年份和月份值，获取对应的月份对象，并打印月份对象，并获取月份总天数。
 */
public class TestMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入年份");
        int year = input.nextInt();

        System.out.println("请输入月份");
        int monthValue = input.nextInt();

        Month month = Month.getByValue(monthValue);
        System.out.println(month);

        boolean leapYear = year%4==0;
        System.out.println(Month.length(month,leapYear));
    }
}

package com.jc.xiaobai.oop9;

import java.util.Scanner;

/**
 * 枚举类
 */
public enum WeekDays02 {
    //枚举常量列表
    MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;

    //实例变量
    private String name;
    private int index;

    //静态变量
    private static int staticVar = 100;

    //覆盖父类中的toString（）方法


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('-');
        sb.append(index);
        return sb.toString();

    }

    //实例方法
    public String getInfo(){
        //调用父类中toString()方法
        return super.toString();
    }

    //静态方法
    public static int getStaticVar(){
        return staticVar;
    }
}

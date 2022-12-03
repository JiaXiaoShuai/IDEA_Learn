package com.jc.xiaobai.oop9;

/**
 * 不用枚举类，声明静态常量代替枚举常量，去表示周一到周五
 */
public interface WeekDays01 {
    final static int MONDAY = 0;
    int TUESDAY = 1;//接口可以省略final static
    int WEDNESDAY = 2;
    int THURSDAY = 3;
    int FRIDAY = 4;

}

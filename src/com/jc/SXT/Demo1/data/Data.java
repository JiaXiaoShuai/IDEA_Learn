package com.jc.SXT.Demo1.data;

/**
 * 数据类型
 */
public class Data {
    public static void main(String[] args) {
       /*
       * 整数型：byte short  int long
       * 浮点型：float double
       * 字符型：char
       * 布尔型：boolean  true false 用于逻辑判断
       * 引用数据类型：类，抽象类，接口，枚举。。。。。。。
       * */
        //字节型整数  8位   1字节  256  -128~127
        byte b = 127;

        //短整型整数  16位 2字节 65536  -32768~23767
        short s = 23767;

        //整数型  32位 4字节 -21亿~21亿 默认存储整数常量类型
        int i = 10;
        //长整型  64位  8字节  -21亿~21亿
        long l = 10L;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        //单精度浮点数  小数点后面有7位数
        float f = 9.123456789123456789f;
        System.out.println(f);
        //双精度浮点数，默认存储浮点数的格式，后缀位f/F
        double d = 1.123456789123456789;
        System.out.println(d);

        //布尔类型
        boolean boo = 10<20;
        System.out.println(boo);

        //字符型   只能存储一个字符
        char c = 'a';

        //数据类型转换
        //从小到大数据不会损失，从大到小数据（不在范围内）会丢失
        //double>>>float>>> long>>>int>>>short>>>byte
        long lo = (int)100;
        int in = (int) 1000;
    }
}

package com.jc.SXT.Demo1.typeofdata;

public class TypeOfData {
    public static void main(String[] args){
        /*整数型  byte  short int long
	    浮点型  float  double  小数
	    字符型  char
	    布尔型  boolean   true false  做逻辑判断
	    引用数据类型（reference data type）类 抽象类 接口 枚举 …. …
         */
        //字节型整数 8位  1字节     256  -128~~127
        byte b = 127;
        //短整数型  16位  2字节  65536  -32768~23767
        short c = 10;
        //整数型 32位  4字节  默认存储整数常量的类型
        int i = 100;
        //长整数型
        long k = 2000;

        //单精度浮点数。小数点后面尤7位小数
        float a  = 0.12345678f;

        //双精度浮点数
        //也是java中默认存储浮点数的格式
        //后缀为f F  告诉java 以float 存储一个数据
        double f  = 1.2345678987654566;

        //boolean 用来做逻辑判断
        boolean g = 10 < 20;

        System.out.println(g);

        /*只能存储一个字符 使用单引号包裹字符*/
        char c1 = 'A';
        System.out.println(c1);

        short  a1 =1000;
        byte a2 = (byte)a1;
        System.out.println(a2);

        int s = 1;
        int j3 = s++;
        System.out.println(j3);
        j3 = ++s;
        System.out.println(j3);

        System.out.println("*****************************************");

        int m = 10;
        int n = 5;

        int v = m + n++;
        System.out.println(v);
        System.out.println(n);
        System.out.println(m);

        v = ++m + n--;
        System.out.println(v);
        System.out.println(n);
        System.out.println(m);

        // ++和--在前，先让变量加1，然后参与运算
        //++和--在后，先让变量运算，然后变量自增/自减1


        /*逻辑运算符 运算结果是boolean 类型
         * & 逻辑与运算 并且 多个条件同为true 则为true 一方为false 则为false
         * | 逻辑或运算 或者 多个条件任意一个为true 则为true 全为false才为false
         * && 短路与运算 并且    发现前面的一项结果为false 则后面的条件就不在运算了
         * || 短路或运算 或者   发现前面的一项结果为true  则后面的条件就不运算了
         * ^  逻辑异或运算   相同则为false 不同则为 true
         * !  逻辑非运算
         * */
        boolean b5 = 10<20 ^ 20>30;
        System.out.println(b5);
         /*位运算符在二进制上运算的符号
        <<  左移运算   左移动一位相当于 *2
        >>  右移运算    右移动一位相当于 /2
        >>> 不带号右移运算
        &   按位与运算  同为1 则为1 一方为0 则为0
        |   按位或运算  同为0 则为0 一方为1 则为1
        ^   按位异或运算  相同即为0 不同即为1
        ~   按位取反运算
          */

        int score = 80;
        String result = score > 60 ? "及格" : "不及格"; // 三元运算符（? : ）
        System.out.println(result);
    }
}

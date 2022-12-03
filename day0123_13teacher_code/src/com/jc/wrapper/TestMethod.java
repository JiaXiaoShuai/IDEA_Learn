package com.jc.wrapper;
/*
(1)获取某个数据类型的范围：
最常用的包装类Integer，依次类推其他包装类
包装类.MAX_VALUE
包装类.MIN_VALUE

(2)把十进制的整数转化为其他进制
//查看25这个十进制值的二进制、八进制、十六进制
Integer.toBinaryString(25)二进制
Integer.toOctalString(25)八进制
Integer.toHexString(25)十六进制

(3)基本数据类型的值与字符串之间的转换方法
包装类有可以把字符串转化为基本数据类型的方法
int Integer.parseInt(字符串)
double Double.parseDouble(字符串)
boolean Boolean.parseBoolean(字符串)
...
Integer.valueOf(字符串)
Double.valueOf(字符串)
...

(4)针对字符类型，有转大小写的方法
Character.toUpperCase(字符)
Character.toLowerCase(字符)

(5)比较大小
Double.compare(两个小数)
Integer.compare(两个整数)
返回值都是int类型。要么返回正整数，要么是负数，要么是0，分别表示大于小于等于的关系

 */
public class TestMethod {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println("___________________________");
        System.out.println(Integer.toBinaryString(25));
        System.out.println(Integer.toOctalString(25));
        System.out.println(Integer.toHexString(25));


        System.out.println("------------------------");
        System.out.println(Integer.parseInt("12134"));
        System.out.println(Double.parseDouble("2.134"));
        System.out.println(Boolean.parseBoolean("truE"));//"true"大小写都可以，字符串结果为true，剩下的都是false
        System.out.println(Integer.valueOf("1111"));
        System.out.println(Double.valueOf(1.2222));

        System.out.println("-----------------------------");
        //把基本数据类型的值转为字符串类型
        int i = 1;
        String str1 = i+"";
        String str2 = String.valueOf(i);

        System.out.println("----------------------");
        char letter = 'a';
        int a = letter-32;
        System.out.println(a);
        char big = (char)(letter-32);
        System.out.println(letter+"->"+big);

        char upper = Character.toUpperCase(letter);
        System.out.println(letter+"->"+upper);

        char lower = Character.toLowerCase(upper);
        System.out.println(letter+"->"+upper+"->"+lower);

        System.out.println("_________________________");
        //比较两个数的大小
        double x = 2.3;
        double y = 2.3;
        if(x>y){
            System.out.println("x>y");
        }else if(x<y){
            System.out.println("x<y");
        }else{
            System.out.println("x=y");
        }

        System.out.println(Double.compare(x,y));
    }
}

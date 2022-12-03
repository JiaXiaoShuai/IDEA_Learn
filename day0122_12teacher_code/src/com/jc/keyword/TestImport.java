package com.jc.keyword;

import static java.lang.Math.*;

/*
7.1.7 静态导入
导入：导包，引用某个类
当你使用另一个类的静态成员时，比如静态变量，静态方法等。
同时使用了这个类的很多静态成员，那么可以使用静态导入的方式，简化代码。

格式：
import static 包.类名.静态成员名;
import static 包.类名.*;
 */
public class TestImport {
    public static void main(String[] args) {
        //使用数学工具类Math的一些常量和方法
        System.out.println("圆周率：" + PI);
        System.out.println("随机数：" + random());
        System.out.println("求平方根：" + sqrt(9));
    }
}

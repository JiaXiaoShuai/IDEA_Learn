package com.jc.keyword;

/*
6.5.3 final关键字
1、final：
英语：最终的
Java中：也是最终的，不可更改的

2、用在哪里呢？
（1）在class关键字前面
（2）在方法的返回值类型前面
（3）在变量名前面，数据类型后面

3、它的作用是什么？
（1）在class关键字前面，表示这个类不能被继承，即没有子类，我们可以称它为“太监类”。
哪些类太监类？  String，Math，System类都是

为什么这些类要用final修饰呢？
不能你继承。

为什么不让你继承呢？
子类继承就意味着，可以扩展和重写它里面的方法，而这些类太重要了，它是Java程序的基石，核心中的核心，不希望你更改。


（2）在方法的返回值类型前面，表示这个方法不能被子类重写，但是可以被子类继承。
当某个类可以有子类，只是个别方法不能被重写，那么就在个别方法前面加final。

（3）在变量名前面，数据类型后面
表示这个变量的值不能被修改，我们称为最终变量，也叫做常量。

如果某个变量是final修饰的，那么无论它是否是局部变量，都必须手动初始化，不能用默认值。

 */
public class TestFinal {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.method();

        final int a = 1;
//        a = 2;//错误，变量的值不能修改
    }
}

final class Base{

}
class Fu{
    public final void method(){
        System.out.println("Fu.method");
    }
}
/*
class Sub extends Base{//错误，final类不能被继承

}*/
class Sub extends Fu{
/*    public final void method(){//错误，final的方法不能被重写
        System.out.println("Sub.method");
    }*/
}

class MyClass{
    final int x = 1;
   // final int y ;//报错，因为y常量，必须在实例初始化相关代码中，明确初始化，否则后面没有set方法，它就没有值了
/*    {
        y = 1;//可以，它也是实例初始化代码的一部分
    }*/

/*    public MyClass(int y) {
        this.y = y;
    }*/

    //是否可以生成它的set方法
    //final修饰的成员变量，是没有set方法的
    public int getX() {
        return x;
    }
}
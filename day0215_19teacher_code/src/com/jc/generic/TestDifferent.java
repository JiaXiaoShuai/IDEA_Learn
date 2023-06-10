package com.jc.generic;
/*
3、独立声明两个泛型方法，和两个使用了泛型类或泛型接口上面的泛型变量的区别
 */
public class TestDifferent {
    public static void main(String[] args) {
        MyClass<String> my = new MyClass<>();
        my.method("hello");
        my.fun("world");
        //这两个方法的T类型，在创建MyClass对象，或者子类继承MyClass类时，统一确定。

        System.out.println("----------------------");

        Demo d = new Demo();
        d.method("hello");
        d.fun(1);
        //这两个方法的T类型是独立的，各自在调用时，由实参类型自动确定
    }
}

class MyClass<T>{ //这个位置声明的T类型是不能用于静态成员的，像静态方法等
    public void method(T t){
        //....
    }

    public void fun(T t){
        //...
    }

/*    public static void test(T t){//报错，因为这个T类型是MyClass对象有关

    }*/
}
class Demo{
    public <T> void method(T t){
        //...
    }

    public <T> void fun(T t){
        //...
    }

    public static <T> void test(T t){//可以，因为是这个方法单独声明的泛型T，在调用方法时，由实参确定T的类型

    }
}

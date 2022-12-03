package com.jc.exer.exer2;
/*
（1）声明一个图形父类Shape，包含

- public double area()：返回0.0
- public double perimeter()：返回0.0
- public String toString()：返回“面积：xxx，周长：xxx”
 */
public class Shape {
    //在父类中写这些方法的目的是为了多态引用时。可以调用这些方法
    public double area(){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "面积:"+area()+",周长:"+perimeter();
    }
}

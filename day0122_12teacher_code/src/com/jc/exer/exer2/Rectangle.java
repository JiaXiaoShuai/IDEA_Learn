package com.jc.exer.exer2;
/*
（2）声明一个矩形Rectangle，继承Shape父类

- 属性：长和宽，私有化
- 提供get/set
- 提供无参构造和有参构造
- 重写area()和perimeter方法，
- 重写toString方法，返回“长：xx，宽：xx，面积：xxx，周长：xxx”
 */
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "长:"+length+",宽:"+width+",面积:"+area()+",周长:"+perimeter();
    }
}

package com.jc.inter;

public class Circle implements Cloneable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    //重写父类方法的快捷键Ctrl + O
    //方法()后面有 throws CloneNotSupportedException（不支持克隆异常），这个表示clone()方法很可能报这个异常
    //建议/强制要求调用者必须提前编写处理这个异常的代码
    //如果希望调用这个方法时不报CloneNotSupportedException异常，解决方案就是，让这个类实现java.lang.Cloneable接口
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
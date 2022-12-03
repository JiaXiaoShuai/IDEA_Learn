package com.jc.review;

import java.util.Objects;

/*
（1）声明三角形类Triangle

属性：double类型的a,b,c，代表三角形的三条边，要求属性使用final声明，并且私有化

提供有参构造，并且在构造器中检查a,b,c是否可以构成三角形，如果a,b,c可以构成三角形则正常赋值，
否则提示错误，并且a,b,c赋值为0

生成a,b,c的get方法

重写toString方法，并返回三角形信息，例如：“三角形三边是：3.0,4.0,5.0，面积是6.0，周长是：12.0”

重写hashCode和equals方法

（2）在测试类的main中创建两个三角形对象，a,b,c分为赋值为3,4,5，调用equals方法比较两个对象是否相等，
打印两个对象看结果。
 */
public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {

        if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
            this.a = a;
            this.b = b;
            this.c = c;
        }else{
            System.out.println("错误这个不是三角形");
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "第一条边为:"+a+",第二条边为:"+b+",第三条变为:"+c+",面积为:"
                +Math.sqrt((a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c))+",周长为:"+(a+b+c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 && Double.compare(triangle.b, b) == 0 && Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}

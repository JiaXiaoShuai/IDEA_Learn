package com.jc.generic;
/*
（2）矩形类Rectangle实现java.lang.Comparable<T>接口，并指定泛型为<Rectangle>，重写int compareTo(T t)方法，
按照矩形面积比较大小，面积相等的，按照周长比较大小。

一个Rectangle对象是和另一个Rectangle对象做比较，
所以Comparable<T>接口的泛型指定为<Rectangle>
 */
public class Rectangle implements Comparable<Rectangle>{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area =" + area() +
                ", perimeter =" + perimeter() +
                '}';
    }

    public double area(){
        return  length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }

    @Override
    public int compareTo(Rectangle o) {
        /*
        重写int compareTo(T t)方法，
按照矩形面积比较大小，面积相等的，按照周长比较大小。
         */
        int result = Double.compare(area(),o.area());
        return result == 0?Double.compare(perimeter(),o.perimeter()):result;
    }
}

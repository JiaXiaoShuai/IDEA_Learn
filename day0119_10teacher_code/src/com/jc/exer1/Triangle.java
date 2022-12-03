package com.jc.exer1;

public class Triangle extends Graphic{
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    /**
     * 判断给出三条边是否为三角形
     * @param a 三角形的一条边
     * @param b 三角形的一条边
     * @param c  三角形的一条边
     */
    public void setBases(double a,double b,double c){
        if(a > 0 && b >0 && c > 0&&a+b>c&&a+c>b&&b+c>a){
            System.out.println("这是一个三角形");
            this.a = a;
            this.b = b;
            this.c = c;
        }else{
            System.out.println("错误！这不是三角形");
        }
    }

    @Override
    public double area() {
        return Math.sqrt((a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public String getInfo() {
        return "第一条边长度为:"+a+",第二条边的长度为:"+b+",第三条边的长度为:"+c+super.getInfo();
    }
}

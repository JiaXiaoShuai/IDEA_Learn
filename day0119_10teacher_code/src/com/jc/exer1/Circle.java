package com.jc.exer1;

public class Circle extends Graphic {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public String getInfo() {
        return  "半径:"+radius+super.getInfo();
    }
}

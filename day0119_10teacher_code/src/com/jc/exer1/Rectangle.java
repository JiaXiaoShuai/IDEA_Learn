package com.jc.exer1;

public class Rectangle extends Graphic {
    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double area() {
        return height*weight;
    }

    @Override
    public double perimeter() {
        return (weight+height)*2;
    }

    @Override
    public String getInfo() {
        return "长:"+height+",宽"+weight+","+super.getInfo();
    }
}

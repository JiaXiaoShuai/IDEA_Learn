package com.jc.polymorphism;

public class GraphicTools {

    public Graphic maxArea(Graphic g1, Graphic g2){
        return g1.area()>g2.area() ? g1 : g2;
    }
}

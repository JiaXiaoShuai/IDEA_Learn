package com.jc.polymorphism;

public class GraphicToolsTest{
    public static void main(String[] args) {
        GraphicTools tools = new GraphicTools();

        Rectangle r1 = new Rectangle();
        r1.setHeight(5);
        r1.setWeight(3);

        Rectangle r2 = new Rectangle();
        r2.setHeight(3);
        r2.setWeight(2);

        Graphic g1 = tools.maxArea(r1,r2);
        System.out.println(g1.getInfo());

        Circle c1 = new Circle();
        c1.setRadius(2);

        Graphic g2 = tools.maxArea(r2,c1);
        System.out.println(g2.getInfo());

    }
}

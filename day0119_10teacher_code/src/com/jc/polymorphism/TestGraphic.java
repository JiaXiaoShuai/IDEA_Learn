package com.jc.polymorphism;

public class TestGraphic {
    public static void main(String[] args) {
        Graphic[] arr = new Graphic[4];
        Rectangle r1 = new Rectangle();
        r1.setHeight(5);
        r1.setWeight(3);
        arr[0] = r1;

        Rectangle r2 = new Rectangle();
        r2.setHeight(3);
        r2.setWeight(2);
        arr[1] = r2;

        Circle c1 = new Circle();
        c1.setRadius(2);
        arr[2] = c1;

        Circle c2 = new Circle();
        c2.setRadius(10);
        arr[3] = c2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }
    }
}

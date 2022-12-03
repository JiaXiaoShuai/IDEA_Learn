package com.jc.exer1;

public class TestGraphic {
    public static void main(String[] args) {
        Graphic[] arr = new Graphic[4];

        Rectangle r1 = new Rectangle();
        r1.setHeight(3);
        r1.setWeight(4);
        arr[0] = r1;

        Rectangle r2 = new Rectangle();
        r2.setHeight(1);
        r2.setWeight(2);
        arr[1] = r2;

        Circle c1 = new Circle();
        c1.setRadius(2);
        arr[2] = c1;

        Circle c2 = new Circle();
        c2.setRadius(1);
        arr[3] = c2;

        Sort so = new Sort();
        so.sort(arr);

        Triangle tri = new Triangle();
        tri.setBases(3,4,5);
        System.out.println(tri.getInfo());
    }
}

class Sort{
    public Graphic[] sort(Graphic[] arr){
        System.out.println("排序前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }

        System.out.println("排序后:");
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j].area() > arr[j+1].area()){
                    Graphic temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }
        return arr;
    }
}
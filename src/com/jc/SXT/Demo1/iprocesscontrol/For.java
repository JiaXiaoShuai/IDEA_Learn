package com.jc.SXT.Demo1.iprocesscontrol;

public class For {
    public static void main(String[] args) {
        int b;
        int a;
        for( a = 0, b = 10;a<5&&b>6;a++,b--){
            System.out.println(a);
        }
        int A[] = {1,2,3};
        for (int B:A) {
            System.out.println(B);
        }

        label1: for (int x = 0; x < 5; x++)
        for (int y = 5; y > 0; y--) {
            if (y == x) {
                continue label1;
            }
            System.out.printf("(x,y) = (%d,%d)", x, y);
            System.out.println();
        }
        System.out.println("############################################################");

         for (int x = 0; x < 5; x++)
             label2:for (int y = 5; y > 0; y--) {
                if (y == x) {
                    continue label2;
                }
                System.out.printf("(x,y) = (%d,%d)", x, y);
                System.out.println();
            }
        System.out.println("############################################################");
    }
}


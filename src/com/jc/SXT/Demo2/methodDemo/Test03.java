package com.jc.SXT.Demo2.methodDemo;

public class Test03 {
    public static void main(String[] args) {
        Test02.print99();
        Test02.printFactorial(9);
        int a = Test02.getPower(3,3);
        System.out.println(a);
        /*System.out.printf("%.2f",Test02.getFloat(1.203f));*/

        int[]  arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Test02.getArraySum(arr));
    }
}

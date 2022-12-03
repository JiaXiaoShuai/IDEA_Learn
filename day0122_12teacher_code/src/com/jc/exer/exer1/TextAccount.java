package com.jc.exer.exer1;

public class TextAccount {
    public static void main(String[] args) {
        Account acc1= new Account("11111",1000);
        Account acc2 = new Account("22222",2000);
//        Account.setRate();
        acc1.setRate(0.035);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        acc2.setRate(0.036);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println("----------------------------------------");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}

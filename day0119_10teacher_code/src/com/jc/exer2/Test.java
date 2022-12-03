package com.jc.exer2;

public class Test {
    public static void main(String[] args) {
        Tools tool = new Tools();
        CreditCard de = new CreditCard();
        de.setOverdraft(0);
        de.setMaxOverdraft(500);
        de.setAccount("jia123456789");
        de.setBalance(100);

        CreditCard de2 = new CreditCard();
        de2.setOverdraft(de.getOverdraft());
        de2.setMaxOverdraft(de.getMaxOverdraft());
        de2.setBalance(de.getBalance());
        de2.setAccount(de.getAccount());

        /*while (tool.compare(de,de2)){
            System.out.println("这两个对象相同");
            break;
        }*/



        de.withdraw(600);
        System.out.println(de.getInfo());
        System.out.println("----------------------");

        de.withdraw(100);
        System.out.println("____________________________");

        de.save(250);
        System.out.println(de.getInfo());

        de.setAccount("1234");

        tool.compare(de,de2);
    }


}

package exer.exer4;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("张三",-5);
            System.out.println(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Person p2 = new Person();
        p2.setName("李四");
        try {
            p2.setLifeValue(-5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            p2.setLifeValue(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p2);

        String a = "name";
        String b = "name";
        a.equals(b);
        System.out.println(a.equals(b));



    }
}

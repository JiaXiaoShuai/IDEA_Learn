package com.jc.cast;

public class TestClassCast {
    public static void main(String[] args) {
        Person p1  = new Man();
        p1.eat();
        p1.walk();

        Man m = (Man)p1;
        m.smoke();//向下转型

        Person person = m;//向上转型
        person.walk();


    }
}

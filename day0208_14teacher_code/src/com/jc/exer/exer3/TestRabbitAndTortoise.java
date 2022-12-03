package com.jc.exer.exer3;

public class TestRabbitAndTortoise {
    public static void main(String[] args) {
        Rabbit ra = new Rabbit();
        ra.run();

        Tortoise to = new Tortoise();
        to.run();
        to.swim();

        System.out.println(to.getClass());
    }
}

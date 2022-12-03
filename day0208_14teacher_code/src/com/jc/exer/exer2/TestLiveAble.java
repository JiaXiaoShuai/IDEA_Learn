package com.jc.exer.exer2;

public class TestLiveAble {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sleep();
        a.breathe();
        a.eat();

        Plant p = new Plant();
        p.breathe();
        p.sleep();
        p.eat();

        LiveAble.drink();
    }
}

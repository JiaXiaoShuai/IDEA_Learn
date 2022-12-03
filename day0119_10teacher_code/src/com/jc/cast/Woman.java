package com.jc.cast;

public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void walk() {
        System.out.println("女人走路");
    }

    public void makeup(){
        System.out.println("化妆");
    }
}

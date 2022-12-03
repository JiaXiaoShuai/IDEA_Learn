package com.jc.cast;

public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void walk() {
        System.out.println("男人走路");
    }

    public void smoke(){
        System.out.println("抽烟");
    }
}

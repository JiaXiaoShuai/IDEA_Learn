package com.jc.abstracttype;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();//没有方法体
}

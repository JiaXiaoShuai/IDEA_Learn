package com.jc.polymorphism;

public class Person {
    private String name;
    private Dog dog;
    private Cat cat;

    private Pet pet;
    private  Pet[] pets = new Pet[5];
    private int total;


    public void adopt(Pet pet){
        this.pet = pet;
        pets[total++] = pet;
    }

    public void feed(){
        //pet.eat();
        for (int i = 0; i < total; i++) {
            pets[i].eat();
        }
    }
}

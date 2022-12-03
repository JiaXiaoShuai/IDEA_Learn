package com.jc.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        Pet dog1 = new Dog();
        dog.eat();
        dog1.eat();

        Cat cat = new Cat();
        Pet cat1 = new Cat();
        cat.eat();
        cat1.eat();


        person.adopt(dog);
        person.adopt(cat);

        person.feed();

    }
}

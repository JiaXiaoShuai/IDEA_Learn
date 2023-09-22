package com.jc.demo;

public class Demo1 {
    private int age;
    private String name;

    private Demo1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

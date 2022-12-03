package com.jc.SXT.Demo3.testextends;

public class TestExtends {
    private int age;
    private String name;

    public TestExtends(){
        super();
    }

    public TestExtends(int age, String name) {
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
        return "age:"+this.age+",name:"+name;
    }
}

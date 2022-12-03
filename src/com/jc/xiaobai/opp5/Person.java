package com.jc.xiaobai.opp5;

/**
 * 测试多态
 */
public class Person extends Object {
    String name;
    int age;

    public Person(){
        super();
    }

    public Person(String name, int age){
        this.name =name;
        this.age =age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

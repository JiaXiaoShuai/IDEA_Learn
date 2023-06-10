package com.jc.coll;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * 用来测试Collection以及其子类加入的removeIf方法
 */
public class Test {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Person("sss",22));
        coll.add(new Person("bbb",23));
        coll.add(new Person("fff",24));
        coll.add(new Person("aaa",22));

        coll.removeIf(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.age ==24;
            }
        });

        System.out.println(coll.toString());
    }
}

class Person{
    String name;
    Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

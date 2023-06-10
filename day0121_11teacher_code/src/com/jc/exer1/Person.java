package com.jc.exer1;

/*
（1）声明父类：Person类
- 包含属性：姓名，年龄，性别，属性私有化，
- 包含get/set方法
- 提供无参构造public Person()
- 提供有参构造public Person(String name, int age, char gender)
- 包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男


类{
    成员变量；

    构造器；

    get/set

    其他方法
}

 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo(){
        return "姓名：" + name + "，年龄：" + age + "，性别：" + gender;
    }
}

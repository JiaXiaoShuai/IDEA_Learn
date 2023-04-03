package com.jc.exer1;

//（4）在测试类的main方法中用有参构造创建三个类的对象，并调用相应的方法测试
public class TestPeople {
    public static void main(String[] args) {
        Person p1 = new Person("张三",23,'男');
        Student s1 = new Student("涛涛",22,'男',98);
        Teacher t1 = new Teacher("柴林燕",18,'女',15000);
        System.out.println(p1.getInfo());
        System.out.println(s1.getInfo());
        System.out.println(t1.getInfo());
    }
}

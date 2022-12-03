package com.jc.xiaobai.opp5;

/**
 * 测试引用类型转换
 */
public class TestObjRefenence {
    public static void main(String[] args) {
        Person p1 = new Student("tom",18,"清华大学");
        Person p2 = new Worker("Tom",18,"钢厂");

        Person p3 = new Person("Tom",28);
        Student p4 = new Student("Ben",20,"电厂");
        Worker p5 = new Worker("Tony",38,"电子厂");

        //向上转型
        Person p = (Person) p4;
        //向下转型
        Student p11 = (Student) p1;
        Worker p12 = (Worker) p2;

        //Student p111 = (Student) p2;//运行异常ClassCastException
        if(p2 instanceof Student){
            Student p111 = (Student) p2;
        }
        //Worker p121 = (Worker) p1;//运行异常ClassCastException
        if(p1 instanceof Worker){
            Worker p121 = (Worker) p1;
        }
        //Student p131 = (Student) p3;//运行异常ClassCastException
        if(p3 instanceof Student){
            Student p131 = (Student) p3;
        }

        System.out.println(p);
        System.out.println(p11);
        System.out.println(p12);
    }
}

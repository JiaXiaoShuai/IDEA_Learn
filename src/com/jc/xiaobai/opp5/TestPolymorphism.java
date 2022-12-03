package com.jc.xiaobai.opp5;

public class TestPolymorphism {
    public static void main(String[] args) {
        Student stu1 = new Student("tom",18,"清华大学");
        Student stu2 = new Student("Ben",28,"北京大学");
        Student stu3 = new Student("Tony",38,"香港大学");

        Worker worker1 = new Worker("Tom",18,"钢厂");
        Worker worker2 = new Worker("Ben",20,"电厂");

        Person[] people = {stu1,stu2,stu3,worker1,worker2};

        int studentCount = 0;
        int workerCount = 0;
        //引用类型检查 obj instanceof type 返回true或者false
        for(Person item:people){
            if(item instanceof Worker){
                workerCount++;
            }else if (item instanceof Student) {
                studentCount++;
            }
        }
        System.out.printf("工人人数：%d,学生人数：%d",workerCount,studentCount);
    }
}

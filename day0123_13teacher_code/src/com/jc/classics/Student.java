package com.jc.classics;

public class Student implements Comparable{
    private String name;
    private int score;
    private int age;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, int age) {
        this(name,score);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        //哪两个对象比较大小
        //当前对象this（调用这个方法的对象）和o对应的实例对象
        //它们应该都是学生对象

        Student student = (Student) o;
        //这里为什么要向下转型？因为要使用 o对象中的成绩等信息

        int result = this.score - student.score;

        if(result != 0){//成绩不相同
            return  result;
        }
        //name是String，是对象，对象比较大小，默认就是用compareTo方法
        return this.name.compareTo(student.name);
        //所以，String类型的变量也可以调用compareTo方法
        //String类中是按照字符的 Unicode编码值比较大小
    }
}

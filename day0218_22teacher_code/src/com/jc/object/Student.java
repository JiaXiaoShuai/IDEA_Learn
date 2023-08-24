package com.jc.object;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -3979294235569238736L;
    private static int total = 1;
    private int id;
    private String name;
    private int age;
    private transient int score;//transient瞬时的，临时，序列化时遇到transient标记的字段，会忽略它
    private String tel;

    private int anInt;
    public Student(String name, int age, int score) {
        id=total++;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Student.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", tel='" + tel + '\'' +
                '}';
    }
}

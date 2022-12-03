package com.jc.keyword;

public class Employee {
     static int total;//默认值还是0
    private int id;
    private String name;
    private int score;

    {
        //非静态代码块，两个构造器共同代码的提取
        total++;
        this.id = total;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Employee.total = total;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ",total = " + total +
                '}' ;
    }
}

package com.jc.generic;
/*
例如：我们要声明一个学生类，该学生包含姓名、成绩，而此时学生的成绩类型不确定，为什么呢，
因为，语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，
数学老师希望成绩是89.5, 65.0，
英语老师希望成绩是'A','B','C','D','E'。
那么我们在设计这个学生类时，就可以使用泛型。
 */
public class Student<T,R> {
    private String name;
    private T score;
    private R height;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    public R getHeight() {
        return height;
    }

    public void setHeight(R height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", height=" + height +
                '}';
    }
}

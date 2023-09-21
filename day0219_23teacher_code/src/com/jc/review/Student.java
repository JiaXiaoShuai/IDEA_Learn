package com.jc.review;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

}

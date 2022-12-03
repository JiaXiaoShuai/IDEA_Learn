package com.jc.xiaobai.opp5;

public class Student extends Person{
    String school;
    public Student(){
        super();
    }

    public Student(String name,int age,String school){
        super(name, age);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

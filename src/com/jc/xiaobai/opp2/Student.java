package com.jc.xiaobai.opp2;

public class Student extends Person {
    String school;

    Student(){
        super();
    }

    Student(String height,String school){
        super(height,30);
        this.school = school;
    }
}

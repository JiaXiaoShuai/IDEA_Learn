package com.jc.exer3;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double earning(){
        return 0.0;
    }

    public String getInfo(){
        return "姓名:"+name+"实发工资:"+earning();
    }
}

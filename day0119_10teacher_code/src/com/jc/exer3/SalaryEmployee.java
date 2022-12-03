package com.jc.exer3;

public class SalaryEmployee extends Employee{
    private double salary;
    private MyDate birthday;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public double earning() {
        return salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"出生日期:"+birthday.getInfo();
    }


}

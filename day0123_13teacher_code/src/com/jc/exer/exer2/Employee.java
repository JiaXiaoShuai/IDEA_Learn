package com.jc.exer.exer2;
/*
（2）普通员工Employee类
- 包含编号、姓名、年龄、工资，属性私有化
- ==提供无参构造==
- ==提供有参构造Employee(int id, String name, int age, double salary)==
- 提供get/set方法
- 提供String getBasicInfo()方法：返回员工基本信息
- 重写toString()：返回员工基本信息
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBasicInfo(){
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    @Override
    public String toString() {
        return getBasicInfo();
    }
}

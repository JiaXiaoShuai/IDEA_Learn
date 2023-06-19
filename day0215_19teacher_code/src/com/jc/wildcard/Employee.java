package com.jc.wildcard;

import java.util.Objects;

/*
（2）声明员工类型Employee，包含属性姓名（String），薪资（double），年龄（int），属性私有化，提供有参构造、get/set方法、重写toString方法，重写hashCode和equals方法。
 员工类Employee实现java.lang.Comparable<T>接口，指定T为Employee类型，
重写抽象方法int compareTo(T t)，按照薪资比较大小，薪资相同的按照姓名的自然顺序（调用String类的compareTo方法）比较大小。
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employ = (Employee) o;
        return Double.compare(employ.salary, salary) == 0 && age == employ.age && Objects.equals(name, employ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int a = Double.compare(salary,o.salary);
        return a == 0 ? name.compareTo(o.name):a;
    }
}

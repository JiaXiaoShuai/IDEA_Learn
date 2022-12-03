package com.jc.review;

/*
需求：
    员工对象要比较大小，默认按照员工编号比较大小。==>员工类本身会实现java.lang.Comparable接口
 */
public class Employee implements Comparable{
    private int id;
    private String name;
    private int age;
    private double salary;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        //这里是this对象和o对象比较，o对象应该是另一个员工对象
        //取this.id和o.id比较
        //因为这个方法的形参是Object，当实参传给形参时，会向上转型为Object，需要向下转型为Employee
        return this.id - ((Employee)o).id;
        /*
        方法的返回值是int，结果只有三种，正整数、负整数、和0
        this.id - ((Employee)o).id  结果是正整数，说明this.id > o.id
        this.id - ((Employee)o).id  结果是负整数，说明this.id < o.id
        this.id - ((Employee)o).id  结果是0，说明this.id = o.id
         */
    }
}

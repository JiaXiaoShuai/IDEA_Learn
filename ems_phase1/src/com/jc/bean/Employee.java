package com.jc.bean;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;
    private String tel;
    private String email;

    public Employee(){
        super();
    }

    public Employee(String name, char gender, int age, double salary, String tel, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return name + "\t" + gender + "\t\t" + age + "\t\t" + salary + "\t" + tel + "\t" + email;
    }
}

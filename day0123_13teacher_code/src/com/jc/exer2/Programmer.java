package com.jc.exer2;

/*
（3）程序员Programmer类，继承普通员工类
- 提供无参构造
- 提供有参构造Programmer(int id, String name, int age, double salary)
- 重写toString()，增加职位“程序员”信息
 */
public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }


    @Override
    public String toString() {
        return super.toString() + "，职位：程序员";
    }
}

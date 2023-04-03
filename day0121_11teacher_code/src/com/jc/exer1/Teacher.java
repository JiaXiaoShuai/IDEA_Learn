package com.jc.exer1;

/*
（3）声明子类：Teacher类，继承Person类

- 新增属性：salary薪资，属性私有化，
- 包含get/set方法
- 提供无参构造public Teacher()
- 提供有参构造public Teacher(String name, int age, char gender, double salary)
- 重写getInfo()方法：例如：姓名：张三，年龄：23，性别：男，薪资：10000
 */
public class Teacher extends Person{
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, char gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，薪资：" + salary;
    }
}

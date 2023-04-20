package com.jc.review.emp;

/*
（3）声明一个子类SalaryEmployee正式工，继承父类Employee
- 增加属性，double类型的薪资，MyDate类型的出生日期，私有化，提供get/set方法
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资
- 重写方法，public String getInfo()：显示姓名和实发工资、生日
 */
public class SalaryEmployee  extends Employee{
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

    //重写快捷键Ctrl + O

    @Override
    public double earning() {
        return salary;//salary就是实发工资
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，生日：" + birthday.getInfo();
        //super.getInfo()等价于 "姓名：" + name + "，实发工资：" + earning();
        //如果这里birthday后面没有写.getInfo()，就会出现生日是  com.atguigu.review.emp.MyDate@xxxx数字
    }
}

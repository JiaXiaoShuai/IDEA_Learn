package com.jc.review.emp;

/*
（1）声明一个父类Employee员工类型，
- 有姓名属性，私有化，提供get/set方法
- public double earning()：代表实发工资，返回0.0
- public String getInfo()：显示姓名和实发工资
 */
public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //代表实发工资，返回0.0
    public double earning(){
        return 0.0;
    }

    //显示姓名和实发工资
    public String getInfo(){
        return "姓名：" + name + "，实发工资：" + earning();
        /*
        这里不用担心上面earning()的实现是return 0.0;
        因为我们后面是通过它的“子类”对象调用这个getInfo()方法的，子类会进行重写earning()
         */
    }
}

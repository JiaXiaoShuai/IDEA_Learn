package com.jc.review.emp;

/*
（4）声明一个子类HourEmployee小时工，继承父类Employee
- 有属性，double类型的工作小时数和每小时多少钱
- 重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
- 重写方法，public String getInfo()：显示姓名和实发工资，时薪，工作小时数
 */
public class HourEmployee extends Employee {
    private double hour;
    private double moneyPerHour;//每小时多少钱

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getMoneyPerHour() {
        return moneyPerHour;
    }

    public void setMoneyPerHour(double moneyPerHour) {
        this.moneyPerHour = moneyPerHour;
    }
    /*'
    重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
- 重写方法，public String getInfo()：显示姓名和实发工资，时薪，工作小时数
     */

    @Override
    public double earning() {
        return moneyPerHour * hour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"，时薪：" + moneyPerHour +"，工作的小时数：" + hour;
    }
}

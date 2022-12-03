package com.jc.constructor;

public class Manager extends Employee{
    private double bonusRate;

    public Manager() {
        super();//可以省略
    }

    public Manager(String name, int age, double salary, double bonusRate) {
        super(name, age, salary);//调用父类的有参构造
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"，奖金比例：" + bonusRate;
    }
}

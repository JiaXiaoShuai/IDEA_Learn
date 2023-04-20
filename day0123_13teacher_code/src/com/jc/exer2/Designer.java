package com.jc.exer2;

/*
（4）设计师Designer类，继承程序员类
- 增加奖金属性
- ==提供无参构造==
- ==提供有参构造Designer(int id, String name, int age, double salary, double bonus)==
- 重写toString()，增加职位“设计师”和奖金信息
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getBasicInfo() +"，职位：设计师，奖金：" + bonus;
    }
}

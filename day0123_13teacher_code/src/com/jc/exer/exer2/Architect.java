package com.jc.exer.exer2;
/*
（5）架构师Architect类，继承设计师类
- 增加股票属性
- ==提供无参构造==
- ==提供有参构造Architect(int id, String name, int age, double salary, double bonus, int stock)==
重写toString()方法，增加职位“架构师”和奖金、股票信息
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, double bonus, int stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getBasicInfo()+",职位:架构师,奖金:"+getBonus()+",股票:"+stock;
    }
}

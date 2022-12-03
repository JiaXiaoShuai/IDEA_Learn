package com.jc.exer3;

public class HourEmployee extends Employee{
    private double hour;
    private double moneyPerHour;

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

    @Override
    public double earning() {
        return moneyPerHour*hour;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"时薪:"+moneyPerHour+"工作小时数:"+hour;
    }
}

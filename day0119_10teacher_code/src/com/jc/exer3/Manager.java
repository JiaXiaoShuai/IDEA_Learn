package com.jc.exer3;

public class Manager extends SalaryEmployee{
    private double bonusRate;//奖金比例

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double earning() {
        return super.earning()*(1+bonusRate);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+",奖金比例:"+bonusRate;
    }
}

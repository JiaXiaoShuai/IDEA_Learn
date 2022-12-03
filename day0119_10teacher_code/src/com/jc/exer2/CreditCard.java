package com.jc.exer2;

public class CreditCard extends DepositCard{
    private double maxOverdraft;//最多透支额度
    private double overdraft;//已透支额度

    public double   getMaxOverdraft() {
        return maxOverdraft;
    }

    public void setMaxOverdraft(double maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    DepositCard cr = new DepositCard();
    @Override
    public void withdraw(double money) {
        if(money > (super.getBalance()+maxOverdraft-overdraft)){
            System.out.println("超过可透支额度");
            return;
        }else if(money <= super.getBalance()){
            super.withdraw(money);
        }else if(money <= (super.getBalance()+maxOverdraft-overdraft)&&money > cr.getBalance()){
            overdraft += (money-super.getBalance());
            super.withdraw(super.getBalance());
            System.out.println("您已透支:"+overdraft+"您的余额为:"+super.getBalance());
        }
    }

    @Override
    public void save(double money) {
        if(money < 0){
            System.out.println("存款金额不能为负数");
            return;
        } else if (money < overdraft) {
            System.out.println("本次存款金额只偿还部分已透支金额:"+money);
            overdraft -= money;
        }else if(money == overdraft){
            System.out.println("本次存款正好抵消已透支金额");
            overdraft -= money;
        }else if(money > overdraft){
            System.out.println("本次存款金额除了偿还透支金额，还有剩余:"+(money-overdraft));
            super.save((money-overdraft));
            overdraft = 0;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"最多透支额度:"+maxOverdraft+"已透支额度:"+overdraft;
    }
}

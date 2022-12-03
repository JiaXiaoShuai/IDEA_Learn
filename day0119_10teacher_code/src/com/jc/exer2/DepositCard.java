package com.jc.exer2;

public class DepositCard {//存款卡
    private String account;
    private double balance;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 取款方法
     * @param money 取款金额
     */
    public void withdraw(double money){
        if(money < 0) {
            System.out.println("取款金额不能为负数");
            return;
        }else if(money > balance){
            System.out.println("余额不足");
            return;
        }
        balance -= money;
    }

    /**
     * 存款方法
     * @param money 存款金额
     */
    public void save(double money){
        if(money < 0){
            System.out.println("存款金额不能为负数");
        }
        balance += money;
    }

    /**
     * 返回账户和余额的信息
     * @return 账户和余额的信息
     */
    public String getInfo(){
        return "账户:"+account+",余额:"+balance;
    }


}

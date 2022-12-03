package com.jc.exer.exer1;
/*
（1）声明一个银行账户类Account，
- 成员变量：利率、账号、余额，其中所有账户的利率是相同的，所有成员变量都私有化。
    成员变量分为静态变量和实例变量，
    区分哪些是声明为静态的，哪些是非静态的实例变量。

    怎么区分？看是对象独立的还是对象共享的。
    利率（共享）、账号、余额，（独立的）

- 提供get/set
- 提供有参构造public Account(String id ,double balance)
- 提供计算年利息方法public double annualInterest()，余额*利率
- 重写toString方法，返回账号和余额、年利息

（2）在测试类的main中，创建账户类的两个对象，账号分别为“11111”和“22222”，余额分别为“1000和2000”元，利率初始值是0.035，调用方法测试。
 */
public class Account {
    private static double rate;//利率
    private String id;//账号
    private double balance;//余额

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double annualInterest(){
        return balance*rate;//非静态方法中，可以直接使用本类的非静态实例变量和静态的类变量
    }

    @Override
    public String toString() {
        return "账号:"+id+",余额:"+balance+",年利息:"+rate;
    }

}

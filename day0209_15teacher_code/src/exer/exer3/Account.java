package exer.exer3;

public class Account {
    private String id;
    private double balance;

    public Account() {
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
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

    public void withdraw(double money) throws Exception {
        if(money < 0){
            throw new Exception("越取你余额越多，想得美");
        }

        if(money == 0){
            throw new Exception("你取空气呢？");
        }

        if(money > balance){
            throw new Exception("取款金额不足，不支持当前取款操作");
        }

        balance -= money;
    }

    public void save(double money) throws Exception {
        if(money < 0){
            throw new Exception("越存余额越少，你愿意吗？");
        }

        if(money == 0){
            throw new Exception("你存空气呢");
        }

        balance += money;
    }
}

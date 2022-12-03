package com.jc.exer2;

public class Tools {

    public boolean compare(CreditCard d1,CreditCard d2){
        if(d1.getAccount().equals(d2.getAccount())
        &&d1.getBalance()== d2.getBalance()
                &&d1.getMaxOverdraft()==d2.getMaxOverdraft()
                &&d1.getOverdraft() == d2.getOverdraft()
        ){
            System.out.println("这两个对象相同");
            return true;
        }else{
            System.out.println("这两个对象不同");
            if(d1.getAccount().equals(d2.getAccount())==false){
                System.out.println("account不同");
            }
            if(d1.getBalance()!= d2.getBalance()){
                System.out.println("balance不同");
            }

            if(d1.getMaxOverdraft()!=d2.getMaxOverdraft()){
                System.out.println("maxOverdraft不同");
            }

            if(d1.getOverdraft() != d2.getOverdraft()){
                System.out.println("overdraft不同");
            }
            return false;
        }
    }
}

package com.jc.SXT.Demo3.method;

/**
 * 阶乘
 */
public class RecursionMethod {
    public static void main(String[] args) {
        RecursionMethod re = new RecursionMethod();

        System.out.println(re.Jiecheng(5));
    }

    int Jiecheng(int n){
        if(n==1){
            return 1;
        }else{
            return n*Jiecheng(n-1);
        }
    }
}

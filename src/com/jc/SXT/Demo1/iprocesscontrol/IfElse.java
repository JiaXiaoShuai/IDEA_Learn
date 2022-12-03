package com.jc.SXT.Demo1.iprocesscontrol;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*给定一个数判断是奇数还是偶数*/
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 10;i++){
            int a  = scanner.nextInt();
            if(a%2==0&&a>0){
                System.out.println("这个数是偶数");
            }else if(a==0||a<0){
                System.out.println("这个数不是偶数也不是奇数");
            }else{
                System.out.println("这个数是奇数");
            }
        }
    }
}

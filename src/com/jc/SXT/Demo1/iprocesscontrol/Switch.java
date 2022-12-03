package com.jc.SXT.Demo1.iprocesscontrol;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String gread;
        switch(a/10){
            case 9:
            case 10:
                gread = "优";
                break;
            case 8:
                gread = "良";
                break;
            case 7:
                gread = "中";
                break;
            case 6:
                gread = "差";
                break;
            default:
                gread = "不及格";
                break;
        }
        System.out.println(gread);
    }
}

package com.jc.xiaobai.lotteryDemo1;

import java.util.Arrays;
public class LotteryUtil {
    public static int[] getLottery(){
        int[] lottery = new int[6];
        for (int i = 0; i < 6; i++) {
            int num = (int)(Math.random()*33+1);
            while(isContain(lottery,num)){
                num = (int)(Math.random()*33+1);
            }
            lottery[i] = num;
        }
        Arrays.sort(lottery);
        int[] lottery2 =new int[7];
        System.arraycopy(lottery,0,lottery2,0,6);
        lottery2[6] = (int)(Math.random()*16+1);
        return lottery2;
    }

    public static boolean isContain(int[] arr, int b){
        boolean flag = false;
        for(int x : arr){
            if(x == b){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static int isWin(int[] luckyNum,int[] lottery){
        //判断前六位有几位相同
        int red = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print(lottery[i]+"\t");
            if(luckyNum[i] == lottery[i]){
                red++;
            }
        }

        int blue = luckyNum[6]==lottery[6]?1:0;
        System.out.println("\t|\t"+lottery[6]+"\t");
        int money = 0;
        if(red == 6&&blue==1){
            money =5000000;
            System.out.println("一等奖5000000");
        }else if(red==6){
            money=1250000;
            System.out.println("二等奖1250000元");
        }else if(red==5&&blue==1){
            money=3000;
            System.out.println("三等奖3000元");
        }else if(red==5||red+blue==5){
            money=200;
            System.out.println("四等奖200元");
        }else if(red==4||red+blue==4){
            money=10;
            System.out.println("五等奖10元");
        } else if(red==0&&blue==1){
            money=5;
            System.out.println("六等奖5元");
        }else{
            System.out.println("未中奖0元");
        }
        return money;

    }
}

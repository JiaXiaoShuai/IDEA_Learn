package com.jc.xiaobai.lotteryDemo1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //声明一个二维数组 用于存储多个彩票
        int[][] lotteries = new int[0][];
        int[] luckyNum = new int[0];
        o:while(true){
            System.out.println("欢迎使用双色球系统，官方网站www.xxxx.com");
            System.out.println("*********请输入菜单选项********");
            System.out.println("*       1.购买双色球       *");
            System.out.println("*       2.查看开奖        *");
            System.out.println("*       3.查看中奖        *");
            System.out.println("*       4.看看中了多少钱   *");
            System.out.println("*       5.退出系统        *");
            System.out.println("**************************");
            System.out.println("请输入选项");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("运行购买双色球代码");
                    System.out.println("请输入购买注数");
                    //输入购买注数
                    int zs = sc.nextInt();
                    //创建一个二维数组 用于存储多个彩票
                    lotteries = new int[zs][];
                    //由程序循环生成彩票
                    for (int i = 0; i < zs; i++) {
                        lotteries[i] = LotteryUtil.getLottery();
                    }

                    //提示购买成功
                    System.out.println("购买成功");
                    break;
                case 2:
                    //购买双色球
                    if(lotteries.length!=0){
                        /*遍历双色球二维数组*/
                        for(int[] lottery: lotteries){
                            for(int x = 0;x < lottery.length;x++){
                                if(x == 5){
                                    System.out.print(lottery[x]+"\t|\t");
                                }else{
                                    System.out.print(lottery[x]+"\t");
                                }
                            }
                            System.out.println();
                        }
                    }else{
                        System.out.println("你没买双色球呢");
                    }
                    break;
                case 3:
                    //判断是否买了双色球
                    //再生成一注双色球，当成是中奖号码即可
                    if(lotteries.length!=0){
                        //生成中间号码
                        luckyNum = LotteryUtil.getLottery();
                        //输出中奖号码
                        for (int i = 0; i < luckyNum.length; i++) {
                            if(i == 5){
                                System.out.print(luckyNum[i]+"\t|\t");
                            }else{
                                System.out.print(luckyNum[i]+"\t");
                            }
                        }
                        System.out.println();
                    }else{
                        System.out.println("你没买双色球呢");
                    }
                    break;
                case 4:
                    if(lotteries.length==0||luckyNum.length==0){
                        System.out.println("请先购买并查看，再点这个功能nt");
                    }else{
                        int sum = 0;
                        for(int[] lottery : lotteries){
                            sum+=LotteryUtil.isWin(luckyNum,lottery);
                        }
                        System.out.println("共花"+lotteries.length*2+"费元，获奖"+sum+"元");
                    }
                    break;
                case 5:
                    System.out.println("常来送钱");
                    break o;
                default:
                    System.out.println("nt,弄错了");
            }
        }
    }
}

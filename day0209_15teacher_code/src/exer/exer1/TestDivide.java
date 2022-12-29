package exer.exer1;

import java.util.Scanner;

public class TestDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while(true){
            try{
                System.out.println("请输入被除数：");
                a = sc.nextInt();
                break;
            }catch (Exception e){
                sc.nextLine();
                System.out.println("输入错误，请重新输入");
            }
        }

        int b;
        while(true){
            try{
                System.out.println("请输入除数");
                b = sc.nextInt();
                if(b==0){
                    System.out.println("除数不能为0");
                }else {
                    break;
                }
            }catch (Exception e){
                sc.nextLine();
                System.out.println("输入错误请重新输入！");
            }
        }
        sc.close();
    }
}

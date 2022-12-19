package exception;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("请输入一个整数:");
                int num= sc.nextInt();
                System.out.println(num);
                break;
            }catch (Exception e){
                sc.nextLine();
                System.out.println("格式错误");
            }
        }
    }
}

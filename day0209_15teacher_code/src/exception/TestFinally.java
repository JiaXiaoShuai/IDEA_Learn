package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{

            while (true){
                try{
                    System.out.println("请输入第一个整数：");
                    int a = input.nextInt();
                    System.out.println("请输入第二个整数");
                    int b = input.nextInt();
                    double result = (double) a/b;
                    System.out.println(result);
                    //System.exit(1);
                    break;
                }catch (InputMismatchException e){
                    input.nextLine();
                    System.out.println("数字格式不正确，请输入两个整数");
                }catch (ArithmeticException e){
                    System.out.println("第二个整数不能为0");
                }
            }
        }finally {
            System.out.println("程序结束，释放资源");
            input.close();
        }
    }
}

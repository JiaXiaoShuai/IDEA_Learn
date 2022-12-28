package exception;

import java.util.Scanner;

public class TestThrows2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("请输入第一个整数：");
            int a = input.nextInt();
            System.out.print("请输入第二个整数：");
            int b = input.nextInt();
            int result = divide(a,b);
            System.out.println(a + "/" + b +"=" + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            input.close();
        }


    }

    public static int divide(int a, int b)throws ArithmeticException{
        return a/b; //运行时异常，编译器是检测不到的，所以不加try..catch，不加throws也没事
    }
}

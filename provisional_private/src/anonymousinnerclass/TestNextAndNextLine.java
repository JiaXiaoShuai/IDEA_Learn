package anonymousinnerclass;

import java.util.Scanner;

public class TestNextAndNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入年龄：");
        int age = input.nextInt();
        System.out.println("age = " + age);
        input.nextLine();//左边不用变量不用接收，目的只是把年龄后面的回车换行符读取掉
        //当下面name用的是nextLine()，就需要加这句代码，如果下面name用的是next()就不用加这句代码。

        System.out.print("请输入一个姓名：");
        String name = input.nextLine();
        /*
        next()方法：
        张三              name = "张三";
        张 三，认为张后面空格，就是结束了，而不是回车换行结束  name = "张";

        nextLine()方法：
        张三
        张  三
        都可以接收
         */

        System.out.println("name = " + name);

        input.close();
    }
}

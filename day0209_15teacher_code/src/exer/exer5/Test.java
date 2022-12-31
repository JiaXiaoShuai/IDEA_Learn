package exer.exer5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while(true) {
            int index = 0;
            System.out.println("-----------尚硅谷----------");
            System.out.println("1、注册");
            System.out.println("2、登录");
            System.out.println("3、查询");
            System.out.println("4、退出");
            System.out.print("请选择：");
            Scanner sc = new Scanner(System.in);

            /*sc.nextLine();*/
            try {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.print("用户名：");
                        String username = sc.next();
                        /*System.out.println();*/
                        System.out.print("密码：");
                        String password = sc.next();
                        try {
                            new UserManager().checkUsernameExits(username);
                            Tools.register(username, password);
                        }catch (UsernameAlreadyExistsException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("用户名：");
                        String username1 = sc.next();
                        /*System.out.println();*/
                        System.out.print("密码：");
                        String password1 = sc.next();
                        Tools.logIn(username1, password1);
                        break;
                    case 3:
                        UserManager.arrLook();
                        break;
                    case 4:
                        index++;
                        System.out.println("退出功能");
                        break;
                    default:
                        System.out.println("选择错误，请重新选择");
                        break;
                }

                if (index == 1) {
                    break;
                }

            }catch (InputMismatchException e){
                System.out.println("输入不匹配，请重新输入");
            }

        }
    }
}

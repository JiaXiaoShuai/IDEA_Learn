package com.jc.string;

import org.junit.Test;

import java.util.Scanner;

/**
 * 7.和正则有关的
 * （28）boolean matchs（正则表达式）：判断当前字符串是否匹配某个正则表达式
 */
public class StringMethod7 {
    @Test
    public void Test01() {
        //判断用户输入的字符串是否是纯数字
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        while (true) {
            String str = input.nextLine();
            if (str.matches("\\d+")) {
                System.out.println("1位或多位数字");
                break;
            } else {
                System.out.println("包含非数字,请重新输入");
            }
        }
    }

    @Test
    public void test02() {
        //密码要求：必须有大写字母，小写字母，数字组成，6位
        String password = "Jia123";
        System.out.println(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{6}$"));
    }

    @Test
    public void test03() {
        //密码要求：必须有大写小写字母，数字组成，6位
        String password = "cly892";
        System.out.println(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{6}$"));
    }

    @Test
    public void test04() {
        //密码要求：必须有大写字母，小写字母，数字组成，6位
        String password = "Clyyan";
        System.out.println(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{6}$"));
    }

}

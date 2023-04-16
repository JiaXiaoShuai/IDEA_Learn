package com.jc.string;

import org.junit.Test;

import java.util.Scanner;

/**
 * 7.和正则有关的
 * （28）boolean matchs（正则表达式）：判断当前字符串是否匹配某个正则表达式
 */
public class StringMethod7 {
    @Test
    public void Test01(){
        //判断用户输入的字符串是否是纯数字
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        while(true){
            String str = input.nextLine();
            if(str.matches("\\d+")){
                System.out.println("1位或多位数字");
                break;
            }else{
                System.out.println("包含非数字,请重新输入");
            }
        }
    }
}

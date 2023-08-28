package com.jc.scanner;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.Scanner;

/*
java.util.Scanner类，不是只能用来从键盘输入数据，它可以从任意流中扫描数据。

如果没有修改过System.in，那么Scanner input = new Scanner(System.in);，默认是从键盘输入
在创建Scanner对象时，指定了其他的IO流，会从其他IO流中读取文本数据。

 */
public class TestScanner {
    @Test
    public void test01()throws Exception{
        Scanner input = new Scanner(new FileInputStream("22.txt"));
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
}

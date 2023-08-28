package com.jc.print;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

/*
PrintStream打印流：
（1）可以支持各种数据类型的打印
（2）可以支持输出换行，输出不换行，还支持格式化输出

print(xxx)：输出不换行，
println(xxx)：输出换行
printf(xx)：格式化输出

（3）输出可以输出到各种其他IO流中，也可以直接输出到文件，也可以输出到控制台。

 */
public class TestPrintStream {
    @Test
    public void test01()throws IOException {
        PrintStream ps = new PrintStream("3.txt");
        ps.print("我是你爹");
        ps.print("world");
        ps.close();

        FileReader fr = new FileReader("3.txt");
        char[] arr = new char[3];
        int len ;
        while((len = fr.read(arr)) != -1){
            System.out.println(new String(arr,0,len));
        }
        fr.close();
    }
}

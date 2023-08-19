package com.jc.io;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * FileInputStream类
 * 如果文件不存在，会报错java.io.FileNotFoundException: 1.txt (系统找不到指定的文件。)
 * <p>
 * FileOutputStream类
 * 如果文件不存在，就会自动创建
 * 如果文件已存在，会覆盖原来的内容
 * 如果要追加，在创建FileOutputStream类对象时，加一个参数true
 * <p>
 * <p>
 * 它的父类是OutputStream类，字节输出流
 * <p>
 * -public void write(int b):将指定的字节输出流，虽然参数为int类型四个字节，但是只会保留一个字节的信息写出。
 * -public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流，
 * -public void write(byte[] b,int off,int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
 * public void close()：关闭输出流并释放与此流想关联的任何系统资源
 */
public class TestOutputStream {
    @Test
    public void test04(){
        byte[] bytes = "jia".getBytes();
        System.out.println(Arrays.toString(bytes));
    }
    @Test
    public void test03() throws IOException{
        FileOutputStream fos = new FileOutputStream("1.txt",true);
        fos.write("cong".getBytes());
        fos.close();
    }
    @Test
    public void test02() throws IOException{
        FileOutputStream fos = new FileOutputStream("1.txt");
        fos.write("jia".getBytes());
        fos.write("123".getBytes());
        fos.close();
    }

    @Test
    public void test01() throws IOException {
        //输出chai到1.txt
        FileOutputStream fos = new FileOutputStream("1.txt");
        byte[] arr = {'c','d','e','f','g'};
        //把字符串转换为字节数组
        fos.write(106);
        fos.write("chai".getBytes());
        fos.write("ai".getBytes());
        fos.write('a');


        fos.write(10);

        fos.write(arr,2,3);
        fos.close();


    }
}

package com.jc.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *3.文件IO流
 * （1）FileInputStream
 *      如果文件不存在，会报错java.io.FileNotFoundException
 *
 *  父类：InputStream类（字节输入流）
 *  -public int read(): 从输入流读取一个字节。返回读取的字节值，虽然读取了一个字节，但是会自动提升为int类型
 *          如果已经到达流末尾，没有数据可读，则返回-1
 *  -public int read(byte[] b): 从输入流中读取一些字节数，，并将他们存储到字节数组b中。每次最多读取b.length个字节
 *          返回实际读取的字节个数。如果已经到达流末尾，没有数据可读，则返回-1.
 *  -public int read(byte[] b,int off,int len):从输入流中读取一些字节数，并将它们存储到字节数组b中，从b[off]开始存储，每次最多取len个字节。
 *          返回实际读取的字节个数，如果已经到达流末尾，没有数据可读，则返回-1.
 * -public void close():关闭次输入流并释放与此流相关联的任何系统资源
 *
 *
 * 4.IO流操作的步骤：
 * A：先选择合适的IO流类，创建它的对象
 * B：读或写操作
 * C：关闭IO流
 *      因为IO流类的对象会在JVM内存中开辟空间。这个部分的内存，可以由JVM的GC自动回收
 *      但是IO流的操作还会在JVM内存的外部开辟空间，因为IO操作需要用到操作系统的一些函数，这些内存GC是无法回收的
 *      那么要通过调用close方法，通知操作系统释放对应的内存。
 */
public class TestFileInputStream {
    @Test
    public void test04() throws IOException{
        FileInputStream fis = new FileInputStream("../download2/1.txt");

        byte[] data = new byte[2];
        while(true){
            int len = fis.read(data);
            if(len == -1) {
                break;
            }
            System.out.println("len ="+len);
            System.out.println(new String(data,0,len));
        }
    }

     @Test
     public void test03() throws IOException {
         /*
         要以字节的方式读取一个文件：当前模块下的文件1.txt
          */

         FileInputStream fis = new FileInputStream("../download2/1.txt");

         while(true){
             int read = fis.read();
             if(read == -1){
                 break;
             }
             System.out.println(read);
         }
         fis.close();
     }
    @Test
    public void test02() throws IOException{
        FileInputStream fils = new FileInputStream("../download2/1.txt");
        byte[] data = new byte[2];
        int len = fils.read(data);//数据读取到字节数组中
        System.out.println("len = "+len);
        System.out.println(Arrays.toString(data));

        len = fils.read(data);
        System.out.println("len = " + len);//1
        System.out.println(Arrays.toString(data));//[99, 98]   这个98是上次读取的，本次只读取了一个字节

        len = fils.read(data);
        System.out.println("len = " + len);//-1
        System.out.println(Arrays.toString(data));//[99, 98]   这个99,98是上次读取的，本次只读取了一个字节

        fils.close();

    }
    @Test
    public void test01() throws IOException {
        /*
        要以字节的方式读取一个文件：当前模块下的文件1.txt
         */
        FileInputStream fils =new FileInputStream("../download2/1.txt");//相对路径
        for (int i = 0; i < 20; i++) {
            System.out.println(fils.read());//一个汉字两个字节，英文字母一个字节
        }

        fils.close();
    }
}

package com.jc.string;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 4.和字节数组有关：
 * （1）编码：把字符串转为字节数组
 * （2）解码：把字节数组翻译为字符串
 *
 * 当字符串不仅仅是在内存中使用时，需要把它写到文件，或者发送到网络中，这个时候就要把字符串
 * 转为字节数组处理
 *
 * JVM内存中：每一个字符串都是用Unicode编码表示的，一个char占2个字节
 * 环境中：每一个字符占几个字节，要看具体的环境编码
 * UTF-8：大多数汉字都是三个字节，ASCII表范围的字符是一个字节
 *
 * （24）byte[] getBytes():编码，把字符串变为字节数组，按照平台默认的字符编码方式进行编码
 *      byte[] getBytes(字符编码方式)：按照制指定的编码方式进行编码
 *
 * （25）new String(byte[] )或new String(byte[] ,int ,int):解码，按照平台默认的字符编码进行解码
 *      new String(byte[],字符编码方式 )或new String(byte[] ,int ,int,字符编码方式)：解码，按照指定的编码方式进行解码
 */
public class StringMethod4 {

    @Test
    public void Test01(){
        String str = "hello";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));//[104, 101, 108, 108, 111]
    }

    @Test
    public void Test02() throws IOException {
        String str = "贾聪帅";
        byte[] bytes = str.getBytes();//按照平台默认的字符编码方式进行编码，当前项目的编码，UTF-8
        //对于中文来说，一般是一个汉字对应三个字节
        System.out.println(Arrays.toString(bytes));//[-24, -76, -66, -24, -127, -86]

        FileOutputStream fos = new FileOutputStream("d:\\1.txt");
        fos.write(bytes);
        fos.close();
    }

    @Test
    public void Test03() throws IOException{
        String str = "贾小帅";
        byte[] bytes = str.getBytes("GBK");//按照指定字符编码方式进行编码，当前指定为GBK

        //对于GBK来说，每一个汉字都是2个字节
        System.out.println(Arrays.toString(bytes));//[-68, -42, -48, -95, -53, -89]
    }

    @Test
    public void Test04() throws IOException{
        String str = "贾小帅";
        byte[] bytes = str.getBytes("ISO8859-1");//按照指定字符编码方式进行编码，当前指定为ISO8859-1
        //对于ISO8859-1来说，每一个字符都是1个字节
        System.out.println(Arrays.toString(bytes));//[63, 63, 63]  无法正确表示中文
    }

    @Test
    public void Test05() throws UnsupportedEncodingException {
        byte[] data = {-55, -48, -71, -24, -71, -56};
        String s1 = new String(data);//按照平台默认的字符编码进行解码，当前项目的编码，UTF-8
        System.out.println("s1 =" + s1);

        String s2 = new String(data,"GBK");
        System.out.println("s2 =" + s2);
    }

}

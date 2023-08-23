package com.jc.transfer;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/**
 * 7、编码与解码问题
 * 使用FileReader和FileWriter去操作和当前程序编码不一致的文件时，就会出现乱码的问题，怎么解决？
 * <p>
 * InputStreamReader：输入流
 * OutputStreamWriter：输出流
 * <p>
 * 构造方法摘要
 * InputStreamReader(InputStream in)
 * 创建一个使用默认字符集的 InputStreamReader。
 * InputStreamReader(InputStream in, Charset cs)
 * 创建使用给定字符集的 InputStreamReader。
 * InputStreamReader(InputStream in, CharsetDecoder dec)
 * 创建使用给定字符集解码器的 InputStreamReader。
 * InputStreamReader(InputStream in, String charsetName)
 * 创建使用指定字符集的 InputStreamReader。
 */
public class TestInputStreamReader {
    @Test
    public void test04() throws IOException{
        FileOutputStream fos = new FileOutputStream("1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("这是什么");
    }
    @Test
    public void test03() throws IOException{
        FileOutputStream fos = new FileOutputStream("521.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");

        osw.write("woe");
        osw.close();
        fos.close();
    }
    @Test
    public void test() throws IOException{
        FileInputStream fis = new FileInputStream("1.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");//文件的编码是GBK，用GBK解从文件读取的数据

        byte[] data = new byte[10];
        int len;
        while((len = isr.read()) != -1){
            System.out.println(Arrays.toString(data));
        }

        isr.close();
        fis.close();
    }
    @Test
    public void test02() throws IOException{
        FileInputStream fis = new FileInputStream("521.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");

        char[] data = new char[10];
        int len;
        while ((len = isr.read(data)) != -1) {
            System.out.println(new String(data,0,len));
        }

        isr.close();
        fis.close();
    }

    @Test
    public void test01() throws IOException {
        FileReader fr = new FileReader("521.txt");
        char[] data = new char[10];
        int len;
        while ((len = fr.read(data)) != -1) {
            System.out.println(new String(data,0,len));
        }

        fr.close();
    }
}

package com.jc.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * 父类 Reader类：
 * - `public int read()`： 从输入流读取一个字符。 虽然读取了一个字符，但是会自动提升为int类型。返回该字符的Unicode编码值。如果已经到达流末尾了，则返回-1。
 * - `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。每次最多读取cbuf.length个字符。返回实际读取的字符个数。如果已经到达流末尾，没有数据可读，则返回-1。
 * - `public int read(char[] cbuf,int off,int len)`：从输入流中读取一些字符，并将它们存储到字符数组 cbuf中，从cbuf[off]开始的位置存储。每次最多读取len个字符。返回实际读取的字符个数。如果已经到达流末尾，没有数据可读，则返回-1。
 * - `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。
 */
public class TestFileReader {
    @Test
    public void test02() throws IOException{
        FileReader fr = new FileReader("1.txt");
        char[] data = new char[2];
        int len;
        while ((len = fr.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }
        fr.close();
    }
    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        byte[] data = new byte[3];
        while(true){
            int len = fis.read(data);
            if(len == -1){
                break;
            }

            System.out.println(new String(data,0,len));
        }

        fis.close();
    }
}

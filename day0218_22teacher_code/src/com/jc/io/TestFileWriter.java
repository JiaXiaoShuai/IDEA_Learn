package com.jc.io;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 父类Writer类
 * - `public void write(int c)` 写入单个字符。
 * - `public void write(char[] cbuf) `写入字符数组。
 * - `public void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 * - `public void write(String str) `写入字符串。
 * - `public void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 * - `public void flush() `刷新该流的缓冲。
 * - `public void close()` 关闭此流，但要先刷新它。
 */
public class TestFileWriter {
    @Test
    public void test01() throws IOException {
        FileWriter fw = new FileWriter("1.txt",true);
        fw.write("我爱你");
        fw.flush();
        fw.close();
    }
}

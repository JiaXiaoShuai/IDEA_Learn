package com.jc.buffer;

import org.junit.Test;

import java.io.*;

/**
 * 缓冲流：
 * 作用是给其他IO流增加缓冲区，提高效率
 *
 * 缓冲流的使用必须基于其他的IO流，也就是说，缓冲流它只能装饰（包装）别的流
 * BufferedInputStream：只能包装InputStream系列的IO流
 * BufferedOutputStream：只能包装OutputStream系列的IO流
 * BufferedReader:只能包装Reader系列的IO流
 * BufferedWriter：只能包装Writer系列的IO流
 *
 * 原理：所有的缓冲流在内部会开辟一块更大的缓冲区，默认大小是8192字节/字符（本质就是一个8192唱的的byte/char数组）
 *
 *      另外，对于BufferedReader和BufferedWriter来说，它除了提高效率之外，
 *      还可以使用下面两个方法，使得读写更方便
 *      BufferedReader类String readLine()
 *      BufferedWriter类void newLine()
 */
public class TestBuffered {
    public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Progress: " + i + "%\r");
                try {
                    Thread.sleep(500); // 休眠 0.5 秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Progress: 100%");
    }
    @Test
    public void test05() throws IOException{
        FileWriter fw = new FileWriter("1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.write("world");
        bw.newLine();
        bw.write("aa");

        bw.close();
        fw.close();
    }
    @Test
    public void test04() throws IOException{
        FileWriter fw = new FileWriter("1.txt");
        fw.write("hello");
        fw.write("\n");
        fw.write("java");
        fw.write("\n");
        fw.write("world");
        fw.write("\r\n");
        fw.write("aa");
        fw.close();

    }
    @Test
    public void test03() throws IOException{
        FileReader fr = new FileReader("1.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        fr.close();
    }

    @Test
    public void test02() throws IOException {
        /*File file = new File("E:\\learn\\测试\\day0115_JavaSE_第7天资料\\day0115_07video\\day0115_05实例变量.avi");
        System.out.println(file.exists());
        file.delete();
        System.out.println(file.exists());*/
        long start = System.currentTimeMillis();
        /*
        演示 BufferedInputStream包装FileInputStream
             BufferedOutputStream包装FileOutputStream
         来完成复制文件。
         E:\learn\测试\day0115_JavaSE_第7天资料\day0115_07video\day0115_05实例变量扩展练习：圆类.avi
         */

        FileInputStream fis = new FileInputStream("E:\\learn\\测试\\day0115_JavaSE_第7天资料\\day0115_07video\\day0115_05实例变量扩展练习：圆类.avi");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("111实例变量.avi");
        BufferedOutputStream bos = new BufferedOutputStream(fos);


        byte[] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bis.close();
        fis.close();
        bos.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
    @Test
    public void test01() throws IOException {
        long start = System.currentTimeMillis();
        /*
        演示 BufferedInputStream包装FileInputStream
             BufferedOutputStream包装FileOutputStream
         来完成复制文件。
         E:\learn\测试\day0115_JavaSE_第7天资料\day0115_07video\day0115_05实例变量扩展练习：圆类.avi
         */

        FileInputStream fis = new FileInputStream("E:\\learn\\测试\\day0115_JavaSE_第7天资料\\day0115_07video\\day0115_05实例变量扩展练习：圆类.avi");
        FileOutputStream fos = new FileOutputStream("实例变量.avi");

        byte[] bytes = new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

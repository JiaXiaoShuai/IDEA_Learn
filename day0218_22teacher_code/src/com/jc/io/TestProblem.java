package com.jc.io;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/*
5、IO流的问题
（1）关于直接基于“文件夹/目录”创建IO流对象是错误
会报java.io.FileNotFoundException: d:\download (拒绝访问。)

（2）输出流如果不能及时关闭（因为可能后面还要用），但是又想要数据及时输出，可以调用flush方法，
但是如果后面不用了，一定要close。因为close不仅仅是刷数据的问题，还涉及的内存回收问题。
 */
public class TestProblem {
    @Test
    public void test02()throws IOException{
        FileWriter fw = new FileWriter("1.txt");
        fw.write("柴林燕");
        /*
        像FileWriter等很多的输出流的内部有自己的一个小小缓冲区，
        它在调用write方法时，会先将数据写到缓冲区。
        当缓冲区满的时候，会自动“溢出”到文件。
        当缓冲区没满的时候，会close方法执行时，把缓冲区的数据“清空”输出。
         */
        //如果希望数据及时写出，但是暂时还不close
        fw.flush();//刷新

        fw.write("是Java讲师");
        fw.flush();

        fw.close();
        fw.write("很棒");//java.io.IOException: Stream closed
        fw.close();
    }

    @Test
    public void test01()throws IOException {
//        FileInputStream fis = new FileInputStream("d:\\download");
        //java.io.FileNotFoundException: d:\download (拒绝访问。)
//        文件IO必须基于文件路径创建对象
        //"d:\\download"这个是一个文件夹的路径，不是一个文件的路径

//        FileOutputStream fos = new FileOutputStream("d:\\download");
        //java.io.FileNotFoundException: d:\download (拒绝访问。)

        //就算是让 FileOutputStream帮你自动创建文件，也必须在IO流的构造器中，指明文件的名称。
    }
}

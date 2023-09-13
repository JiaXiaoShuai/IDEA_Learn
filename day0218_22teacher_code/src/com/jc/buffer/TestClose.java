package com.jc.buffer;

import org.junit.Test;

import java.io.*;

/**
 *IO流有依赖关系。外层的包装流依赖于内存的被包装流。
 *         比如：BufferedInputStream 依赖于 FileInputStream
 *              BufferedOutputStream 依赖于 FileOutputStream
 *
 *              如果把内层的IO先关闭了，外层IO流就失去了依赖，就会报错。
 *          比喻：我坐在凳子上，我依赖于凳子，如果把凳子先撤了，我就会摔倒。
 *          先让我站起来，然后撤凳子。
 *
 *          关闭的顺序是：先关闭外层的包装流，再关闭内层的被包装流。
 *
 *          本质：
 *             这段代码数据的流向： 源文件 -> fis -> bis -> data数组  -> bos -> fos ->目标文件.
 *             BufferedOutputStream和FileOutputStream，如果把fos先关了，
 *             bos中的缓冲的数据没有办法完全写出。因为close时，会清空缓冲区。
 *
 *         好记：
 *             fis被包装在里面的，比喻成内衣，先穿内衣，再穿外衣。
 *             bis相当于外套。
 *
 *             fos是内衣，bos是外套。
 *
 *             关闭好比是脱衣服。
 *             先脱外套，再脱内衣。
 *
 *            或者，先new的后关。
 *
 *            fis和bis有顺序关系
 *            fos和bos有顺序关系
 *
 *             fis和bis 、 fos和bos是没有顺序关系。
 */
public class TestClose {
    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);//BufferedInputStream包装FileInputStream的对象

        FileOutputStream fos = new FileOutputStream("23.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        /*
        这段代码数据的流向： 源文件 -> fis -> bis -> data数组  -> bos -> fos ->目标文件
         */
        byte[] data = new byte[1024];
        int len;
        while((len = bis.read(data)) != -1){
            bos.write(data,0,len);
        }

        fis.close();
        fos.close();
        bis.close();
        bos.close();//java.io.IOException: Stream Closed

    }
}

package com.jc.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * E:\learn\测试\day0115_JavaSE_第7天资料\day0115_07video\day0115_05实例变量扩展练习：圆类.avi
 *
 */
public class Exercise3 {
    @Test
    public void test02() throws IOException{
        FileInputStream fis = new FileInputStream("E:\\learn\\测试\\day0115_JavaSE_第7天资料\\day0115_07video\\day0115_05实例变量扩展练习：圆类.avi");
        FileOutputStream fos = new FileOutputStream("day0115_05实例变量扩展练习：圆类.avi");
        byte[] bytes = new byte[128];
        int len;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
        System.out.println("已成功复制");
    }

    @Test
    public void test01() throws IOException{
        FileInputStream fis = new FileInputStream("E:\\learn\\测试\\day0115_JavaSE_第7天资料\\day0115_07video\\day0115_05实例变量扩展练习：圆类.avi");
        FileOutputStream fos = new FileOutputStream("day0115_05实例变量扩展练习：圆类.avi");
        byte[] bytes = new byte[12629142];
        int len = fis.read(bytes);
        fos.write(bytes,0,len);
        fis.close();
        fos.close();
        System.out.println("已成功复制");
    }

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\learn\\测试\\day0115_JavaSE_第7天资料\\day0115_07video\\day0115_05实例变量扩展练习：圆类.avi");
        FileOutputStream fos = new FileOutputStream("day0115_05实例变量扩展练习：圆类.avi");

        byte[] bytes = new byte[128];
        while(true){
            int len = fis.read(bytes);
            if(len == -1){
                break;
            }
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
        System.out.println("已成功复制");
    }
}

package com.jc.exception;

import org.junit.Test;

import java.io.*;

/*
JDK1.7版本引入了新的try..catch的语法.

try( 需要自动关闭的资源对象的声明和创建){
    需要异常检查的业务逻辑代码
}catch(异常类型 e){
    异常处理代码
}finally{
    这里写的时其他的必须执行的代码，但是不是资源关闭的代码。
}

try()中不是所有类型的对象声明和创建都可以放进去的，只能放实现了AutoClose接口的类型
只有在try()中声明的才会自动关闭。不在这里声明的不会自动关闭。
在try（）中声明的变量，会自动加final
 */

public class TestTryCatch {

    @Test
    public void test02(){
        //GBK编码的1.txt，复制UTF-8的2.txt文件
        try(
            FileInputStream fis = new FileInputStream("1.txt");
            InputStreamReader isr = new InputStreamReader(fis,"GBK");
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
        ) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        //自动关闭，不需要写了
       /* bw.close();
        osw.close();
        fos.close();
        br.close();
        isr.close();
        fis.close();*/
    }
    @Test
    public void test01(){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            //GBK编码的1.txt，复制UTF-8的2.txt文件
            fis = new FileInputStream("1.txt");
            isr = new InputStreamReader(fis,"GBK");
            br = new BufferedReader(isr);

            fos = new FileOutputStream("2.txt");
            osw = new OutputStreamWriter(fos, "UTF-8");
            bw = new BufferedWriter(osw);

            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
 /*           try {
                bw.close();
                osw.close();
                fos.close();
                br.close();
                isr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            try {
                if(bw!=null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(osw != null) {
                    osw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

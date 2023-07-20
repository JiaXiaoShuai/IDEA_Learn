package com.jc.file;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

/**
 * 1.java.io.File类
 * 它的作用是用来表示某个文件或文件夹（文件夹又称为目录）
 * <p>
 * 如何使用File类的对象表示一个文件或目录的呢？
 * API文档中描述：文件和目录路径名的抽象表示形式。
 * 解释：如果要表示一个文件或目录，需要指定它的“路径名”，
 * 例如：要表示Windows操作系统下的D盘Download文件夹下的北华大学实训归档材料-王海龙.zip，
 * 那么可以这样表示 File file = new File("d:\\Download\\北华大学实训归档材料-王海龙.zip");
 * <p>
 * 要表示Windows操作系统下的D盘Download文件夹
 * 那么可以这样表示 File file = new File("d:\\Download");
 * <p>
 * 路径分隔符：
 * 早期Windows只支持 \
 * 现在所有平台都支持 /
 * <p>
 * 2.File类的常用方法系列：
 * public String getName() ：返回由此File表示的文件或目录名称
 * public long length()：返回由此File表示的文件的长度
 * 返回由此抽象路径名表示的文件的长度。如果此路径表示的是一个文件夹（目录），则返回的结果不确定
 * public String getPath() ：将次File转为路径名字符串
 * public long lastModified():返回File对象对应的文件或目录的最后修改时间（毫秒值）
 * <p>
 * 3.各种路径问题
 * 路径名词
 * （1）绝对路径和相对路径
 * 绝对路径：在描述文件或文件夹时，从根目录开始导航的路径
 * 对于windows操作系统来说，盘符就是根
 * d:/Download
 * d:/Download/北华大学实训归档材料-王海龙.zip
 * 对于Linux操作系统来说，/就是根
 * /Download
 * 相对路径：在描述文件或文件夹时，不是从根目录开始导航的路径
 * 例如：
 * 例如：
 * download/1.txt
 * 相对于谁呢？
 * <p>
 * 对于IDEA中，JUnit的test方法，相对路径是相当于当前的模块
 * 对于IDEA中，main方法，相对路径是相当于当前的project
 * <p>
 * （2）构造路径
 * 在new File对象时，在()中填写的路径。
 * 构造路径可以是相对路径，也可以绝对路径。
 * （3）规范路径
 * 如果路径名中出现了“.."等情况，会进行解析。
 * String getPath()：获取的是构造路径的值
 * String getAbsolutePath()：获取绝对路径的值
 * String getCanonicalPath()：获取规范路径的值
 * <p>
 * 4、  File类的常用方法系列3
 * 创建文件和文件夹的方法
 * public boolean createNewFile()throws IOException  ：创建一个新文件
 * public public boolean mkdir()：创建文件夹
 * public public boolean mkdirs()：创建文件夹
 * public boolean delete()：删除文件或文件夹
 * 如果文件夹是非空目录，那么是无法删除的。即只能删除空文件夹。
 *
 * 5、判断某个File对象代表的文件或文件夹的情况：
 * - public boolean exists() ：此File表示的文件或目录是否实际存在。
 * - public boolean isDirectory() ：此File表示的是否为目录。
 * - public boolean isFile()：此File表示的是否为文件。
 *
 * 如果指定的某个文件或文件夹的路径名后，这个文件或文件夹在实际的路径下不存在，不影响创建File类的对象。
 * 如果File类对象的代表的文件或文件夹不存在，那么它既不是文件夹也不是文件。
 *
 * 6、对于文件夹的File对象来说，可以进行如下操作：
 * * public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录。
 * * public File[] listFiles(FileFilter filter)：返回所有满足指定过滤器的文件和目录。如果给定 filter 为 null，则接受所有路径名。否则，当且仅当在路径名上调用过滤器的 FileFilter.accept(File pathname)方法返回 true 时，该路径名才满足过滤器。如果当前File对象不表示一个目录，或者发生 I/O 错误，则返回 null。
 * * public String[] list(FilenameFilter filter)：返回返回所有满足指定过滤器的文件和目录。如果给定 filter 为 null，则接受所有路径名。否则，当且仅当在路径名上调用过滤器的 FilenameFilter .accept(File dir, String name)方法返回 true 时，该路径名才满足过滤器。如果当前File对象不表示一个目录，或者发生 I/O 错误，则返回 null。
 * * public File[] listFiles(FilenameFilter filter)：返回返回所有满足指定过滤器的文件和目录。如果给定 filter 为 null，则接受所有路径名。否则，当且仅当在路径名上调用过滤器的 FilenameFilter .accept(File dir, String name)方法返回 true 时，该路径名才满足过滤器。如果当前File对象不表示一个目录，或者发生 I/O 错误，则返回 null。
 *
 *  java.io.FileFilter：文件过滤接口
 *     抽象方法：boolean accept(File pathname)
 *     pathname是某个文件夹在列出下一级时的每一个下一级
 *     如果pathname根据某个条件返回true,就表示要留下这个文件或文件夹
 */
public class TestFile {
    @Test
    public void test18(){
        File file = new File("e:\\learn\\测试\\新建文件夹");

        listAllJpgImageSub(file);
    }
    public void listAllJpgImageSub(File dir){
        if(dir.isDirectory()){
            File[] files = dir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.contains("8");
                }
            });

            for (File file : files) {
                if(file.isDirectory()){
                    listAllJpgImageSubs(file);
                }else{
                    System.out.println(file);
                }
            }
        }
    }
    @Test
    public void test17(){
        File file = new File("e:\\learn\\测试\\新建文件夹");

        listAllJpgImageSubs(file);
    }


    public void listAllJpgImageSubs(File dir){
        if(dir.isDirectory()){
            File[] files = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().endsWith(".pdf");
                }
            });

            for (File file : files) {
                if(file.isDirectory()){
                    listAllJpgImageSubs(file);
                }else{
                    System.out.println(file);
                }
            }
        }
    }
    @Test
    public void test16(){
        File file = new File("e:\\learn\\测试\\新建文件夹");
        listAllSubs(file);

    }

    public void listAllSubs(File dir){
        if(dir.isDirectory()){
            System.out.println(dir);
            File[] files = dir.listFiles();
            for (File file : files) {
                if(file.isDirectory()){
                    listAllSubs(file);
                }else{
                    System.out.println(file);
                }
            }
        }
    }



    /*public void listAllSubs(File dir){
        System.out.println(dir);
        if(dir.isDirectory()){//条件成立的话，说明是一个存在的文件夹
            File[] files = dir.listFiles();
            for (File sub : files) {
                listAllSubs(sub);
            }
        }
    }*/

    /*@Test
    public void test16(){
        File dir = new File("e:/learn");
        File[] files = dir.listFiles();
        for (File file : files) {
            String[] str = file.list();
            for (String s : str) {
                System.out.println(s);
            }
        }
    }*/

    @Test
    public void test15(){
        File dir = new File("e:/learn/07.Git");
        String[] allSubs = dir.list();
        if(null != allSubs){
            for (String sub : allSubs) {
                System.out.println(sub);

            }
        }




    }
    @Test
    public void test14() throws IOException {
        File file = new File("d:\\1.txt");
        //new File对象只是在JVM的堆内存中创建一个对象，不会真的在硬盘中创建一个文件或文件夹。
        //只有调用createNewFile或mkdir/mkdirs才会创建文件或文件夹

        System.out.println(file.exists());//false
        System.out.println(file.isDirectory());//false
        System.out.println(file.isFile());//false

        System.out.println(file.length());//0
        System.out.println(file.lastModified());//0
    }

    @Test
    public void test13(){
        File file = new File("download1\\1.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(file.length());//0
        System.out.println(file.lastModified());//0
        System.out.println(new Date(file.lastModified()));
    }
    @Test
    public void test12() {
        File file = new File("download1\\1.txt");
        System.out.println(file.delete());

        File dir = new File("download1");
        System.out.println(dir.delete());
    }

    @Test
    public void test11() throws IOException {
        File dir = new File("e:\\io\\java\\test\\aa");//dir是代表aa文件夹
        //dir.mkdir();//如果e:\io\java\test文件夹不存在，aa文件夹创建失败，但是不会报异常
        System.out.println(dir.mkdirs());//如果e:\io\java\test文件夹不存在，连同它们和aa一起创建
    }

    @Test
    public void test10() throws IOException {
        File file = new File("d:/Download/北华大学实训归档材料-王海龙.zip");
        System.out.println(file.getPath());//d:\Download\北华大学实训归档材料-王海龙.zip
        System.out.println(file.getAbsolutePath());
        //d:\Download\北华大学实训归档材料-王海龙.zip
        System.out.println(file.getCanonicalPath());
        //D:\Download\北华大学实训归档材料-王海龙.zip
    }

    @Test
    public void test09() throws IOException {
        File file = new File("../../download1/1.txt");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }

    @Test
    public void test08() {
        File file = new File("d:/Download/北华大学实训归档材料-王海龙.zip");
        System.out.println(file.getPath());//d:\Download\北华大学实训归档材料-王海龙.zip
        System.out.println(file.getAbsolutePath());
        //d:\Download\北华大学实训归档材料-王海龙.zip
    }

    @Test
    public void test07() {
        File file = new File("1.txt");

        File dir = new File("download1");
        File file1 = new File(dir, "1.txt");
        System.out.println(file.getPath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
    }

    public static void main(String[] args) throws IOException {
        File dir = new File("download2\\dow\\nlo\\ad");

        dir.mkdirs();
        File file1 = new File(dir, "1.txt");
        file1.createNewFile();

        File file = new File("download2\\dow\\nlo\\ad\\1.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(file.length());//0
        System.out.println(file.lastModified());//0
    }

    @Test
    public void test06() throws IOException {
        File dir = new File("download1");
        dir.mkdir();// make directory
        File file = new File("download1\\1.txt");
        file.createNewFile();
    }

    @Test
    public void test05() {
        File file = new File("d:/Download");
        System.out.println(file);
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.length());
        System.out.println(file.lastModified());
    }

    @Test
    public void test04() {
        File file = new File("d:/Download/北华大学实训归档材料-王海龙.zip/sadhf");
        System.out.println(file);
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.length());
        System.out.printf("最后修改时间：", file.lastModified());
    }

    @Test
    public void test03() {
        File file = new File("d:/Download/北华大学实训归档材料-王海龙.zip");
        System.out.println(file);
        File dir = new File("E:\\sdf");
        System.out.println(dir);
    }

    @Test
    public void test02() {
        File file = new File("d:/Download/北华大学实训归档材料-王海龙.zip");
        System.out.println(file);
    }

    @Test
    public void test01() {
        File dir = new File("E:\\sdf");
        File file = new File("E:\\asdfas\\agfa.jpg");
        System.out.println(dir);
        System.out.println(file);
    }
}

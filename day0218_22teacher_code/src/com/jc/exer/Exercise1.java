package com.jc.exer;

import java.io.File;
import java.io.FileFilter;

public class Exercise1 {
    static long length;

    /**
     * 计算文件夹的大小，但是有一个缺点，length的累计用的是静态成员变量，导致使用该方法时，切记要重置length的值
     * @param file 文件或文件夹的路径
     * @return 目录或文件的大小
     */
    public static long getDirectoryLengthOwn(File file) {
        if (file.isDirectory() == false) {//不是目录直接返回改文件的大小
            return file.length();
        } else {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isDirectory() == true) {
                    getDirectoryLengthOwn(file1);
                } else {
                    length += file1.length();
                }
            }
        }
        return length;
    }

    public static long getDirectoryLength(File dir){
        /*
        用一个变量，累加这个文件夹里面（包含下一级的下一级）的文件的大小。
         */
        long sum = 0;

        if(dir.isFile()){//如果dir是文件，那么直接用length方法表示大小
            sum = dir.length();
        }else if(dir.isDirectory()){
            //列出文件夹的下一级
            File[] files = dir.listFiles();
            for (File sub : files) {//sub是dir的下一级，它可能是一个文件，也可能是一个文件夹
//                sum += sub的大小;
                sum += getDirectoryLength(sub);
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        File file = new File("e:\\learn\\07.Git");
        System.out.println((long) getDirectoryLengthOwn(file));
        File file1 = new File("e:\\learn\\07.Git\\01.笔记.txt");
        System.out.println(getDirectoryLengthOwn(file1));
    }
}

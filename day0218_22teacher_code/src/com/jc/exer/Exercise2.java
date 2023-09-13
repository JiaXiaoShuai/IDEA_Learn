package com.jc.exer;

import java.io.File;

public class Exercise2 {
    /**
     * 删除文件夹下的非空目录
     * @param file 文件夹
     */
    public static void forceDeleteDirectory(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                forceDeleteDirectory(file1);
            }
        }else if(file.isFile()){
            file.delete();
        }else {
            System.out.println("没有该文件或文件夹");
        }
    }

    public static void main(String[] args) {
        File file = new File("e:\\日常工作");
        forceDeleteDirectory(file);
    }
}

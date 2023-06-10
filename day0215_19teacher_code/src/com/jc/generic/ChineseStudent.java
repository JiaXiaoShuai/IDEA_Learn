package com.jc.generic;

//ChineseStudent 不在是泛型类了
public class ChineseStudent extends Student<String,String>{
    public ChineseStudent(String name, String score) {
        super(name, score);
    }
}

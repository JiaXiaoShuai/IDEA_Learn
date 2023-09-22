package com.jc.bean;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private static String school;
    private int id;
    private String name;

    private static int age = 10;

    private void connectMethod(String name,int id){
        System.out.println(id+name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Map setMethod(String name ,int id){
        Map<Object, Object> map = new HashMap<>();
        map.put(id,name);
        map.put(++id,name);
        map.put(++id,name);
        map.put(++id,name);
        map.put(++id,name);
        return map;
    }

    public static int addMethod(int a,int b){
        return a+b;
    }
}

package com.jc.api;

import java.util.Objects;

public class TestJc {
    public static void main(String[] args) {
        String str1 = "jia";
        String str2 = "jia";
        str2 = "wo";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1,str2));
        Student stu = new Student("jia");
        System.out.println("------------------------");
        System.out.println(str1 == stu.getName());
        System.out.println(str1.equals(stu.getName()));
        System.out.println(str1.equals(stu));
        System.out.println(Objects.equals(str1,stu.getName()));
    }
}

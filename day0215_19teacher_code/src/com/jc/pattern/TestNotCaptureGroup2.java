package com.jc.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNotCaptureGroup2 {
    public static void main(String[] args) {
        String str = "12332aa438aaf";

        Pattern p1 = Pattern.compile("[0-9a-z]{2}(?=aa)");
        //匹配两位字符（数字，或字母），且后面有两个a
        Matcher m1 = p1.matcher(str);
        while (m1.find()) {
            System.out.println(m1.group(0));
        }

        System.out.println("---------------------");
    }
}

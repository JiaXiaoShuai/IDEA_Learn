package com.jc.review;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TestReview {
    @Test
    public void test01(){
        String str = "2022-02-14 08:51";//json,web传给服务器端一个字符串，这个字符串是代表一个日期时间值
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            Date d = sf.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        String s = "iwioaina";
        String s1 = new String("woaini");

        System.out.println(s==s1);

        System.out.println(s.indexOf('i'));
        System.out.println(s.lastIndexOf("i"));
        System.out.println(s.substring(3));
        System.out.println(s1.substring(2));
        System.out.println(s);
        System.out.println(s1);
    }

    @Test
    public void test03(){
        String s = "iwioaina";
        char a = 's';
        System.out.println(s);
        System.out.println(a);
        System.out.println(s.charAt(1));
        char[] ar = s.toCharArray();
        System.out.println(Arrays.toString(ar));
    }

    @Test
    public void test04(){
        char[] arr = {'h','e','l','l','o'};
        System.out.println(new String(arr));
        System.out.println(new String(arr,1,2));
        String a1 = String.copyValueOf(arr);
        String a2 = new String(arr);
        System.out.println(a1 == a2);//false

        a1 = String.copyValueOf(arr,3,1);
        System.out.println(a1);

        a1 = String.valueOf(arr);
    }
}

package com.jc.pattern;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNotCaptureGroup1 {
    @Test
    public void test01() {
        String str = "12332aa434aaf";
        Pattern p1 = Pattern.compile("[0-9a-z]{2}(?:aa)");
        //匹配两位字符（数字，字母），且后面有两个a
        Matcher matcher = p1.matcher(str);
        /*while(matcher.find()){
            System.out.println(matcher.group(0));
        }*/

        matcher.find();
        System.out.println(matcher.group(0));
        matcher.find();
        System.out.println(matcher.group(0));//这四句等价于上面的while（）循环
        /*matcher.find();
        System.out.println(matcher.group(0));*/   //IllegalStateException: No match found

        System.out.println("----------------------");

    }

    @Test
    public void test02() {
        String str = "12332aa434aaf";
        Pattern p2 = Pattern.compile("[0-9a-z]{2}(?>aa)");
        //匹配两位字符（数字，或字母），且后面有两个a
        Matcher m2 = p2.matcher(str);
        while (m2.find()) {
            System.out.println(m2.group(0));
        }
    }

    @Test
    public void test03() {
        String str = "12332aa438aaf";

        Pattern p1 = Pattern.compile("[0-9a-z]{2}(?=aa)");
        //匹配两位字符（数字，或字母），且后面有两个a
        Matcher m1 = p1.matcher(str);
        while (m1.find()) {
            System.out.println(m1.group(0));
        }

        System.out.println("---------------------");
        Pattern p2 = Pattern.compile("(?<=aa)[0-9a-z]{2}");
        //匹配两个字符（数字，或字母），且前面有两个a
        Matcher m2 = p2.matcher(str);
        while (m2.find()) {
            System.out.println(m2.group(0));
        }
    }

    @Test
    public void test04(){
        String str = "aaaaaaaaaa";
        Pattern p = Pattern.compile("[0-9a-z]{2}(?=aa)");
        //找出两个字符，它后面紧跟两个"aa"的字符
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group(0));
        }
    }


    @Test
    public void test05(){
        String str = "12332aa438aaf";

        Pattern p1 = Pattern.compile("[0-9a-z]{2}(?!aa)");
        //匹配两位字符（数字，或字母），且后面没有两个a
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            System.out.println(m1.group(0));
        }

        System.out.println("---------------------");

        Pattern p2 = Pattern.compile("(?<!aa)[0-9a-z]{2}");
        //匹配两个字符（数字，或字母），且前面没有两个a
        Matcher m2 = p2.matcher(str);
        while(m2.find()){
            System.out.println(m2.group(0));
        }
    }

    @Test
    public void test06(){
        Pattern p = Pattern.compile("(\\d+)(?:\\.?)(?:\\d*)([￥$])");
        String[] arr = {"8895￥","8899.56￥","6688$","8965"};
        for (String str : arr) {
            Matcher m = p.matcher(str);
            if(m.matches()){
                System.out.println("货币金额: " + m.group(0));
                System.out.println("货币金额: " + m.group(1));
                System.out.println("货币种类: " + m.group(2));
                /*System.out.println("44货币种类: " + m.group(3));*/
                //非捕获组（?:），它可以理解为只匹配而不捕获。所以无论是否匹配(?:\\.?)(?:\\d*)，都不捕获，即无论是否有小数，这里都只有group(1)和group(2)
                //捕获组，可以理解为匹配且捕获。捕获整数部分金额值，和金额单位值。
            }
        }
    }

    @Test
    public void test07(){
        String password = "Clyya1";

        //密码要求：必须有大写字母，小写字母，数字组成，6位
        System.out.println(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{6}$"));
        /*
        （1）密码的长度为6，且只能有[A-Za-z0-9]组成。
        （2）另外，三个非捕获组都能匹配到自己的值。
        (?=.*[A-Z])：匹配值  C
        (?=.*[a-z])：匹配值  Clyya
        (?=.*[0-9])：匹配值  Clyya1
        三个非捕获组都有值。
         */
    }
}


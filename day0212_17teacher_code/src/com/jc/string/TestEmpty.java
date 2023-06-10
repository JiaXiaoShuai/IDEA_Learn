package com.jc.string;

import org.junit.Test;

/*
8、什么是空字符串？
首先有字符串对象，其次字符串的长度为0，即没有任何字符。

如何判断变量是否是空字符串？
 */
public class TestEmpty {

    public void judge(String s){
        //第一种
        if(s == ""){ //没有考虑到 new String("")等情况，太过严格
            System.out.println("s是空字符串");
        }
        //第二种
  /*      if(s.equals("")){//如果s传入的是null，就会有空指针异常的风险
            System.out.println("s是空字符串");
        }*/
        if(s!= null && s.equals("")){
            System.out.println("s是空字符串");
        }
        //第三种
        if("".equals(s)){//OK
            System.out.println("s是空字符串");
        }
        //第四种
 /*       if(s.isEmpty()){//如果s传入的是null，就会有空指针异常的风险
            System.out.println("s是空字符串");
        }*/
        if(s!= null && s.isEmpty()){
            System.out.println("s是空字符串");
        }
        //第五种
    /*    if(s.length() == 0){//如果s传入的是null，就会有空指针异常的风险
            System.out.println("s是空字符串");
        }*/
        if(s!= null && s.length()==0){
            System.out.println("s是空字符串");
        }
    }

    @Test
    public void test02(){
    }
    @Test
    public void test01(){
        String s1; //s1是空字符串吗？不是，未初始化
                    //s1变量无法调用方法，无法显示值
//        System.out.println(s1);
//        System.out.println(s1.equals(""));
        String s2 = null; //s2是空字符串吗？不是，没有字符串对象，是NULL
        //如果通过s2对象调用方法是会发生NullPointerException
//        System.out.println(s2);
//        System.out.println(s2.charAt(0));
        String s3 = "";
        String s4 = new String("");
        String s5 = new String();
        char[] arr = new char[0];//长度为0的字符数组
        String s6 = new String(arr);


        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}

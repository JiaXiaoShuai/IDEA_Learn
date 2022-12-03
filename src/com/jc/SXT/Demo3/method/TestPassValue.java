package com.jc.SXT.Demo3.method;
/*
引用类型String传递是会增加一个地址，导致原来的值不变

其余引用类型改变的
 */
public class TestPassValue {
    public static void main(String[] args) {
        String str1 = "张三";
        System.out.println(str1);
        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
        TestPassValue tes = new TestPassValue();
        tes.change(str1);
        System.out.println(str1);
        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
        System.out.println();

        TestMy testMy = new TestMy();

        testMy.num = 1;
        System.out.println(testMy.num);
        System.out.println(testMy.toString());
        System.out.println(testMy.hashCode());

        change(testMy);
        System.out.println(testMy.num);
        System.out.println(testMy.toString());
        System.out.println(testMy.hashCode());

    }

    void change(String a){
        a = "贾小帅";
        System.out.println(Integer.toHexString(System.identityHashCode(a)));
    }

    static void change(TestMy a){
        System.out.println(a.toString());
        System.out.println(a.hashCode());
        /*a = new TestMy();*/ //如果重新new的话，就导致1不会变成10
        a.num = 10;
        System.out.println(a.toString());
        System.out.println(a.hashCode());
    }
}

package com.jc.api;

/*
1.不管是为成员变量（静态也是如此）的字符串还是局部变量的字符串，内容相同地址就相同，内容不同地址不同
2.静态代码块，最先执行，且只执行一次
3。静态变量可用做类加载的计数器，

 */
public class Q {
    public static void main(String[] args) {
        E e = new E();
        W w = new W();
        e.name = "jia";
        w.name = "jia";
        System.out.println(e.name);
        System.out.println(w.name);
        System.out.println(e.name == w.name);

        System.out.println(e.name.hashCode());
        System.out.println(w.name.hashCode());
        w.name = "ji";
        System.out.println(e.name);
        System.out.println(w.name);
        System.out.println(e.name == w.name);

        System.out.println(e.name.hashCode());
        System.out.println(w.name.hashCode());


        final String A = "jiac";
        final String B = "jiaco";
        System.out.println(A);
        System.out.println(B);
        System.out.println(A.hashCode());
        System.out.println(B.hashCode());

        String a = "jiacong";
        String b = "jiacong";

        W w1 = new W();
        W w2 = new W();
        W w3 = new W();

    }
}

class W {
    String name;
    static int a=0;
    {
        System.out.println("W类加载了"+(a++));
    }

    static {
        System.out.println("W类静态代码块加载了");
    }
}

class E {
    String name;
}
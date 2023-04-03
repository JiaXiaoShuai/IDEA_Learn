package com.jc.review.exer5;

public class Test05 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();

        MyClass my = new MySub();//my有多态引用了，而且method是虚方法
        /*
        如何确定它执行的是哪个方法呢？
        （1）编译时，去my的编译时类型MyClass中找合适的方法
        （2）运行时，去my的运行时类型MySub中看是否有对刚刚找到的方法进行了“重写”
         */
        my.method(f);//daughter
        /*
        （1）编译时，去my的编译时类型MyClass中找合适的方法
        实参f的编译时类型是Father，找最匹配的public void method(Father f)
        （2）运行时，去my的运行时类型MySub中看是否有对刚刚找到的方法进行了“重写”
        有重写
        一定是执行重写后的代码
         */
        my.method(s);//son
        /*
        （1）编译时，去my的编译时类型MyClass中找合适的方法
        实参s的编译时类型是Son，找最匹配的public void method(Son s)
        （2）运行时，去my的运行时类型MySub中看是否有对刚刚找到的方法进行了“重写”
        没有重写
        仍然执行刚刚在MyClass中找到的合适的方法
         */
        my.method(d);//father
        /*
        （1）编译时，去my的编译时类型MyClass中找合适的方法
        实参s的编译时类型是Daughter，找最匹配的，没有，找兼容的，public void method(Father f)
        （2）运行时，去my的运行时类型MySub中看是否有对刚刚找到的方法进行了“重写”
        有重写
        执行的是重写的方法体 daughter
         */
    }
}
class MyClass{
    public void method(Father f) {
        System.out.println("father");
    }
    public void method(Son s) {
        System.out.println("son");
    }
}
class MySub extends MyClass{//有变化
    public void method(Father d) {//是重写
        System.out.println("daughter");
    }
}
class Father{

}
class Son extends Father{

}
class Daughter extends Father{

}
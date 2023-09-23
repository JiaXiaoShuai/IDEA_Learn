package com.jc.annotation;
/*
"尚硅谷“就是 MyAnnotation注解中 String value(); 抽象方法的返回值
    等价于

    @Override
    public String value(){
        return "尚硅谷";
    }
 */
@MyAnnotation(value = "s")
@YourAnnotaion
public class MyClass {
}

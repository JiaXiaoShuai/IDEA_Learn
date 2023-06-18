package com.jc.review;

import java.util.ArrayList;
import java.util.Collection;

public class DemoTest {
    public static void main(String[] args) {
        Demo<?> demo = new Demo<>();
//        demo.method("hello");
//        demo.method(1);

        Collection<?> coll = new ArrayList<>();
//        coll.add("hello");
//        coll.add(1);


        Demo<? extends Object> demo2 = new Demo<>();
//        demo2.method("hello");

        Demo<? super Number> demo3 = new Demo<Object>();
        demo3.method(1);
        //？有底线，底线是Number
        //有底线之后，编译就可以检测，只要是Number或Number的子类对象就可以作为这个方法的实参
//        demo3.method(new Object());//错误，因为我们只知道底线是Number，具体是Number还是Object不确定

//        demo3.method(new Object());
        demo3.method(new Integer(1));


        Demo<Number> demo4 = new Demo();
        demo4.method(new Integer(1));
        demo4.method(new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        });


//        Demo<T> demo05 = new Demo<T>();
//        demo05.method(new Object());//错误
//        demo05.method(new Integer(1));//错误
    }


}

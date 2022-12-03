package innerclass;
/*
1.不能循环继承外部类继承另一个类，该类继承内部类
2.内部类可以继承外部类，但是外部类不能继承内部类
 */
public class InnerClass {

     static class A {

    }

    class B {
       class C{
           int i;
       }
    }
    interface F{
         void test();
    }
}

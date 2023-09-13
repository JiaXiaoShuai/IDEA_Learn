package com.jc.linked;

import org.junit.Test;

public class Test01 {
    private A aFirst;
    private A aLast;

    /*@Override
    public String toString() {
        return "Test01{" +
                "aFirst=" + aFirst +
                ", aLast=" + aLast +
                '}';
    }
*/
    public A method(){
        return aFirst;
    }


    class A{
        A s;
        int i;
        double b;

        public A(A s, int i, double b) {
            this.s = s;
            this.i = i;
            this.b = b;
        }


    }
    @Test
    public void test01(){
        Test01 t = new Test01();
        Test01 t1 = new Test01();
        Test01 t2 = new Test01();
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("================================");
        t = t1;
        t1 = t2;
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
    }
}

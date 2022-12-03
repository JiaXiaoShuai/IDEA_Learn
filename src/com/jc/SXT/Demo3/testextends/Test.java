package com.jc.SXT.Demo3.testextends;

public class Test extends TestExtends{
    @Override
    public int getAge() {
        return super.getAge();
    }
    /*@Override
    public String toString() {
        return super.toString();
    }*/

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Test te = new Test();
        te.setAge(15);
        System.out.println(te.getAge());
        te.setName("jia");
        System.out.println(te.toString());
    }


}

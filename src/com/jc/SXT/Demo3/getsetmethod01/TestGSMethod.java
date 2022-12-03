package com.jc.SXT.Demo3.getsetmethod01;

import com.jc.SXT.Demo3.getsetmethod.GetSetMethod;

public class TestGSMethod {
    public static void main(String[] args) {
        GetSetMethod gs = new GetSetMethod();
        gs.setName("jia");
        System.out.println(gs.getName());

        gs.setAge(18);
        System.out.println(gs.getAge());

        gs.setA(true);
        System.out.println(gs.isA());
    }
}

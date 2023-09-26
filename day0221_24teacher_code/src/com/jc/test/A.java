package com.jc.test;

import org.junit.Test;

import java.util.function.Function;

public class A {
    @Test
    public void test01(){
        /*System.out.println(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        }.apply("HA"));*/


        Function<String, String> stringStringFunction = s -> s.toLowerCase();
        System.out.println(stringStringFunction.apply("JAIOSJFOASJ"));

    }

    public static void main(String[] args) {
        Function<String, String> stringStringFunction = s -> s.toLowerCase();
        System.out.println(stringStringFunction.apply("JAIOSJFOASJ"));
    }
}

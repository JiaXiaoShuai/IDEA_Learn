package com.jc.test;

import org.junit.Test;

import java.util.Scanner;
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

    @Test
    public void test02(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }

    public static void main(String[] args) {
        Function<String, String> stringStringFunction = s -> s.toLowerCase();
        System.out.println(stringStringFunction.apply("JAIOSJFOASJ"));
    }
}

package com.jc.review;

import org.junit.Test;

public class TestOOM {
    public static void main(String[] args) {
        int[] arr = new int[Integer.MAX_VALUE];
    }

    @Test
    public void test1(){
        test1();
    }
}

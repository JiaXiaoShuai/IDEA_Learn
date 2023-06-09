package com.test_generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class TestGenericClass {
    @Test
    public void test01(){
        Collection<Integer> nums = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            nums.add(random.nextInt(100));
        }

        for (Integer i:
             nums) {
            System.out.println(i);
        }
    }
}

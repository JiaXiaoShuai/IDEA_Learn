package com.test_generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

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

        nums.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                 boolean index = (integer%2==0);
                return index;
            }
        });

        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println("剩下：" + num);
        }


    }
}

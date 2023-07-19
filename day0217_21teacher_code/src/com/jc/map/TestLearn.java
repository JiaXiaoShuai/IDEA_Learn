package com.jc.map;

import java.util.HashMap;

public class TestLearn {
    public static void main(String[] args) {
        /*HashMap<MyKey,Integer> map = new HashMap<>();

        for (int i = 1; i <12; i++) {
            map.put(new MyKey(i),i);
        }

        System.out.println();
        map.remove(new MyKey(1),1);

        System.out.println(map);*/

        System.out.println("================================");
        HashMap<MyKey,Integer> map1 = new HashMap<>();
        MyKey myKey = new MyKey(2);

        map1.put(myKey,2);

        MyKey myKey1 = new MyKey(3);
        /*myKey = myKey1;*/
        Integer integer = map1.get(myKey);
        System.out.println(integer);
        System.out.println(myKey1.hashCode());
        System.out.println(myKey.hashCode());

    }


}

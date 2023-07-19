package com.jc.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestEntry {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=1; i<=10; i++){
            map.put(i, "value");
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
    }
}

package com.jc.map;

import java.util.HashMap;

public class TestNull {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(null,"value");
    }
}

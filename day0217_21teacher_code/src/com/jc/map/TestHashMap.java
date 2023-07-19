package com.jc.map;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<MyKey, Integer> map = new HashMap<>();
        //关心key
        for(int i=1; i<=20; i++){
            map.put(new MyKey(i), i);//添加到9时扩容为32，添加到10时扩容为64，添加到11时变为树
        }

        //一直删除
 /*       for(int i=1; i<=20; i++){
            map.remove(new MyKey(i));//删到剩下5个时，变回链表
        }*/

 /*       for(int i=20; i>=1; i--){
            map.remove(new MyKey(i));//删除剩下2个时，变为链表
        }*/

        for(int i=20; i>=6; i--){
            map.remove(new MyKey(i));
        }
        //删除后只剩下5个树结点

        for(int i=21; i<=100; i++){
            map.put(new MyKey(i), i);
        }

    }
}

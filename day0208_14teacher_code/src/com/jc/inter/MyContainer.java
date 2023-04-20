package com.jc.inter;

import java.util.Iterator;

//MyContainer是一个容器，MyContainer的对象作用用来装对象
//实现接口的抽象方法的快捷键 Ctrl + I
public class MyContainer implements Iterable{
    private Object[] all = new Object[5];
    private int total;//同时充当了下标和记录实际元素个数的作用

    /**
     * 这个方法的作用，是添加元素到all数组中
     * @param obj
     */
    public void add(Object obj){
        if(total>=all.length){
            System.out.println("数组已满");
            return;
        }
        all[total++] = obj;
    }

    public Object[] getAllElements(){
        Object[] newArr = new Object[total];
        //foreach的快捷键是iter
        //普通for循环快捷键itar
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = all[i];
        }
        return newArr;
    }

    /*
    这个方法本身的作用是用来返回一个当前容器的迭代器对象
    比喻：当前容器比喻成公交车、高铁
    迭代器比喻成公交车的售票员，高铁的乘务员
     */
    @Override
    public Iterator iterator() {
//        return null;
        return new Itr();
    }

    //内部类
    private class Itr implements Iterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}

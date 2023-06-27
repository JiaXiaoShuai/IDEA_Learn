package com.jc.list;

public class MyArrayList<E> {

//    private E[] all1 = new E[5];
    private Object[] all = new Object[5];
    private int total;

    /**
     * 添加元素
     * @param e E：添加一个元素到当前集合
     */
    public void add(E e){
        all[total++] = e;
    }

    /**
     * 获取元素的个数
     * @return int
     */
    public int size(){
        return total;
    }
}
/*
泛型擦除是指Java泛型中的泛型参数信息只在编译时有效，编译之后就会被擦除，也就是在运行时是不知道一个泛型的泛型参数是什么的，
Gen<Integer>对象和Gen<String>对象在虚拟机看来其实都是Gen对象。new SomeClass[]这样的一条语句表明的是创建了一个SomeClass类型的数组，
所以如果允许你写new Gen<Integer>[10]的话，就表明创建了一个Gen<Integer>类型的数组，但这是和实际情况相悖的，
因为实际上在Java虚拟机中只能创建出一个Gen类型的数组。
 */
class A{
    MyArrayList<String> mq = new MyArrayList<>();
//    MyArrayList<String>[] ma = new MyArrayList<String>[19];
}
package com.jc.list;

import java.util.Arrays;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class MyArrayList<E> /*extends TestList*/{



//    private E[] all1 = new E[5];
    private Object[] all = new Object[5];
    private int total;

    /*public MyArrayList<E>() {

    }*/

    /**
     * 添加元素
     * @param e E：添加一个元素到当前集合
     */
    public void add(E e){
        //考虑数组是否已满，需要扩容
        grow();
        all[total++] = e;
        log.println();
    }

    /**
     * 检查数组是否已满
     */
    private void grow() {
        //考虑数组是否已满，需要扩容
        if(total >= all.length){
//            all = Arrays.copyOf(all,all.length+1);
//            all = Arrays.copyOf(all,all.length+2);
            all = Arrays.copyOf(all,all.length+(all.length>>1));//扩容1.5倍
        }
    }

    /**
     * 添加一个元素到指定位置中
     * @param index 选择添加元素要插入的位置
     * @param e 添加一个元素到当前集合中
     */
    public void add(int index,E e){
        //检查下标
        if(index<0||index>total){
            throw new IndexOutOfBoundsException(index+"数组越界了");
        }
        grow();
        //把index位置的元素向后移动
        System.arraycopy(all,index,all,index+1,total-index);

        all[index] = e;
        total++;
    }

    /**
     * 返回index位置的元素
     * @param index int 下标
     * @return E 元素
     */
    public E get(int index){
        //判断index的合法性
        if(index < 0||index >= total){
            throw new IndexOutOfBoundsException(index+"越界");
        }
        return (E)all[index];
    }


    public int indexOf(E e){
        int index = 0;
        //遍历取到
        for (Object o : all) {

            e = (E)o;
            if(o.equals(e)){
                break;
            }
            index++;
        }
        return index;
    }



    /**
     * 获取元素的个数
     * @return int
     */
    public int size(){
        return total;
    }

    @Override
    public String toString() {
        return Arrays.toString(all);
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
    /*
    原因在于，Java中的泛型是通过类型擦除实现的，在运行时泛型信息会被擦除，所以无法创建具体类型的泛型数组。这是为了保持与之前的版本向后兼容性。
如果要创建存储泛型对象的数组，可以使用以下两种方法之一：
1.使用原始类型数组，然后进行强制类型转换（不推荐）：
MyArrayList<String>[] ma = (MyArrayList<String>[]) new MyArrayList[19];
2.使用集合类作为数组元素的替代方案，例如ArrayList：
ArrayList<MyArrayList<String>> list = new ArrayList(19);
请注意，在使用原始类型数组进行强制类型转换时，由于编译器无法检查类型安全性，可能会导致运行时出现异常。因此，第二种方法更为常用和安全。
     */
}
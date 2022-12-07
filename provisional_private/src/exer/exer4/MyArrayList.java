package exer.exer4;

import java.util.Iterator;

public class MyArrayList implements Iterable{
    private Object[] all = new Object[10];
    private int total = 0;

    /**
     * 用于添加一个元素到当前容器中，如果数组all已满，不添加了
     * @param element 要添加的元素
     */
    public void add(Object element){
        if(total >= all.length){
            System.out.println("all数组已满");
        }
        all[total++] = element;
    }

    /**
     * 如果index<0或index>=total就打印“没有这个元素”并返回，否则删除index位置的元素
     * @param index 要操作的元素所属数组的索引
     */
    public void remove(int index){
        if(index < 0|| index > total){
            System.out.println("没有这个元素");
            return;
        }
        all[index] = null;
    }

    /**
     * 如果index<0或index>=total就打印“没有这个元素”并返回，否则删除index位置的元素,并把index之后的元素向前移一位
     * @param index 索引
     */
    public void removePlus(int index){
        if(index < 0|| index > total){
            System.out.println("没有这个元素");
            return;
        }
        for (int i = 1; i < total-index; i++) {
            all[index] = all[index+i];
        }
        all[total] = null;
    }

    /**
     * 如果index<0或index>=total就打印“没有这个元素”并返回，否则就替换index位置的元素为value
     * @param index 索引
     * @param value 元素
     */
    public void set(int index,Object value){
        if(index < 0|| index > total){
            System.out.println("没有这个元素");
            return;
        }
        all[index] = value;
    }

    /**
     * 如果index<0或index>=total就打印“没有这个元素”并返回null，否则返回index位置的元素
     * @param index 索引
     * @return 对应数组索引的元素
     */
    public Object get(int index){
        if(index < 0|| index > total){
            System.out.println("没有这个元素");
            return null;
        }
        return all[index];
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }
    private class Itr implements Iterator{
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != total;
        }

        @Override
        public Object next() {
            return all[cursor++];
        }
    }
}

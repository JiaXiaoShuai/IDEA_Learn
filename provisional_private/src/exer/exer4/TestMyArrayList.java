package exer.exer4;

import java.util.Iterator;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("atguigu");
        list.add("java");
        list.add("bigdata");
        list.add("h5");
        list.add("ui");
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("---------------------");
        list.set(1,"javaee");
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("---------------------");
        list.remove(1);
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("---------------------");
        list.removePlus(4);
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("---------------------");
        System.out.println(list.get(1));


        System.out.println("---------------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

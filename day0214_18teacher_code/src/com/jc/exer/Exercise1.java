package com.jc.exer;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;



public class Exercise1 {
    public static void main(String[] args) {
        //（1）创建一个Collection集合primeNumbers（暂时new ArrayList())
        Collection primeNumbers = new ArrayList();

        //（2）添加100以内的质数到primeNumbers集合中
        //        质数是大于1的自然数，并且只能被1和它本身整除。
        //1不是质数

        for (int i = 2; i <= 100 ; i++) {
            boolean flag = true;
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                primeNumbers.add(i);
            }
        }
        //（3）查看100以内的质数个数有几个
        System.out.println(primeNumbers.size());

        //（4）使用foreach遍历primeNumbers集合中的所有质数。
        for (Object o: primeNumbers) {
            System.out.println(o);
        }

        //（5）使用Iterator迭代器删除个位数是3的质数。
        //Iterator迭代器的快捷键是itit
        Iterator iterator = primeNumbers.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Integer i = (Integer) next;
            if(i%10==3){
                iterator.remove();
                continue;
            }
            System.out.print(next+"\t");

        }
       /* System.out.println(primeNumbers);*/

        //（6）判断primeNumbers集合中是否有11，如果有请使用Collection集合的remove方法删除11
        /*if(primeNumbers.contains(11)){
            primeNumbers.remove(11);
        }*/
        primeNumbers.remove(11);//存在就删除，不存在就什么也不干

        //（7）使用Collection集合的removeIf方法删除个位数是7的质数。

        primeNumbers.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return (Integer)o%10==7;
            }
        });
        System.out.println(primeNumbers);
        System.out.println();
        //（8）再次使用Iterator遍历primeNumbers集合中剩下的质数。
        iterator = primeNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"\t");
        }

        //（9）创建另一个Collection集合randNumbers
        Collection randNumbers = new ArrayList();
        Random random = new Random();
        //（10）添加10个100以内的随机整数到randNumbers集合中
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);//产生[0,100)的随机整数
            randNumbers.add(num);
        }
        System.out.println();
        //（11）使用foreach遍历randNumbers集合中的随机数。
        for (Object randNumber : randNumbers) {
            System.out.print(randNumber+"\t");
        }


        //（12）求它们的交集
        primeNumbers.retainAll(randNumbers);
        System.out.println(primeNumbers);
    }


}

package com.jc.coll;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * 集合与迭代器
 * 1.什么是集合？
 * 集合是一种容器，或也可以叫做数据结构
 * 今天先讲它容器的角色
 * <p>
 * 容器：
 * 生活中的容器：装东西
 * Java中的容器：装对象
 * <p>
 * 数组：也是容器
 * <p>
 * 2、数组和今天要讲的集合有什么区别和联系？
 * 联系：
 * 首先然们都是容器。
 * 其次，很多集合底层也是数组，即很多集合都是对数组的再次封装
 * <p>
 * 区别：
 * 数组：
 * （1）可以装基本数据类型的数据，也可以装对象
 * （2）数组的大小是固定的，除非你动手进行扩容、复制，即原有的数组是不能更改大小的，只能通过新数组来实现扩容等操作
 * （3）数组的元素是连续存储的，在内存中开辟一整块连续的存储空间，那么他的访问速度是很高，可以根据数组名【下标】直接定位到摸个元素
 * （4）数组结构比较单一
 * 集合：
 * （1）只能装对象，不能装基本数据的值。当把基本数据类型的值放在集合中时，基本数据类型会自动装箱为对象。
 * （2）集合可以自动扩容
 * （3）集合有连续存储的，也有不是连续存储的，因为底层有的也是数组，有的底层是链表等
 * （4）集合的种类非常多，有ArrayList、HashSet、TreeSet等
 * <p>
 * 3、集合主要分为两大类：
 * Collection：存储一组对象，一个一个对象凑出一组。比喻单身party
 * Map：存储一对一对的键值对（映射关系）。比喻情侣party（key是一个对象，value也是一个普通对象）或家庭party（key是一个对象，value是一个普通的对象）
 * <p>
 * 4、Collection系列的集合
 * （1）Collection接口是Collection系列集合的根接口
 * Collection表示一组对象，这些对象也称为collection的元素
 * 一些collection允许有重复的元素，而另一些则不允许
 * 一些collection是有序的，另一些是无序的
 * JDK不提供此接口的任何直接实现：他提供更具体的子接口（如Set和List、Queue等）
 * Collection接口中所有的方法，Collection系列的集合都有
 * <p>
 * （2）Collection接口的方法
 * A：添加
 * （1）add(Object obj):添加元素对象到当前集合中
 * （2）addAll(Collection other):添加other集合中多有元素对象到当前集合中，即this=this ∪ other
 * B：删除
 * （1）boolean remove（Object obj）：从当前集合中删除第一个找到的与obj对象equals返回true的元素
 * （2）boolean removeAll（Collection coll）：从当前集合中删除所有与coll集合中相同的元素
 * 即this = this - this  n  coll（减去交集）
 * （3）boolean removeOf（Predicate filter）：删除满足给定条件的刺激和的所有元素,切记此方法的集合中的元素必须是相同类型的
 * （4）boolean retainAll（Collection coll）：从当前集合中删除两个集合中不同的元素，使得当前集合进保留与c集合中的元素相同的元素
 * 即当前结合中仅保留两个集合的交集，即this = this  n  coll；
 * （5）clear（）：清空集合
 * C：查询
 * （1）boolean isEmpty（）：判断当前集合是否为空集合
 * （2）boolean contains（Object obj）：判断当前集合中是否存在一个与obj对象equals返回true的元素
 * （3）boolean containsAll（Collection c）：判断c集合中的元素是否在当前集合中都存在。即c集合是否是当前结合的“子集”
 * （4）int size（）：获取当前集合中实际存储元素的个数
 * （5）Object【】 toArray（）：返回包含当前集合中所有元素的数组
 *
 *
 * 在removeIf方法中，传入了一个匿名内部类Predicate作为参数。Predicate是一个函数式接口，它有一个test方法用来对集合中的元素进行测试，如果测试结果为true，则将元素从集合中删除。
 * 在这个例子中，test方法判断Person对象的年龄是否为24，如果是，则返回true，表示需要删除该元素。
 * 需要注意的是，在匿名内部类Predicate中，需要指定泛型类型为Person，否则会出现编译错误。因为在集合中存储的是Person对象，所以需要指定Predicate的泛型类型为Person。
 * 另外，在add方法中添加的是字符串而不是对象时，因为字符串是已知类型的，编译器可以自动推断出类型，所以不需要在匿名内部类Predicate中指定泛型类型。
 */
public class TestCollection {
    @Test
    public void test01() {
        String[] arr = {"1", "2", "3"};
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void Test02() {
        //创建一个容器对象
        /*
        Collection是一个接口，不能直接创建对象，创建实现类的对象。ArrayList是Collection接口实现类之一
        这里左边写Collection的目的是为了大家更加关注Collection接口中的方法
        因为编译时看左边，只能调用左边Collection里面声明的方法，ArrayList增加的方法编译时就看不到了
         */

        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add('a');
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        System.out.println(coll);
//        System.out.println(Arrays.toString(coll));//报错
    }

    @Test
    public void Test03() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add('a');
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        Collection other = new ArrayList();
        other.add("hi");
        other.add("world");
        other.add("h5");
        //希望把other集合中的所有元素都添加到coll集合中
        //coll.add(other);
        //System.out.println(coll);//[hello, world, a, html, mysql, bigdata, [hi, world, h5]]

        coll.addAll(other);
        System.out.println(coll);//[hello, world, a, html, mysql, bigdata, hi, world, h5]

        System.out.println(coll.toArray().length);
        System.out.println(coll.toArray());//打印了数组对象地址
        System.out.println(Arrays.toString(coll.toArray()));//[hello, world, a, html, mysql, bigdata, hi, world, h5]

        System.out.println(coll.size());
    }

    @Test
    public void Test04() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");
        coll.add('a');

        //删除world
        if (coll.remove("world")) {
            System.out.println(coll);
        }
        coll.remove('a');
        System.out.println(coll);

        Collection other = new ArrayList();
        other.add("hello");
        other.add("world");
        other.add("mysql");

        coll.removeAll(other);
        System.out.println(coll);

        /*Collection other1 = new ArrayList();
        other1.add("he");
        other1.add("bigdata");
        coll.removeAll(other1);
        System.out.println(coll);*/

        Collection other1 = new ArrayList();
        other1.add("he");
        other1.add("biata");
        System.out.println(coll.removeAll(other));//false
        System.out.println(coll.size());
    }

    @Test
    public void Test05() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");
        coll.add('a');

        Collection other = new ArrayList();
        other.add("hello");
        other.add("world");
        other.add("mysql");

        coll.retainAll(other);
        System.out.println(coll);
        System.out.println(coll.size());
    }

    @Test
    public void Test06() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        Collection other = new ArrayList();
        other.add("hello");
        other.add("world");
        other.add("mysql");

        /* coll.add('a');*/

        //删除 字符串中包含"o"字母的字符串
//        coll.removeIf(字符串中包含“o”字母);
        /*
        removeIf的形参是Predicate接口，有一个抽象方法 boolean test(Object t);
        这个t就是集合中的元素，如果t满足要删除的条件，就返回true
         */

        coll.addAll(other);
        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return ((String) o).contains("o");
            }
        });
        System.out.println(coll);

    }

    @Test
    public void Test07() {
        Collection coll = new ArrayList();
        Collection other = new ArrayList();
        Father f1 = new Father("a",23);
        Father f2 = new Father("x",23);
        Father f3 = new Father("c",24);
        Son s1 = new Son("a",33);
        Son s2 = new Son("x",23);

        Student s3 = new Student();

        coll.add(f1);
        coll.add(f2);
        coll.add(f3);
//        coll.add(s3);


        other.add(s1);
        other.add(s2);
//        other.add(s3);

        coll.addAll(other);
        System.out.println(coll);

        coll.removeIf(new Predicate<Father>() {
            @Override
            public boolean test(Father father) {
                return father.age == 23;
            }
        });

        System.out.println(coll);
    }

    @Test
    public void Test08(){
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        System.out.println(coll.contains("atguigu"));
        System.out.println(coll.contains("hello"));

        Collection other = new ArrayList();
        other.add("hello");
        other.add("world");
        other.add("mysql");
        other.add("hi");

        System.out.println(coll.containsAll(other));//false
        coll.clear();
        System.out.println(coll.isEmpty());//true
    }

    @Test
    public void test09() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        Object[] objects = coll.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}

class Father {
    String name;
    int age;

    public Father() {

    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Son extends Father {
    public Son() {
    }

    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student {
    @Override
    public String toString() {
        return super.toString();
    }
}

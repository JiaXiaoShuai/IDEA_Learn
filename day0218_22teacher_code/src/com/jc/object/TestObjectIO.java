package com.jc.object;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

/*
IO流：
    字节流，可以读/写  图片、视频、文本等。
    字符流，只能读/写  文本（字符串,char）。

如果要处理Java程序中的各种数据类型的数据，就需要用
DataInputStream：读Java各种基本数据类型的数据+String。
DataOutputStream：写Java各种基本数据类型的数据+String。
ObjectInputStream：读Java任意类型，包括对象
ObjectOutputStream：写Java任意类型，包括对象。

序列化：
    把Java对象直接转为字节序列过程，这个过程称为序列化，要求这个对象的类型必须实现java.io.Serializable接口，否则无法支持序列化。

反序列化：
    把字节序列转为Java对象的过程。


反序列化失败问题：
    当数据已经序列化好之后，对Student类做了修改，导致反序列化的代码运行失败：
    java.io.InvalidClassException（无效的类异常）: com.atguigu.object.Student;
    local（本地） class incompatible（不相容的；矛盾的；）:
    stream（流） classdesc（类描述） serialVersionUID（序列化版本ID） = -3979294235569238736,
    local（本地） class serialVersionUID（序列化版本ID） = 5212389082514962991

    如果在类声明并实现java.io.Serializable接口时，如果没有固定serialVersionUID（序列化版本ID）值，
    那么会在每一次编译类的时候，会产生一个新的serialVersionUID（序列化版本ID）。
    刚才修改了Student类，就会导致类重新编译。

如何解决这个问题？
    在类声明并实现java.io.Serializable接口时，固定 serialVersionUID（序列化版本ID）值。


不参与序列化的字段：
（1)transient修饰的属性字段
（2）static修饰的属性字段


 */
public class TestObjectIO {

    @Test
    public void test04()throws Exception{
        //在stu.dat文件中增加一个对象
        FileInputStream fis = new FileInputStream("stu.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        list.add(new Student("沈彦",22,100));
        System.out.println(list);
        ois.close();
        fis.close();

        FileOutputStream fos = new FileOutputStream("stu.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();
    }

    @Test
    public void test03()throws Exception{
        Student s1 = new Student("李四",24,88);
        Student s2= new Student("王五",24,90);
        Student s3 = new Student("赵六",24,100);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //同时序列化多个对象时，怎么办？
        FileOutputStream fos = new FileOutputStream("stu.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();
    }

    @Test
    public void test02() throws IOException, ClassNotFoundException {
        Student s1 = new Student("李四",24,0);
        Student s2= new Student("王五",24,0);
        Student s3 = new Student("赵六",24,0);
        System.out.println(Student.getTotal());


        FileInputStream fis = new FileInputStream("game.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //读的顺序要与写的顺序一致
        String name = ois.readUTF();
        int age = ois.readInt();
        char gender = ois.readChar();
        int energy = ois.readInt();
        double price = ois.readDouble();
        boolean relive = ois.readBoolean();
        Object object = ois.readObject();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("energy = " + energy);
        System.out.println("price = " + price);
        System.out.println("relive = " + relive);
        System.out.println("object = " + object);

        System.out.println(Student.getTotal());

        ois.close();
        fis.close();

    }

    @Test
    public void test01()throws IOException {
        String name ="巫师";
        int age = 300;
        char gender ='男';
        int energy = 5000;
        double price = 75.5;
        boolean relive = true;

        Student stu = new Student("张三",23,89);

        //输出到文件
        FileOutputStream fos = new FileOutputStream("game.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeUTF(name);
        oos.writeInt(age);
        oos.writeChar(gender);
        oos.writeInt(energy);
        oos.writeDouble(price);
        oos.writeBoolean(relive);
        oos.writeObject(stu);
        //java.io.NotSerializableException: com.atguigu.object.Student

        System.out.println(Student.getTotal());

        oos.close();
        fos.close();
    }
}
